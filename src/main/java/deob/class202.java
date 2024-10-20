package deob;

@ObfuscatedName("gb")
public final class class202 extends class195 {

    @ObfuscatedName("gb.p")
    public class203 field2608;

    @ObfuscatedName("gb.x")
    public static final int[] field2609 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("gb.m")
    public int field2610;

    public class202(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("gb.js([II)V")
    public void method3539(int[] arg0) {
        this.field2608 = new class203(arg0);
    }

    @ObfuscatedName("gb.jv(Lgc;B)V")
    public void method3540(class203 arg0) {
        this.field2608 = arg0;
    }

    @ObfuscatedName("gb.jj(II)V")
    public void method3549(int arg0) {
        this.field2569[++this.field2568 - 1] = (byte) (arg0 + this.field2608.method3576());
    }

    @ObfuscatedName("gb.jh(B)I")
    public int method3541() {
        return this.field2569[++this.field2568 - 1] - this.field2608.method3576() & 0xFF;
    }

    @ObfuscatedName("gb.jp(I)Z")
    public boolean method3542() {
        int var1 = this.field2569[this.field2568] - this.field2608.method3587() & 0xFF;
        return var1 >= 128;
    }

    @ObfuscatedName("gb.jo(B)I")
    public int method3543() {
        int var1 = this.field2569[++this.field2568 - 1] - this.field2608.method3576() & 0xFF;
        return var1 < 128 ? var1 : (var1 - 128 << 8) + (this.field2569[++this.field2568 - 1] - this.field2608.method3576() & 0xFF);
    }

    @ObfuscatedName("gb.jw(I)V")
    public void method3544() {
        this.field2610 = this.field2568 * 8;
    }

    @ObfuscatedName("gb.jr(IB)I")
    public int method3545(int arg0) {
        int var2 = this.field2610 >> 3;
        int var3 = 8 - (this.field2610 & 0x7);
        int var4 = 0;
        this.field2610 += arg0;
        while (arg0 > var3) {
            var4 += (this.field2569[var2++] & field2609[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field2569[var2] & field2609[var3]) + var4;
        } else {
            var5 = (this.field2569[var2] >> var3 - arg0 & field2609[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("gb.ju(B)V")
    public void method3546() {
        this.field2568 = (this.field2610 + 7) / 8;
    }

    @ObfuscatedName("gb.jq(II)I")
    public int method3547(int arg0) {
        return arg0 * 8 - this.field2610;
    }
}
