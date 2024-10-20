package deob;

@ObfuscatedName("cj")
public class class99 {

    @ObfuscatedName("cj.g")
    public int field1384 = 2;

    @ObfuscatedName("cj.r")
    public int[] field1385 = new int[2];

    @ObfuscatedName("cj.e")
    public int[] field1383 = new int[2];

    @ObfuscatedName("cj.q")
    public int field1388;

    @ObfuscatedName("cj.c")
    public int field1381;

    @ObfuscatedName("cj.l")
    public int field1386;

    @ObfuscatedName("cj.b")
    public int field1387;

    @ObfuscatedName("cj.w")
    public int field1382;

    @ObfuscatedName("cj.n")
    public int field1389;

    @ObfuscatedName("cj.i")
    public int field1390;

    @ObfuscatedName("cj.p")
    public int field1391;

    public class99() {
        this.field1385[0] = 0;
        this.field1385[1] = 65535;
        this.field1383[0] = 0;
        this.field1383[1] = 65535;
    }

    @ObfuscatedName("cj.g(Lgl;)V")
    public final void method2252(class185 arg0) {
        this.field1386 = arg0.method3679();
        this.field1388 = arg0.method3588();
        this.field1381 = arg0.method3588();
        this.method2249(arg0);
    }

    @ObfuscatedName("cj.r(Lgl;)V")
    public final void method2249(class185 arg0) {
        this.field1384 = arg0.method3679();
        this.field1385 = new int[this.field1384];
        this.field1383 = new int[this.field1384];
        for (int var2 = 0; var2 < this.field1384; var2++) {
            this.field1385[var2] = arg0.method3467();
            this.field1383[var2] = arg0.method3467();
        }
    }

    @ObfuscatedName("cj.e()V")
    public final void method2250() {
        this.field1387 = 0;
        this.field1382 = 0;
        this.field1389 = 0;
        this.field1390 = 0;
        this.field1391 = 0;
    }

    @ObfuscatedName("cj.q(I)I")
    public final int method2251(int arg0) {
        if (this.field1391 >= this.field1387) {
            this.field1390 = this.field1383[this.field1382++] << 15;
            if (this.field1382 >= this.field1384) {
                this.field1382 = this.field1384 - 1;
            }
            this.field1387 = (int) ((double) this.field1385[this.field1382] / 65536.0D * (double) arg0);
            if (this.field1387 > this.field1391) {
                this.field1389 = ((this.field1383[this.field1382] << 15) - this.field1390) / (this.field1387 - this.field1391);
            }
        }
        this.field1390 += this.field1389;
        this.field1391++;
        return this.field1390 - this.field1389 >> 15;
    }
}
