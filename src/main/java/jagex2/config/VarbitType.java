package jagex2.config;

import deob.ObfuscatedName;
import jagex2.io.JagFile;
import jagex2.io.Packet;

@ObfuscatedName("qc")
public class VarbitType {

	@ObfuscatedName("qc.c")
	public static int numDefinitions;

	@ObfuscatedName("qc.d")
	public static VarbitType[] list;

	@ObfuscatedName("qc.e")
	public String debugname;

	@ObfuscatedName("qc.f")
	public int basevar;

	@ObfuscatedName("qc.g")
	public int startbit;

	@ObfuscatedName("qc.h")
	public int endbit;

	@ObfuscatedName("qc.a(ZLxb;)V")
	public static void init(JagFile arg0) {
		Packet var1 = new Packet(arg0.read("varbit.dat", null));
		numDefinitions = var1.g2();
		if (list == null) {
			list = new VarbitType[numDefinitions];
		}

		for (int var2 = 0; var2 < numDefinitions; var2++) {
			if (list[var2] == null) {
				list[var2] = new VarbitType();
			}

			list[var2].decode(var1, var2);
		}

		if (var1.data.length != var1.pos) {
			System.out.println("varbit load mismatch");
		}
	}

	@ObfuscatedName("qc.a(Llb;BI)V")
	public void decode(Packet arg0, int arg1) {
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
				debugname = arg0.gstr();
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
