package deob;

import java.io.IOException;
import java.io.OutputStream;

@ObfuscatedName("tx")
public class class515 implements Runnable {

	@ObfuscatedName("tx.af")
	public Thread field5466;

	@ObfuscatedName("tx.aw")
	public OutputStream field5461;

	@ObfuscatedName("tx.at")
	public int field5462;

	@ObfuscatedName("tx.ac")
	public byte[] field5460;

	@ObfuscatedName("tx.ap")
	public int field5465 = 0;

	@ObfuscatedName("tx.aq")
	public int field5463 = 0;

	@ObfuscatedName("tx.ao")
	public IOException field5464;

	@ObfuscatedName("tx.as")
	public boolean field5467;

	public class515(OutputStream arg0, int arg1) {
		this.field5461 = arg0;
		this.field5462 = arg1 + 1;
		this.field5460 = new byte[this.field5462];
		this.field5466 = new Thread(this);
		this.field5466.setDaemon(true);
		this.field5466.start();
	}

	@ObfuscatedName("tx.af(B)Z")
	public boolean method9475() {
		if (!this.field5467) {
			return false;
		}
		try {
			this.field5461.close();
			if (this.field5464 == null) {
				this.field5464 = new IOException("");
			}
		} catch (IOException var2) {
			if (this.field5464 == null) {
				this.field5464 = new IOException(var2);
			}
		}
		return true;
	}

	public void run() {
		do {
			int var2;
			synchronized (this) {
				while (true) {
					if (this.field5464 != null) {
						return;
					}
					if (this.field5465 <= this.field5463) {
						var2 = this.field5463 - this.field5465;
					} else {
						var2 = this.field5463 + (this.field5462 - this.field5465);
					}
					if (var2 > 0) {
						break;
					}
					try {
						this.field5461.flush();
					} catch (IOException var15) {
						this.field5464 = var15;
						return;
					}
					if (this.method9475()) {
						return;
					}
					try {
						this.wait();
					} catch (InterruptedException var16) {
					}
				}
			}
			try {
				if (this.field5465 + var2 <= this.field5462) {
					this.field5461.write(this.field5460, this.field5465, var2);
				} else {
					int var6 = this.field5462 - this.field5465;
					this.field5461.write(this.field5460, this.field5465, var6);
					this.field5461.write(this.field5460, 0, var2 - var6);
				}
			} catch (IOException var14) {
				IOException var7 = var14;
				synchronized (this) {
					this.field5464 = var7;
					return;
				}
			}
			synchronized (this) {
				this.field5465 = (this.field5465 + var2) % this.field5462;
			}
		} while (!this.method9475());
	}

	@ObfuscatedName("tx.aw([BIIB)V")
	public void method9485(byte[] arg0, int arg1, int arg2) throws IOException {
		if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
			throw new IOException();
		}
		synchronized (this) {
			if (this.field5464 != null) {
				throw new IOException(this.field5464.toString());
			}
			int var5;
			if (this.field5465 <= this.field5463) {
				var5 = this.field5465 + (this.field5462 - this.field5463) - 1;
			} else {
				var5 = this.field5465 - this.field5463 - 1;
			}
			if (var5 < arg2) {
				throw new IOException("");
			}
			if (this.field5463 + arg2 <= this.field5462) {
				System.arraycopy(arg0, arg1, this.field5460, this.field5463, arg2);
			} else {
				int var6 = this.field5462 - this.field5463;
				System.arraycopy(arg0, arg1, this.field5460, this.field5463, var6);
				System.arraycopy(arg0, arg1 + var6, this.field5460, 0, arg2 - var6);
			}
			this.field5463 = (this.field5463 + arg2) % this.field5462;
			this.notifyAll();
		}
	}

	@ObfuscatedName("tx.at(I)V")
	public void method9477() {
		synchronized (this) {
			this.field5467 = true;
			this.notifyAll();
		}
		try {
			this.field5466.join();
		} catch (InterruptedException var4) {
		}
	}
}
