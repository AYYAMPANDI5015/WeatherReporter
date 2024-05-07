import java.util.*;
import java.io.*;
public class tic_tac_toe_game{
	public static void main(String[] args) {
	      Scanner sc=new Scanner(System.in);
	      int flagX=0;
	      int flagO=0;
	      boolean ans=false;
	      boolean ans1=false;
		char[][] c=new char[3][3];
		System.out.println("----------------------");
		System.out.println("   TIC-TAC-TOE GAME   ");
		System.out.println("----------------------");
		System.out.println("    TWO PLAYERS   ");
		System.out.println("   player 1 :  X    ");
		System.out.println("   player 2 :  O    ");
		System.out.println();
		System.out.println("    ||       ||    ");
		System.out.println("===================");
		System.out.println("    ||       ||    ");
		System.out.println("===================");
		System.out.println("    ||       ||    ");
		System.out.println();
		for(int i=0;i<=8;i++) {
			if(i==0 || i==2 ||i==4 || i==6 ||i==8) {
				System.out.println("player 1 turns");
				int r=sc.nextInt();
				int co=sc.nextInt();
				if(r<0 ||r>2 ||co>2 ||co<0 )  return;
				if(c[r][co]!='X' || c[r][co]!='O') c[r][co]='X';
				else {
					System.out.println("invalid position");
					return;
				}
				System.out.println();
				System.out.println();
				System.out.println("   "+c[0][0]+" || "+c[0][1]+" || "+c[0][2]);
				System.out.println("================");
				System.out.println("   "+c[1][0]+" || "+c[1][1]+" || "+c[1][2]);
				System.out.println("================");
				System.out.println("   "+c[2][0]+" || "+c[2][1]+" || "+c[2][2]);						
				System.out.println();
				System.out.println();
				ans=checkXwins(c,flagX) ;
				if(ans==true) {
					System.out.println("    X WINS  ");
					return;
					}
			}
			else {
				System.out.println("player 2 turns");
				int r1=sc.nextInt();
				int co1=sc.nextInt();
				if(r1<0 ||r1>2 ||co1>2 ||co1<0 )  return;
				if(c[r1][co1]!='X' || c[r1][co1]!='O') c[r1][co1]='O';
				else {
					System.out.println("invalid position");
					return;}
				System.out.println();
				System.out.println("   "+c[0][0]+" || "+c[0][1]+" || "+c[0][2]);
				System.out.println("================");
				System.out.println("   "+c[1][0]+" || "+c[1][1]+" || "+c[1][2]);
				System.out.println("================");
				System.out.println("   "+c[2][0]+" || "+c[2][1]+" || "+c[2][2]);						
				System.out.println();
				ans1=checkOwins(c,flagO) ;
				if(ans1==true) {System.out.println("     O WINS   "); 
				return;
				}
				
				
			}
		}
		if(ans==false && ans1==false) {
			System.out.println("match dy");
		}
		
}
	public static boolean checkOwins(char[][] c,int flagO) {
		for(int k=0;k<3;k++) {
			for(int j=0;j<3;j++) {
			if(c[k][j]=='O') {
				flagO++;
			}
			else {
				continue;
			}
		}if(flagO==3) return true;
		else{flagO=0;}
		}
		flagO=0;
		for(int m=0;m<3;m++) {
			for(int n=0;n<3;n++) {
			if(c[n][m]=='O') {
				flagO++;
			}
			else {
				continue;
			}
		}
			if(flagO==3) return true;
			else {
				flagO=0;
			}
		}
		
		if(c[1][1]=='O' && c[0][0]=='O' && c[2][2]=='O') {
			return true;
		}
		if(c[0][2]=='O'&& c[1][1]=='O' && c[2][0]=='O') {
			return true;
		}
		return false;
	}
	
	public static boolean checkXwins(char[][] c,int flagX) {
		for(int k=0;k<3;k++) {
			for(int j=0;j<3;j++) {
			if(c[k][j]=='X') {
				flagX++;
			}
			else {
				continue;
			}
		}
			if(flagX==3) return true;
			else{flagX=0;}
		}
		flagX=0;
		for(int m=0;m<3;m++) {
			for(int n=0;n<3;n++) {
			if(c[n][m]=='X') {
				flagX++;
			}
			else {
				continue;
			}
		}
			if(flagX==3) return true;
			else{flagX=0;}
		}
		
		if(c[1][1]=='X' && c[0][0]=='X' && c[2][2]=='X') {
			return true;
		}
		if(c[0][2]=='X'&& c[1][1]=='X' && c[2][0]=='X') {
			return true;
		}
		return false;
	}
}