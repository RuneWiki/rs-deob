package deob;

@ObfuscatedName("bt")
public class class54 {

    @ObfuscatedName("bt.v")
    public int field451 = 2;

    @ObfuscatedName("bt.n")
    public int[] field446 = new int[2];

    @ObfuscatedName("bt.f")
    public int[] field447 = new int[2];

    @ObfuscatedName("bt.y")
    public int field454;

    @ObfuscatedName("bt.p")
    public int field448;

    @ObfuscatedName("bt.j")
    public int field453;

    @ObfuscatedName("bt.r")
    public int field450;

    @ObfuscatedName("bt.b")
    public int field445;

    @ObfuscatedName("bt.d")
    public int field452;

    @ObfuscatedName("bt.s")
    public int field455;

    @ObfuscatedName("bt.u")
    public int field449;

    public class54() {
        this.field446[0] = 0;
        this.field446[1] = 65535;
        this.field447[0] = 0;
        this.field447[1] = 65535;
    }

    @ObfuscatedName("bt.v(Lnd;)V")
    public final void method667(class383 arg0) {
        this.field450 = arg0.method5965();
        this.field448 = arg0.method5970();
        this.field453 = arg0.method5970();
        this.method679(arg0);
    }

    @ObfuscatedName("bt.n(Lnd;)V")
    public final void method679(class383 arg0) {
        this.field451 = arg0.method5965();
        this.field446 = new int[this.field451];
        this.field447 = new int[this.field451];
        for (int var2 = 0; var2 < this.field451; var2++) {
            this.field446[var2] = arg0.method5967();
            this.field447[var2] = arg0.method5967();
        }
    }

    @ObfuscatedName("bt.f()V")
    public final void method668() {
        this.field445 = 0;
        this.field452 = 0;
        this.field455 = 0;
        this.field449 = 0;
        this.field454 = 0;
    }

    @ObfuscatedName("bt.y(I)I")
    public final int method669(int arg0) {
        if (this.field454 >= this.field445) {
            this.field449 = this.field447[this.field452++] << 15;
            if (this.field452 >= this.field451) {
                this.field452 = this.field451 - 1;
            }
            this.field445 = (int) ((double) this.field446[this.field452] / 65536.0D * (double) arg0);
            if (this.field445 > this.field454) {
                this.field455 = ((this.field447[this.field452] << 15) - this.field449) / (this.field445 - this.field454);
            }
        }
        this.field449 += this.field455;
        this.field454++;
        return this.field449 - this.field455 >> 15;
    }
}
