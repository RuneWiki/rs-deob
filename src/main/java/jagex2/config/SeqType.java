package jagex2.config;

import deob.ObfuscatedName;
import jagex2.graphics.AnimFrame;
import jagex2.io.Jagfile;
import jagex2.io.Packet;

@ObfuscatedName("nc")
public class SeqType {

	@ObfuscatedName("nc.c")
	public static int field972;

	@ObfuscatedName("nc.d")
	public static SeqType[] field973;

	@ObfuscatedName("nc.e")
	public int field974;

	@ObfuscatedName("nc.f")
	public int[] field975;

	@ObfuscatedName("nc.g")
	public int[] field976;

	@ObfuscatedName("nc.h")
	public int[] field977;

	@ObfuscatedName("nc.i")
	public int field978 = -1;

	@ObfuscatedName("nc.j")
	public int[] field979;

	@ObfuscatedName("nc.k")
	public boolean field980 = false;

	@ObfuscatedName("nc.l")
	public int field981 = 5;

	@ObfuscatedName("nc.m")
	public int field982 = -1;

	@ObfuscatedName("nc.n")
	public int field983 = -1;

	@ObfuscatedName("nc.o")
	public int field984 = 99;

	@ObfuscatedName("nc.p")
	public int field985 = -1;

	@ObfuscatedName("nc.q")
	public int field986 = -1;

	@ObfuscatedName("nc.r")
	public int field987;

	@ObfuscatedName("nc.a(Lyb;B)V")
	public static void method381(Jagfile arg0) {
		Packet var1 = new Packet(arg0.method308("seq.dat", null));
		field972 = var1.method240();
		if (field973 == null) {
			field973 = new SeqType[field972];
		}

		for (int var2 = 0; var2 < field972; var2++) {
			if (field973[var2] == null) {
				field973[var2] = new SeqType();
			}

			field973[var2].method383(var1);
		}
	}

	@ObfuscatedName("nc.a(II)I")
	public int method382(int arg0) {
		int var2 = field977[arg0];
		if (var2 == 0) {
			AnimFrame var3 = AnimFrame.method61(field975[arg0]);
			if (var3 != null) {
				var2 = field977[arg0] = var3.field141;
			}
		}

		if (var2 == 0) {
			var2 = 1;
		}

		return var2;
	}

	@ObfuscatedName("nc.a(ILmb;)V")
	public void method383(Packet arg0) {
		while (true) {
			int var2 = arg0.method238();
			if (var2 == 0) {
				if (field974 == 0) {
					field974 = 1;
					field975 = new int[1];
					field975[0] = -1;
					field976 = new int[1];
					field976[0] = -1;
					field977 = new int[1];
					field977[0] = -1;
				}

				if (field985 == -1) {
					if (field979 == null) {
						field985 = 0;
					} else {
						field985 = 2;
					}
				}

				if (field986 == -1) {
					if (field979 != null) {
						field986 = 2;
						return;
					}

					field986 = 0;
					return;
				}

				return;
			}

			if (var2 == 1) {
				field974 = arg0.method238();
				field975 = new int[field974];
				field976 = new int[field974];
				field977 = new int[field974];
				for (int var3 = 0; var3 < field974; var3++) {
					field975[var3] = arg0.method240();
					field976[var3] = arg0.method240();
					if (field976[var3] == 0xFFFF) {
						field976[var3] = -1;
					}

					field977[var3] = arg0.method240();
				}
			} else if (var2 == 2) {
				field978 = arg0.method240();
			} else if (var2 == 3) {
				int var4 = arg0.method238();
				field979 = new int[var4 + 1];
				for (int var5 = 0; var5 < var4; var5++) {
					field979[var5] = arg0.method238();
				}

				field979[var4] = 9999999;
			} else if (var2 == 4) {
				field980 = true;
			} else if (var2 == 5) {
				field981 = arg0.method238();
			} else if (var2 == 6) {
				field982 = arg0.method240();
			} else if (var2 == 7) {
				field983 = arg0.method240();
			} else if (var2 == 8) {
				field984 = arg0.method238();
			} else if (var2 == 9) {
				field985 = arg0.method238();
			} else if (var2 == 10) {
				field986 = arg0.method238();
			} else if (var2 == 11) {
				field987 = arg0.method238();
			} else {
				System.out.println("Error unrecognised seq config code: " + var2);
			}
		}
	}
}
