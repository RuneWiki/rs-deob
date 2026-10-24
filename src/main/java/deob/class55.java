package deob;

@ObfuscatedName("cc")
public class class55 {

	@ObfuscatedName("cc.a")
	public static int field758;

	@ObfuscatedName("cc.b")
	public static class55[] field759;

	@ObfuscatedName("cc.c")
	public int field760;

	@ObfuscatedName("cc.d")
	public int field761 = -1;

	@ObfuscatedName("cc.e")
	public boolean field762 = false;

	@ObfuscatedName("cc.f")
	public boolean field763 = true;

	@ObfuscatedName("cc.g")
	public String field764;

	@ObfuscatedName("cc.h")
	public int field765;

	@ObfuscatedName("cc.i")
	public int field766;

	@ObfuscatedName("cc.j")
	public int field767;

	@ObfuscatedName("cc.k")
	public int field768;

	@ObfuscatedName("cc.l")
	public int field769;

	@ObfuscatedName("cc.a(ZLub;)V")
	public static void method284(class47 arg0) {
		class37 var1 = new class37(arg0.method242(null, "flo.dat"));
		field758 = var1.method203();
		if (field759 == null) {
			field759 = new class55[field758];
		}

		for (int var2 = 0; var2 < field758; var2++) {
			if (field759[var2] == null) {
				field759[var2] = new class55();
			}

			field759[var2].method285(var1);
		}
	}

	@ObfuscatedName("cc.a(ILkb;)V")
	public void method285(class37 arg0) {
		while (true) {
			int var2 = arg0.method201();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field760 = arg0.method205();
				method286(field760);
			} else if (var2 == 2) {
				field761 = arg0.method201();
			} else if (var2 == 3) {
				field762 = true;
			} else if (var2 == 5) {
				field763 = false;
			} else if (var2 == 6) {
				field764 = arg0.method208();
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("cc.a(BI)V")
	public void method286(int arg0) {
		double var2 = (arg0 >> 16 & 0xFF) / 256.0D;
		double var4 = (arg0 >> 8 & 0xFF) / 256.0D;
		double var6 = (arg0 & 0xFF) / 256.0D;
		double var8 = var2;
		if (var4 < var2) {
			var8 = var4;
		}

		if (var6 < var8) {
			var8 = var6;
		}

		double var10 = var2;
		if (var4 > var2) {
			var10 = var4;
		}

		if (var6 > var10) {
			var10 = var6;
		}

		double var12 = 0.0D;
		double var14 = 0.0D;
		double var16 = (var8 + var10) / 2.0D;
		if (var8 != var10) {
			if (var16 < 0.5D) {
				var14 = (var10 - var8) / (var8 + var10);
			}

			if (var16 >= 0.5D) {
				var14 = (var10 - var8) / (2.0D - var10 - var8);
			}

			if (var2 == var10) {
				var12 = (var4 - var6) / (var10 - var8);
			} else if (var4 == var10) {
				var12 = (var6 - var2) / (var10 - var8) + 2.0D;
			} else if (var6 == var10) {
				var12 = (var2 - var4) / (var10 - var8) + 4.0D;
			}
		}

		var12 /= 6.0D;
		field765 = (int) (var12 * 256.0D);
		field766 = (int) (var14 * 256.0D);
		field767 = (int) (var16 * 256.0D);

		if (field766 < 0) {
			field766 = 0;
		} else if (field766 > 255) {
			field766 = 255;
		}

		if (field767 < 0) {
			field767 = 0;
		} else if (field767 > 255) {
			field767 = 255;
		}

		if (var16 > 0.5D) {
			field769 = (int) ((1.0D - var16) * var14 * 512.0D);
		} else {
			field769 = (int) (var14 * var16 * 512.0D);
		}

		if (field769 < 1) {
			field769 = 1;
		}

		field768 = (int) (field769 * var12);
	}
}
