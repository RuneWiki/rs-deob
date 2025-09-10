package deob;

import java.nio.ByteBuffer;

@ObfuscatedName("og")
public class class374 extends class372 {

	@ObfuscatedName("og.af")
	public ByteBuffer field4317;

	@ObfuscatedName("og.at(I)[B")
	public byte[] method7500() {
		byte[] var1 = new byte[this.field4317.capacity()];
		this.field4317.position(0);
		this.field4317.get(var1);
		return var1;
	}

	@ObfuscatedName("og.ac([BB)V")
	public void method7501(byte[] arg0) {
		this.field4317 = ByteBuffer.allocateDirect(arg0.length);
		this.field4317.position(0);
		this.field4317.put(arg0);
	}
}
