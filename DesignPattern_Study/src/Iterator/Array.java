package Iterator;



//내부를 노출하지 않고 접근이 잦은 어떤 객체의 원소를 
//순차적으로 접근할 수 있는 동일한 인터페이스 제공
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
	//다형성 부모 클래스를 통해서 자식 클래스의 객체를 선언 한는 것은 포함될 뿐이다.
	//정확한 정의는 interface나 추상 클래스의 메소드를 가져올 때 구체적으로 정의를 해줘야 하는데
	//그걸 받아오는 하위 클래스들은 다 다른 기능으로 만들 수 있으므로 (개,새,고양이 우는 소리 : 멍, 짹, 야옹)
	//이런걸 다형성이라고 하는데 이에 업케스팅도 포함이 된다. 다음이 그와 같은 예시이다.
		
		// TODO Auto-generated method stub
		return new ArrayIterator(this);
	}
	
	
}
