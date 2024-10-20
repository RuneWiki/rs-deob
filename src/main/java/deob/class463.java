package deob;

@ObfuscatedName("qk")
public class class463 extends class464 {

    @ObfuscatedName("qk.a")
    public class480 field4861;

    @ObfuscatedName("qk.f")
    public static final int[] field4862 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("qk.c")
    public int field4863;

    public class463(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("qk.a([IB)V")
    public void method7657(int[] arg0) {
        this.field4861 = new class480(arg0);
    }

    @ObfuscatedName("qk.f(Lro;B)V")
    public void method7676(class480 arg0) {
        this.field4861 = arg0;
    }

    @ObfuscatedName("qk.c(IB)V")
    public void method7659(int arg0) {
        this.field4867[++this.field4864 - 1] = (byte) (arg0 + this.field4861.method8268());
    }

    @ObfuscatedName("qk.x(I)I")
    public int method7660() {
        return this.field4867[++this.field4864 - 1] - this.field4861.method8268() & 0xFF;
    }

    @ObfuscatedName("qk.h(I)Z")
    public boolean method7658() {
        int var1 = this.field4867[this.field4864] - this.field4861.method8261() & 0xFF;
        return var1 >= 128;
    }

    @ObfuscatedName("qk.j(B)I")
    public int method7662() {
        int var1 = this.field4867[++this.field4864 - 1] - this.field4861.method8268() & 0xFF;
        return var1 < 128 ? var1 : (var1 - 128 << 8) + (this.field4867[++this.field4864 - 1] - this.field4861.method8268() & 0xFF);
    }

    @ObfuscatedName("qk.y([BIII)V")
    public void method7668(byte[] arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < arg2; var4++) {
            arg0[arg1 + var4] = (byte) (this.field4867[++this.field4864 - 1] - this.field4861.method8268());
        }
    }

    @ObfuscatedName("qk.d(I)V")
    public void method7664() {
        this.field4863 = this.field4864 * 8;
    }

    @ObfuscatedName("qk.n(II)I")
    public int method7665(int arg0) {
        int var2 = this.field4863 >> 3;
        int var3 = 8 - (this.field4863 & 0x7);
        int var4 = 0;
        this.field4863 += arg0;
        while (arg0 > var3) {
            var4 += (this.field4867[var2++] & field4862[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field4867[var2] & field4862[var3]) + var4;
        } else {
            var5 = (this.field4867[var2] >> var3 - arg0 & field4862[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("qk.r(I)V")
    public void method7661() {
        this.field4864 = (this.field4863 + 7) / 8;
    }

    @ObfuscatedName("qk.l(II)I")
    public int method7695(int arg0) {
        return arg0 * 8 - this.field4863;
    }
}
