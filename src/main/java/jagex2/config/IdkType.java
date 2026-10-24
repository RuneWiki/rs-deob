package jagex2.config;

import deob.ObfuscatedName;
import jagex2.graphics.Model;
import jagex2.io.Jagfile;
import jagex2.io.Packet;

@ObfuscatedName("TAVAECED")
public class IdkType {

	@ObfuscatedName("TAVAECED.d")
	public int type = -1;

	@ObfuscatedName("TAVAECED.f")
	public int[] recol_s = new int[6];

	@ObfuscatedName("TAVAECED.g")
	public int[] recol_d = new int[6];

	@ObfuscatedName("TAVAECED.h")
	public int[] heads = new int[] { -1, -1, -1, -1, -1 };

	@ObfuscatedName("TAVAECED.i")
	public boolean disable = false;

	@ObfuscatedName("TAVAECED.b")
	public static int count;

	@ObfuscatedName("TAVAECED.e")
	public int[] models;

	@ObfuscatedName("TAVAECED.c")
	public static IdkType[] instances;

	@ObfuscatedName("TAVAECED.a(ILXTGLDHGX;)V")
	public static void unpack(Jagfile arg0) {
		Packet var1 = new Packet(arg0.read("idk.dat", null));
		count = var1.g2();
		if (instances == null) {
			instances = new IdkType[count];
		}

		for (int var2 = 0; var2 < count; var2++) {
			if (instances[var2] == null) {
				instances[var2] = new IdkType();
			}

			instances[var2].decodeClient(var1);
		}
	}

	@ObfuscatedName("TAVAECED.a(ZLMBMGIXGO;)V")
	public void decodeClient(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				type = arg0.g1();
			} else if (var2 == 2) {
				int var3 = arg0.g1();
				models = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					models[var4] = arg0.g2();
				}
			} else if (var2 == 3) {
				disable = true;
			} else if (var2 >= 40 && var2 < 50) {
				recol_s[var2 - 40] = arg0.g2();
			} else if (var2 >= 50 && var2 < 60) {
				recol_d[var2 - 50] = arg0.g2();
			} else if (var2 >= 60 && var2 < 70) {
				heads[var2 - 60] = arg0.g2();
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("TAVAECED.a(B)Z")
	public boolean validateModel() {
		if (models == null) {
			return true;
		}

		boolean var1 = true;
		for (int var2 = 0; var2 < models.length; var2++) {
			if (!Model.validate(models[var2])) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("TAVAECED.a(Z)LZKARKDQW;")
	public Model getModel() {
		if (models == null) {
			return null;
		}

		Model[] var1 = new Model[models.length];
		for (int var2 = 0; var2 < models.length; var2++) {
			var1[var2] = Model.tryGet(models[var2]);
		}

		Model var3;
		if (var1.length == 1) {
			var3 = var1[0];
		} else {
			var3 = new Model(var1.length, var1);
		}

		for (int var4 = 0; var4 < 6 && recol_s[var4] != 0; var4++) {
			var3.recolour(recol_s[var4], recol_d[var4]);
		}

		return var3;
	}

	@ObfuscatedName("TAVAECED.b(Z)Z")
	public boolean validateHeadModel() {
		boolean var1 = true;
		for (int var2 = 0; var2 < 5; var2++) {
			if (heads[var2] != -1 && !Model.validate(heads[var2])) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("TAVAECED.a(I)LZKARKDQW;")
	public Model getHeadModel() {
		Model[] var1 = new Model[5];
		int var2 = 0;
		for (int var3 = 0; var3 < 5; var3++) {
			if (heads[var3] != -1) {
				var1[var2++] = Model.tryGet(heads[var3]);
			}
		}

		Model var4 = new Model(var2, var1);
		for (int var5 = 0; var5 < 6 && recol_s[var5] != 0; var5++) {
			var4.recolour(recol_s[var5], recol_d[var5]);
		}

		return var4;
	}
}
