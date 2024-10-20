package deob;

@ObfuscatedName("aw")
public class class41 {

    @ObfuscatedName("aw.s")
    public int field311 = 2;

    @ObfuscatedName("aw.h")
    public int[] field305 = new int[2];

    @ObfuscatedName("aw.w")
    public int[] field307 = new int[2];

    @ObfuscatedName("aw.v")
    public int field304;

    @ObfuscatedName("aw.c")
    public int field313;

    @ObfuscatedName("aw.q")
    public int field309;

    @ObfuscatedName("aw.i")
    public int field310;

    @ObfuscatedName("aw.k")
    public int field308;

    @ObfuscatedName("aw.o")
    public int field312;

    @ObfuscatedName("aw.n")
    public int field306;

    @ObfuscatedName("aw.d")
    public int field314;

    public class41() {
        this.field305[0] = 0;
        this.field305[1] = 65535;
        this.field307[0] = 0;
        this.field307[1] = 65535;
    }

    @ObfuscatedName("aw.s(Lqr;)V")
    public final void method700(class444 arg0) {
        this.field309 = arg0.method6929();
        this.field304 = arg0.method6934();
        this.field313 = arg0.method6934();
        this.method702(arg0);
    }

    @ObfuscatedName("aw.h(Lqr;)V")
    public final void method702(class444 arg0) {
        this.field311 = arg0.method6929();
        this.field305 = new int[this.field311];
        this.field307 = new int[this.field311];
        for (int var2 = 0; var2 < this.field311; var2++) {
            this.field305[var2] = arg0.method7120();
            this.field307[var2] = arg0.method7120();
        }
    }

    @ObfuscatedName("aw.w()V")
    public final void method701() {
        this.field310 = 0;
        this.field308 = 0;
        this.field312 = 0;
        this.field306 = 0;
        this.field314 = 0;
    }

    @ObfuscatedName("aw.v(I)I")
    public final int method705(int arg0) {
        if (this.field314 >= this.field310) {
            this.field306 = this.field307[this.field308++] << 15;
            if (this.field308 >= this.field311) {
                this.field308 = this.field311 - 1;
            }
            this.field310 = (int) ((double) this.field305[this.field308] / 65536.0D * (double) arg0);
            if (this.field310 > this.field314) {
                this.field312 = ((this.field307[this.field308] << 15) - this.field306) / (this.field310 - this.field314);
            }
        }
        this.field306 += this.field312;
        this.field314++;
        return this.field306 - this.field312 >> 15;
    }
}
