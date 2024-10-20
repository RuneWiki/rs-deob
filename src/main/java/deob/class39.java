package deob;

@ObfuscatedName("au")
public class class39 {

    @ObfuscatedName("au.n")
    public int field298 = 2;

    @ObfuscatedName("au.c")
    public int[] field291 = new int[2];

    @ObfuscatedName("au.m")
    public int[] field292 = new int[2];

    @ObfuscatedName("au.k")
    public int field293;

    @ObfuscatedName("au.o")
    public int field297;

    @ObfuscatedName("au.g")
    public int field294;

    @ObfuscatedName("au.z")
    public int field296;

    @ObfuscatedName("au.a")
    public int field299;

    @ObfuscatedName("au.u")
    public int field290;

    @ObfuscatedName("au.e")
    public int field295;

    @ObfuscatedName("au.l")
    public int field300;

    public class39() {
        this.field291[0] = 0;
        this.field291[1] = 65535;
        this.field292[0] = 0;
        this.field292[1] = 65535;
    }

    @ObfuscatedName("au.n(Lot;)V")
    public final void method740(class400 arg0) {
        this.field294 = arg0.method6217();
        this.field293 = arg0.method6222();
        this.field297 = arg0.method6222();
        this.method741(arg0);
    }

    @ObfuscatedName("au.c(Lot;)V")
    public final void method741(class400 arg0) {
        this.field298 = arg0.method6217();
        this.field291 = new int[this.field298];
        this.field292 = new int[this.field298];
        for (int var2 = 0; var2 < this.field298; var2++) {
            this.field291[var2] = arg0.method6219();
            this.field292[var2] = arg0.method6219();
        }
    }

    @ObfuscatedName("au.m()V")
    public final void method739() {
        this.field296 = 0;
        this.field299 = 0;
        this.field290 = 0;
        this.field295 = 0;
        this.field300 = 0;
    }

    @ObfuscatedName("au.k(I)I")
    public final int method743(int arg0) {
        if (this.field300 >= this.field296) {
            this.field295 = this.field292[this.field299++] << 15;
            if (this.field299 >= this.field298) {
                this.field299 = this.field298 - 1;
            }
            this.field296 = (int) ((double) this.field291[this.field299] / 65536.0D * (double) arg0);
            if (this.field296 > this.field300) {
                this.field290 = ((this.field292[this.field299] << 15) - this.field295) / (this.field296 - this.field300);
            }
        }
        this.field295 += this.field290;
        this.field300++;
        return this.field295 - this.field290 >> 15;
    }
}
