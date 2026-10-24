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

	@ObfuscatedName("vb.e")
	public int[][] field708 = new int[4][];

	@ObfuscatedName("vb.f")
	public int[][] field709 = new int[4][];

	@ObfuscatedName("vb.g")
	public byte[][] field710 = new byte[4][];

	@ObfuscatedName("vb.h")
	public int field711;

	@ObfuscatedName("vb.i")
	public byte[] field712;

	@ObfuscatedName("vb.j")
	public int[] field713;

	@ObfuscatedName("vb.k")
	public int[] field714;

	@ObfuscatedName("vb.l")
	public int[] field715;

	@ObfuscatedName("vb.m")
	public int[] field716;

	@ObfuscatedName("vb.n")
	public int[] field717;

	@ObfuscatedName("vb.o")
	public int[] field718;

	@ObfuscatedName("vb.p")
	public boolean field719 = true;

	@ObfuscatedName("vb.q")
	public client field720;

	@ObfuscatedName("vb.r")
	public CRC32 field721 = new CRC32();

	@ObfuscatedName("vb.s")
	public boolean field722 = false;

	@ObfuscatedName("vb.t")
	public int field723;

	@ObfuscatedName("vb.u")
	public int field724;

	@ObfuscatedName("vb.v")
	public class43 field725 = new class43();

	@ObfuscatedName("vb.w")
	public class42 field726 = new class42();

	@ObfuscatedName("vb.x")
	public class42 field727 = new class42();

	@ObfuscatedName("vb.y")
	public class42 field728 = new class42();

	@ObfuscatedName("vb.z")
	public class42 field729 = new class42();

	@ObfuscatedName("vb.A")
	public class42 field730 = new class42();

	@ObfuscatedName("vb.B")
	public String field731 = "";

	@ObfuscatedName("vb.K")
	public byte[] field740 = new byte[500];

	@ObfuscatedName("vb.L")
	public byte[] field741 = new byte[65000];

	@ObfuscatedName("vb.C")
	public int field732;

	@ObfuscatedName("vb.D")
	public int field733;

	@ObfuscatedName("vb.I")
	public int field738;

	@ObfuscatedName("vb.J")
	public int field739;

	@ObfuscatedName("vb.M")
	public int field742;

	@ObfuscatedName("vb.N")
	public int field743;

	@ObfuscatedName("vb.P")
	public int field745;

	@ObfuscatedName("vb.O")
	public long field744;

	@ObfuscatedName("vb.H")
	public class40 field737;

	@ObfuscatedName("vb.F")
	public InputStream field735;

	@ObfuscatedName("vb.G")
	public OutputStream field736;

	@ObfuscatedName("vb.E")
	public Socket field734;

	@ObfuscatedName("vb.a(Lyb;Lclient;)V")
	public final void method279(class51 arg0, client arg1) {
		String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		for (int var4 = 0; var4 < 4; var4++) {
			byte[] var5 = arg0.method308(var3[var4], null);
			int var6 = var5.length / 2;
			class39 var7 = new class39(var5);
			field708[var4] = new int[var6];
			field710[var4] = new byte[var6];

			for (int var8 = 0; var8 < var6; var8++) {
				field708[var4][var8] = var7.method240();
			}
		}

		String[] var9 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
		for (int var10 = 0; var10 < 4; var10++) {
			byte[] var11 = arg0.method308(var9[var10], null);
			int var12 = var11.length / 4;
			class39 var13 = new class39(var11);
			field709[var10] = new int[var12];
			for (int var14 = 0; var14 < var12; var14++) {
				field709[var10][var14] = var13.method243();
			}
		}

		byte[] var15 = arg0.method308("model_index", null);
		int var16 = field708[0].length;
		field712 = new byte[var16];
		for (int var17 = 0; var17 < var16; var17++) {
			if (var17 < var15.length) {
				field712[var17] = var15[var17];
			} else {
				field712[var17] = 0;
			}
		}

		byte[] var18 = arg0.method308("map_index", null);
		class39 var19 = new class39(var18);
		int var20 = var18.length / 7;
		field713 = new int[var20];
		field714 = new int[var20];
		field715 = new int[var20];
		field716 = new int[var20];
		for (int var21 = 0; var21 < var20; var21++) {
			field713[var21] = var19.method240();
			field714[var21] = var19.method240();
			field715[var21] = var19.method240();
			field716[var21] = var19.method238();
		}

		byte[] var22 = arg0.method308("anim_index", null);
		class39 var23 = new class39(var22);
		int var24 = var22.length / 2;
		field717 = new int[var24];
		for (int var25 = 0; var25 < var24; var25++) {
			field717[var25] = var23.method240();
		}

		byte[] var26 = arg0.method308("midi_index", null);
		class39 var27 = new class39(var26);
		int var28 = var26.length;
		field718 = new int[var28];
		for (int var29 = 0; var29 < var28; var29++) {
			field718[var29] = var27.method238();
		}

		field720 = arg1;
		field719 = true;
		field720.method12(this, 2);
	}

	@ObfuscatedName("vb.a()V")
	public final void method280() {
		field719 = false;
	}

	@ObfuscatedName("vb.a(II)I")
	public final int method281(int arg0) {
		return field708[arg0].length;
	}

	@ObfuscatedName("vb.a(Z)I")
	public final int method282() {
		return field717.length;
	}

	@ObfuscatedName("vb.a(IIII)I")
	public final int method283(int arg0, int arg1, int arg2) {
		int var4 = (arg0 << 8) + arg2;
		for (int var5 = 0; var5 < field713.length; var5++) {
			if (field713[var5] == var4) {
				if (arg1 == 0) {
					return field714[var5];
				}

				return field715[var5];
			}
		}

		return -1;
	}

	@ObfuscatedName("vb.a(IZ)V")
	public final void method284(boolean arg0) {
		int var2 = field713.length;
		for (int var3 = 0; var3 < var2; var3++) {
			if (arg0 || field716[var3] != 0) {
				method291((byte) 2, field715[var3], 3);
				method291((byte) 2, field714[var3], 3);
			}
		}
	}

	@ObfuscatedName("vb.b(IZ)Z")
	public final boolean method285(int arg0) {
		for (int var2 = 0; var2 < field713.length; var2++) {
			if (field715[var2] == arg0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("vb.b(II)I")
	public final int method286(int arg0) {
		return field712[arg0] & 0xFF;
	}

	@ObfuscatedName("vb.c(IZ)Z")
	public final boolean method287(int arg0) {
		if (field718[arg0] == 1) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("vb.a(I)V")
	public final void method278(int arg0) {
		method288(0, arg0);
	}

	@ObfuscatedName("vb.c(II)V")
	public final void method288(int arg0, int arg1) {
		if (arg0 >= 0 && arg0 <= field708.length && arg1 >= 0 && arg1 <= field708[arg0].length && field708[arg0][arg1] != 0) {
			synchronized (field725) {
				for (class40 var4 = (class40) field725.method264(); var4 != null; var4 = (class40) field725.method265()) {
					if (var4.field632 == arg0 && var4.field633 == arg1) {
						return;
					}
				}

				class40 var5 = new class40();
				var5.field632 = arg0;
				var5.field633 = arg1;
				var5.field636 = true;

				synchronized (field726) {
					field726.method254(var5);
				}

				field725.method262(var5);
			}
		}
	}

	@ObfuscatedName("vb.b()I")
	public final int method289() {
		synchronized (field725) {
			return field725.method266();
		}
	}

	@ObfuscatedName("vb.c()Lnb;")
	public final class40 method290() {
		class40 var2;
		synchronized (field729) {
			var2 = (class40) field729.method256();
		}

		if (var2 == null) {
			return null;
		}

		synchronized (field725) {
			var2.method120();
		}

		if (var2.field634 == null) {
			return var2;
		}

		int var4 = 0;
		try {
			GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field634));
			while (true) {
				if (field741.length == var4) {
					throw new RuntimeException("buffer overflow!");
				}

				int var6 = var5.read(field741, var4, field741.length - var4);
				if (var6 == -1) {
					break;
				}

				var4 += var6;
			}
		} catch (IOException var10) {
			throw new RuntimeException("error unzipping");
		}

		var2.field634 = new byte[var4];
		for (int var7 = 0; var7 < var4; var7++) {
			var2.field634[var7] = field741[var7];
		}

		return var2;
	}

	@ObfuscatedName("vb.a(IBII)V")
	public final void method291(byte arg0, int arg1, int arg2) {
		if (field720.field1091[0] != null && field708[arg2][arg1] != 0) {
			byte[] var4 = field720.field1091[arg2 + 1].method300(arg1);
			if (!method298(field709[arg2][arg1], field708[arg2][arg1], var4)) {
				field710[arg2][arg1] = arg0;

				if (arg0 > field711) {
					field711 = arg0;
				}

				field733++;
			}
		}
	}

	@ObfuscatedName("vb.b(I)V")
	public final void method292() {
		synchronized (field730) {
			field730.method261();
		}
	}

	@ObfuscatedName("vb.a(ZII)V")
	public final void method293(int arg0, int arg1) {
		if (field720.field1091[0] != null && (field708[arg1][arg0] != 0 && (field710[arg1][arg0] != 0 && field711 != 0))) {
			class40 var3 = new class40();
			var3.field632 = arg1;
			var3.field633 = arg0;
			var3.field636 = false;

			synchronized (field730) {
				field730.method254(var3);
			}
		}
	}

	public final void run() {
		try {
			while (field719) {
				field745++;
				byte var1 = 20;
				if (field711 == 0 && field720.field1091[0] != null) {
					var1 = 50;
				}

				try {
					Thread.sleep(var1);
				} catch (Exception var9) {
				}

				field722 = true;
				for (int var2 = 0; var2 < 100 && field722; var2++) {
					field722 = false;
					method294();
					method295();

					if (field723 == 0 && var2 >= 5) {
						break;
					}

					method296();

					if (field735 != null) {
						method297();
					}
				}

				boolean var3 = false;
				for (class40 var4 = (class40) field728.method257(); var4 != null; var4 = (class40) field728.method259()) {
					if (var4.field636) {
						var3 = true;
						var4.field635++;
						if (var4.field635 > 50) {
							var4.field635 = 0;
							method299(var4);
						}
					}
				}

				if (!var3) {
					for (class40 var5 = (class40) field728.method257(); var5 != null; var5 = (class40) field728.method259()) {
						var3 = true;
						var5.field635++;
						if (var5.field635 > 50) {
							var5.field635 = 0;
							method299(var5);
						}
					}
				}

				if (var3) {
					field742++;
					if (field742 > 750) {
						try {
							field734.close();
						} catch (Exception var8) {
						}

						field734 = null;
						field735 = null;
						field736 = null;
						field739 = 0;
					}
				} else {
					field742 = 0;
					field731 = "";
				}

				if (field720.field1418 && field734 != null && field736 != null && (field711 > 0 || field720.field1091[0] == null)) {
					field743++;
					if (field743 > 500) {
						field743 = 0;
						field740[0] = 0;
						field740[1] = 0;
						field740[2] = 0;
						field740[3] = 10;
						try {
							field736.write(field740, 0, 4);
						} catch (IOException var7) {
							field742 = 5000;
						}
					}
				}
			}
		} catch (Exception var10) {
			signlink.reporterror("od_ex " + var10.getMessage());
		}
	}

	@ObfuscatedName("vb.a(B)V")
	public final void method294() {
		class40 var2;
		synchronized (field726) {
			var2 = (class40) field726.method256();
		}

		while (var2 != null) {
			field722 = true;
			byte[] var3 = null;
			if (field720.field1091[0] != null) {
				var3 = field720.field1091[var2.field632 + 1].method300(var2.field633);
			}

			if (!method298(field709[var2.field632][var2.field633], field708[var2.field632][var2.field633], var3)) {
				var3 = null;
			}

			synchronized (field726) {
				if (var3 == null) {
					field727.method254(var2);
				} else {
					var2.field634 = var3;

					synchronized (field729) {
						field729.method254(var2);
					}
				}

				var2 = (class40) field726.method256();
			}
		}
	}

	@ObfuscatedName("vb.c(I)V")
	public final void method295() {
		field723 = 0;
		field724 = 0;
		for (class40 var1 = (class40) field728.method257(); var1 != null; var1 = (class40) field728.method259()) {
			if (var1.field636) {
				field723++;
			} else {
				field724++;
			}
		}

		while (field723 < 10) {
			class40 var2 = (class40) field727.method256();
			if (var2 == null) {
				break;
			}

			if (field710[var2.field632][var2.field633] != 0) {
				field732++;
			}

			field710[var2.field632][var2.field633] = 0;
			field728.method254(var2);
			field723++;
			method299(var2);
			field722 = true;
		}
	}

	@ObfuscatedName("vb.d(I)V")
	public final void method296() {
		while (field723 == 0) {
			if (field724 >= 10 || field711 == 0) {
				return;
			}

			class40 var2;
			synchronized (field730) {
				var2 = (class40) field730.method256();
			}

			while (var2 != null) {
				if (field710[var2.field632][var2.field633] != 0) {
					field710[var2.field632][var2.field633] = 0;
					field728.method254(var2);
					method299(var2);
					field722 = true;

					if (field732 < field733) {
						field732++;
					}

					field731 = "Loading extra files - " + field732 * 100 / field733 + "%";
					field724++;
					if (field724 == 10) {
						return;
					}
				}

				synchronized (field730) {
					var2 = (class40) field730.method256();
				}
			}

			for (int var4 = 0; var4 < 4; var4++) {
				byte[] var5 = field710[var4];
				int var6 = var5.length;
				for (int var7 = 0; var7 < var6; var7++) {
					if (var5[var7] == field711) {
						var5[var7] = 0;
						class40 var8 = new class40();
						var8.field632 = var4;
						var8.field633 = var7;
						var8.field636 = false;
						field728.method254(var8);
						method299(var8);
						field722 = true;

						if (field732 < field733) {
							field732++;
						}

						field731 = "Loading extra files - " + field732 * 100 / field733 + "%";
						field724++;
						if (field724 == 10) {
							return;
						}
					}
				}
			}

			field711--;
		}
	}

	@ObfuscatedName("vb.b(Z)V")
	public final void method297() {
		try {
			int var1 = field735.available();
			if (field739 == 0 && var1 >= 6) {
				field722 = true;

				for (int var2 = 0; var2 < 6; var2 += field735.read(field740, var2, 6 - var2)) {
				}

				int var3 = field740[0] & 0xFF;
				int var4 = ((field740[1] & 0xFF) << 8) + (field740[2] & 0xFF);
				int var5 = ((field740[3] & 0xFF) << 8) + (field740[4] & 0xFF);
				int var6 = field740[5] & 0xFF;
				field737 = null;
				for (class40 var7 = (class40) field728.method257(); var7 != null; var7 = (class40) field728.method259()) {
					if (var7.field632 == var3 && var7.field633 == var4) {
						field737 = var7;
					}

					if (field737 != null) {
						var7.field635 = 0;
					}
				}

				if (field737 != null) {
					field742 = 0;

					if (var5 == 0) {
						signlink.reporterror("Rej: " + var3 + "," + var4);
						field737.field634 = null;

						if (field737.field636) {
							synchronized (field729) {
								field729.method254(field737);
							}
						} else {
							field737.method119();
						}

						field737 = null;
					} else {
						if (field737.field634 == null && var6 == 0) {
							field737.field634 = new byte[var5];
						}

						if (field737.field634 == null && var6 != 0) {
							throw new IOException("missing start of file");
						}
					}
				}

				field738 = var6 * 500;
				field739 = 500;
				if (field739 > var5 - var6 * 500) {
					field739 = var5 - var6 * 500;
				}
			}

			if (field739 > 0 && var1 >= field739) {
				field722 = true;
				byte[] var9 = field740;
				int var10 = 0;
				if (field737 != null) {
					var9 = field737.field634;
					var10 = field738;
				}

				for (int var11 = 0; var11 < field739; var11 += field735.read(var9, var10 + var11, field739 - var11)) {
				}

				if (field739 + field738 >= var9.length && field737 != null) {
					if (field720.field1091[0] != null) {
						field720.field1091[field737.field632 + 1].method301(field737.field633, var9, var9.length);
					}

					if (!field737.field636 && field737.field632 == 3) {
						field737.field636 = true;
						field737.field632 = 93;
					}

					if (field737.field636) {
						synchronized (field729) {
							field729.method254(field737);
						}
					} else {
						field737.method119();
					}
				}

				field739 = 0;
			}
		} catch (IOException var17) {
			try {
				field734.close();
			} catch (Exception var14) {
			}

			field734 = null;
			field735 = null;
			field736 = null;
			field739 = 0;
		}
	}

	@ObfuscatedName("vb.a(III[B)Z")
	public final boolean method298(int arg0, int arg1, byte[] arg2) {
		if (arg2 != null && arg2.length >= 2) {
			int var4 = arg2.length - 2;
			int var5 = ((arg2[var4] & 0xFF) << 8) + (arg2[var4 + 1] & 0xFF);
			field721.reset();
			field721.update(arg2, 0, var4);
			int var6 = (int) field721.getValue();

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

	@ObfuscatedName("vb.a(ILnb;)V")
	public final void method299(class40 arg0) {
		try {
			if (field734 == null) {
				long var2 = System.currentTimeMillis();
				if (var2 - field744 < 5000L) {
					return;
				}

				field744 = var2;
				field734 = field720.method454(client.field1358 + 43594);
				field735 = field734.getInputStream();
				field736 = field734.getOutputStream();
				field736.write(15);

				for (int var4 = 0; var4 < 8; var4++) {
					field735.read();
				}

				field742 = 0;
			}

			field740[0] = (byte) arg0.field632;
			field740[1] = (byte) (arg0.field633 >> 8);
			field740[2] = (byte) arg0.field633;
			if (arg0.field636) {
				field740[3] = 2;
			} else if (field720.field1418) {
				field740[3] = 0;
			} else {
				field740[3] = 1;
			}

			field736.write(field740, 0, 4);
			field743 = 0;
		} catch (IOException var7) {
			try {
				field734.close();
			} catch (Exception var6) {
			}

			field734 = null;
			field735 = null;
			field736 = null;
			field739 = 0;
		}
	}
}
