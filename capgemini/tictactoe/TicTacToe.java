package com.capgemini.tictactoe;
import java.util.Scanner;
public class TicTacToe {
	//constants
		public static char user;
		public static char computer;
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
		 * @return char
		 */
		private static char chooseLetter() {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Letter");
			return sc.next().charAt(0);
		}
		/**
		 * @param args
		 */
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
		}}
