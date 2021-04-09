#Langton's Ant
##Advanced Java Programming Lab Unit 1
Langton's ant is a two-dimensional universal Turing machine with a very simple set of rules but complex emergent behavior. It was invented by Chris Langton in 1986 and runs on a square lattice of black and white cells. The universality of Langton's ant was proven in 2000. The idea has been generalized in several different ways, such as turmites which add more colors and more states.

In this implementation we care only about the most simple way of this problem. The main algorithm is:

>At a white square, turn 90° clockwise, flip the color of the square, move forward one unit

>At a black square, turn 90° counter-clockwise, flip the color of the square, move forward one unit

The colors are implemented as numbers (like the orientation):

>WHITE --> 0 | BLACK --> 1

>NORTH --> 0 | EAST --> 1 | SOUTH --> 2 | WEST --> 3

If you want to read more about the problem and see a graphical implementation of the first 200 steps look on [Langton's Ant Wikipedia](https://en.wikipedia.org/wiki/Langton%27s_ant)