package chap09.book.Exercise.p06;

public class Chatting {
	void startChat(String chatId) {
		String nickName = null;
		nickName = chatId;
		//effectively final이 아니기 때문에 정의를 한 번만 내리면 됨
		// -> String nickName = chatId;
		Chat chat = new Chat() {

			@Override
			public void start() {
				while (true) {
					String inputData = "안녕하세요";
					String message = "[" + nickName + "] " + inputData;
					sendMessage(message);
				}

			}
		};
		chat.start();
	}

	class Chat {
		void start() {
		}

		void sendMessage(String message) {
		}
	}
}