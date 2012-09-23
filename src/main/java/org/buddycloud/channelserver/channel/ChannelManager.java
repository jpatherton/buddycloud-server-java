package org.buddycloud.channelserver.channel;

import java.util.Collection;
import java.util.Map;

import org.buddycloud.channelserver.channel.subscription.ChannelSubscription;
import org.buddycloud.channelserver.db.NodeStore;
import org.buddycloud.channelserver.db.exception.NodeStoreException;
import org.buddycloud.channelserver.pubsub.affiliation.Affiliations;
import org.xmpp.packet.JID;

public interface ChannelManager extends NodeStore {
	
	/**
	 * Creates a channel.
	 * @param channelJID the JID of the channel.
	 * @throws NodeStoreException 
	 */
	void createPersonalChannel(JID ownerJID) throws NodeStoreException;
	
	/**
	 * Determines whether the node id given refers to a local node.
	 * @param nodeId the node id
	 * @return <code>true</code> if the node appears to be local, <code>false</code> otherwise.
	 */
	boolean isLocalNode(String nodeId);
	
	/**
	 * Determines whether the jid refers to a local user.
	 * @param jid the user's jid
	 * @return <code>true</code> if the jid appears to be local, <code>false</code> otherwise.
	 */
	boolean isLocalJID(JID jid);
}
