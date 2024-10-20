package deob;

@ObfuscatedName("ag")
public class class39 {

    @ObfuscatedName("ag.v")
    public int field299 = 2;

    @ObfuscatedName("ag.c")
    public int[] field302 = new int[2];

    @ObfuscatedName("ag.i")
    public int[] field300 = new int[2];

    @ObfuscatedName("ag.f")
    public int field298;

    @ObfuscatedName("ag.b")
    public int field301;

    @ObfuscatedName("ag.n")
    public int field308;

    @ObfuscatedName("ag.s")
    public int field304;

    @ObfuscatedName("ag.l")
    public int field305;

    @ObfuscatedName("ag.q")
    public int field306;

    @ObfuscatedName("ag.o")
    public int field307;

    @ObfuscatedName("ag.r")
    public int field303;

    public class39() {
        this.field302[0] = 0;
        this.field302[1] = 65535;
        this.field300[0] = 0;
        this.field300[1] = 65535;
    }

    @ObfuscatedName("ag.v(Lpi;)V")
    public final void method722(class438 arg0) {
        this.field308 = arg0.method6971();
        this.field298 = arg0.method6976();
        this.field301 = arg0.method6976();
        this.method721(arg0);
    }

    @ObfuscatedName("ag.c(Lpi;)V")
    public final void method721(class438 arg0) {
        this.field299 = arg0.method6971();
        this.field302 = new int[this.field299];
        this.field300 = new int[this.field299];
        for (int var2 = 0; var2 < this.field299; var2++) {
            this.field302[var2] = arg0.method7148();
            this.field300[var2] = arg0.method7148();
        }
    }

    @ObfuscatedName("ag.i()V")
    public final void method727() {
        this.field304 = 0;
        this.field305 = 0;
        this.field306 = 0;
        this.field307 = 0;
        this.field303 = 0;
    }

    @ObfuscatedName("ag.f(I)I")
    public final int method725(int arg0) {
        if (this.field303 >= this.field304) {
            this.field307 = this.field300[this.field305++] << 15;
            if (this.field305 >= this.field299) {
                this.field305 = this.field299 - 1;
            }
            this.field304 = (int) ((double) this.field302[this.field305] / 65536.0D * (double) arg0);
            if (this.field304 > this.field303) {
                this.field306 = ((this.field300[this.field305] << 15) - this.field307) / (this.field304 - this.field303);
            }
        }
        this.field307 += this.field306;
        this.field303++;
        return this.field307 - this.field306 >> 15;
    }
}
