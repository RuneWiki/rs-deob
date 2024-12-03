package jagex2.config;

import deob.ObfuscatedName;
import jagex2.io.Jagfile;
import jagex2.io.Packet;

public class VarbitType {

	@ObfuscatedName("SXYSOXTR.h")
	public boolean field1438 = false;

	@ObfuscatedName("SXYSOXTR.i")
	public int field1439 = -1;

	@ObfuscatedName("SXYSOXTR.a")
	public static int _flowObfuscator1;

	@ObfuscatedName("SXYSOXTR.b")
	public static int count;

	@ObfuscatedName("SXYSOXTR.e")
	public int basevar;

	@ObfuscatedName("SXYSOXTR.f")
	public int startbit;

	@ObfuscatedName("SXYSOXTR.g")
	public int endbit;

	@ObfuscatedName("SXYSOXTR.j")
	public int field1440;

	@ObfuscatedName("SXYSOXTR.d")
	public String field1434;

	@ObfuscatedName("SXYSOXTR.c")
	public static VarbitType[] instances;

	@ObfuscatedName("SXYSOXTR.a(ILXTGLDHGX;)V")
	public static void unpack(int arg0, Jagfile arg1) {
		if (arg0 != 0) {
			_flowObfuscator1 = 91;
		}
		Packet var2 = new Packet(arg1.read("varbit.dat", null), 891);
		count = var2.g2();
		if (instances == null) {
			instances = new VarbitType[count];
		}
		for (int var3 = 0; var3 < count; var3++) {
			if (instances[var3] == null) {
				instances[var3] = new VarbitType();
			}
			instances[var3].decodeClient(var2, false, var3);
			if (instances[var3].field1438) {
				VarpType.instances[instances[var3].basevar].field1500 = true;
			}
		}
		if (var2.data.length != var2.pos) {
			System.out.println("varbit load mismatch");
		}
	}

	@ObfuscatedName("SXYSOXTR.a(LMBMGIXGO;ZI)V")
	public void decodeClient(Packet arg0, boolean arg1, int arg2) {
		if (arg1) {
			return;
		}
		while (true) {
			int var4 = arg0.g1();
			if (var4 == 0) {
				return;
			}
			if (var4 == 1) {
				this.basevar = arg0.g2();
				this.startbit = arg0.g1();
				this.endbit = arg0.g1();
			} else if (var4 == 10) {
				this.field1434 = arg0.gjstr();
			} else if (var4 == 2) {
				this.field1438 = true;
			} else if (var4 == 3) {
				this.field1439 = arg0.g4();
			} else if (var4 == 4) {
				this.field1440 = arg0.g4();
			} else {
				System.out.println("Error unrecognised config code: " + var4);
			}
		}
	}
}
