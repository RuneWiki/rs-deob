package deob;

@ObfuscatedName("fb")
public final class class180 extends class174 {

    @ObfuscatedName("fb.f")
    public class181 field2434;

    @ObfuscatedName("fb.n")
    public static final int[] field2435 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("fb.a")
    public int field2436;

    public class180(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("fb.hx([IB)V")
    public void method3104(int[] arg0) {
        this.field2434 = new class181(arg0);
    }

    @ObfuscatedName("fb.hg(II)V")
    public void method3105(int arg0) {
        this.field2415[++this.field2407 - 1] = (byte) (arg0 + this.field2434.method3124());
    }

    @ObfuscatedName("fb.hd(I)I")
    public int method3106() {
        return this.field2415[++this.field2407 - 1] - this.field2434.method3124() & 0xFF;
    }

    @ObfuscatedName("fb.hn(I)V")
    public void method3107() {
        this.field2436 = this.field2407 * 8;
    }

    @ObfuscatedName("fb.ip(II)I")
    public int method3115(int arg0) {
        int var2 = this.field2436 >> 3;
        int var3 = 8 - (this.field2436 & 0x7);
        int var4 = 0;
        this.field2436 += arg0;
        while (arg0 > var3) {
            var4 += (this.field2415[var2++] & field2435[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field2415[var2] & field2435[var3]) + var4;
        } else {
            var5 = (this.field2415[var2] >> var3 - arg0 & field2435[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("fb.iw(B)V")
    public void method3109() {
        this.field2407 = (this.field2436 + 7) / 8;
    }

    @ObfuscatedName("fb.ia(II)I")
    public int method3110(int arg0) {
        return arg0 * 8 - this.field2436;
    }
}
