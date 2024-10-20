package deob;

@ObfuscatedName("bh")
public class class44 {

    @ObfuscatedName("bh.am")
    public int field306 = 2;

    @ObfuscatedName("bh.ap")
    public int[] field302 = new int[2];

    @ObfuscatedName("bh.af")
    public int[] field303 = new int[2];

    @ObfuscatedName("bh.aj")
    public int field301;

    @ObfuscatedName("bh.aq")
    public int field305;

    @ObfuscatedName("bh.ar")
    public int field311;

    @ObfuscatedName("bh.ag")
    public int field307;

    @ObfuscatedName("bh.ao")
    public int field308;

    @ObfuscatedName("bh.ae")
    public int field309;

    @ObfuscatedName("bh.aa")
    public int field310;

    @ObfuscatedName("bh.au")
    public int field304;

    public class44() {
        this.field302[0] = 0;
        this.field302[1] = 65535;
        this.field303[0] = 0;
        this.field303[1] = 65535;
    }

    @ObfuscatedName("bh.am(Luk;)V")
    public final void method836(class531 arg0) {
        this.field311 = arg0.method8561();
        this.field301 = arg0.method8566();
        this.field305 = arg0.method8566();
        this.method835(arg0);
    }

    @ObfuscatedName("bh.ap(Luk;)V")
    public final void method835(class531 arg0) {
        this.field306 = arg0.method8561();
        this.field302 = new int[this.field306];
        this.field303 = new int[this.field306];
        for (int var2 = 0; var2 < this.field306; var2++) {
            this.field302[var2] = arg0.method8775();
            this.field303[var2] = arg0.method8775();
        }
    }

    @ObfuscatedName("bh.af()V")
    public final void method839() {
        this.field307 = 0;
        this.field308 = 0;
        this.field309 = 0;
        this.field310 = 0;
        this.field304 = 0;
    }

    @ObfuscatedName("bh.aj(I)I")
    public final int method838(int arg0) {
        if (this.field304 >= this.field307) {
            this.field310 = this.field303[this.field308++] << 15;
            if (this.field308 >= this.field306) {
                this.field308 = this.field306 - 1;
            }
            this.field307 = (int) ((double) this.field302[this.field308] / 65536.0D * (double) arg0);
            if (this.field307 > this.field304) {
                this.field309 = ((this.field303[this.field308] << 15) - this.field310) / (this.field307 - this.field304);
            }
        }
        this.field310 += this.field309;
        this.field304++;
        return this.field310 - this.field309 >> 15;
    }
}
