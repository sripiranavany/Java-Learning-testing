package com.sripiranavan.java.test.mockito;

public class Messenger {
	private TemplateEngine templateEngine;
	private MailServer mailServer;

	public TemplateEngine getTemplateEngine() {
		return templateEngine;
	}

	public void setTemplateEngine(TemplateEngine templateEngine) {
		this.templateEngine = templateEngine;
	}

	public MailServer getMailServer() {
		return mailServer;
	}

	public void setMailServer(MailServer mailServer) {
		this.mailServer = mailServer;
	}

	public void sendMessage(Client client, Template template) {
		String msgContent = templateEngine.prepareMessage(client, template);
		Email email = new Email();
		email.setAddressee(client.getEmail());
		email.setMsgContent(msgContent);
		mailServer.send(email);
	}
}
