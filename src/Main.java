public class Main {
    public static void main(String[] args) {
        // Create blockchain with difficulty 4
        Blockchain blockchain = new Blockchain(5);
        
        System.out.println("Mining block 1...");
        blockchain.addBlock(new Block("First Block", blockchain.getLatestBlock().getHash()));
        
        System.out.println("Mining block 2...");
        blockchain.addBlock(new Block("Second Block", blockchain.getLatestBlock().getHash()));
        
        System.out.println("Mining block 3...");
        blockchain.addBlock(new Block("Third Block", blockchain.getLatestBlock().getHash()));
        
        System.out.println("Blockchain is valid: " + blockchain.isChainValid());
    }
} 