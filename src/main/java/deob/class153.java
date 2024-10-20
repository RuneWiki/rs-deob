package deob;

@ObfuscatedName("er")
public class class153 extends class160 {

    @ObfuscatedName("er.j")
    public long[] field2213 = new long[10];

    @ObfuscatedName("er.h")
    public int field2210 = 256;

    @ObfuscatedName("er.f")
    public int field2211 = 1;

    @ObfuscatedName("er.p")
    public long field2212 = class177.method1067();

    @ObfuscatedName("er.x")
    public int field2209 = 0;

    @ObfuscatedName("er.g")
    public int field2214;

    public class153() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2213[var1] = this.field2212;
        }
    }

    @ObfuscatedName("er.j(B)V")
    public void method2686() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2213[var1] = 0L;
        }
    }

    @ObfuscatedName("er.h(III)I")
    public int method2693(int arg0, int arg1) {
        int var3 = this.field2210;
        int var4 = this.field2211;
        this.field2210 = 300;
        this.field2211 = 1;
        this.field2212 = class177.method1067();
        if (this.field2213[this.field2214] == 0L) {
            this.field2210 = var3;
            this.field2211 = var4;
        } else if (this.field2212 > this.field2213[this.field2214]) {
            this.field2210 = (int) ((long) (arg0 * 2560) / (this.field2212 - this.field2213[this.field2214]));
        }
        if (this.field2210 < 25) {
            this.field2210 = 25;
        }
        if (this.field2210 > 256) {
            this.field2210 = 256;
            this.field2211 = (int) ((long) arg0 - (this.field2212 - this.field2213[this.field2214]) / 10L);
        }
        if (this.field2211 > arg0) {
            this.field2211 = arg0;
        }
        this.field2213[this.field2214] = this.field2212;
        this.field2214 = (this.field2214 + 1) % 10;
        if (this.field2211 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2213[var5] != 0L) {
                    this.field2213[var5] += (long) this.field2211;
                }
            }
        }
        if (this.field2211 < arg1) {
            this.field2211 = arg1;
        }
        class183.method40((long) this.field2211);
        int var6 = 0;
        while (this.field2209 < 256) {
            var6++;
            this.field2209 += this.field2210;
        }
        this.field2209 &= 0xFF;
        return var6;
    }
}
