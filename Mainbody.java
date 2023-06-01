package basicjava.pro;
import java.util.*;
public class Mainbody {
  public static void main(String[] args) {
      //the big try-catch block will terminate the whole program if inputss are missmatch in the selecting options
      try{
        int Total=0,v,o,u;//Some random variables for do-while loops
        int [] q = new int[9];//this array is used for billing
        int [] f = new int [9];//this array is used for final billing
        int PNum=0,RPNum = 0,OptionNumber = 0,select = 0 ;
        Customer c = new Customer();
        Scanner s=new Scanner(System.in);
        //name starts
        int l = 1;
        //Design starts
        System.out.print("****************************************\n");
        System.out.print("*                                      *\n");
        System.out.print("*       UTSHOB Shopping Website        *\n");
        System.out.print("*                                      *\n");
        System.out.println("****************************************");
        //Design ends
        System.out.print("Enter Your Name (A to Z or a to z): ");
        c.name=s.next();
        do{
            int loop = 0;
            for(int i = 0 ; i<c.name.length(); i++){
                char ch = c.name.charAt(i);
                if(!Character.isDigit(ch))
                    loop++;
            }
            if(loop==c.name.length())
                l = 2;
            else{
                System.out.print("Enter Your Name again(A to Z or a to z): ");
                c.name=s.next();
            }
        }while(l==1);
        //name ends

        //email starts
        System.out.print("Enter your Email:");
        c.email=s.next();
        int m = 1;
        String s1 = "@gmail.com";
        do{
            if(c.email.contains(s1))
                m = 2;
            else{
                System.out.print("Enter your Email again:");
                c.email=s.next();
            }
        }while(m==1);
        //password starts
        System.out.print("Enter you Password (Minimum 4-Character):");
        c.password=s.next();
        int count = 1;
        do{
            if(c.password.length() >= 4){
                count = 2;
            }
            else{
                System.out.print("Enter you Password again (Minimum 4-Character):");
                c.password=s.next();
            }
        }while(count == 1);
        //password ends

        //creating item Objects
        Item i1 = new Item("Hard disk",4500);
        Item i2 = new Item("Asus keyboard",650);
        Item i3 = new Item("Gigabyte Motherboard",7000);
        Item i4 = new Item("Apex",1500);
        Item i5 = new Item("Bata",2000);
        Item i6 = new Item("Lotto",1750);
        Item i7 = new Item("IPhone 11 ",50000);
        Item i8 = new Item("Samsung A37",35000);
        Item i9 = new Item("ViVo v26",28000);

        //For adding & removing objects
        List<Item> ilist = new ArrayList<>();
        Item_Add_Drop ad = new Item_Add_Drop();
        Availability a = new Availability ();
        //ends here

        System.out.println("Welcome to our Shopping Site "+c.name);
        System.out.println("You have successfully registered.Now you are connecting our Product list. ");
        System.out.println();
        System.out.println("You can see our products");
        do{
            
            System.out.println("\n1-Computer Accessories\n2-Shoe\n3-Mobile\n4-Exit\nEnter: ");
            PNum = s.nextInt();
            
            switch (PNum) {

                case 1 -> {
                    // code for Computer Accessories
                    System.out.println("Now we can see our computer accessories item:\n1-Hard disk 1TB -BDT.4500\n2-Asus keyboard -BDT.650\n3-Gigabyte Motherboard -BDT.7000 \n4-Exit\nEnter:");
                    OptionNumber= s.nextInt();
                    
                    switch (OptionNumber) {
                        case 1 -> {
                            // code for Hard Disk
                            ilist.add(i1);
                            ad.addItem(ilist);
                            int p = 1;
                            int quantity;
                            do{
                                try{
                                    Scanner in = new Scanner(System.in);
                                    System.out.print("How many Hard Disk do you want: ");
                                    quantity=in.nextInt();
                                    //q[0] is the variable used for billing
                                    q[0] = quantity ;
                                    quantity--;
                                    f[0]=1;
                                    p=2;
                                    a.e1(quantity);
                                }catch(InputMismatchException k){
                                    System.out.println("A Technical error has occurred - "+k+ "\nPlease select again!!!" );
                                }
                            }while(p==1);
                         
                           ilist.remove(i1);
                        }

                        case 2 -> {
                            // code for asus keyboard
                            ilist.add(i2);
                            ad.addItem(ilist);
                            int p = 1;
                            int quantity;
                            do{
                                try{
                                    Scanner in = new Scanner(System.in);
                                    System.out.print("How many asus keyboard do you want: ");
                                    quantity=in.nextInt();


                                    //q[1] is the variable used for billing
                                    q[1] = quantity ;
                                    quantity--;
                                    f[1]=1;
                                    p=2;
                                    a.e2(quantity);
                                }catch(InputMismatchException k){
                                    System.out.println("A Technical error has occurred - "+k+ "\nPlease select again!!!" );
                                }
                            }while(p==1);
                            
                            ilist.remove(i2);
                        }
                        case 3 -> {
                            // code for gigabyte motherboard
                            ilist.add(i3);
                            ad.addItem(ilist);
                            int p = 1;
                            int quantity;
                            do{
                                try{
                                    Scanner in = new Scanner(System.in);
                                    System.out.print("How many gigabyte motherboard do you want: ");
                                    quantity=in.nextInt();
                                    //q[2] is the variable used for billing
                                    q[2] = quantity ;
                                    quantity--;
                                    f[2]=1;
                                    p=2;
                                    a.e3(quantity);
                                }catch(InputMismatchException k){
                                    System.out.println("A Technical error has occurred - "+k+ "\nPlease select again!!!" );
                                }
                            }while(p==1);
                           
                            ilist.remove(i3);
                        }

                        case 4 -> System.out.println("You have successfully exited");
                        default -> System.out.println("Invalid choice!");
                    }
                }
                    
                case 2 -> {
                    // code for shoe
                    System.out.println("Now we can see our Shoe product:\n1-Apex -BDT.1500\n2-Bata- BDT.2000\n3-Lotto BDT.1750\n4-Exit\nEnter:  ");
                    OptionNumber=s.nextInt();
                    switch (OptionNumber){
                        case 1 -> {
                            // code for Apex shoes
                            ilist.add(i4);
                            ad.addItem(ilist);
                            int p = 1;
                            int quantity;
                            do{
                                try{
                                    Scanner in = new Scanner(System.in);
                                    System.out.print("How many Apex shoes do you want: ");
                                    quantity=in.nextInt();
                                    //q[3] is the variable used for billing
                                    q[3] = quantity ;
                                    quantity--;
                                    f[3]=1;
                                    p=2;
                                    a.e4(quantity);
                                }catch(InputMismatchException k){
                                    System.out.println("A Technical error has occurred - "+k+ "\nPlease select again!!!" );
                                }
                            }while(p==1);
                           
                            ilist.remove(i4);
                        }
                        case 2 -> {
                            // code for Bata shoes
                            ilist.add(i5);
                            ad.addItem(ilist);
                            int p = 1;
                            int quantity;
                            do{
                                try{
                                    Scanner in = new Scanner(System.in);
                                    System.out.print("How many Bata shoes do you want: ");
                                    quantity=in.nextInt();
                                    //q[4] is the variable used for billing
                                    q[4] = quantity ;
                                    quantity--;
                                    f[4]=1;
                                    p=2;
                                    a.e5(quantity);
                                }catch(InputMismatchException k){
                                    System.out.println("A Technical error has occurred - "+k+ "\nPlease select again!!!" );
                                }
                            }while(p==1);
                           
                            ilist.remove(i5);
                        }
                        case 3 -> {
                            // code for Lotto shoes
                            ilist.add(i6);
                            ad.addItem(ilist);
                            int p = 1;
                            int quantity;
                            do{
                                try{
                                    Scanner in = new Scanner(System.in);
                                    System.out.print("How many Lotto shoes do you want: ");
                                    quantity=in.nextInt();
                                    //q[5] is the variable used for billing
                                    q[5] = quantity ;
                                    quantity--;
                                    f[5]=1;
                                    p=2;
                                    a.e1(quantity);
                                }catch(InputMismatchException k){
                                    System.out.println("A Technical error has occurred - "+k+ "\nPlease select again!!!" );
                                }
                            }while(p==1);
                            
                            ilist.remove(i6);
                        }
                        case 4 -> {
                            System.out.println("You have successfully exited");
                        }
                        default -> System.out.println("Invalid choice!");
                    }
                }
                case 3 -> {
                    // code for mobile
                    System.out.println("Now we can see our Mobile product:\n1- IPhone 11 -BDT.50000\n2-Samsung A37 -BDT.35000\n3-ViVo v26 -BDT.28000\n4-Exit\nEnter: ");
                    OptionNumber = s.nextInt();
                    switch (OptionNumber){
                        case 1 -> {
                            // code for IPhone
                            ilist.add(i7);
                            ad.addItem(ilist);
                            int p = 1;
                            int quantity;
                            do{
                                try{
                                    Scanner in = new Scanner(System.in);
                                    System.out.print("How many IPhone do you want: ");
                                    quantity=in.nextInt();
                                    //q[6] is the variable used for billing
                                    q[6] = quantity ;
                                    quantity--;
                                    f[6]=1;
                                    p=2;
                                    a.e7(quantity);
                                }catch(InputMismatchException k){
                                    System.out.println("A Technical error has occurred - "+k+ "\nPlease select again!!!" );
                                }
                            }while(p==1);
                            
                            ilist.remove(i7);
                        }
                        case 2 -> {
                            // code for Samsung
                            ilist.add(i8);
                            ad.addItem(ilist);
                            int p = 1;
                            int quantity;
                            do{
                                try{
                                    Scanner in = new Scanner(System.in);
                                    System.out.print("How many Samsung phones do you want: ");
                                    quantity=in.nextInt();
                                    //q[7] is the variable used for billing
                                    q[7] = quantity ;
                                    quantity--;
                                    f[7]=1;
                                    p=2;
                                    a.e8(quantity);
                                }catch(InputMismatchException k){
                                    System.out.println("A Technical error has occurred - "+k+ "\nPlease select again!!!" );
                                }
                            }while(p==1);
                           
                            ilist.remove(i8);
                        }
                        case 3 -> {
                            // code for ViVo
                            ilist.add(i9);
                            ad.addItem(ilist);
                            int p = 1;
                            int quantity;
                            do{
                                try{
                                    Scanner in = new Scanner(System.in);
                                    System.out.print("How many ViVo phones do you want: ");
                                    quantity=in.nextInt();
                                    //q[8] is the variable used for billing
                                    q[8] = quantity ;
                                    quantity--;
                                    f[8]=1;
                                    p=2;
                                    a.e9(quantity);
                                }catch(InputMismatchException k){
                                    System.out.println("A Technical error has occurred - "+k+ "\nPlease select again!!!" );
                                }
                            }while(p==1);
                            
                            ilist.remove(i9);
                        }
                        default -> System.out.println("Invalid choice!");

                    }
                }
                case 4 -> {
                    System.out.println("You have successfully exited");
                }
                default -> System.out.println("Invalid choice!");

            }
            if(PNum == 4 || OptionNumber ==4)
                break;
            OUTER:
            do {
                System.out.print("\n1-Add item\n2-Print bill\n3-Remove item\n4-Exit\nEnter:  ");
                select = s.nextInt();
                //this while loop is for creating a loop if user mistakenly input any number greater the given opition numbers
                while(select > 4){
                    if(select > 4){
                       System.out.print("\n1-Add item\n2-Print bill\n3-Remove item\n4-Exit\nEnter:  ");
                       select = s.nextInt(); 
                    }
                    else
                        break;
                }
                 //loop ends here
                switch (select) {
                    case 2 -> {
                        break OUTER;
                    }
                    case 3 -> {
                        System.out.println("Enter the item number you want to remove-\n1-Computer Accessories\n2-Shoe\n3-Mobile\n4-Exit\nEnter:  ");
                        RPNum = s.nextInt();
                        switch (RPNum) {
                            case 1 -> {
                                // code for Computer Accessories
                                System.out.println("\n\nEnter the item number you want to remove\n1-Hard disk 1TB -BDT.4500\n2-Asus keyboard -BDT.650\n3-Gigabyte Motherboard -BDT.7000 \n4-Exit\nEnter: ");
                                OptionNumber= s.nextInt();
                                switch (OptionNumber) {
                                    case 1 -> {
                                        // code for Hard Disk
                                        int p = 1;
                                        int r = 0;
                                        int quantity;
                                        do{
                                            try{
                                                Scanner in = new Scanner(System.in);
                                                System.out.print("How many pair of Hard Disk you want to remove: ");
                                                quantity=in.nextInt();
                                                //for final bill
                                                r = quantity;
                                                //A loop which checks that the removed numbers of item never be greater than added number of items
                                                while(r>q[0]){
                                                if(r>q[0]){
                                                System.out.print("How many pair of Hard Disk you want to remove: ");
                                                quantity=in.nextInt();
                                                r = quantity;
                                                }
                                                else
                                                    break;
                                                }
                                                //loop ends here
                                                q[0] = q[0] - r;
                                                f[0]=1;
                                                p=2;
                                            }catch(InputMismatchException k){
                                                System.out.println("A Technical error has occurred - "+k+ "\nPlease select again!!!" );
                                            }
                                        }while(p==1);
                                        ilist.add(i1);
                                        ad.removeItem(ilist);
                                        ilist.remove(i1);
                                        
                                    }
                                    case 2 -> {
                                        // code for asus keyboard
                                        int p = 1;
                                        int r = 0;
                                        int quantity;
                                        do{
                                            try{
                                                Scanner in = new Scanner(System.in);
                                                System.out.print("How many pair of asus keyboard you want to remove: ");
                                                quantity=in.nextInt();
                                                //for final bill
                                                r = quantity;
                                                //A loop which checks that the removed numbers of item never be greater than added number of items
                                                while(r>q[1]){
                                                if(r>q[1]){
                                                System.out.print("How many pair of asus keyboard you want to remove: ");
                                                quantity=in.nextInt();
                                                r = quantity;
                                                }
                                                else
                                                    break;
                                                }
                                                //loop ends here
                                                q[1] = q[1] - r;
                                                f[1]=1;
                                                p=2;
                                            }catch(InputMismatchException k){
                                                System.out.println("A Technical error has occurred - "+k+ "\nPlease select again!!!" );
                                            }
                                        }while(p==1);
                                        ilist.add(i2);
                                        ad.removeItem(ilist);
                                        ilist.remove(i2);

                                        //System.out.print("Total price of Hard disk 1TB is BDT: "+amount1);
                                    }
                                    case 3 -> {
                                        // code for gigabyte motherboard
                                        int p = 1;
                                        int r = 0;
                                        int quantity;
                                        do{
                                            try{
                                                Scanner in = new Scanner(System.in);
                                                System.out.print("How many pair of gigabyte motherboard you want to remove: ");
                                                quantity=in.nextInt();
                                                //for final bill
                                                r = quantity;
                                                //A loop which checks that the removed numbers of item never be greater than added number of items
                                                while(r>q[2]){
                                                if(r>q[2]){
                                                System.out.print("How many pair of gigabyte motherboard you want to remove: ");
                                                quantity=in.nextInt();
                                                r = quantity;
                                                }
                                                else
                                                    break;
                                                }
                                                //loop ends here
                                                q[2] = q[2] - r;
                                                f[2]=1;
                                                p=2;
                                            }catch(InputMismatchException k){
                                                System.out.println("A Technical error has occurred - "+k+ "\nPlease select again!!!" );
                                            }
                                        }while(p==1);
                                        ilist.add(i3);
                                        ad.removeItem(ilist);
                                        ilist.remove(i3);
                                    }
                                    case 4 -> {
                                        System.out.println("You have successfully exited");
                                    }
                                    default -> System.out.println("Invalid choice!");
                                }
                            }
                            case 2 -> {
                                // code for shoe
                                System.out.println("\n\nEnter the item number you want to remove\n1-Apex -BDT.1500\n2-Bata- BDT.2000\n3-Lotto BDT.1750\n4-Exit\nEnter:  ");
                                OptionNumber=s.nextInt();
                                switch (OptionNumber){
                                    case 1 -> {
                                        // code for Apex shoes
                                        int p = 1;
                                        int r = 0;
                                        int quantity;
                                        do{
                                            try{
                                                Scanner in = new Scanner(System.in);
                                                System.out.print("How many pair of Apex  shoes you want to remove: ");
                                                quantity=in.nextInt();
                                                //for final bill
                                                r = quantity ;
                                                //A loop which checks that the removed numbers of item never be greater than added number of items
                                                while(r>q[3]){
                                                if(r>q[3]){
                                                System.out.print("How many pair of Apex  shoes you want to remove: ");
                                                quantity=in.nextInt();
                                                r = quantity;
                                                }
                                                else
                                                    break;
                                                }
                                                //loop ends here
                                                q[3] = q[3] - r;
                                                f[3]=1;
                                                p=2;
                                            }catch(InputMismatchException k){
                                                System.out.println("A Technical error has occurred - "+k+ "\nPlease select again!!!" );
                                            }
                                        }while(p==1);
                                        ilist.add(i4);
                                        ad.removeItem(ilist);
                                        ilist.remove(i4);
                                    }
                                    case 2 -> {
                                        // code for Bata shoes
                                        int p = 1;
                                        int r = 0;
                                        int quantity;
                                        do{
                                            try{
                                                Scanner in = new Scanner(System.in);
                                                System.out.print("How many pair of Bata shoes you want to remove: ");
                                                quantity=in.nextInt();
                                                //for final bill
                                                r = quantity ;
                                                //A loop which checks that the removed numbers of item never be greater than added number of items
                                                while(r>q[4]){
                                                if(r>q[4]){
                                                System.out.print("How many pair of Bata shoes you want to remove: ");
                                                quantity=in.nextInt();
                                                r = quantity;
                                                }
                                                else
                                                    break;
                                                }
                                                //loop ends here
                                                q[4] = q[4] - r;
                                                f[4]=1;
                                                p=2;
                                            }catch(InputMismatchException k){
                                                System.out.println("A Technical error has occurred - "+k+ "\nPlease select again!!!" );
                                            }
                                        }while(p==1);
                                        ilist.add(i5);
                                        ad.removeItem(ilist);
                                        ilist.remove(i5);
                                        // System.out.print("Total price of Shoe is BDT: "+amount1);
                                    }
                                    case 3 -> {
                                        // code for Lotto shoes
                                        int p = 1;
                                        int r = 0;
                                        int quantity;
                                        do{
                                            try{
                                                Scanner in = new Scanner(System.in);
                                                System.out.print("How many pair of Lotto shoes you want to remove: ");
                                                quantity=in.nextInt();
                                                //for final bill
                                                r = quantity ;
                                                //A loop which checks that the removed numbers of item never be greater than added number of items
                                                while(r>q[5]){
                                                if(r>q[5]){
                                                System.out.print("How many pair of Lotto shoes you want to remove: ");
                                                quantity=in.nextInt();
                                                r = quantity;
                                                }
                                                else
                                                    break;
                                                }
                                                //loop ends here
                                                q[5] = q[5] - r;
                                                f[5]=1;
                                                p=2;
                                            }catch(InputMismatchException k){
                                                System.out.println("A Technical error has occurred - "+k+ "\nPlease select again!!!" );
                                            }
                                        }while(p==1);
                                        ilist.add(i6);
                                        ad.removeItem(ilist);
                                        ilist.remove(i6);
                                    }
                                    case 4 -> {
                                        System.out.println("You have successfully exited");
                                    }
                                    default -> System.out.println("Invalid choice!");
                                }
                            }
                            case 3 -> {
                                // code for mobile
                                System.out.println("\nEnter the item number you want to remove\n1- IPhone 11 -BDT.50000\n2-Samsung A37 -BDT.35000\n3-ViVo v26 -BDT.28000\n4-Exit\nEnter: ");
                                OptionNumber = s.nextInt();
                                switch (OptionNumber){
                                    case 1 -> {
                                        // code for IPhone
                                        System.out.print("How many IPhones you want to remove: ");
                                        int p = 1;
                                        int r = 0;
                                        int quantity;
                                        do{
                                            try{
                                                Scanner in = new Scanner(System.in);
                                                System.out.print("How many IPhones  do you want: ");
                                                quantity=in.nextInt();
                                                //for final bill
                                                //A loop which checks that the removed numbers of item never be greater than added number of items
                                                while(r>q[6]){
                                                if(r>q[6]){
                                                System.out.print("How many IPhones  do you want: ");
                                                quantity=in.nextInt();
                                                r = quantity;
                                                }
                                                else
                                                    break;
                                                }
                                                //loop ends here
                                                r = quantity ;
                                                q[6] = q[6] - r;
                                                f[6]=1;
                                                p=2;
                                            }catch(InputMismatchException k){
                                                System.out.println("A Technical error has occurred - "+k+ "\nPlease select again!!!" );
                                            }
                                        }while(p==1);
                                        ilist.add(i7);
                                        ad.removeItem(ilist);
                                        ilist.remove(i7);
                                        //System.out.print("Total price of Iphone  is BDT\n"+amount);
                                    }
                                    case 2 -> {
                                        // code for Samsung
                                        int p = 1;
                                        int r = 0;
                                        int quantity;
                                        do{
                                            try{
                                                Scanner in = new Scanner(System.in);
                                                System.out.print("How many Samsung mobiles you want to remove:  ");
                                                quantity=in.nextInt();
                                                //for final bill
                                                r = quantity ;
                                                //A loop which checks that the removed numbers of item never be greater than added number of items
                                                while(r>q[7]){
                                                if(r>q[7]){
                                                System.out.print("How many Samsung mobiles you want to remove: ");
                                                quantity=in.nextInt();
                                                r = quantity;
                                                }
                                                else
                                                    break;
                                                }
                                                //loop ends here
                                                q[7] = q[7] - r;
                                                f[7]=1;
                                                p=2;
                                            }catch(InputMismatchException k){
                                                System.out.println("A Technical error has occurred - "+k+ "\nPlease select again!!!" );
                                            }
                                        }while(p==1);
                                        ilist.add(i8);
                                        ad.removeItem(ilist);
                                        ilist.remove(i8);
                                    }
                                    case 3 -> {
                                        // code for ViVo
                                        int p = 1;
                                        int r = 0;
                                        int quantity;
                                        do{
                                            try{
                                                Scanner in = new Scanner(System.in);
                                                System.out.print("How many ViVo mobiles you want to remove:  ");
                                                quantity=in.nextInt();
                                                //for final bill
                                                r = quantity ;
                                                //A loop which checks that the removed numbers of item never be greater than added number of items
                                                while(r>q[8]){
                                                if(r>q[8]){
                                                System.out.print("How many ViVo mobiles you want to remove: ");
                                                quantity=in.nextInt();
                                                r = quantity;
                                                }
                                                else
                                                    break;
                                                }
                                                //loop ends here
                                                q[8] = q[8] - r;
                                                f[8]=1;
                                                p=2;
                                            }catch(InputMismatchException k){
                                                System.out.println("A Technical error has occurred - "+k+ "\nPlease select again!!!" );
                                            }
                                        }while(p==1);
                                        ilist.add(i9);
                                        ad.removeItem(ilist);
                                        ilist.remove(i9);
                                    }
                                    case 4 -> {
                                        System.out.println("You have successfully exited");
                                    }
                                    default -> System.out.println("Invalid choice!");
                                }
                            }
                            case 4 -> {
                                System.out.println("You have successfully exited");
                            }
                            default -> System.out.println("Invalid choice!");
                        }
                        if (RPNum == 4 || OptionNumber ==4 || select==4) {
                            break OUTER;
                        }
                        
                    }

                }
            } while (select == 3);
        } while(select == 1);
        if(PNum==4 || RPNum==4 || OptionNumber ==4 ||select == 4){
            System.out.println("Visit again");
        }
        else{
       
            System.out.println("\n\n\n------------------------------------------------------------------------------------");
            System.out.println("Item name\t\t\t   Quantity\t\t\tPrice");
            System.out.println("------------------------------------------------------------------------------------");
            if((f[0]==1) && (q[0]<=5)){
                System.out.println("Hard Disk\t\t\t\t"+q[0]+"\t\t\t"+(4500*q[0]));
                Total=Total+(4500*q[0]);
            }
           if((f[1]==1) && (q[1]<=5)){
                System.out.println("Asus Keyboard\t\t\t\t"+q[1]+"\t\t\t"+(650*q[1]));
                Total=Total+(650*q[1]);
            }
           if((f[2]==1) && (q[2]<=5)){
                System.out.println("Gigabyte Motherboard\t\t\t"+q[2]+"\t\t\t"+(7000*q[2]));
                Total=Total+(7000*q[2]);
            }
           if((f[3]==1) && (q[3]<=5)){
                System.out.println("Apex\t\t\t\t\t"+q[3]+"\t\t\t"+(1500*q[3]));
                Total=Total+(1500*q[3]);
            }
           if((f[4]==1) && (q[4]<=5)){
                System.out.println("Bata\t\t\t\t\t"+q[4]+"\t\t\t"+(2000*q[4]));
                Total=Total+(2000*q[4]);
            }
           if((f[5]==1) && (q[5]<=5)){
                System.out.println("Lotto\t\t\t\t\t"+q[5]+"\t\t\t"+(1750*q[5]));
                Total=Total+(1750*q[5]);
            }
           if((f[6]==1) && (q[6]<=5)){
                System.out.println("Iphone 11\t\t\t\t"+q[6]+"\t\t\t"+(50000*q[6]));
                Total=Total+(50000*q[6]);
            }
           if((f[7]==1) && (q[7]<=5) ){
                System.out.println("Samsung A37\t\t\t\t"+q[7]+"\t\t\t"+(35000*q[7]));
                Total=Total+(35000*q[7]);
            }
            if((f[8]==1) && (q[8]<=5)){
                System.out.println("ViVo v26\t\t\t\t"+q[8]+"\t\t\t"+(28000*q[8]));
                Total=Total+(28000*q[8]);
            }
            System.out.println("------------------------------------------------------------------------------------");
            System.out.println("Total bill\t\t\t\t\t\t\t"+Total);





            OUTER_1:
            do {
                System.out.println("\n\nPayment Methods to confirm your order\n1.Cash on delivery\n2.Credit/Debit Card\nIf you want exit then enter 4\nEnter: ");
                select=s.nextInt();
                switch (select) {
                    case 1 -> {
                          System.out.println("Name: "+c.name+"\nEnter your address : ");
                          c.address=s.next();
                          System.out.println("Enter your phone number: ");
                          c.mobile=s.next();
                        //for phone
                        do{
                            u = 1;
                            int loop = 0;
                            for(int i = 0 ; i<c.mobile.length(); i++){
                                char ch = c.mobile.charAt(i);
                                if(Character.isDigit(ch) == true)
                                    loop++;
                            }
                            if((loop==c.mobile.length())&& (c.mobile.length()==11))
                                u = 2;
                            else{
                                System.out.print("Enter your phone number again: ");
                                c.mobile=s.next();
                            }
                        }while(u==1);
                        System.out.println("Your order will be delivered soon. Thank you for being with us ");
                        //phone ends
                    }
                    case 2 -> {
                        do{
                            o = 1;
                            try{
                                Scanner n = new Scanner (System.in);
                                System.out.println("Name: "+c.name+"\nEnter your address : ");
                                c.address=s.next();
                                System.out.println("Enter your account number: ");
                                c.account=s.next();
                                System.out.println("Amount:");
                                int pay=n.nextInt();
                                v = 1;
                                do{
                                    if(pay==Total){
                                        v = 2;
                                        System.out.println("Enter your pin:");
                                        c.card=s.next();
                                        System.out.println("You have just paid "+pay+" taka.\n\nYour order will be delivered soon. Thank you for being with us ");
                                    }
                                    else
                                    {
                                        System.out.println("Payment invalid!!!!!!!!!!!");
                                        System.out.print("Enter Your amount again: ");
                                        pay=n.nextInt();

                                    }
                                } while(v==1);
                                o = 2;
                            }catch(Exception e){
                                System.out.println("A technical error has occurred:"+ e);
                            }
                        }while(o==1);
                    }
                    case 4 -> {
                        break OUTER_1;
                    }
                    default -> {
                    }
                }
            } while (select>=3);
       }
        //the big try-catch block will terminate the whole program if inputss are missmatch in the selecting options
      }catch(Exception e){
           System.out.println("An error has occured!!!\nYou have exited our site");
      }           
   }   
}


<!DOCTYPE html>
<html>
<body>
<h2>Project Done by &copy; Nushrat Jaben Aurnima. All Rights Reserved .</h2>
</body>
</html>
