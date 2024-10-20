package deob;

@ObfuscatedName("aq")
public class class41 {

    @ObfuscatedName("aq.o")
    public int field311 = 2;

    @ObfuscatedName("aq.q")
    public int[] field305 = new int[2];

    @ObfuscatedName("aq.l")
    public int[] field306 = new int[2];

    @ObfuscatedName("aq.k")
    public int field308;

    @ObfuscatedName("aq.a")
    public int field304;

    @ObfuscatedName("aq.m")
    public int field309;

    @ObfuscatedName("aq.p")
    public int field310;

    @ObfuscatedName("aq.s")
    public int field314;

    @ObfuscatedName("aq.r")
    public int field313;

    @ObfuscatedName("aq.v")
    public int field307;

    @ObfuscatedName("aq.y")
    public int field312;

    public class41() {
        this.field305[0] = 0;
        this.field305[1] = 65535;
        this.field306[0] = 0;
        this.field306[1] = 65535;
    }

    @ObfuscatedName("aq.o(Lpx;)V")
    public final void method732(class440 arg0) {
        this.field309 = arg0.method7071();
        this.field308 = arg0.method6898();
        this.field304 = arg0.method6898();
        this.method741(arg0);
    }

    @ObfuscatedName("aq.q(Lpx;)V")
    public final void method741(class440 arg0) {
        this.field311 = arg0.method7071();
        this.field305 = new int[this.field311];
        this.field306 = new int[this.field311];
        for (int var2 = 0; var2 < this.field311; var2++) {
            this.field305[var2] = arg0.method7082();
            this.field306[var2] = arg0.method7082();
        }
    }

    @ObfuscatedName("aq.l()V")
    public final void method738() {
        this.field310 = 0;
        this.field314 = 0;
        this.field313 = 0;
        this.field307 = 0;
        this.field312 = 0;
    }

    @ObfuscatedName("aq.k(I)I")
    public final int method743(int arg0) {
        if (this.field312 >= this.field310) {
            this.field307 = this.field306[this.field314++] << 15;
            if (this.field314 >= this.field311) {
                this.field314 = this.field311 - 1;
            }
            this.field310 = (int) ((double) this.field305[this.field314] / 65536.0D * (double) arg0);
            if (this.field310 > this.field312) {
                this.field313 = ((this.field306[this.field314] << 15) - this.field307) / (this.field310 - this.field312);
            }
        }
        this.field307 += this.field313;
        this.field312++;
        return this.field307 - this.field313 >> 15;
    }
}
