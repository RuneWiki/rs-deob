package deob;

@ObfuscatedName("em")
public class class153 extends class160 {

    @ObfuscatedName("em.m")
    public long[] field2124 = new long[10];

    @ObfuscatedName("em.p")
    public int field2125 = 256;

    @ObfuscatedName("em.i")
    public int field2131 = 1;

    @ObfuscatedName("em.j")
    public long field2127 = class183.method4541();

    @ObfuscatedName("em.v")
    public int field2128 = 0;

    @ObfuscatedName("em.x")
    public int field2129;

    public class153() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2124[var1] = this.field2127;
        }
    }

    @ObfuscatedName("em.m(B)V")
    public void method2778() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2124[var1] = 0L;
        }
    }

    @ObfuscatedName("em.p(III)I")
    public int method2779(int arg0, int arg1) {
        int var3 = this.field2125;
        int var4 = this.field2131;
        this.field2125 = 300;
        this.field2131 = 1;
        this.field2127 = class183.method4541();
        if (this.field2124[this.field2129] == 0L) {
            this.field2125 = var3;
            this.field2131 = var4;
        } else if (this.field2127 > this.field2124[this.field2129]) {
            this.field2125 = (int) ((long) (arg0 * 2560) / (this.field2127 - this.field2124[this.field2129]));
        }
        if (this.field2125 < 25) {
            this.field2125 = 25;
        }
        if (this.field2125 > 256) {
            this.field2125 = 256;
            this.field2131 = (int) ((long) arg0 - (this.field2127 - this.field2124[this.field2129]) / 10L);
        }
        if (this.field2131 > arg0) {
            this.field2131 = arg0;
        }
        this.field2124[this.field2129] = this.field2127;
        this.field2129 = (this.field2129 + 1) % 10;
        if (this.field2131 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2124[var5] != 0L) {
                    this.field2124[var5] += (long) this.field2131;
                }
            }
        }
        if (this.field2131 < arg1) {
            this.field2131 = arg1;
        }
        class189.method1011((long) this.field2131);
        int var6 = 0;
        while (this.field2128 < 256) {
            var6++;
            this.field2128 += this.field2125;
        }
        this.field2128 &= 0xFF;
        return var6;
    }
}
