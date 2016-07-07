package com.rtmap.wx.sdk.mp.out;

import com.rtmap.wx.sdk.mp.in.InMsg;

/**
	回复图片消息
	<xml>
		<ToUserName><![CDATA[toUser]]></ToUserName>
		<FromUserName><![CDATA[fromUser]]></FromUserName>
		<CreateTime>12345678</CreateTime>
		<MsgType><![CDATA[image]]></MsgType>
			<Image>
				<MediaId><![CDATA[media_id]]></MediaId>
			</Image>
	</xml>
 */
/**
 * 
 * OutImageMsg. 回复图片消息
 * 
 * @author muarine
 * @since 2.1.6
 */
public class OutImageMsg extends OutMsg {
	public static final String TEMPLATE = 
			"<xml>\n" +
			"<ToUserName><![CDATA[${__msg.toUserName}]]></ToUserName>\n" +
			"<FromUserName><![CDATA[${__msg.fromUserName}]]></FromUserName>\n" +
			"<CreateTime>${__msg.createTime}</CreateTime>\n" +
			"<MsgType><![CDATA[${__msg.msgType}]]></MsgType>\n" +
				"<Image>\n" +
					"<MediaId><![CDATA[${__msg.mediaId}]]></MediaId>\n" +
				"</Image>\n" +
			"</xml>";
	
	private String mediaId;
	
	public OutImageMsg() {
		this.msgType = "image";
	}
	
	public OutImageMsg(InMsg inMsg) {
		super(inMsg);
		this.msgType = "image";
	}
	
	public String getMediaId() {
		return mediaId;
	}
	
	public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
	}
}



