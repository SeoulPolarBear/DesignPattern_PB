package Iterator;

public class ArrayIterator implements Iterator{
	private Array array;
	private int index;
	
	public ArrayIterator(Array array) {
		super();
		this.array = array;
		this.index = -1;
	}
	
	@Override
	public boolean next() {
		// TODO Auto-generated method stub
		index++;
		return index < array.getCount();
	}
	
	@Override
	public Object current() {
		// TODO Auto-generated method stub
		return array.getItem(index);
	}
	
}
