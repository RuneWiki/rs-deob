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

	@ObfuscatedName("vb.h")
	public int[][] field710 = new int[4][];

	@ObfuscatedName("vb.i")
	public int[][] field711 = new int[4][];

	@ObfuscatedName("vb.j")
	public byte[][] field712 = new byte[4][];

	@ObfuscatedName("vb.k")
	public int field713;

	@ObfuscatedName("vb.l")
	public byte[] field714;

	@ObfuscatedName("vb.m")
	public int[] field715;

	@ObfuscatedName("vb.n")
	public int[] field716;

	@ObfuscatedName("vb.o")
	public int[] field717;

	@ObfuscatedName("vb.p")
	public int[] field718;

	@ObfuscatedName("vb.q")
	public int[] field719;

	@ObfuscatedName("vb.r")
	public int[] field720;

	@ObfuscatedName("vb.s")
	public boolean field721 = true;

	@ObfuscatedName("vb.t")
	public client field722;

	@ObfuscatedName("vb.u")
	public CRC32 field723 = new CRC32();

	@ObfuscatedName("vb.v")
	public boolean field724 = false;

	@ObfuscatedName("vb.w")
	public int field725;

	@ObfuscatedName("vb.x")
	public int field726;

	@ObfuscatedName("vb.y")
	public class43 field727 = new class43();

	@ObfuscatedName("vb.z")
	public class42 field728 = new class42();

	@ObfuscatedName("vb.A")
	public class42 field729 = new class42();

	@ObfuscatedName("vb.B")
	public class42 field730 = new class42();

	@ObfuscatedName("vb.C")
	public class42 field731 = new class42();

	@ObfuscatedName("vb.D")
	public class42 field732 = new class42();

	@ObfuscatedName("vb.E")
	public String field733 = "";

	@ObfuscatedName("vb.N")
	public byte[] field742 = new byte[500];

	@ObfuscatedName("vb.O")
	public byte[] field743 = new byte[65000];

	@ObfuscatedName("vb.F")
	public int field734;

	@ObfuscatedName("vb.G")
	public int field735;

	@ObfuscatedName("vb.L")
	public int field740;

	@ObfuscatedName("vb.M")
	public int field741;

	@ObfuscatedName("vb.P")
	public int field744;

	@ObfuscatedName("vb.Q")
	public int field745;

	@ObfuscatedName("vb.S")
	public int field747;

	@ObfuscatedName("vb.R")
	public long field746;

	@ObfuscatedName("vb.K")
	public class40 field739;

	@ObfuscatedName("vb.I")
	public InputStream field737;

	@ObfuscatedName("vb.J")
	public OutputStream field738;

	@ObfuscatedName("vb.H")
	public Socket field736;

	@ObfuscatedName("vb.a(Lyb;Lclient;)V")
	public final void method279(class51 arg0, client arg1) {
		String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		for (int var4 = 0; var4 < 4; var4++) {
			byte[] var5 = arg0.method308(var3[var4], null);
			int var6 = var5.length / 2;
			class39 var7 = new class39(var5);
			field710[var4] = new int[var6];
			field712[var4] = new byte[var6];

			for (int var8 = 0; var8 < var6; var8++) {
				field710[var4][var8] = var7.method240();
			}
		}

		String[] var9 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
		for (int var10 = 0; var10 < 4; var10++) {
			byte[] var11 = arg0.method308(var9[var10], null);
			int var12 = var11.length / 4;
			class39 var13 = new class39(var11);
			field711[var10] = new int[var12];
			for (int var14 = 0; var14 < var12; var14++) {
				field711[var10][var14] = var13.method243();
			}
		}

		byte[] var15 = arg0.method308("model_index", null);
		int var16 = field710[0].length;
		field714 = new byte[var16];
		for (int var17 = 0; var17 < var16; var17++) {
			if (var17 < var15.length) {
				field714[var17] = var15[var17];
			} else {
				field714[var17] = 0;
			}
		}

		byte[] var18 = arg0.method308("map_index", null);
		class39 var19 = new class39(var18);
		int var20 = var18.length / 7;
		field715 = new int[var20];
		field716 = new int[var20];
		field717 = new int[var20];
		field718 = new int[var20];
		for (int var21 = 0; var21 < var20; var21++) {
			field715[var21] = var19.method240();
			field716[var21] = var19.method240();
			field717[var21] = var19.method240();
			field718[var21] = var19.method238();
		}

		byte[] var22 = arg0.method308("anim_index", null);
		class39 var23 = new class39(var22);
		int var24 = var22.length / 2;
		field719 = new int[var24];
		for (int var25 = 0; var25 < var24; var25++) {
			field719[var25] = var23.method240();
		}

		byte[] var26 = arg0.method308("midi_index", null);
		class39 var27 = new class39(var26);
		int var28 = var26.length;
		field720 = new int[var28];
		for (int var29 = 0; var29 < var28; var29++) {
			field720[var29] = var27.method238();
		}

		field722 = arg1;
		field721 = true;
		field722.method12(this, 2);
	}

	@ObfuscatedName("vb.a()V")
	public final void method280() {
		field721 = false;
	}

	@ObfuscatedName("vb.a(II)I")
	public final int method281(int arg0) {
		return field710[arg0].length;
	}

	@ObfuscatedName("vb.b(I)I")
	public final int method282() {
		return field719.length;
	}

	@ObfuscatedName("vb.a(IIII)I")
	public final int method283(int arg0, int arg1, int arg2) {
		int var4 = (arg1 << 8) + arg2;
		for (int var5 = 0; var5 < field715.length; var5++) {
			if (field715[var5] == var4) {
				if (arg0 == 0) {
					return field716[var5];
				}

				return field717[var5];
			}
		}

		return -1;
	}

	@ObfuscatedName("vb.a(IZ)V")
	public final void method284(boolean arg0) {
		int var2 = field715.length;
		for (int var3 = 0; var3 < var2; var3++) {
			if (arg0 || field718[var3] != 0) {
				method291(field717[var3], 3, (byte) 2);
				method291(field716[var3], 3, (byte) 2);
			}
		}
	}

	@ObfuscatedName("vb.b(II)Z")
	public final boolean method285(int arg0) {
		for (int var2 = 0; var2 < field715.length; var2++) {
			if (field717[var2] == arg0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("vb.c(II)I")
	public final int method286(int arg0) {
		return field714[arg0] & 0xFF;
	}

	@ObfuscatedName("vb.d(II)Z")
	public final boolean method287(int arg0) {
		if (field720[arg0] == 1) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("vb.a(I)V")
	public final void method278(int arg0) {
		method288(0, arg0);
	}

	@ObfuscatedName("vb.e(II)V")
	public final void method288(int arg0, int arg1) {
		if (arg0 >= 0 && arg0 <= field710.length && arg1 >= 0 && arg1 <= field710[arg0].length && field710[arg0][arg1] != 0) {
			synchronized (field727) {
				for (class40 var4 = (class40) field727.method264(); var4 != null; var4 = (class40) field727.method265()) {
					if (var4.field634 == arg0 && var4.field635 == arg1) {
						return;
					}
				}

				class40 var5 = new class40();
				var5.field634 = arg0;
				var5.field635 = arg1;
				var5.field638 = true;

				synchronized (field728) {
					field728.method254(var5);
				}

				field727.method262(var5);
			}
		}
	}

	@ObfuscatedName("vb.b()I")
	public final int method289() {
		synchronized (field727) {
			return field727.method266();
		}
	}

	@ObfuscatedName("vb.c()Lnb;")
	public final class40 method290() {
		class40 var2;
		synchronized (field731) {
			var2 = (class40) field731.method256();
		}

		if (var2 == null) {
			return null;
		}

		synchronized (field727) {
			var2.method120();
		}

		if (var2.field636 == null) {
			return var2;
		}

		int var4 = 0;
		try {
			GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field636));
			while (true) {
				if (field743.length == var4) {
					throw new RuntimeException("buffer overflow!");
				}

				int var6 = var5.read(field743, var4, field743.length - var4);
				if (var6 == -1) {
					break;
				}

				var4 += var6;
			}
		} catch (IOException var10) {
			throw new RuntimeException("error unzipping");
		}

		var2.field636 = new byte[var4];
		for (int var7 = 0; var7 < var4; var7++) {
			var2.field636[var7] = field743[var7];
		}

		return var2;
	}

	@ObfuscatedName("vb.a(IIBI)V")
	public final void method291(int arg0, int arg1, byte arg2) {
		if (field722.field1132[0] != null && field710[arg1][arg0] != 0) {
			byte[] var4 = field722.field1132[arg1 + 1].method300(arg0);
			if (!method298(var4, field711[arg1][arg0], field710[arg1][arg0])) {
				field712[arg1][arg0] = arg2;

				if (arg2 > field713) {
					field713 = arg2;
				}

				field735++;
			}
		}
	}

	@ObfuscatedName("vb.a(Z)V")
	public final void method292() {
		synchronized (field732) {
			field732.method261();
		}
	}

	@ObfuscatedName("vb.a(III)V")
	public final void method293(int arg0, int arg1) {
		if (field722.field1132[0] != null && (field710[arg1][arg0] != 0 && (field712[arg1][arg0] != 0 && field713 != 0))) {
			class40 var3 = new class40();
			var3.field634 = arg1;
			var3.field635 = arg0;
			var3.field638 = false;

			synchronized (field732) {
				field732.method254(var3);
			}
		}
	}

	public final void run() {
		try {
			while (field721) {
				field747++;
				byte var1 = 20;
				if (field713 == 0 && field722.field1132[0] != null) {
					var1 = 50;
				}

				try {
					Thread.sleep(var1);
				} catch (Exception var9) {
				}

				field724 = true;
				for (int var2 = 0; var2 < 100 && field724; var2++) {
					field724 = false;
					method294();
					method295();

					if (field725 == 0 && var2 >= 5) {
						break;
					}

					method296();

					if (field737 != null) {
						method297();
					}
				}

				boolean var3 = false;
				for (class40 var4 = (class40) field730.method257(); var4 != null; var4 = (class40) field730.method259()) {
					if (var4.field638) {
						var3 = true;
						var4.field637++;
						if (var4.field637 > 50) {
							var4.field637 = 0;
							method299(var4);
						}
					}
				}

				if (!var3) {
					for (class40 var5 = (class40) field730.method257(); var5 != null; var5 = (class40) field730.method259()) {
						var3 = true;
						var5.field637++;
						if (var5.field637 > 50) {
							var5.field637 = 0;
							method299(var5);
						}
					}
				}

				if (var3) {
					field744++;
					if (field744 > 750) {
						try {
							field736.close();
						} catch (Exception var8) {
						}

						field736 = null;
						field737 = null;
						field738 = null;
						field741 = 0;
					}
				} else {
					field744 = 0;
					field733 = "";
				}

				if (field722.field1190 && field736 != null && field738 != null && (field713 > 0 || field722.field1132[0] == null)) {
					field745++;
					if (field745 > 500) {
						field745 = 0;
						field742[0] = 0;
						field742[1] = 0;
						field742[2] = 0;
						field742[3] = 10;
						try {
							field738.write(field742, 0, 4);
						} catch (IOException var7) {
							field744 = 5000;
						}
					}
				}
			}
		} catch (Exception var10) {
			signlink.reporterror("od_ex " + var10.getMessage());
		}
	}

	@ObfuscatedName("vb.b(Z)V")
	public final void method294() {
		class40 var2;
		synchronized (field728) {
			var2 = (class40) field728.method256();
		}

		while (var2 != null) {
			field724 = true;
			byte[] var3 = null;
			if (field722.field1132[0] != null) {
				var3 = field722.field1132[var2.field634 + 1].method300(var2.field635);
			}

			if (!method298(var3, field711[var2.field634][var2.field635], field710[var2.field634][var2.field635])) {
				var3 = null;
			}

			synchronized (field728) {
				if (var3 == null) {
					field729.method254(var2);
				} else {
					var2.field636 = var3;

					synchronized (field731) {
						field731.method254(var2);
					}
				}

				var2 = (class40) field728.method256();
			}
		}
	}

	@ObfuscatedName("vb.c(I)V")
	public final void method295() {
		field725 = 0;
		field726 = 0;
		for (class40 var1 = (class40) field730.method257(); var1 != null; var1 = (class40) field730.method259()) {
			if (var1.field638) {
				field725++;
			} else {
				field726++;
			}
		}

		while (field725 < 10) {
			class40 var2 = (class40) field729.method256();
			if (var2 == null) {
				break;
			}

			if (field712[var2.field634][var2.field635] != 0) {
				field734++;
			}

			field712[var2.field634][var2.field635] = 0;
			field730.method254(var2);
			field725++;
			method299(var2);
			field724 = true;
		}
	}

	@ObfuscatedName("vb.c(Z)V")
	public final void method296() {
		while (field725 == 0) {
			if (field726 >= 10 || field713 == 0) {
				return;
			}

			class40 var2;
			synchronized (field732) {
				var2 = (class40) field732.method256();
			}

			while (var2 != null) {
				if (field712[var2.field634][var2.field635] != 0) {
					field712[var2.field634][var2.field635] = 0;
					field730.method254(var2);
					method299(var2);
					field724 = true;

					if (field734 < field735) {
						field734++;
					}

					field733 = "Loading extra files - " + field734 * 100 / field735 + "%";
					field726++;
					if (field726 == 10) {
						return;
					}
				}

				synchronized (field732) {
					var2 = (class40) field732.method256();
				}
			}

			for (int var4 = 0; var4 < 4; var4++) {
				byte[] var5 = field712[var4];
				int var6 = var5.length;
				for (int var7 = 0; var7 < var6; var7++) {
					if (var5[var7] == field713) {
						var5[var7] = 0;
						class40 var8 = new class40();
						var8.field634 = var4;
						var8.field635 = var7;
						var8.field638 = false;
						field730.method254(var8);
						method299(var8);
						field724 = true;

						if (field734 < field735) {
							field734++;
						}

						field733 = "Loading extra files - " + field734 * 100 / field735 + "%";
						field726++;
						if (field726 == 10) {
							return;
						}
					}
				}
			}

			field713--;
		}
	}

	@ObfuscatedName("vb.d(I)V")
	public final void method297() {
		try {
			int var1 = field737.available();
			if (field741 == 0 && var1 >= 6) {
				field724 = true;

				for (int var2 = 0; var2 < 6; var2 += field737.read(field742, var2, 6 - var2)) {
				}

				int var3 = field742[0] & 0xFF;
				int var4 = ((field742[1] & 0xFF) << 8) + (field742[2] & 0xFF);
				int var5 = ((field742[3] & 0xFF) << 8) + (field742[4] & 0xFF);
				int var6 = field742[5] & 0xFF;
				field739 = null;
				for (class40 var7 = (class40) field730.method257(); var7 != null; var7 = (class40) field730.method259()) {
					if (var7.field634 == var3 && var7.field635 == var4) {
						field739 = var7;
					}

					if (field739 != null) {
						var7.field637 = 0;
					}
				}

				if (field739 != null) {
					field744 = 0;

					if (var5 == 0) {
						signlink.reporterror("Rej: " + var3 + "," + var4);
						field739.field636 = null;

						if (field739.field638) {
							synchronized (field731) {
								field731.method254(field739);
							}
						} else {
							field739.method119();
						}

						field739 = null;
					} else {
						if (field739.field636 == null && var6 == 0) {
							field739.field636 = new byte[var5];
						}

						if (field739.field636 == null && var6 != 0) {
							throw new IOException("missing start of file");
						}
					}
				}

				field740 = var6 * 500;
				field741 = 500;
				if (field741 > var5 - var6 * 500) {
					field741 = var5 - var6 * 500;
				}
			}

			if (field741 > 0 && var1 >= field741) {
				field724 = true;
				byte[] var9 = field742;
				int var10 = 0;
				if (field739 != null) {
					var9 = field739.field636;
					var10 = field740;
				}

				for (int var11 = 0; var11 < field741; var11 += field737.read(var9, var10 + var11, field741 - var11)) {
				}

				if (field741 + field740 >= var9.length && field739 != null) {
					if (field722.field1132[0] != null) {
						field722.field1132[field739.field634 + 1].method301(var9, field739.field635, var9.length);
					}

					if (!field739.field638 && field739.field634 == 3) {
						field739.field638 = true;
						field739.field634 = 93;
					}

					if (field739.field638) {
						synchronized (field731) {
							field731.method254(field739);
						}
					} else {
						field739.method119();
					}
				}

				field741 = 0;
			}
		} catch (IOException var17) {
			try {
				field736.close();
			} catch (Exception var14) {
			}

			field736 = null;
			field737 = null;
			field738 = null;
			field741 = 0;
		}
	}

	@ObfuscatedName("vb.a([BIII)Z")
	public final boolean method298(byte[] arg0, int arg1, int arg2) {
		if (arg0 != null && arg0.length >= 2) {
			int var4 = arg0.length - 2;
			int var5 = ((arg0[var4] & 0xFF) << 8) + (arg0[var4 + 1] & 0xFF);
			field723.reset();
			field723.update(arg0, 0, var4);
			int var6 = (int) field723.getValue();

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

	@ObfuscatedName("vb.a(Lnb;B)V")
	public final void method299(class40 arg0) {
		try {
			if (field736 == null) {
				long var2 = System.currentTimeMillis();
				if (var2 - field746 < 5000L) {
					return;
				}

				field746 = var2;
				field736 = field722.method556(client.field1296 + 43594);
				field737 = field736.getInputStream();
				field738 = field736.getOutputStream();
				field738.write(15);

				for (int var4 = 0; var4 < 8; var4++) {
					field737.read();
				}

				field744 = 0;
			}

			field742[0] = (byte) arg0.field634;
			field742[1] = (byte) (arg0.field635 >> 8);
			field742[2] = (byte) arg0.field635;
			if (arg0.field638) {
				field742[3] = 2;
			} else if (field722.field1190) {
				field742[3] = 0;
			} else {
				field742[3] = 1;
			}

			field738.write(field742, 0, 4);
			field745 = 0;
		} catch (IOException var7) {
			try {
				field736.close();
			} catch (Exception var6) {
			}

			field736 = null;
			field737 = null;
			field738 = null;
			field741 = 0;
		}
	}
}
