import java.util.Scanner;
import java.util.Date;
public class FriendService {
	
	static FriendEntity[] friend = new FriendEntity[50];
	static int cnt = 0;

	
	static {
		friend[0]=new FriendEntity(112,"Deepa","Aher","234543","deepa@gmail.com","Nashik",new String[] {"Cricket","Music"},new Date());
		friend[1]=new FriendEntity(113,"Seema","Rade","546565","seema@gmail.com","pune",new String[] {"Cricket","read"},new Date());
		friend[2]=new FriendEntity(114,"Sangeeta","patil","5464565","sangeeta@gmail.com","Nashik",new String[] {"Football","Music"},new Date());
		cnt=3;
	}
	
	//Add Friend
	public static void addFriend()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your id :");
		int id = sc.nextInt();
		System.out.println("Enter your Name :");
		String name = sc.next();
		System.out.println("Enter your LName :");
		String lname = sc.next();
		System.out.println("Enter the Mobile Number :");
		String mob = sc.next();
		System.out.println("Enter your Email :");
		String email = sc.next();
		System.out.println("Enter your Address :");
		String add = sc.next();
		System.out.println("Enter your Hobbies :");
		System.out.println("Enter your hobbies count :");
		int n = sc.nextInt();
		String[] hobbies = new String[n] ;
		for(int i=0;i<hobbies.length;i++)
		hobbies[i]= sc.next();
		
		friend[cnt++] = new FriendEntity(id,name,lname,mob,email,add,hobbies,new Date());
		System.out.println("Friend Added");
	}
	
	//Display
	public static void display() {
		for(int i = 0; i<cnt; i++) {
			System.out.println(friend[i]);
		}
	}
	
	
	//Find By Name
	public static FriendEntity[] findFriend(String name) {
		FriendEntity[] farr = new FriendEntity[cnt];
		int idx = 0;
		for(int i = 0; i<cnt; i++) {
			if(friend[i].getName().equals(name)) {
				farr[idx++] = friend[i];
			}
		}
		
		return farr;
	}
	
	//Find By id
		public static FriendEntity findByID(int id) {
			for(int i = 0; i<cnt; i++) {
				if(friend[i].getId() == id) {
					return friend[i];
				}
			}
			
			return null;
		}
		
		//Search by hobby
				public static FriendEntity[] findByHobby(String h) {
					FriendEntity[] res = new FriendEntity[cnt];
					int idx = 0;
					for(int i = 0; i<friend[i].getHobbies().length; i++) {
						for(String ch : friend[i].getHobbies()) {
							if(ch.toLowerCase().equals(h.toLowerCase())) {
								res[idx++] = friend[i];
							}
						}
					}
					if(idx == 0) {
						System.out.println("hobby not found");
					}
					return res;
				}


}
