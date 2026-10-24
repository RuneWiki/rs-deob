package jagex2.io;

import deob.ObfuscatedName;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("vb")
public final class FileStream {

	@ObfuscatedName("vb.d")
	public static byte[] temp = new byte[520];

	@ObfuscatedName("vb.e")
	public RandomAccessFile dat;

	@ObfuscatedName("vb.f")
	public RandomAccessFile idx;

	@ObfuscatedName("vb.g")
	public int archive;

	@ObfuscatedName("vb.h")
	public int maxFileSize = 65000;

	public FileStream(RandomAccessFile arg0, RandomAccessFile arg1, int arg2, int arg3) {
		archive = arg2;
		dat = arg0;
		idx = arg1;
		maxFileSize = arg3;
	}

	@ObfuscatedName("vb.a(BI)[B")
	public synchronized byte[] readFromFile(int arg0) {
		try {
			seek(arg0 * 6, idx);
			int var3;
			for (int var2 = 0; var2 < 6; var2 += var3) {
				var3 = idx.read(temp, var2, 6 - var2);
				if (var3 == -1) {
					return null;
				}
			}

			int var4 = (temp[2] & 0xFF) + ((temp[0] & 0xFF) << 16) + ((temp[1] & 0xFF) << 8);
			int var5 = (temp[5] & 0xFF) + ((temp[3] & 0xFF) << 16) + ((temp[4] & 0xFF) << 8);
			if (var4 >= 0 && var4 <= maxFileSize) {
				if (var5 > 0 && var5 <= dat.length() / 520L) {
					byte[] var6 = new byte[var4];
					int var7 = 0;
					int var8 = 0;
					while (var7 < var4) {
						if (var5 == 0) {
							return null;
						}

						seek(var5 * 520, dat);
						int var9 = 0;
						int var10 = var4 - var7;
						if (var10 > 512) {
							var10 = 512;
						}

						while (var9 < var10 + 8) {
							int var11 = dat.read(temp, var9, var10 + 8 - var9);
							if (var11 == -1) {
								return null;
							}

							var9 += var11;
						}

						int var12 = ((temp[0] & 0xFF) << 8) + (temp[1] & 0xFF);
						int var13 = ((temp[2] & 0xFF) << 8) + (temp[3] & 0xFF);
						int var14 = (temp[6] & 0xFF) + ((temp[4] & 0xFF) << 16) + ((temp[5] & 0xFF) << 8);
						int var15 = temp[7] & 0xFF;
						if (arg0 == var12 && var8 == var13 && archive == var15) {
							if (var14 >= 0 && var14 <= dat.length() / 520L) {
								for (int var16 = 0; var16 < var10; var16++) {
									var6[var7++] = temp[var16 + 8];
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

	@ObfuscatedName("vb.a(II[BB)Z")
	public synchronized boolean writeToFile(int arg0, int arg1, byte[] arg2) {
		boolean var4 = writeToFile(true, arg2, arg1, arg0);
		if (!var4) {
			var4 = writeToFile(false, arg2, arg1, arg0);
		}

		return var4;
	}

	@ObfuscatedName("vb.a(Z[BIIB)Z")
	public synchronized boolean writeToFile(boolean arg0, byte[] arg1, int arg2, int arg3) {
		try {
			int var7;
			if (arg0) {
				seek(arg2 * 6, idx);
				int var6;
				for (int var5 = 0; var5 < 6; var5 += var6) {
					var6 = idx.read(temp, var5, 6 - var5);
					if (var6 == -1) {
						return false;
					}
				}

				var7 = (temp[5] & 0xFF) + ((temp[3] & 0xFF) << 16) + ((temp[4] & 0xFF) << 8);
				if (var7 <= 0 || var7 > dat.length() / 520L) {
					return false;
				}
			} else {
				var7 = (int) ((dat.length() + 519L) / 520L);
				if (var7 == 0) {
					var7 = 1;
				}
			}

			temp[0] = (byte) (arg3 >> 16);
			temp[1] = (byte) (arg3 >> 8);
			temp[2] = (byte) arg3;
			temp[3] = (byte) (var7 >> 16);
			temp[4] = (byte) (var7 >> 8);
			temp[5] = (byte) var7;
			seek(arg2 * 6, idx);
			idx.write(temp, 0, 6);
			int var8 = 0;
			int var9 = 0;
			while (var8 < arg3) {
				int var10 = 0;
				if (arg0) {
					seek(var7 * 520, dat);
					int var11;
					int var12;
					for (var11 = 0; var11 < 8; var11 += var12) {
						var12 = dat.read(temp, var11, 8 - var11);
						if (var12 == -1) {
							break;
						}
					}

					if (var11 == 8) {
						int var13 = ((temp[0] & 0xFF) << 8) + (temp[1] & 0xFF);
						int var14 = ((temp[2] & 0xFF) << 8) + (temp[3] & 0xFF);
						var10 = (temp[6] & 0xFF) + ((temp[4] & 0xFF) << 16) + ((temp[5] & 0xFF) << 8);
						int var15 = temp[7] & 0xFF;
						if (arg2 != var13 || var9 != var14 || archive != var15) {
							return false;
						}

						if (var10 < 0 || var10 > dat.length() / 520L) {
							return false;
						}
					}
				}

				if (var10 == 0) {
					arg0 = false;
					var10 = (int) ((dat.length() + 519L) / 520L);
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

				temp[0] = (byte) (arg2 >> 8);
				temp[1] = (byte) arg2;
				temp[2] = (byte) (var9 >> 8);
				temp[3] = (byte) var9;
				temp[4] = (byte) (var10 >> 16);
				temp[5] = (byte) (var10 >> 8);
				temp[6] = (byte) var10;
				temp[7] = (byte) archive;
				seek(var7 * 520, dat);
				dat.write(temp, 0, 8);
				int var16 = arg3 - var8;
				if (var16 > 512) {
					var16 = 512;
				}

				dat.write(arg1, var8, var16);
				var8 += var16;
				var7 = var10;
				var9++;
			}

			return true;
		} catch (IOException var17) {
			return false;
		}
	}

	@ObfuscatedName("vb.a(IZLjava/io/RandomAccessFile;)V")
	public synchronized void seek(int arg0, RandomAccessFile arg1) throws IOException {
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
