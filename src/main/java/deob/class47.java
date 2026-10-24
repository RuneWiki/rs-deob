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

	@ObfuscatedName("ub.h")
	public int[][] field704 = new int[4][];

	@ObfuscatedName("ub.i")
	public int[][] field705 = new int[4][];

	@ObfuscatedName("ub.j")
	public byte[][] field706 = new byte[4][];

	@ObfuscatedName("ub.k")
	public int field707;

	@ObfuscatedName("ub.l")
	public byte[] field708;

	@ObfuscatedName("ub.m")
	public int[] field709;

	@ObfuscatedName("ub.n")
	public int[] field710;

	@ObfuscatedName("ub.o")
	public int[] field711;

	@ObfuscatedName("ub.p")
	public int[] field712;

	@ObfuscatedName("ub.q")
	public int[] field713;

	@ObfuscatedName("ub.r")
	public int[] field714;

	@ObfuscatedName("ub.s")
	public boolean field715 = true;

	@ObfuscatedName("ub.t")
	public client field716;

	@ObfuscatedName("ub.u")
	public CRC32 field717 = new CRC32();

	@ObfuscatedName("ub.v")
	public boolean field718 = false;

	@ObfuscatedName("ub.w")
	public int field719;

	@ObfuscatedName("ub.x")
	public int field720;

	@ObfuscatedName("ub.y")
	public class42 field721 = new class42();

	@ObfuscatedName("ub.z")
	public class41 field722 = new class41();

	@ObfuscatedName("ub.A")
	public class41 field723 = new class41();

	@ObfuscatedName("ub.B")
	public class41 field724 = new class41();

	@ObfuscatedName("ub.C")
	public class41 field725 = new class41();

	@ObfuscatedName("ub.D")
	public class41 field726 = new class41();

	@ObfuscatedName("ub.E")
	public String field727 = "";

	@ObfuscatedName("ub.N")
	public byte[] field736 = new byte[500];

	@ObfuscatedName("ub.O")
	public byte[] field737 = new byte[65000];

	@ObfuscatedName("ub.F")
	public int field728;

	@ObfuscatedName("ub.G")
	public int field729;

	@ObfuscatedName("ub.L")
	public int field734;

	@ObfuscatedName("ub.M")
	public int field735;

	@ObfuscatedName("ub.P")
	public int field738;

	@ObfuscatedName("ub.Q")
	public int field739;

	@ObfuscatedName("ub.S")
	public int field741;

	@ObfuscatedName("ub.R")
	public long field740;

	@ObfuscatedName("ub.K")
	public class39 field733;

	@ObfuscatedName("ub.I")
	public InputStream field731;

	@ObfuscatedName("ub.J")
	public OutputStream field732;

	@ObfuscatedName("ub.H")
	public Socket field730;

	@ObfuscatedName("ub.a(Lxb;Lclient;)V")
	public final void method265(class50 arg0, client arg1) {
		String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		for (int var4 = 0; var4 < 4; var4++) {
			byte[] var5 = arg0.method294(var3[var4], null);
			int var6 = var5.length / 2;
			class38 var7 = new class38(var5);
			field704[var4] = new int[var6];
			field706[var4] = new byte[var6];

			for (int var8 = 0; var8 < var6; var8++) {
				field704[var4][var8] = var7.method226();
			}
		}

		String[] var9 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
		for (int var10 = 0; var10 < 4; var10++) {
			byte[] var11 = arg0.method294(var9[var10], null);
			int var12 = var11.length / 4;
			class38 var13 = new class38(var11);
			field705[var10] = new int[var12];
			for (int var14 = 0; var14 < var12; var14++) {
				field705[var10][var14] = var13.method229();
			}
		}

		byte[] var15 = arg0.method294("model_index", null);
		int var16 = field704[0].length;
		field708 = new byte[var16];
		for (int var17 = 0; var17 < var16; var17++) {
			if (var17 < var15.length) {
				field708[var17] = var15[var17];
			} else {
				field708[var17] = 0;
			}
		}

		byte[] var18 = arg0.method294("map_index", null);
		class38 var19 = new class38(var18);
		int var20 = var18.length / 7;
		field709 = new int[var20];
		field710 = new int[var20];
		field711 = new int[var20];
		field712 = new int[var20];
		for (int var21 = 0; var21 < var20; var21++) {
			field709[var21] = var19.method226();
			field710[var21] = var19.method226();
			field711[var21] = var19.method226();
			field712[var21] = var19.method224();
		}

		byte[] var22 = arg0.method294("anim_index", null);
		class38 var23 = new class38(var22);
		int var24 = var22.length / 2;
		field713 = new int[var24];
		for (int var25 = 0; var25 < var24; var25++) {
			field713[var25] = var23.method226();
		}

		byte[] var26 = arg0.method294("midi_index", null);
		class38 var27 = new class38(var26);
		int var28 = var26.length;
		field714 = new int[var28];
		for (int var29 = 0; var29 < var28; var29++) {
			field714[var29] = var27.method224();
		}

		field716 = arg1;
		field715 = true;
		field716.method12(this, 2);
	}

	@ObfuscatedName("ub.a()V")
	public final void method266() {
		field715 = false;
	}

	@ObfuscatedName("ub.a(II)I")
	public final int method267(int arg0) {
		return field704[arg0].length;
	}

	@ObfuscatedName("ub.b(I)I")
	public final int method268() {
		return field713.length;
	}

	@ObfuscatedName("ub.a(ZIII)I")
	public final int method269(int arg0, int arg1, int arg2) {
		int var4 = (arg2 << 8) + arg0;
		for (int var5 = 0; var5 < field709.length; var5++) {
			if (field709[var5] == var4) {
				if (arg1 == 0) {
					return field710[var5];
				}

				return field711[var5];
			}
		}

		return -1;
	}

	@ObfuscatedName("ub.a(ZI)V")
	public final void method270(boolean arg0) {
		int var2 = field709.length;
		for (int var3 = 0; var3 < var2; var3++) {
			if (arg0 || field712[var3] != 0) {
				method277(3, field711[var3], (byte) 2);
				method277(3, field710[var3], (byte) 2);
			}
		}
	}

	@ObfuscatedName("ub.a(BI)Z")
	public final boolean method271(int arg0) {
		for (int var2 = 0; var2 < field709.length; var2++) {
			if (field711[var2] == arg0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("ub.b(ZI)I")
	public final int method272(int arg0) {
		return field708[arg0] & 0xFF;
	}

	@ObfuscatedName("ub.a(IZ)Z")
	public final boolean method273(int arg0) {
		if (field714[arg0] == 1) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("ub.a(I)V")
	public final void method264(int arg0) {
		method274(0, arg0);
	}

	@ObfuscatedName("ub.b(II)V")
	public final void method274(int arg0, int arg1) {
		if (arg0 >= 0 && arg0 <= field704.length && arg1 >= 0 && arg1 <= field704[arg0].length && field704[arg0][arg1] != 0) {
			synchronized (field721) {
				for (class39 var4 = (class39) field721.method250(); var4 != null; var4 = (class39) field721.method251()) {
					if (var4.field628 == arg0 && var4.field629 == arg1) {
						return;
					}
				}

				class39 var5 = new class39();
				var5.field628 = arg0;
				var5.field629 = arg1;
				var5.field632 = true;

				synchronized (field722) {
					field722.method240(var5);
				}

				field721.method248(var5);
			}
		}
	}

	@ObfuscatedName("ub.b()I")
	public final int method275() {
		synchronized (field721) {
			return field721.method252();
		}
	}

	@ObfuscatedName("ub.c()Lmb;")
	public final class39 method276() {
		class39 var2;
		synchronized (field725) {
			var2 = (class39) field725.method242();
		}

		if (var2 == null) {
			return null;
		}

		synchronized (field721) {
			var2.method107();
		}

		if (var2.field630 == null) {
			return var2;
		}

		int var4 = 0;
		try {
			GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field630));
			while (true) {
				if (field737.length == var4) {
					throw new RuntimeException("buffer overflow!");
				}

				int var6 = var5.read(field737, var4, field737.length - var4);
				if (var6 == -1) {
					break;
				}

				var4 += var6;
			}
		} catch (IOException var10) {
			throw new RuntimeException("error unzipping");
		}

		var2.field630 = new byte[var4];
		for (int var7 = 0; var7 < var4; var7++) {
			var2.field630[var7] = field737[var7];
		}

		return var2;
	}

	@ObfuscatedName("ub.a(IIBI)V")
	public final void method277(int arg0, int arg1, byte arg2) {
		if (field716.field1195[0] != null && field704[arg0][arg1] != 0) {
			byte[] var4 = field716.field1195[arg0 + 1].method286(arg1);
			if (!method284(field705[arg0][arg1], field704[arg0][arg1], var4)) {
				field706[arg0][arg1] = arg2;

				if (arg2 > field707) {
					field707 = arg2;
				}

				field729++;
			}
		}
	}

	@ObfuscatedName("ub.c(I)V")
	public final void method278() {
		synchronized (field726) {
			field726.method247();
		}
	}

	@ObfuscatedName("ub.a(IIZ)V")
	public final void method279(int arg0, int arg1) {
		if (field716.field1195[0] != null && (field704[arg0][arg1] != 0 && (field706[arg0][arg1] != 0 && field707 != 0))) {
			class39 var3 = new class39();
			var3.field628 = arg0;
			var3.field629 = arg1;
			var3.field632 = false;

			synchronized (field726) {
				field726.method240(var3);
			}
		}
	}

	public final void run() {
		try {
			while (field715) {
				field741++;
				byte var1 = 20;
				if (field707 == 0 && field716.field1195[0] != null) {
					var1 = 50;
				}

				try {
					Thread.sleep(var1);
				} catch (Exception var9) {
				}

				field718 = true;
				for (int var2 = 0; var2 < 100 && field718; var2++) {
					field718 = false;
					method280();
					method281();

					if (field719 == 0 && var2 >= 5) {
						break;
					}

					method282();

					if (field731 != null) {
						method283();
					}
				}

				boolean var3 = false;
				for (class39 var4 = (class39) field724.method243(); var4 != null; var4 = (class39) field724.method245()) {
					if (var4.field632) {
						var3 = true;
						var4.field631++;
						if (var4.field631 > 50) {
							var4.field631 = 0;
							method285(var4);
						}
					}
				}

				if (!var3) {
					for (class39 var5 = (class39) field724.method243(); var5 != null; var5 = (class39) field724.method245()) {
						var3 = true;
						var5.field631++;
						if (var5.field631 > 50) {
							var5.field631 = 0;
							method285(var5);
						}
					}
				}

				if (var3) {
					field738++;
					if (field738 > 750) {
						try {
							field730.close();
						} catch (Exception var8) {
						}

						field730 = null;
						field731 = null;
						field732 = null;
						field735 = 0;
					}
				} else {
					field738 = 0;
					field727 = "";
				}

				if (field716.field1320 && field730 != null && field732 != null && (field707 > 0 || field716.field1195[0] == null)) {
					field739++;
					if (field739 > 500) {
						field739 = 0;
						field736[0] = 0;
						field736[1] = 0;
						field736[2] = 0;
						field736[3] = 10;
						try {
							field732.write(field736, 0, 4);
						} catch (IOException var7) {
							field738 = 5000;
						}
					}
				}
			}
		} catch (Exception var10) {
			signlink.reporterror("od_ex " + var10.getMessage());
		}
	}

	@ObfuscatedName("ub.d(I)V")
	public final void method280() {
		class39 var2;
		synchronized (field722) {
			var2 = (class39) field722.method242();
		}

		while (var2 != null) {
			field718 = true;
			byte[] var3 = null;
			if (field716.field1195[0] != null) {
				var3 = field716.field1195[var2.field628 + 1].method286(var2.field629);
			}

			if (!method284(field705[var2.field628][var2.field629], field704[var2.field628][var2.field629], var3)) {
				var3 = null;
			}

			synchronized (field722) {
				if (var3 == null) {
					field723.method240(var2);
				} else {
					var2.field630 = var3;

					synchronized (field725) {
						field725.method240(var2);
					}
				}

				var2 = (class39) field722.method242();
			}
		}
	}

	@ObfuscatedName("ub.a(B)V")
	public final void method281() {
		field719 = 0;
		field720 = 0;
		for (class39 var1 = (class39) field724.method243(); var1 != null; var1 = (class39) field724.method245()) {
			if (var1.field632) {
				field719++;
			} else {
				field720++;
			}
		}

		while (field719 < 10) {
			class39 var2 = (class39) field723.method242();
			if (var2 == null) {
				break;
			}

			if (field706[var2.field628][var2.field629] != 0) {
				field728++;
			}

			field706[var2.field628][var2.field629] = 0;
			field724.method240(var2);
			field719++;
			method285(var2);
			field718 = true;
		}
	}

	@ObfuscatedName("ub.b(B)V")
	public final void method282() {
		while (field719 == 0) {
			if (field720 >= 10 || field707 == 0) {
				return;
			}

			class39 var2;
			synchronized (field726) {
				var2 = (class39) field726.method242();
			}

			while (var2 != null) {
				if (field706[var2.field628][var2.field629] != 0) {
					field706[var2.field628][var2.field629] = 0;
					field724.method240(var2);
					method285(var2);
					field718 = true;

					if (field728 < field729) {
						field728++;
					}

					field727 = "Loading extra files - " + field728 * 100 / field729 + "%";
					field720++;
					if (field720 == 10) {
						return;
					}
				}

				synchronized (field726) {
					var2 = (class39) field726.method242();
				}
			}

			for (int var4 = 0; var4 < 4; var4++) {
				byte[] var5 = field706[var4];
				int var6 = var5.length;
				for (int var7 = 0; var7 < var6; var7++) {
					if (var5[var7] == field707) {
						var5[var7] = 0;
						class39 var8 = new class39();
						var8.field628 = var4;
						var8.field629 = var7;
						var8.field632 = false;
						field724.method240(var8);
						method285(var8);
						field718 = true;

						if (field728 < field729) {
							field728++;
						}

						field727 = "Loading extra files - " + field728 * 100 / field729 + "%";
						field720++;
						if (field720 == 10) {
							return;
						}
					}
				}
			}

			field707--;
		}
	}

	@ObfuscatedName("ub.c(B)V")
	public final void method283() {
		try {
			int var1 = field731.available();
			if (field735 == 0 && var1 >= 6) {
				field718 = true;

				for (int var2 = 0; var2 < 6; var2 += field731.read(field736, var2, 6 - var2)) {
				}

				int var3 = field736[0] & 0xFF;
				int var4 = ((field736[1] & 0xFF) << 8) + (field736[2] & 0xFF);
				int var5 = ((field736[3] & 0xFF) << 8) + (field736[4] & 0xFF);
				int var6 = field736[5] & 0xFF;
				field733 = null;
				for (class39 var7 = (class39) field724.method243(); var7 != null; var7 = (class39) field724.method245()) {
					if (var7.field628 == var3 && var7.field629 == var4) {
						field733 = var7;
					}

					if (field733 != null) {
						var7.field631 = 0;
					}
				}

				if (field733 != null) {
					field738 = 0;

					if (var5 == 0) {
						signlink.reporterror("Rej: " + var3 + "," + var4);
						field733.field630 = null;

						if (field733.field632) {
							synchronized (field725) {
								field725.method240(field733);
							}
						} else {
							field733.method106();
						}

						field733 = null;
					} else {
						if (field733.field630 == null && var6 == 0) {
							field733.field630 = new byte[var5];
						}

						if (field733.field630 == null && var6 != 0) {
							throw new IOException("missing start of file");
						}
					}
				}

				field734 = var6 * 500;
				field735 = 500;
				if (field735 > var5 - var6 * 500) {
					field735 = var5 - var6 * 500;
				}
			}

			if (field735 > 0 && var1 >= field735) {
				field718 = true;
				byte[] var9 = field736;
				int var10 = 0;
				if (field733 != null) {
					var9 = field733.field630;
					var10 = field734;
				}

				for (int var11 = 0; var11 < field735; var11 += field731.read(var9, var10 + var11, field735 - var11)) {
				}

				if (field735 + field734 >= var9.length && field733 != null) {
					if (field716.field1195[0] != null) {
						field716.field1195[field733.field628 + 1].method287(var9, field733.field629, var9.length);
					}

					if (!field733.field632 && field733.field628 == 3) {
						field733.field632 = true;
						field733.field628 = 93;
					}

					if (field733.field632) {
						synchronized (field725) {
							field725.method240(field733);
						}
					} else {
						field733.method106();
					}
				}

				field735 = 0;
			}
		} catch (IOException var17) {
			try {
				field730.close();
			} catch (Exception var14) {
			}

			field730 = null;
			field731 = null;
			field732 = null;
			field735 = 0;
		}
	}

	@ObfuscatedName("ub.a(IBI[B)Z")
	public final boolean method284(int arg0, int arg1, byte[] arg2) {
		if (arg2 != null && arg2.length >= 2) {
			int var4 = arg2.length - 2;
			int var5 = ((arg2[var4] & 0xFF) << 8) + (arg2[var4 + 1] & 0xFF);
			field717.reset();
			field717.update(arg2, 0, var4);
			int var6 = (int) field717.getValue();

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

	@ObfuscatedName("ub.a(Lmb;Z)V")
	public final void method285(class39 arg0) {
		try {
			if (field730 == null) {
				long var2 = System.currentTimeMillis();
				if (var2 - field740 < 5000L) {
					return;
				}

				field740 = var2;
				field730 = field716.method530(client.field1272 + 43594);
				field731 = field730.getInputStream();
				field732 = field730.getOutputStream();
				field732.write(15);

				for (int var4 = 0; var4 < 8; var4++) {
					field731.read();
				}

				field738 = 0;
			}

			field736[0] = (byte) arg0.field628;
			field736[1] = (byte) (arg0.field629 >> 8);
			field736[2] = (byte) arg0.field629;
			if (arg0.field632) {
				field736[3] = 2;
			} else if (field716.field1320) {
				field736[3] = 0;
			} else {
				field736[3] = 1;
			}

			field732.write(field736, 0, 4);
			field739 = 0;
		} catch (IOException var7) {
			try {
				field730.close();
			} catch (Exception var6) {
			}

			field730 = null;
			field731 = null;
			field732 = null;
			field735 = 0;
		}
	}
}
