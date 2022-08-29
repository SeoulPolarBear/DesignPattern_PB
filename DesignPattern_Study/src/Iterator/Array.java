package Iterator;



//���θ� �������� �ʰ� ������ ���� � ��ü�� ���Ҹ� 
//���������� ������ �� �ִ� ������ �������̽� ����
public class Array implements Aggregator{
	private Item[] items;

	public Array(Item[] items) {
		this.items = items;
	}
	
	public Item getItem(int index) {
		return items[index];
	}
	public int getCount() {
		return items.length;
	}
	@Override
	public Iterator iterator() {
	//������ �θ� Ŭ������ ���ؼ� �ڽ� Ŭ������ ��ü�� ���� �Ѵ� ���� ���Ե� ���̴�.
	//��Ȯ�� ���Ǵ� interface�� �߻� Ŭ������ �޼ҵ带 ������ �� ��ü������ ���Ǹ� ����� �ϴµ�
	//�װ� �޾ƿ��� ���� Ŭ�������� �� �ٸ� ������� ���� �� �����Ƿ� (��,��,����� ��� �Ҹ� : ��, ±, �߿�)
	//�̷��� �������̶�� �ϴµ� �̿� ���ɽ��õ� ������ �ȴ�. ������ �׿� ���� �����̴�.
		
		// TODO Auto-generated method stub
		return new ArrayIterator(this);
	}
	
	
}
