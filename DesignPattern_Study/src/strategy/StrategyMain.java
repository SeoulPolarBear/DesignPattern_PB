package strategy;
//핵심 내가 하나의 기능을 실행 시킬려고 합니다.
//이 기능을 실행 시키기 위해서는 1~N까지의 과정을 거쳐야 하는데
//이 1~N과정에서 하나의 기능이 수정 될 경우 내가 실행 하려는
//하나의 기능은 이런 변화를 몰라도 실행이 가능하도록 코드가 작성됩니다.
//즉, 이처럼 하나의 기능에 대해서 서로 다른 방식의 구현을 실행중에 변경할 수 있는 방식이다.

public class StrategyMain {
	public static void main(String[] args) {
		
		SumPrinter sp = new SumPrinter();
		
		sp.print(new SimpleSumStrategy(), 10);//둘이 서로 다른 방식이지만
		sp.print(new GaussSumStrategy(), 10);//하나의 함수에서 사용할 수 있도록 다형성을 
											//이용해서 다음과 같이 interface로 묶음을 알 수 있다.
	}
}
