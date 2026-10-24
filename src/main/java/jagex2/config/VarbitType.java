package jagex2.config;

import deob.ObfuscatedName;
import jagex2.io.JagFile;
import jagex2.io.Packet;

@ObfuscatedName("qc")
public class VarbitType {

	@ObfuscatedName("qc.b")
	public static int numDefinitions;

	@ObfuscatedName("qc.c")
	public static VarbitType[] list;

	@ObfuscatedName("qc.d")
	public String debugname;

	@ObfuscatedName("qc.e")
	public int basevar;

	@ObfuscatedName("qc.f")
	public int startbit;

	@ObfuscatedName("qc.g")
	public int endbit;

	@ObfuscatedName("qc.h")
	public boolean field1028 = false;

	@ObfuscatedName("qc.i")
	public int field1029 = -1;

	@ObfuscatedName("qc.j")
	public int field1030;

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

			list[var2].decode(var2, var1);

			if (list[var2].field1028) {
				VarpType.list[list[var2].basevar].field1044 = true;
			}
		}

		if (var1.data.length != var1.pos) {
			System.out.println("varbit load mismatch");
		}
	}

	@ObfuscatedName("qc.a(IILlb;)V")
	public void decode(int arg0, Packet arg1) {
		while (true) {
			int var3 = arg1.g1();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				basevar = arg1.g2();
				startbit = arg1.g1();
				endbit = arg1.g1();
			} else if (var3 == 10) {
				debugname = arg1.gstr();
			} else if (var3 == 2) {
				field1028 = true;
			} else if (var3 == 3) {
				field1029 = arg1.g4();
			} else if (var3 == 4) {
				field1030 = arg1.g4();
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
