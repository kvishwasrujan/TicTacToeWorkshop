package com.capgemini.tictactoe;

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
		public static void main(String[] args) {
			System.out.println("Welcome to TicTacToe program");
	        TicTacToe ticTacToe = new TicTacToe();
			char[] board = ticTacToe.createBoard();
		}}
