package deob;

@ObfuscatedName("di")
public final class class41 extends class28 {

    @ObfuscatedName("di.b")
    public int field432;

    @ObfuscatedName("di.c")
    public static final int[] field430 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("di.v")
    public class31 field433;

    @ObfuscatedName("di.z(I)V")
    public void method745() {
        this.field303 = (this.field432 + 7) / 8;
    }

    @ObfuscatedName("di.c(II)V")
    public void method746(int arg0) {
        this.field306[++this.field303 - 1] = (byte) (arg0 + this.field433.method533());
    }

    public class41(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("di.m(II)I")
    public int method747(int arg0) {
        int var2 = this.field432 >> 3;
        int var3 = 8 - (this.field432 & 0x7);
        int var4 = 0;
        this.field432 += arg0;
        while (arg0 > var3) {
            var4 += (this.field306[var2++] & field430[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field306[var2] & field430[var3]) + var4;
        } else {
            var5 = (this.field306[var2] >> var3 - arg0 & field430[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("di.x(II)I")
    public int method749(int arg0) {
        return arg0 * 8 - this.field432;
    }

    @ObfuscatedName("di.i(I)V")
    public void method753() {
        this.field432 = this.field303 * 8;
    }

    @ObfuscatedName("di.b(I)I")
    public int method759() {
        return this.field306[++this.field303 - 1] - this.field433.method533() & 0xFF;
    }

    @ObfuscatedName("di.v([IB)V")
    public void method763(int[] arg0) {
        this.field433 = new class31(arg0);
    }
}
