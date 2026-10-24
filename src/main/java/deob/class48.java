package deob;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.zip.CRC32;
import java.util.zip.GZIPInputStream;
import sign.signlink;

@ObfuscatedName("vb")
public class class48 extends class47 implements Runnable {

	@ObfuscatedName("vb.f")
	public int[][] field698 = new int[4][];

	@ObfuscatedName("vb.g")
	public int[][] field699 = new int[4][];

	@ObfuscatedName("vb.h")
	public byte[][] field700 = new byte[4][];

	@ObfuscatedName("vb.i")
	public int field701;

	@ObfuscatedName("vb.j")
	public byte[] field702;

	@ObfuscatedName("vb.k")
	public int[] field703;

	@ObfuscatedName("vb.l")
	public int[] field704;

	@ObfuscatedName("vb.m")
	public int[] field705;

	@ObfuscatedName("vb.n")
	public int[] field706;

	@ObfuscatedName("vb.o")
	public boolean field707 = true;

	@ObfuscatedName("vb.p")
	public client field708;

	@ObfuscatedName("vb.q")
	public CRC32 field709 = new CRC32();

	@ObfuscatedName("vb.r")
	public class43 field710 = new class43();

	@ObfuscatedName("vb.s")
	public class42 field711 = new class42();

	@ObfuscatedName("vb.t")
	public class42 field712 = new class42();

	@ObfuscatedName("vb.u")
	public class42 field713 = new class42();

	@ObfuscatedName("vb.v")
	public class42 field714 = new class42();

	@ObfuscatedName("vb.w")
	public class42 field715 = new class42();

	@ObfuscatedName("vb.x")
	public String field716 = "";

	@ObfuscatedName("vb.y")
	public int field717;

	@ObfuscatedName("vb.z")
	public int field718;

	@ObfuscatedName("vb.G")
	public byte[] field725 = new byte[500];

	@ObfuscatedName("vb.H")
	public byte[] field726 = new byte[65000];

	@ObfuscatedName("vb.E")
	public int field723;

	@ObfuscatedName("vb.F")
	public int field724;

	@ObfuscatedName("vb.I")
	public int field727;

	@ObfuscatedName("vb.J")
	public int field728;

	@ObfuscatedName("vb.L")
	public int field730;

	@ObfuscatedName("vb.K")
	public long field729;

	@ObfuscatedName("vb.D")
	public class40 field722;

	@ObfuscatedName("vb.B")
	public InputStream field720;

	@ObfuscatedName("vb.C")
	public OutputStream field721;

	@ObfuscatedName("vb.A")
	public Socket field719;

	@ObfuscatedName("vb.a(Lyb;Lclient;)V")
	public final void method272(class51 arg0, client arg1) {
		String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		for (int var4 = 0; var4 < 4; var4++) {
			byte[] var5 = arg0.method295(var3[var4], null);
			int var6 = var5.length / 2;
			class39 var7 = new class39(var5);
			field698[var4] = new int[var6];
			field700[var4] = new byte[var6];

			for (int var8 = 0; var8 < var6; var8++) {
				field698[var4][var8] = var7.method233();
			}
		}

		String[] var9 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
		for (int var10 = 0; var10 < 4; var10++) {
			byte[] var11 = arg0.method295(var9[var10], null);
			int var12 = var11.length / 4;
			class39 var13 = new class39(var11);
			field699[var10] = new int[var12];
			for (int var14 = 0; var14 < var12; var14++) {
				field699[var10][var14] = var13.method236();
			}
		}

		byte[] var15 = arg0.method295("model_index", null);
		int var16 = field698[0].length;
		field702 = new byte[var16];
		for (int var17 = 0; var17 < var16; var17++) {
			if (var17 < var15.length) {
				field702[var17] = var15[var17];
			} else {
				field702[var17] = 0;
			}
		}

		byte[] var18 = arg0.method295("map_index", null);
		class39 var19 = new class39(var18);
		int var20 = var18.length / 6;
		field703 = new int[var20];
		field704 = new int[var20];
		field705 = new int[var20];
		for (int var21 = 0; var21 < var20; var21++) {
			field703[var21] = var19.method233();
			field704[var21] = var19.method233();
			field705[var21] = var19.method233();
		}

		byte[] var22 = arg0.method295("anim_index", null);
		class39 var23 = new class39(var22);
		int var24 = var22.length / 2;
		field706 = new int[var24];
		for (int var25 = 0; var25 < var24; var25++) {
			field706[var25] = var23.method233();
		}

		field708 = arg1;
		field707 = true;
		field708.method12(this, 2);
	}

