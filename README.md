# Minesweeper Game Academic Project

This is a simple implementation of the classic game Minesweeper using Java. The objective of the game is to clear a rectangular board containing hidden mines without detonating any of them. The game is won when all non-mine squares are revealed, and lost when a mine is detonated. 

![Screenshot](https://github.com/JoaoFranco03/Minesweeper/blob/master/assets/PrintScreen.png)

## Getting Started

### Prerequisites

To run this program, you must have Java 19 or higher installed on your machine. You can download the latest version of Java from the [official Java website](https://www.java.com/en/download/).

## Playing the Game

The game board consists of a grid of squares. Each square can either be empty or contain a mine. The game starts with all squares hidden. 

To play the game, the player must uncover squares by clicking on them. If the square contains a mine, the game is lost. If the square is empty, a number is revealed indicating how many mines are adjacent to the square. If a square is revealed and all adjacent squares are also empty, they will also be revealed recursively. 

The player can mark squares as potential mines by right-clicking on them. This can be helpful in keeping track of which squares the player suspects contain mines. 

The game is won when all non-mine squares are revealed. 

## Acknowledgments

This implementation was inspired by the Minesweeper game that comes pre-installed on many Windows computers. 

## License

This project is licensed under the MIT License - see the [LICENSE.md](https://github.com/PMVPYW/MineFinder/blob/master/license) file for details.
