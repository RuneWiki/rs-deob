package jagex2.io;

import deob.ObfuscatedName;
import jagex2.datastruct.DoublyLinkable;
import jagex2.datastruct.LinkList;
import java.math.BigInteger;

@ObfuscatedName("MFMVIYHT")
public final class Packet extends DoublyLinkable {

	@ObfuscatedName("MFMVIYHT.z")
	public byte[] data;

	@ObfuscatedName("MFMVIYHT.A")
	public int pos;

	@ObfuscatedName("MFMVIYHT.C")
	public static int[] field1107 = new int[256];

	@ObfuscatedName("MFMVIYHT.D")
	public static final int[] field1108 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@ObfuscatedName("MFMVIYHT.I")
	public static LinkList field1113 = new LinkList();

	@ObfuscatedName("MFMVIYHT.J")
	public static LinkList field1114 = new LinkList();

	@ObfuscatedName("MFMVIYHT.K")
	public static LinkList field1115 = new LinkList();

	@ObfuscatedName("MFMVIYHT.L")
	public static char[] field1116 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };

	@ObfuscatedName("MFMVIYHT.B")
	public int field1106;

	@ObfuscatedName("MFMVIYHT.F")
	public static int field1110;

	@ObfuscatedName("MFMVIYHT.G")
	public static int field1111;

	@ObfuscatedName("MFMVIYHT.H")
	public static int field1112;

	@ObfuscatedName("MFMVIYHT.E")
	public Isaac field1109;

	@ObfuscatedName("MFMVIYHT.a(BI)LMFMVIYHT;")
	public static Packet alloc(int arg0) {
		synchronized (field1114) {
			Packet var2 = null;
			if (arg0 == 0 && field1110 > 0) {
				field1110--;
				var2 = (Packet) field1113.method5();
			} else if (arg0 == 1 && field1111 > 0) {
				field1111--;
				var2 = (Packet) field1114.method5();
			} else if (arg0 == 2 && field1112 > 0) {
				field1112--;
				var2 = (Packet) field1115.method5();
			}

			if (var2 != null) {
				var2.pos = 0;
				return var2;
			}
		}

		Packet var4 = new Packet();
		var4.pos = 0;

		if (arg0 == 0) {
			var4.data = new byte[100];
		} else if (arg0 == 1) {
			var4.data = new byte[5000];
		} else {
			var4.data = new byte[30000];
		}

		return var4;
	}

	public Packet() {
	}

	public Packet(byte[] arg0) {
		data = arg0;
		pos = 0;
	}

	@ObfuscatedName("MFMVIYHT.b(BI)V")
	public void p1isaac(int arg0) {
		data[pos++] = (byte) (arg0 + field1109.method329());
	}

	@ObfuscatedName("MFMVIYHT.a(I)V")
	public void p1(int arg0) {
		data[pos++] = (byte) arg0;
	}

	@ObfuscatedName("MFMVIYHT.b(I)V")
	public void p2(int arg0) {
		data[pos++] = (byte) (arg0 >> 8);
		data[pos++] = (byte) arg0;
	}

	@ObfuscatedName("MFMVIYHT.a(IZ)V")
	public void ip2(int arg0) {
		data[pos++] = (byte) arg0;
		data[pos++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("MFMVIYHT.c(I)V")
	public void p3(int arg0) {
		data[pos++] = (byte) (arg0 >> 16);
		data[pos++] = (byte) (arg0 >> 8);
		data[pos++] = (byte) arg0;
	}

	@ObfuscatedName("MFMVIYHT.d(I)V")
	public void p4(int arg0) {
		data[pos++] = (byte) (arg0 >> 24);
		data[pos++] = (byte) (arg0 >> 16);
		data[pos++] = (byte) (arg0 >> 8);
		data[pos++] = (byte) arg0;
	}

	@ObfuscatedName("MFMVIYHT.b(IZ)V")
	public void ip4(int arg0) {
		data[pos++] = (byte) arg0;
		data[pos++] = (byte) (arg0 >> 8);
		data[pos++] = (byte) (arg0 >> 16);
		data[pos++] = (byte) (arg0 >> 24);
	}

	@ObfuscatedName("MFMVIYHT.a(JZ)V")
	public void p8(long arg0) {
		data[pos++] = (byte) (arg0 >> 56);
		data[pos++] = (byte) (arg0 >> 48);
		data[pos++] = (byte) (arg0 >> 40);
		data[pos++] = (byte) (arg0 >> 32);
		data[pos++] = (byte) (arg0 >> 24);
		data[pos++] = (byte) (arg0 >> 16);
		data[pos++] = (byte) (arg0 >> 8);
		data[pos++] = (byte) arg0;
	}

	@ObfuscatedName("MFMVIYHT.a(Ljava/lang/String;)V")
	public void pjstr(String arg0) {
		arg0.getBytes(0, arg0.length(), data, pos);
		pos += arg0.length();
		data[pos++] = 10;
	}

	@ObfuscatedName("MFMVIYHT.a([BIII)V")
	public void pdata(byte[] arg0, int arg1, int arg2) {
		for (int var4 = arg2; var4 < arg1 + arg2; var4++) {
			data[pos++] = arg0[var4];
		}
	}

	@ObfuscatedName("MFMVIYHT.a(II)V")
	public void psize1(int arg0) {
		data[pos - arg0 - 1] = (byte) arg0;
	}

	@ObfuscatedName("MFMVIYHT.c()I")
	public int g1() {
		return data[pos++] & 0xFF;
	}

	@ObfuscatedName("MFMVIYHT.d()B")
	public byte g1b() {
		return data[pos++];
	}

	@ObfuscatedName("MFMVIYHT.e()I")
	public int g2() {
		pos += 2;
		return ((data[pos - 2] & 0xFF) << 8) + (data[pos - 1] & 0xFF);
	}

	@ObfuscatedName("MFMVIYHT.f()I")
	public int g2b() {
		pos += 2;
		int var1 = ((data[pos - 2] & 0xFF) << 8) + (data[pos - 1] & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("MFMVIYHT.g()I")
	public int g3() {
		pos += 3;
		return (data[pos - 1] & 0xFF) + ((data[pos - 3] & 0xFF) << 16) + ((data[pos - 2] & 0xFF) << 8);
	}

	@ObfuscatedName("MFMVIYHT.h()I")
	public int g4() {
		pos += 4;
		return (data[pos - 1] & 0xFF) + ((data[pos - 2] & 0xFF) << 8) + ((data[pos - 4] & 0xFF) << 24) + ((data[pos - 3] & 0xFF) << 16);
	}

	@ObfuscatedName("MFMVIYHT.e(I)J")
	public long g8() {
		long var1 = g4() & 0xFFFFFFFFL;
		long var3 = g4() & 0xFFFFFFFFL;
		return (var1 << 32) + var3;
	}

	@ObfuscatedName("MFMVIYHT.i()Ljava/lang/String;")
	public String gjstr() {
		int var1 = pos;

		while (data[pos++] != 10) {
		}

		return new String(data, var1, pos - var1 - 1);
	}

	@ObfuscatedName("MFMVIYHT.f(I)[B")
	public byte[] gjstrraw() {
		int var1 = pos;

		while (data[pos++] != 10) {
		}

		byte[] var2 = new byte[pos - var1 - 1];
		for (int var3 = var1; var3 < pos - 1; var3++) {
			var2[var3 - var1] = data[var3];
		}

		return var2;
	}

	@ObfuscatedName("MFMVIYHT.a(III[B)V")
	public void gdata(int arg0, int arg1, byte[] arg2) {
		for (int var4 = arg1; var4 < arg0 + arg1; var4++) {
			arg2[var4] = data[pos++];
		}
	}

	@ObfuscatedName("MFMVIYHT.a(B)V")
	public void accessBits() {
		field1106 = pos * 8;
	}

	@ObfuscatedName("MFMVIYHT.b(II)I")
	public int gBit(int arg0) {
		int var2 = field1106 >> 3;
		int var3 = 8 - (field1106 & 0x7);
		int var4 = 0;
		field1106 += arg0;

		while (arg0 > var3) {
			var4 += (data[var2++] & field1108[var3]) << arg0 - var3;
			arg0 -= var3;
			var3 = 8;
		}

		if (arg0 == var3) {
			var4 += data[var2] & field1108[var3];
		} else {
			var4 += data[var2] >> var3 - arg0 & field1108[arg0];
		}

		return var4;
	}

	@ObfuscatedName("MFMVIYHT.g(I)V")
	public void accessBytes() {
		pos = (field1106 + 7) / 8;
	}

	@ObfuscatedName("MFMVIYHT.j()I")
	public int gsmart() {
		int var1 = data[pos] & 0xFF;
		if (var1 < 128) {
			return g1() - 64;
		}

		return g2() - 49152;
	}

	@ObfuscatedName("MFMVIYHT.k()I")
	public int gsmarts() {
		int var1 = data[pos] & 0xFF;
		if (var1 < 128) {
			return g1();
		}

		return g2() - 32768;
	}

	@ObfuscatedName("MFMVIYHT.a(ILjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public void rsaenc(BigInteger arg0, BigInteger arg1) {
		int var3 = pos;
		pos = 0;
		byte[] var4 = new byte[var3];
		gdata(var3, 0, var4);
		BigInteger var5 = new BigInteger(var4);
		BigInteger var6 = var5.modPow(arg1, arg0);
		byte[] var7 = var6.toByteArray();
		pos = 0;
		p1(var7.length);
		pdata(var7, var7.length, 0);
	}

	@ObfuscatedName("MFMVIYHT.a(ZI)V")
	public void p1_alt1(int arg0) {
		data[pos++] = (byte) (arg0 + 128);
	}

	@ObfuscatedName("MFMVIYHT.c(BI)V")
	public void p1_alt2(int arg0) {
		data[pos++] = (byte) -arg0;
	}

	@ObfuscatedName("MFMVIYHT.c(II)V")
	public void p1_alt3(int arg0) {
		data[pos++] = (byte) (128 - arg0);
	}

	@ObfuscatedName("MFMVIYHT.h(I)I")
	public int g1_alt1() {
		return data[pos++] - 128 & 0xFF;
	}

	@ObfuscatedName("MFMVIYHT.i(I)I")
	public int g1_alt2() {
		return -data[pos++] & 0xFF;
	}

	@ObfuscatedName("MFMVIYHT.j(I)I")
	public int g1_alt3() {
		return 128 - data[pos++] & 0xFF;
	}

	@ObfuscatedName("MFMVIYHT.k(I)B")
	public byte g1b_alt1() {
		return (byte) (data[pos++] - 128);
	}

	@ObfuscatedName("MFMVIYHT.l(I)B")
	public byte g1b_alt2() {
		return (byte) -data[pos++];
	}

	@ObfuscatedName("MFMVIYHT.m(I)B")
	public byte g1b_alt3() {
		return (byte) (128 - data[pos++]);
	}

	@ObfuscatedName("MFMVIYHT.d(II)V")
	public void p2_alt1(int arg0) {
		data[pos++] = (byte) arg0;
		data[pos++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("MFMVIYHT.e(II)V")
	public void p2_alt2(int arg0) {
		data[pos++] = (byte) (arg0 >> 8);
		data[pos++] = (byte) (arg0 + 128);
	}

	@ObfuscatedName("MFMVIYHT.f(II)V")
	public void p2_alt3(int arg0) {
		data[pos++] = (byte) (arg0 + 128);
		data[pos++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("MFMVIYHT.n(I)I")
	public int g2_alt1() {
		pos += 2;
		return ((data[pos - 1] & 0xFF) << 8) + (data[pos - 2] & 0xFF);
	}

	@ObfuscatedName("MFMVIYHT.b(B)I")
	public int g2_alt2() {
		pos += 2;
		return ((data[pos - 2] & 0xFF) << 8) + (data[pos - 1] - 128 & 0xFF);
	}

	@ObfuscatedName("MFMVIYHT.o(I)I")
	public int g2_alt3() {
		pos += 2;
		return ((data[pos - 1] & 0xFF) << 8) + (data[pos - 2] - 128 & 0xFF);
	}

	@ObfuscatedName("MFMVIYHT.p(I)I")
	public int g2b_alt1() {
		pos += 2;
		int var1 = ((data[pos - 1] & 0xFF) << 8) + (data[pos - 2] & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("MFMVIYHT.c(B)I")
	public int g2b_alt2() {
		pos += 2;
		int var1 = ((data[pos - 2] & 0xFF) << 8) + (data[pos - 1] - 128 & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("MFMVIYHT.q(I)I")
	public int g3_alt3() {
		pos += 3;
		return (data[pos - 1] & 0xFF) + ((data[pos - 2] & 0xFF) << 16) + ((data[pos - 3] & 0xFF) << 8);
	}

	@ObfuscatedName("MFMVIYHT.r(I)I")
	public int g4_alt1() {
		pos += 4;
		return (data[pos - 4] & 0xFF) + ((data[pos - 3] & 0xFF) << 8) + ((data[pos - 1] & 0xFF) << 24) + ((data[pos - 2] & 0xFF) << 16);
	}

	@ObfuscatedName("MFMVIYHT.s(I)I")
	public int g4_alt2() {
		pos += 4;
		return (data[pos - 3] & 0xFF) + ((data[pos - 4] & 0xFF) << 8) + ((data[pos - 2] & 0xFF) << 24) + ((data[pos - 1] & 0xFF) << 16);
	}

	@ObfuscatedName("MFMVIYHT.a(Z)I")
	public int g4_alt3() {
		pos += 4;
		return (data[pos - 2] & 0xFF) + ((data[pos - 1] & 0xFF) << 8) + ((data[pos - 3] & 0xFF) << 24) + ((data[pos - 4] & 0xFF) << 16);
	}

	@ObfuscatedName("MFMVIYHT.a(B[BII)V")
	public void gdata_alt1(byte[] arg0, int arg1, int arg2) {
		for (int var4 = arg1 + arg2 - 1; var4 >= arg2; var4--) {
			arg0[var4] = data[pos++];
		}
	}

	@ObfuscatedName("MFMVIYHT.b([BIII)V")
	public void gdata_alt2(byte[] arg0, int arg1, int arg2) {
		for (int var4 = arg2; var4 < arg1 + arg2; var4++) {
			arg0[var4] = (byte) (data[pos++] - 128);
		}
	}

	static {
		for (int var0 = 0; var0 < 256; var0++) {
			int var1 = var0;
			for (int var2 = 0; var2 < 8; var2++) {
				if ((var1 & 0x1) == 1) {
					var1 = var1 >>> 1 ^ 0xEDB88320;
				} else {
					var1 >>>= 1;
				}
			}

			field1107[var0] = var1;
		}
	}
}
