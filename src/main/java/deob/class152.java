package deob;

@ObfuscatedName("ed")
public class class152 extends class159 {

    @ObfuscatedName("ed.a")
    public long[] field2201 = new long[10];

    @ObfuscatedName("ed.j")
    public int field2207 = 256;

    @ObfuscatedName("ed.n")
    public int field2202 = 1;

    @ObfuscatedName("ed.r")
    public long field2200 = class176.method584();

    @ObfuscatedName("ed.v")
    public int field2203 = 0;

    @ObfuscatedName("ed.e")
    public int field2199;

    public class152() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2201[var1] = this.field2200;
        }
    }

    @ObfuscatedName("ed.a(B)V")
    public void method2648() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2201[var1] = 0L;
        }
    }

    @ObfuscatedName("ed.j(III)I")
    public int method2650(int arg0, int arg1) {
        int var3 = this.field2207;
        int var4 = this.field2202;
        this.field2207 = 300;
        this.field2202 = 1;
        this.field2200 = class176.method584();
        if (this.field2201[this.field2199] == 0L) {
            this.field2207 = var3;
            this.field2202 = var4;
        } else if (this.field2200 > this.field2201[this.field2199]) {
            this.field2207 = (int) ((long) (arg0 * 2560) / (this.field2200 - this.field2201[this.field2199]));
        }
        if (this.field2207 < 25) {
            this.field2207 = 25;
        }
        if (this.field2207 > 256) {
            this.field2207 = 256;
            this.field2202 = (int) ((long) arg0 - (this.field2200 - this.field2201[this.field2199]) / 10L);
        }
        if (this.field2202 > arg0) {
            this.field2202 = arg0;
        }
        this.field2201[this.field2199] = this.field2200;
        this.field2199 = (this.field2199 + 1) % 10;
        if (this.field2202 > 1) {
            for (int var5 = 0; var5 < 10; var5++) {
                if (this.field2201[var5] != 0L) {
                    this.field2201[var5] += (long) this.field2202;
                }
            }
        }
        if (this.field2202 < arg1) {
            this.field2202 = arg1;
        }
        class182.method318((long) this.field2202);
        int var6 = 0;
        while (this.field2203 < 256) {
            var6++;
            this.field2203 += this.field2207;
        }
        this.field2203 &= 0xFF;
        return var6;
    }
}
