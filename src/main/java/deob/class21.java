package deob;

@ObfuscatedName("o")
public class class21 {

    @ObfuscatedName("o.t")
    public int field301 = 2;

    @ObfuscatedName("o.n")
    public int[] field291 = new int[2];

    @ObfuscatedName("o.q")
    public int[] field293 = new int[2];

    @ObfuscatedName("o.h")
    public int field300;

    @ObfuscatedName("o.k")
    public int field295;

    @ObfuscatedName("o.r")
    public int field296;

    @ObfuscatedName("o.l")
    public int field297;

    @ObfuscatedName("o.i")
    public int field298;

    @ObfuscatedName("o.e")
    public int field299;

    @ObfuscatedName("o.a")
    public int field292;

    @ObfuscatedName("o.g")
    public int field294;

    public class21() {
        this.field291[0] = 0;
        this.field291[1] = 65535;
        this.field293[0] = 0;
        this.field293[1] = 65535;
    }

    @ObfuscatedName("o.t(Lec;)V")
    public final void method282(class135 arg0) {
        this.field296 = arg0.method1571();
        this.field300 = arg0.method1616();
        this.field295 = arg0.method1616();
        this.method274(arg0);
    }

    @ObfuscatedName("o.n(Lec;)V")
    public final void method274(class135 arg0) {
        this.field301 = arg0.method1571();
        this.field291 = new int[this.field301];
        this.field293 = new int[this.field301];
        for (int var2 = 0; var2 < this.field301; var2++) {
            this.field291[var2] = arg0.method1725();
            this.field293[var2] = arg0.method1725();
        }
    }

    @ObfuscatedName("o.q()V")
    public final void method276() {
        this.field297 = 0;
        this.field298 = 0;
        this.field299 = 0;
        this.field292 = 0;
        this.field294 = 0;
    }

    @ObfuscatedName("o.h(I)I")
    public final int method277(int arg0) {
        if (this.field294 >= this.field297) {
            this.field292 = this.field293[this.field298++] << 15;
            if (this.field298 >= this.field301) {
                this.field298 = this.field301 - 1;
            }
            this.field297 = (int) ((double) this.field291[this.field298] / 65536.0D * (double) arg0);
            if (this.field297 > this.field294) {
                this.field299 = ((this.field293[this.field298] << 15) - this.field292) / (this.field297 - this.field294);
            }
        }
        this.field292 += this.field299;
        this.field294++;
        return this.field292 - this.field299 >> 15;
    }
}
