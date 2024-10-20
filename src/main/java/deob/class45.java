package deob;

@ObfuscatedName("ai")
public class class45 {

    @ObfuscatedName("ai.a")
    public int field321 = 2;

    @ObfuscatedName("ai.f")
    public int[] field320 = new int[2];

    @ObfuscatedName("ai.c")
    public int[] field325 = new int[2];

    @ObfuscatedName("ai.h")
    public int field322;

    @ObfuscatedName("ai.j")
    public int field323;

    @ObfuscatedName("ai.y")
    public int field329;

    @ObfuscatedName("ai.d")
    public int field324;

    @ObfuscatedName("ai.n")
    public int field319;

    @ObfuscatedName("ai.r")
    public int field326;

    @ObfuscatedName("ai.l")
    public int field327;

    @ObfuscatedName("ai.s")
    public int field328;

    public class45() {
        this.field320[0] = 0;
        this.field320[1] = 65535;
        this.field325[0] = 0;
        this.field325[1] = 65535;
    }

    @ObfuscatedName("ai.a(Lqr;)V")
    public final void method820(class464 arg0) {
        this.field324 = arg0.method7735();
        this.field322 = arg0.method7720();
        this.field323 = arg0.method7720();
        this.method826(arg0);
    }

    @ObfuscatedName("ai.f(Lqr;)V")
    public final void method826(class464 arg0) {
        this.field321 = arg0.method7735();
        this.field320 = new int[this.field321];
        this.field325 = new int[this.field321];
        for (int var2 = 0; var2 < this.field321; var2++) {
            this.field320[var2] = arg0.method7716();
            this.field325[var2] = arg0.method7716();
        }
    }

    @ObfuscatedName("ai.c()V")
    public final void method825() {
        this.field319 = 0;
        this.field326 = 0;
        this.field327 = 0;
        this.field328 = 0;
        this.field329 = 0;
    }

    @ObfuscatedName("ai.x(I)I")
    public final int method821(int arg0) {
        if (this.field329 >= this.field319) {
            this.field328 = this.field325[this.field326++] << 15;
            if (this.field326 >= this.field321) {
                this.field326 = this.field321 - 1;
            }
            this.field319 = (int) ((double) this.field320[this.field326] / 65536.0D * (double) arg0);
            if (this.field319 > this.field329) {
                this.field327 = ((this.field325[this.field326] << 15) - this.field328) / (this.field319 - this.field329);
            }
        }
        this.field328 += this.field327;
        this.field329++;
        return this.field328 - this.field327 >> 15;
    }
}
