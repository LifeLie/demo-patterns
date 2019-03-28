package pers.ll.demo.patterns.state.vote;

/**
 * 重复投票
 * @author ll
 * @date 2018/12/11 10:52 AM
 */
public class RepeatVoteState implements VoteState {

    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        System.out.println("请不要重复投票");
    }
}
