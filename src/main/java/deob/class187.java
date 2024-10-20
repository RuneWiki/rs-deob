package deob;

@ObfuscatedName("gv")
public final class class187 extends class181 {

    @ObfuscatedName("gv.p")
    public class188 field2522;

    @ObfuscatedName("gv.r")
    public static final int[] field2520 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("gv.l")
    public int field2523;

    public class187(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("gv.iy([IB)V")
    public void method3301(int[] arg0) {
        this.field2522 = new class188(arg0);
    }

    @ObfuscatedName("gv.im(Lgh;I)V")
    public void method3306(class188 arg0) {
        this.field2522 = arg0;
    }

    @ObfuscatedName("gv.ii(IB)V")
    public void method3291(int arg0) {
        this.field2496[++this.field2498 - 1] = (byte) (arg0 + this.field2522.method3321());
    }

    @ObfuscatedName("gv.it(I)I")
    public int method3292() {
        return this.field2496[++this.field2498 - 1] - this.field2522.method3321() & 0xFF;
    }

    @ObfuscatedName("gv.id(I)Z")
    public boolean method3293() {
        int var1 = this.field2496[this.field2498] - this.field2522.method3329() & 0xFF;
        return var1 >= 128;
    }

    @ObfuscatedName("gv.in(B)I")
    public int method3294() {
        int var1 = this.field2496[++this.field2498 - 1] - this.field2522.method3321() & 0xFF;
        return var1 < 128 ? var1 : (var1 - 128 << 8) + (this.field2496[++this.field2498 - 1] - this.field2522.method3321() & 0xFF);
    }

    @ObfuscatedName("gv.iv(I)V")
    public void method3295() {
        this.field2523 = this.field2498 * 8;
    }

    @ObfuscatedName("gv.ir(II)I")
    public int method3296(int arg0) {
        int var2 = this.field2523 >> 3;
        int var3 = 8 - (this.field2523 & 0x7);
        int var4 = 0;
        this.field2523 += arg0;
        while (arg0 > var3) {
            var4 += (this.field2496[var2++] & field2520[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field2496[var2] & field2520[var3]) + var4;
        } else {
            var5 = (this.field2496[var2] >> var3 - arg0 & field2520[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("gv.ih(I)V")
    public void method3297() {
        this.field2498 = (this.field2523 + 7) / 8;
    }

    @ObfuscatedName("gv.ia(IB)I")
    public int method3305(int arg0) {
        return arg0 * 8 - this.field2523;
    }
}
