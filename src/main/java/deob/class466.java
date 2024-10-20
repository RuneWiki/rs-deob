package deob;

@ObfuscatedName("qx")
public class class466 extends class467 {

    @ObfuscatedName("qx.h")
    public class484 field4909;

    @ObfuscatedName("qx.e")
    public static final int[] field4910 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @ObfuscatedName("qx.v")
    public int field4908;

    public class466(int arg0) {
        super(arg0);
    }

    @ObfuscatedName("qx.h([II)V")
    public void method7736(int[] arg0) {
        this.field4909 = new class484(arg0);
    }

    @ObfuscatedName("qx.e(Lrg;I)V")
    public void method7735(class484 arg0) {
        this.field4909 = arg0;
    }

    @ObfuscatedName("qx.v(II)V")
    public void method7740(int arg0) {
        this.field4917[++this.field4915 - 1] = (byte) (arg0 + this.field4909.method8352());
    }

    @ObfuscatedName("qx.x(B)I")
    public int method7737() {
        return this.field4917[++this.field4915 - 1] - this.field4909.method8352() & 0xFF;
    }

    @ObfuscatedName("qx.m(I)Z")
    public boolean method7738() {
        int var1 = this.field4917[this.field4915] - this.field4909.method8353() & 0xFF;
        return var1 >= 128;
    }

    @ObfuscatedName("qx.q(B)I")
    public int method7748() {
        int var1 = this.field4917[++this.field4915 - 1] - this.field4909.method8352() & 0xFF;
        return var1 < 128 ? var1 : (var1 - 128 << 8) + (this.field4917[++this.field4915 - 1] - this.field4909.method8352() & 0xFF);
    }

    @ObfuscatedName("qx.f([BIIB)V")
    public void method7734(byte[] arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < arg2; var4++) {
            arg0[arg1 + var4] = (byte) (this.field4917[++this.field4915 - 1] - this.field4909.method8352());
        }
    }

    @ObfuscatedName("qx.r(I)V")
    public void method7741() {
        this.field4908 = this.field4915 * 8;
    }

    @ObfuscatedName("qx.u(II)I")
    public int method7747(int arg0) {
        int var2 = this.field4908 >> 3;
        int var3 = 8 - (this.field4908 & 0x7);
        int var4 = 0;
        this.field4908 += arg0;
        while (arg0 > var3) {
            var4 += (this.field4917[var2++] & field4910[var3]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var5;
        if (arg0 == var3) {
            var5 = (this.field4917[var2] & field4910[var3]) + var4;
        } else {
            var5 = (this.field4917[var2] >> var3 - arg0 & field4910[arg0]) + var4;
        }
        return var5;
    }

    @ObfuscatedName("qx.b(I)V")
    public void method7743() {
        this.field4915 = (this.field4908 + 7) / 8;
    }

    @ObfuscatedName("qx.j(II)I")
    public int method7753(int arg0) {
        return arg0 * 8 - this.field4908;
    }
}
