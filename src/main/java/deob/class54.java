package deob;

@ObfuscatedName("bx")
public class class54 {

    @ObfuscatedName("bx.f")
    public int field430 = 2;

    @ObfuscatedName("bx.e")
    public int[] field421 = new int[2];

    @ObfuscatedName("bx.v")
    public int[] field423 = new int[2];

    @ObfuscatedName("bx.y")
    public int field422;

    @ObfuscatedName("bx.j")
    public int field426;

    @ObfuscatedName("bx.o")
    public int field424;

    @ObfuscatedName("bx.m")
    public int field425;

    @ObfuscatedName("bx.r")
    public int field420;

    @ObfuscatedName("bx.h")
    public int field427;

    @ObfuscatedName("bx.d")
    public int field428;

    @ObfuscatedName("bx.z")
    public int field429;

    public class54() {
        this.field421[0] = 0;
        this.field421[1] = 65535;
        this.field423[0] = 0;
        this.field423[1] = 65535;
    }

    @ObfuscatedName("bx.f(Lnt;)V")
    public final void method716(class384 arg0) {
        this.field425 = arg0.method5902();
        this.field426 = arg0.method5965();
        this.field424 = arg0.method5965();
        this.method718(arg0);
    }

    @ObfuscatedName("bx.e(Lnt;)V")
    public final void method718(class384 arg0) {
        this.field430 = arg0.method5902();
        this.field421 = new int[this.field430];
        this.field423 = new int[this.field430];
        for (int var2 = 0; var2 < this.field430; var2++) {
            this.field421[var2] = arg0.method5899();
            this.field423[var2] = arg0.method5899();
        }
    }

    @ObfuscatedName("bx.v()V")
    public final void method726() {
        this.field420 = 0;
        this.field427 = 0;
        this.field428 = 0;
        this.field429 = 0;
        this.field422 = 0;
    }

    @ObfuscatedName("bx.y(I)I")
    public final int method719(int arg0) {
        if (this.field422 >= this.field420) {
            this.field429 = this.field423[this.field427++] << 15;
            if (this.field427 >= this.field430) {
                this.field427 = this.field430 - 1;
            }
            this.field420 = (int) ((double) this.field421[this.field427] / 65536.0D * (double) arg0);
            if (this.field420 > this.field422) {
                this.field428 = ((this.field423[this.field427] << 15) - this.field429) / (this.field420 - this.field422);
            }
        }
        this.field429 += this.field428;
        this.field422++;
        return this.field429 - this.field428 >> 15;
    }
}
