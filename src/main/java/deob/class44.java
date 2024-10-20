package deob;

@ObfuscatedName("bv")
public class class44 {

    @ObfuscatedName("bv.ak")
    public int field307 = 2;

    @ObfuscatedName("bv.al")
    public int[] field301 = new int[2];

    @ObfuscatedName("bv.aj")
    public int[] field302 = new int[2];

    @ObfuscatedName("bv.az")
    public int field303;

    @ObfuscatedName("bv.af")
    public int field304;

    @ObfuscatedName("bv.aa")
    public int field306;

    @ObfuscatedName("bv.at")
    public int field309;

    @ObfuscatedName("bv.ab")
    public int field305;

    @ObfuscatedName("bv.ac")
    public int field308;

    @ObfuscatedName("bv.ao")
    public int field300;

    @ObfuscatedName("bv.ah")
    public int field310;

    public class44() {
        this.field301[0] = 0;
        this.field301[1] = 65535;
        this.field302[0] = 0;
        this.field302[1] = 65535;
    }

    @ObfuscatedName("bv.ak(Lua;)V")
    public final void method810(class546 arg0) {
        this.field306 = arg0.method8796();
        this.field303 = arg0.method8801();
        this.field304 = arg0.method8801();
        this.method812(arg0);
    }

    @ObfuscatedName("bv.al(Lua;)V")
    public final void method812(class546 arg0) {
        this.field307 = arg0.method8796();
        this.field301 = new int[this.field307];
        this.field302 = new int[this.field307];
        for (int var2 = 0; var2 < this.field307; var2++) {
            this.field301[var2] = arg0.method8798();
            this.field302[var2] = arg0.method8798();
        }
    }

    @ObfuscatedName("bv.aj()V")
    public final void method811() {
        this.field309 = 0;
        this.field305 = 0;
        this.field308 = 0;
        this.field300 = 0;
        this.field310 = 0;
    }

    @ObfuscatedName("bv.az(I)I")
    public final int method813(int arg0) {
        if (this.field310 >= this.field309) {
            this.field300 = this.field302[this.field305++] << 15;
            if (this.field305 >= this.field307) {
                this.field305 = this.field307 - 1;
            }
            this.field309 = (int) ((double) this.field301[this.field305] / 65536.0D * (double) arg0);
            if (this.field309 > this.field310) {
                this.field308 = ((this.field302[this.field305] << 15) - this.field300) / (this.field309 - this.field310);
            }
        }
        this.field300 += this.field308;
        this.field310++;
        return this.field300 - this.field308 >> 15;
    }
}
