package deob;

@ObfuscatedName("ff")
public final class class180 extends class174 {

    @ObfuscatedName("ff.w")
    public class181 field2422;

    @ObfuscatedName("ff.p")
    public static final int[] field2419 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("ff.m")
    public int field2420;

    public class180(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("ff.hs([II)V")
    public void method3110(int[] arg0) {
        this.field2422 = new class181(arg0);
    }

    @ObfuscatedName("ff.in(II)V")
    public void method3136(int arg0) {
        this.field2391[++this.field2394 - 1] = (byte) (arg0 + this.field2422.method3145());
    }

    @ObfuscatedName("ff.if(I)I")
    public int method3112() {
        return this.field2391[++this.field2394 - 1] - this.field2422.method3145() & 0xFF;
    }

    @ObfuscatedName("ff.il(I)V")
    public void method3115() {
        this.field2420 = this.field2394 * 8;
    }

    @ObfuscatedName("ff.ig(II)I")
    public int method3122(int arg0) {
        int var2 = this.field2420 >> 3;
        int var3 = 8 - (this.field2420 & 0x7);
        int var4 = 0;
        this.field2420 += arg0;
        while (arg0 > var3) {
            var4 += (this.field2391[var2++] & field2419[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field2391[var2] & field2419[var3]) + var4;
        } else {
            var5 = (this.field2391[var2] >> var3 - arg0 & field2419[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("ff.iw(B)V")
    public void method3114() {
        this.field2394 = (this.field2420 + 7) / 8;
    }

    @ObfuscatedName("ff.iu(II)I")
    public int method3120(int arg0) {
        return arg0 * 8 - this.field2420;
    }
}
