import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//https://app.patika.dev/courses/java101/pratik-hesap-mak-1
		
		Scanner scanner = new Scanner(System.in);
		
		int a,b,select;
		
		System.out.print("Birinci sayı: ");
		a = scanner.nextInt();
		
		System.out.print("İkinci sayı: ");
		b = scanner.nextInt();
		
		String info = "İşlemler\n"+
					"1.Toplama İşlemi\n"
					+"2.Çıkarma İşlemi\n"
					+"3.Çarpma İşlemi\n"
					+"4.Bölme İşlemi\n"
					+"5.Çıkış";
		
		System.out.println(info);                //String olarak tanımladığım info'yu, karışıklığı engellemek için burada yazdırdım.
		System.out.println("***************");
		System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz: ");
		select = scanner.nextInt();
		
		switch(select) {
		case 1:
			System.out.println("Toplam: " + (a+b));
			break;
		case 2:
			System.out.println("Fark: " + (a-b));
			break;
		case 3:
			System.out.println("Çarpım: " + (a*b));
			break;
		case 4:
			System.out.println("Bölüm: " +(double)a/b);
			break;
		case 5:
			System.out.println("Hesap makinası sonlandırıldı.");
			return;
		default:
			System.out.println("Yanlış bir işlem seçtiniz.");
		}
		

	}

}
