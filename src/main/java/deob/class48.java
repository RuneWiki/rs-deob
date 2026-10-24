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
	public int[][] field712 = new int[4][];

	@ObfuscatedName("vb.i")
	public int[][] field713 = new int[4][];

	@ObfuscatedName("vb.j")
	public byte[][] field714 = new byte[4][];

	@ObfuscatedName("vb.k")
	public int field715;

	@ObfuscatedName("vb.l")
	public byte[] field716;

	@ObfuscatedName("vb.m")
	public int[] field717;

	@ObfuscatedName("vb.n")
	public int[] field718;

	@ObfuscatedName("vb.o")
	public int[] field719;

	@ObfuscatedName("vb.p")
	public int[] field720;

	@ObfuscatedName("vb.q")
	public int[] field721;

	@ObfuscatedName("vb.r")
	public int[] field722;

	@ObfuscatedName("vb.s")
	public boolean field723 = true;

	@ObfuscatedName("vb.t")
	public client field724;

	@ObfuscatedName("vb.u")
	public CRC32 field725 = new CRC32();

	@ObfuscatedName("vb.v")
	public boolean field726 = false;

	@ObfuscatedName("vb.w")
	public int field727;

	@ObfuscatedName("vb.x")
	public int field728;

	@ObfuscatedName("vb.y")
	public class43 field729 = new class43();

	@ObfuscatedName("vb.z")
	public class42 field730 = new class42();

	@ObfuscatedName("vb.A")
	public class42 field731 = new class42();

	@ObfuscatedName("vb.B")
	public class42 field732 = new class42();

	@ObfuscatedName("vb.C")
	public class42 field733 = new class42();

	@ObfuscatedName("vb.D")
	public class42 field734 = new class42();

	@ObfuscatedName("vb.E")
	public String field735 = "";

	@ObfuscatedName("vb.N")
	public byte[] field744 = new byte[500];

	@ObfuscatedName("vb.O")
	public byte[] field745 = new byte[65000];

	@ObfuscatedName("vb.F")
	public int field736;

	@ObfuscatedName("vb.G")
	public int field737;

	@ObfuscatedName("vb.L")
	public int field742;

	@ObfuscatedName("vb.M")
	public int field743;

	@ObfuscatedName("vb.P")
	public int field746;

	@ObfuscatedName("vb.Q")
	public int field747;

	@ObfuscatedName("vb.S")
	public int field749;

	@ObfuscatedName("vb.R")
	public long field748;

	@ObfuscatedName("vb.K")
	public class40 field741;

	@ObfuscatedName("vb.I")
	public InputStream field739;

	@ObfuscatedName("vb.J")
	public OutputStream field740;

	@ObfuscatedName("vb.H")
	public Socket field738;

	@ObfuscatedName("vb.a(Lyb;Lclient;)V")
	public final void method280(class51 arg0, client arg1) {
		String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		for (int var4 = 0; var4 < 4; var4++) {
			byte[] var5 = arg0.method309(var3[var4], null);
			int var6 = var5.length / 2;
			class39 var7 = new class39(var5);
			field712[var4] = new int[var6];
			field714[var4] = new byte[var6];

			for (int var8 = 0; var8 < var6; var8++) {
				field712[var4][var8] = var7.method241();
			}
		}

		String[] var9 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
		for (int var10 = 0; var10 < 4; var10++) {
			byte[] var11 = arg0.method309(var9[var10], null);
			int var12 = var11.length / 4;
			class39 var13 = new class39(var11);
			field713[var10] = new int[var12];
			for (int var14 = 0; var14 < var12; var14++) {
				field713[var10][var14] = var13.method244();
			}
		}

		byte[] var15 = arg0.method309("model_index", null);
		int var16 = field712[0].length;
		field716 = new byte[var16];
		for (int var17 = 0; var17 < var16; var17++) {
			if (var17 < var15.length) {
				field716[var17] = var15[var17];
			} else {
				field716[var17] = 0;
			}
		}

		byte[] var18 = arg0.method309("map_index", null);
		class39 var19 = new class39(var18);
		int var20 = var18.length / 7;
		field717 = new int[var20];
		field718 = new int[var20];
		field719 = new int[var20];
		field720 = new int[var20];
		for (int var21 = 0; var21 < var20; var21++) {
			field717[var21] = var19.method241();
			field718[var21] = var19.method241();
			field719[var21] = var19.method241();
			field720[var21] = var19.method239();
		}

		byte[] var22 = arg0.method309("anim_index", null);
		class39 var23 = new class39(var22);
		int var24 = var22.length / 2;
		field721 = new int[var24];
		for (int var25 = 0; var25 < var24; var25++) {
			field721[var25] = var23.method241();
		}

		byte[] var26 = arg0.method309("midi_index", null);
		class39 var27 = new class39(var26);
		int var28 = var26.length;
		field722 = new int[var28];
		for (int var29 = 0; var29 < var28; var29++) {
			field722[var29] = var27.method239();
		}

		field724 = arg1;
		field723 = true;
		field724.method12(this, 2);
	}

	@ObfuscatedName("vb.a()V")
	public final void method281() {
		field723 = false;
	}

	@ObfuscatedName("vb.a(IB)I")
	public final int method282(int arg0) {
		return field712[arg0].length;
	}

	@ObfuscatedName("vb.b(I)I")
	public final int method283() {
		return field721.length;
	}

	@ObfuscatedName("vb.a(IIII)I")
	public final int method284(int arg0, int arg1, int arg2) {
		int var4 = (arg0 << 8) + arg1;
		for (int var5 = 0; var5 < field717.length; var5++) {
			if (field717[var5] == var4) {
				if (arg2 == 0) {
					return field718[var5];
				}

				return field719[var5];
			}
		}

		return -1;
	}

	@ObfuscatedName("vb.a(ZZ)V")
	public final void method285(boolean arg0) {
		int var2 = field717.length;
		for (int var3 = 0; var3 < var2; var3++) {
			if (arg0 || field720[var3] != 0) {
				method292(3, field719[var3], (byte) 2);
				method292(3, field718[var3], (byte) 2);
			}
		}
	}

	@ObfuscatedName("vb.a(II)Z")
	public final boolean method286(int arg0) {
		for (int var2 = 0; var2 < field717.length; var2++) {
			if (field719[var2] == arg0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("vb.b(IB)I")
	public final int method287(int arg0) {
		return field716[arg0] & 0xFF;
	}

	@ObfuscatedName("vb.b(II)Z")
	public final boolean method288(int arg0) {
		if (field722[arg0] == 1) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("vb.a(I)V")
	public final void method279(int arg0) {
		method289(0, arg0);
	}

	@ObfuscatedName("vb.c(II)V")
	public final void method289(int arg0, int arg1) {
		if (arg0 >= 0 && arg0 <= field712.length && arg1 >= 0 && arg1 <= field712[arg0].length && field712[arg0][arg1] != 0) {
			synchronized (field729) {
				for (class40 var4 = (class40) field729.method265(); var4 != null; var4 = (class40) field729.method266()) {
					if (var4.field636 == arg0 && var4.field637 == arg1) {
						return;
					}
				}

				class40 var5 = new class40();
				var5.field636 = arg0;
				var5.field637 = arg1;
				var5.field640 = true;

				synchronized (field730) {
					field730.method255(var5);
				}

				field729.method263(var5);
			}
		}
	}

	@ObfuscatedName("vb.b()I")
	public final int method290() {
		synchronized (field729) {
			return field729.method267();
		}
	}

	@ObfuscatedName("vb.c()Lnb;")
	public final class40 method291() {
		class40 var2;
		synchronized (field733) {
			var2 = (class40) field733.method257();
		}

		if (var2 == null) {
			return null;
		}

		synchronized (field729) {
			var2.method121();
		}

		if (var2.field638 == null) {
			return var2;
		}

		int var4 = 0;
		try {
			GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field638));
			while (true) {
				if (field745.length == var4) {
					throw new RuntimeException("buffer overflow!");
				}

				int var6 = var5.read(field745, var4, field745.length - var4);
				if (var6 == -1) {
					break;
				}

				var4 += var6;
			}
		} catch (IOException var10) {
			throw new RuntimeException("error unzipping");
		}

		var2.field638 = new byte[var4];
		for (int var7 = 0; var7 < var4; var7++) {
			var2.field638[var7] = field745[var7];
		}

		return var2;
	}

	@ObfuscatedName("vb.a(IIBI)V")
	public final void method292(int arg0, int arg1, byte arg2) {
		if (field724.field1363[0] != null && field712[arg0][arg1] != 0) {
			byte[] var4 = field724.field1363[arg0 + 1].method301(arg1);
			if (!method299(var4, field712[arg0][arg1], field713[arg0][arg1])) {
				field714[arg0][arg1] = arg2;

				if (arg2 > field715) {
					field715 = arg2;
				}

				field737++;
			}
		}
	}

	@ObfuscatedName("vb.c(I)V")
	public final void method293() {
		synchronized (field734) {
			field734.method262();
		}
	}

	@ObfuscatedName("vb.a(BII)V")
	public final void method294(int arg0, int arg1) {
		if (field724.field1363[0] != null && (field712[arg1][arg0] != 0 && (field714[arg1][arg0] != 0 && field715 != 0))) {
			class40 var3 = new class40();
			var3.field636 = arg1;
			var3.field637 = arg0;
			var3.field640 = false;

			synchronized (field734) {
				field734.method255(var3);
			}
		}
	}

	public final void run() {
		try {
			while (field723) {
				field749++;
				byte var1 = 20;
				if (field715 == 0 && field724.field1363[0] != null) {
					var1 = 50;
				}

				try {
					Thread.sleep(var1);
				} catch (Exception var9) {
				}

				field726 = true;
				for (int var2 = 0; var2 < 100 && field726; var2++) {
					field726 = false;
					method295();
					method296();

					if (field727 == 0 && var2 >= 5) {
						break;
					}

					method297();

					if (field739 != null) {
						method298();
					}
				}

				boolean var3 = false;
				for (class40 var4 = (class40) field732.method258(); var4 != null; var4 = (class40) field732.method260()) {
					if (var4.field640) {
						var3 = true;
						var4.field639++;
						if (var4.field639 > 50) {
							var4.field639 = 0;
							method300(var4);
						}
					}
				}

				if (!var3) {
					for (class40 var5 = (class40) field732.method258(); var5 != null; var5 = (class40) field732.method260()) {
						var3 = true;
						var5.field639++;
						if (var5.field639 > 50) {
							var5.field639 = 0;
							method300(var5);
						}
					}
				}

				if (var3) {
					field746++;
					if (field746 > 750) {
						try {
							field738.close();
						} catch (Exception var8) {
						}

						field738 = null;
						field739 = null;
						field740 = null;
						field743 = 0;
					}
				} else {
					field746 = 0;
					field735 = "";
				}

				if (field724.field1263 && field738 != null && field740 != null && (field715 > 0 || field724.field1363[0] == null)) {
					field747++;
					if (field747 > 500) {
						field747 = 0;
						field744[0] = 0;
						field744[1] = 0;
						field744[2] = 0;
						field744[3] = 10;
						try {
							field740.write(field744, 0, 4);
						} catch (IOException var7) {
							field746 = 5000;
						}
					}
				}
			}
		} catch (Exception var10) {
			signlink.reporterror("od_ex " + var10.getMessage());
		}
	}

	@ObfuscatedName("vb.d(I)V")
	public final void method295() {
		class40 var2;
		synchronized (field730) {
			var2 = (class40) field730.method257();
		}

		while (var2 != null) {
			field726 = true;
			byte[] var3 = null;
			if (field724.field1363[0] != null) {
				var3 = field724.field1363[var2.field636 + 1].method301(var2.field637);
			}

			if (!method299(var3, field712[var2.field636][var2.field637], field713[var2.field636][var2.field637])) {
				var3 = null;
			}

			synchronized (field730) {
				if (var3 == null) {
					field731.method255(var2);
				} else {
					var2.field638 = var3;

					synchronized (field733) {
						field733.method255(var2);
					}
				}

				var2 = (class40) field730.method257();
			}
		}
	}

	@ObfuscatedName("vb.e(I)V")
	public final void method296() {
		field727 = 0;
		field728 = 0;
		for (class40 var1 = (class40) field732.method258(); var1 != null; var1 = (class40) field732.method260()) {
			if (var1.field640) {
				field727++;
			} else {
				field728++;
			}
		}

		while (field727 < 10) {
			class40 var2 = (class40) field731.method257();
			if (var2 == null) {
				break;
			}

			if (field714[var2.field636][var2.field637] != 0) {
				field736++;
			}

			field714[var2.field636][var2.field637] = 0;
			field732.method255(var2);
			field727++;
			method300(var2);
			field726 = true;
		}
	}

	@ObfuscatedName("vb.f(I)V")
	public final void method297() {
		while (field727 == 0) {
			if (field728 >= 10 || field715 == 0) {
				return;
			}

			class40 var2;
			synchronized (field734) {
				var2 = (class40) field734.method257();
			}

			while (var2 != null) {
				if (field714[var2.field636][var2.field637] != 0) {
					field714[var2.field636][var2.field637] = 0;
					field732.method255(var2);
					method300(var2);
					field726 = true;

					if (field736 < field737) {
						field736++;
					}

					field735 = "Loading extra files - " + field736 * 100 / field737 + "%";
					field728++;
					if (field728 == 10) {
						return;
					}
				}

				synchronized (field734) {
					var2 = (class40) field734.method257();
				}
			}

			for (int var4 = 0; var4 < 4; var4++) {
				byte[] var5 = field714[var4];
				int var6 = var5.length;
				for (int var7 = 0; var7 < var6; var7++) {
					if (var5[var7] == field715) {
						var5[var7] = 0;
						class40 var8 = new class40();
						var8.field636 = var4;
						var8.field637 = var7;
						var8.field640 = false;
						field732.method255(var8);
						method300(var8);
						field726 = true;

						if (field736 < field737) {
							field736++;
						}

						field735 = "Loading extra files - " + field736 * 100 / field737 + "%";
						field728++;
						if (field728 == 10) {
							return;
						}
					}
				}
			}

			field715--;
		}
	}

	@ObfuscatedName("vb.a(Z)V")
	public final void method298() {
		try {
			int var1 = field739.available();
			if (field743 == 0 && var1 >= 6) {
				field726 = true;

				for (int var2 = 0; var2 < 6; var2 += field739.read(field744, var2, 6 - var2)) {
				}

				int var3 = field744[0] & 0xFF;
				int var4 = ((field744[1] & 0xFF) << 8) + (field744[2] & 0xFF);
				int var5 = ((field744[3] & 0xFF) << 8) + (field744[4] & 0xFF);
				int var6 = field744[5] & 0xFF;
				field741 = null;
				for (class40 var7 = (class40) field732.method258(); var7 != null; var7 = (class40) field732.method260()) {
					if (var7.field636 == var3 && var7.field637 == var4) {
						field741 = var7;
					}

					if (field741 != null) {
						var7.field639 = 0;
					}
				}

				if (field741 != null) {
					field746 = 0;

					if (var5 == 0) {
						signlink.reporterror("Rej: " + var3 + "," + var4);
						field741.field638 = null;

						if (field741.field640) {
							synchronized (field733) {
								field733.method255(field741);
							}
						} else {
							field741.method120();
						}

						field741 = null;
					} else {
						if (field741.field638 == null && var6 == 0) {
							field741.field638 = new byte[var5];
						}

						if (field741.field638 == null && var6 != 0) {
							throw new IOException("missing start of file");
						}
					}
				}

				field742 = var6 * 500;
				field743 = 500;
				if (field743 > var5 - var6 * 500) {
					field743 = var5 - var6 * 500;
				}
			}

			if (field743 > 0 && var1 >= field743) {
				field726 = true;
				byte[] var9 = field744;
				int var10 = 0;
				if (field741 != null) {
					var9 = field741.field638;
					var10 = field742;
				}

				for (int var11 = 0; var11 < field743; var11 += field739.read(var9, var10 + var11, field743 - var11)) {
				}

				if (field743 + field742 >= var9.length && field741 != null) {
					if (field724.field1363[0] != null) {
						field724.field1363[field741.field636 + 1].method302(field741.field637, var9, var9.length);
					}

					if (!field741.field640 && field741.field636 == 3) {
						field741.field640 = true;
						field741.field636 = 93;
					}

					if (field741.field640) {
						synchronized (field733) {
							field733.method255(field741);
						}
					} else {
						field741.method120();
					}
				}

				field743 = 0;
			}
		} catch (IOException var17) {
			try {
				field738.close();
			} catch (Exception var14) {
			}

			field738 = null;
			field739 = null;
			field740 = null;
			field743 = 0;
		}
	}

	@ObfuscatedName("vb.a([BIIB)Z")
	public final boolean method299(byte[] arg0, int arg1, int arg2) {
		if (arg0 != null && arg0.length >= 2) {
			int var4 = arg0.length - 2;
			int var5 = ((arg0[var4] & 0xFF) << 8) + (arg0[var4 + 1] & 0xFF);
			field725.reset();
			field725.update(arg0, 0, var4);
			int var6 = (int) field725.getValue();

			if (arg1 != var5) {
				return false;
			}

			if (arg2 != var6) {
				return false;
			}

			return true;
		}

		return false;
	}

	@ObfuscatedName("vb.a(Lnb;B)V")
	public final void method300(class40 arg0) {
		try {
			if (field738 == null) {
				long var2 = System.currentTimeMillis();
				if (var2 - field748 < 5000L) {
					return;
				}

				field748 = var2;
				field738 = field724.method500(client.field1130 + 43594);
				field739 = field738.getInputStream();
				field740 = field738.getOutputStream();
				field740.write(15);

				for (int var4 = 0; var4 < 8; var4++) {
					field739.read();
				}

				field746 = 0;
			}

			field744[0] = (byte) arg0.field636;
			field744[1] = (byte) (arg0.field637 >> 8);
			field744[2] = (byte) arg0.field637;
			if (arg0.field640) {
				field744[3] = 2;
			} else if (field724.field1263) {
				field744[3] = 0;
			} else {
				field744[3] = 1;
			}

			field740.write(field744, 0, 4);
			field747 = 0;
		} catch (IOException var7) {
			try {
				field738.close();
			} catch (Exception var6) {
			}

			field738 = null;
			field739 = null;
			field740 = null;
			field743 = 0;
		}
	}
}
