package data;

import java.util.List;

import android.database.SQLException;
import Common.Friend;
import Common.User;

public interface IdataAcces 
{
	User getUser(String userName,String password);

	void open() throws SQLException;

	void close();

	List<Friend> getAllFriends();

	void removeFriend(Friend friend);

	Friend addFriend(Friend friend);

}
