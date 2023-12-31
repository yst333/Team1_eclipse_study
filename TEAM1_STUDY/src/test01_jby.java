
//아래의 코드는 사과를 담는 데 필요한 바구니(버켓)의 수를 구하는 코드이다.
//만일 사과의 수가 123개이고 하나의 바구니에는 10개의 사과를 담을 수 있다면,
//13개의 바구니가 필요할 것이다.
//(1)에 알맞은 코드를 넣으시오.

public class test01_jby {
	public static void main(String[] args) {
		
		int numOfApples = 123; //사과의 개수
		int sizeOfBucket = 10; //바구니의 크기(바구니에 담을 수 있는 사과의 개수)
		int numOfBucket;
		
		if (numOfApples%sizeOfBucket==0) { // 만약 numOfApples%sizeOfBucket 나머지가 0이라면
			numOfBucket = numOfApples / sizeOfBucket; // numOfApples/sizeOfBucket = 필요한 바구니의 수
		}else {
			numOfBucket = (numOfApples / sizeOfBucket) +1;
			// numOfApples%sizeOfBucket 나머지가 0이 아니라면
			// 나머지만큼 담을 바구니가 추가로 필요하기 때문에 +1 해주는것
		}
		
		System.out.println("필요한 바구니의 수 : " +numOfBucket);
	}

}
