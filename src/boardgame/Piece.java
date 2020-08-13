package boardgame;

public abstract class Piece {

	protected Position position;
	private Board board;

	public Piece(Board board) {
		this.board = board;
		position = null; // a posi��o de uma pe�a recem criada seria nula
	}

	protected Board getBoard() { // o tabuleiro associado a uma pe�a so deve ser acessado dentro do pacote board e piece
		return board;
	}

	public abstract boolean[][] possibleMoves(); // m�todo abstrato que chama uma matriz de booleanos

	public boolean possibleMove(Position position) {
		return possibleMoves()[position.getRow()][position.getColumn()]; // m�todo concreto se utilizando de um m�todo abstrato
	}

	public boolean isThereAnyPossibleMove() { //implementa��o concreta que depende de um m�todo abstrato
		boolean[][] mat = possibleMoves();
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				if (mat[i][j]) {
					return true; //se a matriz na linha i e coluna j for verdadeira um movimento � poss�vel
				}
			}
		}
		return false;
	}
}
