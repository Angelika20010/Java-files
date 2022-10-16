package dip107;

class Settlement{
	private final static String DEFAULT_nosaukums="nekads";
	private final static long DEFAULT_iedzivotaju_daudzums=0;
	private final static short DEFAULT_teritorijas_kods=0;
	
	private String nosaukums;
	private long iedzivotaju_daudzums;
	private short teritorijas_kods;
	
	public Settlement() {
		this(DEFAULT_nosaukums, DEFAULT_iedzivotaju_daudzums, DEFAULT_teritorijas_kods);
	}
	public Settlement(String nosaukums, long iedzivotaju_daudzums, short teritorijas_kods) {
		this.nosaukums=nosaukums;
		this.iedzivotaju_daudzums= iedzivotaju_daudzums;
		this.teritorijas_kods=teritorijas_kods;
		
	}
	public String getnosaukums() {
		return nosaukums;
	}
	public long getiedzivotaju_daudzums() {
		return iedzivotaju_daudzums;
	
	}
	public short getteritorijas_kods() {
		return teritorijas_kods;
	}
	public void setnosaukums(String nosaukums) {
		this.nosaukums=nosaukums;
	}
	public void setiedzivotaju_daudzums(long iedzivotaju_daudzums) {
		this.iedzivotaju_daudzums=iedzivotaju_daudzums;
	}
	public void setteritorijas_kods(short teritorijas_kods) {
		this.teritorijas_kods= teritorijas_kods;
	}
	public String toString() {
		return "Nosaukums:"+ nosaukums+ ", Iedzivotaju_daudzums:" + iedzivotaju_daudzums+ ", teritorijas kods:" + teritorijas_kods + ".";
	}
}

public class MD5 {

	public static void main(String[] args) {
		System.out.println("201RDB250 Anželika Bureka 7.grupa");
		Settlement Set1= new Settlement("Liepaja", 2453, (short) 2563),
				Set2 = new Settlement();
		
		System.out.println(Set1.toString());
		System.out.println(Set1);
		System.out.println(Set2);
		
		Set2.setnosaukums("Riga");
		Set2.setiedzivotaju_daudzums(3457);
		Set2.setteritorijas_kods((short) 790);
		
		System.out.println(Set2);
		
		 System.out.println("Thread: " + Thread.currentThread() + ".");
	      System.out.println("\nPress \"Enter\" to finish program... ");

	      try {
	         System.in.read();
	      }
	         catch(java.io.IOException e) {
	            System.out.println("Input/output exception.");
	         }


	}

}
