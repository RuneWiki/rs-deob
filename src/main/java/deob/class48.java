package deob;

import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("vb")
public final class class48 {

	@ObfuscatedName("vb.b")
	public static byte[] field742 = new byte[520];

	@ObfuscatedName("vb.c")
	public RandomAccessFile field743;

	@ObfuscatedName("vb.d")
	public RandomAccessFile field744;

	@ObfuscatedName("vb.e")
	public int field745;

	@ObfuscatedName("vb.f")
	public int field746 = 65000;

	public class48(int arg0, RandomAccessFile arg1, RandomAccessFile arg2, int arg3) {
		field745 = arg3;
		field743 = arg2;
		field744 = arg1;
		field746 = arg0;
	}

	@ObfuscatedName("vb.a(II)[B")
	public synchronized byte[] method286(int arg0) {
		try {
			method289(arg0 * 6, field744);
			int var3;
			for (int var2 = 0; var2 < 6; var2 += var3) {
				var3 = field744.read(field742, var2, 6 - var2);
				if (var3 == -1) {
					return null;
				}
			}

			int var4 = (field742[2] & 0xFF) + ((field742[0] & 0xFF) << 16) + ((field742[1] & 0xFF) << 8);
			int var5 = (field742[5] & 0xFF) + ((field742[3] & 0xFF) << 16) + ((field742[4] & 0xFF) << 8);
			if (var4 >= 0 && var4 <= field746) {
				if (var5 > 0 && var5 <= field743.length() / 520L) {
					byte[] var6 = new byte[var4];
					int var7 = 0;
					int var8 = 0;
					while (var7 < var4) {
						if (var5 == 0) {
							return null;
						}

						method289(var5 * 520, field743);
						int var9 = 0;
						int var10 = var4 - var7;
						if (var10 > 512) {
							var10 = 512;
						}

						while (var9 < var10 + 8) {
							int var11 = field743.read(field742, var9, var10 + 8 - var9);
							if (var11 == -1) {
								return null;
							}

							var9 += var11;
						}

						int var12 = ((field742[0] & 0xFF) << 8) + (field742[1] & 0xFF);
						int var13 = ((field742[2] & 0xFF) << 8) + (field742[3] & 0xFF);
						int var14 = (field742[6] & 0xFF) + ((field742[4] & 0xFF) << 16) + ((field742[5] & 0xFF) << 8);
						int var15 = field742[7] & 0xFF;
						if (arg0 == var12 && var8 == var13 && field745 == var15) {
							if (var14 >= 0 && var14 <= field743.length() / 520L) {
								for (int var16 = 0; var16 < var10; var16++) {
									var6[var7++] = field742[var16 + 8];
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

	@ObfuscatedName("vb.a([BIII)Z")
	public synchronized boolean method287(byte[] arg0, int arg1, int arg2) {
		boolean var4 = method288(arg2, arg0, arg1, true);
		if (!var4) {
			var4 = method288(arg2, arg0, arg1, false);
		}

		return var4;
	}

	@ObfuscatedName("vb.a(I[BIZI)Z")
	public synchronized boolean method288(int arg0, byte[] arg1, int arg2, boolean arg3) {
		try {
			int var7;
			if (arg3) {
				method289(arg2 * 6, field744);
				int var6;
				for (int var5 = 0; var5 < 6; var5 += var6) {
					var6 = field744.read(field742, var5, 6 - var5);
					if (var6 == -1) {
						return false;
					}
				}

				var7 = (field742[5] & 0xFF) + ((field742[3] & 0xFF) << 16) + ((field742[4] & 0xFF) << 8);
				if (var7 <= 0 || var7 > field743.length() / 520L) {
					return false;
				}
			} else {
				var7 = (int) ((field743.length() + 519L) / 520L);
				if (var7 == 0) {
					var7 = 1;
				}
			}

			field742[0] = (byte) (arg0 >> 16);
			field742[1] = (byte) (arg0 >> 8);
			field742[2] = (byte) arg0;
			field742[3] = (byte) (var7 >> 16);
			field742[4] = (byte) (var7 >> 8);
			field742[5] = (byte) var7;
			method289(arg2 * 6, field744);
			field744.write(field742, 0, 6);
			int var8 = 0;
			int var9 = 0;
			while (var8 < arg0) {
				int var10 = 0;
				if (arg3) {
					method289(var7 * 520, field743);
					int var11;
					int var12;
					for (var11 = 0; var11 < 8; var11 += var12) {
						var12 = field743.read(field742, var11, 8 - var11);
						if (var12 == -1) {
							break;
						}
					}

					if (var11 == 8) {
						int var13 = ((field742[0] & 0xFF) << 8) + (field742[1] & 0xFF);
						int var14 = ((field742[2] & 0xFF) << 8) + (field742[3] & 0xFF);
						var10 = (field742[6] & 0xFF) + ((field742[4] & 0xFF) << 16) + ((field742[5] & 0xFF) << 8);
						int var15 = field742[7] & 0xFF;
						if (arg2 != var13 || var9 != var14 || field745 != var15) {
							return false;
						}

						if (var10 < 0 || var10 > field743.length() / 520L) {
							return false;
						}
					}
				}

				if (var10 == 0) {
					arg3 = false;
					var10 = (int) ((field743.length() + 519L) / 520L);
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

				field742[0] = (byte) (arg2 >> 8);
				field742[1] = (byte) arg2;
				field742[2] = (byte) (var9 >> 8);
				field742[3] = (byte) var9;
				field742[4] = (byte) (var10 >> 16);
				field742[5] = (byte) (var10 >> 8);
				field742[6] = (byte) var10;
				field742[7] = (byte) field745;
				method289(var7 * 520, field743);
				field743.write(field742, 0, 8);
				int var16 = arg0 - var8;
				if (var16 > 512) {
					var16 = 512;
				}

				field743.write(arg1, var8, var16);
				var8 += var16;
				var7 = var10;
				var9++;
			}

			return true;
		} catch (IOException var17) {
			return false;
		}
	}

	@ObfuscatedName("vb.a(ILjava/io/RandomAccessFile;Z)V")
	public synchronized void method289(int arg0, RandomAccessFile arg1) throws IOException {
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
