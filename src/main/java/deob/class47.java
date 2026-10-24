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

	@ObfuscatedName("ub.i")
	public int[][] field709 = new int[4][];

	@ObfuscatedName("ub.j")
	public int[][] field710 = new int[4][];

	@ObfuscatedName("ub.k")
	public byte[][] field711 = new byte[4][];

	@ObfuscatedName("ub.l")
	public int field712;

	@ObfuscatedName("ub.m")
	public byte[] field713;

	@ObfuscatedName("ub.n")
	public int[] field714;

	@ObfuscatedName("ub.o")
	public int[] field715;

	@ObfuscatedName("ub.p")
	public int[] field716;

	@ObfuscatedName("ub.q")
	public int[] field717;

	@ObfuscatedName("ub.r")
	public int[] field718;

	@ObfuscatedName("ub.s")
	public int[] field719;

	@ObfuscatedName("ub.t")
	public boolean field720 = true;

	@ObfuscatedName("ub.u")
	public client field721;

	@ObfuscatedName("ub.v")
	public CRC32 field722 = new CRC32();

	@ObfuscatedName("ub.w")
	public boolean field723 = false;

	@ObfuscatedName("ub.x")
	public int field724;

	@ObfuscatedName("ub.y")
	public int field725;

	@ObfuscatedName("ub.z")
	public class42 field726 = new class42();

	@ObfuscatedName("ub.A")
	public class41 field727 = new class41();

	@ObfuscatedName("ub.B")
	public class41 field728 = new class41();

	@ObfuscatedName("ub.C")
	public class41 field729 = new class41();

	@ObfuscatedName("ub.D")
	public class41 field730 = new class41();

	@ObfuscatedName("ub.E")
	public class41 field731 = new class41();

	@ObfuscatedName("ub.F")
	public String field732 = "";

	@ObfuscatedName("ub.P")
	public byte[] field742 = new byte[500];

	@ObfuscatedName("ub.Q")
	public byte[] field743 = new byte[65000];

	@ObfuscatedName("ub.G")
	public int field733;

	@ObfuscatedName("ub.H")
	public int field734;

	@ObfuscatedName("ub.L")
	public int field738;

	@ObfuscatedName("ub.N")
	public int field740;

	@ObfuscatedName("ub.O")
	public int field741;

	@ObfuscatedName("ub.R")
	public int field744;

	@ObfuscatedName("ub.S")
	public int field745;

	@ObfuscatedName("ub.U")
	public int field747;

	@ObfuscatedName("ub.T")
	public long field746;

	@ObfuscatedName("ub.M")
	public class39 field739;

	@ObfuscatedName("ub.J")
	public InputStream field736;

	@ObfuscatedName("ub.K")
	public OutputStream field737;

	@ObfuscatedName("ub.I")
	public Socket field735;

	@ObfuscatedName("ub.a(Lxb;Lclient;)V")
	public final void method270(class50 arg0, client arg1) {
		String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		for (int var4 = 0; var4 < 4; var4++) {
			byte[] var5 = arg0.method299(var3[var4], null);
			int var6 = var5.length / 2;
			class38 var7 = new class38(var5);
			field709[var4] = new int[var6];
			field711[var4] = new byte[var6];

			for (int var8 = 0; var8 < var6; var8++) {
				field709[var4][var8] = var7.method231();
			}
		}

		String[] var9 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
		for (int var10 = 0; var10 < 4; var10++) {
			byte[] var11 = arg0.method299(var9[var10], null);
			int var12 = var11.length / 4;
			class38 var13 = new class38(var11);
			field710[var10] = new int[var12];
			for (int var14 = 0; var14 < var12; var14++) {
				field710[var10][var14] = var13.method234();
			}
		}

		byte[] var15 = arg0.method299("model_index", null);
		int var16 = field709[0].length;
		field713 = new byte[var16];
		for (int var17 = 0; var17 < var16; var17++) {
			if (var17 < var15.length) {
				field713[var17] = var15[var17];
			} else {
				field713[var17] = 0;
			}
		}

		byte[] var18 = arg0.method299("map_index", null);
		class38 var19 = new class38(var18);
		int var20 = var18.length / 7;
		field714 = new int[var20];
		field715 = new int[var20];
		field716 = new int[var20];
		field717 = new int[var20];
		for (int var21 = 0; var21 < var20; var21++) {
			field714[var21] = var19.method231();
			field715[var21] = var19.method231();
			field716[var21] = var19.method231();
			field717[var21] = var19.method229();
		}

		byte[] var22 = arg0.method299("anim_index", null);
		class38 var23 = new class38(var22);
		int var24 = var22.length / 2;
		field718 = new int[var24];
		for (int var25 = 0; var25 < var24; var25++) {
			field718[var25] = var23.method231();
		}

		byte[] var26 = arg0.method299("midi_index", null);
		class38 var27 = new class38(var26);
		int var28 = var26.length;
		field719 = new int[var28];
		for (int var29 = 0; var29 < var28; var29++) {
			field719[var29] = var27.method229();
		}

		field721 = arg1;
		field720 = true;
		field721.method12(this, 2);
	}

	@ObfuscatedName("ub.a()V")
	public final void method271() {
		field720 = false;
	}

	@ObfuscatedName("ub.a(II)I")
	public final int method272(int arg0) {
		return field709[arg0].length;
	}

	@ObfuscatedName("ub.b(I)I")
	public final int method273() {
		return field718.length;
	}

	@ObfuscatedName("ub.a(IIII)I")
	public final int method274(int arg0, int arg1, int arg2) {
		int var4 = (arg0 << 8) + arg2;
		for (int var5 = 0; var5 < field714.length; var5++) {
			if (field714[var5] == var4) {
				if (arg1 == 0) {
					return field715[var5];
				}

				return field716[var5];
			}
		}

		return -1;
	}

	@ObfuscatedName("ub.a(ZI)V")
	public final void method275(boolean arg0) {
		int var2 = field714.length;
		for (int var3 = 0; var3 < var2; var3++) {
			if (arg0 || field717[var3] != 0) {
				method282(3, (byte) 2, field716[var3]);
				method282(3, (byte) 2, field715[var3]);
			}
		}
	}

	@ObfuscatedName("ub.b(II)Z")
	public final boolean method276(int arg0) {
		for (int var2 = 0; var2 < field714.length; var2++) {
			if (field716[var2] == arg0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("ub.a(IB)I")
	public final int method277(int arg0) {
		return field713[arg0] & 0xFF;
	}

	@ObfuscatedName("ub.c(II)Z")
	public final boolean method278(int arg0) {
		if (field719[arg0] == 1) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("ub.a(I)V")
	public final void method269(int arg0) {
		method279(0, arg0);
	}

	@ObfuscatedName("ub.d(II)V")
	public final void method279(int arg0, int arg1) {
		if (arg0 >= 0 && arg0 <= field709.length && arg1 >= 0 && arg1 <= field709[arg0].length && field709[arg0][arg1] != 0) {
			synchronized (field726) {
				for (class39 var4 = (class39) field726.method255(); var4 != null; var4 = (class39) field726.method256()) {
					if (var4.field633 == arg0 && var4.field634 == arg1) {
						return;
					}
				}

				class39 var5 = new class39();
				var5.field633 = arg0;
				var5.field634 = arg1;
				var5.field637 = true;

				synchronized (field727) {
					field727.method245(var5);
				}

				field726.method253(var5);
			}
		}
	}

	@ObfuscatedName("ub.b()I")
	public final int method280() {
		synchronized (field726) {
			return field726.method257();
		}
	}

	@ObfuscatedName("ub.c()Lmb;")
	public final class39 method281() {
		class39 var2;
		synchronized (field730) {
			var2 = (class39) field730.method247();
		}

		if (var2 == null) {
			return null;
		}

		synchronized (field726) {
			var2.method107();
		}

		if (var2.field635 == null) {
			return var2;
		}

		int var4 = 0;
		try {
			GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field635));
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

		var2.field635 = new byte[var4];
		for (int var7 = 0; var7 < var4; var7++) {
			var2.field635[var7] = field743[var7];
		}

		return var2;
	}

	@ObfuscatedName("ub.a(IIBI)V")
	public final void method282(int arg0, byte arg1, int arg2) {
		if (field721.field1077[0] != null && field709[arg0][arg2] != 0) {
			byte[] var4 = field721.field1077[arg0 + 1].method291(arg2);
			if (!method289(field709[arg0][arg2], field710[arg0][arg2], var4)) {
				field711[arg0][arg2] = arg1;

				if (arg1 > field712) {
					field712 = arg1;
				}

				field734++;
			}
		}
	}

	@ObfuscatedName("ub.c(I)V")
	public final void method283() {
		synchronized (field731) {
			field731.method252();
		}
	}

	@ObfuscatedName("ub.a(IBI)V")
	public final void method284(int arg0, int arg1) {
		if (field721.field1077[0] != null && (field709[arg0][arg1] != 0 && (field711[arg0][arg1] != 0 && field712 != 0))) {
			class39 var3 = new class39();
			var3.field633 = arg0;
			var3.field634 = arg1;
			var3.field637 = false;

			synchronized (field731) {
				field731.method245(var3);
			}
		}
	}

	public final void run() {
		try {
			while (field720) {
				field747++;
				byte var1 = 20;
				if (field712 == 0 && field721.field1077[0] != null) {
					var1 = 50;
				}

				try {
					Thread.sleep(var1);
				} catch (Exception var9) {
				}

				field723 = true;
				for (int var2 = 0; var2 < 100 && field723; var2++) {
					field723 = false;
					method285();
					method286();

					if (field724 == 0 && var2 >= 5) {
						break;
					}

					method287();

					if (field736 != null) {
						method288();
					}
				}

				boolean var3 = false;
				for (class39 var4 = (class39) field729.method248(); var4 != null; var4 = (class39) field729.method250()) {
					if (var4.field637) {
						var3 = true;
						var4.field636++;
						if (var4.field636 > 50) {
							var4.field636 = 0;
							method290(var4);
						}
					}
				}

				if (!var3) {
					for (class39 var5 = (class39) field729.method248(); var5 != null; var5 = (class39) field729.method250()) {
						var3 = true;
						var5.field636++;
						if (var5.field636 > 50) {
							var5.field636 = 0;
							method290(var5);
						}
					}
				}

				if (var3) {
					field744++;
					if (field744 > 750) {
						try {
							field735.close();
						} catch (Exception var8) {
						}

						field735 = null;
						field736 = null;
						field737 = null;
						field741 = 0;
					}
				} else {
					field744 = 0;
					field732 = "";
				}

				if (field721.field1170 && field735 != null && field737 != null && (field712 > 0 || field721.field1077[0] == null)) {
					field745++;
					if (field745 > 500) {
						field745 = 0;
						field742[0] = 0;
						field742[1] = 0;
						field742[2] = 0;
						field742[3] = 10;
						try {
							field737.write(field742, 0, 4);
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

	@ObfuscatedName("ub.d(I)V")
	public final void method285() {
		class39 var2;
		synchronized (field727) {
			var2 = (class39) field727.method247();
		}

		while (var2 != null) {
			field723 = true;
			byte[] var3 = null;
			if (field721.field1077[0] != null) {
				var3 = field721.field1077[var2.field633 + 1].method291(var2.field634);
			}

			if (!method289(field709[var2.field633][var2.field634], field710[var2.field633][var2.field634], var3)) {
				var3 = null;
			}

			synchronized (field727) {
				if (var3 == null) {
					field728.method245(var2);
				} else {
					var2.field635 = var3;

					synchronized (field730) {
						field730.method245(var2);
					}
				}

				var2 = (class39) field727.method247();
			}
		}
	}

	@ObfuscatedName("ub.e(I)V")
	public final void method286() {
		field724 = 0;
		field725 = 0;
		for (class39 var1 = (class39) field729.method248(); var1 != null; var1 = (class39) field729.method250()) {
			if (var1.field637) {
				field724++;
			} else {
				field725++;
			}
		}

		while (field724 < 10) {
			class39 var2 = (class39) field728.method247();
			if (var2 == null) {
				break;
			}

			if (field711[var2.field633][var2.field634] != 0) {
				field733++;
			}

			field711[var2.field633][var2.field634] = 0;
			field729.method245(var2);
			field724++;
			method290(var2);
			field723 = true;
		}
	}

	@ObfuscatedName("ub.f(I)V")
	public final void method287() {
		while (field724 == 0) {
			if (field725 >= 10 || field712 == 0) {
				return;
			}

			class39 var2;
			synchronized (field731) {
				var2 = (class39) field731.method247();
			}

			while (var2 != null) {
				if (field711[var2.field633][var2.field634] != 0) {
					field711[var2.field633][var2.field634] = 0;
					field729.method245(var2);
					method290(var2);
					field723 = true;

					if (field733 < field734) {
						field733++;
					}

					field732 = "Loading extra files - " + field733 * 100 / field734 + "%";
					field725++;
					if (field725 == 10) {
						return;
					}
				}

				synchronized (field731) {
					var2 = (class39) field731.method247();
				}
			}

			for (int var4 = 0; var4 < 4; var4++) {
				byte[] var5 = field711[var4];
				int var6 = var5.length;
				for (int var7 = 0; var7 < var6; var7++) {
					if (var5[var7] == field712) {
						var5[var7] = 0;
						class39 var8 = new class39();
						var8.field633 = var4;
						var8.field634 = var7;
						var8.field637 = false;
						field729.method245(var8);
						method290(var8);
						field723 = true;

						if (field733 < field734) {
							field733++;
						}

						field732 = "Loading extra files - " + field733 * 100 / field734 + "%";
						field725++;
						if (field725 == 10) {
							return;
						}
					}
				}
			}

			field712--;
		}
	}

	@ObfuscatedName("ub.g(I)V")
	public final void method288() {
		try {
			int var1 = field736.available();
			if (field741 == 0 && var1 >= 6) {
				field723 = true;

				for (int var2 = 0; var2 < 6; var2 += field736.read(field742, var2, 6 - var2)) {
				}

				int var3 = field742[0] & 0xFF;
				int var4 = ((field742[1] & 0xFF) << 8) + (field742[2] & 0xFF);
				int var5 = ((field742[3] & 0xFF) << 8) + (field742[4] & 0xFF);
				int var6 = field742[5] & 0xFF;
				field739 = null;
				for (class39 var7 = (class39) field729.method248(); var7 != null; var7 = (class39) field729.method250()) {
					if (var7.field633 == var3 && var7.field634 == var4) {
						field739 = var7;
					}

					if (field739 != null) {
						var7.field636 = 0;
					}
				}

				if (field739 != null) {
					field744 = 0;

					if (var5 == 0) {
						signlink.reporterror("Rej: " + var3 + "," + var4);
						field739.field635 = null;

						if (field739.field637) {
							synchronized (field730) {
								field730.method245(field739);
							}
						} else {
							field739.method106();
						}

						field739 = null;
					} else {
						if (field739.field635 == null && var6 == 0) {
							field739.field635 = new byte[var5];
						}

						if (field739.field635 == null && var6 != 0) {
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
				field723 = true;
				byte[] var9 = field742;
				int var10 = 0;
				if (field739 != null) {
					var9 = field739.field635;
					var10 = field740;
				}

				for (int var11 = 0; var11 < field741; var11 += field736.read(var9, var10 + var11, field741 - var11)) {
				}

				if (field741 + field740 >= var9.length && field739 != null) {
					if (field721.field1077[0] != null) {
						field721.field1077[field739.field633 + 1].method292(field739.field634, var9, var9.length);
					}

					if (!field739.field637 && field739.field633 == 3) {
						field739.field637 = true;
						field739.field633 = 93;
					}

					if (field739.field637) {
						synchronized (field730) {
							field730.method245(field739);
						}
					} else {
						field739.method106();
					}
				}

				field741 = 0;
			}
		} catch (IOException var17) {
			try {
				field735.close();
			} catch (Exception var14) {
			}

			field735 = null;
			field736 = null;
			field737 = null;
			field741 = 0;
		}
	}

	@ObfuscatedName("ub.a(IZI[B)Z")
	public final boolean method289(int arg0, int arg1, byte[] arg2) {
		if (arg2 != null && arg2.length >= 2) {
			int var4 = arg2.length - 2;
			int var5 = ((arg2[var4] & 0xFF) << 8) + (arg2[var4 + 1] & 0xFF);
			field722.reset();
			field722.update(arg2, 0, var4);
			int var6 = (int) field722.getValue();

			if (arg0 != var5) {
				return false;
			}

			if (arg1 != var6) {
				return false;
			}

			return true;
		}

		return false;
	}

	@ObfuscatedName("ub.a(ILmb;)V")
	public final void method290(class39 arg0) {
		try {
			if (field735 == null) {
				long var2 = System.currentTimeMillis();
				if (var2 - field746 < 4000L) {
					return;
				}

				field746 = var2;
				field735 = field721.method495(client.field1127 + 43594);
				field736 = field735.getInputStream();
				field737 = field735.getOutputStream();
				field737.write(15);

				for (int var4 = 0; var4 < 8; var4++) {
					field736.read();
				}

				field744 = 0;
			}

			field742[0] = (byte) arg0.field633;
			field742[1] = (byte) (arg0.field634 >> 8);
			field742[2] = (byte) arg0.field634;
			if (arg0.field637) {
				field742[3] = 2;
			} else if (field721.field1170) {
				field742[3] = 0;
			} else {
				field742[3] = 1;
			}

			field737.write(field742, 0, 4);
			field745 = 0;
			field738 = -10000;
		} catch (IOException var7) {
			try {
				field735.close();
			} catch (Exception var6) {
			}

			field735 = null;
			field736 = null;
			field737 = null;
			field741 = 0;
			field738++;
		}
	}
}
