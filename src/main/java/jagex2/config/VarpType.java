package jagex2.config;

import deob.ObfuscatedName;
import jagex2.io.Jagfile;
import jagex2.io.Packet;

@ObfuscatedName("pc")
public class VarpType {

	@ObfuscatedName("pc.b")
	public static int field1003;

	@ObfuscatedName("pc.c")
	public static VarpType[] field1004;

	@ObfuscatedName("pc.d")
	public static int field1005;

	@ObfuscatedName("pc.e")
	public static int[] field1006;

	@ObfuscatedName("pc.f")
	public String field1007;

	@ObfuscatedName("pc.g")
	public int field1008;

	@ObfuscatedName("pc.h")
	public int field1009;

	@ObfuscatedName("pc.i")
	public boolean field1010 = false;

	@ObfuscatedName("pc.j")
	public boolean field1011 = true;

	@ObfuscatedName("pc.k")
	public int field1012;

	@ObfuscatedName("pc.l")
	public boolean field1013 = false;

	@ObfuscatedName("pc.m")
	public int field1014;

	@ObfuscatedName("pc.n")
	public boolean field1015 = false;

	@ObfuscatedName("pc.o")
	public boolean field1016 = false;

	@ObfuscatedName("pc.a(Lyb;B)V")
	public static void method387(Jagfile arg0) {
		Packet var1 = new Packet(arg0.method308("varp.dat", null));
		field1005 = 0;
		field1003 = var1.method240();
		if (field1004 == null) {
			field1004 = new VarpType[field1003];
		}

		if (field1006 == null) {
			field1006 = new int[field1003];
		}

		for (int var2 = 0; var2 < field1003; var2++) {
			if (field1004[var2] == null) {
				field1004[var2] = new VarpType();
			}

			field1004[var2].method388(var1, var2);
		}

		if (var1.field620.length != var1.field621) {
			System.out.println("varptype load mismatch");
		}
	}

	@ObfuscatedName("pc.a(Lmb;II)V")
	public void method388(Packet arg0, int arg1) {
		while (true) {
			int var3 = arg0.method238();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field1008 = arg0.method238();
			} else if (var3 == 2) {
				field1009 = arg0.method238();
			} else if (var3 == 3) {
				field1010 = true;
				field1006[field1005++] = arg1;
			} else if (var3 == 4) {
				field1011 = false;
			} else if (var3 == 5) {
				field1012 = arg0.method240();
			} else if (var3 == 6) {
				field1013 = true;
			} else if (var3 == 7) {
				field1014 = arg0.method243();
			} else if (var3 == 8) {
				field1015 = true;
				field1016 = true;
			} else if (var3 == 10) {
				field1007 = arg0.method245();
			} else if (var3 == 11) {
				field1016 = true;
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
