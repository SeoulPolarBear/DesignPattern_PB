package strategy;

public class GaussSumStrategy implements SumStrategy{
	//가우스 합 1~100까지의 합 구하기
	
	@Override
	public int get(int N) {
		return N*(N + 1)/2;
	}
}
