package deob;

@ObfuscatedName("bt")
public class class61 {

    @ObfuscatedName("bt.f")
    public int field1245 = 2;

    @ObfuscatedName("bt.e")
    public int[] field1250 = new int[2];

    @ObfuscatedName("bt.n")
    public int[] field1247 = new int[2];

    @ObfuscatedName("bt.t")
    public int field1248;

    @ObfuscatedName("bt.v")
    public int field1249;

    @ObfuscatedName("bt.b")
    public int field1252;

    @ObfuscatedName("bt.m")
    public int field1251;

    @ObfuscatedName("bt.k")
    public int field1246;

    @ObfuscatedName("bt.c")
    public int field1253;

    @ObfuscatedName("bt.w")
    public int field1254;

    @ObfuscatedName("bt.l")
    public int field1255;

    public class61() {
        this.field1250[0] = 0;
        this.field1250[1] = 65535;
        this.field1247[0] = 0;
        this.field1247[1] = 65535;
    }

    @ObfuscatedName("bt.f(Ldx;)V")
    public final void method1264(class123 arg0) {
        this.field1252 = arg0.method2522();
        this.field1248 = arg0.method2404();
        this.field1249 = arg0.method2404();
        this.method1257(arg0);
    }

    @ObfuscatedName("bt.e(Ldx;)V")
    public final void method1257(class123 arg0) {
        this.field1245 = arg0.method2522();
        this.field1250 = new int[this.field1245];
        this.field1247 = new int[this.field1245];
        for (int var2 = 0; var2 < this.field1245; var2++) {
            this.field1250[var2] = arg0.method2401();
            this.field1247[var2] = arg0.method2401();
        }
    }

    @ObfuscatedName("bt.n()V")
    public final void method1258() {
        this.field1251 = 0;
        this.field1246 = 0;
        this.field1253 = 0;
        this.field1254 = 0;
        this.field1255 = 0;
    }

    @ObfuscatedName("bt.t(I)I")
    public final int method1259(int arg0) {
        if (this.field1255 >= this.field1251) {
            this.field1254 = this.field1247[this.field1246++] << 15;
            if (this.field1246 >= this.field1245) {
                this.field1246 = this.field1245 - 1;
            }
            this.field1251 = (int) ((double) this.field1250[this.field1246] / 65536.0D * (double) arg0);
            if (this.field1251 > this.field1255) {
                this.field1253 = ((this.field1247[this.field1246] << 15) - this.field1254) / (this.field1251 - this.field1255);
            }
        }
        this.field1254 += this.field1253;
        this.field1255++;
        return this.field1254 - this.field1253 >> 15;
    }
}
