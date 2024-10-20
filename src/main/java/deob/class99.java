package deob;

@ObfuscatedName("cl")
public class class99 {

    @ObfuscatedName("cl.f")
    public int field1385 = 2;

    @ObfuscatedName("cl.l")
    public int[] field1378 = new int[2];

    @ObfuscatedName("cl.w")
    public int[] field1379 = new int[2];

    @ObfuscatedName("cl.s")
    public int field1380;

    @ObfuscatedName("cl.e")
    public int field1381;

    @ObfuscatedName("cl.a")
    public int field1377;

    @ObfuscatedName("cl.c")
    public int field1383;

    @ObfuscatedName("cl.p")
    public int field1382;

    @ObfuscatedName("cl.r")
    public int field1386;

    @ObfuscatedName("cl.m")
    public int field1384;

    @ObfuscatedName("cl.d")
    public int field1387;

    public class99() {
        this.field1378[0] = 0;
        this.field1378[1] = 65535;
        this.field1379[0] = 0;
        this.field1379[1] = 65535;
    }

    @ObfuscatedName("cl.f(Lgm;)V")
    public final void method2126(class185 arg0) {
        this.field1377 = arg0.method3344();
        this.field1380 = arg0.method3432();
        this.field1381 = arg0.method3432();
        this.method2127(arg0);
    }

    @ObfuscatedName("cl.l(Lgm;)V")
    public final void method2127(class185 arg0) {
        this.field1385 = arg0.method3344();
        this.field1378 = new int[this.field1385];
        this.field1379 = new int[this.field1385];
        for (int var2 = 0; var2 < this.field1385; var2++) {
            this.field1378[var2] = arg0.method3346();
            this.field1379[var2] = arg0.method3346();
        }
    }

    @ObfuscatedName("cl.w()V")
    public final void method2133() {
        this.field1383 = 0;
        this.field1382 = 0;
        this.field1386 = 0;
        this.field1384 = 0;
        this.field1387 = 0;
    }

    @ObfuscatedName("cl.s(I)I")
    public final int method2128(int arg0) {
        if (this.field1387 >= this.field1383) {
            this.field1384 = this.field1379[this.field1382++] << 15;
            if (this.field1382 >= this.field1385) {
                this.field1382 = this.field1385 - 1;
            }
            this.field1383 = (int) ((double) this.field1378[this.field1382] / 65536.0D * (double) arg0);
            if (this.field1383 > this.field1387) {
                this.field1386 = ((this.field1379[this.field1382] << 15) - this.field1384) / (this.field1383 - this.field1387);
            }
        }
        this.field1384 += this.field1386;
        this.field1387++;
        return this.field1384 - this.field1386 >> 15;
    }
}
