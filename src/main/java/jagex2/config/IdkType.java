package jagex2.config;

import deob.ObfuscatedName;
import jagex2.graphics.Model;
import jagex2.io.Jagfile;
import jagex2.io.Packet;

@ObfuscatedName("lc")
public class IdkType {

	@ObfuscatedName("lc.c")
	public static int field955;

	@ObfuscatedName("lc.d")
	public static IdkType[] field956;

	@ObfuscatedName("lc.e")
	public int field957 = -1;

	@ObfuscatedName("lc.f")
	public int[] field958;

	@ObfuscatedName("lc.g")
	public int[] field959 = new int[6];

	@ObfuscatedName("lc.h")
	public int[] field960 = new int[6];

	@ObfuscatedName("lc.i")
	public int[] field961 = new int[] { -1, -1, -1, -1, -1 };

	@ObfuscatedName("lc.j")
	public boolean field962 = false;

	@ObfuscatedName("lc.a(Lyb;B)V")
	public static void method375(Jagfile arg0) {
		Packet var1 = new Packet(arg0.method308("idk.dat", null));
		field955 = var1.method240();
		if (field956 == null) {
			field956 = new IdkType[field955];
		}

		for (int var2 = 0; var2 < field955; var2++) {
			if (field956[var2] == null) {
				field956[var2] = new IdkType();
			}

			field956[var2].method376(var1);
		}
	}

	@ObfuscatedName("lc.a(ILmb;)V")
	public void method376(Packet arg0) {
		while (true) {
			int var2 = arg0.method238();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field957 = arg0.method238();
			} else if (var2 == 2) {
				int var3 = arg0.method238();
				field958 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field958[var4] = arg0.method240();
				}
			} else if (var2 == 3) {
				field962 = true;
			} else if (var2 >= 40 && var2 < 50) {
				field959[var2 - 40] = arg0.method240();
			} else if (var2 >= 50 && var2 < 60) {
				field960[var2 - 50] = arg0.method240();
			} else if (var2 >= 60 && var2 < 70) {
				field961[var2 - 60] = arg0.method240();
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("lc.a(I)Z")
	public boolean method377() {
		if (field958 == null) {
			return true;
		}

		boolean var1 = true;
		for (int var2 = 0; var2 < field958.length; var2++) {
			if (!Model.method139(field958[var2])) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("lc.b(I)Lfb;")
	public Model method378() {
		if (field958 == null) {
			return null;
		}

		Model[] var1 = new Model[field958.length];
		for (int var2 = 0; var2 < field958.length; var2++) {
			var1[var2] = Model.method138(field958[var2]);
		}

		Model var3;
		if (var1.length == 1) {
			var3 = var1[0];
		} else {
			var3 = new Model(var1.length, var1);
		}

		for (int var4 = 0; var4 < 6 && field959[var4] != 0; var4++) {
			var3.method152(field959[var4], field960[var4]);
		}

		return var3;
	}

	@ObfuscatedName("lc.c(I)Z")
	public boolean method379() {
		boolean var1 = true;
		for (int var2 = 0; var2 < 5; var2++) {
			if (field961[var2] != -1 && !Model.method139(field961[var2])) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("lc.d(I)Lfb;")
	public Model method380() {
		Model[] var1 = new Model[5];
		int var2 = 0;
		for (int var3 = 0; var3 < 5; var3++) {
			if (field961[var3] != -1) {
				var1[var2++] = Model.method138(field961[var3]);
			}
		}

		Model var4 = new Model(var2, var1);
		for (int var5 = 0; var5 < 6 && field959[var5] != 0; var5++) {
			var4.method152(field959[var5], field960[var5]);
		}

		return var4;
	}
}
