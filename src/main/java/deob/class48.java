package deob;

import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("vb")
public final class class48 {

	@ObfuscatedName("vb.a")
	public static byte[] field748 = new byte[520];

	@ObfuscatedName("vb.b")
	public RandomAccessFile field749;

	@ObfuscatedName("vb.c")
	public RandomAccessFile field750;

	@ObfuscatedName("vb.d")
	public int field751;

	@ObfuscatedName("vb.e")
	public int field752 = 65000;

	public class48(RandomAccessFile arg0, RandomAccessFile arg1, int arg2, int arg3) {
		field751 = arg2;
		field749 = arg0;
		field750 = arg1;
		field752 = arg3;
	}

	@ObfuscatedName("vb.a(II)[B")
	public synchronized byte[] method291(int arg0) {
		try {
			method294(field750, arg0 * 6);
			int var3;
			for (int var2 = 0; var2 < 6; var2 += var3) {
				var3 = field750.read(field748, var2, 6 - var2);
				if (var3 == -1) {
					return null;
				}
			}

			int var4 = (field748[2] & 0xFF) + ((field748[0] & 0xFF) << 16) + ((field748[1] & 0xFF) << 8);
			int var5 = (field748[5] & 0xFF) + ((field748[3] & 0xFF) << 16) + ((field748[4] & 0xFF) << 8);
			if (var4 >= 0 && var4 <= field752) {
				if (var5 > 0 && var5 <= field749.length() / 520L) {
					byte[] var6 = new byte[var4];
					int var7 = 0;
					int var8 = 0;
					while (var7 < var4) {
						if (var5 == 0) {
							return null;
						}

						method294(field749, var5 * 520);
						int var9 = 0;
						int var10 = var4 - var7;
						if (var10 > 512) {
							var10 = 512;
						}

						while (var9 < var10 + 8) {
							int var11 = field749.read(field748, var9, var10 + 8 - var9);
							if (var11 == -1) {
								return null;
							}

							var9 += var11;
						}

						int var12 = ((field748[0] & 0xFF) << 8) + (field748[1] & 0xFF);
						int var13 = ((field748[2] & 0xFF) << 8) + (field748[3] & 0xFF);
						int var14 = (field748[6] & 0xFF) + ((field748[4] & 0xFF) << 16) + ((field748[5] & 0xFF) << 8);
						int var15 = field748[7] & 0xFF;
						if (arg0 == var12 && var8 == var13 && field751 == var15) {
							if (var14 >= 0 && var14 <= field749.length() / 520L) {
								for (int var16 = 0; var16 < var10; var16++) {
									var6[var7++] = field748[var16 + 8];
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

	@ObfuscatedName("vb.a(II[BI)Z")
	public synchronized boolean method292(int arg0, byte[] arg1, int arg2) {
		boolean var4 = method293(arg2, arg0, arg1, true);
		if (!var4) {
			var4 = method293(arg2, arg0, arg1, false);
		}

		return var4;
	}

	@ObfuscatedName("vb.a(III[BZ)Z")
	public synchronized boolean method293(int arg0, int arg1, byte[] arg2, boolean arg3) {
		try {
			int var7;
			if (arg3) {
				method294(field750, arg1 * 6);
				int var6;
				for (int var5 = 0; var5 < 6; var5 += var6) {
					var6 = field750.read(field748, var5, 6 - var5);
					if (var6 == -1) {
						return false;
					}
				}

				var7 = (field748[5] & 0xFF) + ((field748[3] & 0xFF) << 16) + ((field748[4] & 0xFF) << 8);
				if (var7 <= 0 || var7 > field749.length() / 520L) {
					return false;
				}
			} else {
				var7 = (int) ((field749.length() + 519L) / 520L);
				if (var7 == 0) {
					var7 = 1;
				}
			}

			field748[0] = (byte) (arg0 >> 16);
			field748[1] = (byte) (arg0 >> 8);
			field748[2] = (byte) arg0;
			field748[3] = (byte) (var7 >> 16);
			field748[4] = (byte) (var7 >> 8);
			field748[5] = (byte) var7;
			method294(field750, arg1 * 6);
			field750.write(field748, 0, 6);
			int var8 = 0;
			int var9 = 0;
			while (var8 < arg0) {
				int var10 = 0;
				if (arg3) {
					method294(field749, var7 * 520);
					int var11;
					int var12;
					for (var11 = 0; var11 < 8; var11 += var12) {
						var12 = field749.read(field748, var11, 8 - var11);
						if (var12 == -1) {
							break;
						}
					}

					if (var11 == 8) {
						int var13 = ((field748[0] & 0xFF) << 8) + (field748[1] & 0xFF);
						int var14 = ((field748[2] & 0xFF) << 8) + (field748[3] & 0xFF);
						var10 = (field748[6] & 0xFF) + ((field748[4] & 0xFF) << 16) + ((field748[5] & 0xFF) << 8);
						int var15 = field748[7] & 0xFF;
						if (arg1 != var13 || var9 != var14 || field751 != var15) {
							return false;
						}

						if (var10 < 0 || var10 > field749.length() / 520L) {
							return false;
						}
					}
				}

				if (var10 == 0) {
					arg3 = false;
					var10 = (int) ((field749.length() + 519L) / 520L);
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

				field748[0] = (byte) (arg1 >> 8);
				field748[1] = (byte) arg1;
				field748[2] = (byte) (var9 >> 8);
				field748[3] = (byte) var9;
				field748[4] = (byte) (var10 >> 16);
				field748[5] = (byte) (var10 >> 8);
				field748[6] = (byte) var10;
				field748[7] = (byte) field751;
				method294(field749, var7 * 520);
				field749.write(field748, 0, 8);
				int var16 = arg0 - var8;
				if (var16 > 512) {
					var16 = 512;
				}

				field749.write(arg2, var8, var16);
				var8 += var16;
				var7 = var10;
				var9++;
			}

			return true;
		} catch (IOException var17) {
			return false;
		}
	}

	@ObfuscatedName("vb.a(Ljava/io/RandomAccessFile;IB)V")
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
