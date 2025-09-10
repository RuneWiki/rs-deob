package deob;

@ObfuscatedName("cn")
public class class67 implements Runnable {

	@ObfuscatedName("cn.af")
	public boolean field910 = true;

	@ObfuscatedName("cn.aw")
	public Object field907 = new Object();

	@ObfuscatedName("cn.at")
	public int field908 = 0;

	@ObfuscatedName("cn.ac")
	public int[] field909 = new int[500];

	@ObfuscatedName("cn.ap")
	public int[] field911 = new int[500];

	@ObfuscatedName("cn.aq")
	public long[] field913 = new long[500];

	public void run() {
		while (this.field910) {
			Object var1 = this.field907;
			synchronized (this.field907) {
				if (this.field908 < 500) {
					this.field909[this.field908] = class36.field232;
					this.field911[this.field908] = class36.field221;
					this.field913[this.field908] = class36.field233;
					this.field908++;
				}
			}
			class336.method3770(50L);
		}
	}
}
