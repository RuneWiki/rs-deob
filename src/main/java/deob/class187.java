package deob;

@ObfuscatedName("gi")
public final class class187 extends class181 {

    @ObfuscatedName("gi.b")
    public class188 field2522;

    @ObfuscatedName("gi.n")
    public static final int[] field2523 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("gi.c")
    public int field2521;

    public class187(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("gi.ih([II)V")
    public void method3279(int[] arg0) {
        this.field2522 = new class188(arg0);
    }

    @ObfuscatedName("gi.iy(Lga;B)V")
    public void method3280(class188 arg0) {
        this.field2522 = arg0;
    }

    @ObfuscatedName("gi.ix(II)V")
    public void method3273(int arg0) {
        this.field2499[++this.field2498 - 1] = (byte) (arg0 + this.field2522.method3311());
    }

    @ObfuscatedName("gi.ic(I)I")
    public int method3293() {
        return this.field2499[++this.field2498 - 1] - this.field2522.method3311() & 0xFF;
    }

    @ObfuscatedName("gi.ia(I)Z")
    public boolean method3275() {
        int var1 = this.field2499[this.field2498] - this.field2522.method3313() & 0xFF;
        return var1 >= 128;
    }

    @ObfuscatedName("gi.it(I)I")
    public int method3276() {
        int var1 = this.field2499[++this.field2498 - 1] - this.field2522.method3311() & 0xFF;
        return var1 < 128 ? var1 : (var1 - 128 << 8) + (this.field2499[++this.field2498 - 1] - this.field2522.method3311() & 0xFF);
    }

    @ObfuscatedName("gi.if(B)V")
    public void method3277() {
        this.field2521 = this.field2498 * 8;
    }

    @ObfuscatedName("gi.ie(II)I")
    public int method3278(int arg0) {
        int var2 = this.field2521 >> 3;
        int var3 = 8 - (this.field2521 & 0x7);
        int var4 = 0;
        this.field2521 += arg0;
        while (arg0 > var3) {
            var4 += (this.field2499[var2++] & field2523[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field2499[var2] & field2523[var3]) + var4;
        } else {
            var5 = (this.field2499[var2] >> var3 - arg0 & field2523[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("gi.io(I)V")
    public void method3296() {
        this.field2498 = (this.field2521 + 7) / 8;
    }

    @ObfuscatedName("gi.iv(IS)I")
    public int method3274(int arg0) {
        return arg0 * 8 - this.field2521;
    }
}
