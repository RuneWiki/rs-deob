package jagex2.io;

import deob.ObfuscatedName;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("KNWRHOKF")
public final class FileStream {

	@ObfuscatedName("KNWRHOKF.h")
	public int field942 = 65000;

	@ObfuscatedName("KNWRHOKF.g")
	public int field941;

	@ObfuscatedName("KNWRHOKF.e")
	public RandomAccessFile field939;

	@ObfuscatedName("KNWRHOKF.f")
	public RandomAccessFile field940;

	@ObfuscatedName("KNWRHOKF.d")
	public static byte[] field938 = new byte[520];

	public FileStream(int arg0, int arg1, RandomAccessFile arg2, RandomAccessFile arg3) {
		field941 = arg0;
		field939 = arg2;
		field940 = arg3;
		field942 = arg1;
	}

	@ObfuscatedName("KNWRHOKF.a(BI)[B")
	public synchronized byte[] method325(int arg0) {
		try {
			method328(arg0 * 6, field940);
			int var3;
			for (int var2 = 0; var2 < 6; var2 += var3) {
				var3 = field940.read(field938, var2, 6 - var2);
				if (var3 == -1) {
					return null;
				}
			}

			int var4 = (field938[2] & 0xFF) + ((field938[0] & 0xFF) << 16) + ((field938[1] & 0xFF) << 8);
			int var5 = (field938[5] & 0xFF) + ((field938[3] & 0xFF) << 16) + ((field938[4] & 0xFF) << 8);
			if (var4 >= 0 && var4 <= field942) {
				if (var5 > 0 && var5 <= field939.length() / 520L) {
					byte[] var6 = new byte[var4];
					int var7 = 0;
					int var8 = 0;
					while (var7 < var4) {
						if (var5 == 0) {
							return null;
						}

						method328(var5 * 520, field939);
						int var9 = 0;
						int var10 = var4 - var7;
						if (var10 > 512) {
							var10 = 512;
						}

						while (var9 < var10 + 8) {
							int var11 = field939.read(field938, var9, var10 + 8 - var9);
							if (var11 == -1) {
								return null;
							}

							var9 += var11;
						}

						int var12 = ((field938[0] & 0xFF) << 8) + (field938[1] & 0xFF);
						int var13 = ((field938[2] & 0xFF) << 8) + (field938[3] & 0xFF);
						int var14 = (field938[6] & 0xFF) + ((field938[4] & 0xFF) << 16) + ((field938[5] & 0xFF) << 8);
						int var15 = field938[7] & 0xFF;
						if (arg0 == var12 && var8 == var13 && field941 == var15) {
							if (var14 >= 0 && var14 <= field939.length() / 520L) {
								for (int var16 = 0; var16 < var10; var16++) {
									var6[var7++] = field938[var16 + 8];
								}

								var5 = var14;
								var8++;
								continue;
							}

							return null;
						}

						return null;
					}

					return var6;
				}

				return null;
			}

			return null;
		} catch (IOException var17) {
			return null;
		}
	}

	@ObfuscatedName("KNWRHOKF.a(IZ[BI)Z")
	public synchronized boolean method326(int arg0, byte[] arg1, int arg2) {
		boolean var4 = method327(arg1, arg2, true, arg0);
		if (!var4) {
			var4 = method327(arg1, arg2, false, arg0);
		}

		return var4;
	}

	@ObfuscatedName("KNWRHOKF.a([BIIZI)Z")
	public synchronized boolean method327(byte[] arg0, int arg1, boolean arg2, int arg3) {
		try {
			int var7;
			if (arg2) {
				method328(arg1 * 6, field940);
				int var6;
				for (int var5 = 0; var5 < 6; var5 += var6) {
					var6 = field940.read(field938, var5, 6 - var5);
					if (var6 == -1) {
						return false;
					}
				}

				var7 = (field938[5] & 0xFF) + ((field938[3] & 0xFF) << 16) + ((field938[4] & 0xFF) << 8);
				if (var7 <= 0 || var7 > field939.length() / 520L) {
					return false;
				}
			} else {
				var7 = (int) ((field939.length() + 519L) / 520L);
				if (var7 == 0) {
					var7 = 1;
				}
			}

			field938[0] = (byte) (arg3 >> 16);
			field938[1] = (byte) (arg3 >> 8);
			field938[2] = (byte) arg3;
			field938[3] = (byte) (var7 >> 16);
			field938[4] = (byte) (var7 >> 8);
			field938[5] = (byte) var7;
			method328(arg1 * 6, field940);
			field940.write(field938, 0, 6);
			int var8 = 0;
			int var9 = 0;
			while (var8 < arg3) {
				int var10 = 0;
				if (arg2) {
					method328(var7 * 520, field939);
					int var11;
					int var12;
					for (var11 = 0; var11 < 8; var11 += var12) {
						var12 = field939.read(field938, var11, 8 - var11);
						if (var12 == -1) {
							break;
						}
					}

					if (var11 == 8) {
						int var13 = ((field938[0] & 0xFF) << 8) + (field938[1] & 0xFF);
						int var14 = ((field938[2] & 0xFF) << 8) + (field938[3] & 0xFF);
						var10 = (field938[6] & 0xFF) + ((field938[4] & 0xFF) << 16) + ((field938[5] & 0xFF) << 8);
						int var15 = field938[7] & 0xFF;
						if (arg1 != var13 || var9 != var14 || field941 != var15) {
							return false;
						}

						if (var10 < 0 || var10 > field939.length() / 520L) {
							return false;
						}
					}
				}

				if (var10 == 0) {
					arg2 = false;
					var10 = (int) ((field939.length() + 519L) / 520L);
					if (var10 == 0) {
						var10++;
					}

					if (var7 == var10) {
						var10++;
					}
				}

				if (arg3 - var8 <= 512) {
					var10 = 0;
				}

				field938[0] = (byte) (arg1 >> 8);
				field938[1] = (byte) arg1;
				field938[2] = (byte) (var9 >> 8);
				field938[3] = (byte) var9;
				field938[4] = (byte) (var10 >> 16);
				field938[5] = (byte) (var10 >> 8);
				field938[6] = (byte) var10;
				field938[7] = (byte) field941;
				method328(var7 * 520, field939);
				field939.write(field938, 0, 8);
				int var16 = arg3 - var8;
				if (var16 > 512) {
					var16 = 512;
				}

				field939.write(arg0, var8, var16);
				var8 += var16;
				var7 = var10;
				var9++;
			}

			return true;
		} catch (IOException var17) {
			return false;
		}
	}

	@ObfuscatedName("KNWRHOKF.a(ZILjava/io/RandomAccessFile;)V")
	public synchronized void method328(int arg0, RandomAccessFile arg1) throws IOException {
		if (arg0 < 0 || arg0 > 62914560) {
			System.out.println("Badseek - pos:" + arg0 + " len:" + arg1.length());
			arg0 = 62914560;

			try {
				Thread.sleep(1000L);
			} catch (Exception var3) {
			}
		}

		arg1.seek(arg0);
	}
}
