package jagex2.config;

import deob.ObfuscatedName;
import jagex2.io.Jagfile;
import jagex2.io.Packet;

@ObfuscatedName("ZQTIEXZH")
public class VarbitType {

	@ObfuscatedName("ZQTIEXZH.h")
	public boolean field1507 = false;

	@ObfuscatedName("ZQTIEXZH.i")
	public int field1508 = -1;

	@ObfuscatedName("ZQTIEXZH.k")
	public boolean field1510 = true;

	@ObfuscatedName("ZQTIEXZH.b")
	public static int field1501;

	@ObfuscatedName("ZQTIEXZH.e")
	public int field1504;

	@ObfuscatedName("ZQTIEXZH.f")
	public int field1505;

	@ObfuscatedName("ZQTIEXZH.g")
	public int field1506;

	@ObfuscatedName("ZQTIEXZH.j")
	public int field1509;

	@ObfuscatedName("ZQTIEXZH.d")
	public String field1503;

	@ObfuscatedName("ZQTIEXZH.c")
	public static VarbitType[] field1502;

	@ObfuscatedName("ZQTIEXZH.a(LATJMVOZR;I)V")
	public static void method602(Jagfile arg0) {
		Packet var1 = new Packet(arg0.method2("varbit.dat", null));
		field1501 = var1.g2();
		if (field1502 == null) {
			field1502 = new VarbitType[field1501];
		}

		for (int var2 = 0; var2 < field1501; var2++) {
			if (field1502[var2] == null) {
				field1502[var2] = new VarbitType();
			}

			field1502[var2].method603(var2, var1);

			if (field1502[var2].field1507) {
				VarpType.field1303[field1502[var2].field1504].field1315 = true;
			}
		}

		if (var1.data.length != var1.pos) {
			System.out.println("varbit load mismatch");
		}
	}

	@ObfuscatedName("ZQTIEXZH.a(IILMFMVIYHT;)V")
	public void method603(int arg0, Packet arg1) {
		while (true) {
			int var3 = arg1.g1();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field1504 = arg1.g2();
				field1505 = arg1.g1();
				field1506 = arg1.g1();
			} else if (var3 == 10) {
				field1503 = arg1.gjstr();
			} else if (var3 == 2) {
				field1507 = true;
			} else if (var3 == 3) {
				field1508 = arg1.g4();
			} else if (var3 == 4) {
				field1509 = arg1.g4();
			} else if (var3 == 5) {
				field1510 = false;
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
