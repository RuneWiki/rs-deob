package deob;

@ObfuscatedName("gs")
public final class class202 extends class195 {

    @ObfuscatedName("gs.u")
    public class203 field2604;

    @ObfuscatedName("gs.x")
    public static final int[] field2603 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("gs.y")
    public int field2605;

    public class202(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("gs.ic([II)V")
    public void method3457(int[] arg0) {
        this.field2604 = new class203(arg0);
    }

    @ObfuscatedName("gs.ii(Lgx;I)V")
    public void method3458(class203 arg0) {
        this.field2604 = arg0;
    }

    @ObfuscatedName("gs.it(II)V")
    public void method3459(int arg0) {
        this.field2574[++this.field2575 - 1] = (byte) (arg0 + this.field2604.method3491());
    }

    @ObfuscatedName("gs.in(I)I")
    public int method3460() {
        return this.field2574[++this.field2575 - 1] - this.field2604.method3491() & 0xFF;
    }

    @ObfuscatedName("gs.im(B)Z")
    public boolean method3461() {
        int var1 = this.field2574[this.field2575] - this.field2604.method3494() & 0xFF;
        return var1 >= 128;
    }

    @ObfuscatedName("gs.ir(I)I")
    public int method3464() {
        int var1 = this.field2574[++this.field2575 - 1] - this.field2604.method3491() & 0xFF;
        return var1 < 128 ? var1 : (var1 - 128 << 8) + (this.field2574[++this.field2575 - 1] - this.field2604.method3491() & 0xFF);
    }

    @ObfuscatedName("gs.iu(I)V")
    public void method3463() {
        this.field2605 = this.field2575 * 8;
    }

    @ObfuscatedName("gs.iv(II)I")
    public int method3477(int arg0) {
        int var2 = this.field2605 >> 3;
        int var3 = 8 - (this.field2605 & 0x7);
        int var4 = 0;
        this.field2605 += arg0;
        while (arg0 > var3) {
            var4 += (this.field2574[var2++] & field2603[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field2574[var2] & field2603[var3]) + var4;
        } else {
            var5 = (this.field2574[var2] >> var3 - arg0 & field2603[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("gs.il(I)V")
    public void method3465() {
        this.field2575 = (this.field2605 + 7) / 8;
    }

    @ObfuscatedName("gs.ia(IS)I")
    public int method3466(int arg0) {
        return arg0 * 8 - this.field2605;
    }
}
