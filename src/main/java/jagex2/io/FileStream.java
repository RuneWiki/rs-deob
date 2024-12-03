package jagex2.io;

import deob.ObfuscatedName;
import java.io.IOException;
import java.io.RandomAccessFile;

public class FileStream {

	@ObfuscatedName("IGSLDTHC.a")
	public int _flowObfuscator1 = 923;

	@ObfuscatedName("IGSLDTHC.b")
	public boolean _flowObfuscator2 = true;

	@ObfuscatedName("IGSLDTHC.g")
	public int maxFileSize = 65000;

	@ObfuscatedName("IGSLDTHC.f")
	public int archive;

	@ObfuscatedName("IGSLDTHC.d")
	public RandomAccessFile dat;

	@ObfuscatedName("IGSLDTHC.e")
	public RandomAccessFile idx;

	@ObfuscatedName("IGSLDTHC.c")
	public static byte[] temp = new byte[520];

	public FileStream(int arg0, RandomAccessFile arg1, RandomAccessFile arg2, int arg3, boolean arg4) {
		this.archive = arg3;
		if (!arg4) {
			throw new NullPointerException();
		}
		this.dat = arg1;
		this.idx = arg2;
		this.maxFileSize = arg0;
	}

	@ObfuscatedName("IGSLDTHC.a(ZI)[B")
	public synchronized byte[] read(boolean arg0, int arg1) {
		if (!arg0) {
			throw new NullPointerException();
		}
		try {
			this.seek(this.idx, -660, arg1 * 6);
			int var4;
			for (int var3 = 0; var3 < 6; var3 += var4) {
				var4 = this.idx.read(temp, var3, 6 - var3);
				if (var4 == -1) {
					return null;
				}
			}
			int var5 = (temp[2] & 0xFF) + ((temp[0] & 0xFF) << 16) + ((temp[1] & 0xFF) << 8);
			int var6 = (temp[5] & 0xFF) + ((temp[3] & 0xFF) << 16) + ((temp[4] & 0xFF) << 8);
			if (var5 < 0 || var5 > this.maxFileSize) {
				return null;
			} else if (var6 > 0 && (long) var6 <= this.dat.length() / 520L) {
				byte[] var7 = new byte[var5];
				int var8 = 0;
				int var9 = 0;
				while (var8 < var5) {
					if (var6 == 0) {
						return null;
					}
					this.seek(this.dat, -660, var6 * 520);
					int var10 = 0;
					int var11 = var5 - var8;
					if (var11 > 512) {
						var11 = 512;
					}
					while (var10 < var11 + 8) {
						int var12 = this.dat.read(temp, var10, var11 + 8 - var10);
						if (var12 == -1) {
							return null;
						}
						var10 += var12;
					}
					int var13 = ((temp[0] & 0xFF) << 8) + (temp[1] & 0xFF);
					int var14 = ((temp[2] & 0xFF) << 8) + (temp[3] & 0xFF);
					int var15 = (temp[6] & 0xFF) + ((temp[4] & 0xFF) << 16) + ((temp[5] & 0xFF) << 8);
					int var16 = temp[7] & 0xFF;
					if (arg1 == var13 && var9 == var14 && this.archive == var16) {
						if (var15 >= 0 && (long) var15 <= this.dat.length() / 520L) {
							for (int var17 = 0; var17 < var11; var17++) {
								var7[var8++] = temp[var17 + 8];
							}
							var6 = var15;
							var9++;
							continue;
						}
						return null;
					}
					return null;
				}
				return var7;
			} else {
				return null;
			}
		} catch (IOException var18) {
			return null;
		}
	}

	@ObfuscatedName("IGSLDTHC.a(I[BBI)Z")
	public synchronized boolean write(int arg0, byte[] arg1, byte arg2, int arg3) {
		boolean var5 = this.write(true, 923, arg3, arg0, arg1);
		if (arg2 == 2) {
			boolean var6 = false;
		} else {
			this._flowObfuscator2 = !this._flowObfuscator2;
		}
		if (!var5) {
			var5 = this.write(false, 923, arg3, arg0, arg1);
		}
		return var5;
	}

