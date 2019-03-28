package pers.ll.demo.patterns.state.vote;

/**
 * 恶意刷票
 * @author ll
 * @date 2018/12/11 10:53 AM
 */
public class SpiteVoteState implements VoteState {
    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        String str = voteManager.getVoteMap().get(user);
        if (null != str) {
            voteManager.getVoteMap().remove(user);
        }
        System.out.println("你有恶意刷屏行为，取消投票资格");
    }
}