	@ObfuscatedName("vb.a()V")
	public final void method273() {
		field707 = false;
	}

	@ObfuscatedName("vb.a(II)I")
	public final int method274(int arg0) {
		return field698[arg0].length;
	}

	@ObfuscatedName("vb.a(B)I")
	public final int method275() {
		return field706.length;
	}

	@ObfuscatedName("vb.a(IIII)I")
	public final int method276(int arg0, int arg1, int arg2) {
		int var4 = (arg0 << 8) + arg1;
		for (int var5 = 0; var5 < field703.length; var5++) {
			if (field703[var5] == var4) {
				if (arg2 == 0) {
					return field704[var5];
				}

				return field705[var5];
			}
		}

		return -1;
	}

	@ObfuscatedName("vb.a(ZI)Z")
	public final boolean method277(int arg0) {
		for (int var2 = 0; var2 < field703.length; var2++) {
			if (field705[var2] == arg0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("vb.b(II)I")
	public final int method278(int arg0) {
		return field702[arg0] & 0xFF;
	}

	@ObfuscatedName("vb.a(I)V")
	public final void method271(int arg0) {
		method279(0, arg0);
	}

	@ObfuscatedName("vb.c(II)V")
	public final void method279(int arg0, int arg1) {
		if (arg0 >= 0 && arg0 <= field698.length && arg1 >= 0 && arg1 <= field698[arg0].length && field698[arg0][arg1] != 0) {
			synchronized (field710) {
				for (class40 var4 = (class40) field710.method257(); var4 != null; var4 = (class40) field710.method258()) {
					if (var4.field622 == arg0 && var4.field623 == arg1) {
						return;
					}
				}

				class40 var5 = new class40();
				var5.field622 = arg0;
				var5.field623 = arg1;
				var5.field626 = true;

				synchronized (field711) {
					field711.method247(var5);
				}

				field710.method255(var5);
			}
		}
	}

	@ObfuscatedName("vb.b()I")
	public final int method280() {
		synchronized (field710) {
			return field710.method259();
		}
	}

	@ObfuscatedName("vb.c()Lnb;")
	public final class40 method281() {
		class40 var2;
		synchronized (field714) {
			var2 = (class40) field714.method249();
		}

		if (var2 == null) {
			return null;
		}

		synchronized (field710) {
			var2.method119();
		}

		if (var2.field624 == null) {
			return var2;
		}

		int var4 = 0;
		try {
			GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field624));
			while (true) {
				if (field726.length == var4) {
					throw new RuntimeException("buffer overflow!");
				}

				int var6 = var5.read(field726, var4, field726.length - var4);
				if (var6 == -1) {
					break;
				}

				var4 += var6;
			}
		} catch (IOException var10) {
			throw new RuntimeException("error unzipping");
		}

		var2.field624 = new byte[var4];
		for (int var7 = 0; var7 < var4; var7++) {
			var2.field624[var7] = field726[var7];
		}

		return var2;
	}

	@ObfuscatedName("vb.a(IBBI)V")
	public final void method282(int arg0, byte arg1, int arg2) {
		if (field708.field1065[0] != null && field698[arg0][arg2] != 0) {
			byte[] var4 = field708.field1065[arg0 + 1].method287(arg2);
			if (!method285(var4, field699[arg0][arg2], field698[arg0][arg2])) {
				field700[arg0][arg2] = arg1;

				if (arg1 > field701) {
					field701 = arg1;
				}

				field718++;
			}
		}
	}

	@ObfuscatedName("vb.a(Z)V")
	public final void method283() {
		synchronized (field715) {
			field715.method254();
		}
	}

	@ObfuscatedName("vb.a(III)V")
	public final void method284(int arg0, int arg1) {
		if (field708.field1065[0] != null && (field698[arg0][arg1] != 0 && (field700[arg0][arg1] != 0 && field701 != 0))) {
			class40 var3 = new class40();
			var3.field622 = arg0;
			var3.field623 = arg1;
			var3.field626 = false;

			synchronized (field715) {
				field715.method247(var3);
			}
		}
	}

	public final void run() {
		while (field707) {
			field730++;

			try {
				Thread.sleep(20L);
			} catch (Exception var46) {
			}

			boolean var1 = true;
			for (int var2 = 0; var2 < 100 && var1; var2++) {
				var1 = false;
				class40 var4;
				synchronized (field711) {
					var4 = (class40) field711.method249();
				}

				while (var4 != null) {
					var1 = true;
					byte[] var5 = null;
					if (field708.field1065[0] != null) {
						var5 = field708.field1065[var4.field622 + 1].method287(var4.field623);
					}

					if (!method285(var5, field699[var4.field622][var4.field623], field698[var4.field622][var4.field623])) {
						var5 = null;
					}

					synchronized (field711) {
						if (var5 == null) {
							field712.method247(var4);
						} else {
							var4.field624 = var5;

							synchronized (field714) {
								field714.method247(var4);
							}
						}

						var4 = (class40) field711.method249();
					}
				}

				int var8 = 0;
				int var9 = 0;
				for (class40 var10 = (class40) field713.method250(); var10 != null; var10 = (class40) field713.method252()) {
					if (var10.field626) {
						var8++;
					} else {
						var9++;
					}
				}

				while (var8 < 10) {
					class40 var11 = (class40) field712.method249();
					if (var11 == null) {
						break;
					}

					if (field700[var11.field622][var11.field623] != 0) {
						field717++;
					}

					field700[var11.field622][var11.field623] = 0;
					field713.method247(var11);
					var8++;
					method286(var11);
					var1 = true;
				}

				if (var8 == 0 && var2 >= 5) {
					break;
				}

				label344: while (var8 == 0 && var9 < 10 && field701 != 0) {
					class40 var13;
					synchronized (field715) {
						var13 = (class40) field715.method249();
					}

					while (var13 != null) {
						if (field700[var13.field622][var13.field623] != 0) {
							field700[var13.field622][var13.field623] = 0;
							field713.method247(var13);
							method286(var13);
							var1 = true;

							if (field717 < field718) {
								field717++;
							}

							field716 = "Loading extra files - " + field717 * 100 / field718 + "%";
							var9++;
							if (var9 == 10) {
								break label344;
							}
						}

						synchronized (field715) {
							var13 = (class40) field715.method249();
						}
					}

					for (int var15 = 0; var15 < 4; var15++) {
						byte[] var16 = field700[var15];
						int var17 = var16.length;
						for (int var18 = 0; var18 < var17; var18++) {
							if (var16[var18] == field701) {
								var16[var18] = 0;
								class40 var19 = new class40();
								var19.field622 = var15;
								var19.field623 = var18;
								var19.field626 = false;
								field713.method247(var19);
								method286(var19);
								var1 = true;

								if (field717 < field718) {
									field717++;
								}

								field716 = "Loading extra files - " + field717 * 100 / field718 + "%";
								if (var19.field622 >= 2) {
									field716 = ".";
								}

								var9++;
								if (var9 == 10) {
									break label344;
								}
							}
						}
					}

					field701--;
				}

				if (field720 != null) {
					try {
						int var20 = field720.available();
						if (field724 == 0 && var20 >= 6) {
							var1 = true;

							for (int var21 = 0; var21 < 6; var21 += field720.read(field725, var21, 6 - var21)) {
							}

							int var22 = field725[0] & 0xFF;
							int var23 = ((field725[1] & 0xFF) << 8) + (field725[2] & 0xFF);
							int var24 = ((field725[3] & 0xFF) << 8) + (field725[4] & 0xFF);
							int var25 = field725[5] & 0xFF;
							field722 = null;
							for (class40 var26 = (class40) field713.method250(); var26 != null; var26 = (class40) field713.method252()) {
								if (var26.field622 == var22 && var26.field623 == var23) {
									field722 = var26;
								}

								if (field722 != null) {
									var26.field625 = 0;
								}
							}

							if (field722 != null) {
								field727 = 0;

								if (var24 == 0) {
									signlink.reporterror("Rej: " + var22 + "," + var23);
									field722.field624 = null;

									if (field722.field626) {
										synchronized (field714) {
											field714.method247(field722);
										}
									} else {
										field722.method118();
									}

									field722 = null;
								} else {
									if (field722.field624 == null && var25 == 0) {
										field722.field624 = new byte[var24];
									}

									if (field722.field624 == null && var25 != 0) {
										throw new IOException("missing start of file");
									}
								}
							}

							field723 = var25 * 500;
							field724 = 500;
							if (field724 > var24 - var25 * 500) {
								field724 = var24 - var25 * 500;
							}
						}

						if (field724 > 0 && var20 >= field724) {
							var1 = true;
							byte[] var28 = field725;
							int var29 = 0;
							if (field722 != null) {
								var28 = field722.field624;
								var29 = field723;
							}

							for (int var30 = 0; var30 < field724; var30 += field720.read(var28, var29 + var30, field724 - var30)) {
							}

							if (field724 + field723 >= var28.length && field722 != null) {
								if (field708.field1065[0] != null) {
									field708.field1065[field722.field622 + 1].method288(var28.length, var28, field722.field623);
								}

								if (!field722.field626 && field722.field622 == 3) {
									field722.field626 = true;
									field722.field622 = 93;
								}

								if (field722.field626) {
									synchronized (field714) {
										field714.method247(field722);
									}
								} else {
									field722.method118();
								}
							}

							field724 = 0;
						}
					} catch (IOException var47) {
						try {
							field719.close();
						} catch (Exception var38) {
						}

						field719 = null;
						field720 = null;
						field721 = null;
						field724 = 0;
					}
				}
			}

			boolean var33 = false;
			for (class40 var34 = (class40) field713.method250(); var34 != null; var34 = (class40) field713.method252()) {
				if (var34.field626) {
					var33 = true;
					var34.field625++;
					if (var34.field625 > 50) {
						var34.field625 = 0;
						method286(var34);
					}
				}
			}

			if (!var33) {
				for (class40 var35 = (class40) field713.method250(); var35 != null; var35 = (class40) field713.method252()) {
					var33 = true;
					var35.field625++;
					if (var35.field625 > 50) {
						var35.field625 = 0;
						method286(var35);
					}
				}
			}

			if (var33) {
				field727++;
				if (field727 > 750) {
					try {
						field719.close();
					} catch (Exception var37) {
					}

					field719 = null;
					field720 = null;
					field721 = null;
					field724 = 0;
				}
			} else {
				field727 = 0;
				field716 = "";
			}

			if (field708.field1295 && field719 != null && field721 != null && field701 > 0) {
				field728++;
				if (field728 > 500) {
					field728 = 0;
					field725[0] = 0;
					field725[1] = 0;
					field725[2] = 0;
					field725[3] = 10;
					try {
						field721.write(field725, 0, 4);
					} catch (IOException var36) {
						field727 = 5000;
					}
				}
			}
		}
	}

	@ObfuscatedName("vb.a([BIIB)Z")
	public final boolean method285(byte[] arg0, int arg1, int arg2) {
		if (arg0 != null && arg0.length >= 2) {
			int var4 = arg0.length - 2;
			int var5 = ((arg0[var4] & 0xFF) << 8) + (arg0[var4 + 1] & 0xFF);
			field709.reset();
			field709.update(arg0, 0, var4);
			int var6 = (int) field709.getValue();

			if (arg2 != var5) {
				return false;
			}

			if (arg1 != var6) {
				return false;
			}

			return true;
		}

		return false;
	}

	@ObfuscatedName("vb.a(Lnb;Z)V")
	public final void method286(class40 arg0) {
		try {
			if (field719 == null) {
				long var2 = System.currentTimeMillis();
				if (var2 - field729 < 5000L) {
					return;
				}

				field729 = var2;
				field719 = field708.method436(client.field997 + 43594);
				field720 = field719.getInputStream();
				field721 = field719.getOutputStream();
				field721.write(15);

				for (int var4 = 0; var4 < 8; var4++) {
					field720.read();
				}

				field727 = 0;
			}

			field725[0] = (byte) arg0.field622;
			field725[1] = (byte) (arg0.field623 >> 8);
			field725[2] = (byte) arg0.field623;
			if (arg0.field626) {
				field725[3] = 2;
			} else if (field708.field1295 || arg0.field622 > 1) {
				field725[3] = 0;
			} else {
				field725[3] = 1;
			}

			field721.write(field725, 0, 4);
			field728 = 0;
		} catch (IOException var7) {
			try {
				field719.close();
			} catch (Exception var6) {
			}

			field719 = null;
			field720 = null;
			field721 = null;
			field724 = 0;
		}
	}
}