	@ObfuscatedName("IGSLDTHC.a(ZIII[B)Z")
	public synchronized boolean write(boolean arg0, int arg1, int arg2, int arg3, byte[] arg4) {
		int var6 = 27 / arg1;
		try {
			int var9;
			if (arg0) {
				this.seek(this.idx, -660, arg2 * 6);
				int var8;
				for (int var7 = 0; var7 < 6; var7 += var8) {
					var8 = this.idx.read(temp, var7, 6 - var7);
					if (var8 == -1) {
						return false;
					}
				}
				var9 = (temp[5] & 0xFF) + ((temp[3] & 0xFF) << 16) + ((temp[4] & 0xFF) << 8);
				if (var9 <= 0 || (long) var9 > this.dat.length() / 520L) {
					return false;
				}
			} else {
				var9 = (int) ((this.dat.length() + 519L) / 520L);
				if (var9 == 0) {
					var9 = 1;
				}
			}
			temp[0] = (byte) (arg3 >> 16);
			temp[1] = (byte) (arg3 >> 8);
			temp[2] = (byte) arg3;
			temp[3] = (byte) (var9 >> 16);
			temp[4] = (byte) (var9 >> 8);
			temp[5] = (byte) var9;
			this.seek(this.idx, -660, arg2 * 6);
			this.idx.write(temp, 0, 6);
			int var10 = 0;
			int var11 = 0;
			while (var10 < arg3) {
				int var12 = 0;
				if (arg0) {
					this.seek(this.dat, -660, var9 * 520);
					int var13;
					int var14;
					for (var13 = 0; var13 < 8; var13 += var14) {
						var14 = this.dat.read(temp, var13, 8 - var13);
						if (var14 == -1) {
							break;
						}
					}
					if (var13 == 8) {
						label108: {
							int var15 = ((temp[0] & 0xFF) << 8) + (temp[1] & 0xFF);
							int var16 = ((temp[2] & 0xFF) << 8) + (temp[3] & 0xFF);
							var12 = (temp[6] & 0xFF) + ((temp[4] & 0xFF) << 16) + ((temp[5] & 0xFF) << 8);
							int var17 = temp[7] & 0xFF;
							if (arg2 == var15 && var11 == var16 && this.archive == var17) {
								if (var12 >= 0 && (long) var12 <= this.dat.length() / 520L) {
									break label108;
								}
								return false;
							}
							return false;
						}
					}
				}
				if (var12 == 0) {
					arg0 = false;
					var12 = (int) ((this.dat.length() + 519L) / 520L);
					if (var12 == 0) {
						var12++;
					}
					if (var9 == var12) {
						var12++;
					}
				}
				if (arg3 - var10 <= 512) {
					var12 = 0;
				}
				temp[0] = (byte) (arg2 >> 8);
				temp[1] = (byte) arg2;
				temp[2] = (byte) (var11 >> 8);
				temp[3] = (byte) var11;
				temp[4] = (byte) (var12 >> 16);
				temp[5] = (byte) (var12 >> 8);
				temp[6] = (byte) var12;
				temp[7] = (byte) this.archive;
				this.seek(this.dat, -660, var9 * 520);
				this.dat.write(temp, 0, 8);
				int var18 = arg3 - var10;
				if (var18 > 512) {
					var18 = 512;
				}
				this.dat.write(arg4, var10, var18);
				var10 += var18;
				var9 = var12;
				var11++;
			}
			return true;
		} catch (IOException var19) {
			return false;
		}
	}

	@ObfuscatedName("IGSLDTHC.a(Ljava/io/RandomAccessFile;II)V")
	public synchronized void seek(RandomAccessFile arg0, int arg1, int arg2) throws IOException {
		if (arg1 >= 0) {
			return;
		}
		if (arg2 < 0 || arg2 > 62914560) {
			System.out.println("Badseek - pos:" + arg2 + " len:" + arg0.length());
			arg2 = 62914560;
			try {
				Thread.sleep(1000L);
			} catch (Exception var4) {
			}
		}
		arg0.seek((long) arg2);
	}
}
