package jagex2.config;

import deob.ObfuscatedName;
import jagex2.io.Jagfile;
import jagex2.io.Packet;

public class VarpType {

	@ObfuscatedName("VGXVBFVC.b")
	public int _flowObfuscator2 = -32357;

	@ObfuscatedName("VGXVBFVC.j")
	public boolean field1494 = false;

	@ObfuscatedName("VGXVBFVC.k")
	public boolean field1495 = true;

	@ObfuscatedName("VGXVBFVC.m")
	public boolean field1497 = false;

	@ObfuscatedName("VGXVBFVC.p")
	public boolean field1500 = false;

	@ObfuscatedName("VGXVBFVC.q")
	public int field1501 = -1;

	@ObfuscatedName("VGXVBFVC.a")
	public static boolean _flowObfuscator1 = true;

	@ObfuscatedName("VGXVBFVC.c")
	public static int count;

	@ObfuscatedName("VGXVBFVC.e")
	public static int field1489;

	@ObfuscatedName("VGXVBFVC.h")
	public int field1492;

	@ObfuscatedName("VGXVBFVC.i")
	public int field1493;

	@ObfuscatedName("VGXVBFVC.l")
	public int clientcode;

	@ObfuscatedName("VGXVBFVC.n")
	public int field1498;

	@ObfuscatedName("VGXVBFVC.o")
	public int field1499;

	@ObfuscatedName("VGXVBFVC.g")
	public String field1491;

	@ObfuscatedName("VGXVBFVC.f")
	public static int[] field1490;

	@ObfuscatedName("VGXVBFVC.d")
	public static VarpType[] instances;

	@ObfuscatedName("VGXVBFVC.a(ILXTGLDHGX;)V")
	public static void unpack(int arg0, Jagfile arg1) {
		Packet var2 = new Packet(arg1.read("varp.dat", null), 891);
		field1489 = 0;
		count = var2.g2();
		if (instances == null) {
			instances = new VarpType[count];
		}
		if (field1490 == null) {
			field1490 = new int[count];
		}
		for (int var3 = 0; var3 < count; var3++) {
			if (instances[var3] == null) {
				instances[var3] = new VarpType();
			}
			instances[var3].decodeClient(var2, false, var3);
		}
		if (arg0 != 0) {
			_flowObfuscator1 = !_flowObfuscator1;
		}
		if (var2.data.length != var2.pos) {
			System.out.println("varptype load mismatch");
		}
	}

	@ObfuscatedName("VGXVBFVC.a(LMBMGIXGO;ZI)V")
	public void decodeClient(Packet arg0, boolean arg1, int arg2) {
		if (arg1) {
			this._flowObfuscator2 = -91;
		}
		while (true) {
			int var4 = arg0.g1();
			if (var4 == 0) {
				return;
			}
			if (var4 == 1) {
				this.field1492 = arg0.g1();
			} else if (var4 == 2) {
				this.field1493 = arg0.g1();
			} else if (var4 == 3) {
				this.field1494 = true;
				field1490[field1489++] = arg2;
			} else if (var4 == 4) {
				this.field1495 = false;
			} else if (var4 == 5) {
				this.clientcode = arg0.g2();
			} else if (var4 == 6) {
				this.field1497 = true;
			} else if (var4 == 7) {
				this.field1498 = arg0.g4();
			} else if (var4 == 8) {
				this.field1499 = 1;
				this.field1500 = true;
			} else if (var4 == 10) {
				this.field1491 = arg0.gjstr();
			} else if (var4 == 11) {
				this.field1500 = true;
			} else if (var4 == 12) {
				this.field1501 = arg0.g4();
			} else if (var4 == 13) {
				this.field1499 = 2;
			} else {
				System.out.println("Error unrecognised config code: " + var4);
			}
		}
	}
}
