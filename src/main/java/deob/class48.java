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
	public int[][] field711 = new int[4][];

	@ObfuscatedName("vb.i")
	public int[][] field712 = new int[4][];

	@ObfuscatedName("vb.j")
	public byte[][] field713 = new byte[4][];

	@ObfuscatedName("vb.k")
	public int field714;

	@ObfuscatedName("vb.l")
	public byte[] field715;

	@ObfuscatedName("vb.m")
	public int[] field716;

	@ObfuscatedName("vb.n")
	public int[] field717;

	@ObfuscatedName("vb.o")
	public int[] field718;

	@ObfuscatedName("vb.p")
	public int[] field719;

	@ObfuscatedName("vb.q")
	public int[] field720;

	@ObfuscatedName("vb.r")
	public int[] field721;

	@ObfuscatedName("vb.s")
	public boolean field722 = true;

	@ObfuscatedName("vb.t")
	public client field723;

	@ObfuscatedName("vb.u")
	public CRC32 field724 = new CRC32();

	@ObfuscatedName("vb.v")
	public boolean field725 = false;

	@ObfuscatedName("vb.w")
	public int field726;

	@ObfuscatedName("vb.x")
	public int field727;

	@ObfuscatedName("vb.y")
	public class43 field728 = new class43();

	@ObfuscatedName("vb.z")
	public class42 field729 = new class42();

	@ObfuscatedName("vb.A")
	public class42 field730 = new class42();

	@ObfuscatedName("vb.B")
	public class42 field731 = new class42();

	@ObfuscatedName("vb.C")
	public class42 field732 = new class42();

	@ObfuscatedName("vb.D")
	public class42 field733 = new class42();

	@ObfuscatedName("vb.E")
	public String field734 = "";

	@ObfuscatedName("vb.N")
	public byte[] field743 = new byte[500];

	@ObfuscatedName("vb.O")
	public byte[] field744 = new byte[65000];

	@ObfuscatedName("vb.F")
	public int field735;

	@ObfuscatedName("vb.G")
	public int field736;

	@ObfuscatedName("vb.L")
	public int field741;

	@ObfuscatedName("vb.M")
	public int field742;

	@ObfuscatedName("vb.P")
	public int field745;

	@ObfuscatedName("vb.Q")
	public int field746;

	@ObfuscatedName("vb.S")
	public int field748;

	@ObfuscatedName("vb.R")
	public long field747;

	@ObfuscatedName("vb.K")
	public class40 field740;

	@ObfuscatedName("vb.I")
	public InputStream field738;

	@ObfuscatedName("vb.J")
	public OutputStream field739;

	@ObfuscatedName("vb.H")
	public Socket field737;

	@ObfuscatedName("vb.a(Lyb;Lclient;)V")
	public final void method280(class51 arg0, client arg1) {
		String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		for (int var4 = 0; var4 < 4; var4++) {
			byte[] var5 = arg0.method309(var3[var4], null);
			int var6 = var5.length / 2;
			class39 var7 = new class39(var5);
			field711[var4] = new int[var6];
			field713[var4] = new byte[var6];

			for (int var8 = 0; var8 < var6; var8++) {
				field711[var4][var8] = var7.method241();
			}
		}

		String[] var9 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
		for (int var10 = 0; var10 < 4; var10++) {
			byte[] var11 = arg0.method309(var9[var10], null);
			int var12 = var11.length / 4;
			class39 var13 = new class39(var11);
			field712[var10] = new int[var12];
			for (int var14 = 0; var14 < var12; var14++) {
				field712[var10][var14] = var13.method244();
			}
		}

		byte[] var15 = arg0.method309("model_index", null);
		int var16 = field711[0].length;
		field715 = new byte[var16];
		for (int var17 = 0; var17 < var16; var17++) {
			if (var17 < var15.length) {
				field715[var17] = var15[var17];
			} else {
				field715[var17] = 0;
			}
		}

		byte[] var18 = arg0.method309("map_index", null);
		class39 var19 = new class39(var18);
		int var20 = var18.length / 7;
		field716 = new int[var20];
		field717 = new int[var20];
		field718 = new int[var20];
		field719 = new int[var20];
		for (int var21 = 0; var21 < var20; var21++) {
			field716[var21] = var19.method241();
			field717[var21] = var19.method241();
			field718[var21] = var19.method241();
			field719[var21] = var19.method239();
		}

		byte[] var22 = arg0.method309("anim_index", null);
		class39 var23 = new class39(var22);
		int var24 = var22.length / 2;
		field720 = new int[var24];
		for (int var25 = 0; var25 < var24; var25++) {
			field720[var25] = var23.method241();
		}

		byte[] var26 = arg0.method309("midi_index", null);
		class39 var27 = new class39(var26);
		int var28 = var26.length;
		field721 = new int[var28];
		for (int var29 = 0; var29 < var28; var29++) {
			field721[var29] = var27.method239();
		}

		field723 = arg1;
		field722 = true;
		field723.method12(this, 2);
	}

	@ObfuscatedName("vb.a()V")
	public final void method281() {
		field722 = false;
	}

	@ObfuscatedName("vb.a(BI)I")
	public final int method282(int arg0) {
		return field711[arg0].length;
	}

	@ObfuscatedName("vb.b(I)I")
	public final int method283() {
		return field720.length;
	}

	@ObfuscatedName("vb.a(IIII)I")
	public final int method284(int arg0, int arg1, int arg2) {
		int var4 = (arg0 << 8) + arg1;
		for (int var5 = 0; var5 < field716.length; var5++) {
			if (field716[var5] == var4) {
				if (arg2 == 0) {
					return field717[var5];
				}

				return field718[var5];
			}
		}

		return -1;
	}

	@ObfuscatedName("vb.a(IZ)V")
	public final void method285(boolean arg0) {
		int var2 = field716.length;
		for (int var3 = 0; var3 < var2; var3++) {
			if (arg0 || field719[var3] != 0) {
				method292((byte) 2, field718[var3], 3);
				method292((byte) 2, field717[var3], 3);
			}
		}
	}

	@ObfuscatedName("vb.a(ZI)Z")
	public final boolean method286(int arg0) {
		for (int var2 = 0; var2 < field716.length; var2++) {
			if (field718[var2] == arg0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("vb.a(II)I")
	public final int method287(int arg0) {
		return field715[arg0] & 0xFF;
	}

	@ObfuscatedName("vb.b(ZI)Z")
	public final boolean method288(int arg0) {
		if (field721[arg0] == 1) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("vb.a(I)V")
	public final void method279(int arg0) {
		method289(0, arg0);
	}

	@ObfuscatedName("vb.b(II)V")
	public final void method289(int arg0, int arg1) {
		if (arg0 >= 0 && arg0 <= field711.length && arg1 >= 0 && arg1 <= field711[arg0].length && field711[arg0][arg1] != 0) {
			synchronized (field728) {
				for (class40 var4 = (class40) field728.method265(); var4 != null; var4 = (class40) field728.method266()) {
					if (var4.field635 == arg0 && var4.field636 == arg1) {
						return;
					}
				}

				class40 var5 = new class40();
				var5.field635 = arg0;
				var5.field636 = arg1;
				var5.field639 = true;

				synchronized (field729) {
					field729.method255(var5);
				}

				field728.method263(var5);
			}
		}
	}

	@ObfuscatedName("vb.b()I")
	public final int method290() {
		synchronized (field728) {
			return field728.method267();
		}
	}

	@ObfuscatedName("vb.c()Lnb;")
	public final class40 method291() {
		class40 var2;
		synchronized (field732) {
			var2 = (class40) field732.method257();
		}

		if (var2 == null) {
			return null;
		}

		synchronized (field728) {
			var2.method121();
		}

		if (var2.field637 == null) {
			return var2;
		}

		int var4 = 0;
		try {
			GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field637));
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

		var2.field637 = new byte[var4];
		for (int var7 = 0; var7 < var4; var7++) {
			var2.field637[var7] = field744[var7];
		}

		return var2;
	}

	@ObfuscatedName("vb.a(IBII)V")
	public final void method292(byte arg0, int arg1, int arg2) {
		if (field723.field1212[0] != null && field711[arg2][arg1] != 0) {
			byte[] var4 = field723.field1212[arg2 + 1].method301(arg1);
			if (!method299(var4, field711[arg2][arg1], field712[arg2][arg1])) {
				field713[arg2][arg1] = arg0;

				if (arg0 > field714) {
					field714 = arg0;
				}

				field736++;
			}
		}
	}

	@ObfuscatedName("vb.c(I)V")
	public final void method293() {
		synchronized (field733) {
			field733.method262();
		}
	}

	@ObfuscatedName("vb.a(III)V")
	public final void method294(int arg0, int arg1) {
		if (field723.field1212[0] != null && (field711[arg0][arg1] != 0 && (field713[arg0][arg1] != 0 && field714 != 0))) {
			class40 var3 = new class40();
			var3.field635 = arg0;
			var3.field636 = arg1;
			var3.field639 = false;

			synchronized (field733) {
				field733.method255(var3);
			}
		}
	}

	public final void run() {
		try {
			while (field722) {
				field748++;
				byte var1 = 20;
				if (field714 == 0 && field723.field1212[0] != null) {
					var1 = 50;
				}

				try {
					Thread.sleep(var1);
				} catch (Exception var9) {
				}

				field725 = true;
				for (int var2 = 0; var2 < 100 && field725; var2++) {
					field725 = false;
					method295();
					method296();

					if (field726 == 0 && var2 >= 5) {
						break;
					}

					method297();

					if (field738 != null) {
						method298();
					}
				}

				boolean var3 = false;
				for (class40 var4 = (class40) field731.method258(); var4 != null; var4 = (class40) field731.method260()) {
					if (var4.field639) {
						var3 = true;
						var4.field638++;
						if (var4.field638 > 50) {
							var4.field638 = 0;
							method300(var4);
						}
					}
				}

				if (!var3) {
					for (class40 var5 = (class40) field731.method258(); var5 != null; var5 = (class40) field731.method260()) {
						var3 = true;
						var5.field638++;
						if (var5.field638 > 50) {
							var5.field638 = 0;
							method300(var5);
						}
					}
				}

				if (var3) {
					field745++;
					if (field745 > 750) {
						try {
							field737.close();
						} catch (Exception var8) {
						}

						field737 = null;
						field738 = null;
						field739 = null;
						field742 = 0;
					}
				} else {
					field745 = 0;
					field734 = "";
				}

				if (field723.field1301 && field737 != null && field739 != null && (field714 > 0 || field723.field1212[0] == null)) {
					field746++;
					if (field746 > 500) {
						field746 = 0;
						field743[0] = 0;
						field743[1] = 0;
						field743[2] = 0;
						field743[3] = 10;
						try {
							field739.write(field743, 0, 4);
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

	@ObfuscatedName("vb.a(B)V")
	public final void method295() {
		class40 var2;
		synchronized (field729) {
			var2 = (class40) field729.method257();
		}

		while (var2 != null) {
			field725 = true;
			byte[] var3 = null;
			if (field723.field1212[0] != null) {
				var3 = field723.field1212[var2.field635 + 1].method301(var2.field636);
			}

			if (!method299(var3, field711[var2.field635][var2.field636], field712[var2.field635][var2.field636])) {
				var3 = null;
			}

			synchronized (field729) {
				if (var3 == null) {
					field730.method255(var2);
				} else {
					var2.field637 = var3;

					synchronized (field732) {
						field732.method255(var2);
					}
				}

				var2 = (class40) field729.method257();
			}
		}
	}

	@ObfuscatedName("vb.d(I)V")
	public final void method296() {
		field726 = 0;
		field727 = 0;
		for (class40 var1 = (class40) field731.method258(); var1 != null; var1 = (class40) field731.method260()) {
			if (var1.field639) {
				field726++;
			} else {
				field727++;
			}
		}

		while (field726 < 10) {
			class40 var2 = (class40) field730.method257();
			if (var2 == null) {
				break;
			}

			if (field713[var2.field635][var2.field636] != 0) {
				field735++;
			}

			field713[var2.field635][var2.field636] = 0;
			field731.method255(var2);
			field726++;
			method300(var2);
			field725 = true;
		}
	}

	@ObfuscatedName("vb.a(Z)V")
	public final void method297() {
		while (field726 == 0) {
			if (field727 >= 10 || field714 == 0) {
				return;
			}

			class40 var2;
			synchronized (field733) {
				var2 = (class40) field733.method257();
			}

			while (var2 != null) {
				if (field713[var2.field635][var2.field636] != 0) {
					field713[var2.field635][var2.field636] = 0;
					field731.method255(var2);
					method300(var2);
					field725 = true;

					if (field735 < field736) {
						field735++;
					}

					field734 = "Loading extra files - " + field735 * 100 / field736 + "%";
					field727++;
					if (field727 == 10) {
						return;
					}
				}

				synchronized (field733) {
					var2 = (class40) field733.method257();
				}
			}

			for (int var4 = 0; var4 < 4; var4++) {
				byte[] var5 = field713[var4];
				int var6 = var5.length;
				for (int var7 = 0; var7 < var6; var7++) {
					if (var5[var7] == field714) {
						var5[var7] = 0;
						class40 var8 = new class40();
						var8.field635 = var4;
						var8.field636 = var7;
						var8.field639 = false;
						field731.method255(var8);
						method300(var8);
						field725 = true;

						if (field735 < field736) {
							field735++;
						}

						field734 = "Loading extra files - " + field735 * 100 / field736 + "%";
						field727++;
						if (field727 == 10) {
							return;
						}
					}
				}
			}

			field714--;
		}
	}

	@ObfuscatedName("vb.e(I)V")
	public final void method298() {
		try {
			int var1 = field738.available();
			if (field742 == 0 && var1 >= 6) {
				field725 = true;

				for (int var2 = 0; var2 < 6; var2 += field738.read(field743, var2, 6 - var2)) {
				}

				int var3 = field743[0] & 0xFF;
				int var4 = ((field743[1] & 0xFF) << 8) + (field743[2] & 0xFF);
				int var5 = ((field743[3] & 0xFF) << 8) + (field743[4] & 0xFF);
				int var6 = field743[5] & 0xFF;
				field740 = null;
				for (class40 var7 = (class40) field731.method258(); var7 != null; var7 = (class40) field731.method260()) {
					if (var7.field635 == var3 && var7.field636 == var4) {
						field740 = var7;
					}

					if (field740 != null) {
						var7.field638 = 0;
					}
				}

				if (field740 != null) {
					field745 = 0;

					if (var5 == 0) {
						signlink.reporterror("Rej: " + var3 + "," + var4);
						field740.field637 = null;

						if (field740.field639) {
							synchronized (field732) {
								field732.method255(field740);
							}
						} else {
							field740.method120();
						}

						field740 = null;
					} else {
						if (field740.field637 == null && var6 == 0) {
							field740.field637 = new byte[var5];
						}

						if (field740.field637 == null && var6 != 0) {
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
				field725 = true;
				byte[] var9 = field743;
				int var10 = 0;
				if (field740 != null) {
					var9 = field740.field637;
					var10 = field741;
				}

				for (int var11 = 0; var11 < field742; var11 += field738.read(var9, var10 + var11, field742 - var11)) {
				}

				if (field742 + field741 >= var9.length && field740 != null) {
					if (field723.field1212[0] != null) {
						field723.field1212[field740.field635 + 1].method302(var9.length, field740.field636, var9);
					}

					if (!field740.field639 && field740.field635 == 3) {
						field740.field639 = true;
						field740.field635 = 93;
					}

					if (field740.field639) {
						synchronized (field732) {
							field732.method255(field740);
						}
					} else {
						field740.method120();
					}
				}

				field742 = 0;
			}
		} catch (IOException var17) {
			try {
				field737.close();
			} catch (Exception var14) {
			}

			field737 = null;
			field738 = null;
			field739 = null;
			field742 = 0;
		}
	}

	@ObfuscatedName("vb.a([BIZI)Z")
	public final boolean method299(byte[] arg0, int arg1, int arg2) {
		if (arg0 != null && arg0.length >= 2) {
			int var4 = arg0.length - 2;
			int var5 = ((arg0[var4] & 0xFF) << 8) + (arg0[var4 + 1] & 0xFF);
			field724.reset();
			field724.update(arg0, 0, var4);
			int var6 = (int) field724.getValue();

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

	@ObfuscatedName("vb.a(ZLnb;)V")
	public final void method300(class40 arg0) {
		try {
			if (field737 == null) {
				long var2 = System.currentTimeMillis();
				if (var2 - field747 < 5000L) {
					return;
				}

				field747 = var2;
				field737 = field723.method519(client.field1174 + 43594);
				field738 = field737.getInputStream();
				field739 = field737.getOutputStream();
				field739.write(15);

				for (int var4 = 0; var4 < 8; var4++) {
					field738.read();
				}

				field745 = 0;
			}

			field743[0] = (byte) arg0.field635;
			field743[1] = (byte) (arg0.field636 >> 8);
			field743[2] = (byte) arg0.field636;
			if (arg0.field639) {
				field743[3] = 2;
			} else if (field723.field1301) {
				field743[3] = 0;
			} else {
				field743[3] = 1;
			}

			field739.write(field743, 0, 4);
			field746 = 0;
		} catch (IOException var7) {
			try {
				field737.close();
			} catch (Exception var6) {
			}

			field737 = null;
			field738 = null;
			field739 = null;
			field742 = 0;
		}
	}
}
