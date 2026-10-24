package jagex2.config;

import deob.ObfuscatedName;
import jagex2.io.JagFile;
import jagex2.io.Packet;

@ObfuscatedName("rc")
public class VarpType {

	@ObfuscatedName("rc.d")
	public static int numDefinitions;

	@ObfuscatedName("rc.e")
	public static VarpType[] list;

	@ObfuscatedName("rc.f")
	public static int field1033;

	@ObfuscatedName("rc.g")
	public static int[] field1034;

	@ObfuscatedName("rc.h")
	public String field1035;

	@ObfuscatedName("rc.i")
	public int field1036;

	@ObfuscatedName("rc.j")
	public int field1037;

	@ObfuscatedName("rc.k")
	public boolean field1038 = false;

	@ObfuscatedName("rc.l")
	public boolean field1039 = true;

	@ObfuscatedName("rc.m")
	public int clientCode;

	@ObfuscatedName("rc.n")
	public boolean field1041 = false;

	@ObfuscatedName("rc.o")
	public int field1042;

	@ObfuscatedName("rc.p")
	public int field1043;

	@ObfuscatedName("rc.q")
	public boolean field1044 = false;

	@ObfuscatedName("rc.r")
	public int field1045 = -1;

	@ObfuscatedName("rc.a(ZLxb;)V")
	public static void init(JagFile arg0) {
		Packet var1 = new Packet(arg0.read("varp.dat", null));
		field1033 = 0;
		numDefinitions = var1.g2();
		if (list == null) {
			list = new VarpType[numDefinitions];
		}

		if (field1034 == null) {
			field1034 = new int[numDefinitions];
		}

		for (int var2 = 0; var2 < numDefinitions; var2++) {
			if (list[var2] == null) {
				list[var2] = new VarpType();
			}

			list[var2].decode(var2, var1);
		}

		if (var1.data.length != var1.pos) {
			System.out.println("varptype load mismatch");
		}
	}

	@ObfuscatedName("rc.a(IILlb;)V")
	public void decode(int arg0, Packet arg1) {
		while (true) {
			int var3 = arg1.g1();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field1036 = arg1.g1();
			} else if (var3 == 2) {
				field1037 = arg1.g1();
			} else if (var3 == 3) {
				field1038 = true;
				field1034[field1033++] = arg0;
			} else if (var3 == 4) {
				field1039 = false;
			} else if (var3 == 5) {
				clientCode = arg1.g2();
			} else if (var3 == 6) {
				field1041 = true;
			} else if (var3 == 7) {
				field1042 = arg1.g4();
			} else if (var3 == 8) {
				field1043 = 1;
				field1044 = true;
			} else if (var3 == 10) {
				field1035 = arg1.gstr();
			} else if (var3 == 11) {
				field1044 = true;
			} else if (var3 == 12) {
				field1045 = arg1.g4();
			} else if (var3 == 13) {
				field1043 = 2;
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
