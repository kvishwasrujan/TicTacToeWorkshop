package com.capgemini.tictactoe;
import java.util.Scanner;
import java.util.Arrays;
public class TicTacToe {
	//constants
		public static char user;
		public static char computer;
		public static char turn;
		public static char board;
		// Create board with Empty Spaces
		private char[] createBoard() {
			char[] board = new char[10];
				for (int i = 1; i < 10; i++) {
					board[i] = ' ';
					}
					return board;
				}
		//choosing letter
		/**
		 * @return
		 */
		private static char chooseLetter() {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Letter");
			return sc.next().charAt(0);
		}
		//displaying board
		/**
		 * @param board
		 */
		private static void displayBoard(char[] board) {
			System.out.println(board[1]+" | "+board[2]+" | "+board[3]);
			System.out.println("______________");
			System.out.println(board[4]+" | "+board[5]+" | "+board[6]);
			System.out.println("______________");
			System.out.println(board[7]+" | "+board[8]+" | "+board[9]);
		}
		// Move to desired location
			/**
			 * @param board
			 * @return
			 */
			private static int moveLocation(char[] board) {
				Scanner sc = new Scanner(System.in);
				Integer[] values = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
				while (true) {
					System.out.println("Enter the number between 1 and 9");
					int location = sc.nextInt();
					if (Arrays.asList(values).contains(location) && isSpaceFree(board, location)) {
						return location;
					}
				}

			}
	        //checking if the location is free
			private static boolean isSpaceFree(char[] board, int location) {
				return board[location] == ' ';
			}
			//changing on board
			/**
			 * @param board
			 * @param turn
			 */
			private static void makeMove(char[] board,char turn) {
				if(turn==user) {
					int location=moveLocation(board);
					board[location]=user;
				}
				else {
					int location=(int) (Math.floor((Math.random() * 10) % 9) + 1);
					if(isSpaceFree(board,location)==true) {
						board[location]=turn;
					}
				}
				displayBoard(board);
			}
		public static void main(String[] args) {
			System.out.println("Welcome to TicTacToe program");
	        TicTacToe ticTacToe = new TicTacToe();
			char[] board = ticTacToe.createBoard();
			char user=ticTacToe.chooseLetter();
			//assigning computer letter
			if(user=='X') {
				computer='O';
			}
			else {
				computer='X';
			}
			displayBoard(board);
			makeMove(board,user);
		}
		}
