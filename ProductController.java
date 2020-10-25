import java.util.Scanner;

public class ProductController {

		private int productid;
		private float price;
		private String color;
		private String Pname;
		Scanner sc= new Scanner(System.in);
		
		public void ProductCreate()
		{
			System.out.println("Enter Product ID :");
			productid =sc.nextInt();
			System.out.println("Enter Product Price :");
			price =sc.nextFloat();
			System.out.println("Enter Product color :");
			color =sc.next();
			System.out.println("Enter Product Name :");
			Pname =sc.next();
		}
		
		public void UpdateProduct(int productid , float price , String color , String Pname)
		{
			this.productid=productid;
			this.price=price;
			this.color=color;
			this.Pname=Pname;
			
		}
		
		
			

	}
sc.close();

