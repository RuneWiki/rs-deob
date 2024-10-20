package deob;

@ObfuscatedName("fg")
public final class class160 extends class154 {

    @ObfuscatedName("fg.o")
    public class161 field2124;

    @ObfuscatedName("fg.a")
    public static final int[] field2125 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("fg.c")
    public int field2126;

    public class160(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("fg.hw([IB)V")
    public void method2805(int[] arg0) {
        this.field2124 = new class161(arg0);
    }

    @ObfuscatedName("fg.hq(II)V")
    public void method2804(int arg0) {
        this.field2092[++this.field2098 - 1] = (byte) (arg0 + this.field2124.method2833());
    }

    @ObfuscatedName("fg.hb(I)I")
    public int method2807() {
        return this.field2092[++this.field2098 - 1] - this.field2124.method2833() & 0xFF;
    }

    @ObfuscatedName("fg.hl(I)V")
    public void method2821() {
        this.field2126 = this.field2098 * 8;
    }

    @ObfuscatedName("fg.ho(II)I")
    public int method2828(int arg0) {
        int var2 = this.field2126 >> 3;
        int var3 = 8 - (this.field2126 & 0x7);
        int var4 = 0;
        this.field2126 += arg0;
        while (arg0 > var3) {
            var4 += (this.field2092[var2++] & field2125[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field2092[var2] & field2125[var3]) + var4;
        } else {
            var5 = (this.field2092[var2] >> var3 - arg0 & field2125[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("fg.hs(I)V")
    public void method2810() {
        this.field2098 = (this.field2126 + 7) / 8;
    }

    @ObfuscatedName("fg.hu(IB)I")
    public int method2811(int arg0) {
        return arg0 * 8 - this.field2126;
    }
}
