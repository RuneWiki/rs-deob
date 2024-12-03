package jagex2.config;

import deob.ObfuscatedName;
import jagex2.datastruct.Linkable;
import jagex2.graphics.Model;
import jagex2.io.Jagfile;
import jagex2.io.Packet;

public class IdkType {

	@ObfuscatedName("TAVAECED.a")
	public int _flowObfuscator1 = 9;

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
	public static void unpack(int arg0, Jagfile arg1) {
		Packet var2 = new Packet(arg1.read("idk.dat", null), 891);
		count = var2.g2();
		if (instances == null) {
			instances = new IdkType[count];
		}
		for (int var3 = 0; var3 < count; var3++) {
			if (instances[var3] == null) {
				instances[var3] = new IdkType();
			}
			instances[var3].decodeClient(true, var2);
		}
		if (arg0 == 0) {
			;
		}
	}

	@ObfuscatedName("TAVAECED.a(ZLMBMGIXGO;)V")
	public void decodeClient(boolean arg0, Packet arg1) {
		if (!arg0) {
			throw new NullPointerException();
		}
		while (true) {
			while (true) {
				int var3 = arg1.g1();
				if (var3 == 0) {
					return;
				}
				if (var3 == 1) {
					this.type = arg1.g1();
				} else if (var3 == 2) {
					int var4 = arg1.g1();
					this.models = new int[var4];
					for (int var5 = 0; var5 < var4; var5++) {
						this.models[var5] = arg1.g2();
					}
				} else if (var3 == 3) {
					this.disable = true;
				} else if (var3 >= 40 && var3 < 50) {
					this.recol_s[var3 - 40] = arg1.g2();
				} else if (var3 >= 50 && var3 < 60) {
					this.recol_d[var3 - 50] = arg1.g2();
				} else if (var3 >= 60 && var3 < 70) {
					this.heads[var3 - 60] = arg1.g2();
				} else {
					System.out.println("Error unrecognised config code: " + var3);
				}
			}
		}
	}

	@ObfuscatedName("TAVAECED.a(B)Z")
	public boolean validateModel(byte arg0) {
		if (this.models == null) {
			return true;
		}
		boolean var2 = true;
		if (arg0 == 2) {
			boolean var3 = false;
		} else {
			for (int var4 = 1; var4 > 0; var4++) {
			}
		}
		for (int var5 = 0; var5 < this.models.length; var5++) {
			if (!Model.validate(this.models[var5])) {
				var2 = false;
			}
		}
		return var2;
	}

	@ObfuscatedName("TAVAECED.a(Z)LZKARKDQW;")
	public Model getModel(boolean arg0) {
		if (arg0) {
			throw new NullPointerException();
		} else if (this.models == null) {
			return null;
		} else {
			Model[] var2 = new Model[this.models.length];
			for (int var3 = 0; var3 < this.models.length; var3++) {
				var2[var3] = Model.tryGet(this._flowObfuscator1, this.models[var3]);
			}
			Model var4;
			if (var2.length == 1) {
				var4 = var2[0];
			} else {
				var4 = new Model(var2.length, var2, -38);
			}
			for (int var5 = 0; var5 < 6 && this.recol_s[var5] != 0; var5++) {
				var4.recolour(this.recol_s[var5], this.recol_d[var5]);
			}
			return var4;
		}
	}

	@ObfuscatedName("TAVAECED.b(Z)Z")
	public boolean validateHeadModel(boolean arg0) {
		if (arg0) {
			throw new NullPointerException();
		}
		boolean var2 = true;
		for (int var3 = 0; var3 < 5; var3++) {
			if (this.heads[var3] != -1 && !Model.validate(this.heads[var3])) {
				var2 = false;
			}
		}
		return var2;
	}

	@ObfuscatedName("TAVAECED.a(I)LZKARKDQW;")
	public Model getHeadModel(int arg0) {
		if (arg0 != 0) {
			throw new NullPointerException();
		}
		Model[] var2 = new Model[5];
		int var3 = 0;
		for (int var4 = 0; var4 < 5; var4++) {
			if (this.heads[var4] != -1) {
				var2[var3++] = Model.tryGet(this._flowObfuscator1, this.heads[var4]);
			}
		}
		Model var5 = new Model(var3, var2, -38);
		for (int var6 = 0; var6 < 6 && this.recol_s[var6] != 0; var6++) {
			var5.recolour(this.recol_s[var6], this.recol_d[var6]);
		}
		return var5;
	}

	public IdkType() {
		if (Linkable._flowObfuscator2) {
		}
	}
}
