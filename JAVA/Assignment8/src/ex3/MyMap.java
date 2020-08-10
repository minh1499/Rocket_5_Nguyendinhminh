package ex3;

import java.util.ArrayList;
import java.util.List;

public class MyMap<K,V> {
	private List<K> Keys;
	private List<V> Values;
	public MyMap() {
		Keys= new ArrayList();
		Values= new ArrayList();
	}
	
	public void push (K key,V value) {
		Keys.add(key);
		Values.add(value);
	}
	
	public V getValue(K key) {
		int a= Keys.indexOf(key);
		return Values.get(a);
	}
	
	public List<K> getKey(V value){
		List<K> key2= new ArrayList<K>();
		for(int i=0;i<Values.size();i++) {
			if(Values.get(i)==value){
				key2.add(Keys.get(i));
			}
			
		}
		return key2;
	}
	
	
}
