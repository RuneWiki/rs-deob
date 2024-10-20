package deob;

@ObfuscatedName("gi")
public final class class190 extends class183 {

    @ObfuscatedName("gi.x")
    public class191 field2374;

    @ObfuscatedName("gi.e")
    public static final int[] field2375 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("gi.p")
    public int field2376;

    public class190(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("gi.ig([II)V")
    public void method3528(int[] arg0) {
        this.field2374 = new class191(arg0);
    }

    @ObfuscatedName("gi.ir(Lgs;B)V")
    public void method3530(class191 arg0) {
        this.field2374 = arg0;
    }

    @ObfuscatedName("gi.iv(IB)V")
    public void method3511(int arg0) {
        this.field2339[++this.field2340 - 1] = (byte) (arg0 + this.field2374.method3542());
    }

    @ObfuscatedName("gi.ic(I)I")
    public int method3512() {
        return this.field2339[++this.field2340 - 1] - this.field2374.method3542() & 0xFF;
    }

    @ObfuscatedName("gi.ia(I)Z")
    public boolean method3513() {
        int var1 = this.field2339[this.field2340] - this.field2374.method3545() & 0xFF;
        return var1 >= 128;
    }

    @ObfuscatedName("gi.in(I)I")
    public int method3533() {
        int var1 = this.field2339[++this.field2340 - 1] - this.field2374.method3542() & 0xFF;
        return var1 < 128 ? var1 : (var1 - 128 << 8) + (this.field2339[++this.field2340 - 1] - this.field2374.method3542() & 0xFF);
    }

    @ObfuscatedName("gi.is(I)V")
    public void method3515() {
        this.field2376 = this.field2340 * 8;
    }

    @ObfuscatedName("gi.iu(II)I")
    public int method3509(int arg0) {
        int var2 = this.field2376 >> 3;
        int var3 = 8 - (this.field2376 & 0x7);
        int var4 = 0;
        this.field2376 += arg0;
        while (arg0 > var3) {
            var4 += (this.field2339[var2++] & field2375[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field2339[var2] & field2375[var3]) + var4;
        } else {
            var5 = (this.field2339[var2] >> var3 - arg0 & field2375[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("gi.it(I)V")
    public void method3508() {
        this.field2340 = (this.field2376 + 7) / 8;
    }

    @ObfuscatedName("gi.ie(II)I")
    public int method3517(int arg0) {
        return arg0 * 8 - this.field2376;
    }
}
