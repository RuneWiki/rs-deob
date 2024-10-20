package deob;

@ObfuscatedName("fg")
public final class class180 extends class174 {

    @ObfuscatedName("fg.d")
    public class181 field2416;

    @ObfuscatedName("fg.x")
    public static final int[] field2417 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("fg.z")
    public int field2415;

    public class180(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("fg.ib([II)V")
    public void method3235(int[] arg0) {
        this.field2416 = new class181(arg0);
    }

    @ObfuscatedName("fg.io(II)V")
    public void method3236(int arg0) {
        this.field2389[++this.field2390 - 1] = (byte) (arg0 + this.field2416.method3257());
    }

    @ObfuscatedName("fg.ir(I)I")
    public int method3237() {
        return this.field2389[++this.field2390 - 1] - this.field2416.method3257() & 0xFF;
    }

    @ObfuscatedName("fg.iy(B)V")
    public void method3238() {
        this.field2415 = this.field2390 * 8;
    }

    @ObfuscatedName("fg.ik(II)I")
    public int method3239(int arg0) {
        int var2 = this.field2415 >> 3;
        int var3 = 8 - (this.field2415 & 0x7);
        int var4 = 0;
        this.field2415 += arg0;
        while (arg0 > var3) {
            var4 += (this.field2389[var2++] & field2417[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field2389[var2] & field2417[var3]) + var4;
        } else {
            var5 = (this.field2389[var2] >> var3 - arg0 & field2417[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("fg.ie(I)V")
    public void method3255() {
        this.field2390 = (this.field2415 + 7) / 8;
    }

    @ObfuscatedName("fg.in(II)I")
    public int method3241(int arg0) {
        return arg0 * 8 - this.field2415;
    }
}
