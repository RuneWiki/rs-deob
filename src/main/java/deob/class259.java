package deob;

import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

@ObfuscatedName("jh")
public class class259 implements Runnable {

	@ObfuscatedName("jh.aq")
	public class267 field3094 = null;

	@ObfuscatedName("jh.ao")
	public class267 field3091 = null;

	@ObfuscatedName("jh.as")
	public Thread field3090;

	@ObfuscatedName("jh.al")
	public boolean field3095 = false;

	public class259() {
		Statics.field3093 = "Unknown";
		Statics.field1589 = "1.6";
		try {
			Statics.field3093 = System.getProperty("java.vendor");
			Statics.field1589 = System.getProperty("java.version");
		} catch (Exception var2) {
		}
		this.field3095 = false;
		this.field3090 = new Thread(this);
		this.field3090.setPriority(10);
		this.field3090.setDaemon(true);
		this.field3090.start();
	}

	@ObfuscatedName("jh.af(I)V")
	public final void method5507() {
		synchronized (this) {
			this.field3095 = true;
			this.notifyAll();
		}
		try {
			this.field3090.join();
		} catch (InterruptedException var4) {
		}
	}

	public final void run() {
		while (true) {
			class267 var2;
			synchronized (this) {
				while (true) {
					if (this.field3095) {
						return;
					}
					if (this.field3094 != null) {
						var2 = this.field3094;
						this.field3094 = this.field3094.field3158;
						if (this.field3094 == null) {
							this.field3091 = null;
						}
						break;
					}
					try {
						this.wait();
					} catch (InterruptedException var11) {
					}
				}
			}
			try {
				int var5 = var2.field3159;
				if (var5 == 1) {
					var2.field3156 = new Socket(InetAddress.getByName((String) var2.field3160), var2.field3153);
				} else if (var5 == 2) {
					Thread var6 = new Thread((Runnable) var2.field3160);
					var6.setDaemon(true);
					var6.start();
					var6.setPriority(var2.field3153);
					var2.field3156 = var6;
				} else if (var5 == 4) {
					var2.field3156 = new DataInputStream(((URL) var2.field3160).openStream());
				}
				var2.field3155 = 1;
			} catch (ThreadDeath var9) {
				throw var9;
			} catch (Throwable var10) {
				var2.field3155 = 2;
			}
		}
	}

	@ObfuscatedName("jh.aw(IIILjava/lang/Object;B)Lku;")
	public final class267 method5508(int arg0, int arg1, int arg2, Object arg3) {
		class267 var5 = new class267();
		var5.field3159 = arg0;
		var5.field3153 = arg1;
		var5.field3160 = arg3;
		synchronized (this) {
			if (this.field3091 == null) {
				this.field3091 = this.field3094 = var5;
			} else {
				this.field3091.field3158 = var5;
				this.field3091 = var5;
			}
			this.notify();
			return var5;
		}
	}

	@ObfuscatedName("jh.at(Ljava/lang/String;II)Lku;")
	public final class267 method5504(String arg0, int arg1) {
		return this.method5508(1, arg1, 0, arg0);
	}

	@ObfuscatedName("jh.ac(Ljava/lang/Runnable;II)Lku;")
	public final class267 method5505(Runnable arg0, int arg1) {
		return this.method5508(2, arg1, 0, arg0);
	}
}
