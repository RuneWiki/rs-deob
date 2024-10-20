package deob;

@ObfuscatedName("fb")
public final class class181 extends class175 {

    @ObfuscatedName("fb.r")
    public class182 field2408;

    @ObfuscatedName("fb.u")
    public static final int[] field2406 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("fb.d")
    public int field2407;

    public class181(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("fb.hv([II)V")
    public void method3153(int[] arg0) {
        this.field2408 = new class182(arg0);
    }

    @ObfuscatedName("fb.hy(IB)V")
    public void method3154(int arg0) {
        this.field2376[++this.field2381 - 1] = (byte) (arg0 + this.field2408.method3175());
    }

    @ObfuscatedName("fb.hr(I)I")
    public int method3155() {
        return this.field2376[++this.field2381 - 1] - this.field2408.method3175() & 0xFF;
    }

    @ObfuscatedName("fb.hd(I)V")
    public void method3152() {
        this.field2407 = this.field2381 * 8;
    }

    @ObfuscatedName("fb.hw(II)I")
    public int method3157(int arg0) {
        int var2 = this.field2407 >> 3;
        int var3 = 8 - (this.field2407 & 0x7);
        int var4 = 0;
        this.field2407 += arg0;
        while (arg0 > var3) {
            var4 += (this.field2376[var2++] & field2406[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field2376[var2] & field2406[var3]) + var4;
        } else {
            var5 = (this.field2376[var2] >> var3 - arg0 & field2406[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("fb.hx(B)V")
    public void method3158() {
        this.field2381 = (this.field2407 + 7) / 8;
    }

    @ObfuscatedName("fb.hl(II)I")
    public int method3172(int arg0) {
        return arg0 * 8 - this.field2407;
    }
}
