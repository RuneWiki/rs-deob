package jagex2.config;

import deob.ObfuscatedName;
import jagex2.io.JagFile;
import jagex2.io.Packet;

@ObfuscatedName("lc")
public class VarpType {

	@ObfuscatedName("lc.c")
	public static int numDefinitions;

	@ObfuscatedName("lc.d")
	public static VarpType[] list;

	@ObfuscatedName("lc.e")
	public static int field930;

	@ObfuscatedName("lc.f")
	public static int[] field931;

	@ObfuscatedName("lc.g")
	public String field932;

	@ObfuscatedName("lc.h")
	public int field933;

	@ObfuscatedName("lc.i")
	public int field934;

	@ObfuscatedName("lc.j")
	public boolean field935 = false;

	@ObfuscatedName("lc.k")
	public boolean field936 = true;

	@ObfuscatedName("lc.l")
	public int clientCode;

	@ObfuscatedName("lc.m")
	public boolean field938 = false;

	@ObfuscatedName("lc.n")
	public int field939;

	@ObfuscatedName("lc.o")
	public boolean field940 = false;

	@ObfuscatedName("lc.a(Lub;I)V")
	public static void init(JagFile arg0) {
		Packet var1 = new Packet(arg0.read("varp.dat", null));
		field930 = 0;
		numDefinitions = var1.g2();
		if (list == null) {
			list = new VarpType[numDefinitions];
		}

		if (field931 == null) {
			field931 = new int[numDefinitions];
		}

		for (int var2 = 0; var2 < numDefinitions; var2++) {
			if (list[var2] == null) {
				list[var2] = new VarpType();
			}

			list[var2].decode(var2, var1);
		}
	}

	@ObfuscatedName("lc.a(IILkb;)V")
	public void decode(int arg0, Packet arg1) {
		while (true) {
			int var3 = arg1.g1();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field933 = arg1.g1();
			} else if (var3 == 2) {
				field934 = arg1.g1();
			} else if (var3 == 3) {
				field935 = true;
				field931[field930++] = arg0;
			} else if (var3 == 4) {
				field936 = false;
			} else if (var3 == 5) {
				clientCode = arg1.g2();
			} else if (var3 == 6) {
				field938 = true;
			} else if (var3 == 7) {
				field939 = arg1.g4();
			} else if (var3 == 8) {
				field940 = true;
			} else if (var3 == 10) {
				field932 = arg1.gstr();
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
