package deob;

@ObfuscatedName("fm")
public final class class167 extends class161 {

    @ObfuscatedName("fm.g")
    public class168 field2327;

    @ObfuscatedName("fm.z")
    public static final int[] field2324 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("fm.q")
    public int field2325;

    public class167(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("fm.hb([IB)V")
    public void method3009(int[] arg0) {
        this.field2327 = new class168(arg0);
    }

    @ObfuscatedName("fm.hw(II)V")
    public void method3010(int arg0) {
        this.field2291[++this.field2285 - 1] = (byte) (arg0 + this.field2327.method3036());
    }

    @ObfuscatedName("fm.hn(I)I")
    public int method3011() {
        return this.field2291[++this.field2285 - 1] - this.field2327.method3036() & 0xFF;
    }

    @ObfuscatedName("fm.hc(I)V")
    public void method3008() {
        this.field2325 = this.field2285 * 8;
    }

    @ObfuscatedName("fm.hg(II)I")
    public int method3013(int arg0) {
        int var2 = this.field2325 >> 3;
        int var3 = 8 - (this.field2325 & 0x7);
        int var4 = 0;
        this.field2325 += arg0;
        while (arg0 > var3) {
            var4 += (this.field2291[var2++] & field2324[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field2291[var2] & field2324[var3]) + var4;
        } else {
            var5 = (this.field2291[var2] >> var3 - arg0 & field2324[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("fm.hf(B)V")
    public void method3014() {
        this.field2285 = (this.field2325 + 7) / 8;
    }

    @ObfuscatedName("fm.hi(II)I")
    public int method3015(int arg0) {
        return arg0 * 8 - this.field2325;
    }
}
