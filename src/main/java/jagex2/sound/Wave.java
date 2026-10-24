package jagex2.sound;

import deob.ObfuscatedName;
import jagex2.io.Packet;

@ObfuscatedName("UDNCEGOL")
public class Wave {

	@ObfuscatedName("UDNCEGOL.i")
	public Tone[] field1271 = new Tone[10];

	@ObfuscatedName("UDNCEGOL.e")
	public static Wave[] field1267 = new Wave[5000];

	@ObfuscatedName("UDNCEGOL.f")
	public static int[] field1268 = new int[5000];

	@ObfuscatedName("UDNCEGOL.j")
	public int field1272;

	@ObfuscatedName("UDNCEGOL.k")
	public int field1273;

	@ObfuscatedName("UDNCEGOL.h")
	public static Packet field1270;

	@ObfuscatedName("UDNCEGOL.g")
	public static byte[] field1269;

	@ObfuscatedName("UDNCEGOL.a(LMFMVIYHT;I)V")
	public static final void method478(Packet arg0) {
		field1269 = new byte[441000];
		field1270 = new Packet(field1269);
		Tone.method186();

		while (true) {
			int var1 = arg0.g2();
			if (var1 == 0xFFFF) {
				return;
			}

			field1267[var1] = new Wave();
			field1267[var1].method480(arg0);
			field1268[var1] = field1267[var1].method481();
		}
	}

	@ObfuscatedName("UDNCEGOL.a(IBI)LMFMVIYHT;")
	public static final Packet method479(int arg0, int arg1) {
		if (field1267[arg1] != null) {
			Wave var2 = field1267[arg1];
			return var2.method482(arg0);
		}

		return null;
	}

	@ObfuscatedName("UDNCEGOL.a(BLMFMVIYHT;)V")
	public final void method480(Packet arg0) {
		for (int var2 = 0; var2 < 10; var2++) {
			int var3 = arg0.g1();
			if (var3 != 0) {
				arg0.pos--;
				field1271[var2] = new Tone();
				field1271[var2].method189(arg0);
			}
		}

		field1272 = arg0.g2();
		field1273 = arg0.g2();
	}

	@ObfuscatedName("UDNCEGOL.a(I)I")
	public final int method481() {
		int var1 = 9999999;
		for (int var2 = 0; var2 < 10; var2++) {
			if (field1271[var2] != null && field1271[var2].field588 / 20 < var1) {
				var1 = field1271[var2].field588 / 20;
			}
		}

		if (field1272 < field1273 && field1272 / 20 < var1) {
			var1 = field1272 / 20;
		}

		if (var1 != 9999999 && var1 != 0) {
			for (int var3 = 0; var3 < 10; var3++) {
				if (field1271[var3] != null) {
					field1271[var3].field588 -= var1 * 20;
				}
			}

			if (field1272 < field1273) {
				field1272 -= var1 * 20;
				field1273 -= var1 * 20;
			}

			return var1;
		}

		return 0;
	}

	@ObfuscatedName("UDNCEGOL.a(II)LMFMVIYHT;")
	public final Packet method482(int arg0) {
		int var2 = method483(arg0);
		field1270.pos = 0;
		field1270.p4(0x52494646);
		field1270.ip4(var2 + 36);
		field1270.p4(0x57415645);
		field1270.p4(0x666D7420);
		field1270.ip4(16);
		field1270.ip2(1);
		field1270.ip2(1);
		field1270.ip4(22050);
		field1270.ip4(22050);
		field1270.ip2(1);
		field1270.ip2(8);
		field1270.p4(0x64617461);
		field1270.ip4(var2);
		field1270.pos += var2;
		return field1270;
	}

	@ObfuscatedName("UDNCEGOL.b(I)I")
	public final int method483(int arg0) {
		int var2 = 0;
		for (int var3 = 0; var3 < 10; var3++) {
			if (field1271[var3] != null && field1271[var3].field588 + field1271[var3].field587 > var2) {
				var2 = field1271[var3].field588 + field1271[var3].field587;
			}
		}

		if (var2 == 0) {
			return 0;
		}

		int var4 = var2 * 22050 / 1000;
		int var5 = field1272 * 22050 / 1000;
		int var6 = field1273 * 22050 / 1000;
		if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
			arg0 = 0;
		}

		int var7 = (arg0 - 1) * (var6 - var5) + var4;
		for (int var8 = 44; var8 < var7 + 44; var8++) {
			field1269[var8] = -128;
		}

		for (int var9 = 0; var9 < 10; var9++) {
			if (field1271[var9] != null) {
				int var10 = field1271[var9].field587 * 22050 / 1000;
				int var11 = field1271[var9].field588 * 22050 / 1000;
				int[] var12 = field1271[var9].method187(var10, field1271[var9].field587);
				for (int var13 = 0; var13 < var10; var13++) {
					int var14 = (var12[var13] >> 8) + (field1269[var11 + var13 + 44] & 0xFF);
					if ((var14 & 0xFFFFFF00) != 0) {
						var14 = ~(var14 >> 31);
					}

					field1269[var11 + var13 + 44] = (byte) var14;
				}
			}
		}

		if (arg0 > 1) {
			var5 += 44;
			var6 += 44;
			var4 += 44;
			var7 += 44;
			int var15 = var7 - var4;
			for (int var16 = var4 - 1; var16 >= var6; var16--) {
				field1269[var15 + var16] = field1269[var16];
			}

			for (int var17 = 1; var17 < arg0; var17++) {
				int var18 = (var6 - var5) * var17;
				for (int var19 = var5; var19 < var6; var19++) {
					field1269[var18 + var19] = field1269[var19];
				}
			}

			var7 -= 44;
		}

		return var7;
	}
}
