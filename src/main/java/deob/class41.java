package deob;

@ObfuscatedName("af")
public class class41 {

    @ObfuscatedName("af.c")
    public int field315 = 2;

    @ObfuscatedName("af.p")
    public int[] field312 = new int[2];

    @ObfuscatedName("af.f")
    public int[] field313 = new int[2];

    @ObfuscatedName("af.n")
    public int field317;

    @ObfuscatedName("af.k")
    public int field318;

    @ObfuscatedName("af.w")
    public int field316;

    @ObfuscatedName("af.s")
    public int field314;

    @ObfuscatedName("af.q")
    public int field321;

    @ObfuscatedName("af.m")
    public int field319;

    @ObfuscatedName("af.j")
    public int field320;

    @ObfuscatedName("af.v")
    public int field311;

    public class41() {
        this.field312[0] = 0;
        this.field312[1] = 65535;
        this.field313[0] = 0;
        this.field313[1] = 65535;
    }

    @ObfuscatedName("af.c(Lqq;)V")
    public final void method775(class445 arg0) {
        this.field316 = arg0.method7196();
        this.field317 = arg0.method7201();
        this.field318 = arg0.method7201();
        this.method771(arg0);
    }

    @ObfuscatedName("af.p(Lqq;)V")
    public final void method771(class445 arg0) {
        this.field315 = arg0.method7196();
        this.field312 = new int[this.field315];
        this.field313 = new int[this.field315];
        for (int var2 = 0; var2 < this.field315; var2++) {
            this.field312[var2] = arg0.method7198();
            this.field313[var2] = arg0.method7198();
        }
    }

    @ObfuscatedName("af.f()V")
    public final void method770() {
        this.field314 = 0;
        this.field321 = 0;
        this.field319 = 0;
        this.field320 = 0;
        this.field311 = 0;
    }

    @ObfuscatedName("af.n(I)I")
    public final int method773(int arg0) {
        if (this.field311 >= this.field314) {
            this.field320 = this.field313[this.field321++] << 15;
            if (this.field321 >= this.field315) {
                this.field321 = this.field315 - 1;
            }
            this.field314 = (int) ((double) this.field312[this.field321] / 65536.0D * (double) arg0);
            if (this.field314 > this.field311) {
                this.field319 = ((this.field313[this.field321] << 15) - this.field320) / (this.field314 - this.field311);
            }
        }
        this.field320 += this.field319;
        this.field311++;
        return this.field320 - this.field319 >> 15;
    }
}
