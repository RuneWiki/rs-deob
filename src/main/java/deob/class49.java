package deob;

import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("wb")
public final class class49 {

	@ObfuscatedName("wb.c")
	public static byte[] field751 = new byte[520];

	@ObfuscatedName("wb.d")
	public RandomAccessFile field752;

	@ObfuscatedName("wb.e")
	public RandomAccessFile field753;

	@ObfuscatedName("wb.f")
	public int field754;

	@ObfuscatedName("wb.g")
	public int field755 = 65000;

	public class49(RandomAccessFile arg0, int arg1, RandomAccessFile arg2, int arg3) {
		field754 = arg3;
		field752 = arg0;
		field753 = arg2;
		field755 = arg1;
	}

	@ObfuscatedName("wb.a(BI)[B")
	public synchronized byte[] method290(int arg0) {
		try {
			method293(field753, arg0 * 6);
			int var3;
			for (int var2 = 0; var2 < 6; var2 += var3) {
				var3 = field753.read(field751, var2, 6 - var2);
				if (var3 == -1) {
					return null;
				}
			}

			int var4 = (field751[2] & 0xFF) + ((field751[0] & 0xFF) << 16) + ((field751[1] & 0xFF) << 8);
			int var5 = (field751[5] & 0xFF) + ((field751[3] & 0xFF) << 16) + ((field751[4] & 0xFF) << 8);
			if (var4 >= 0 && var4 <= field755) {
				if (var5 > 0 && var5 <= field752.length() / 520L) {
					byte[] var6 = new byte[var4];
					int var7 = 0;
					int var8 = 0;
					while (var7 < var4) {
						if (var5 == 0) {
							return null;
						}

						method293(field752, var5 * 520);
						int var9 = 0;
						int var10 = var4 - var7;
						if (var10 > 512) {
							var10 = 512;
						}

						while (var9 < var10 + 8) {
							int var11 = field752.read(field751, var9, var10 + 8 - var9);
							if (var11 == -1) {
								return null;
							}

							var9 += var11;
						}

						int var12 = ((field751[0] & 0xFF) << 8) + (field751[1] & 0xFF);
						int var13 = ((field751[2] & 0xFF) << 8) + (field751[3] & 0xFF);
						int var14 = (field751[6] & 0xFF) + ((field751[4] & 0xFF) << 16) + ((field751[5] & 0xFF) << 8);
						int var15 = field751[7] & 0xFF;
						if (arg0 == var12 && var8 == var13 && field754 == var15) {
							if (var14 >= 0 && var14 <= field752.length() / 520L) {
								for (int var16 = 0; var16 < var10; var16++) {
									var6[var7++] = field751[var16 + 8];
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

	@ObfuscatedName("wb.a([BZII)Z")
	public synchronized boolean method291(byte[] arg0, int arg1, int arg2) {
		boolean var4 = method292(arg2, true, arg1, arg0);
		if (!var4) {
			var4 = method292(arg2, false, arg1, arg0);
		}

		return var4;
	}

	@ObfuscatedName("wb.a(IIZI[B)Z")
	public synchronized boolean method292(int arg0, boolean arg1, int arg2, byte[] arg3) {
		try {
			int var7;
			if (arg1) {
				method293(field753, arg2 * 6);
				int var6;
				for (int var5 = 0; var5 < 6; var5 += var6) {
					var6 = field753.read(field751, var5, 6 - var5);
					if (var6 == -1) {
						return false;
					}
				}

				var7 = (field751[5] & 0xFF) + ((field751[3] & 0xFF) << 16) + ((field751[4] & 0xFF) << 8);
				if (var7 <= 0 || var7 > field752.length() / 520L) {
					return false;
				}
			} else {
				var7 = (int) ((field752.length() + 519L) / 520L);
				if (var7 == 0) {
					var7 = 1;
				}
			}

			field751[0] = (byte) (arg0 >> 16);
			field751[1] = (byte) (arg0 >> 8);
			field751[2] = (byte) arg0;
			field751[3] = (byte) (var7 >> 16);
			field751[4] = (byte) (var7 >> 8);
			field751[5] = (byte) var7;
			method293(field753, arg2 * 6);
			field753.write(field751, 0, 6);
			int var8 = 0;
			int var9 = 0;
			while (var8 < arg0) {
				int var10 = 0;
				if (arg1) {
					method293(field752, var7 * 520);
					int var11;
					int var12;
					for (var11 = 0; var11 < 8; var11 += var12) {
						var12 = field752.read(field751, var11, 8 - var11);
						if (var12 == -1) {
							break;
						}
					}

					if (var11 == 8) {
						int var13 = ((field751[0] & 0xFF) << 8) + (field751[1] & 0xFF);
						int var14 = ((field751[2] & 0xFF) << 8) + (field751[3] & 0xFF);
						var10 = (field751[6] & 0xFF) + ((field751[4] & 0xFF) << 16) + ((field751[5] & 0xFF) << 8);
						int var15 = field751[7] & 0xFF;
						if (arg2 != var13 || var9 != var14 || field754 != var15) {
							return false;
						}

						if (var10 < 0 || var10 > field752.length() / 520L) {
							return false;
						}
					}
				}

				if (var10 == 0) {
					arg1 = false;
					var10 = (int) ((field752.length() + 519L) / 520L);
					if (var10 == 0) {
						var10++;
					}

					if (var7 == var10) {
						var10++;
					}
				}

				if (arg0 - var8 <= 512) {
					var10 = 0;
				}

				field751[0] = (byte) (arg2 >> 8);
				field751[1] = (byte) arg2;
				field751[2] = (byte) (var9 >> 8);
				field751[3] = (byte) var9;
				field751[4] = (byte) (var10 >> 16);
				field751[5] = (byte) (var10 >> 8);
				field751[6] = (byte) var10;
				field751[7] = (byte) field754;
				method293(field752, var7 * 520);
				field752.write(field751, 0, 8);
				int var16 = arg0 - var8;
				if (var16 > 512) {
					var16 = 512;
				}

				field752.write(arg3, var8, var16);
				var8 += var16;
				var7 = var10;
				var9++;
			}

			return true;
		} catch (IOException var17) {
			return false;
		}
	}

	@ObfuscatedName("wb.a(Ljava/io/RandomAccessFile;BI)V")
	public synchronized void method293(RandomAccessFile arg0, int arg1) throws IOException {
		if (arg1 < 0 || arg1 > 62914560) {
			System.out.println("Badseek - pos:" + arg1 + " len:" + arg0.length());
			arg1 = 62914560;

			try {
				Thread.sleep(1000L);
			} catch (Exception var3) {
			}
		}

		arg0.seek(arg1);
	}
}
