package deob;

@ObfuscatedName("gd")
public final class class191 extends class185 {

    @ObfuscatedName("gd.m")
    public class192 field2515;

    @ObfuscatedName("gd.h")
    public static final int[] field2511 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("gd.o")
    public int field2512;

    public class191(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("gd.hx([IB)V")
    public void method3364(int[] arg0) {
        this.field2515 = new class192(arg0);
    }

    @ObfuscatedName("gd.he(Lgo;I)V")
    public void method3377(class192 arg0) {
        this.field2515 = arg0;
    }

    @ObfuscatedName("gd.ha(II)V")
    public void method3366(int arg0) {
        this.field2491[++this.field2488 - 1] = (byte) (arg0 + this.field2515.method3394());
    }

    @ObfuscatedName("gd.hy(B)I")
    public int method3367() {
        return this.field2491[++this.field2488 - 1] - this.field2515.method3394() & 0xFF;
    }

    @ObfuscatedName("gd.ht(I)Z")
    public boolean method3368() {
        int var1 = this.field2491[this.field2488] - this.field2515.method3395() & 0xFF;
        return var1 >= 128;
    }

    @ObfuscatedName("gd.im(B)I")
    public int method3383() {
        int var1 = this.field2491[++this.field2488 - 1] - this.field2515.method3394() & 0xFF;
        return var1 < 128 ? var1 : (var1 - 128 << 8) + (this.field2491[++this.field2488 - 1] - this.field2515.method3394() & 0xFF);
    }

    @ObfuscatedName("gd.iq(B)V")
    public void method3380() {
        this.field2512 = this.field2488 * 8;
    }

    @ObfuscatedName("gd.ii(IB)I")
    public int method3371(int arg0) {
        int var2 = this.field2512 >> 3;
        int var3 = 8 - (this.field2512 & 0x7);
        int var4 = 0;
        this.field2512 += arg0;
        while (arg0 > var3) {
            var4 += (this.field2491[var2++] & field2511[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field2491[var2] & field2511[var3]) + var4;
        } else {
            var5 = (this.field2491[var2] >> var3 - arg0 & field2511[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("gd.ig(I)V")
    public void method3372() {
        this.field2488 = (this.field2512 + 7) / 8;
    }

    @ObfuscatedName("gd.iv(II)I")
    public int method3373(int arg0) {
        return arg0 * 8 - this.field2512;
    }
}
