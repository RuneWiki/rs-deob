package deob;

@ObfuscatedName("gz")
public final class class192 extends class185 {

    @ObfuscatedName("gz.l")
    public class193 field2414;

    @ObfuscatedName("gz.b")
    public static final int[] field2415 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("gz.c")
    public int field2416;

    public class192(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("gz.ia([IB)V")
    public void method3541(int[] arg0) {
        this.field2414 = new class193(arg0);
    }

    @ObfuscatedName("gz.iy(Lgu;B)V")
    public void method3540(class193 arg0) {
        this.field2414 = arg0;
    }

    @ObfuscatedName("gz.ie(II)V")
    public void method3556(int arg0) {
        this.field2387[++this.field2386 - 1] = (byte) (arg0 + this.field2414.method3578());
    }

    @ObfuscatedName("gz.iv(I)I")
    public int method3542() {
        return this.field2387[++this.field2386 - 1] - this.field2414.method3578() & 0xFF;
    }

    @ObfuscatedName("gz.iw(I)Z")
    public boolean method3545() {
        int var1 = this.field2387[this.field2386] - this.field2414.method3583() & 0xFF;
        return var1 >= 128;
    }

    @ObfuscatedName("gz.ii(B)I")
    public int method3562() {
        int var1 = this.field2387[++this.field2386 - 1] - this.field2414.method3578() & 0xFF;
        return var1 < 128 ? var1 : (var1 - 128 << 8) + (this.field2387[++this.field2386 - 1] - this.field2414.method3578() & 0xFF);
    }

    @ObfuscatedName("gz.im(I)V")
    public void method3547() {
        this.field2416 = this.field2386 * 8;
    }

    @ObfuscatedName("gz.iu(IS)I")
    public int method3548(int arg0) {
        int var2 = this.field2416 >> 3;
        int var3 = 8 - (this.field2416 & 0x7);
        int var4 = 0;
        this.field2416 += arg0;
        while (arg0 > var3) {
            var4 += (this.field2387[var2++] & field2415[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field2387[var2] & field2415[var3]) + var4;
        } else {
            var5 = (this.field2387[var2] >> var3 - arg0 & field2415[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("gz.it(I)V")
    public void method3549() {
        this.field2386 = (this.field2416 + 7) / 8;
    }

    @ObfuscatedName("gz.if(II)I")
    public int method3550(int arg0) {
        return arg0 * 8 - this.field2416;
    }
}
