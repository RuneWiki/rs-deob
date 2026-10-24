package deob;

import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("wb")
public final class class49 {

	@ObfuscatedName("wb.c")
	public static byte[] field746 = new byte[520];

	@ObfuscatedName("wb.d")
	public RandomAccessFile field747;

	@ObfuscatedName("wb.e")
	public RandomAccessFile field748;

	@ObfuscatedName("wb.f")
	public int field749;

	@ObfuscatedName("wb.g")
	public int field750 = 65000;

	public class49(RandomAccessFile arg0, int arg1, int arg2, RandomAccessFile arg3) {
		field749 = arg1;
		field747 = arg3;
		field748 = arg0;
		field750 = arg2;
	}

	@ObfuscatedName("wb.a(II)[B")
	public synchronized byte[] method300(int arg0) {
		try {
			method303(arg0 * 6, field748);
			int var3;
			for (int var2 = 0; var2 < 6; var2 += var3) {
				var3 = field748.read(field746, var2, 6 - var2);
				if (var3 == -1) {
					return null;
				}
			}

			int var4 = (field746[2] & 0xFF) + ((field746[0] & 0xFF) << 16) + ((field746[1] & 0xFF) << 8);
			int var5 = (field746[5] & 0xFF) + ((field746[3] & 0xFF) << 16) + ((field746[4] & 0xFF) << 8);
			if (var4 >= 0 && var4 <= field750) {
				if (var5 > 0 && var5 <= field747.length() / 520L) {
					byte[] var6 = new byte[var4];
					int var7 = 0;
					int var8 = 0;
					while (var7 < var4) {
						if (var5 == 0) {
							return null;
						}

						method303(var5 * 520, field747);
						int var9 = 0;
						int var10 = var4 - var7;
						if (var10 > 512) {
							var10 = 512;
						}

						while (var9 < var10 + 8) {
							int var11 = field747.read(field746, var9, var10 + 8 - var9);
							if (var11 == -1) {
								return null;
							}

							var9 += var11;
						}

						int var12 = ((field746[0] & 0xFF) << 8) + (field746[1] & 0xFF);
						int var13 = ((field746[2] & 0xFF) << 8) + (field746[3] & 0xFF);
						int var14 = (field746[6] & 0xFF) + ((field746[4] & 0xFF) << 16) + ((field746[5] & 0xFF) << 8);
						int var15 = field746[7] & 0xFF;
						if (arg0 == var12 && var8 == var13 && field749 == var15) {
							if (var14 >= 0 && var14 <= field747.length() / 520L) {
								for (int var16 = 0; var16 < var10; var16++) {
									var6[var7++] = field746[var16 + 8];
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

	@ObfuscatedName("wb.a(IB[BI)Z")
	public synchronized boolean method301(int arg0, byte[] arg1, int arg2) {
		boolean var4 = method302(true, arg0, arg1, arg2);
		if (!var4) {
			var4 = method302(false, arg0, arg1, arg2);
		}

		return var4;
	}

	@ObfuscatedName("wb.a(ZII[BI)Z")
	public synchronized boolean method302(boolean arg0, int arg1, byte[] arg2, int arg3) {
		try {
			int var7;
			if (arg0) {
				method303(arg1 * 6, field748);
				int var6;
				for (int var5 = 0; var5 < 6; var5 += var6) {
					var6 = field748.read(field746, var5, 6 - var5);
					if (var6 == -1) {
						return false;
					}
				}

				var7 = (field746[5] & 0xFF) + ((field746[3] & 0xFF) << 16) + ((field746[4] & 0xFF) << 8);
				if (var7 <= 0 || var7 > field747.length() / 520L) {
					return false;
				}
			} else {
				var7 = (int) ((field747.length() + 519L) / 520L);
				if (var7 == 0) {
					var7 = 1;
				}
			}

			field746[0] = (byte) (arg3 >> 16);
			field746[1] = (byte) (arg3 >> 8);
			field746[2] = (byte) arg3;
			field746[3] = (byte) (var7 >> 16);
			field746[4] = (byte) (var7 >> 8);
			field746[5] = (byte) var7;
			method303(arg1 * 6, field748);
			field748.write(field746, 0, 6);
			int var8 = 0;
			int var9 = 0;
			while (var8 < arg3) {
				int var10 = 0;
				if (arg0) {
					method303(var7 * 520, field747);
					int var11;
					int var12;
					for (var11 = 0; var11 < 8; var11 += var12) {
						var12 = field747.read(field746, var11, 8 - var11);
						if (var12 == -1) {
							break;
						}
					}

					if (var11 == 8) {
						int var13 = ((field746[0] & 0xFF) << 8) + (field746[1] & 0xFF);
						int var14 = ((field746[2] & 0xFF) << 8) + (field746[3] & 0xFF);
						var10 = (field746[6] & 0xFF) + ((field746[4] & 0xFF) << 16) + ((field746[5] & 0xFF) << 8);
						int var15 = field746[7] & 0xFF;
						if (arg1 != var13 || var9 != var14 || field749 != var15) {
							return false;
						}

						if (var10 < 0 || var10 > field747.length() / 520L) {
							return false;
						}
					}
				}

				if (var10 == 0) {
					arg0 = false;
					var10 = (int) ((field747.length() + 519L) / 520L);
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

				field746[0] = (byte) (arg1 >> 8);
				field746[1] = (byte) arg1;
				field746[2] = (byte) (var9 >> 8);
				field746[3] = (byte) var9;
				field746[4] = (byte) (var10 >> 16);
				field746[5] = (byte) (var10 >> 8);
				field746[6] = (byte) var10;
				field746[7] = (byte) field749;
				method303(var7 * 520, field747);
				field747.write(field746, 0, 8);
				int var16 = arg3 - var8;
				if (var16 > 512) {
					var16 = 512;
				}

				field747.write(arg2, var8, var16);
				var8 += var16;
				var7 = var10;
				var9++;
			}

			return true;
		} catch (IOException var17) {
			return false;
		}
	}

	@ObfuscatedName("wb.a(ILjava/io/RandomAccessFile;I)V")
	public synchronized void method303(int arg0, RandomAccessFile arg1) throws IOException {
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
