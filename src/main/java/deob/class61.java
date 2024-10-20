package deob;

@ObfuscatedName("bt")
public class class61 {

    @ObfuscatedName("bt.k")
    public int field1266 = 2;

    @ObfuscatedName("bt.q")
    public int[] field1260 = new int[2];

    @ObfuscatedName("bt.f")
    public int[] field1261 = new int[2];

    @ObfuscatedName("bt.c")
    public int field1262;

    @ObfuscatedName("bt.v")
    public int field1263;

    @ObfuscatedName("bt.j")
    public int field1264;

    @ObfuscatedName("bt.m")
    public int field1259;

    @ObfuscatedName("bt.y")
    public int field1269;

    @ObfuscatedName("bt.u")
    public int field1265;

    @ObfuscatedName("bt.h")
    public int field1267;

    @ObfuscatedName("bt.l")
    public int field1268;

    public class61() {
        this.field1260[0] = 0;
        this.field1260[1] = 65535;
        this.field1261[0] = 0;
        this.field1261[1] = 65535;
    }

    @ObfuscatedName("bt.k(Lde;)V")
    public final void method1242(class123 arg0) {
        this.field1264 = arg0.method2427();
        this.field1262 = arg0.method2432();
        this.field1263 = arg0.method2432();
        this.method1239(arg0);
    }

    @ObfuscatedName("bt.q(Lde;)V")
    public final void method1239(class123 arg0) {
        this.field1266 = arg0.method2427();
        this.field1260 = new int[this.field1266];
        this.field1261 = new int[this.field1266];
        for (int var2 = 0; var2 < this.field1266; var2++) {
            this.field1260[var2] = arg0.method2547();
            this.field1261[var2] = arg0.method2547();
        }
    }

    @ObfuscatedName("bt.f()V")
    public final void method1240() {
        this.field1259 = 0;
        this.field1265 = 0;
        this.field1267 = 0;
        this.field1268 = 0;
        this.field1269 = 0;
    }

    @ObfuscatedName("bt.c(I)I")
    public final int method1241(int arg0) {
        if (this.field1269 >= this.field1259) {
            this.field1268 = this.field1261[this.field1265++] << 15;
            if (this.field1265 >= this.field1266) {
                this.field1265 = this.field1266 - 1;
            }
            this.field1259 = (int) ((double) this.field1260[this.field1265] / 65536.0D * (double) arg0);
            if (this.field1259 > this.field1269) {
                this.field1267 = ((this.field1261[this.field1265] << 15) - this.field1268) / (this.field1259 - this.field1269);
            }
        }
        this.field1268 += this.field1267;
        this.field1269++;
        return this.field1268 - this.field1267 >> 15;
    }
}
