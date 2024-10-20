package deob;

@ObfuscatedName("fv")
public final class class180 extends class174 {

    @ObfuscatedName("fv.p")
    public class181 field2389;

    @ObfuscatedName("fv.k")
    public static final int[] field2387 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("fv.r")
    public int field2390;

    public class180(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("fv.he([IB)V")
    public void method3095(int[] arg0) {
        this.field2389 = new class181(arg0);
    }

    @ObfuscatedName("fv.hx(IB)V")
    public void method3096(int arg0) {
        this.field2355[++this.field2357 - 1] = (byte) (arg0 + this.field2389.method3119());
    }

    @ObfuscatedName("fv.im(I)I")
    public int method3097() {
        return this.field2355[++this.field2357 - 1] - this.field2389.method3119() & 0xFF;
    }

    @ObfuscatedName("fv.ip(I)V")
    public void method3098() {
        this.field2390 = this.field2357 * 8;
    }

    @ObfuscatedName("fv.ie(II)I")
    public int method3108(int arg0) {
        int var2 = this.field2390 >> 3;
        int var3 = 8 - (this.field2390 & 0x7);
        int var4 = 0;
        this.field2390 += arg0;
        while (arg0 > var3) {
            var4 += (this.field2355[var2++] & field2387[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field2355[var2] & field2387[var3]) + var4;
        } else {
            var5 = (this.field2355[var2] >> var3 - arg0 & field2387[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("fv.ix(I)V")
    public void method3100() {
        this.field2357 = (this.field2390 + 7) / 8;
    }

    @ObfuscatedName("fv.ig(II)I")
    public int method3106(int arg0) {
        return arg0 * 8 - this.field2390;
    }
}
