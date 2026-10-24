package jagex2.config;

import deob.ObfuscatedName;
import jagex2.dash3d.Model;
import jagex2.datastruct.LruCache;
import jagex2.io.Jagfile;
import jagex2.io.Packet;

@ObfuscatedName("MNZYLKNY")
public class SpotAnimType {

	@ObfuscatedName("MNZYLKNY.h")
	public int field1121 = -1;

	@ObfuscatedName("MNZYLKNY.j")
	public int[] field1123 = new int[6];

	@ObfuscatedName("MNZYLKNY.k")
	public int[] field1124 = new int[6];

	@ObfuscatedName("MNZYLKNY.l")
	public int field1125 = 128;

	@ObfuscatedName("MNZYLKNY.m")
	public int field1126 = 128;

	@ObfuscatedName("MNZYLKNY.q")
	public static LruCache field1130 = new LruCache(30);

	@ObfuscatedName("MNZYLKNY.d")
	public static int field1117;

	@ObfuscatedName("MNZYLKNY.f")
	public int field1119;

	@ObfuscatedName("MNZYLKNY.g")
	public int field1120;

	@ObfuscatedName("MNZYLKNY.n")
	public int field1127;

	@ObfuscatedName("MNZYLKNY.o")
	public int field1128;

	@ObfuscatedName("MNZYLKNY.p")
	public int field1129;

	@ObfuscatedName("MNZYLKNY.i")
	public SeqType field1122;

	@ObfuscatedName("MNZYLKNY.e")
	public static SpotAnimType[] field1118;

	@ObfuscatedName("MNZYLKNY.a(LATJMVOZR;I)V")
	public static void method437(Jagfile arg0) {
		Packet var1 = new Packet(arg0.method2("spotanim.dat", null));
		field1117 = var1.g2();
		if (field1118 == null) {
			field1118 = new SpotAnimType[field1117];
		}

		for (int var2 = 0; var2 < field1117; var2++) {
			if (field1118[var2] == null) {
				field1118[var2] = new SpotAnimType();
			}

			field1118[var2].field1119 = var2;
			field1118[var2].method438(var1);
		}
	}

	@ObfuscatedName("MNZYLKNY.a(BLMFMVIYHT;)V")
	public void method438(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field1120 = arg0.g2();
			} else if (var2 == 2) {
				field1121 = arg0.g2();
				if (SeqType.field680 != null) {
					field1122 = SeqType.field680[field1121];
				}
			} else if (var2 == 4) {
				field1125 = arg0.g2();
			} else if (var2 == 5) {
				field1126 = arg0.g2();
			} else if (var2 == 6) {
				field1127 = arg0.g2();
			} else if (var2 == 7) {
				field1128 = arg0.g1();
			} else if (var2 == 8) {
				field1129 = arg0.g1();
			} else if (var2 >= 40 && var2 < 50) {
				field1123[var2 - 40] = arg0.g2();
			} else if (var2 >= 50 && var2 < 60) {
				field1124[var2 - 50] = arg0.g2();
			} else {
				System.out.println("Error unrecognised spotanim config code: " + var2);
			}
		}
	}

	@ObfuscatedName("MNZYLKNY.a()LLZYQDKJV;")
	public Model method439() {
		Model var1 = (Model) field1130.method458(field1119);
		if (var1 != null) {
			return var1;
		}

		Model var2 = Model.method359(field1120);
		if (var2 == null) {
			return null;
		}

		for (int var3 = 0; var3 < 6; var3++) {
			if (field1123[0] != 0) {
				var2.method373(field1123[var3], field1124[var3]);
			}
		}

		field1130.method459(var2, field1119);
		return var2;
	}
}
