package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

@ObfuscatedName("te")
public class class514 implements Runnable {

	@ObfuscatedName("te.af")
	public Thread field5454;

	@ObfuscatedName("te.aw")
	public InputStream field5453;

	@ObfuscatedName("te.at")
	public int field5457;

	@ObfuscatedName("te.ac")
	public byte[] field5452;

	@ObfuscatedName("te.ap")
	public int field5455 = 0;

	@ObfuscatedName("te.aq")
	public int field5456 = 0;

	@ObfuscatedName("te.ao")
	public IOException field5458;

	public class514(InputStream arg0, int arg1) {
		this.field5453 = arg0;
		this.field5457 = arg1 + 1;
		this.field5452 = new byte[this.field5457];
		this.field5454 = new Thread(this);
		this.field5454.setDaemon(true);
		this.field5454.start();
	}

	public void run() {
		while (true) {
			int var2;
			synchronized (this) {
				while (true) {
					if (this.field5458 != null) {
						return;
					}
					if (this.field5455 == 0) {
						var2 = this.field5457 - this.field5456 - 1;
					} else if (this.field5455 <= this.field5456) {
						var2 = this.field5457 - this.field5456;
					} else {
						var2 = this.field5455 - this.field5456 - 1;
					}
					if (var2 > 0) {
						break;
					}
					try {
						this.wait();
					} catch (InterruptedException var13) {
					}
				}
			}
			int var5;
			try {
				var5 = this.field5453.read(this.field5452, this.field5456, var2);
				if (var5 == -1) {
					throw new EOFException();
				}
			} catch (IOException var14) {
				IOException var6 = var14;
				synchronized (this) {
					this.field5458 = var6;
					return;
				}
			}
			synchronized (this) {
				this.field5456 = (this.field5456 + var5) % this.field5457;
			}
		}
	}

	@ObfuscatedName("te.af(II)Z")
	public boolean method9460(int arg0) throws IOException {
		if (arg0 == 0) {
			return true;
		} else if (arg0 > 0 && arg0 < this.field5457) {
			synchronized (this) {
				int var3;
				if (this.field5455 <= this.field5456) {
					var3 = this.field5456 - this.field5455;
				} else {
					var3 = this.field5456 + (this.field5457 - this.field5455);
				}
				if (var3 >= arg0) {
					return true;
				} else if (this.field5458 == null) {
					this.notifyAll();
					return false;
				} else {
					throw new IOException(this.field5458.toString());
				}
			}
		} else {
			throw new IOException();
		}
	}

	@ObfuscatedName("te.aw(I)I")
	public int method9452() throws IOException {
		synchronized (this) {
			int var2;
			if (this.field5455 <= this.field5456) {
				var2 = this.field5456 - this.field5455;
			} else {
				var2 = this.field5456 + (this.field5457 - this.field5455);
			}
			if (var2 <= 0 && this.field5458 != null) {
				throw new IOException(this.field5458.toString());
			}
			this.notifyAll();
			return var2;
		}
	}

	@ObfuscatedName("te.at(I)I")
	public int method9454() throws IOException {
		synchronized (this) {
			if (this.field5456 != this.field5455) {
				int var2 = this.field5452[this.field5455] & 0xFF;
				this.field5455 = (this.field5455 + 1) % this.field5457;
				this.notifyAll();
				return var2;
			} else if (this.field5458 == null) {
				return -1;
			} else {
				throw new IOException(this.field5458.toString());
			}
		}
	}

	@ObfuscatedName("te.ac([BIIB)I")
	public int method9471(byte[] arg0, int arg1, int arg2) throws IOException {
		if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
			throw new IOException();
		}
		synchronized (this) {
			int var5;
			if (this.field5455 <= this.field5456) {
				var5 = this.field5456 - this.field5455;
			} else {
				var5 = this.field5456 + (this.field5457 - this.field5455);
			}
			if (arg2 > var5) {
				arg2 = var5;
			}
			if (arg2 == 0 && this.field5458 != null) {
				throw new IOException(this.field5458.toString());
			}
			if (this.field5455 + arg2 <= this.field5457) {
				System.arraycopy(this.field5452, this.field5455, arg0, arg1, arg2);
			} else {
				int var6 = this.field5457 - this.field5455;
				System.arraycopy(this.field5452, this.field5455, arg0, arg1, var6);
				System.arraycopy(this.field5452, 0, arg0, arg1 + var6, arg2 - var6);
			}
			this.field5455 = (this.field5455 + arg2) % this.field5457;
			this.notifyAll();
			return arg2;
		}
	}

	@ObfuscatedName("te.ap(I)V")
	public void method9456() {
		synchronized (this) {
			if (this.field5458 == null) {
				this.field5458 = new IOException("");
			}
			this.notifyAll();
		}
		try {
			this.field5454.join();
		} catch (InterruptedException var4) {
		}
	}
}
