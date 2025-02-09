import java.util.ArrayList;

public class Blockchain {
    private ArrayList<Block> chain;
    private int difficulty;

    public Blockchain(int difficulty) {
        chain = new ArrayList<>();
        this.difficulty = difficulty;
        // Create genesis block
        addBlock(new Block("Genesis Block", "0"));
    }

    public void addBlock(Block newBlock) {
        newBlock.mineBlock(difficulty);
        chain.add(newBlock);
    }

    public boolean isChainValid() {
        for (int i = 1; i < chain.size(); i++) {
            Block currentBlock = chain.get(i);
            Block previousBlock = chain.get(i - 1);

            // Check if current block's hash is valid
            if (!currentBlock.getHash().equals(currentBlock.calculateHash())) {
                return false;
            }

            // Check if current block points to previous block's hash
            if (!currentBlock.getPreviousHash().equals(previousBlock.getHash())) {
                return false;
            }
        }
        return true;
    }

    public Block getLatestBlock() {
        return chain.get(chain.size() - 1);
    }
} 