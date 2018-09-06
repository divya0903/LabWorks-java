package dumps;

public class S {

	public static void main(String[] args) {
		S sc,scA,scB;
		sc=new S();
		scA= new SA();
		scB=new SB();
		System.out.println(sc.getHash() +" "+ scA.getHash() +" "+ scB.getHash());
		

	}
	
	public int getHash()
	{
		return 111;
	}
}
class SA extends S{
	public int getHash(){  //public long getHash() gives error as return type is int
		return 444;
	}
}

class SB extends S{
	public int getHash(){  //public long getHash() gives error as return type is int
		return 666;
	}
}
