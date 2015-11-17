import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Grid;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Location;
import java.util.Scanner;

/**
 * Game of Life starter code. Demonstrates how to create and populate the game using the GridWorld framework.
 * Also demonstrates how to provide accessor methods to make the class testable by unit tests.
 * 
 * @author @gcschmit
 * @version 18 July 2014
 */
public class GameOfLife
{
    // the world comprised of the grid that displays the graphics for the game
    private ActorWorld world;
    
    // the game board will have 10 rows and 10 columns
    private final int ROWS = 10;
    private final int COLS = 10;
    
    /**
     * Default constructor for objects of class GameOfLife
     * 
     * @post    the game will be initialized and populated with the initial state of cells
     * 
     */
    public GameOfLife(int choice)
    {
        if (choice>0)
        {// create the grid, of the specified size, that contains Actors
        BoundedGrid<Actor> grid = new BoundedGrid<Actor>(ROWS, COLS);
        
        // create a world based on the grid
        world = new ActorWorld(grid);
        
        // populate the game
        populateGameVertical();
        
        // display the newly constructed and populated world
        world.show();
    }
    else if (choice<0)
        {// create the grid, of the specified size, that contains Actors
        BoundedGrid<Actor> grid = new BoundedGrid<Actor>(ROWS, COLS);
        
        // create a world based on the grid
        world = new ActorWorld(grid);
        
        // populate the game
        populateGameStillLife();
        
        // display the newly constructed and populated world
        world.show();
    }
    else
        {// create the grid, of the specified size, that contains Actors
        BoundedGrid<Actor> grid = new BoundedGrid<Actor>(ROWS, COLS);
        
        // create a world based on the grid
        world = new ActorWorld(grid);
        
        // populate the game
        populateGame();
        
        // display the newly constructed and populated world
        world.show();
    }
        
    }
    
    /**
     * Creates the actors and inserts them into their initial starting positions in the grid
     *
     * @pre     the grid has been created
     * @post    all actors that comprise the initial state of the game have been added to the grid
     * 
     */
    private void populateGame()
    {
        // constants for the location of the four cells initially alive
        final int X1 = 4, Y1 = 4;
        final int X2 = 4, Y2 = 5;
        final int X3 = 5, Y3 = 5;
        final int X4 = 6, Y4 = 5;

        // the grid of Actors that maintains the state of the game
        //  (alive cells contains actors; dead cells do not)
        Grid<Actor> grid = world.getGrid();
        
        // create and add rocks (a type of Actor) to the three intial locations
        Critter critter1 = new Critter();
        Location loc1 = new Location(Y1, X1);
        grid.put(loc1, critter1);
        
        Critter critter2 = new Critter();
        Location loc2 = new Location(Y2, X2);
        grid.put(loc2, critter2);
        
        Critter critter3 = new Critter();
        Location loc3 = new Location(Y3, X3);
        grid.put(loc3, critter3);
        
        Critter critter4 = new Critter();
        Location loc4 = new Location(Y4, X4);
        grid.put(loc4, critter4);
    }
    /**
     * Creates the actors and inserts them into their initial starting positions in the grid
     *
     * @pre     the grid has been created
     * @post    all actors that comprise the initial state of the game have been added to the grid
     * 
     */
    private void populateGameStillLife()
    {
        // constants for the location of the four cells initially alive
        final int X1 = 4, Y1 = 4;
        final int X2 = 4, Y2 = 5;
        final int X3 = 5, Y3 = 5;
        final int X4 = 5, Y4 = 4;

        // the grid of Actors that maintains the state of the game
        //  (alive cells contains actors; dead cells do not)
        Grid<Actor> grid = world.getGrid();
        
        // create and add rocks (a type of Actor) to the three intial locations
        Critter critter1 = new Critter();
        Location loc1 = new Location(Y1, X1);
        grid.put(loc1, critter1);
        
        Critter critter2 = new Critter();
        Location loc2 = new Location(Y2, X2);
        grid.put(loc2, critter2);
        
        Critter critter3 = new Critter();
        Location loc3 = new Location(Y3, X3);
        grid.put(loc3, critter3);
        
        Critter critter4 = new Critter();
        Location loc4 = new Location(Y4, X4);
        grid.put(loc4, critter4);
    }
    /**
     * Creates the actors and inserts them into their initial starting positions in the grid
     *
     * @pre     a 10x10 grid has been created
     * @post    all actors that comprise the initial state of the game have been added to the grid
     * 
     */
    private void populateGameVertical()
    {
        // constants for the location of the four cells initially alive
        final int X1 = 4;

        // the grid of Actors that maintains the state of the game
        //  (alive cells contains actors; dead cells do not)
        Grid<Actor> grid = world.getGrid();
        // create and add rocks (a type of Actor) to the three intial locations
        for (int i=0;
            i<10;
            i++)
            {
                Critter critter1=new Critter();
                Location loc1= new Location(i,X1);
                grid.put(loc1,critter1);
            }
    }

