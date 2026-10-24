package jagex2.config;

import deob.ObfuscatedName;
import jagex2.dash3d.Model;
import jagex2.io.Jagfile;
import jagex2.io.Packet;

@ObfuscatedName("ZGOJZVHR")
public class IdkType {

	@ObfuscatedName("ZGOJZVHR.f")
	public int field1454 = -1;

	@ObfuscatedName("ZGOJZVHR.h")
	public int[] field1456 = new int[6];

	@ObfuscatedName("ZGOJZVHR.i")
	public int[] field1457 = new int[6];

	@ObfuscatedName("ZGOJZVHR.j")
	public int[] field1458 = new int[] { -1, -1, -1, -1, -1 };

	@ObfuscatedName("ZGOJZVHR.k")
	public boolean field1459 = false;

	@ObfuscatedName("ZGOJZVHR.d")
	public static int field1452;

	@ObfuscatedName("ZGOJZVHR.g")
	public int[] field1455;

	@ObfuscatedName("ZGOJZVHR.e")
	public static IdkType[] field1453;

	@ObfuscatedName("ZGOJZVHR.a(LATJMVOZR;I)V")
	public static void method575(Jagfile arg0) {
		Packet var1 = new Packet(arg0.method2("idk.dat", null));
		field1452 = var1.g2();
		if (field1453 == null) {
			field1453 = new IdkType[field1452];
		}

		for (int var2 = 0; var2 < field1452; var2++) {
			if (field1453[var2] == null) {
				field1453[var2] = new IdkType();
			}

			field1453[var2].method576(var1);
		}
	}

	@ObfuscatedName("ZGOJZVHR.a(BLMFMVIYHT;)V")
	public void method576(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field1454 = arg0.g1();
			} else if (var2 == 2) {
				int var3 = arg0.g1();
				field1455 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field1455[var4] = arg0.g2();
				}
			} else if (var2 == 3) {
				field1459 = true;
			} else if (var2 >= 40 && var2 < 50) {
				field1456[var2 - 40] = arg0.g2();
			} else if (var2 >= 50 && var2 < 60) {
				field1457[var2 - 50] = arg0.g2();
			} else if (var2 >= 60 && var2 < 70) {
				field1458[var2 - 60] = arg0.g2();
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("ZGOJZVHR.a(I)Z")
	public boolean method577() {
		if (field1455 == null) {
			return true;
		}

		boolean var1 = true;
		for (int var2 = 0; var2 < field1455.length; var2++) {
			if (!Model.method360(field1455[var2])) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("ZGOJZVHR.a(B)LLZYQDKJV;")
	public Model method578() {
		if (field1455 == null) {
			return null;
		}

		Model[] var1 = new Model[field1455.length];
		for (int var2 = 0; var2 < field1455.length; var2++) {
			var1[var2] = Model.method359(field1455[var2]);
		}

		Model var3;
		if (var1.length == 1) {
			var3 = var1[0];
		} else {
			var3 = new Model(var1.length, var1);
		}

		for (int var4 = 0; var4 < 6 && field1456[var4] != 0; var4++) {
			var3.method373(field1456[var4], field1457[var4]);
		}

		return var3;
	}

	@ObfuscatedName("ZGOJZVHR.b(I)Z")
	public boolean method579() {
		boolean var1 = true;
		for (int var2 = 0; var2 < 5; var2++) {
			if (field1458[var2] != -1 && !Model.method360(field1458[var2])) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("ZGOJZVHR.a(Z)LLZYQDKJV;")
	public Model method580() {
		Model[] var1 = new Model[5];
		int var2 = 0;
		for (int var3 = 0; var3 < 5; var3++) {
			if (field1458[var3] != -1) {
				var1[var2++] = Model.method359(field1458[var3]);
			}
		}

		Model var4 = new Model(var2, var1);
		for (int var5 = 0; var5 < 6 && field1456[var5] != 0; var5++) {
			var4.method373(field1456[var5], field1457[var5]);
		}

		return var4;
	}
}
