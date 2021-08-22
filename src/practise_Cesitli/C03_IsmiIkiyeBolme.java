package practise_Cesitli;

public class C03_IsmiIkiyeBolme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * isim alıyorsun 2 tane. eğer ilk isim çift harfliyse ikinci ismi arasına yaz, eğer tek harfliyse decline et.
		 */
		String isim1= "cemal";
		
		String isim2="osman";
		
		if (isim1.length()%2==0) {
			System.out.println(isim1.substring(0, isim1.length()/2) + isim2 + isim1.substring(isim1.length()/2));
		} else {
			System.out.println("bu isim tek haneli");
		}
	}

}
