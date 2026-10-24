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
	public int[][] field713 = new int[4][];

	@ObfuscatedName("vb.g")
	public int[][] field714 = new int[4][];

	@ObfuscatedName("vb.h")
	public byte[][] field715 = new byte[4][];

	@ObfuscatedName("vb.i")
	public int field716;

	@ObfuscatedName("vb.j")
	public byte[] field717;

	@ObfuscatedName("vb.k")
	public int[] field718;

	@ObfuscatedName("vb.l")
	public int[] field719;

	@ObfuscatedName("vb.m")
	public int[] field720;

	@ObfuscatedName("vb.n")
	public int[] field721;

	@ObfuscatedName("vb.o")
	public int[] field722;

	@ObfuscatedName("vb.p")
	public int[] field723;

	@ObfuscatedName("vb.q")
	public boolean field724 = true;

	@ObfuscatedName("vb.r")
	public client field725;

	@ObfuscatedName("vb.s")
	public CRC32 field726 = new CRC32();

	@ObfuscatedName("vb.t")
	public boolean field727 = false;

	@ObfuscatedName("vb.u")
	public int field728;

	@ObfuscatedName("vb.v")
	public int field729;

	@ObfuscatedName("vb.w")
	public class43 field730 = new class43();

	@ObfuscatedName("vb.x")
	public class42 field731 = new class42();

	@ObfuscatedName("vb.y")
	public class42 field732 = new class42();

	@ObfuscatedName("vb.z")
	public class42 field733 = new class42();

	@ObfuscatedName("vb.A")
	public class42 field734 = new class42();

	@ObfuscatedName("vb.B")
	public class42 field735 = new class42();

	@ObfuscatedName("vb.C")
	public String field736 = "";

	@ObfuscatedName("vb.L")
	public byte[] field745 = new byte[500];

	@ObfuscatedName("vb.M")
	public byte[] field746 = new byte[65000];

	@ObfuscatedName("vb.D")
	public int field737;

	@ObfuscatedName("vb.E")
	public int field738;

	@ObfuscatedName("vb.J")
	public int field743;

	@ObfuscatedName("vb.K")
	public int field744;

	@ObfuscatedName("vb.N")
	public int field747;

	@ObfuscatedName("vb.O")
	public int field748;

	@ObfuscatedName("vb.Q")
	public int field750;

	@ObfuscatedName("vb.P")
	public long field749;

	@ObfuscatedName("vb.I")
	public class40 field742;

	@ObfuscatedName("vb.G")
	public InputStream field740;

	@ObfuscatedName("vb.H")
	public OutputStream field741;

	@ObfuscatedName("vb.F")
	public Socket field739;

	@ObfuscatedName("vb.a(Lyb;Lclient;)V")
	public final void method269(class51 arg0, client arg1) {
		String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		for (int var4 = 0; var4 < 4; var4++) {
			byte[] var5 = arg0.method298(var3[var4], null);
			int var6 = var5.length / 2;
			class39 var7 = new class39(var5);
			field713[var4] = new int[var6];
			field715[var4] = new byte[var6];

			for (int var8 = 0; var8 < var6; var8++) {
				field713[var4][var8] = var7.method230();
			}
		}

		String[] var9 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
		for (int var10 = 0; var10 < 4; var10++) {
			byte[] var11 = arg0.method298(var9[var10], null);
			int var12 = var11.length / 4;
			class39 var13 = new class39(var11);
			field714[var10] = new int[var12];
			for (int var14 = 0; var14 < var12; var14++) {
				field714[var10][var14] = var13.method233();
			}
		}

		byte[] var15 = arg0.method298("model_index", null);
		int var16 = field713[0].length;
		field717 = new byte[var16];
		for (int var17 = 0; var17 < var16; var17++) {
			if (var17 < var15.length) {
				field717[var17] = var15[var17];
			} else {
				field717[var17] = 0;
			}
		}

		byte[] var18 = arg0.method298("map_index", null);
		class39 var19 = new class39(var18);
		int var20 = var18.length / 7;
		field718 = new int[var20];
		field719 = new int[var20];
		field720 = new int[var20];
		field721 = new int[var20];
		for (int var21 = 0; var21 < var20; var21++) {
			field718[var21] = var19.method230();
			field719[var21] = var19.method230();
			field720[var21] = var19.method230();
			field721[var21] = var19.method228();
		}

		byte[] var22 = arg0.method298("anim_index", null);
		class39 var23 = new class39(var22);
		int var24 = var22.length / 2;
		field722 = new int[var24];
		for (int var25 = 0; var25 < var24; var25++) {
			field722[var25] = var23.method230();
		}

		byte[] var26 = arg0.method298("midi_index", null);
		class39 var27 = new class39(var26);
		int var28 = var26.length;
		field723 = new int[var28];
		for (int var29 = 0; var29 < var28; var29++) {
			field723[var29] = var27.method228();
		}

		field725 = arg1;
		field724 = true;
		field725.method12(this, 2);
	}

	@ObfuscatedName("vb.a()V")
	public final void method270() {
		field724 = false;
	}

	@ObfuscatedName("vb.a(II)I")
	public final int method271(int arg0) {
		return field713[arg0].length;
	}

	@ObfuscatedName("vb.b(I)I")
	public final int method272() {
		return field722.length;
	}

	@ObfuscatedName("vb.a(IIII)I")
	public final int method273(int arg0, int arg1, int arg2) {
		int var4 = (arg0 << 8) + arg2;
		for (int var5 = 0; var5 < field718.length; var5++) {
			if (field718[var5] == var4) {
				if (arg1 == 0) {
					return field719[var5];
				}

				return field720[var5];
			}
		}

		return -1;
	}

	@ObfuscatedName("vb.a(ZB)V")
	public final void method274(boolean arg0) {
		int var2 = field718.length;
		for (int var3 = 0; var3 < var2; var3++) {
			if (arg0 || field721[var3] != 0) {
				method281(field720[var3], (byte) 2, 3);
				method281(field719[var3], (byte) 2, 3);
			}
		}
	}

	@ObfuscatedName("vb.b(II)Z")
	public final boolean method275(int arg0) {
		for (int var2 = 0; var2 < field718.length; var2++) {
			if (field720[var2] == arg0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("vb.c(II)I")
	public final int method276(int arg0) {
		return field717[arg0] & 0xFF;
	}

	@ObfuscatedName("vb.a(ZI)Z")
	public final boolean method277(int arg0) {
		if (field723[arg0] == 1) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("vb.a(I)V")
	public final void method268(int arg0) {
		method278(0, arg0);
	}

	@ObfuscatedName("vb.d(II)V")
	public final void method278(int arg0, int arg1) {
		if (arg0 >= 0 && arg0 <= field713.length && arg1 >= 0 && arg1 <= field713[arg0].length && field713[arg0][arg1] != 0) {
			synchronized (field730) {
				for (class40 var4 = (class40) field730.method254(); var4 != null; var4 = (class40) field730.method255()) {
					if (var4.field637 == arg0 && var4.field638 == arg1) {
						return;
					}
				}

				class40 var5 = new class40();
				var5.field637 = arg0;
				var5.field638 = arg1;
				var5.field641 = true;

				synchronized (field731) {
					field731.method244(var5);
				}

				field730.method252(var5);
			}
		}
	}

	@ObfuscatedName("vb.b()I")
	public final int method279() {
		synchronized (field730) {
			return field730.method256();
		}
	}

	@ObfuscatedName("vb.c()Lnb;")
	public final class40 method280() {
		class40 var2;
		synchronized (field734) {
			var2 = (class40) field734.method246();
		}

		if (var2 == null) {
			return null;
		}

		synchronized (field730) {
			var2.method107();
		}

		if (var2.field639 == null) {
			return var2;
		}

		int var4 = 0;
		try {
			GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field639));
			while (true) {
				if (field746.length == var4) {
					throw new RuntimeException("buffer overflow!");
				}

				int var6 = var5.read(field746, var4, field746.length - var4);
				if (var6 == -1) {
					break;
				}

				var4 += var6;
			}
		} catch (IOException var10) {
			throw new RuntimeException("error unzipping");
		}

		var2.field639 = new byte[var4];
		for (int var7 = 0; var7 < var4; var7++) {
			var2.field639[var7] = field746[var7];
		}

		return var2;
	}

	@ObfuscatedName("vb.a(IBZI)V")
	public final void method281(int arg0, byte arg1, int arg2) {
		if (field725.field1295[0] != null && field713[arg2][arg0] != 0) {
			byte[] var4 = field725.field1295[arg2 + 1].method290(arg0);
			if (!method288(field713[arg2][arg0], field714[arg2][arg0], var4)) {
				field715[arg2][arg0] = arg1;

				if (arg1 > field716) {
					field716 = arg1;
				}

				field738++;
			}
		}
	}

	@ObfuscatedName("vb.c(I)V")
	public final void method282() {
		synchronized (field735) {
			field735.method251();
		}
	}

	@ObfuscatedName("vb.a(IBI)V")
	public final void method283(int arg0, int arg1) {
		if (field725.field1295[0] != null && (field713[arg0][arg1] != 0 && (field715[arg0][arg1] != 0 && field716 != 0))) {
			class40 var3 = new class40();
			var3.field637 = arg0;
			var3.field638 = arg1;
			var3.field641 = false;

			synchronized (field735) {
				field735.method244(var3);
			}
		}
	}

	public final void run() {
		try {
			while (field724) {
				field750++;
				byte var1 = 20;
				if (field716 == 0 && field725.field1295[0] != null) {
					var1 = 50;
				}

				try {
					Thread.sleep(var1);
				} catch (Exception var9) {
				}

				field727 = true;
				for (int var2 = 0; var2 < 100 && field727; var2++) {
					field727 = false;
					method284();
					method285();

					if (field728 == 0 && var2 >= 5) {
						break;
					}

					method286();

					if (field740 != null) {
						method287();
					}
				}

				boolean var3 = false;
				for (class40 var4 = (class40) field733.method247(); var4 != null; var4 = (class40) field733.method249()) {
					if (var4.field641) {
						var3 = true;
						var4.field640++;
						if (var4.field640 > 50) {
							var4.field640 = 0;
							method289(var4);
						}
					}
				}

				if (!var3) {
					for (class40 var5 = (class40) field733.method247(); var5 != null; var5 = (class40) field733.method249()) {
						var3 = true;
						var5.field640++;
						if (var5.field640 > 50) {
							var5.field640 = 0;
							method289(var5);
						}
					}
				}

				if (var3) {
					field747++;
					if (field747 > 750) {
						try {
							field739.close();
						} catch (Exception var8) {
						}

						field739 = null;
						field740 = null;
						field741 = null;
						field744 = 0;
					}
				} else {
					field747 = 0;
					field736 = "";
				}

				if (field725.field1452 && field739 != null && field741 != null && (field716 > 0 || field725.field1295[0] == null)) {
					field748++;
					if (field748 > 500) {
						field748 = 0;
						field745[0] = 0;
						field745[1] = 0;
						field745[2] = 0;
						field745[3] = 10;
						try {
							field741.write(field745, 0, 4);
						} catch (IOException var7) {
							field747 = 5000;
						}
					}
				}
			}
		} catch (Exception var10) {
			signlink.reporterror("od_ex " + var10.getMessage());
		}
	}

	@ObfuscatedName("vb.a(B)V")
	public final void method284() {
		class40 var2;
		synchronized (field731) {
			var2 = (class40) field731.method246();
		}

		while (var2 != null) {
			field727 = true;
			byte[] var3 = null;
			if (field725.field1295[0] != null) {
				var3 = field725.field1295[var2.field637 + 1].method290(var2.field638);
			}

			if (!method288(field713[var2.field637][var2.field638], field714[var2.field637][var2.field638], var3)) {
				var3 = null;
			}

			synchronized (field731) {
				if (var3 == null) {
					field732.method244(var2);
				} else {
					var2.field639 = var3;

					synchronized (field734) {
						field734.method244(var2);
					}
				}

				var2 = (class40) field731.method246();
			}
		}
	}

	@ObfuscatedName("vb.d(I)V")
	public final void method285() {
		field728 = 0;
		field729 = 0;
		for (class40 var1 = (class40) field733.method247(); var1 != null; var1 = (class40) field733.method249()) {
			if (var1.field641) {
				field728++;
			} else {
				field729++;
			}
		}

		while (field728 < 10) {
			class40 var2 = (class40) field732.method246();
			if (var2 == null) {
				break;
			}

			if (field715[var2.field637][var2.field638] != 0) {
				field737++;
			}

			field715[var2.field637][var2.field638] = 0;
			field733.method244(var2);
			field728++;
			method289(var2);
			field727 = true;
		}
	}

	@ObfuscatedName("vb.b(B)V")
	public final void method286() {
		while (field728 == 0) {
			if (field729 >= 10 || field716 == 0) {
				return;
			}

			class40 var2;
			synchronized (field735) {
				var2 = (class40) field735.method246();
			}

			while (var2 != null) {
				if (field715[var2.field637][var2.field638] != 0) {
					field715[var2.field637][var2.field638] = 0;
					field733.method244(var2);
					method289(var2);
					field727 = true;

					if (field737 < field738) {
						field737++;
					}

					field736 = "Loading extra files - " + field737 * 100 / field738 + "%";
					field729++;
					if (field729 == 10) {
						return;
					}
				}

				synchronized (field735) {
					var2 = (class40) field735.method246();
				}
			}

			for (int var4 = 0; var4 < 4; var4++) {
				byte[] var5 = field715[var4];
				int var6 = var5.length;
				for (int var7 = 0; var7 < var6; var7++) {
					if (var5[var7] == field716) {
						var5[var7] = 0;
						class40 var8 = new class40();
						var8.field637 = var4;
						var8.field638 = var7;
						var8.field641 = false;
						field733.method244(var8);
						method289(var8);
						field727 = true;

						if (field737 < field738) {
							field737++;
						}

						field736 = "Loading extra files - " + field737 * 100 / field738 + "%";
						field729++;
						if (field729 == 10) {
							return;
						}
					}
				}
			}

			field716--;
		}
	}

	@ObfuscatedName("vb.e(I)V")
	public final void method287() {
		try {
			int var1 = field740.available();
			if (field744 == 0 && var1 >= 6) {
				field727 = true;

				for (int var2 = 0; var2 < 6; var2 += field740.read(field745, var2, 6 - var2)) {
				}

				int var3 = field745[0] & 0xFF;
				int var4 = ((field745[1] & 0xFF) << 8) + (field745[2] & 0xFF);
				int var5 = ((field745[3] & 0xFF) << 8) + (field745[4] & 0xFF);
				int var6 = field745[5] & 0xFF;
				field742 = null;
				for (class40 var7 = (class40) field733.method247(); var7 != null; var7 = (class40) field733.method249()) {
					if (var7.field637 == var3 && var7.field638 == var4) {
						field742 = var7;
					}

					if (field742 != null) {
						var7.field640 = 0;
					}
				}

				if (field742 != null) {
					field747 = 0;

					if (var5 == 0) {
						signlink.reporterror("Rej: " + var3 + "," + var4);
						field742.field639 = null;

						if (field742.field641) {
							synchronized (field734) {
								field734.method244(field742);
							}
						} else {
							field742.method106();
						}

						field742 = null;
					} else {
						if (field742.field639 == null && var6 == 0) {
							field742.field639 = new byte[var5];
						}

						if (field742.field639 == null && var6 != 0) {
							throw new IOException("missing start of file");
						}
					}
				}

				field743 = var6 * 500;
				field744 = 500;
				if (field744 > var5 - var6 * 500) {
					field744 = var5 - var6 * 500;
				}
			}

			if (field744 > 0 && var1 >= field744) {
				field727 = true;
				byte[] var9 = field745;
				int var10 = 0;
				if (field742 != null) {
					var9 = field742.field639;
					var10 = field743;
				}

				for (int var11 = 0; var11 < field744; var11 += field740.read(var9, var10 + var11, field744 - var11)) {
				}

				if (field744 + field743 >= var9.length && field742 != null) {
					if (field725.field1295[0] != null) {
						field725.field1295[field742.field637 + 1].method291(var9, field742.field638, var9.length);
					}

					if (!field742.field641 && field742.field637 == 3) {
						field742.field641 = true;
						field742.field637 = 93;
					}

					if (field742.field641) {
						synchronized (field734) {
							field734.method244(field742);
						}
					} else {
						field742.method106();
					}
				}

				field744 = 0;
			}
		} catch (IOException var17) {
			try {
				field739.close();
			} catch (Exception var14) {
			}

			field739 = null;
			field740 = null;
			field741 = null;
			field744 = 0;
		}
	}

	@ObfuscatedName("vb.a(III[B)Z")
	public final boolean method288(int arg0, int arg1, byte[] arg2) {
		if (arg2 != null && arg2.length >= 2) {
			int var4 = arg2.length - 2;
			int var5 = ((arg2[var4] & 0xFF) << 8) + (arg2[var4 + 1] & 0xFF);
			field726.reset();
			field726.update(arg2, 0, var4);
			int var6 = (int) field726.getValue();

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

	@ObfuscatedName("vb.a(Lnb;Z)V")
	public final void method289(class40 arg0) {
		try {
			if (field739 == null) {
				long var2 = System.currentTimeMillis();
				if (var2 - field749 < 5000L) {
					return;
				}

				field749 = var2;
				field739 = field725.method450(client.field1263 + 43594);
				field740 = field739.getInputStream();
				field741 = field739.getOutputStream();
				field741.write(15);

				for (int var4 = 0; var4 < 8; var4++) {
					field740.read();
				}

				field747 = 0;
			}

			field745[0] = (byte) arg0.field637;
			field745[1] = (byte) (arg0.field638 >> 8);
			field745[2] = (byte) arg0.field638;
			if (arg0.field641) {
				field745[3] = 2;
			} else if (field725.field1452) {
				field745[3] = 0;
			} else {
				field745[3] = 1;
			}

			field741.write(field745, 0, 4);
			field748 = 0;
		} catch (IOException var7) {
			try {
				field739.close();
			} catch (Exception var6) {
			}

			field739 = null;
			field740 = null;
			field741 = null;
			field744 = 0;
		}
	}
}
