package deob;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.zip.CRC32;
import java.util.zip.GZIPInputStream;
import sign.signlink;

@ObfuscatedName("ub")
public class class47 extends class46 implements Runnable {

	@ObfuscatedName("ub.f")
	public int[][] field710 = new int[4][];

	@ObfuscatedName("ub.g")
	public int[][] field711 = new int[4][];

	@ObfuscatedName("ub.h")
	public byte[][] field712 = new byte[4][];

	@ObfuscatedName("ub.i")
	public int field713;

	@ObfuscatedName("ub.j")
	public byte[] field714;

	@ObfuscatedName("ub.k")
	public int[] field715;

	@ObfuscatedName("ub.l")
	public int[] field716;

	@ObfuscatedName("ub.m")
	public int[] field717;

	@ObfuscatedName("ub.n")
	public int[] field718;

	@ObfuscatedName("ub.o")
	public int[] field719;

	@ObfuscatedName("ub.p")
	public int[] field720;

	@ObfuscatedName("ub.q")
	public boolean field721 = true;

	@ObfuscatedName("ub.r")
	public client field722;

	@ObfuscatedName("ub.s")
	public CRC32 field723 = new CRC32();

	@ObfuscatedName("ub.t")
	public boolean field724 = false;

	@ObfuscatedName("ub.u")
	public int field725;

	@ObfuscatedName("ub.v")
	public int field726;

	@ObfuscatedName("ub.w")
	public class42 field727 = new class42();

	@ObfuscatedName("ub.x")
	public class41 field728 = new class41();

	@ObfuscatedName("ub.y")
	public class41 field729 = new class41();

	@ObfuscatedName("ub.z")
	public class41 field730 = new class41();

	@ObfuscatedName("ub.A")
	public class41 field731 = new class41();

	@ObfuscatedName("ub.B")
	public class41 field732 = new class41();

	@ObfuscatedName("ub.C")
	public String field733 = "";

	@ObfuscatedName("ub.M")
	public byte[] field743 = new byte[500];

	@ObfuscatedName("ub.N")
	public byte[] field744 = new byte[65000];

	@ObfuscatedName("ub.D")
	public int field734;

	@ObfuscatedName("ub.E")
	public int field735;

	@ObfuscatedName("ub.I")
	public int field739;

	@ObfuscatedName("ub.K")
	public int field741;

	@ObfuscatedName("ub.L")
	public int field742;

	@ObfuscatedName("ub.O")
	public int field745;

	@ObfuscatedName("ub.P")
	public int field746;

	@ObfuscatedName("ub.R")
	public int field748;

	@ObfuscatedName("ub.Q")
	public long field747;

	@ObfuscatedName("ub.J")
	public class39 field740;

	@ObfuscatedName("ub.G")
	public InputStream field737;

	@ObfuscatedName("ub.H")
	public OutputStream field738;

	@ObfuscatedName("ub.F")
	public Socket field736;

	@ObfuscatedName("ub.a(Lxb;Lclient;)V")
	public final void method270(class50 arg0, client arg1) {
		String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		for (int var4 = 0; var4 < 4; var4++) {
			byte[] var5 = arg0.method299(var3[var4], null);
			int var6 = var5.length / 2;
			class38 var7 = new class38(var5);
			field710[var4] = new int[var6];
			field712[var4] = new byte[var6];

			for (int var8 = 0; var8 < var6; var8++) {
				field710[var4][var8] = var7.method231();
			}
		}

		String[] var9 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
		for (int var10 = 0; var10 < 4; var10++) {
			byte[] var11 = arg0.method299(var9[var10], null);
			int var12 = var11.length / 4;
			class38 var13 = new class38(var11);
			field711[var10] = new int[var12];
			for (int var14 = 0; var14 < var12; var14++) {
				field711[var10][var14] = var13.method234();
			}
		}

		byte[] var15 = arg0.method299("model_index", null);
		int var16 = field710[0].length;
		field714 = new byte[var16];
		for (int var17 = 0; var17 < var16; var17++) {
			if (var17 < var15.length) {
				field714[var17] = var15[var17];
			} else {
				field714[var17] = 0;
			}
		}

		byte[] var18 = arg0.method299("map_index", null);
		class38 var19 = new class38(var18);
		int var20 = var18.length / 7;
		field715 = new int[var20];
		field716 = new int[var20];
		field717 = new int[var20];
		field718 = new int[var20];
		for (int var21 = 0; var21 < var20; var21++) {
			field715[var21] = var19.method231();
			field716[var21] = var19.method231();
			field717[var21] = var19.method231();
			field718[var21] = var19.method229();
		}

		byte[] var22 = arg0.method299("anim_index", null);
		class38 var23 = new class38(var22);
		int var24 = var22.length / 2;
		field719 = new int[var24];
		for (int var25 = 0; var25 < var24; var25++) {
			field719[var25] = var23.method231();
		}

		byte[] var26 = arg0.method299("midi_index", null);
		class38 var27 = new class38(var26);
		int var28 = var26.length;
		field720 = new int[var28];
		for (int var29 = 0; var29 < var28; var29++) {
			field720[var29] = var27.method229();
		}

		field722 = arg1;
		field721 = true;
		field722.method12(this, 2);
	}

