package deob;

@ObfuscatedName("ca")
public class class99 {

    @ObfuscatedName("ca.c")
    public int field1389 = 2;

    @ObfuscatedName("ca.q")
    public int[] field1380 = new int[2];

    @ObfuscatedName("ca.m")
    public int[] field1381 = new int[2];

    @ObfuscatedName("ca.j")
    public int field1382;

    @ObfuscatedName("ca.g")
    public int field1383;

    @ObfuscatedName("ca.i")
    public int field1384;

    @ObfuscatedName("ca.h")
    public int field1385;

    @ObfuscatedName("ca.l")
    public int field1386;

    @ObfuscatedName("ca.d")
    public int field1387;

    @ObfuscatedName("ca.o")
    public int field1388;

    @ObfuscatedName("ca.s")
    public int field1379;

    public class99() {
        this.field1380[0] = 0;
        this.field1380[1] = 65535;
        this.field1381[0] = 0;
        this.field1381[1] = 65535;
    }

    @ObfuscatedName("ca.c(Lgg;)V")
    public final void method2028(class185 arg0) {
        this.field1384 = arg0.method3243();
        this.field1382 = arg0.method3323();
        this.field1383 = arg0.method3323();
        this.method2038(arg0);
    }

    @ObfuscatedName("ca.q(Lgg;)V")
    public final void method2038(class185 arg0) {
        this.field1389 = arg0.method3243();
        this.field1380 = new int[this.field1389];
        this.field1381 = new int[this.field1389];
        for (int var2 = 0; var2 < this.field1389; var2++) {
            this.field1380[var2] = arg0.method3245();
            this.field1381[var2] = arg0.method3245();
        }
    }

    @ObfuscatedName("ca.m()V")
    public final void method2029() {
        this.field1385 = 0;
        this.field1386 = 0;
        this.field1387 = 0;
        this.field1388 = 0;
        this.field1379 = 0;
    }

    @ObfuscatedName("ca.j(I)I")
    public final int method2031(int arg0) {
        if (this.field1379 >= this.field1385) {
            this.field1388 = this.field1381[this.field1386++] << 15;
            if (this.field1386 >= this.field1389) {
                this.field1386 = this.field1389 - 1;
            }
            this.field1385 = (int) ((double) this.field1380[this.field1386] / 65536.0D * (double) arg0);
            if (this.field1385 > this.field1379) {
                this.field1387 = ((this.field1381[this.field1386] << 15) - this.field1388) / (this.field1385 - this.field1379);
            }
        }
        this.field1388 += this.field1387;
        this.field1379++;
        return this.field1388 - this.field1387 >> 15;
    }
}
