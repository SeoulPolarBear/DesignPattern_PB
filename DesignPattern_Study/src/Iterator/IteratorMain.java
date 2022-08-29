package Iterator;
//iterator ������ �ٽ��� �迭, linkedlist, tree��� ���� �پ��� ������ �����̳�
//��, aggregator�� ������ �͵��� data�� ������ �� �ִ� ǥ��ȭ�� ���� API�� ���� �� �� �ִٴ� ���� �ִ�.
//�̷��� �Ǹ� �����ڴ� �پ��� data ������ �ľ����� �ʾƵ� ǥ��ȭ�� �Ѱ��� API�����ε� �پ��� ������
//aggregator�� data�� ������ �� �ְ� �ȴ�.

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
