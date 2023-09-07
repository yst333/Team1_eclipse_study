package JYC.CodingTest_class;


public class SamsungCalc extends Calculator implements SamsungCalcST {

	public SamsungCalc(int num1, int num2) {
		super(num1, num2);		
	}

	
	@Override
	public int add() {
		System.out.println("삼성만의 앞선 기술로 만든 덧셈 처리 기술입니다!");
		return (num1 + num2);
	}

	@Override
	public int sub() {
		System.out.println("삼성만의 앞선 기술로 만든 뺄셈 처리 기술입니다!");
		return super.sub();
	}

	@Override
	public int mul() {
		System.out.println("삼성만의 앞선 기술로 만든 곱셈 처리 기술입니다!");
		return super.mul();
	}

	@Override
	public int div() {
		System.out.println("삼성만의 앞선 기술로 만든 나눗셈 처리 기술입니다!");
		return super.div();
	}
}
