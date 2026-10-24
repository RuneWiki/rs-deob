package jagex2.config;

import deob.ObfuscatedName;
import jagex2.io.Jagfile;
import jagex2.io.Packet;

@ObfuscatedName("WEUDDWZB")
public class VarpType {

	@ObfuscatedName("WEUDDWZB.h")
	public boolean field1309 = false;

	@ObfuscatedName("WEUDDWZB.i")
	public boolean field1310 = true;

	@ObfuscatedName("WEUDDWZB.k")
	public boolean field1312 = false;

	@ObfuscatedName("WEUDDWZB.n")
	public boolean field1315 = false;

	@ObfuscatedName("WEUDDWZB.o")
	public int field1316 = -1;

	@ObfuscatedName("WEUDDWZB.p")
	public boolean field1317 = true;

	@ObfuscatedName("WEUDDWZB.a")
	public static int field1302;

	@ObfuscatedName("WEUDDWZB.c")
	public static int field1304;

	@ObfuscatedName("WEUDDWZB.f")
	public int field1307;

	@ObfuscatedName("WEUDDWZB.g")
	public int field1308;

	@ObfuscatedName("WEUDDWZB.j")
	public int field1311;

	@ObfuscatedName("WEUDDWZB.l")
	public int field1313;

	@ObfuscatedName("WEUDDWZB.m")
	public int field1314;

	@ObfuscatedName("WEUDDWZB.e")
	public String field1306;

	@ObfuscatedName("WEUDDWZB.d")
	public static int[] field1305;

	@ObfuscatedName("WEUDDWZB.b")
	public static VarpType[] field1303;

	@ObfuscatedName("WEUDDWZB.a(LATJMVOZR;I)V")
	public static void method484(Jagfile arg0) {
		Packet var1 = new Packet(arg0.method2("varp.dat", null));
		field1304 = 0;
		field1302 = var1.g2();
		if (field1303 == null) {
			field1303 = new VarpType[field1302];
		}

		if (field1305 == null) {
			field1305 = new int[field1302];
		}

		for (int var2 = 0; var2 < field1302; var2++) {
			if (field1303[var2] == null) {
				field1303[var2] = new VarpType();
			}

			field1303[var2].method485(var2, var1);
		}

		if (var1.data.length != var1.pos) {
			System.out.println("varptype load mismatch");
		}
	}

	@ObfuscatedName("WEUDDWZB.a(IILMFMVIYHT;)V")
	public void method485(int arg0, Packet arg1) {
		while (true) {
			int var3 = arg1.g1();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field1307 = arg1.g1();
			} else if (var3 == 2) {
				field1308 = arg1.g1();
			} else if (var3 == 3) {
				field1309 = true;
				field1305[field1304++] = arg0;
			} else if (var3 == 4) {
				field1310 = false;
			} else if (var3 == 5) {
				field1311 = arg1.g2();
			} else if (var3 == 6) {
				field1312 = true;
			} else if (var3 == 7) {
				field1313 = arg1.g4();
			} else if (var3 == 8) {
				field1314 = 1;
				field1315 = true;
			} else if (var3 == 10) {
				field1306 = arg1.gjstr();
			} else if (var3 == 11) {
				field1315 = true;
			} else if (var3 == 12) {
				field1316 = arg1.g4();
			} else if (var3 == 13) {
				field1314 = 2;
				field1315 = true;
			} else if (var3 == 14) {
				field1317 = false;
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
