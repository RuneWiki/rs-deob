package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;

@ObfuscatedName("vx")
public class class566 {

	@ObfuscatedName("vx.af")
	public final File field5789;

	@ObfuscatedName("vx.aw")
	public final long field5790;

	@ObfuscatedName("vx.at")
	public RandomAccessFile field5791;

	@ObfuscatedName("vx.ac")
	public long field5792;

	public class566(File arg0, String arg1, long arg2) throws IOException {
		if (arg2 == -1L) {
			arg2 = Long.MAX_VALUE;
		}
		if (arg0.length() > arg2) {
			arg0.delete();
		}
		this.field5791 = new RandomAccessFile(arg0, arg1);
		this.field5789 = arg0;
		this.field5790 = arg2;
		this.field5792 = 0L;
		int var5 = this.field5791.read();
		if (var5 != -1 && !arg1.equals("r")) {
			this.field5791.seek(0L);
			this.field5791.write(var5);
		}
		this.field5791.seek(0L);
	}

	@ObfuscatedName("vx.af(I)Ljava/io/File;")
	public final File method10064() {
		return this.field5789;
	}

	@ObfuscatedName("vx.aw(J)V")
	public final void method10065(long arg0) throws IOException {
		this.field5791.seek(arg0);
		this.field5792 = arg0;
	}

	@ObfuscatedName("vx.at([BIIB)V")
	public final void method10085(byte[] arg0, int arg1, int arg2) throws IOException {
		if (this.field5792 + (long) arg2 > this.field5790) {
			this.field5791.seek(this.field5790);
			this.field5791.write(1);
			throw new EOFException();
		} else {
			this.field5791.write(arg0, arg1, arg2);
			this.field5792 += arg2;
		}
	}

	@ObfuscatedName("vx.ac(B)V")
	public final void method10067() throws IOException {
		this.method10068(false);
	}

	@ObfuscatedName("vx.ap(ZI)V")
	public final void method10068(boolean arg0) throws IOException {
		if (this.field5791 == null) {
			return;
		}
		if (arg0) {
			try {
				this.field5791.getFD().sync();
			} catch (SyncFailedException var3) {
			}
		}
		this.field5791.close();
		this.field5791 = null;
	}

	@ObfuscatedName("vx.aq(I)J")
	public final long method10081() throws IOException {
		return this.field5791.length();
	}

	@ObfuscatedName("vx.ao([BIIB)I")
	public final int method10070(byte[] arg0, int arg1, int arg2) throws IOException {
		int var4 = this.field5791.read(arg0, arg1, arg2);
		if (var4 > 0) {
			this.field5792 += var4;
		}
		return var4;
	}

	public void finalize() throws Throwable {
		if (this.field5791 != null) {
			this.method10067();
		}
	}
}
