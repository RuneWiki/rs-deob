package deob;

@ObfuscatedName("ks")
public class class300 extends class301 {

    @ObfuscatedName("ks.c")
    public class329 field3702;

    @ObfuscatedName("ks.t")
    public static final int[] field3701 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("ks.o")
    public int field3703;

    public class300(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("ks.c([II)V")
    public void method5075(int[] arg0) {
        this.field3702 = new class329(arg0);
    }

    @ObfuscatedName("ks.t(Llw;I)V")
    public void method5074(class329 arg0) {
        this.field3702 = arg0;
    }

    @ObfuscatedName("ks.o(II)V")
    public void method5097(int arg0) {
        this.field3708[++this.field3707 - 1] = (byte) (arg0 + this.field3702.method5811());
    }

    @ObfuscatedName("ks.e(I)I")
    public int method5106() {
        return this.field3708[++this.field3707 - 1] - this.field3702.method5811() & 0xFF;
    }

    @ObfuscatedName("ks.i(B)Z")
    public boolean method5092() {
        int var1 = this.field3708[this.field3707] - this.field3702.method5810() & 0xFF;
        return var1 >= 128;
    }

    @ObfuscatedName("ks.g(I)I")
    public int method5077() {
        int var1 = this.field3708[++this.field3707 - 1] - this.field3702.method5811() & 0xFF;
        return var1 < 128 ? var1 : (var1 - 128 << 8) + (this.field3708[++this.field3707 - 1] - this.field3702.method5811() & 0xFF);
    }

    @ObfuscatedName("ks.d([BIII)V")
    public void method5078(byte[] arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < arg2; var4++) {
            arg0[arg1 + var4] = (byte) (this.field3708[++this.field3707 - 1] - this.field3702.method5811());
        }
    }

    @ObfuscatedName("ks.l(B)V")
    public void method5079() {
        this.field3703 = this.field3707 * 8;
    }

    @ObfuscatedName("ks.j(IS)I")
    public int method5080(int arg0) {
        int var2 = this.field3703 >> 3;
        int var3 = 8 - (this.field3703 & 0x7);
        int var4 = 0;
        this.field3703 += arg0;
        while (arg0 > var3) {
            var4 += (this.field3708[var2++] & field3701[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field3708[var2] & field3701[var3]) + var4;
        } else {
            var5 = (this.field3708[var2] >> var3 - arg0 & field3701[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("ks.m(B)V")
    public void method5083() {
        this.field3707 = (this.field3703 + 7) / 8;
    }

    @ObfuscatedName("ks.p(II)I")
    public int method5081(int arg0) {
        return arg0 * 8 - this.field3703;
    }
}