	@ObfuscatedName("ub.a()V")
	public final void method271() {
		field721 = false;
	}

	@ObfuscatedName("ub.a(II)I")
	public final int method272(int arg0) {
		return field710[arg0].length;
	}

	@ObfuscatedName("ub.b(I)I")
	public final int method273() {
		return field719.length;
	}

	@ObfuscatedName("ub.a(ZIII)I")
	public final int method274(int arg0, int arg1, int arg2) {
		int var4 = (arg1 << 8) + arg0;
		for (int var5 = 0; var5 < field715.length; var5++) {
			if (field715[var5] == var4) {
				if (arg2 == 0) {
					return field716[var5];
				}

				return field717[var5];
			}
		}

		return -1;
	}

	@ObfuscatedName("ub.a(IZ)V")
	public final void method275(boolean arg0) {
		int var2 = field715.length;
		for (int var3 = 0; var3 < var2; var3++) {
			if (arg0 || field718[var3] != 0) {
				method282(field717[var3], (byte) 2, 3);
				method282(field716[var3], (byte) 2, 3);
			}
		}
	}

	@ObfuscatedName("ub.b(II)Z")
	public final boolean method276(int arg0) {
		for (int var2 = 0; var2 < field715.length; var2++) {
			if (field717[var2] == arg0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("ub.b(IZ)I")
	public final int method277(int arg0) {
		return field714[arg0] & 0xFF;
	}

	@ObfuscatedName("ub.a(ZI)Z")
	public final boolean method278(int arg0) {
		if (field720[arg0] == 1) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("ub.a(I)V")
	public final void method269(int arg0) {
		method279(0, arg0);
	}

	@ObfuscatedName("ub.c(II)V")
	public final void method279(int arg0, int arg1) {
		if (arg0 >= 0 && arg0 <= field710.length && arg1 >= 0 && arg1 <= field710[arg0].length && field710[arg0][arg1] != 0) {
			synchronized (field727) {
				for (class39 var4 = (class39) field727.method255(); var4 != null; var4 = (class39) field727.method256()) {
					if (var4.field634 == arg0 && var4.field635 == arg1) {
						return;
					}
				}

				class39 var5 = new class39();
				var5.field634 = arg0;
				var5.field635 = arg1;
				var5.field638 = true;

				synchronized (field728) {
					field728.method245(var5);
				}

				field727.method253(var5);
			}
		}
	}

	@ObfuscatedName("ub.b()I")
	public final int method280() {
		synchronized (field727) {
			return field727.method257();
		}
	}

	@ObfuscatedName("ub.c()Lmb;")
	public final class39 method281() {
		class39 var2;
		synchronized (field731) {
			var2 = (class39) field731.method247();
		}

		if (var2 == null) {
			return null;
		}

		synchronized (field727) {
			var2.method107();
		}

		if (var2.field636 == null) {
			return var2;
		}

		int var4 = 0;
		try {
			GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field636));
			while (true) {
				if (field744.length == var4) {
					throw new RuntimeException("buffer overflow!");
				}

				int var6 = var5.read(field744, var4, field744.length - var4);
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
			var2.field636[var7] = field744[var7];
		}

		return var2;
	}

	@ObfuscatedName("ub.a(IZBI)V")
	public final void method282(int arg0, byte arg1, int arg2) {
		if (field722.field1093[0] != null && field710[arg2][arg0] != 0) {
			byte[] var4 = field722.field1093[arg2 + 1].method291(arg0);
			if (!method289(field711[arg2][arg0], field710[arg2][arg0], var4)) {
				field712[arg2][arg0] = arg1;

				if (arg1 > field713) {
					field713 = arg1;
				}

				field735++;
			}
		}
	}

	@ObfuscatedName("ub.c(I)V")
	public final void method283() {
		synchronized (field732) {
			field732.method252();
		}
	}

	@ObfuscatedName("ub.a(ZII)V")
	public final void method284(int arg0, int arg1) {
		if (field722.field1093[0] != null && (field710[arg0][arg1] != 0 && (field712[arg0][arg1] != 0 && field713 != 0))) {
			class39 var3 = new class39();
			var3.field634 = arg0;
			var3.field635 = arg1;
			var3.field638 = false;

			synchronized (field732) {
				field732.method245(var3);
			}
		}
	}

	public final void run() {
		try {
			while (field721) {
				field748++;
				byte var1 = 20;
				if (field713 == 0 && field722.field1093[0] != null) {
					var1 = 50;
				}

				try {
					Thread.sleep(var1);
				} catch (Exception var9) {
				}

				field724 = true;
				for (int var2 = 0; var2 < 100 && field724; var2++) {
					field724 = false;
					method285();
					method286();

					if (field725 == 0 && var2 >= 5) {
						break;
					}

					method287();

					if (field737 != null) {
						method288();
					}
				}

				boolean var3 = false;
				for (class39 var4 = (class39) field730.method248(); var4 != null; var4 = (class39) field730.method250()) {
					if (var4.field638) {
						var3 = true;
						var4.field637++;
						if (var4.field637 > 50) {
							var4.field637 = 0;
							method290(var4);
						}
					}
				}

				if (!var3) {
					for (class39 var5 = (class39) field730.method248(); var5 != null; var5 = (class39) field730.method250()) {
						var3 = true;
						var5.field637++;
						if (var5.field637 > 50) {
							var5.field637 = 0;
							method290(var5);
						}
					}
				}

				if (var3) {
					field745++;
					if (field745 > 750) {
						try {
							field736.close();
						} catch (Exception var8) {
						}

						field736 = null;
						field737 = null;
						field738 = null;
						field742 = 0;
					}
				} else {
					field745 = 0;
					field733 = "";
				}

				if (field722.field1263 && field736 != null && field738 != null && (field713 > 0 || field722.field1093[0] == null)) {
					field746++;
					if (field746 > 500) {
						field746 = 0;
						field743[0] = 0;
						field743[1] = 0;
						field743[2] = 0;
						field743[3] = 10;
						try {
							field738.write(field743, 0, 4);
						} catch (IOException var7) {
							field745 = 5000;
						}
					}
				}
			}
		} catch (Exception var10) {
			signlink.reporterror("od_ex " + var10.getMessage());
		}
	}

	@ObfuscatedName("ub.d(I)V")
	public final void method285() {
		class39 var2;
		synchronized (field728) {
			var2 = (class39) field728.method247();
		}

		while (var2 != null) {
			field724 = true;
			byte[] var3 = null;
			if (field722.field1093[0] != null) {
				var3 = field722.field1093[var2.field634 + 1].method291(var2.field635);
			}

			if (!method289(field711[var2.field634][var2.field635], field710[var2.field634][var2.field635], var3)) {
				var3 = null;
			}

			synchronized (field728) {
				if (var3 == null) {
					field729.method245(var2);
				} else {
					var2.field636 = var3;

					synchronized (field731) {
						field731.method245(var2);
					}
				}

				var2 = (class39) field728.method247();
			}
		}
	}

	@ObfuscatedName("ub.e(I)V")
	public final void method286() {
		field725 = 0;
		field726 = 0;
		for (class39 var1 = (class39) field730.method248(); var1 != null; var1 = (class39) field730.method250()) {
			if (var1.field638) {
				field725++;
			} else {
				field726++;
			}
		}

		while (field725 < 10) {
			class39 var2 = (class39) field729.method247();
			if (var2 == null) {
				break;
			}

			if (field712[var2.field634][var2.field635] != 0) {
				field734++;
			}

			field712[var2.field634][var2.field635] = 0;
			field730.method245(var2);
			field725++;
			method290(var2);
			field724 = true;
		}
	}

	@ObfuscatedName("ub.a(B)V")
	public final void method287() {
		while (field725 == 0) {
			if (field726 >= 10 || field713 == 0) {
				return;
			}

			class39 var2;
			synchronized (field732) {
				var2 = (class39) field732.method247();
			}

			while (var2 != null) {
				if (field712[var2.field634][var2.field635] != 0) {
					field712[var2.field634][var2.field635] = 0;
					field730.method245(var2);
					method290(var2);
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
					var2 = (class39) field732.method247();
				}
			}

			for (int var4 = 0; var4 < 4; var4++) {
				byte[] var5 = field712[var4];
				int var6 = var5.length;
				for (int var7 = 0; var7 < var6; var7++) {
					if (var5[var7] == field713) {
						var5[var7] = 0;
						class39 var8 = new class39();
						var8.field634 = var4;
						var8.field635 = var7;
						var8.field638 = false;
						field730.method245(var8);
						method290(var8);
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

	@ObfuscatedName("ub.f(I)V")
	public final void method288() {
		try {
			int var1 = field737.available();
			if (field742 == 0 && var1 >= 6) {
				field724 = true;

				for (int var2 = 0; var2 < 6; var2 += field737.read(field743, var2, 6 - var2)) {
				}

				int var3 = field743[0] & 0xFF;
				int var4 = ((field743[1] & 0xFF) << 8) + (field743[2] & 0xFF);
				int var5 = ((field743[3] & 0xFF) << 8) + (field743[4] & 0xFF);
				int var6 = field743[5] & 0xFF;
				field740 = null;
				for (class39 var7 = (class39) field730.method248(); var7 != null; var7 = (class39) field730.method250()) {
					if (var7.field634 == var3 && var7.field635 == var4) {
						field740 = var7;
					}

					if (field740 != null) {
						var7.field637 = 0;
					}
				}

				if (field740 != null) {
					field745 = 0;

					if (var5 == 0) {
						signlink.reporterror("Rej: " + var3 + "," + var4);
						field740.field636 = null;

						if (field740.field638) {
							synchronized (field731) {
								field731.method245(field740);
							}
						} else {
							field740.method106();
						}

						field740 = null;
					} else {
						if (field740.field636 == null && var6 == 0) {
							field740.field636 = new byte[var5];
						}

						if (field740.field636 == null && var6 != 0) {
							throw new IOException("missing start of file");
						}
					}
				}

				field741 = var6 * 500;
				field742 = 500;
				if (field742 > var5 - var6 * 500) {
					field742 = var5 - var6 * 500;
				}
			}

			if (field742 > 0 && var1 >= field742) {
				field724 = true;
				byte[] var9 = field743;
				int var10 = 0;
				if (field740 != null) {
					var9 = field740.field636;
					var10 = field741;
				}

				for (int var11 = 0; var11 < field742; var11 += field737.read(var9, var10 + var11, field742 - var11)) {
				}

				if (field742 + field741 >= var9.length && field740 != null) {
					if (field722.field1093[0] != null) {
						field722.field1093[field740.field634 + 1].method292(field740.field635, var9.length, var9);
					}

					if (!field740.field638 && field740.field634 == 3) {
						field740.field638 = true;
						field740.field634 = 93;
					}

					if (field740.field638) {
						synchronized (field731) {
							field731.method245(field740);
						}
					} else {
						field740.method106();
					}
				}

				field742 = 0;
			}
		} catch (IOException var17) {
			try {
				field736.close();
			} catch (Exception var14) {
			}

			field736 = null;
			field737 = null;
			field738 = null;
			field742 = 0;
		}
	}

	@ObfuscatedName("ub.a(IIZ[B)Z")
	public final boolean method289(int arg0, int arg1, byte[] arg2) {
		if (arg2 != null && arg2.length >= 2) {
			int var4 = arg2.length - 2;
			int var5 = ((arg2[var4] & 0xFF) << 8) + (arg2[var4 + 1] & 0xFF);
			field723.reset();
			field723.update(arg2, 0, var4);
			int var6 = (int) field723.getValue();

			if (arg1 != var5) {
				return false;
			}

			if (arg0 != var6) {
				return false;
			}

			return true;
		}

		return false;
	}

	@ObfuscatedName("ub.a(BLmb;)V")
	public final void method290(class39 arg0) {
		try {
			if (field736 == null) {
				long var2 = System.currentTimeMillis();
				if (var2 - field747 < 4000L) {
					return;
				}

				field747 = var2;
				field736 = field722.method500(client.field1308 + 43594);
				field737 = field736.getInputStream();
				field738 = field736.getOutputStream();
				field738.write(15);

				for (int var4 = 0; var4 < 8; var4++) {
					field737.read();
				}

				field745 = 0;
			}

			field743[0] = (byte) arg0.field634;
			field743[1] = (byte) (arg0.field635 >> 8);
			field743[2] = (byte) arg0.field635;
			if (arg0.field638) {
				field743[3] = 2;
			} else if (field722.field1263) {
				field743[3] = 0;
			} else {
				field743[3] = 1;
			}

			field738.write(field743, 0, 4);
			field746 = 0;
			field739 = -10000;
		} catch (IOException var7) {
			try {
				field736.close();
			} catch (Exception var6) {
			}

			field736 = null;
			field737 = null;
			field738 = null;
			field742 = 0;
			field739++;
		}
	}
}
