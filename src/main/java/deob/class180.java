package deob;

@ObfuscatedName("fe")
public final class class180 extends class174 {

    @ObfuscatedName("fe.h")
    public class181 field2431;

    @ObfuscatedName("fe.g")
    public static final int[] field2429 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("fe.e")
    public int field2432;

    public class180(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("fe.hw([II)V")
    public void method3146(int[] arg0) {
        this.field2431 = new class181(arg0);
    }

    @ObfuscatedName("fe.hc(IB)V")
    public void method3159(int arg0) {
        this.field2401[++this.field2400 - 1] = (byte) (arg0 + this.field2431.method3165());
    }

    @ObfuscatedName("fe.hm(I)I")
    public int method3148() {
        return this.field2401[++this.field2400 - 1] - this.field2431.method3165() & 0xFF;
    }

    @ObfuscatedName("fe.hf(I)V")
    public void method3149() {
        this.field2432 = this.field2400 * 8;
    }

    @ObfuscatedName("fe.hg(IS)I")
    public int method3150(int arg0) {
        int var2 = this.field2432 >> 3;
        int var3 = 8 - (this.field2432 & 0x7);
        int var4 = 0;
        this.field2432 += arg0;
        while (arg0 > var3) {
            var4 += (this.field2401[var2++] & field2429[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field2401[var2] & field2429[var3]) + var4;
        } else {
            var5 = (this.field2401[var2] >> var3 - arg0 & field2429[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("fe.hn(B)V")
    public void method3151() {
        this.field2400 = (this.field2432 + 7) / 8;
    }

    @ObfuscatedName("fe.hs(II)I")
    public int method3145(int arg0) {
        return arg0 * 8 - this.field2432;
    }
}
