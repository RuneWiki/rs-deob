package deob;

@ObfuscatedName("fr")
public final class class180 extends class174 {

    @ObfuscatedName("fr.j")
    public class181 field2428;

    @ObfuscatedName("fr.k")
    public static final int[] field2427 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("fr.e")
    public int field2429;

    public class180(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("fr.hi([IS)V")
    public void method3104(int[] arg0) {
        this.field2428 = new class181(arg0);
    }

    @ObfuscatedName("fr.hh(IS)V")
    public void method3116(int arg0) {
        this.field2405[++this.field2399 - 1] = (byte) (arg0 + this.field2428.method3135());
    }

    @ObfuscatedName("fr.hs(B)I")
    public int method3106() {
        return this.field2405[++this.field2399 - 1] - this.field2428.method3135() & 0xFF;
    }

    @ObfuscatedName("fr.hc(I)V")
    public void method3129() {
        this.field2429 = this.field2399 * 8;
    }

    @ObfuscatedName("fr.hv(II)I")
    public int method3107(int arg0) {
        int var2 = this.field2429 >> 3;
        int var3 = 8 - (this.field2429 & 0x7);
        int var4 = 0;
        this.field2429 += arg0;
        while (arg0 > var3) {
            var4 += (this.field2405[var2++] & field2427[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field2405[var2] & field2427[var3]) + var4;
        } else {
            var5 = (this.field2405[var2] >> var3 - arg0 & field2427[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("fr.hq(I)V")
    public void method3103() {
        this.field2399 = (this.field2429 + 7) / 8;
    }

    @ObfuscatedName("fr.hr(II)I")
    public int method3109(int arg0) {
        return arg0 * 8 - this.field2429;
    }
}