    /**
     * Generates the next generation based on the rules of the Game of Life and updates the grid
     * associated with the world
     *
     * @pre     the game has been initialized
     * @post    the world has been populated with a new grid containing the next generation
     * 
     */
    public void createNextGeneration()
    throws InterruptedException
    {
        /** You will need to read the documentation for the World, Grid, and Location classes
         *      in order to implement the Game of Life algorithm and leverage the GridWorld framework.
         */
        
        // create the grid, of the specified size, that contains Actors
        Grid<Actor> grid = world.getGrid();
        BoundedGrid<Actor> changeInGrid= new BoundedGrid<Actor>(ROWS, COLS);
        // insert magic here...
        Thread.sleep(500);
        for (int row=0;
             row<this.ROWS;
             row++)
             {
                 for(int column=0;
                     column<this.COLS;
                     column++)
                     {
                         Location locchecker=new Location (row,column);
                         //if location has squat
                         if (this.getActor(row,column)==null)
                         {
                             //if spot has exactly 3 neighbors
                             int neighbors=grid.getNeighbors(locchecker).size();
                             if(neighbors==3) // 3 neighbors
                             {
                                 Critter baby = new Critter();
                                 changeInGrid.put(locchecker,baby);
                                }
                            }
                         //if location has critter
                         else
                         {
                             //if critter does not have 2 or 3 neighbors
                             int neighbors=grid.getNeighbors(locchecker).size();
                             if (neighbors ==2 ||
                                 neighbors ==3)//if critter does not have 2 or 3 neighbors
                             {
                                 changeInGrid.put(locchecker,grid.get(locchecker));
                                }
                            }
                        }
                }
        world.setGrid(changeInGrid);
        
    }
    
    /**
     * Returns the actor at the specified row and column. Intended to be used for unit testing.
     *
     * @param   row the row (zero-based index) of the actor to return
     * @param   col the column (zero-based index) of the actor to return
     * @pre     the grid has been created
     * @return  the actor at the specified row and column
     */
    public Actor getActor(int row, int col)
    {
        Location loc = new Location(row, col);
        Actor actor = world.getGrid().get(loc);
        return actor;
    }

    /**
     * Returns the number of rows in the game board
     *
     * @return    the number of rows in the game board
     */
    public int getNumRows()
    {
        return ROWS;
    }
    
    /**
     * Returns the number of columns in the game board
     *
     * @return    the number of columns in the game board
     */
    public int getNumCols()
    {
        return COLS;
    }
    
    
    /**
     * Creates an instance of this class. Provides convenient execution.
     *
     */
    public static void main(String[] args)
    throws InterruptedException
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Type a positive integer for a vertical line, 0 for a basic shape, or a negative an integer for an example of still life: ");
        int choice=s.nextInt();
        GameOfLife game = new GameOfLife(choice);
        System.out.print("How many generations would you like to trial after the initial state? ");
        int generations=s.nextInt();
        for (int i=0;
             i<generations;
             i++)
             {
                 game.createNextGeneration();
                }
    }

}
