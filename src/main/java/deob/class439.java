package deob;

@ObfuscatedName("pc")
public class class439 extends class440 {

    @ObfuscatedName("pc.o")
    public class456 field4677;

    @ObfuscatedName("pc.q")
    public static final int[] field4676 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("pc.l")
    public int field4674;

    public class439(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("pc.o([IB)V")
    public void method6832(int[] arg0) {
        this.field4677 = new class456(arg0);
    }

    @ObfuscatedName("pc.q(Lqh;I)V")
    public void method6833(class456 arg0) {
        this.field4677 = arg0;
    }

    @ObfuscatedName("pc.l(IB)V")
    public void method6834(int arg0) {
        this.field4679[++this.field4678 - 1] = (byte) (arg0 + this.field4677.method7469());
    }

    @ObfuscatedName("pc.k(B)I")
    public int method6867() {
        return this.field4679[++this.field4678 - 1] - this.field4677.method7469() & 0xFF;
    }

    @ObfuscatedName("pc.a(I)Z")
    public boolean method6873() {
        int var1 = this.field4679[this.field4678] - this.field4677.method7470() & 0xFF;
        return var1 >= 128;
    }

    @ObfuscatedName("pc.m(I)I")
    public int method6837() {
        int var1 = this.field4679[++this.field4678 - 1] - this.field4677.method7469() & 0xFF;
        return var1 < 128 ? var1 : (var1 - 128 << 8) + (this.field4679[++this.field4678 - 1] - this.field4677.method7469() & 0xFF);
    }

    @ObfuscatedName("pc.p([BIIB)V")
    public void method6838(byte[] arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < arg2; var4++) {
            arg0[arg1 + var4] = (byte) (this.field4679[++this.field4678 - 1] - this.field4677.method7469());
        }
    }

    @ObfuscatedName("pc.s(I)V")
    public void method6839() {
        this.field4674 = this.field4678 * 8;
    }

    @ObfuscatedName("pc.r(II)I")
    public int method6840(int arg0) {
        int var2 = this.field4674 >> 3;
        int var3 = 8 - (this.field4674 & 0x7);
        int var4 = 0;
        this.field4674 += arg0;
        while (arg0 > var3) {
            var4 += (this.field4679[var2++] & field4676[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field4679[var2] & field4676[var3]) + var4;
        } else {
            var5 = (this.field4679[var2] >> var3 - arg0 & field4676[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("pc.v(B)V")
    public void method6841() {
        this.field4678 = (this.field4674 + 7) / 8;
    }

    @ObfuscatedName("pc.y(II)I")
    public int method6842(int arg0) {
        return arg0 * 8 - this.field4674;
    }
}
