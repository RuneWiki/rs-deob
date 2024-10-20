package deob;

@ObfuscatedName("be")
public class class61 {

    @ObfuscatedName("be.l")
    public int field1276 = 2;

    @ObfuscatedName("be.g")
    public int[] field1277 = new int[2];

    @ObfuscatedName("be.r")
    public int[] field1272 = new int[2];

    @ObfuscatedName("be.e")
    public int field1273;

    @ObfuscatedName("be.h")
    public int field1274;

    @ObfuscatedName("be.s")
    public int field1275;

    @ObfuscatedName("be.k")
    public int field1280;

    @ObfuscatedName("be.u")
    public int field1270;

    @ObfuscatedName("be.n")
    public int field1278;

    @ObfuscatedName("be.b")
    public int field1279;

    @ObfuscatedName("be.m")
    public int field1271;

    public class61() {
        this.field1277[0] = 0;
        this.field1277[1] = 65535;
        this.field1272[0] = 0;
        this.field1272[1] = 65535;
    }

    @ObfuscatedName("be.l(Ldc;)V")
    public final void method1336(class123 arg0) {
        this.field1275 = arg0.method2490();
        this.field1273 = arg0.method2477();
        this.field1274 = arg0.method2477();
        this.method1331(arg0);
    }

    @ObfuscatedName("be.g(Ldc;)V")
    public final void method1331(class123 arg0) {
        this.field1276 = arg0.method2490();
        this.field1277 = new int[this.field1276];
        this.field1272 = new int[this.field1276];
        for (int var2 = 0; var2 < this.field1276; var2++) {
            this.field1277[var2] = arg0.method2492();
            this.field1272[var2] = arg0.method2492();
        }
    }

    @ObfuscatedName("be.r()V")
    public final void method1332() {
        this.field1280 = 0;
        this.field1270 = 0;
        this.field1278 = 0;
        this.field1279 = 0;
        this.field1271 = 0;
    }

    @ObfuscatedName("be.e(I)I")
    public final int method1333(int arg0) {
        if (this.field1271 >= this.field1280) {
            this.field1279 = this.field1272[this.field1270++] << 15;
            if (this.field1270 >= this.field1276) {
                this.field1270 = this.field1276 - 1;
            }
            this.field1280 = (int) ((double) this.field1277[this.field1270] / 65536.0D * (double) arg0);
            if (this.field1280 > this.field1271) {
                this.field1278 = ((this.field1272[this.field1270] << 15) - this.field1279) / (this.field1280 - this.field1271);
            }
        }
        this.field1279 += this.field1278;
        this.field1271++;
        return this.field1279 - this.field1278 >> 15;
    }
}
