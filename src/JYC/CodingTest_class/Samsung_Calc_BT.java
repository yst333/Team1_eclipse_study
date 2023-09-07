package JYC.CodingTest_class;


public class Samsung_Calc_BT extends SamsungCalc implements SamsungCalcST {
	
	public Samsung_Calc_BT(int num1, int num2) {
		super(num1, num2);		
	}

	@Override
	public int add() {
		System.out.println("삼성 베트남 공장에서 제작한 계산기입니다!");
		return super.add();
	}

	@Override
	public int sub() {
		System.out.println("삼성 베트남 공장에서 제작한 계산기입니다!");
		return super.sub();
	}

	@Override
	public int mul() {
		System.out.println("삼성 베트남 공장에서 제작한 계산기입니다!");
		return super.mul();
	}

	@Override
	public int div() {
		System.out.println("삼성 베트남 공장에서 제작한 계산기입니다!");
		return super.div();
	}

	

}
