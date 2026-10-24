package deob;

import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("wb")
public final class class49 {

	@ObfuscatedName("wb.c")
	public static byte[] field749 = new byte[520];

	@ObfuscatedName("wb.d")
	public RandomAccessFile field750;

	@ObfuscatedName("wb.e")
	public RandomAccessFile field751;

	@ObfuscatedName("wb.f")
	public int field752;

	@ObfuscatedName("wb.g")
	public int field753 = 65000;

	public class49(int arg0, RandomAccessFile arg1, int arg2, RandomAccessFile arg3) {
		field752 = arg2;
		field750 = arg1;
		field751 = arg3;
		field753 = arg0;
	}

	@ObfuscatedName("wb.a(IB)[B")
	public synchronized byte[] method301(int arg0) {
		try {
			method304(arg0 * 6, field751);
			int var3;
			for (int var2 = 0; var2 < 6; var2 += var3) {
				var3 = field751.read(field749, var2, 6 - var2);
				if (var3 == -1) {
					return null;
				}
			}

			int var4 = (field749[2] & 0xFF) + ((field749[0] & 0xFF) << 16) + ((field749[1] & 0xFF) << 8);
			int var5 = (field749[5] & 0xFF) + ((field749[3] & 0xFF) << 16) + ((field749[4] & 0xFF) << 8);
			if (var4 >= 0 && var4 <= field753) {
				if (var5 > 0 && var5 <= field750.length() / 520L) {
					byte[] var6 = new byte[var4];
					int var7 = 0;
					int var8 = 0;
					while (var7 < var4) {
						if (var5 == 0) {
							return null;
						}

						method304(var5 * 520, field750);
						int var9 = 0;
						int var10 = var4 - var7;
						if (var10 > 512) {
							var10 = 512;
						}

						while (var9 < var10 + 8) {
							int var11 = field750.read(field749, var9, var10 + 8 - var9);
							if (var11 == -1) {
								return null;
							}

							var9 += var11;
						}

						int var12 = ((field749[0] & 0xFF) << 8) + (field749[1] & 0xFF);
						int var13 = ((field749[2] & 0xFF) << 8) + (field749[3] & 0xFF);
						int var14 = (field749[6] & 0xFF) + ((field749[4] & 0xFF) << 16) + ((field749[5] & 0xFF) << 8);
						int var15 = field749[7] & 0xFF;
						if (arg0 == var12 && var8 == var13 && field752 == var15) {
							if (var14 >= 0 && var14 <= field750.length() / 520L) {
								for (int var16 = 0; var16 < var10; var16++) {
									var6[var7++] = field749[var16 + 8];
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

	@ObfuscatedName("wb.a(II[BZ)Z")
	public synchronized boolean method302(int arg0, int arg1, byte[] arg2) {
		boolean var4 = method303(arg0, arg1, true, arg2);
		if (!var4) {
			var4 = method303(arg0, arg1, false, arg2);
		}

		return var4;
	}

	@ObfuscatedName("wb.a(IIIZ[B)Z")
	public synchronized boolean method303(int arg0, int arg1, boolean arg2, byte[] arg3) {
		try {
			int var7;
			if (arg2) {
				method304(arg1 * 6, field751);
				int var6;
				for (int var5 = 0; var5 < 6; var5 += var6) {
					var6 = field751.read(field749, var5, 6 - var5);
					if (var6 == -1) {
						return false;
					}
				}

				var7 = (field749[5] & 0xFF) + ((field749[3] & 0xFF) << 16) + ((field749[4] & 0xFF) << 8);
				if (var7 <= 0 || var7 > field750.length() / 520L) {
					return false;
				}
			} else {
				var7 = (int) ((field750.length() + 519L) / 520L);
				if (var7 == 0) {
					var7 = 1;
				}
			}

			field749[0] = (byte) (arg0 >> 16);
			field749[1] = (byte) (arg0 >> 8);
			field749[2] = (byte) arg0;
			field749[3] = (byte) (var7 >> 16);
			field749[4] = (byte) (var7 >> 8);
			field749[5] = (byte) var7;
			method304(arg1 * 6, field751);
			field751.write(field749, 0, 6);
			int var8 = 0;
			int var9 = 0;
			while (var8 < arg0) {
				int var10 = 0;
				if (arg2) {
					method304(var7 * 520, field750);
					int var11;
					int var12;
					for (var11 = 0; var11 < 8; var11 += var12) {
						var12 = field750.read(field749, var11, 8 - var11);
						if (var12 == -1) {
							break;
						}
					}

					if (var11 == 8) {
						int var13 = ((field749[0] & 0xFF) << 8) + (field749[1] & 0xFF);
						int var14 = ((field749[2] & 0xFF) << 8) + (field749[3] & 0xFF);
						var10 = (field749[6] & 0xFF) + ((field749[4] & 0xFF) << 16) + ((field749[5] & 0xFF) << 8);
						int var15 = field749[7] & 0xFF;
						if (arg1 != var13 || var9 != var14 || field752 != var15) {
							return false;
						}

						if (var10 < 0 || var10 > field750.length() / 520L) {
							return false;
						}
					}
				}

				if (var10 == 0) {
					arg2 = false;
					var10 = (int) ((field750.length() + 519L) / 520L);
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

				field749[0] = (byte) (arg1 >> 8);
				field749[1] = (byte) arg1;
				field749[2] = (byte) (var9 >> 8);
				field749[3] = (byte) var9;
				field749[4] = (byte) (var10 >> 16);
				field749[5] = (byte) (var10 >> 8);
				field749[6] = (byte) var10;
				field749[7] = (byte) field752;
				method304(var7 * 520, field750);
				field750.write(field749, 0, 8);
				int var16 = arg0 - var8;
				if (var16 > 512) {
					var16 = 512;
				}

				field750.write(arg3, var8, var16);
				var8 += var16;
				var7 = var10;
				var9++;
			}

			return true;
		} catch (IOException var17) {
			return false;
		}
	}

	@ObfuscatedName("wb.a(IILjava/io/RandomAccessFile;)V")
	public synchronized void method304(int arg0, RandomAccessFile arg1) throws IOException {
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
