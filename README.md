# Simple Java Blockchain Implementation

A basic implementation of a blockchain in Java that demonstrates the core concepts of blockchain technology including:
- Block mining with Proof of Work
- Chain validation
- Cryptographic hashing
- Block linking

## Project Overview

This project implements a simple blockchain where each block contains:
- Data/transactions
- Previous block's hash
- Timestamp
- Nonce (for mining)
- Current block's hash

The blockchain features:
- Configurable mining difficulty
- Chain validation to ensure integrity
- Proof of Work consensus mechanism

## How it Works

1. The blockchain is initialized with a genesis block
2. New blocks are added through mining (Proof of Work)
3. Each block is linked to the previous block through cryptographic hashes
4. The entire chain can be validated to ensure no blocks have been tampered with
