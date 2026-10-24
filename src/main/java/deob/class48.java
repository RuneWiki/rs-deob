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

	@ObfuscatedName("vb.g")
	public int[][] field698 = new int[4][];

	@ObfuscatedName("vb.h")
	public int[][] field699 = new int[4][];

	@ObfuscatedName("vb.i")
	public byte[][] field700 = new byte[4][];

	@ObfuscatedName("vb.j")
	public int field701;

	@ObfuscatedName("vb.k")
	public byte[] field702;

	@ObfuscatedName("vb.l")
	public int[] field703;

	@ObfuscatedName("vb.m")
	public int[] field704;

	@ObfuscatedName("vb.n")
	public int[] field705;

	@ObfuscatedName("vb.o")
	public int[] field706;

	@ObfuscatedName("vb.p")
	public boolean field707 = true;

	@ObfuscatedName("vb.q")
	public client field708;

	@ObfuscatedName("vb.r")
	public CRC32 field709 = new CRC32();

	@ObfuscatedName("vb.s")
	public boolean field710 = false;

	@ObfuscatedName("vb.t")
	public int field711;

	@ObfuscatedName("vb.u")
	public int field712;

	@ObfuscatedName("vb.v")
	public class43 field713 = new class43();

	@ObfuscatedName("vb.w")
	public class42 field714 = new class42();

	@ObfuscatedName("vb.x")
	public class42 field715 = new class42();

	@ObfuscatedName("vb.y")
	public class42 field716 = new class42();

	@ObfuscatedName("vb.z")
	public class42 field717 = new class42();

	@ObfuscatedName("vb.A")
	public class42 field718 = new class42();

	@ObfuscatedName("vb.B")
	public String field719 = "";

	@ObfuscatedName("vb.K")
	public byte[] field728 = new byte[500];

	@ObfuscatedName("vb.L")
	public byte[] field729 = new byte[65000];

	@ObfuscatedName("vb.C")
	public int field720;

	@ObfuscatedName("vb.D")
	public int field721;

	@ObfuscatedName("vb.I")
	public int field726;

	@ObfuscatedName("vb.J")
	public int field727;

	@ObfuscatedName("vb.M")
	public int field730;

	@ObfuscatedName("vb.N")
	public int field731;

	@ObfuscatedName("vb.P")
	public int field733;

	@ObfuscatedName("vb.O")
	public long field732;

	@ObfuscatedName("vb.H")
	public class40 field725;

	@ObfuscatedName("vb.F")
	public InputStream field723;

	@ObfuscatedName("vb.G")
	public OutputStream field724;

	@ObfuscatedName("vb.E")
	public Socket field722;

	@ObfuscatedName("vb.a(Lyb;Lclient;)V")
	public final void method272(class51 arg0, client arg1) {
		String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		for (int var4 = 0; var4 < 4; var4++) {
			byte[] var5 = arg0.method299(var3[var4], null);
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
			byte[] var11 = arg0.method299(var9[var10], null);
			int var12 = var11.length / 4;
			class39 var13 = new class39(var11);
			field699[var10] = new int[var12];
			for (int var14 = 0; var14 < var12; var14++) {
				field699[var10][var14] = var13.method236();
			}
		}

		byte[] var15 = arg0.method299("model_index", null);
		int var16 = field698[0].length;
		field702 = new byte[var16];
		for (int var17 = 0; var17 < var16; var17++) {
			if (var17 < var15.length) {
				field702[var17] = var15[var17];
			} else {
				field702[var17] = 0;
			}
		}

		byte[] var18 = arg0.method299("map_index", null);
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

		byte[] var22 = arg0.method299("anim_index", null);
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

	@ObfuscatedName("vb.a(IIIB)I")
	public final int method276(int arg0, int arg1, int arg2) {
		int var4 = (arg2 << 8) + arg0;
		for (int var5 = 0; var5 < field703.length; var5++) {
			if (field703[var5] == var4) {
				if (arg1 == 0) {
					return field704[var5];
				}

				return field705[var5];
			}
		}

		return -1;
	}

	@ObfuscatedName("vb.a(IZ)Z")
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
			synchronized (field713) {
				for (class40 var4 = (class40) field713.method257(); var4 != null; var4 = (class40) field713.method258()) {
					if (var4.field622 == arg0 && var4.field623 == arg1) {
						return;
					}
				}

				class40 var5 = new class40();
				var5.field622 = arg0;
				var5.field623 = arg1;
				var5.field626 = true;

				synchronized (field714) {
					field714.method247(var5);
				}

				field713.method255(var5);
			}
		}
	}

	@ObfuscatedName("vb.b()I")
	public final int method280() {
		synchronized (field713) {
			return field713.method259();
		}
	}

	@ObfuscatedName("vb.c()Lnb;")
	public final class40 method281() {
		class40 var2;
		synchronized (field717) {
			var2 = (class40) field717.method249();
		}

		if (var2 == null) {
			return null;
		}

		synchronized (field713) {
			var2.method119();
		}

		if (var2.field624 == null) {
			return var2;
		}

		int var4 = 0;
		try {
			GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field624));
			while (true) {
				if (field729.length == var4) {
					throw new RuntimeException("buffer overflow!");
				}

				int var6 = var5.read(field729, var4, field729.length - var4);
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
			var2.field624[var7] = field729[var7];
		}

		return var2;
	}

	@ObfuscatedName("vb.b(IIIB)V")
	public final void method282(int arg0, int arg1, byte arg2) {
		if (field708.field1063[0] != null && field698[arg1][arg0] != 0) {
			byte[] var4 = field708.field1063[arg1 + 1].method291(arg0);
			if (!method289(field698[arg1][arg0], var4, field699[arg1][arg0])) {
				field700[arg1][arg0] = arg2;

				if (arg2 > field701) {
					field701 = arg2;
				}

				field721++;
			}
		}
	}

	@ObfuscatedName("vb.a(Z)V")
	public final void method283() {
		synchronized (field718) {
			field718.method254();
		}
	}

	@ObfuscatedName("vb.a(ZII)V")
	public final void method284(int arg0, int arg1) {
		if (field708.field1063[0] != null && (field698[arg0][arg1] != 0 && (field700[arg0][arg1] != 0 && field701 != 0))) {
			class40 var3 = new class40();
			var3.field622 = arg0;
			var3.field623 = arg1;
			var3.field626 = false;

			synchronized (field718) {
				field718.method247(var3);
			}
		}
	}

	public final void run() {
		try {
			while (field707) {
				field733++;

				try {
					Thread.sleep(20L);
				} catch (Exception var8) {
				}

				field710 = true;
				for (int var1 = 0; var1 < 100 && field710; var1++) {
					field710 = false;
					method285();
					method286();

					if (field711 == 0 && var1 >= 5) {
						break;
					}

					method287();

					if (field723 != null) {
						method288();
					}
				}

				boolean var2 = false;
				for (class40 var3 = (class40) field716.method250(); var3 != null; var3 = (class40) field716.method252()) {
					if (var3.field626) {
						var2 = true;
						var3.field625++;
						if (var3.field625 > 50) {
							var3.field625 = 0;
							method290(var3);
						}
					}
				}

				if (!var2) {
					for (class40 var4 = (class40) field716.method250(); var4 != null; var4 = (class40) field716.method252()) {
						var2 = true;
						var4.field625++;
						if (var4.field625 > 50) {
							var4.field625 = 0;
							method290(var4);
						}
					}
				}

				if (var2) {
					field730++;
					if (field730 > 750) {
						try {
							field722.close();
						} catch (Exception var7) {
						}

						field722 = null;
						field723 = null;
						field724 = null;
						field727 = 0;
					}
				} else {
					field730 = 0;
					field719 = "";
				}

				if (field708.field1382 && field722 != null && field724 != null && field701 > 0) {
					field731++;
					if (field731 > 500) {
						field731 = 0;
						field728[0] = 0;
						field728[1] = 0;
						field728[2] = 0;
						field728[3] = 10;
						try {
							field724.write(field728, 0, 4);
						} catch (IOException var6) {
							field730 = 5000;
						}
					}
				}
			}
		} catch (Exception var9) {
			signlink.reporterror("od_ex " + var9.getMessage());
		}
	}

	@ObfuscatedName("vb.b(I)V")
	public final void method285() {
		class40 var2;
		synchronized (field714) {
			var2 = (class40) field714.method249();
		}

		while (var2 != null) {
			field710 = true;
			byte[] var3 = null;
			if (field708.field1063[0] != null) {
				var3 = field708.field1063[var2.field622 + 1].method291(var2.field623);
			}

			if (!method289(field698[var2.field622][var2.field623], var3, field699[var2.field622][var2.field623])) {
				var3 = null;
			}

			synchronized (field714) {
				if (var3 == null) {
					field715.method247(var2);
				} else {
					var2.field624 = var3;

					synchronized (field717) {
						field717.method247(var2);
					}
				}

				var2 = (class40) field714.method249();
			}
		}
	}

	@ObfuscatedName("vb.c(I)V")
	public final void method286() {
		field711 = 0;
		field712 = 0;
		for (class40 var1 = (class40) field716.method250(); var1 != null; var1 = (class40) field716.method252()) {
			if (var1.field626) {
				field711++;
			} else {
				field712++;
			}
		}

		while (field711 < 10) {
			class40 var2 = (class40) field715.method249();
			if (var2 == null) {
				break;
			}

			if (field700[var2.field622][var2.field623] != 0) {
				field720++;
			}

			field700[var2.field622][var2.field623] = 0;
			field716.method247(var2);
			field711++;
			method290(var2);
			field710 = true;
		}
	}

	@ObfuscatedName("vb.b(Z)V")
	public final void method287() {
		while (field711 == 0) {
			if (field712 >= 10 || field701 == 0) {
				return;
			}

			class40 var2;
			synchronized (field718) {
				var2 = (class40) field718.method249();
			}

			while (var2 != null) {
				if (field700[var2.field622][var2.field623] != 0) {
					field700[var2.field622][var2.field623] = 0;
					field716.method247(var2);
					method290(var2);
					field710 = true;

					if (field720 < field721) {
						field720++;
					}

					field719 = "Loading extra files - " + field720 * 100 / field721 + "%";
					field712++;
					if (field712 == 10) {
						return;
					}
				}

				synchronized (field718) {
					var2 = (class40) field718.method249();
				}
			}

			for (int var4 = 0; var4 < 4; var4++) {
				byte[] var5 = field700[var4];
				int var6 = var5.length;
				for (int var7 = 0; var7 < var6; var7++) {
					if (var5[var7] == field701) {
						var5[var7] = 0;
						class40 var8 = new class40();
						var8.field622 = var4;
						var8.field623 = var7;
						var8.field626 = false;
						field716.method247(var8);
						method290(var8);
						field710 = true;

						if (field720 < field721) {
							field720++;
						}

						field719 = "Loading extra files - " + field720 * 100 / field721 + "%";
						field712++;
						if (field712 == 10) {
							return;
						}
					}
				}
			}

			field701--;
		}
	}

	@ObfuscatedName("vb.b(B)V")
	public final void method288() {
		try {
			int var1 = field723.available();
			if (field727 == 0 && var1 >= 6) {
				field710 = true;

				for (int var2 = 0; var2 < 6; var2 += field723.read(field728, var2, 6 - var2)) {
				}

				int var3 = field728[0] & 0xFF;
				int var4 = ((field728[1] & 0xFF) << 8) + (field728[2] & 0xFF);
				int var5 = ((field728[3] & 0xFF) << 8) + (field728[4] & 0xFF);
				int var6 = field728[5] & 0xFF;
				field725 = null;
				for (class40 var7 = (class40) field716.method250(); var7 != null; var7 = (class40) field716.method252()) {
					if (var7.field622 == var3 && var7.field623 == var4) {
						field725 = var7;
					}

					if (field725 != null) {
						var7.field625 = 0;
					}
				}

				if (field725 != null) {
					field730 = 0;

					if (var5 == 0) {
						signlink.reporterror("Rej: " + var3 + "," + var4);
						field725.field624 = null;

						if (field725.field626) {
							synchronized (field717) {
								field717.method247(field725);
							}
						} else {
							field725.method118();
						}

						field725 = null;
					} else {
						if (field725.field624 == null && var6 == 0) {
							field725.field624 = new byte[var5];
						}

						if (field725.field624 == null && var6 != 0) {
							throw new IOException("missing start of file");
						}
					}
				}

				field726 = var6 * 500;
				field727 = 500;
				if (field727 > var5 - var6 * 500) {
					field727 = var5 - var6 * 500;
				}
			}

			if (field727 > 0 && var1 >= field727) {
				field710 = true;
				byte[] var9 = field728;
				int var10 = 0;
				if (field725 != null) {
					var9 = field725.field624;
					var10 = field726;
				}

				for (int var11 = 0; var11 < field727; var11 += field723.read(var9, var10 + var11, field727 - var11)) {
				}

				if (field727 + field726 >= var9.length && field725 != null) {
					if (field708.field1063[0] != null) {
						field708.field1063[field725.field622 + 1].method292(field725.field623, var9.length, var9);
					}

					if (!field725.field626 && field725.field622 == 3) {
						field725.field626 = true;
						field725.field622 = 93;
					}

					if (field725.field626) {
						synchronized (field717) {
							field717.method247(field725);
						}
					} else {
						field725.method118();
					}
				}

				field727 = 0;
			}
		} catch (IOException var17) {
			try {
				field722.close();
			} catch (Exception var14) {
			}

			field722 = null;
			field723 = null;
			field724 = null;
			field727 = 0;
		}
	}

	@ObfuscatedName("vb.a(I[BBI)Z")
	public final boolean method289(int arg0, byte[] arg1, int arg2) {
		if (arg1 != null && arg1.length >= 2) {
			int var4 = arg1.length - 2;
			int var5 = ((arg1[var4] & 0xFF) << 8) + (arg1[var4 + 1] & 0xFF);
			field709.reset();
			field709.update(arg1, 0, var4);
			int var6 = (int) field709.getValue();

			if (arg0 != var5) {
				return false;
			}

			if (arg2 != var6) {
				return false;
			}

			return true;
		}

		return false;
	}

	@ObfuscatedName("vb.a(ZLnb;)V")
	public final void method290(class40 arg0) {
		try {
			if (field722 == null) {
				long var2 = System.currentTimeMillis();
				if (var2 - field732 < 5000L) {
					return;
				}

				field732 = var2;
				field722 = field708.method541(client.field1072 + 43594);
				field723 = field722.getInputStream();
				field724 = field722.getOutputStream();
				field724.write(15);

				for (int var4 = 0; var4 < 8; var4++) {
					field723.read();
				}

				field730 = 0;
			}

			field728[0] = (byte) arg0.field622;
			field728[1] = (byte) (arg0.field623 >> 8);
			field728[2] = (byte) arg0.field623;
			if (arg0.field626) {
				field728[3] = 2;
			} else if (field708.field1382) {
				field728[3] = 0;
			} else {
				field728[3] = 1;
			}

			field724.write(field728, 0, 4);
			field731 = 0;
		} catch (IOException var7) {
			try {
				field722.close();
			} catch (Exception var6) {
			}

			field722 = null;
			field723 = null;
			field724 = null;
			field727 = 0;
		}
	}
}
