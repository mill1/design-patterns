
class Pool {
	
    private int row;

    public Pool(int row) {
        this.row = row;
        System.out.println("Row: " + this.row);
    }

    void print(int col) {
        System.out.print(" " + row + col);
    	System.out.print(" " + this.toString());
    	System.out.println();
    }
}
