package deob;

@ObfuscatedName("ru")
public class class473 extends class474 {

    @ObfuscatedName("ru.f")
    public class491 field4935;

    @ObfuscatedName("ru.w")
    public static final int[] field4934 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("ru.v")
    public int field4933;

    public class473(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("ru.f([II)V")
    public void method7907(int[] arg0) {
        this.field4935 = new class491(arg0);
    }

    @ObfuscatedName("ru.w(Lrt;I)V")
    public void method7920(class491 arg0) {
        this.field4935 = arg0;
    }

    @ObfuscatedName("ru.v(II)V")
    public void method7908(int arg0) {
        this.field4936[++this.field4939 - 1] = (byte) (arg0 + this.field4935.method8528());
    }

    @ObfuscatedName("ru.s(B)I")
    public int method7918() {
        return this.field4936[++this.field4939 - 1] - this.field4935.method8528() & 0xFF;
    }

    @ObfuscatedName("ru.z(B)Z")
    public boolean method7944() {
        int var1 = this.field4936[this.field4939] - this.field4935.method8520() & 0xFF;
        return var1 >= 128;
    }

    @ObfuscatedName("ru.j(B)I")
    public int method7911() {
        int var1 = this.field4936[++this.field4939 - 1] - this.field4935.method8528() & 0xFF;
        return var1 < 128 ? var1 : (var1 - 128 << 8) + (this.field4936[++this.field4939 - 1] - this.field4935.method8528() & 0xFF);
    }

    @ObfuscatedName("ru.i([BIII)V")
    public void method7915(byte[] arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < arg2; var4++) {
            arg0[arg1 + var4] = (byte) (this.field4936[++this.field4939 - 1] - this.field4935.method8528());
        }
    }

    @ObfuscatedName("ru.n(I)V")
    public void method7935() {
        this.field4933 = this.field4939 * 8;
    }

    @ObfuscatedName("ru.l(II)I")
    public int method7923(int arg0) {
        int var2 = this.field4933 >> 3;
        int var3 = 8 - (this.field4933 & 0x7);
        int var4 = 0;
        this.field4933 += arg0;
        while (arg0 > var3) {
            var4 += (this.field4936[var2++] & field4934[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field4936[var2] & field4934[var3]) + var4;
        } else {
            var5 = (this.field4936[var2] >> var3 - arg0 & field4934[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("ru.k(B)V")
    public void method7910() {
        this.field4939 = (this.field4933 + 7) / 8;
    }

    @ObfuscatedName("ru.c(II)I")
    public int method7916(int arg0) {
        return arg0 * 8 - this.field4933;
    }
}
