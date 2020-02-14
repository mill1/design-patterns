
class Factory {
	
    private Pool[] pool;

    public Factory(int maxRows) {
        pool = new Pool[maxRows];
    }

    public Pool getFlyweight(int row) {
        if (pool[row] == null) {
            pool[row] = new Pool(row);
        }
        return pool[row];
    }
}
