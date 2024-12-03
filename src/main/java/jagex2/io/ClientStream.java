package jagex2.io;

import deob.ObfuscatedName;
import jagex2.client.GameShell;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientStream implements Runnable {

	@ObfuscatedName("NQABEVLK.a")
	public int _flowObfuscator1 = -53;

	@ObfuscatedName("NQABEVLK.b")
	public boolean _flowObfuscator2 = true;

	@ObfuscatedName("NQABEVLK.c")
	public int _flowObfuscator3 = 519;

	@ObfuscatedName("NQABEVLK.g")
	public boolean dummy = false;

	@ObfuscatedName("NQABEVLK.l")
	public boolean writer = false;

	@ObfuscatedName("NQABEVLK.m")
	public boolean ioerror = false;

	@ObfuscatedName("NQABEVLK.h")
	public GameShell shell;

	@ObfuscatedName("NQABEVLK.f")
	public Socket socket;

	@ObfuscatedName("NQABEVLK.d")
	public InputStream in;

	@ObfuscatedName("NQABEVLK.e")
	public OutputStream out;

	@ObfuscatedName("NQABEVLK.j")
	public int tcyl;

	@ObfuscatedName("NQABEVLK.k")
	public int tnum;

	@ObfuscatedName("NQABEVLK.i")
	public byte[] data;

	public ClientStream(GameShell arg0, int arg1, Socket arg2) throws IOException {
		while (arg1 >= 0) {
			this._flowObfuscator2 = !this._flowObfuscator2;
		}
		this.shell = arg0;
		this.socket = arg2;
		this.socket.setSoTimeout(30000);
		this.socket.setTcpNoDelay(true);
		this.in = this.socket.getInputStream();
		this.out = this.socket.getOutputStream();
	}

	@ObfuscatedName("NQABEVLK.a()V")
	public void close() {
		this.dummy = true;
		try {
			if (this.in != null) {
				this.in.close();
			}
			if (this.out != null) {
				this.out.close();
			}
			if (this.socket != null) {
				this.socket.close();
			}
		} catch (IOException var3) {
			System.out.println("Error closing stream");
		}
		this.writer = false;
		synchronized (this) {
			this.notify();
		}
		this.data = null;
	}

	@ObfuscatedName("NQABEVLK.b()I")
	public int read() throws IOException {
		return this.dummy ? 0 : this.in.read();
	}

	@ObfuscatedName("NQABEVLK.c()I")
	public int available() throws IOException {
		return this.dummy ? 0 : this.in.available();
	}

	@ObfuscatedName("NQABEVLK.a([BII)V")
	public void read(byte[] arg0, int arg1, int arg2) throws IOException {
		if (this.dummy) {
			return;
		}
		while (arg2 > 0) {
			int var4 = this.in.read(arg0, arg1, arg2);
			if (var4 <= 0) {
				throw new IOException("EOF");
			}
			arg1 += var4;
			arg2 -= var4;
		}
	}

	@ObfuscatedName("NQABEVLK.a(II[BI)V")
	public void write(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
		if (this.dummy) {
			return;
		}
		if (this.ioerror) {
			this.ioerror = false;
			throw new IOException("Error in writer thread");
		}
		if (this.data == null) {
			this.data = new byte[5000];
		}
		synchronized (this) {
			for (int var6 = 0; var6 < arg0; var6++) {
				this.data[this.tnum] = arg2[arg3 + var6];
				this.tnum = (this.tnum + 1) % 5000;
				if ((this.tcyl + 4900) % 5000 == this.tnum) {
					throw new IOException("buffer overflow");
				}
			}
			if (!this.writer) {
				this.writer = true;
				this.shell.startThread(this, 3);
			}
			this.notify();
		}
		if (arg1 != 0) {
			this._flowObfuscator3 = 255;
		}
	}

	public void run() {
		while (this.writer) {
			int var2;
			int var3;
			label54: {
				synchronized (this) {
					if (this.tnum == this.tcyl) {
						try {
							this.wait();
						} catch (InterruptedException var7) {
						}
					}
					if (this.writer) {
						var2 = this.tcyl;
						if (this.tnum >= this.tcyl) {
							var3 = this.tnum - this.tcyl;
						} else {
							var3 = 5000 - this.tcyl;
						}
						break label54;
					}
				}
				return;
			}
			if (var3 > 0) {
				try {
					this.out.write(this.data, var2, var3);
				} catch (IOException var6) {
					this.ioerror = true;
				}
				this.tcyl = (this.tcyl + var3) % 5000;
				try {
					if (this.tnum == this.tcyl) {
						this.out.flush();
					}
				} catch (IOException var5) {
					this.ioerror = true;
				}
			}
		}
	}

	@ObfuscatedName("NQABEVLK.a(B)V")
	public void debug(byte arg0) {
		if (arg0 != 1) {
			this._flowObfuscator1 = 457;
		}
		System.out.println("dummy:" + this.dummy);
		System.out.println("tcycl:" + this.tcyl);
		System.out.println("tnum:" + this.tnum);
		System.out.println("writer:" + this.writer);
		System.out.println("ioerror:" + this.ioerror);
		try {
			System.out.println("available:" + this.available());
		} catch (IOException var2) {
		}
	}
}
