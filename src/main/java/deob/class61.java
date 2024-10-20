package deob;

@ObfuscatedName("bo")
public class class61 {

    @ObfuscatedName("bo.a")
    public int field1278 = 2;

    @ObfuscatedName("bo.d")
    public int[] field1272 = new int[2];

    @ObfuscatedName("bo.v")
    public int[] field1271 = new int[2];

    @ObfuscatedName("bo.r")
    public int field1274;

    @ObfuscatedName("bo.z")
    public int field1281;

    @ObfuscatedName("bo.t")
    public int field1276;

    @ObfuscatedName("bo.n")
    public int field1277;

    @ObfuscatedName("bo.i")
    public int field1275;

    @ObfuscatedName("bo.g")
    public int field1279;

    @ObfuscatedName("bo.m")
    public int field1280;

    @ObfuscatedName("bo.k")
    public int field1273;

    public class61() {
        this.field1272[0] = 0;
        this.field1272[1] = 65535;
        this.field1271[0] = 0;
        this.field1271[1] = 65535;
    }

    @ObfuscatedName("bo.a(Ldb;)V")
    public final void method1264(class123 arg0) {
        this.field1276 = arg0.method2395();
        this.field1274 = arg0.method2400();
        this.field1281 = arg0.method2400();
        this.method1265(arg0);
    }

    @ObfuscatedName("bo.d(Ldb;)V")
    public final void method1265(class123 arg0) {
        this.field1278 = arg0.method2395();
        this.field1272 = new int[this.field1278];
        this.field1271 = new int[this.field1278];
        for (int var2 = 0; var2 < this.field1278; var2++) {
            this.field1272[var2] = arg0.method2584();
            this.field1271[var2] = arg0.method2584();
        }
    }

    @ObfuscatedName("bo.v()V")
    public final void method1271() {
        this.field1277 = 0;
        this.field1275 = 0;
        this.field1279 = 0;
        this.field1280 = 0;
        this.field1273 = 0;
    }

    @ObfuscatedName("bo.r(I)I")
    public final int method1266(int arg0) {
        if (this.field1273 >= this.field1277) {
            this.field1280 = this.field1271[this.field1275++] << 15;
            if (this.field1275 >= this.field1278) {
                this.field1275 = this.field1278 - 1;
            }
            this.field1277 = (int) ((double) this.field1272[this.field1275] / 65536.0D * (double) arg0);
            if (this.field1277 > this.field1273) {
                this.field1279 = ((this.field1271[this.field1275] << 15) - this.field1280) / (this.field1277 - this.field1273);
            }
        }
        this.field1280 += this.field1279;
        this.field1273++;
        return this.field1280 - this.field1279 >> 15;
    }
}
