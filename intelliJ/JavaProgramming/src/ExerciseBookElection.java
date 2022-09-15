public class ExerciseBookElection {
    public static void main(String[] args) {
        String candidate1Name = IBIO.inputString("What is the name of first candidate? ");
        String candidate2Name = IBIO.inputString("What is the name of second candidate? ");

        //NY Votes
        int candidate1VoteNY = IBIO.inputInt("How many votes did " +candidate1Name+ " get in New York? ");
        int candidate2VoteNY = IBIO.inputInt("How many votes did " +candidate2Name+ " get in New York? ");
        //NJ Votes
        int candidate1VoteNJ = IBIO.inputInt("How many votes did " +candidate1Name+ " get in New Jersey? ");
        int candidate2VoteNJ = IBIO.inputInt("How many votes did " +candidate2Name+ " get in New Jersey? ");
        //CT Votes
        int candidate1VoteCT = IBIO.inputInt("How many votes did " +candidate1Name+ " get in Connecticut? ");
        int candidate2VoteCT = IBIO.inputInt("How many votes did " +candidate2Name+ " get in Connecticut? ");


        int allCandidate1Votes = candidate1VoteNY + candidate1VoteNJ + candidate1VoteCT;
        int allCandidate2Votes = candidate2VoteNY + candidate2VoteNJ + candidate2VoteCT;
        int TotalVotes = allCandidate1Votes + allCandidate2Votes;

        double candidate1Percent = (double)(allCandidate1Votes * 100) / TotalVotes;
        double candidate2Percent = (double)(allCandidate2Votes * 100) / TotalVotes;

        //Candidate 1 final print results
        System.out.println("Total votes for " +candidate1Name+ ": " +allCandidate1Votes);
        System.out.println("Total percentage for " +candidate1Name+ ": " +candidate1Percent+ "%");

        //Candidate 2 final print results
        System.out.println("Total votes for " +candidate2Name+ ": " +allCandidate2Votes);
        System.out.println("Total percentage for " +candidate2Name+ ": " +candidate2Percent+ "%");
    }
}
