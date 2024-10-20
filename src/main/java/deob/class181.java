package deob;

@ObfuscatedName("fo")
public final class class181 extends class175 {

    @ObfuscatedName("fo.w")
    public class182 field2419;

    @ObfuscatedName("fo.b")
    public static final int[] field2422 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("fo.o")
    public int field2421;

    public class181(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("fo.iw([II)V")
    public void method3146(int[] arg0) {
        this.field2419 = new class182(arg0);
    }

    @ObfuscatedName("fo.ia(II)V")
    public void method3139(int arg0) {
        this.field2390[++this.field2394 - 1] = (byte) (arg0 + this.field2419.method3161());
    }

    @ObfuscatedName("fo.io(B)I")
    public int method3140() {
        return this.field2390[++this.field2394 - 1] - this.field2419.method3161() & 0xFF;
    }

    @ObfuscatedName("fo.il(B)V")
    public void method3160() {
        this.field2421 = this.field2394 * 8;
    }

    @ObfuscatedName("fo.ip(II)I")
    public int method3142(int arg0) {
        int var2 = this.field2421 >> 3;
        int var3 = 8 - (this.field2421 & 0x7);
        int var4 = 0;
        this.field2421 += arg0;
        while (arg0 > var3) {
            var4 += (this.field2390[var2++] & field2422[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field2390[var2] & field2422[var3]) + var4;
        } else {
            var5 = (this.field2390[var2] >> var3 - arg0 & field2422[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("fo.is(I)V")
    public void method3143() {
        this.field2394 = (this.field2421 + 7) / 8;
    }

    @ObfuscatedName("fo.ii(II)I")
    public int method3144(int arg0) {
        return arg0 * 8 - this.field2421;
    }
}
