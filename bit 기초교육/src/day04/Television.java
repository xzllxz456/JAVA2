package day04;
// �ڷ����� Ŭ����
public class Television {
	//�ʵ�
	private int channel;
	private int volume;
	private String serialNumber;
	//�޼ҵ�
	//1. ���� ���̱�
	void increaseVolume() {
		volume++;
	}
	//2. ���������� ���ڸ� ������ �� ���ڷ� ä���� �����ϴ� ���
	void changeChannel(int newChannel) {
		channel = newChannel;
	}
	//3. ����ڰ� ���� ä�ΰ� ���� ������ ��ġ�� �˷��޶�� �ϸ�
	//   ��Ʈ������ �����ִ� showInfo() ���
	String showInfo() {
		return "���� ����: "+volume+", ���� ä��: "+channel;
	}
	
	//������
	public Television(String serialNumber, int channel, int volume) {
		System.out.println("������ ȣ��");
		this.channel = channel;
		this.volume = volume;
		this.serialNumber = serialNumber;
		System.out.println("������ ����");
	}
	
	public Television() {
		channel = -1;
		volume = -1;
		serialNumber = "���� �ο� �ȵ�";
	}
	
	//getter/setter �����
	//channel getter/setter
	//setter
	public void setChannel(int channel) {
		this.channel = channel;
	}
	//getter
	public int getChannel() {
		return channel;
	}
	
	//volume getter/setter
	//setter
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	//getter
	public int getVolume() {
		return volume;
	}
	
	//serialNumber getter/setter
	//setter
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	//getter
	public String getSerialNumber() {
		return serialNumber;
	}
	
	//equals() �������̵��ϱ�
	public boolean equals(Object o) {
		//equals() �޼ҵ��
		//�Ķ���ͷ� ��� Ŭ������ ��ü�� ������ �ִ�.
		//��, �޼ҵ� ���ο����� ������ ���� ������ ��ģ��.
		//1. �Ķ���ͷ� �Ѿ�� ������Ʈ ��ü��
		//   �ش� Ŭ������ ��ü���� Ȯ��
		//2. �Ķ���ͷ� �Ѿ�� ��ü�� �Ȱ��� Ŭ������ ��ü�̴���
		//   Object�� ������Ÿ���̱� ������, �츮�� �ش� ��ü�� �ʵ忡
		//   �����ϱ� ���ؼ��� ����� ����ȯ�� ���ؼ� ������ ������ �ϹǷ�
		//   Ŭ���� ��ü = (Ŭ����)o; ��� �����ֳ�.
		//3. �̷��� Ÿ��ĳ������ ���ؼ� �ش� Ŭ���� ��ü�� �ٲٰ� ������
		//   ���� �ʿ��� �ʵ��� ������ ���ٸ� return true�Ѵ�.
		//4. �� ���� ��� ���� �ƹ��� �۾��� �����ش�!
		//   �ֳ��ϸ� ���� �������ٿ� �츮�� return false�� ������ �ű� �����̴�.
		
		//1. ���� Ŭ���� ��ü���� Ȯ���ϱ�
		//�̶��� instanceof ��� ���� ���ؼ� 
		//null�� �ƴϰ� Television Ŭ���� ��ü�̸� true,
		//�� �ܿ��� ��� false�� ���´�.
		if(o instanceof Television) {
			//2. o�� Television ��ü�� �ٲٱ�
			Television t = (Television)o;
			//3. Ư�� �ʵ尪 ���ϱ�
			if(this.channel == t.channel 
					&& this.serialNumber.equals(t.serialNumber)) {
				return true;
			}
		}
		
		
		return false;
		
	}
	
	
	
	//toString() public String toString()���� ����Ǿ��ִ�.
	public String toString() {
		//�츮�� �� �ȿ��� �ʿ��� ������ 
		//��Ʈ���� ���� �������ָ� �ȴ�.
		return "serialNumber: "+serialNumber+
				", channel: "+channel+
				", volume: "+volume;
	}
}










