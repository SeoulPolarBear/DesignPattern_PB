package Iterator;
//iterator 패턴의 핵심은 배열, linkedlist, tree등과 같은 다양한 형태의 컨테이너
//즉, aggregator의 형태의 것들을 data를 참조할 수 있는 표준화된 공통 API를 제공 할 수 있다는 점에 있다.
//이렇게 되면 개발자는 다양한 data 구조를 파악하지 않아도 표준화된 한개의 API만으로도 다양한 형태의
//aggregator의 data를 참조할 수 있게 된다.

public class IteratorMain {
	public static void main(String[] args) {
		Item[] items = {
				new Item("CPU", 1000),
				new Item("keyboard", 2000),
				new Item("Mouse", 3000),
				new Item("HDD", 50)
		};
		
		Array array = new Array(items);
		Iterator iterator = array.iterator();
		
		while (iterator.next()) {
			Item item =(Item)iterator.current();
			System.out.println(item);
		}
	}
}
