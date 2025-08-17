<?php
// Define the GoalInterface
interface GoalInterface {
    public function setSavings($amount);
    public function checkProgress();
}

// Define an abstract Goal class implementing GoalInterface
abstract class Goal implements GoalInterface {
    protected $targetAmount;
    protected $currentSavings;

    abstract public function setSavings($amount);
    abstract public function checkProgress();
}

// Implement the Goal class
class SavingGoal extends Goal {
    public function __construct($targetAmount) {
        $this->targetAmount = $targetAmount;
        $this->currentSavings = 0;
    }

    public function setSavings($amount) {
        $this->currentSavings += $amount;
    }

    public function checkProgress() {
        echo "You have saved $" . $this->currentSavings . " out of your goal of $" . $this->targetAmount . ".<br>";
    }
}

// Create a User class
class User {
    private $userName;
    private $goals = [];

    public function __construct($userName) {
        $this->userName = $userName;
    }

    public function setGoal(GoalInterface $goal) {
        $this->goals[] = $goal;
    }

    public function viewGoals() {
        echo "Goals for " . $this->userName . ":<br>";
        foreach ($this->goals as $goal) {
            $goal->checkProgress();
        }
    }
}

// Main (Test the system)
$user1 = new User("Nesmark");
$goal1 = new SavingGoal(1000);
$user1->setGoal($goal1);

$goal1->setSavings(500);
$user1->viewGoals();

?>
