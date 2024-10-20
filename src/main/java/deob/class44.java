package deob;

@ObfuscatedName("bk")
public class class44 {

    @ObfuscatedName("bk.at")
    public int field303 = 2;

    @ObfuscatedName("bk.an")
    public int[] field307 = new int[2];

    @ObfuscatedName("bk.av")
    public int[] field305 = new int[2];

    @ObfuscatedName("bk.as")
    public int field302;

    @ObfuscatedName("bk.ax")
    public int field306;

    @ObfuscatedName("bk.ap")
    public int field304;

    @ObfuscatedName("bk.ab")
    public int field308;

    @ObfuscatedName("bk.ak")
    public int field309;

    @ObfuscatedName("bk.ae")
    public int field310;

    @ObfuscatedName("bk.af")
    public int field311;

    @ObfuscatedName("bk.ao")
    public int field312;

    public class44() {
        this.field307[0] = 0;
        this.field307[1] = 65535;
        this.field305[0] = 0;
        this.field305[1] = 65535;
    }

    @ObfuscatedName("bk.at(Ltz;)V")
    public final void method781(class501 arg0) {
        this.field304 = arg0.method8129();
        this.field302 = arg0.method8134();
        this.field306 = arg0.method8134();
        this.method775(arg0);
    }

    @ObfuscatedName("bk.an(Ltz;)V")
    public final void method775(class501 arg0) {
        this.field303 = arg0.method8129();
        this.field307 = new int[this.field303];
        this.field305 = new int[this.field303];
        for (int var2 = 0; var2 < this.field303; var2++) {
            this.field307[var2] = arg0.method8195();
            this.field305[var2] = arg0.method8195();
        }
    }

    @ObfuscatedName("bk.av()V")
    public final void method776() {
        this.field308 = 0;
        this.field309 = 0;
        this.field310 = 0;
        this.field311 = 0;
        this.field312 = 0;
    }

    @ObfuscatedName("bk.as(I)I")
    public final int method777(int arg0) {
        if (this.field312 >= this.field308) {
            this.field311 = this.field305[this.field309++] << 15;
            if (this.field309 >= this.field303) {
                this.field309 = this.field303 - 1;
            }
            this.field308 = (int) ((double) this.field307[this.field309] / 65536.0D * (double) arg0);
            if (this.field308 > this.field312) {
                this.field310 = ((this.field305[this.field309] << 15) - this.field311) / (this.field308 - this.field312);
            }
        }
        this.field311 += this.field310;
        this.field312++;
        return this.field311 - this.field310 >> 15;
    }
}
