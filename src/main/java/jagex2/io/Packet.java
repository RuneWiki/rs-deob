package jagex2.io;

import deob.ObfuscatedName;
import jagex2.datastruct.DoublyLinkable;
import jagex2.datastruct.LinkList;
import java.math.BigInteger;

@ObfuscatedName("MBMGIXGO")
public final class Packet extends DoublyLinkable {

	@ObfuscatedName("MBMGIXGO.y")
	public byte[] data;

	@ObfuscatedName("MBMGIXGO.z")
	public int pos;

	@ObfuscatedName("MBMGIXGO.B")
	public static int[] crctable = new int[256];

	@ObfuscatedName("MBMGIXGO.C")
	public static final int[] bitmask = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@ObfuscatedName("MBMGIXGO.H")
	public static LinkList cacheMin = new LinkList();

	@ObfuscatedName("MBMGIXGO.I")
	public static LinkList cacheMid = new LinkList();

	@ObfuscatedName("MBMGIXGO.J")
	public static LinkList cacheMax = new LinkList();

	@ObfuscatedName("MBMGIXGO.K")
	public static char[] charset = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };

	@ObfuscatedName("MBMGIXGO.A")
	public int bitPos;

	@ObfuscatedName("MBMGIXGO.E")
	public static int cacheMinCount;

	@ObfuscatedName("MBMGIXGO.F")
	public static int cacheMidCount;

	@ObfuscatedName("MBMGIXGO.G")
	public static int cacheMaxCount;

	@ObfuscatedName("MBMGIXGO.D")
	public Isaac random;

	@ObfuscatedName("MBMGIXGO.a(II)LMBMGIXGO;")
	public static Packet alloc(int arg0) {
		synchronized (cacheMid) {
			Packet var2 = null;
			if (arg0 == 0 && cacheMinCount > 0) {
				cacheMinCount--;
				var2 = (Packet) cacheMin.removeHead();
			} else if (arg0 == 1 && cacheMidCount > 0) {
				cacheMidCount--;
				var2 = (Packet) cacheMid.removeHead();
			} else if (arg0 == 2 && cacheMaxCount > 0) {
				cacheMaxCount--;
				var2 = (Packet) cacheMax.removeHead();
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

	@ObfuscatedName("MBMGIXGO.a(BI)V")
	public void p1isaac(int arg0) {
		data[pos++] = (byte) (arg0 + random.nextInt());
	}

	@ObfuscatedName("MBMGIXGO.a(I)V")
	public void p1(int arg0) {
		data[pos++] = (byte) arg0;
	}

	@ObfuscatedName("MBMGIXGO.b(I)V")
	public void p2(int arg0) {
		data[pos++] = (byte) (arg0 >> 8);
		data[pos++] = (byte) arg0;
	}

	@ObfuscatedName("MBMGIXGO.a(ZI)V")
	public void ip2(int arg0) {
		data[pos++] = (byte) arg0;
		data[pos++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("MBMGIXGO.c(I)V")
	public void p3(int arg0) {
		data[pos++] = (byte) (arg0 >> 16);
		data[pos++] = (byte) (arg0 >> 8);
		data[pos++] = (byte) arg0;
	}

	@ObfuscatedName("MBMGIXGO.d(I)V")
	public void p4(int arg0) {
		data[pos++] = (byte) (arg0 >> 24);
		data[pos++] = (byte) (arg0 >> 16);
		data[pos++] = (byte) (arg0 >> 8);
		data[pos++] = (byte) arg0;
	}

	@ObfuscatedName("MBMGIXGO.b(II)V")
	public void ip4(int arg0) {
		data[pos++] = (byte) arg0;
		data[pos++] = (byte) (arg0 >> 8);
		data[pos++] = (byte) (arg0 >> 16);
		data[pos++] = (byte) (arg0 >> 24);
	}

	@ObfuscatedName("MBMGIXGO.a(IJ)V")
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

	@ObfuscatedName("MBMGIXGO.a(Ljava/lang/String;)V")
	public void pjstr(String arg0) {
		arg0.getBytes(0, arg0.length(), data, pos);
		pos += arg0.length();
		data[pos++] = 10;
	}

	@ObfuscatedName("MBMGIXGO.a([BIZI)V")
	public void pdata(byte[] arg0, int arg1, int arg2) {
		for (int var4 = arg2; var4 < arg1 + arg2; var4++) {
			data[pos++] = arg0[var4];
		}
	}

	@ObfuscatedName("MBMGIXGO.a(IB)V")
	public void psize1(int arg0) {
		data[pos - arg0 - 1] = (byte) arg0;
	}

	@ObfuscatedName("MBMGIXGO.c()I")
	public int g1() {
		return data[pos++] & 0xFF;
	}

	@ObfuscatedName("MBMGIXGO.d()B")
	public byte g1b() {
		return data[pos++];
	}

	@ObfuscatedName("MBMGIXGO.e()I")
	public int g2() {
		pos += 2;
		return ((data[pos - 2] & 0xFF) << 8) + (data[pos - 1] & 0xFF);
	}

	@ObfuscatedName("MBMGIXGO.f()I")
	public int g2b() {
		pos += 2;
		int var1 = ((data[pos - 2] & 0xFF) << 8) + (data[pos - 1] & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("MBMGIXGO.g()I")
	public int g3() {
		pos += 3;
		return (data[pos - 1] & 0xFF) + ((data[pos - 3] & 0xFF) << 16) + ((data[pos - 2] & 0xFF) << 8);
	}

	@ObfuscatedName("MBMGIXGO.h()I")
	public int g4() {
		pos += 4;
		return (data[pos - 1] & 0xFF) + ((data[pos - 2] & 0xFF) << 8) + ((data[pos - 4] & 0xFF) << 24) + ((data[pos - 3] & 0xFF) << 16);
	}

	@ObfuscatedName("MBMGIXGO.e(I)J")
	public long g8() {
		long var1 = g4() & 0xFFFFFFFFL;
		long var3 = g4() & 0xFFFFFFFFL;
		return (var1 << 32) + var3;
	}

	@ObfuscatedName("MBMGIXGO.i()Ljava/lang/String;")
	public String gjstr() {
		int var1 = pos;

		while (data[pos++] != 10) {
		}

		return new String(data, var1, pos - var1 - 1);
	}

	@ObfuscatedName("MBMGIXGO.a(B)[B")
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

	@ObfuscatedName("MBMGIXGO.a(IBI[B)V")
	public void gdata(int arg0, int arg1, byte[] arg2) {
		for (int var4 = arg1; var4 < arg0 + arg1; var4++) {
			arg2[var4] = data[pos++];
		}
	}

	@ObfuscatedName("MBMGIXGO.f(I)V")
	public void accessBits() {
		bitPos = pos * 8;
	}

	@ObfuscatedName("MBMGIXGO.c(II)I")
	public int gBit(int arg0) {
		int var2 = bitPos >> 3;
		int var3 = 8 - (bitPos & 0x7);
		int var4 = 0;
		bitPos += arg0;

		while (arg0 > var3) {
			var4 += (data[var2++] & bitmask[var3]) << arg0 - var3;
			arg0 -= var3;
			var3 = 8;
		}

		if (arg0 == var3) {
			var4 += data[var2] & bitmask[var3];
		} else {
			var4 += data[var2] >> var3 - arg0 & bitmask[arg0];
		}

		return var4;
	}

	@ObfuscatedName("MBMGIXGO.a(Z)V")
	public void accessBytes() {
		pos = (bitPos + 7) / 8;
	}

	@ObfuscatedName("MBMGIXGO.j()I")
	public int gsmart() {
		int var1 = data[pos] & 0xFF;
		if (var1 < 128) {
			return g1() - 64;
		}

		return g2() - 49152;
	}

	@ObfuscatedName("MBMGIXGO.k()I")
	public int gsmarts() {
		int var1 = data[pos] & 0xFF;
		if (var1 < 128) {
			return g1();
		}

		return g2() - 32768;
	}

	@ObfuscatedName("MBMGIXGO.a(Ljava/math/BigInteger;Ljava/math/BigInteger;B)V")
	public void rsaenc(BigInteger arg0, BigInteger arg1) {
		int var3 = pos;
		pos = 0;
		byte[] var4 = new byte[var3];
		gdata(var3, 0, var4);
		BigInteger var5 = new BigInteger(var4);
		BigInteger var6 = var5.modPow(arg0, arg1);
		byte[] var7 = var6.toByteArray();
		pos = 0;
		p1(var7.length);
		pdata(var7, var7.length, 0);
	}

	@ObfuscatedName("MBMGIXGO.d(II)V")
	public void p1_alt2(int arg0) {
		data[pos++] = (byte) -arg0;
	}

	@ObfuscatedName("MBMGIXGO.e(II)V")
	public void p1_alt3(int arg0) {
		data[pos++] = (byte) (128 - arg0);
	}

	@ObfuscatedName("MBMGIXGO.g(I)I")
	public int g1_alt1() {
		return data[pos++] - 128 & 0xFF;
	}

	@ObfuscatedName("MBMGIXGO.b(Z)I")
	public int g1_alt2() {
		return -data[pos++] & 0xFF;
	}

	@ObfuscatedName("MBMGIXGO.h(I)I")
	public int g1_alt3() {
		return 128 - data[pos++] & 0xFF;
	}

	@ObfuscatedName("MBMGIXGO.b(B)B")
	public byte g1b_alt2() {
		return (byte) -data[pos++];
	}

	@ObfuscatedName("MBMGIXGO.i(I)B")
	public byte g1b_alt3() {
		return (byte) (128 - data[pos++]);
	}

	@ObfuscatedName("MBMGIXGO.b(ZI)V")
	public void p2_alt1(int arg0) {
		data[pos++] = (byte) arg0;
		data[pos++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("MBMGIXGO.f(II)V")
	public void p2_alt2(int arg0) {
		data[pos++] = (byte) (arg0 >> 8);
		data[pos++] = (byte) (arg0 + 128);
	}

	@ObfuscatedName("MBMGIXGO.g(II)V")
	public void p2_alt3(int arg0) {
		data[pos++] = (byte) (arg0 + 128);
		data[pos++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("MBMGIXGO.c(B)I")
	public int g2_alt1() {
		pos += 2;
		return ((data[pos - 1] & 0xFF) << 8) + (data[pos - 2] & 0xFF);
	}

	@ObfuscatedName("MBMGIXGO.c(Z)I")
	public int g2_alt2() {
		pos += 2;
		return ((data[pos - 2] & 0xFF) << 8) + (data[pos - 1] - 128 & 0xFF);
	}

	@ObfuscatedName("MBMGIXGO.d(B)I")
	public int g2_alt3() {
		pos += 2;
		return ((data[pos - 1] & 0xFF) << 8) + (data[pos - 2] - 128 & 0xFF);
	}

	@ObfuscatedName("MBMGIXGO.j(I)I")
	public int g2b_alt1() {
		pos += 2;
		int var1 = ((data[pos - 1] & 0xFF) << 8) + (data[pos - 2] & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("MBMGIXGO.d(Z)I")
	public int g2b_alt3() {
		pos += 2;
		int var1 = ((data[pos - 1] & 0xFF) << 8) + (data[pos - 2] - 128 & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("MBMGIXGO.e(B)I")
	public int g4_alt2() {
		pos += 4;
		return (data[pos - 3] & 0xFF) + ((data[pos - 4] & 0xFF) << 8) + ((data[pos - 2] & 0xFF) << 24) + ((data[pos - 1] & 0xFF) << 16);
	}

	@ObfuscatedName("MBMGIXGO.e(Z)I")
	public int g4_alt3() {
		pos += 4;
		return (data[pos - 2] & 0xFF) + ((data[pos - 1] & 0xFF) << 8) + ((data[pos - 3] & 0xFF) << 24) + ((data[pos - 4] & 0xFF) << 16);
	}

	@ObfuscatedName("MBMGIXGO.a(IB[BI)V")
	public void pdata_alt2(int arg0, byte[] arg1, int arg2) {
		for (int var4 = arg0 + arg2 - 1; var4 >= arg0; var4--) {
			data[pos++] = (byte) (arg1[var4] + 128);
		}
	}

	@ObfuscatedName("MBMGIXGO.a(IIZ[B)V")
	public void gdata_alt1(int arg0, int arg1, byte[] arg2) {
		for (int var4 = arg0 + arg1 - 1; var4 >= arg1; var4--) {
			arg2[var4] = data[pos++];
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

			crctable[var0] = var1;
		}
	}
}
