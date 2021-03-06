package au.edu.qut.ife.ldf.Service;

import java.util.List;

import au.edu.qut.ife.ldf.Model.Feed;

public interface FeedService {
	
	public void addFeed(Feed feed);
    public List<Feed> listFeeds(Integer projectId);
    public int removeFeed(Integer projectId, Integer feedId);
    public Feed showFeed(Integer idProject, Integer idFeed);
    public void updateFeed(Feed feed);
}
