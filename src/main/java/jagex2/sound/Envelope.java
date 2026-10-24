package jagex2.sound;

import deob.ObfuscatedName;
import jagex2.io.Packet;

@ObfuscatedName("PFANSVWX")
public class Envelope {

	@ObfuscatedName("PFANSVWX.b")
	public int field1163;

	@ObfuscatedName("PFANSVWX.e")
	public int field1166;

	@ObfuscatedName("PFANSVWX.f")
	public int field1167;

	@ObfuscatedName("PFANSVWX.g")
	public int field1168;

	@ObfuscatedName("PFANSVWX.h")
	public int field1169;

	@ObfuscatedName("PFANSVWX.i")
	public int field1170;

	@ObfuscatedName("PFANSVWX.j")
	public int field1171;

	@ObfuscatedName("PFANSVWX.k")
	public int field1172;

	@ObfuscatedName("PFANSVWX.l")
	public int field1173;

	@ObfuscatedName("PFANSVWX.c")
	public int[] field1164;

	@ObfuscatedName("PFANSVWX.d")
	public int[] field1165;

	@ObfuscatedName("PFANSVWX.a(BLMFMVIYHT;)V")
	public final void method441(Packet arg0) {
		field1168 = arg0.g1();
		field1166 = arg0.g4();
		field1167 = arg0.g4();
		method442(arg0);
	}

	@ObfuscatedName("PFANSVWX.a(LMFMVIYHT;I)V")
	public final void method442(Packet arg0) {
		field1163 = arg0.g1();
		field1164 = new int[field1163];
		field1165 = new int[field1163];
		for (int var2 = 0; var2 < field1163; var2++) {
			field1164[var2] = arg0.g2();
			field1165[var2] = arg0.g2();
		}
	}

	@ObfuscatedName("PFANSVWX.a(Z)V")
	public final void method443() {
		field1169 = 0;
		field1170 = 0;
		field1171 = 0;
		field1172 = 0;
		field1173 = 0;
	}

	@ObfuscatedName("PFANSVWX.a(II)I")
	public final int method444(int arg0) {
		if (field1173 >= field1169) {
			field1172 = field1165[field1170++] << 15;

			if (field1170 >= field1163) {
				field1170 = field1163 - 1;
			}

			field1169 = (int) (field1164[field1170] / 65536.0D * arg0);
			if (field1169 > field1173) {
				field1171 = ((field1165[field1170] << 15) - field1172) / (field1169 - field1173);
			}
		}

		field1172 += field1171;
		field1173++;
		return field1172 - field1171 >> 15;
	}
}
