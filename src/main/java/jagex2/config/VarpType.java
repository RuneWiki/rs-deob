package jagex2.config;

import deob.ObfuscatedName;
import jagex2.io.Jagfile;
import jagex2.io.Packet;

@ObfuscatedName("VGXVBFVC")
public class VarpType {

	@ObfuscatedName("VGXVBFVC.j")
	public boolean field1288 = false;

	@ObfuscatedName("VGXVBFVC.k")
	public boolean field1289 = true;

	@ObfuscatedName("VGXVBFVC.m")
	public boolean field1291 = false;

	@ObfuscatedName("VGXVBFVC.p")
	public boolean field1294 = false;

	@ObfuscatedName("VGXVBFVC.q")
	public int field1295 = -1;

	@ObfuscatedName("VGXVBFVC.c")
	public static int count;

	@ObfuscatedName("VGXVBFVC.e")
	public static int field1283;

	@ObfuscatedName("VGXVBFVC.h")
	public int field1286;

	@ObfuscatedName("VGXVBFVC.i")
	public int field1287;

	@ObfuscatedName("VGXVBFVC.l")
	public int clientcode;

	@ObfuscatedName("VGXVBFVC.n")
	public int field1292;

	@ObfuscatedName("VGXVBFVC.o")
	public int field1293;

	@ObfuscatedName("VGXVBFVC.g")
	public String field1285;

	@ObfuscatedName("VGXVBFVC.f")
	public static int[] field1284;

	@ObfuscatedName("VGXVBFVC.d")
	public static VarpType[] instances;

	@ObfuscatedName("VGXVBFVC.a(ILXTGLDHGX;)V")
	public static void unpack(Jagfile arg0) {
		Packet var1 = new Packet(arg0.read("varp.dat", null));
		field1283 = 0;
		count = var1.g2();
		if (instances == null) {
			instances = new VarpType[count];
		}

		if (field1284 == null) {
			field1284 = new int[count];
		}

		for (int var2 = 0; var2 < count; var2++) {
			if (instances[var2] == null) {
				instances[var2] = new VarpType();
			}

			instances[var2].decodeClient(var1, var2);
		}

		if (var1.data.length != var1.pos) {
			System.out.println("varptype load mismatch");
		}
	}

	@ObfuscatedName("VGXVBFVC.a(LMBMGIXGO;ZI)V")
	public void decodeClient(Packet arg0, int arg1) {
		while (true) {
			int var3 = arg0.g1();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field1286 = arg0.g1();
			} else if (var3 == 2) {
				field1287 = arg0.g1();
			} else if (var3 == 3) {
				field1288 = true;
				field1284[field1283++] = arg1;
			} else if (var3 == 4) {
				field1289 = false;
			} else if (var3 == 5) {
				clientcode = arg0.g2();
			} else if (var3 == 6) {
				field1291 = true;
			} else if (var3 == 7) {
				field1292 = arg0.g4();
			} else if (var3 == 8) {
				field1293 = 1;
				field1294 = true;
			} else if (var3 == 10) {
				field1285 = arg0.gjstr();
			} else if (var3 == 11) {
				field1294 = true;
			} else if (var3 == 12) {
				field1295 = arg0.g4();
			} else if (var3 == 13) {
				field1293 = 2;
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
