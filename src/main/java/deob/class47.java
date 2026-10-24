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
	public int[][] field705 = new int[4][];

	@ObfuscatedName("ub.i")
	public int[][] field706 = new int[4][];

	@ObfuscatedName("ub.j")
	public byte[][] field707 = new byte[4][];

	@ObfuscatedName("ub.k")
	public int field708;

	@ObfuscatedName("ub.l")
	public byte[] field709;

	@ObfuscatedName("ub.m")
	public int[] field710;

	@ObfuscatedName("ub.n")
	public int[] field711;

	@ObfuscatedName("ub.o")
	public int[] field712;

	@ObfuscatedName("ub.p")
	public int[] field713;

	@ObfuscatedName("ub.q")
	public int[] field714;

	@ObfuscatedName("ub.r")
	public int[] field715;

	@ObfuscatedName("ub.s")
	public boolean field716 = true;

	@ObfuscatedName("ub.t")
	public client field717;

	@ObfuscatedName("ub.u")
	public CRC32 field718 = new CRC32();

	@ObfuscatedName("ub.v")
	public boolean field719 = false;

	@ObfuscatedName("ub.w")
	public int field720;

	@ObfuscatedName("ub.x")
	public int field721;

	@ObfuscatedName("ub.y")
	public class42 field722 = new class42();

	@ObfuscatedName("ub.z")
	public class41 field723 = new class41();

	@ObfuscatedName("ub.A")
	public class41 field724 = new class41();

	@ObfuscatedName("ub.B")
	public class41 field725 = new class41();

	@ObfuscatedName("ub.C")
	public class41 field726 = new class41();

	@ObfuscatedName("ub.D")
	public class41 field727 = new class41();

	@ObfuscatedName("ub.E")
	public String field728 = "";

	@ObfuscatedName("ub.O")
	public byte[] field738 = new byte[500];

	@ObfuscatedName("ub.P")
	public byte[] field739 = new byte[65000];

	@ObfuscatedName("ub.F")
	public int field729;

	@ObfuscatedName("ub.G")
	public int field730;

	@ObfuscatedName("ub.K")
	public int field734;

	@ObfuscatedName("ub.M")
	public int field736;

	@ObfuscatedName("ub.N")
	public int field737;

	@ObfuscatedName("ub.Q")
	public int field740;

	@ObfuscatedName("ub.R")
	public int field741;

	@ObfuscatedName("ub.T")
	public int field743;

	@ObfuscatedName("ub.S")
	public long field742;

	@ObfuscatedName("ub.L")
	public class39 field735;

	@ObfuscatedName("ub.I")
	public InputStream field732;

	@ObfuscatedName("ub.J")
	public OutputStream field733;

	@ObfuscatedName("ub.H")
	public Socket field731;

	@ObfuscatedName("ub.a(Lxb;Lclient;)V")
	public final void method266(class50 arg0, client arg1) {
		String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		for (int var4 = 0; var4 < 4; var4++) {
			byte[] var5 = arg0.method295(var3[var4], null);
			int var6 = var5.length / 2;
			class38 var7 = new class38(var5);
			field705[var4] = new int[var6];
			field707[var4] = new byte[var6];

			for (int var8 = 0; var8 < var6; var8++) {
				field705[var4][var8] = var7.method227();
			}
		}

		String[] var9 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
		for (int var10 = 0; var10 < 4; var10++) {
			byte[] var11 = arg0.method295(var9[var10], null);
			int var12 = var11.length / 4;
			class38 var13 = new class38(var11);
			field706[var10] = new int[var12];
			for (int var14 = 0; var14 < var12; var14++) {
				field706[var10][var14] = var13.method230();
			}
		}

		byte[] var15 = arg0.method295("model_index", null);
		int var16 = field705[0].length;
		field709 = new byte[var16];
		for (int var17 = 0; var17 < var16; var17++) {
			if (var17 < var15.length) {
				field709[var17] = var15[var17];
			} else {
				field709[var17] = 0;
			}
		}

		byte[] var18 = arg0.method295("map_index", null);
		class38 var19 = new class38(var18);
		int var20 = var18.length / 7;
		field710 = new int[var20];
		field711 = new int[var20];
		field712 = new int[var20];
		field713 = new int[var20];
		for (int var21 = 0; var21 < var20; var21++) {
			field710[var21] = var19.method227();
			field711[var21] = var19.method227();
			field712[var21] = var19.method227();
			field713[var21] = var19.method225();
		}

		byte[] var22 = arg0.method295("anim_index", null);
		class38 var23 = new class38(var22);
		int var24 = var22.length / 2;
		field714 = new int[var24];
		for (int var25 = 0; var25 < var24; var25++) {
			field714[var25] = var23.method227();
		}

		byte[] var26 = arg0.method295("midi_index", null);
		class38 var27 = new class38(var26);
		int var28 = var26.length;
		field715 = new int[var28];
		for (int var29 = 0; var29 < var28; var29++) {
			field715[var29] = var27.method225();
		}

		field717 = arg1;
		field716 = true;
		field717.method12(this, 2);
	}

	@ObfuscatedName("ub.a()V")
	public final void method267() {
		field716 = false;
	}

	@ObfuscatedName("ub.a(II)I")
	public final int method268(int arg0) {
		return field705[arg0].length;
	}

	@ObfuscatedName("ub.b(I)I")
	public final int method269() {
		return field714.length;
	}

	@ObfuscatedName("ub.a(IIIZ)I")
	public final int method270(int arg0, int arg1, int arg2) {
		int var4 = (arg1 << 8) + arg2;
		for (int var5 = 0; var5 < field710.length; var5++) {
			if (field710[var5] == var4) {
				if (arg0 == 0) {
					return field711[var5];
				}

				return field712[var5];
			}
		}

		return -1;
	}

	@ObfuscatedName("ub.a(BZ)V")
	public final void method271(boolean arg0) {
		int var2 = field710.length;
		for (int var3 = 0; var3 < var2; var3++) {
			if (arg0 || field713[var3] != 0) {
				method278(field712[var3], (byte) 2, 3);
				method278(field711[var3], (byte) 2, 3);
			}
		}
	}

	@ObfuscatedName("ub.b(II)Z")
	public final boolean method272(int arg0) {
		for (int var2 = 0; var2 < field710.length; var2++) {
			if (field712[var2] == arg0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("ub.c(II)I")
	public final int method273(int arg0) {
		return field709[arg0] & 0xFF;
	}

	@ObfuscatedName("ub.d(II)Z")
	public final boolean method274(int arg0) {
		if (field715[arg0] == 1) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("ub.a(I)V")
	public final void method265(int arg0) {
		method275(0, arg0);
	}

	@ObfuscatedName("ub.e(II)V")
	public final void method275(int arg0, int arg1) {
		if (arg0 >= 0 && arg0 <= field705.length && arg1 >= 0 && arg1 <= field705[arg0].length && field705[arg0][arg1] != 0) {
			synchronized (field722) {
				for (class39 var4 = (class39) field722.method251(); var4 != null; var4 = (class39) field722.method252()) {
					if (var4.field629 == arg0 && var4.field630 == arg1) {
						return;
					}
				}

				class39 var5 = new class39();
				var5.field629 = arg0;
				var5.field630 = arg1;
				var5.field633 = true;

				synchronized (field723) {
					field723.method241(var5);
				}

				field722.method249(var5);
			}
		}
	}

	@ObfuscatedName("ub.b()I")
	public final int method276() {
		synchronized (field722) {
			return field722.method253();
		}
	}

	@ObfuscatedName("ub.c()Lmb;")
	public final class39 method277() {
		class39 var2;
		synchronized (field726) {
			var2 = (class39) field726.method243();
		}

		if (var2 == null) {
			return null;
		}

		synchronized (field722) {
			var2.method107();
		}

		if (var2.field631 == null) {
			return var2;
		}

		int var4 = 0;
		try {
			GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field631));
			while (true) {
				if (field739.length == var4) {
					throw new RuntimeException("buffer overflow!");
				}

				int var6 = var5.read(field739, var4, field739.length - var4);
				if (var6 == -1) {
					break;
				}

				var4 += var6;
			}
		} catch (IOException var10) {
			throw new RuntimeException("error unzipping");
		}

		var2.field631 = new byte[var4];
		for (int var7 = 0; var7 < var4; var7++) {
			var2.field631[var7] = field739[var7];
		}

		return var2;
	}

	@ObfuscatedName("ub.a(IBII)V")
	public final void method278(int arg0, byte arg1, int arg2) {
		if (field717.field1398[0] != null && field705[arg2][arg0] != 0) {
			byte[] var4 = field717.field1398[arg2 + 1].method287(arg0);
			if (!method285(var4, field705[arg2][arg0], field706[arg2][arg0])) {
				field707[arg2][arg0] = arg1;

				if (arg1 > field708) {
					field708 = arg1;
				}

				field730++;
			}
		}
	}

	@ObfuscatedName("ub.a(B)V")
	public final void method279() {
		synchronized (field727) {
			field727.method248();
		}
	}

	@ObfuscatedName("ub.a(ZII)V")
	public final void method280(int arg0, int arg1) {
		if (field717.field1398[0] != null && (field705[arg0][arg1] != 0 && (field707[arg0][arg1] != 0 && field708 != 0))) {
			class39 var3 = new class39();
			var3.field629 = arg0;
			var3.field630 = arg1;
			var3.field633 = false;

			synchronized (field727) {
				field727.method241(var3);
			}
		}
	}

	public final void run() {
		try {
			while (field716) {
				field743++;
				byte var1 = 20;
				if (field708 == 0 && field717.field1398[0] != null) {
					var1 = 50;
				}

				try {
					Thread.sleep(var1);
				} catch (Exception var9) {
				}

				field719 = true;
				for (int var2 = 0; var2 < 100 && field719; var2++) {
					field719 = false;
					method281();
					method282();

					if (field720 == 0 && var2 >= 5) {
						break;
					}

					method283();

					if (field732 != null) {
						method284();
					}
				}

				boolean var3 = false;
				for (class39 var4 = (class39) field725.method244(); var4 != null; var4 = (class39) field725.method246()) {
					if (var4.field633) {
						var3 = true;
						var4.field632++;
						if (var4.field632 > 50) {
							var4.field632 = 0;
							method286(var4);
						}
					}
				}

				if (!var3) {
					for (class39 var5 = (class39) field725.method244(); var5 != null; var5 = (class39) field725.method246()) {
						var3 = true;
						var5.field632++;
						if (var5.field632 > 50) {
							var5.field632 = 0;
							method286(var5);
						}
					}
				}

				if (var3) {
					field740++;
					if (field740 > 750) {
						try {
							field731.close();
						} catch (Exception var8) {
						}

						field731 = null;
						field732 = null;
						field733 = null;
						field737 = 0;
					}
				} else {
					field740 = 0;
					field728 = "";
				}

				if (field717.field1390 && field731 != null && field733 != null && (field708 > 0 || field717.field1398[0] == null)) {
					field741++;
					if (field741 > 500) {
						field741 = 0;
						field738[0] = 0;
						field738[1] = 0;
						field738[2] = 0;
						field738[3] = 10;
						try {
							field733.write(field738, 0, 4);
						} catch (IOException var7) {
							field740 = 5000;
						}
					}
				}
			}
		} catch (Exception var10) {
			signlink.reporterror("od_ex " + var10.getMessage());
		}
	}

	@ObfuscatedName("ub.a(Z)V")
	public final void method281() {
		class39 var2;
		synchronized (field723) {
			var2 = (class39) field723.method243();
		}

		while (var2 != null) {
			field719 = true;
			byte[] var3 = null;
			if (field717.field1398[0] != null) {
				var3 = field717.field1398[var2.field629 + 1].method287(var2.field630);
			}

			if (!method285(var3, field705[var2.field629][var2.field630], field706[var2.field629][var2.field630])) {
				var3 = null;
			}

			synchronized (field723) {
				if (var3 == null) {
					field724.method241(var2);
				} else {
					var2.field631 = var3;

					synchronized (field726) {
						field726.method241(var2);
					}
				}

				var2 = (class39) field723.method243();
			}
		}
	}

	@ObfuscatedName("ub.b(Z)V")
	public final void method282() {
		field720 = 0;
		field721 = 0;
		for (class39 var1 = (class39) field725.method244(); var1 != null; var1 = (class39) field725.method246()) {
			if (var1.field633) {
				field720++;
			} else {
				field721++;
			}
		}

		while (field720 < 10) {
			class39 var2 = (class39) field724.method243();
			if (var2 == null) {
				break;
			}

			if (field707[var2.field629][var2.field630] != 0) {
				field729++;
			}

			field707[var2.field629][var2.field630] = 0;
			field725.method241(var2);
			field720++;
			method286(var2);
			field719 = true;
		}
	}

	@ObfuscatedName("ub.c(I)V")
	public final void method283() {
		while (field720 == 0) {
			if (field721 >= 10 || field708 == 0) {
				return;
			}

			class39 var2;
			synchronized (field727) {
				var2 = (class39) field727.method243();
			}

			while (var2 != null) {
				if (field707[var2.field629][var2.field630] != 0) {
					field707[var2.field629][var2.field630] = 0;
					field725.method241(var2);
					method286(var2);
					field719 = true;

					if (field729 < field730) {
						field729++;
					}

					field728 = "Loading extra files - " + field729 * 100 / field730 + "%";
					field721++;
					if (field721 == 10) {
						return;
					}
				}

				synchronized (field727) {
					var2 = (class39) field727.method243();
				}
			}

			for (int var4 = 0; var4 < 4; var4++) {
				byte[] var5 = field707[var4];
				int var6 = var5.length;
				for (int var7 = 0; var7 < var6; var7++) {
					if (var5[var7] == field708) {
						var5[var7] = 0;
						class39 var8 = new class39();
						var8.field629 = var4;
						var8.field630 = var7;
						var8.field633 = false;
						field725.method241(var8);
						method286(var8);
						field719 = true;

						if (field729 < field730) {
							field729++;
						}

						field728 = "Loading extra files - " + field729 * 100 / field730 + "%";
						field721++;
						if (field721 == 10) {
							return;
						}
					}
				}
			}

			field708--;
		}
	}

	@ObfuscatedName("ub.b(B)V")
	public final void method284() {
		try {
			int var1 = field732.available();
			if (field737 == 0 && var1 >= 6) {
				field719 = true;

				for (int var2 = 0; var2 < 6; var2 += field732.read(field738, var2, 6 - var2)) {
				}

				int var3 = field738[0] & 0xFF;
				int var4 = ((field738[1] & 0xFF) << 8) + (field738[2] & 0xFF);
				int var5 = ((field738[3] & 0xFF) << 8) + (field738[4] & 0xFF);
				int var6 = field738[5] & 0xFF;
				field735 = null;
				for (class39 var7 = (class39) field725.method244(); var7 != null; var7 = (class39) field725.method246()) {
					if (var7.field629 == var3 && var7.field630 == var4) {
						field735 = var7;
					}

					if (field735 != null) {
						var7.field632 = 0;
					}
				}

				if (field735 != null) {
					field740 = 0;

					if (var5 == 0) {
						signlink.reporterror("Rej: " + var3 + "," + var4);
						field735.field631 = null;

						if (field735.field633) {
							synchronized (field726) {
								field726.method241(field735);
							}
						} else {
							field735.method106();
						}

						field735 = null;
					} else {
						if (field735.field631 == null && var6 == 0) {
							field735.field631 = new byte[var5];
						}

						if (field735.field631 == null && var6 != 0) {
							throw new IOException("missing start of file");
						}
					}
				}

				field736 = var6 * 500;
				field737 = 500;
				if (field737 > var5 - var6 * 500) {
					field737 = var5 - var6 * 500;
				}
			}

			if (field737 > 0 && var1 >= field737) {
				field719 = true;
				byte[] var9 = field738;
				int var10 = 0;
				if (field735 != null) {
					var9 = field735.field631;
					var10 = field736;
				}

				for (int var11 = 0; var11 < field737; var11 += field732.read(var9, var10 + var11, field737 - var11)) {
				}

				if (field737 + field736 >= var9.length && field735 != null) {
					if (field717.field1398[0] != null) {
						field717.field1398[field735.field629 + 1].method288(var9, field735.field630, var9.length);
					}

					if (!field735.field633 && field735.field629 == 3) {
						field735.field633 = true;
						field735.field629 = 93;
					}

					if (field735.field633) {
						synchronized (field726) {
							field726.method241(field735);
						}
					} else {
						field735.method106();
					}
				}

				field737 = 0;
			}
		} catch (IOException var17) {
			try {
				field731.close();
			} catch (Exception var14) {
			}

			field731 = null;
			field732 = null;
			field733 = null;
			field737 = 0;
		}
	}

	@ObfuscatedName("ub.a(I[BII)Z")
	public final boolean method285(byte[] arg0, int arg1, int arg2) {
		if (arg0 != null && arg0.length >= 2) {
			int var4 = arg0.length - 2;
			int var5 = ((arg0[var4] & 0xFF) << 8) + (arg0[var4 + 1] & 0xFF);
			field718.reset();
			field718.update(arg0, 0, var4);
			int var6 = (int) field718.getValue();

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

	@ObfuscatedName("ub.a(Lmb;I)V")
	public final void method286(class39 arg0) {
		try {
			if (field731 == null) {
				long var2 = System.currentTimeMillis();
				if (var2 - field742 < 4000L) {
					return;
				}

				field742 = var2;
				field731 = field717.method512(client.field1142 + 43594);
				field732 = field731.getInputStream();
				field733 = field731.getOutputStream();
				field733.write(15);

				for (int var4 = 0; var4 < 8; var4++) {
					field732.read();
				}

				field740 = 0;
			}

			field738[0] = (byte) arg0.field629;
			field738[1] = (byte) (arg0.field630 >> 8);
			field738[2] = (byte) arg0.field630;
			if (arg0.field633) {
				field738[3] = 2;
			} else if (field717.field1390) {
				field738[3] = 0;
			} else {
				field738[3] = 1;
			}

			field733.write(field738, 0, 4);
			field741 = 0;
			field734 = -10000;
		} catch (IOException var7) {
			try {
				field731.close();
			} catch (Exception var6) {
			}

			field731 = null;
			field732 = null;
			field733 = null;
			field737 = 0;
			field734++;
		}
	}
}
