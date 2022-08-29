package strategy;

public class GaussSumStrategy implements SumStrategy{
	//���콺 �� 1~100������ �� ���ϱ�
	
	@Override
	public int get(int N) {
		return N*(N + 1)/2;
	}
}
