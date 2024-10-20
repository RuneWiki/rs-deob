package deob;

@ObfuscatedName("ft")
public final class class167 extends class161 {

    @ObfuscatedName("ft.n")
    public class168 field2293;

    @ObfuscatedName("ft.c")
    public static final int[] field2296 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("ft.s")
    public int field2294;

    public class167(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("ft.iw([II)V")
    public void method2972(int[] arg0) {
        this.field2293 = new class168(arg0);
    }

    @ObfuscatedName("ft.ix(II)V")
    public void method2993(int arg0) {
        this.field2258[++this.field2267 - 1] = (byte) (arg0 + this.field2293.method3002());
    }

    @ObfuscatedName("ft.il(I)I")
    public int method2988() {
        return this.field2258[++this.field2267 - 1] - this.field2293.method3002() & 0xFF;
    }

    @ObfuscatedName("ft.if(I)V")
    public void method2973() {
        this.field2294 = this.field2267 * 8;
    }

    @ObfuscatedName("ft.id(II)I")
    public int method2974(int arg0) {
        int var2 = this.field2294 >> 3;
        int var3 = 8 - (this.field2294 & 0x7);
        int var4 = 0;
        this.field2294 += arg0;
        while (arg0 > var3) {
            var4 += (this.field2258[var2++] & field2296[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field2258[var2] & field2296[var3]) + var4;
        } else {
            var5 = (this.field2258[var2] >> var3 - arg0 & field2296[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("ft.ia(B)V")
    public void method2975() {
        this.field2267 = (this.field2294 + 7) / 8;
    }

    @ObfuscatedName("ft.io(II)I")
    public int method2976(int arg0) {
        return arg0 * 8 - this.field2294;
    }
}
