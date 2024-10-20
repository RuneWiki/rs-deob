package deob;

@ObfuscatedName("fj")
public class class162 extends class172 {

    @ObfuscatedName("fj.b")
    public long[] field2127 = new long[10];

    @ObfuscatedName("fj.q")
    public int field2128 = 256;

    @ObfuscatedName("fj.o")
    public int field2129 = 1;

    @ObfuscatedName("fj.p")
    public long field2130 = class196.method3211();

    @ObfuscatedName("fj.a")
    public int field2131 = 0;

    @ObfuscatedName("fj.h")
    public int field2132;

    public class162() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2127[var1] = this.field2130;
        }
    }

    @ObfuscatedName("fj.b(I)V")
    public void method2935() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2127[var1] = 0L;
        }
    }

    @ObfuscatedName("fj.q(IIB)I")
    public int method2940(int arg0, int arg1) {
        int var3 = this.field2128;
        int var4 = this.field2129;
        this.field2128 = 300;
        this.field2129 = 1;
        this.field2130 = class196.method3211();
        if (this.field2127[this.field2132] == 0L) {
            this.field2128 = var3;
            this.field2129 = var4;
        } else if (this.field2130 > this.field2127[this.field2132]) {
            this.field2128 = (int) ((long) (arg0 * 2560) / (this.field2130 - this.field2127[this.field2132]));
        }
        if (this.field2128 < 25) {
            this.field2128 = 25;
        }
        if (this.field2128 > 256) {
            this.field2128 = 256;
            this.field2129 = (int) ((long) arg0 - (this.field2130 - this.field2127[this.field2132]) / 10L);
        }
        if (this.field2129 > arg0) {
            this.field2129 = arg0;
        }
        this.field2127[this.field2132] = this.field2130;
        this.field2132 = (this.field2132 + 1) % 10;
        if (this.field2129 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2127[var5] != 0L) {
                    this.field2127[var5] += (long) this.field2129;
                }
            }
        }
        if (this.field2129 < arg1) {
            this.field2129 = arg1;
        }
        class202.method141((long) this.field2129);
        int var6 = 0;
        while (this.field2131 < 256) {
            var6++;
            this.field2131 += this.field2128;
        }
        this.field2131 &= 0xFF;
        return var6;
    }
}
