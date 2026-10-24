package jagex2.config;

import deob.ObfuscatedName;
import jagex2.io.JagFile;
import jagex2.io.Packet;

@ObfuscatedName("rc")
public class VarpType {

	@ObfuscatedName("rc.b")
	public static int numDefinitions;

	@ObfuscatedName("rc.c")
	public static VarpType[] list;

	@ObfuscatedName("rc.d")
	public static int field1021;

	@ObfuscatedName("rc.e")
	public static int[] field1022;

	@ObfuscatedName("rc.f")
	public String field1023;

	@ObfuscatedName("rc.g")
	public int field1024;

	@ObfuscatedName("rc.h")
	public int field1025;

	@ObfuscatedName("rc.i")
	public boolean field1026 = false;

	@ObfuscatedName("rc.j")
	public boolean field1027 = true;

	@ObfuscatedName("rc.k")
	public int clientCode;

	@ObfuscatedName("rc.l")
	public boolean field1029 = false;

	@ObfuscatedName("rc.m")
	public int field1030;

	@ObfuscatedName("rc.n")
	public boolean field1031 = false;

	@ObfuscatedName("rc.o")
	public boolean field1032 = false;

	@ObfuscatedName("rc.a(ZLyb;)V")
	public static void init(JagFile arg0) {
		Packet var1 = new Packet(arg0.read("varp.dat", null));
		field1021 = 0;
		numDefinitions = var1.g2();
		if (list == null) {
			list = new VarpType[numDefinitions];
		}

		if (field1022 == null) {
			field1022 = new int[numDefinitions];
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

	@ObfuscatedName("rc.a(IILmb;)V")
	public void decode(int arg0, Packet arg1) {
		while (true) {
			int var3 = arg1.g1();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field1024 = arg1.g1();
			} else if (var3 == 2) {
				field1025 = arg1.g1();
			} else if (var3 == 3) {
				field1026 = true;
				field1022[field1021++] = arg0;
			} else if (var3 == 4) {
				field1027 = false;
			} else if (var3 == 5) {
				clientCode = arg1.g2();
			} else if (var3 == 6) {
				field1029 = true;
			} else if (var3 == 7) {
				field1030 = arg1.g4();
			} else if (var3 == 8) {
				field1031 = true;
				field1032 = true;
			} else if (var3 == 10) {
				field1023 = arg1.gstr();
			} else if (var3 == 11) {
				field1032 = true;
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
