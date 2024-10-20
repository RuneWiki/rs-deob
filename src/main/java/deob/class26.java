package deob;

@ObfuscatedName("g")
public class class26 {

    @ObfuscatedName("g.s")
    public int field206 = 2;

    @ObfuscatedName("g.t")
    public int[] field205 = new int[2];

    @ObfuscatedName("g.v")
    public int[] field203 = new int[2];

    @ObfuscatedName("g.j")
    public int field208;

    @ObfuscatedName("g.l")
    public int field207;

    @ObfuscatedName("g.n")
    public int field213;

    @ObfuscatedName("g.w")
    public int field204;

    @ObfuscatedName("g.f")
    public int field210;

    @ObfuscatedName("g.o")
    public int field211;

    @ObfuscatedName("g.r")
    public int field212;

    @ObfuscatedName("g.p")
    public int field209;

    public class26() {
        this.field205[0] = 0;
        this.field205[1] = 65535;
        this.field203[0] = 0;
        this.field203[1] = 65535;
    }

    @ObfuscatedName("g.s(Lnv;)V")
    public final void method488(class385 arg0) {
        this.field213 = arg0.method5958();
        this.field208 = arg0.method6182();
        this.field207 = arg0.method6182();
        this.method498(arg0);
    }

    @ObfuscatedName("g.t(Lnv;)V")
    public final void method498(class385 arg0) {
        this.field206 = arg0.method5958();
        this.field205 = new int[this.field206];
        this.field203 = new int[this.field206];
        for (int var2 = 0; var2 < this.field206; var2++) {
            this.field205[var2] = arg0.method6053();
            this.field203[var2] = arg0.method6053();
        }
    }

    @ObfuscatedName("g.v()V")
    public final void method490() {
        this.field204 = 0;
        this.field210 = 0;
        this.field211 = 0;
        this.field212 = 0;
        this.field209 = 0;
    }

    @ObfuscatedName("g.j(I)I")
    public final int method491(int arg0) {
        if (this.field209 >= this.field204) {
            this.field212 = this.field203[this.field210++] << 15;
            if (this.field210 >= this.field206) {
                this.field210 = this.field206 - 1;
            }
            this.field204 = (int) ((double) this.field205[this.field210] / 65536.0D * (double) arg0);
            if (this.field204 > this.field209) {
                this.field211 = ((this.field203[this.field210] << 15) - this.field212) / (this.field204 - this.field209);
            }
        }
        this.field212 += this.field211;
        this.field209++;
        return this.field212 - this.field211 >> 15;
    }
}
