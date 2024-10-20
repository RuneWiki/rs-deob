package deob;

@ObfuscatedName("gf")
public final class class202 extends class195 {

    @ObfuscatedName("gf.w")
    public class203 field2596;

    @ObfuscatedName("gf.r")
    public static final int[] field2594 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("gf.d")
    public int field2595;

    public class202(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("gf.iz([II)V")
    public void method3484(int[] arg0) {
        this.field2596 = new class203(arg0);
    }

    @ObfuscatedName("gf.ie(Lgr;I)V")
    public void method3512(class203 arg0) {
        this.field2596 = arg0;
    }

    @ObfuscatedName("gf.ix(II)V")
    public void method3486(int arg0) {
        this.field2567[++this.field2566 - 1] = (byte) (arg0 + this.field2596.method3519());
    }

    @ObfuscatedName("gf.ij(I)I")
    public int method3487() {
        return this.field2567[++this.field2566 - 1] - this.field2596.method3519() & 0xFF;
    }

    @ObfuscatedName("gf.id(I)Z")
    public boolean method3509() {
        int var1 = this.field2567[this.field2566] - this.field2596.method3520() & 0xFF;
        return var1 >= 128;
    }

    @ObfuscatedName("gf.it(B)I")
    public int method3488() {
        int var1 = this.field2567[++this.field2566 - 1] - this.field2596.method3519() & 0xFF;
        return var1 < 128 ? var1 : (var1 - 128 << 8) + (this.field2567[++this.field2566 - 1] - this.field2596.method3519() & 0xFF);
    }

    @ObfuscatedName("gf.iy(B)V")
    public void method3489() {
        this.field2595 = this.field2566 * 8;
    }

    @ObfuscatedName("gf.ia(II)I")
    public int method3497(int arg0) {
        int var2 = this.field2595 >> 3;
        int var3 = 8 - (this.field2595 & 0x7);
        int var4 = 0;
        this.field2595 += arg0;
        while (arg0 > var3) {
            var4 += (this.field2567[var2++] & field2594[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field2567[var2] & field2594[var3]) + var4;
        } else {
            var5 = (this.field2567[var2] >> var3 - arg0 & field2594[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("gf.ig(I)V")
    public void method3491() {
        this.field2566 = (this.field2595 + 7) / 8;
    }

    @ObfuscatedName("gf.io(II)I")
    public int method3492(int arg0) {
        return arg0 * 8 - this.field2595;
    }
}
