package deob;

@ObfuscatedName("fk")
public final class class180 extends class174 {

    @ObfuscatedName("fk.j")
    public class181 field2403;

    @ObfuscatedName("fk.q")
    public static final int[] field2405 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("fk.h")
    public int field2404;

    public class180(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("fk.ha([IS)V")
    public void method3120(int[] arg0) {
        this.field2403 = new class181(arg0);
    }

    @ObfuscatedName("fk.hg(II)V")
    public void method3121(int arg0) {
        this.field2373[++this.field2370 - 1] = (byte) (arg0 + this.field2403.method3151());
    }

    @ObfuscatedName("fk.hp(B)I")
    public int method3126() {
        return this.field2373[++this.field2370 - 1] - this.field2403.method3151() & 0xFF;
    }

    @ObfuscatedName("fk.ho(B)V")
    public void method3123() {
        this.field2404 = this.field2370 * 8;
    }

    @ObfuscatedName("fk.hb(II)I")
    public int method3141(int arg0) {
        int var2 = this.field2404 >> 3;
        int var3 = 8 - (this.field2404 & 0x7);
        int var4 = 0;
        this.field2404 += arg0;
        while (arg0 > var3) {
            var4 += (this.field2373[var2++] & field2405[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field2373[var2] & field2405[var3]) + var4;
        } else {
            var5 = (this.field2373[var2] >> var3 - arg0 & field2405[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("fk.hs(B)V")
    public void method3124() {
        this.field2370 = (this.field2404 + 7) / 8;
    }

    @ObfuscatedName("fk.hd(II)I")
    public int method3130(int arg0) {
        return arg0 * 8 - this.field2404;
    }
}
