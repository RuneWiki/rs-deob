package deob;

@ObfuscatedName("p")
public class class21 {

    @ObfuscatedName("p.q")
    public int field304 = 2;

    @ObfuscatedName("p.l")
    public int[] field297 = new int[2];

    @ObfuscatedName("p.a")
    public int[] field303 = new int[2];

    @ObfuscatedName("p.o")
    public int field299;

    @ObfuscatedName("p.c")
    public int field300;

    @ObfuscatedName("p.h")
    public int field301;

    @ObfuscatedName("p.r")
    public int field302;

    @ObfuscatedName("p.d")
    public int field305;

    @ObfuscatedName("p.k")
    public int field298;

    @ObfuscatedName("p.u")
    public int field296;

    @ObfuscatedName("p.v")
    public int field306;

    public class21() {
        this.field297[0] = 0;
        this.field297[1] = 65535;
        this.field303[0] = 0;
        this.field303[1] = 65535;
    }

    @ObfuscatedName("p.q(Let;)V")
    public final void method247(class136 arg0) {
        this.field301 = arg0.method1602();
        this.field299 = arg0.method1607();
        this.field300 = arg0.method1607();
        this.method253(arg0);
    }

    @ObfuscatedName("p.l(Let;)V")
    public final void method253(class136 arg0) {
        this.field304 = arg0.method1602();
        this.field297 = new int[this.field304];
        this.field303 = new int[this.field304];
        for (int var2 = 0; var2 < this.field304; var2++) {
            this.field297[var2] = arg0.method1712();
            this.field303[var2] = arg0.method1712();
        }
    }

    @ObfuscatedName("p.a()V")
    public final void method246() {
        this.field302 = 0;
        this.field305 = 0;
        this.field298 = 0;
        this.field296 = 0;
        this.field306 = 0;
    }

    @ObfuscatedName("p.o(I)I")
    public final int method250(int arg0) {
        if (this.field306 >= this.field302) {
            this.field296 = this.field303[this.field305++] << 15;
            if (this.field305 >= this.field304) {
                this.field305 = this.field304 - 1;
            }
            this.field302 = (int) ((double) this.field297[this.field305] / 65536.0D * (double) arg0);
            if (this.field302 > this.field306) {
                this.field298 = ((this.field303[this.field305] << 15) - this.field296) / (this.field302 - this.field306);
            }
        }
        this.field296 += this.field298;
        this.field306++;
        return this.field296 - this.field298 >> 15;
    }
}
