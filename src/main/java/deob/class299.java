package deob;

@ObfuscatedName("kf")
public class class299 extends class300 {

    @ObfuscatedName("kf.a")
    public class328 field3691;

    @ObfuscatedName("kf.t")
    public static final int[] field3689 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("kf.n")
    public int field3690;

    public class299(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("kf.a([IS)V")
    public void method5066(int[] arg0) {
        this.field3691 = new class328(arg0);
    }

    @ObfuscatedName("kf.t(Llm;I)V")
    public void method5103(class328 arg0) {
        this.field3691 = arg0;
    }

    @ObfuscatedName("kf.n(II)V")
    public void method5068(int arg0) {
        this.field3699[++this.field3694 - 1] = (byte) (arg0 + this.field3691.method5835());
    }

    @ObfuscatedName("kf.q(I)I")
    public int method5069() {
        return this.field3699[++this.field3694 - 1] - this.field3691.method5835() & 0xFF;
    }

    @ObfuscatedName("kf.v(I)Z")
    public boolean method5100() {
        int var1 = this.field3699[this.field3694] - this.field3691.method5826() & 0xFF;
        return var1 >= 128;
    }

    @ObfuscatedName("kf.l(B)I")
    public int method5071() {
        int var1 = this.field3699[++this.field3694 - 1] - this.field3691.method5835() & 0xFF;
        return var1 < 128 ? var1 : (var1 - 128 << 8) + (this.field3699[++this.field3694 - 1] - this.field3691.method5835() & 0xFF);
    }

    @ObfuscatedName("kf.c([BIIB)V")
    public void method5072(byte[] arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < arg2; var4++) {
            arg0[arg1 + var4] = (byte) (this.field3699[++this.field3694 - 1] - this.field3691.method5835());
        }
    }

    @ObfuscatedName("kf.o(I)V")
    public void method5073() {
        this.field3690 = this.field3694 * 8;
    }

    @ObfuscatedName("kf.i(II)I")
    public int method5074(int arg0) {
        int var2 = this.field3690 >> 3;
        int var3 = 8 - (this.field3690 & 0x7);
        int var4 = 0;
        this.field3690 += arg0;
        while (arg0 > var3) {
            var4 += (this.field3699[var2++] & field3689[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field3699[var2] & field3689[var3]) + var4;
        } else {
            var5 = (this.field3699[var2] >> var3 - arg0 & field3689[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("kf.d(I)V")
    public void method5075() {
        this.field3694 = (this.field3690 + 7) / 8;
    }

    @ObfuscatedName("kf.m(II)I")
    public int method5076(int arg0) {
        return arg0 * 8 - this.field3690;
    }
}
