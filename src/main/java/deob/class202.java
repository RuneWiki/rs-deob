package deob;

@ObfuscatedName("gz")
public final class class202 extends class195 {

    @ObfuscatedName("gz.p")
    public class203 field2588;

    @ObfuscatedName("gz.g")
    public static final int[] field2586 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("gz.n")
    public int field2587;

    public class202(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("gz.iz([IB)V")
    public void method3508(int[] arg0) {
        this.field2588 = new class203(arg0);
    }

    @ObfuscatedName("gz.il(Lgv;I)V")
    public void method3492(class203 arg0) {
        this.field2588 = arg0;
    }

    @ObfuscatedName("gz.iu(IB)V")
    public void method3493(int arg0) {
        this.field2544[++this.field2545 - 1] = (byte) (arg0 + this.field2588.method3530());
    }

    @ObfuscatedName("gz.in(I)I")
    public int method3495() {
        return this.field2544[++this.field2545 - 1] - this.field2588.method3530() & 0xFF;
    }

    @ObfuscatedName("gz.ia(B)Z")
    public boolean method3494() {
        int var1 = this.field2544[this.field2545] - this.field2588.method3531() & 0xFF;
        return var1 >= 128;
    }

    @ObfuscatedName("gz.jk(B)I")
    public int method3515() {
        int var1 = this.field2544[++this.field2545 - 1] - this.field2588.method3530() & 0xFF;
        return var1 < 128 ? var1 : (var1 - 128 << 8) + (this.field2544[++this.field2545 - 1] - this.field2588.method3530() & 0xFF);
    }

    @ObfuscatedName("gz.jc(I)V")
    public void method3510() {
        this.field2587 = this.field2545 * 8;
    }

    @ObfuscatedName("gz.jt(II)I")
    public int method3497(int arg0) {
        int var2 = this.field2587 >> 3;
        int var3 = 8 - (this.field2587 & 0x7);
        int var4 = 0;
        this.field2587 += arg0;
        while (arg0 > var3) {
            var4 += (this.field2544[var2++] & field2586[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field2544[var2] & field2586[var3]) + var4;
        } else {
            var5 = (this.field2544[var2] >> var3 - arg0 & field2586[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("gz.ju(I)V")
    public void method3498() {
        this.field2545 = (this.field2587 + 7) / 8;
    }

    @ObfuscatedName("gz.jg(IB)I")
    public int method3499(int arg0) {
        return arg0 * 8 - this.field2587;
    }
}
