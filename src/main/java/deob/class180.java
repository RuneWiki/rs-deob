package deob;

@ObfuscatedName("fy")
public final class class180 extends class174 {

    @ObfuscatedName("fy.i")
    public class181 field2393;

    @ObfuscatedName("fy.r")
    public static final int[] field2392 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("fy.g")
    public int field2394;

    public class180(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("fy.hy([II)V")
    public void method3132(int[] arg0) {
        this.field2393 = new class181(arg0);
    }

    @ObfuscatedName("fy.hf(II)V")
    public void method3133(int arg0) {
        this.field2367[++this.field2364 - 1] = (byte) (arg0 + this.field2393.method3164());
    }

    @ObfuscatedName("fy.ho(I)I")
    public int method3134() {
        return this.field2367[++this.field2364 - 1] - this.field2393.method3164() & 0xFF;
    }

    @ObfuscatedName("fy.hx(B)V")
    public void method3135() {
        this.field2394 = this.field2364 * 8;
    }

    @ObfuscatedName("fy.hn(II)I")
    public int method3136(int arg0) {
        int var2 = this.field2394 >> 3;
        int var3 = 8 - (this.field2394 & 0x7);
        int var4 = 0;
        this.field2394 += arg0;
        while (arg0 > var3) {
            var4 += (this.field2367[var2++] & field2392[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field2367[var2] & field2392[var3]) + var4;
        } else {
            var5 = (this.field2367[var2] >> var3 - arg0 & field2392[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("fy.hi(I)V")
    public void method3137() {
        this.field2364 = (this.field2394 + 7) / 8;
    }

    @ObfuscatedName("fy.hq(II)I")
    public int method3156(int arg0) {
        return arg0 * 8 - this.field2394;
    }
}
