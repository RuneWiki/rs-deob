package deob;

@ObfuscatedName("at")
public class class41 {

    @ObfuscatedName("at.c")
    public int field302 = 2;

    @ObfuscatedName("at.v")
    public int[] field304 = new int[2];

    @ObfuscatedName("at.q")
    public int[] field301 = new int[2];

    @ObfuscatedName("at.f")
    public int field300;

    @ObfuscatedName("at.j")
    public int field303;

    @ObfuscatedName("at.e")
    public int field299;

    @ObfuscatedName("at.g")
    public int field305;

    @ObfuscatedName("at.w")
    public int field306;

    @ObfuscatedName("at.y")
    public int field309;

    @ObfuscatedName("at.i")
    public int field307;

    @ObfuscatedName("at.s")
    public int field308;

    public class41() {
        this.field304[0] = 0;
        this.field304[1] = 65535;
        this.field301[0] = 0;
        this.field301[1] = 65535;
    }

    @ObfuscatedName("at.c(Lqt;)V")
    public final void method694(class443 arg0) {
        this.field299 = arg0.method7047();
        this.field300 = arg0.method7052();
        this.field303 = arg0.method7052();
        this.method706(arg0);
    }

    @ObfuscatedName("at.v(Lqt;)V")
    public final void method706(class443 arg0) {
        this.field302 = arg0.method7047();
        this.field304 = new int[this.field302];
        this.field301 = new int[this.field302];
        for (int var2 = 0; var2 < this.field302; var2++) {
            this.field304[var2] = arg0.method7049();
            this.field301[var2] = arg0.method7049();
        }
    }

    @ObfuscatedName("at.q()V")
    public final void method704() {
        this.field305 = 0;
        this.field306 = 0;
        this.field307 = 0;
        this.field308 = 0;
        this.field309 = 0;
    }

    @ObfuscatedName("at.f(I)I")
    public final int method703(int arg0) {
        if (this.field309 >= this.field305) {
            this.field308 = this.field301[this.field306++] << 15;
            if (this.field306 >= this.field302) {
                this.field306 = this.field302 - 1;
            }
            this.field305 = (int) ((double) this.field304[this.field306] / 65536.0D * (double) arg0);
            if (this.field305 > this.field309) {
                this.field307 = ((this.field301[this.field306] << 15) - this.field308) / (this.field305 - this.field309);
            }
        }
        this.field308 += this.field307;
        this.field309++;
        return this.field308 - this.field307 >> 15;
    }
}
