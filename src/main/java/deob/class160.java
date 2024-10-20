package deob;

@ObfuscatedName("fr")
public final class class160 extends class154 {

    @ObfuscatedName("fr.b")
    public class161 field2137;

    @ObfuscatedName("fr.x")
    public static final int[] field2136 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("fr.r")
    public int field2135;

    public class160(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("fr.hm([IS)V")
    public void method2774(int[] arg0) {
        this.field2137 = new class161(arg0);
    }

    @ObfuscatedName("fr.hk(II)V")
    public void method2775(int arg0) {
        this.field2100[++this.field2098 - 1] = (byte) (arg0 + this.field2137.method2795());
    }

    @ObfuscatedName("fr.hj(I)I")
    public int method2776() {
        return this.field2100[++this.field2098 - 1] - this.field2137.method2795() & 0xFF;
    }

    @ObfuscatedName("fr.ha(S)V")
    public void method2794() {
        this.field2135 = this.field2098 * 8;
    }

    @ObfuscatedName("fr.he(II)I")
    public int method2785(int arg0) {
        int var2 = this.field2135 >> 3;
        int var3 = 8 - (this.field2135 & 0x7);
        int var4 = 0;
        this.field2135 += arg0;
        while (arg0 > var3) {
            var4 += (this.field2100[var2++] & field2136[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field2100[var2] & field2136[var3]) + var4;
        } else {
            var5 = (this.field2100[var2] >> var3 - arg0 & field2136[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("fr.hq(I)V")
    public void method2779() {
        this.field2098 = (this.field2135 + 7) / 8;
    }

    @ObfuscatedName("fr.hs(II)I")
    public int method2780(int arg0) {
        return arg0 * 8 - this.field2135;
    }
}
