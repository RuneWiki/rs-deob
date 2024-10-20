package deob;

@ObfuscatedName("by")
public class class44 {

    @ObfuscatedName("by.aj")
    public int field317 = 2;

    @ObfuscatedName("by.al")
    public int[] field311 = new int[2];

    @ObfuscatedName("by.ac")
    public int[] field307 = new int[2];

    @ObfuscatedName("by.ab")
    public int field310;

    @ObfuscatedName("by.an")
    public int field316;

    @ObfuscatedName("by.ao")
    public int field312;

    @ObfuscatedName("by.av")
    public int field313;

    @ObfuscatedName("by.aq")
    public int field314;

    @ObfuscatedName("by.ap")
    public int field315;

    @ObfuscatedName("by.ar")
    public int field308;

    @ObfuscatedName("by.ak")
    public int field309;

    public class44() {
        this.field311[0] = 0;
        this.field311[1] = 65535;
        this.field307[0] = 0;
        this.field307[1] = 65535;
    }

    @ObfuscatedName("by.aj(Lsy;)V")
    public final void method791(class478 arg0) {
        this.field312 = arg0.method7909();
        this.field310 = arg0.method7908();
        this.field316 = arg0.method7908();
        this.method790(arg0);
    }

    @ObfuscatedName("by.al(Lsy;)V")
    public final void method790(class478 arg0) {
        this.field317 = arg0.method7909();
        this.field311 = new int[this.field317];
        this.field307 = new int[this.field317];
        for (int var2 = 0; var2 < this.field317; var2++) {
            this.field311[var2] = arg0.method7905();
            this.field307[var2] = arg0.method7905();
        }
    }

    @ObfuscatedName("by.ac()V")
    public final void method796() {
        this.field313 = 0;
        this.field314 = 0;
        this.field315 = 0;
        this.field308 = 0;
        this.field309 = 0;
    }

    @ObfuscatedName("by.ab(I)I")
    public final int method793(int arg0) {
        if (this.field309 >= this.field313) {
            this.field308 = this.field307[this.field314++] << 15;
            if (this.field314 >= this.field317) {
                this.field314 = this.field317 - 1;
            }
            this.field313 = (int) ((double) this.field311[this.field314] / 65536.0D * (double) arg0);
            if (this.field313 > this.field309) {
                this.field315 = ((this.field307[this.field314] << 15) - this.field308) / (this.field313 - this.field309);
            }
        }
        this.field308 += this.field315;
        this.field309++;
        return this.field308 - this.field315 >> 15;
    }
}
