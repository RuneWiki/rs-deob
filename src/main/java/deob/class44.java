package deob;

@ObfuscatedName("bg")
public class class44 {

    @ObfuscatedName("bg.aq")
    public int field300 = 2;

    @ObfuscatedName("bg.aw")
    public int[] field304 = new int[2];

    @ObfuscatedName("bg.al")
    public int[] field302 = new int[2];

    @ObfuscatedName("bg.ai")
    public int field307;

    @ObfuscatedName("bg.ar")
    public int field303;

    @ObfuscatedName("bg.as")
    public int field301;

    @ObfuscatedName("bg.aa")
    public int field306;

    @ObfuscatedName("bg.az")
    public int field305;

    @ObfuscatedName("bg.ao")
    public int field308;

    @ObfuscatedName("bg.au")
    public int field309;

    @ObfuscatedName("bg.ak")
    public int field310;

    public class44() {
        this.field304[0] = 0;
        this.field304[1] = 65535;
        this.field302[0] = 0;
        this.field302[1] = 65535;
    }

    @ObfuscatedName("bg.aq(Luq;)V")
    public final void method775(class534 arg0) {
        this.field301 = arg0.method8591();
        this.field307 = arg0.method8597();
        this.field303 = arg0.method8597();
        this.method766(arg0);
    }

    @ObfuscatedName("bg.aw(Luq;)V")
    public final void method766(class534 arg0) {
        this.field300 = arg0.method8591();
        this.field304 = new int[this.field300];
        this.field302 = new int[this.field300];
        for (int var2 = 0; var2 < this.field300; var2++) {
            this.field304[var2] = arg0.method8593();
            this.field302[var2] = arg0.method8593();
        }
    }

    @ObfuscatedName("bg.al()V")
    public final void method767() {
        this.field306 = 0;
        this.field305 = 0;
        this.field308 = 0;
        this.field309 = 0;
        this.field310 = 0;
    }

    @ObfuscatedName("bg.ai(I)I")
    public final int method768(int arg0) {
        if (this.field310 >= this.field306) {
            this.field309 = this.field302[this.field305++] << 15;
            if (this.field305 >= this.field300) {
                this.field305 = this.field300 - 1;
            }
            this.field306 = (int) ((double) this.field304[this.field305] / 65536.0D * (double) arg0);
            if (this.field306 > this.field310) {
                this.field308 = ((this.field302[this.field305] << 15) - this.field309) / (this.field306 - this.field310);
            }
        }
        this.field309 += this.field308;
        this.field310++;
        return this.field309 - this.field308 >> 15;
    }
}
