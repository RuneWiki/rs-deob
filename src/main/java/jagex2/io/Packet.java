package jagex2.io;

import deob.ObfuscatedName;
import jagex2.datastruct.LinkList;
import jagex2.datastruct.Linkable2;
import java.math.BigInteger;

@ObfuscatedName("lb")
public final class Packet extends Linkable2 {

	@ObfuscatedName("lb.t")
	public byte[] data;

	@ObfuscatedName("lb.u")
	public int pos;

	@ObfuscatedName("lb.v")
	public int bitpos;

	@ObfuscatedName("lb.w")
	public static int[] crctable = new int[256];

	@ObfuscatedName("lb.x")
	public static final int[] bitmask = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@ObfuscatedName("lb.y")
	public Isaac random;

	@ObfuscatedName("lb.z")
	public static int cacheMinCount;

	@ObfuscatedName("lb.F")
	public char[] base64enctab = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };

	@ObfuscatedName("lb.C")
	public static LinkList cacheMin = new LinkList();

	@ObfuscatedName("lb.D")
	public static LinkList cacheMid = new LinkList();

	@ObfuscatedName("lb.E")
	public static LinkList cacheMax = new LinkList();

	@ObfuscatedName("lb.A")
	public static int cacheMidCount;

	@ObfuscatedName("lb.B")
	public static int cacheMaxCount;

	@ObfuscatedName("lb.a(II)Llb;")
	public static Packet alloc(int arg0) {
		synchronized (cacheMid) {
			Packet var2 = null;
			if (arg0 == 0 && cacheMinCount > 0) {
				cacheMinCount--;
				var2 = (Packet) cacheMin.popFront();
			} else if (arg0 == 1 && cacheMidCount > 0) {
				cacheMidCount--;
				var2 = (Packet) cacheMid.popFront();
			} else if (arg0 == 2 && cacheMaxCount > 0) {
				cacheMaxCount--;
				var2 = (Packet) cacheMax.popFront();
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

	@ObfuscatedName("lb.a(BI)V")
	public void p1enc(int arg0) {
		data[pos++] = (byte) (arg0 + random.takeNextValue());
	}

	@ObfuscatedName("lb.a(I)V")
	public void p1(int arg0) {
		data[pos++] = (byte) arg0;
	}

	@ObfuscatedName("lb.b(I)V")
	public void p2(int arg0) {
		data[pos++] = (byte) (arg0 >> 8);
		data[pos++] = (byte) arg0;
	}

	@ObfuscatedName("lb.a(ZI)V")
	public void ip2(int arg0) {
		data[pos++] = (byte) arg0;
		data[pos++] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("lb.c(I)V")
	public void p3(int arg0) {
		data[pos++] = (byte) (arg0 >> 16);
		data[pos++] = (byte) (arg0 >> 8);
		data[pos++] = (byte) arg0;
	}

	@ObfuscatedName("lb.d(I)V")
	public void p4(int arg0) {
		data[pos++] = (byte) (arg0 >> 24);
		data[pos++] = (byte) (arg0 >> 16);
		data[pos++] = (byte) (arg0 >> 8);
		data[pos++] = (byte) arg0;
	}

	@ObfuscatedName("lb.b(ZI)V")
	public void ip4(int arg0) {
		data[pos++] = (byte) arg0;
		data[pos++] = (byte) (arg0 >> 8);
		data[pos++] = (byte) (arg0 >> 16);
		data[pos++] = (byte) (arg0 >> 24);
	}

	@ObfuscatedName("lb.a(JI)V")
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

	@ObfuscatedName("lb.a(Ljava/lang/String;)V")
	public void pjstr(String arg0) {
		arg0.getBytes(0, arg0.length(), data, pos);
		pos += arg0.length();
		data[pos++] = 10;
	}

	@ObfuscatedName("lb.a([BZII)V")
	public void pdata(byte[] arg0, int arg1, int arg2) {
		for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
			data[pos++] = arg0[var4];
		}
	}

	@ObfuscatedName("lb.b(II)V")
	public void psize1(int arg0) {
		data[pos - arg0 - 1] = (byte) arg0;
	}

	@ObfuscatedName("lb.c()I")
	public int g1() {
		return data[pos++] & 0xFF;
	}

	@ObfuscatedName("lb.d()B")
	public byte g1b() {
		return data[pos++];
	}

	@ObfuscatedName("lb.e()I")
	public int g2() {
		pos += 2;
		return ((data[pos - 2] & 0xFF) << 8) + (data[pos - 1] & 0xFF);
	}

	@ObfuscatedName("lb.f()I")
	public int g2b() {
		pos += 2;
		int var1 = ((data[pos - 2] & 0xFF) << 8) + (data[pos - 1] & 0xFF);
		if (var1 > 32767) {
			var1 -= 0x10000;
		}

		return var1;
	}

	@ObfuscatedName("lb.g()I")
	public int g3() {
		pos += 3;
		return (data[pos - 1] & 0xFF) + ((data[pos - 3] & 0xFF) << 16) + ((data[pos - 2] & 0xFF) << 8);
	}

	@ObfuscatedName("lb.h()I")
	public int g4() {
		pos += 4;
		return (data[pos - 1] & 0xFF) + ((data[pos - 2] & 0xFF) << 8) + ((data[pos - 4] & 0xFF) << 24) + ((data[pos - 3] & 0xFF) << 16);
	}

	@ObfuscatedName("lb.e(I)J")
	public long g8() {
		long var1 = g4() & 0xFFFFFFFFL;
		long var3 = g4() & 0xFFFFFFFFL;
		return (var1 << 32) + var3;
	}

	@ObfuscatedName("lb.i()Ljava/lang/String;")
	public String gstr() {
		int var1 = pos;

		while (data[pos++] != 10) {
		}

		return new String(data, var1, pos - var1 - 1);
	}

	@ObfuscatedName("lb.f(I)[B")
	public byte[] gstrbyte() {
		int var1 = pos;

		while (data[pos++] != 10) {
		}

		byte[] var2 = new byte[pos - var1 - 1];
		for (int var3 = var1; var3 < pos - 1; var3++) {
			var2[var3 - var1] = data[var3];
		}

		return var2;
	}

	@ObfuscatedName("lb.a(I[BII)V")
	public void gdata(int arg0, byte[] arg1, int arg2) {
		for (int var4 = arg2; var4 < arg0 + arg2; var4++) {
			arg1[var4] = data[pos++];
		}
	}

	@ObfuscatedName("lb.a(B)V")
	public void gbitstart() {
		bitpos = pos * 8;
	}

	@ObfuscatedName("lb.a(IB)I")
	public int gbit(int arg0) {
		int var2 = bitpos >> 3;
		int var3 = 8 - (bitpos & 0x7);
		int var4 = 0;
		bitpos += arg0;

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

	@ObfuscatedName("lb.g(I)V")
	public void gbitend() {
		pos = (bitpos + 7) / 8;
	}

	@ObfuscatedName("lb.j()I")
	public int gsmarts() {
		int var1 = data[pos] & 0xFF;
		if (var1 < 128) {
			return g1() - 64;
		}

		return g2() - 49152;
	}

	@ObfuscatedName("lb.k()I")
	public int gsmart() {
		int var1 = data[pos] & 0xFF;
		if (var1 < 128) {
			return g1();
		}

		return g2() - 32768;
	}

	@ObfuscatedName("lb.a(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
	public void rsaenc(BigInteger arg0, BigInteger arg1) {
		int var3 = pos;
		pos = 0;
		byte[] var4 = new byte[var3];
		gdata(var3, var4, 0);
		BigInteger var5 = new BigInteger(var4);
		BigInteger var6 = var5.modPow(arg1, arg0);
		byte[] var7 = var6.toByteArray();
		pos = 0;
		p1(var7.length);
		pdata(var7, 0, var7.length);
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
