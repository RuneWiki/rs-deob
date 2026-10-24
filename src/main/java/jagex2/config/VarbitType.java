package jagex2.config;

import deob.ObfuscatedName;
import jagex2.io.Jagfile;
import jagex2.io.Packet;

@ObfuscatedName("SXYSOXTR")
public class VarbitType {

	@ObfuscatedName("SXYSOXTR.h")
	public boolean field1237 = false;

	@ObfuscatedName("SXYSOXTR.i")
	public int field1238 = -1;

	@ObfuscatedName("SXYSOXTR.b")
	public static int count;

	@ObfuscatedName("SXYSOXTR.e")
	public int basevar;

	@ObfuscatedName("SXYSOXTR.f")
	public int startbit;

	@ObfuscatedName("SXYSOXTR.g")
	public int endbit;

	@ObfuscatedName("SXYSOXTR.j")
	public int field1239;

	@ObfuscatedName("SXYSOXTR.d")
	public String field1233;

	@ObfuscatedName("SXYSOXTR.c")
	public static VarbitType[] instances;

	@ObfuscatedName("SXYSOXTR.a(ILXTGLDHGX;)V")
	public static void unpack(Jagfile arg0) {
		Packet var1 = new Packet(arg0.read("varbit.dat", null));
		count = var1.g2();
		if (instances == null) {
			instances = new VarbitType[count];
		}

		for (int var2 = 0; var2 < count; var2++) {
			if (instances[var2] == null) {
				instances[var2] = new VarbitType();
			}

			instances[var2].decodeClient(var1, var2);

			if (instances[var2].field1237) {
				VarpType.instances[instances[var2].basevar].field1294 = true;
			}
		}

		if (var1.data.length != var1.pos) {
			System.out.println("varbit load mismatch");
		}
	}

	@ObfuscatedName("SXYSOXTR.a(LMBMGIXGO;ZI)V")
	public void decodeClient(Packet arg0, int arg1) {
		while (true) {
			int var3 = arg0.g1();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				basevar = arg0.g2();
				startbit = arg0.g1();
				endbit = arg0.g1();
			} else if (var3 == 10) {
				field1233 = arg0.gjstr();
			} else if (var3 == 2) {
				field1237 = true;
			} else if (var3 == 3) {
				field1238 = arg0.g4();
			} else if (var3 == 4) {
				field1239 = arg0.g4();
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
