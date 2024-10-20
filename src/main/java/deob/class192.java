package deob;

@ObfuscatedName("gh")
public final class class192 extends class185 {

    @ObfuscatedName("gh.s")
    public class193 field2434;

    @ObfuscatedName("gh.g")
    public static final int[] field2432 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("gh.a")
    public int field2433;

    public class192(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("gh.ih([IB)V")
    public void method3588(int[] arg0) {
        this.field2434 = new class193(arg0);
    }

    @ObfuscatedName("gh.ie(Lgo;I)V")
    public void method3583(class193 arg0) {
        this.field2434 = arg0;
    }

    @ObfuscatedName("gh.iq(II)V")
    public void method3584(int arg0) {
        this.field2399[++this.field2397 - 1] = (byte) (arg0 + this.field2434.method3619());
    }

    @ObfuscatedName("gh.is(B)I")
    public int method3589() {
        return this.field2399[++this.field2397 - 1] - this.field2434.method3619() & 0xFF;
    }

    @ObfuscatedName("gh.ip(I)Z")
    public boolean method3596() {
        int var1 = this.field2399[this.field2397] - this.field2434.method3620() & 0xFF;
        return var1 >= 128;
    }

    @ObfuscatedName("gh.iz(I)I")
    public int method3607() {
        int var1 = this.field2399[++this.field2397 - 1] - this.field2434.method3619() & 0xFF;
        return var1 < 128 ? var1 : (var1 - 128 << 8) + (this.field2399[++this.field2397 - 1] - this.field2434.method3619() & 0xFF);
    }

    @ObfuscatedName("gh.it([BIII)V")
    public void method3617(byte[] arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < arg2; var4++) {
            arg0[arg1 + var4] = (byte) (this.field2399[++this.field2397 - 1] - this.field2434.method3619());
        }
    }

    @ObfuscatedName("gh.ib(I)V")
    public void method3586() {
        this.field2433 = this.field2397 * 8;
    }

    @ObfuscatedName("gh.id(II)I")
    public int method3590(int arg0) {
        int var2 = this.field2433 >> 3;
        int var3 = 8 - (this.field2433 & 0x7);
        int var4 = 0;
        this.field2433 += arg0;
        while (arg0 > var3) {
            var4 += (this.field2399[var2++] & field2432[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field2399[var2] & field2432[var3]) + var4;
        } else {
            var5 = (this.field2399[var2] >> var3 - arg0 & field2432[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("gh.ic(I)V")
    public void method3587() {
        this.field2397 = (this.field2433 + 7) / 8;
    }

    @ObfuscatedName("gh.ix(II)I")
    public int method3592(int arg0) {
        return arg0 * 8 - this.field2433;
    }
}
