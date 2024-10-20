package deob;

@ObfuscatedName("bo")
public class class61 {

    @ObfuscatedName("bo.m")
    public int field1273 = 2;

    @ObfuscatedName("bo.w")
    public int[] field1277 = new int[2];

    @ObfuscatedName("bo.e")
    public int[] field1279 = new int[2];

    @ObfuscatedName("bo.o")
    public int field1274;

    @ObfuscatedName("bo.g")
    public int field1275;

    @ObfuscatedName("bo.l")
    public int field1271;

    @ObfuscatedName("bo.j")
    public int field1281;

    @ObfuscatedName("bo.r")
    public int field1278;

    @ObfuscatedName("bo.k")
    public int field1272;

    @ObfuscatedName("bo.v")
    public int field1280;

    @ObfuscatedName("bo.h")
    public int field1276;

    public class61() {
        this.field1277[0] = 0;
        this.field1277[1] = 65535;
        this.field1279[0] = 0;
        this.field1279[1] = 65535;
    }

    @ObfuscatedName("bo.m(Ldj;)V")
    public final void method1273(class123 arg0) {
        this.field1271 = arg0.method2398();
        this.field1274 = arg0.method2419();
        this.field1275 = arg0.method2419();
        this.method1272(arg0);
    }

    @ObfuscatedName("bo.w(Ldj;)V")
    public final void method1272(class123 arg0) {
        this.field1273 = arg0.method2398();
        this.field1277 = new int[this.field1273];
        this.field1279 = new int[this.field1273];
        for (int var2 = 0; var2 < this.field1273; var2++) {
            this.field1277[var2] = arg0.method2548();
            this.field1279[var2] = arg0.method2548();
        }
    }

    @ObfuscatedName("bo.e()V")
    public final void method1281() {
        this.field1281 = 0;
        this.field1278 = 0;
        this.field1272 = 0;
        this.field1280 = 0;
        this.field1276 = 0;
    }

    @ObfuscatedName("bo.o(I)I")
    public final int method1274(int arg0) {
        if (this.field1276 >= this.field1281) {
            this.field1280 = this.field1279[this.field1278++] << 15;
            if (this.field1278 >= this.field1273) {
                this.field1278 = this.field1273 - 1;
            }
            this.field1281 = (int) ((double) this.field1277[this.field1278] / 65536.0D * (double) arg0);
            if (this.field1281 > this.field1276) {
                this.field1272 = ((this.field1279[this.field1278] << 15) - this.field1280) / (this.field1281 - this.field1276);
            }
        }
        this.field1280 += this.field1272;
        this.field1276++;
        return this.field1280 - this.field1272 >> 15;
    }
}
