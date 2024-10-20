package deob;

@ObfuscatedName("gt")
public final class class191 extends class185 {

    @ObfuscatedName("gt.z")
    public class192 field2538;

    @ObfuscatedName("gt.k")
    public static final int[] field2536 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("gt.c")
    public int field2537;

    public class191(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("gt.jo([II)V")
    public void method3536(int[] arg0) {
        this.field2538 = new class192(arg0);
    }

    @ObfuscatedName("gt.jv(Lgo;B)V")
    public void method3531(class192 arg0) {
        this.field2538 = arg0;
    }

    @ObfuscatedName("gt.jm(II)V")
    public void method3532(int arg0) {
        this.field2512[++this.field2514 - 1] = (byte) (arg0 + this.field2538.method3582());
    }

    @ObfuscatedName("gt.je(I)I")
    public int method3533() {
        return this.field2512[++this.field2514 - 1] - this.field2538.method3582() & 0xFF;
    }

    @ObfuscatedName("gt.jn(I)Z")
    public boolean method3534() {
        int var1 = this.field2512[this.field2514] - this.field2538.method3570() & 0xFF;
        return var1 >= 128;
    }

    @ObfuscatedName("gt.jq(B)I")
    public int method3559() {
        int var1 = this.field2512[++this.field2514 - 1] - this.field2538.method3582() & 0xFF;
        return var1 < 128 ? var1 : (var1 - 128 << 8) + (this.field2512[++this.field2514 - 1] - this.field2538.method3582() & 0xFF);
    }

    @ObfuscatedName("gt.jr(I)V")
    public void method3558() {
        this.field2537 = this.field2514 * 8;
    }

    @ObfuscatedName("gt.jj(II)I")
    public int method3538(int arg0) {
        int var2 = this.field2537 >> 3;
        int var3 = 8 - (this.field2537 & 0x7);
        int var4 = 0;
        this.field2537 += arg0;
        while (arg0 > var3) {
            var4 += (this.field2512[var2++] & field2536[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field2512[var2] & field2536[var3]) + var4;
        } else {
            var5 = (this.field2512[var2] >> var3 - arg0 & field2536[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("gt.jb(I)V")
    public void method3535() {
        this.field2514 = (this.field2537 + 7) / 8;
    }

    @ObfuscatedName("gt.jz(II)I")
    public int method3539(int arg0) {
        return arg0 * 8 - this.field2537;
    }
}
