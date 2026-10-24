package deob;

import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("wb")
public final class class49 {

	@ObfuscatedName("wb.b")
	public static byte[] field734 = new byte[520];

	@ObfuscatedName("wb.c")
	public RandomAccessFile field735;

	@ObfuscatedName("wb.d")
	public RandomAccessFile field736;

	@ObfuscatedName("wb.e")
	public int field737;

	@ObfuscatedName("wb.f")
	public int field738 = 65000;

	public class49(int arg0, RandomAccessFile arg1, int arg2, RandomAccessFile arg3) {
		field737 = arg2;
		field735 = arg1;
		field736 = arg3;
		field738 = arg0;
	}

	@ObfuscatedName("wb.a(II)[B")
	public synchronized byte[] method291(int arg0) {
		try {
			method294(field736, arg0 * 6);
			int var3;
			for (int var2 = 0; var2 < 6; var2 += var3) {
				var3 = field736.read(field734, var2, 6 - var2);
				if (var3 == -1) {
					return null;
				}
			}

			int var4 = (field734[2] & 0xFF) + ((field734[0] & 0xFF) << 16) + ((field734[1] & 0xFF) << 8);
			int var5 = (field734[5] & 0xFF) + ((field734[3] & 0xFF) << 16) + ((field734[4] & 0xFF) << 8);
			if (var4 >= 0 && var4 <= field738) {
				if (var5 > 0 && var5 <= field735.length() / 520L) {
					byte[] var6 = new byte[var4];
					int var7 = 0;
					int var8 = 0;
					while (var7 < var4) {
						if (var5 == 0) {
							return null;
						}

						method294(field735, var5 * 520);
						int var9 = 0;
						int var10 = var4 - var7;
						if (var10 > 512) {
							var10 = 512;
						}

						while (var9 < var10 + 8) {
							int var11 = field735.read(field734, var9, var10 + 8 - var9);
							if (var11 == -1) {
								return null;
							}

							var9 += var11;
						}

						int var12 = ((field734[0] & 0xFF) << 8) + (field734[1] & 0xFF);
						int var13 = ((field734[2] & 0xFF) << 8) + (field734[3] & 0xFF);
						int var14 = (field734[6] & 0xFF) + ((field734[4] & 0xFF) << 16) + ((field734[5] & 0xFF) << 8);
						int var15 = field734[7] & 0xFF;
						if (arg0 == var12 && var8 == var13 && field737 == var15) {
							if (var14 >= 0 && var14 <= field735.length() / 520L) {
								for (int var16 = 0; var16 < var10; var16++) {
									var6[var7++] = field734[var16 + 8];
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

	@ObfuscatedName("wb.a(II[BB)Z")
	public synchronized boolean method292(int arg0, int arg1, byte[] arg2) {
		boolean var4 = method293(true, arg2, arg1, arg0);
		if (!var4) {
			var4 = method293(false, arg2, arg1, arg0);
		}

		return var4;
	}

	@ObfuscatedName("wb.a(Z[BIII)Z")
	public synchronized boolean method293(boolean arg0, byte[] arg1, int arg2, int arg3) {
		try {
			int var7;
			if (arg0) {
				method294(field736, arg3 * 6);
				int var6;
				for (int var5 = 0; var5 < 6; var5 += var6) {
					var6 = field736.read(field734, var5, 6 - var5);
					if (var6 == -1) {
						return false;
					}
				}

				var7 = (field734[5] & 0xFF) + ((field734[3] & 0xFF) << 16) + ((field734[4] & 0xFF) << 8);
				if (var7 <= 0 || var7 > field735.length() / 520L) {
					return false;
				}
			} else {
				var7 = (int) ((field735.length() + 519L) / 520L);
				if (var7 == 0) {
					var7 = 1;
				}
			}

			field734[0] = (byte) (arg2 >> 16);
			field734[1] = (byte) (arg2 >> 8);
			field734[2] = (byte) arg2;
			field734[3] = (byte) (var7 >> 16);
			field734[4] = (byte) (var7 >> 8);
			field734[5] = (byte) var7;
			method294(field736, arg3 * 6);
			field736.write(field734, 0, 6);
			int var8 = 0;
			int var9 = 0;
			while (var8 < arg2) {
				int var10 = 0;
				if (arg0) {
					method294(field735, var7 * 520);
					int var11;
					int var12;
					for (var11 = 0; var11 < 8; var11 += var12) {
						var12 = field735.read(field734, var11, 8 - var11);
						if (var12 == -1) {
							break;
						}
					}

					if (var11 == 8) {
						int var13 = ((field734[0] & 0xFF) << 8) + (field734[1] & 0xFF);
						int var14 = ((field734[2] & 0xFF) << 8) + (field734[3] & 0xFF);
						var10 = (field734[6] & 0xFF) + ((field734[4] & 0xFF) << 16) + ((field734[5] & 0xFF) << 8);
						int var15 = field734[7] & 0xFF;
						if (arg3 != var13 || var9 != var14 || field737 != var15) {
							return false;
						}

						if (var10 < 0 || var10 > field735.length() / 520L) {
							return false;
						}
					}
				}

				if (var10 == 0) {
					arg0 = false;
					var10 = (int) ((field735.length() + 519L) / 520L);
					if (var10 == 0) {
						var10++;
					}

					if (var7 == var10) {
						var10++;
					}
				}

				if (arg2 - var8 <= 512) {
					var10 = 0;
				}

				field734[0] = (byte) (arg3 >> 8);
				field734[1] = (byte) arg3;
				field734[2] = (byte) (var9 >> 8);
				field734[3] = (byte) var9;
				field734[4] = (byte) (var10 >> 16);
				field734[5] = (byte) (var10 >> 8);
				field734[6] = (byte) var10;
				field734[7] = (byte) field737;
				method294(field735, var7 * 520);
				field735.write(field734, 0, 8);
				int var16 = arg2 - var8;
				if (var16 > 512) {
					var16 = 512;
				}

				field735.write(arg1, var8, var16);
				var8 += var16;
				var7 = var10;
				var9++;
			}

			return true;
		} catch (IOException var17) {
			return false;
		}
	}

	@ObfuscatedName("wb.a(Ljava/io/RandomAccessFile;ZI)V")
	public synchronized void method294(RandomAccessFile arg0, int arg1) throws IOException {
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
