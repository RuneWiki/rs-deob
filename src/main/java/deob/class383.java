package deob;

@ObfuscatedName("ns")
public class class383 extends class384 {

    @ObfuscatedName("ns.f")
    public class400 field4158;

    @ObfuscatedName("ns.e")
    public static final int[] field4156 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("ns.v")
    public int field4157;

    public class383(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("ns.f([II)V")
    public void method5843(int[] arg0) {
        this.field4158 = new class400(arg0);
    }

    @ObfuscatedName("ns.e(Lod;B)V")
    public void method5847(class400 arg0) {
        this.field4158 = arg0;
    }

    @ObfuscatedName("ns.v(IB)V")
    public void method5849(int arg0) {
        this.field4160[++this.field4161 - 1] = (byte) (arg0 + this.field4158.method6439());
    }

    @ObfuscatedName("ns.y(I)I")
    public int method5874() {
        return this.field4160[++this.field4161 - 1] - this.field4158.method6439() & 0xFF;
    }

    @ObfuscatedName("ns.j(I)Z")
    public boolean method5853() {
        int var1 = this.field4160[this.field4161] - this.field4158.method6429() & 0xFF;
        return var1 >= 128;
    }

    @ObfuscatedName("ns.o(B)I")
    public int method5854() {
        int var1 = this.field4160[++this.field4161 - 1] - this.field4158.method6439() & 0xFF;
        return var1 < 128 ? var1 : (var1 - 128 << 8) + (this.field4160[++this.field4161 - 1] - this.field4158.method6439() & 0xFF);
    }

    @ObfuscatedName("ns.m([BIII)V")
    public void method5845(byte[] arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < arg2; var4++) {
            arg0[arg1 + var4] = (byte) (this.field4160[++this.field4161 - 1] - this.field4158.method6439());
        }
    }

    @ObfuscatedName("ns.r(B)V")
    public void method5842() {
        this.field4157 = this.field4161 * 8;
    }

    @ObfuscatedName("ns.h(IB)I")
    public int method5850(int arg0) {
        int var2 = this.field4157 >> 3;
        int var3 = 8 - (this.field4157 & 0x7);
        int var4 = 0;
        this.field4157 += arg0;
        while (arg0 > var3) {
            var4 += (this.field4160[var2++] & field4156[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field4160[var2] & field4156[var3]) + var4;
        } else {
            var5 = (this.field4160[var2] >> var3 - arg0 & field4156[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("ns.d(I)V")
    public void method5851() {
        this.field4161 = (this.field4157 + 7) / 8;
    }

    @ObfuscatedName("ns.z(IS)I")
    public int method5852(int arg0) {
        return arg0 * 8 - this.field4157;
    }
}
