package jagex2.config;

import deob.ObfuscatedName;
import jagex2.io.JagFile;
import jagex2.io.Packet;

@ObfuscatedName("rc")
public class VarpType {

	@ObfuscatedName("rc.c")
	public static int numDefinitions;

	@ObfuscatedName("rc.d")
	public static VarpType[] list;

	@ObfuscatedName("rc.e")
	public static int field1023;

	@ObfuscatedName("rc.f")
	public static int[] field1024;

	@ObfuscatedName("rc.g")
	public String field1025;

	@ObfuscatedName("rc.h")
	public int field1026;

	@ObfuscatedName("rc.i")
	public int field1027;

	@ObfuscatedName("rc.j")
	public boolean field1028 = false;

	@ObfuscatedName("rc.k")
	public boolean field1029 = true;

	@ObfuscatedName("rc.l")
	public int clientCode;

	@ObfuscatedName("rc.m")
	public boolean field1031 = false;

	@ObfuscatedName("rc.n")
	public int field1032;

	@ObfuscatedName("rc.o")
	public int field1033;

	@ObfuscatedName("rc.p")
	public boolean field1034 = false;

	@ObfuscatedName("rc.q")
	public int field1035 = -1;

	@ObfuscatedName("rc.a(ZLxb;)V")
	public static void init(JagFile arg0) {
		Packet var1 = new Packet(arg0.read("varp.dat", null));
		field1023 = 0;
		numDefinitions = var1.g2();
		if (list == null) {
			list = new VarpType[numDefinitions];
		}

		if (field1024 == null) {
			field1024 = new int[numDefinitions];
		}

		for (int var2 = 0; var2 < numDefinitions; var2++) {
			if (list[var2] == null) {
				list[var2] = new VarpType();
			}

			list[var2].decode(var1, var2);
		}

		if (var1.data.length != var1.pos) {
			System.out.println("varptype load mismatch");
		}
	}

	@ObfuscatedName("rc.a(Llb;BI)V")
	public void decode(Packet arg0, int arg1) {
		while (true) {
			int var3 = arg0.g1();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field1026 = arg0.g1();
			} else if (var3 == 2) {
				field1027 = arg0.g1();
			} else if (var3 == 3) {
				field1028 = true;
				field1024[field1023++] = arg1;
			} else if (var3 == 4) {
				field1029 = false;
			} else if (var3 == 5) {
				clientCode = arg0.g2();
			} else if (var3 == 6) {
				field1031 = true;
			} else if (var3 == 7) {
				field1032 = arg0.g4();
			} else if (var3 == 8) {
				field1033 = 1;
				field1034 = true;
			} else if (var3 == 10) {
				field1025 = arg0.gstr();
			} else if (var3 == 11) {
				field1034 = true;
			} else if (var3 == 12) {
				field1035 = arg0.g4();
			} else if (var3 == 13) {
				field1033 = 2;
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
