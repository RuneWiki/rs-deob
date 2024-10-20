package deob;

@ObfuscatedName("gr")
public final class class191 extends class185 {

    @ObfuscatedName("gr.e")
    public class192 field2555;

    @ObfuscatedName("gr.f")
    public static final int[] field2553 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("gr.z")
    public int field2554;

    public class191(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("gr.ii([IB)V")
    public void method3280(int[] arg0) {
        this.field2555 = new class192(arg0);
    }

    @ObfuscatedName("gr.id(Lgz;I)V")
    public void method3283(class192 arg0) {
        this.field2555 = arg0;
    }

    @ObfuscatedName("gr.iq(II)V")
    public void method3307(int arg0) {
        this.field2528[++this.field2529 - 1] = (byte) (arg0 + this.field2555.method3313());
    }

    @ObfuscatedName("gr.it(I)I")
    public int method3282() {
        return this.field2528[++this.field2529 - 1] - this.field2555.method3313() & 0xFF;
    }

    @ObfuscatedName("gr.il(I)Z")
    public boolean method3288() {
        int var1 = this.field2528[this.field2529] - this.field2555.method3314() & 0xFF;
        return var1 >= 128;
    }

    @ObfuscatedName("gr.ij(S)I")
    public int method3284() {
        int var1 = this.field2528[++this.field2529 - 1] - this.field2555.method3313() & 0xFF;
        return var1 < 128 ? var1 : (var1 - 128 << 8) + (this.field2528[++this.field2529 - 1] - this.field2555.method3313() & 0xFF);
    }

    @ObfuscatedName("gr.if(I)V")
    public void method3285() {
        this.field2554 = this.field2529 * 8;
    }

    @ObfuscatedName("gr.iw(IB)I")
    public int method3286(int arg0) {
        int var2 = this.field2554 >> 3;
        int var3 = 8 - (this.field2554 & 0x7);
        int var4 = 0;
        this.field2554 += arg0;
        while (arg0 > var3) {
            var4 += (this.field2528[var2++] & field2553[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field2528[var2] & field2553[var3]) + var4;
        } else {
            var5 = (this.field2528[var2] >> var3 - arg0 & field2553[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("gr.iv(B)V")
    public void method3287() {
        this.field2529 = (this.field2554 + 7) / 8;
    }

    @ObfuscatedName("gr.iz(II)I")
    public int method3292(int arg0) {
        return arg0 * 8 - this.field2554;
    }
}
