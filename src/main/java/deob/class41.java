package deob;

@ObfuscatedName("ag")
public class class41 {

    @ObfuscatedName("ag.c")
    public int field309 = 2;

    @ObfuscatedName("ag.b")
    public int[] field311 = new int[2];

    @ObfuscatedName("ag.p")
    public int[] field303 = new int[2];

    @ObfuscatedName("ag.m")
    public int field304;

    @ObfuscatedName("ag.t")
    public int field305;

    @ObfuscatedName("ag.s")
    public int field306;

    @ObfuscatedName("ag.j")
    public int field307;

    @ObfuscatedName("ag.w")
    public int field308;

    @ObfuscatedName("ag.n")
    public int field310;

    @ObfuscatedName("ag.r")
    public int field302;

    @ObfuscatedName("ag.o")
    public int field301;

    public class41() {
        this.field311[0] = 0;
        this.field311[1] = 65535;
        this.field303[0] = 0;
        this.field303[1] = 65535;
    }

    @ObfuscatedName("ag.c(Lpi;)V")
    public final void method769(class419 arg0) {
        this.field306 = arg0.method6781();
        this.field304 = arg0.method6675();
        this.field305 = arg0.method6675();
        this.method770(arg0);
    }

    @ObfuscatedName("ag.b(Lpi;)V")
    public final void method770(class419 arg0) {
        this.field309 = arg0.method6781();
        this.field311 = new int[this.field309];
        this.field303 = new int[this.field309];
        for (int var2 = 0; var2 < this.field309; var2++) {
            this.field311[var2] = arg0.method6672();
            this.field303[var2] = arg0.method6672();
        }
    }

    @ObfuscatedName("ag.p()V")
    public final void method776() {
        this.field307 = 0;
        this.field308 = 0;
        this.field310 = 0;
        this.field302 = 0;
        this.field301 = 0;
    }

    @ObfuscatedName("ag.m(I)I")
    public final int method779(int arg0) {
        if (this.field301 >= this.field307) {
            this.field302 = this.field303[this.field308++] << 15;
            if (this.field308 >= this.field309) {
                this.field308 = this.field309 - 1;
            }
            this.field307 = (int) ((double) this.field311[this.field308] / 65536.0D * (double) arg0);
            if (this.field307 > this.field301) {
                this.field310 = ((this.field303[this.field308] << 15) - this.field302) / (this.field307 - this.field301);
            }
        }
        this.field302 += this.field310;
        this.field301++;
        return this.field302 - this.field310 >> 15;
    }
}
