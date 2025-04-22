import java.util.Scanner;

public class TestFriend {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		do {
			System.out.println("1. Add Friend ");
			System.out.println("2. Display Friend ");
			System.out.println("3. Find By Name ");
			System.out.println("4. Find by ID ");
			System.out.println("5. Display friends with a particular hobby");
			System.out.println("6. Exit ");
			System.out.println("Enter the choice :");
			choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				FriendService.addFriend();
				break;
			case 2:
				FriendService.display();
				break;
			
			case 3:
				System.out.println("Enter your Name :");
				String name = sc.next();
				FriendEntity[] res =FriendService.findFriend(name);
				for(int i = 0; i<res.length; i++) {
					if(res[i] != null) {
						System.out.println(res[i]);
					}
				}
				break;
			case 4:
				System.out.println("Enter your id :");
				int id = sc.nextInt();
				System.out.println(FriendService.findByID(id));
				break;
				
			case 5:
				System.out.println("Enter Hobby :");
				String h = sc.next();
				FriendEntity[] hb =FriendService.findByHobby(h);
				for(int i = 0; i<hb.length; i++) {
					if(hb[i] != null) {
						System.out.println(hb[i]);
					}
					
				}
				break;
			case 6:
				sc.close();
				System.out.println("Exit");
				break;
			default:
				System.out.println("Thank you");
				break;
			}
		}while(choice != 6);

	}

}
