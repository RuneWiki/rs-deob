package deob;

@ObfuscatedName("ar")
public class class39 {

    @ObfuscatedName("ar.l")
    public int field292 = 2;

    @ObfuscatedName("ar.q")
    public int[] field290 = new int[2];

    @ObfuscatedName("ar.f")
    public int[] field291 = new int[2];

    @ObfuscatedName("ar.j")
    public int field294;

    @ObfuscatedName("ar.m")
    public int field296;

    @ObfuscatedName("ar.k")
    public int field293;

    @ObfuscatedName("ar.t")
    public int field295;

    @ObfuscatedName("ar.a")
    public int field289;

    @ObfuscatedName("ar.e")
    public int field297;

    @ObfuscatedName("ar.i")
    public int field298;

    @ObfuscatedName("ar.y")
    public int field299;

    public class39() {
        this.field290[0] = 0;
        this.field290[1] = 65535;
        this.field291[0] = 0;
        this.field291[1] = 65535;
    }

    @ObfuscatedName("ar.l(Lot;)V")
    public final void method727(class401 arg0) {
        this.field293 = arg0.method6272();
        this.field294 = arg0.method6277();
        this.field296 = arg0.method6277();
        this.method726(arg0);
    }

    @ObfuscatedName("ar.q(Lot;)V")
    public final void method726(class401 arg0) {
        this.field292 = arg0.method6272();
        this.field290 = new int[this.field292];
        this.field291 = new int[this.field292];
        for (int var2 = 0; var2 < this.field292; var2++) {
            this.field290[var2] = arg0.method6284();
            this.field291[var2] = arg0.method6284();
        }
    }

    @ObfuscatedName("ar.f()V")
    public final void method721() {
        this.field295 = 0;
        this.field289 = 0;
        this.field297 = 0;
        this.field298 = 0;
        this.field299 = 0;
    }

    @ObfuscatedName("ar.j(I)I")
    public final int method722(int arg0) {
        if (this.field299 >= this.field295) {
            this.field298 = this.field291[this.field289++] << 15;
            if (this.field289 >= this.field292) {
                this.field289 = this.field292 - 1;
            }
            this.field295 = (int) ((double) this.field290[this.field289] / 65536.0D * (double) arg0);
            if (this.field295 > this.field299) {
                this.field297 = ((this.field291[this.field289] << 15) - this.field298) / (this.field295 - this.field299);
            }
        }
        this.field298 += this.field297;
        this.field299++;
        return this.field298 - this.field297 >> 15;
    }
}
