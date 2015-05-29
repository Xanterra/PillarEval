# PillarEval
Pillar Evaluation - based upon the Vending Machine Kata

Source: https://github.com/guyroyse/vending-machine-kata







I would like to refactor the tests using @Before, but variables initialized in the before seem to not be resolving in actual tests. After having tried googling my situation both yesterday and today with little success, I figure I must be missing something so basic I'm overlooking it. 

The code I tried was adding the following before /*Accept Coins*/ in VendingMachineTest and removing the initializations in the actual tests.

@Before

public void setUp(){

VendingMachine vm = new VendingMachine();

}
