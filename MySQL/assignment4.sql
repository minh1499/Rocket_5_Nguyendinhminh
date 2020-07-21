/*1, Tính tổng giá trị của các order đã xuất kho (‘shipped’) trong tháng Tám năm 2004*/
SELECT 
    SUM(orderdetails.quantityOrdered * orderdetails.priceEach) AS tongtien
FROM
    orders
        JOIN
    orderdetails ON orders.orderNumber = orderdetails.orderNumber
WHERE
    YEAR(orders.shippedDate) = '2004'
        AND MONTH(orders.shippedDate) = '08';

/* Tính lợi nhuận (profit) thu được từ mỗi khách hàng dựa trên các orders mà họ thực hiện. Liệt kê theo tên khách hàng */

use classicmodels;
SELECT 
    customers.customerName,
    SUM((products.MSRP - products.buyPrice) * orderdetails.quantityOrdered)
FROM
    customers
        JOIN
    orders ON customers.customerNumber = orders.customerNumber
        JOIN
    orderdetails ON orders.orderNumber = orderdetails.orderNumber
        JOIN
    products ON orderdetails.productCode = products.productCode
GROUP BY (customers.customerNumber)
ORDER BY (customerName);

/* 3, Tính doanh thu (revenue) mà mỗi sản phẩm mang lại. Liệt kê theo tên sản phẩm. */

SELECT 
    productName, (MSRP - buyPrice) * quantityInStock
FROM
    products
ORDER BY productName;