package deob;

import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("wb")
public final class class49 {

	@ObfuscatedName("wb.e")
	public static byte[] field750 = new byte[520];

	@ObfuscatedName("wb.f")
	public RandomAccessFile field751;

	@ObfuscatedName("wb.g")
	public RandomAccessFile field752;

	@ObfuscatedName("wb.h")
	public int field753;

	@ObfuscatedName("wb.i")
	public int field754 = 65000;

	public class49(RandomAccessFile arg0, RandomAccessFile arg1, int arg2, int arg3) {
		field753 = arg3;
		field751 = arg1;
		field752 = arg0;
		field754 = arg2;
	}

	@ObfuscatedName("wb.a(II)[B")
	public synchronized byte[] method301(int arg0) {
		try {
			method304(field752, arg0 * 6);
			int var3;
			for (int var2 = 0; var2 < 6; var2 += var3) {
				var3 = field752.read(field750, var2, 6 - var2);
				if (var3 == -1) {
					return null;
				}
			}

			int var4 = (field750[2] & 0xFF) + ((field750[0] & 0xFF) << 16) + ((field750[1] & 0xFF) << 8);
			int var5 = (field750[5] & 0xFF) + ((field750[3] & 0xFF) << 16) + ((field750[4] & 0xFF) << 8);
			if (var4 >= 0 && var4 <= field754) {
				if (var5 > 0 && var5 <= field751.length() / 520L) {
					byte[] var6 = new byte[var4];
					int var7 = 0;
					int var8 = 0;
					while (var7 < var4) {
						if (var5 == 0) {
							return null;
						}

						method304(field751, var5 * 520);
						int var9 = 0;
						int var10 = var4 - var7;
						if (var10 > 512) {
							var10 = 512;
						}

						while (var9 < var10 + 8) {
							int var11 = field751.read(field750, var9, var10 + 8 - var9);
							if (var11 == -1) {
								return null;
							}

							var9 += var11;
						}

						int var12 = ((field750[0] & 0xFF) << 8) + (field750[1] & 0xFF);
						int var13 = ((field750[2] & 0xFF) << 8) + (field750[3] & 0xFF);
						int var14 = (field750[6] & 0xFF) + ((field750[4] & 0xFF) << 16) + ((field750[5] & 0xFF) << 8);
						int var15 = field750[7] & 0xFF;
						if (arg0 == var12 && var8 == var13 && field753 == var15) {
							if (var14 >= 0 && var14 <= field751.length() / 520L) {
								for (int var16 = 0; var16 < var10; var16++) {
									var6[var7++] = field750[var16 + 8];
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
	public synchronized boolean method302(byte[] arg0, int arg1, int arg2) {
		boolean var4 = method303(true, arg1, arg2, arg0);
		if (!var4) {
			var4 = method303(false, arg1, arg2, arg0);
		}

		return var4;
	}

	@ObfuscatedName("wb.a(ZIII[B)Z")
	public synchronized boolean method303(boolean arg0, int arg1, int arg2, byte[] arg3) {
		try {
			int var7;
			if (arg0) {
				method304(field752, arg1 * 6);
				int var6;
				for (int var5 = 0; var5 < 6; var5 += var6) {
					var6 = field752.read(field750, var5, 6 - var5);
					if (var6 == -1) {
						return false;
					}
				}

				var7 = (field750[5] & 0xFF) + ((field750[3] & 0xFF) << 16) + ((field750[4] & 0xFF) << 8);
				if (var7 <= 0 || var7 > field751.length() / 520L) {
					return false;
				}
			} else {
				var7 = (int) ((field751.length() + 519L) / 520L);
				if (var7 == 0) {
					var7 = 1;
				}
			}

			field750[0] = (byte) (arg2 >> 16);
			field750[1] = (byte) (arg2 >> 8);
			field750[2] = (byte) arg2;
			field750[3] = (byte) (var7 >> 16);
			field750[4] = (byte) (var7 >> 8);
			field750[5] = (byte) var7;
			method304(field752, arg1 * 6);
			field752.write(field750, 0, 6);
			int var8 = 0;
			int var9 = 0;
			while (var8 < arg2) {
				int var10 = 0;
				if (arg0) {
					method304(field751, var7 * 520);
					int var11;
					int var12;
					for (var11 = 0; var11 < 8; var11 += var12) {
						var12 = field751.read(field750, var11, 8 - var11);
						if (var12 == -1) {
							break;
						}
					}

					if (var11 == 8) {
						int var13 = ((field750[0] & 0xFF) << 8) + (field750[1] & 0xFF);
						int var14 = ((field750[2] & 0xFF) << 8) + (field750[3] & 0xFF);
						var10 = (field750[6] & 0xFF) + ((field750[4] & 0xFF) << 16) + ((field750[5] & 0xFF) << 8);
						int var15 = field750[7] & 0xFF;
						if (arg1 != var13 || var9 != var14 || field753 != var15) {
							return false;
						}

						if (var10 < 0 || var10 > field751.length() / 520L) {
							return false;
						}
					}
				}

				if (var10 == 0) {
					arg0 = false;
					var10 = (int) ((field751.length() + 519L) / 520L);
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

				field750[0] = (byte) (arg1 >> 8);
				field750[1] = (byte) arg1;
				field750[2] = (byte) (var9 >> 8);
				field750[3] = (byte) var9;
				field750[4] = (byte) (var10 >> 16);
				field750[5] = (byte) (var10 >> 8);
				field750[6] = (byte) var10;
				field750[7] = (byte) field753;
				method304(field751, var7 * 520);
				field751.write(field750, 0, 8);
				int var16 = arg2 - var8;
				if (var16 > 512) {
					var16 = 512;
				}

				field751.write(arg3, var8, var16);
				var8 += var16;
				var7 = var10;
				var9++;
			}

			return true;
		} catch (IOException var17) {
			return false;
		}
	}

	@ObfuscatedName("wb.a(Ljava/io/RandomAccessFile;II)V")
	public synchronized void method304(RandomAccessFile arg0, int arg1) throws IOException {
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
