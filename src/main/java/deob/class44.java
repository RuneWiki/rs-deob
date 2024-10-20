package deob;

@ObfuscatedName("au")
public class class44 {

    @ObfuscatedName("au.f")
    public int field335 = 2;

    @ObfuscatedName("au.w")
    public int[] field328 = new int[2];

    @ObfuscatedName("au.v")
    public int[] field334 = new int[2];

    @ObfuscatedName("au.s")
    public int field330;

    @ObfuscatedName("au.z")
    public int field331;

    @ObfuscatedName("au.j")
    public int field332;

    @ObfuscatedName("au.i")
    public int field337;

    @ObfuscatedName("au.n")
    public int field329;

    @ObfuscatedName("au.l")
    public int field333;

    @ObfuscatedName("au.k")
    public int field336;

    @ObfuscatedName("au.c")
    public int field327;

    public class44() {
        this.field328[0] = 0;
        this.field328[1] = 65535;
        this.field334[0] = 0;
        this.field334[1] = 65535;
    }

    @ObfuscatedName("au.f(Lrd;)V")
    public final void method814(class474 arg0) {
        this.field332 = arg0.method7964();
        this.field330 = arg0.method7979();
        this.field331 = arg0.method7979();
        this.method813(arg0);
    }

    @ObfuscatedName("au.w(Lrd;)V")
    public final void method813(class474 arg0) {
        this.field335 = arg0.method7964();
        this.field328 = new int[this.field335];
        this.field334 = new int[this.field335];
        for (int var2 = 0; var2 < this.field335; var2++) {
            this.field328[var2] = arg0.method8032();
            this.field334[var2] = arg0.method8032();
        }
    }

    @ObfuscatedName("au.v()V")
    public final void method815() {
        this.field337 = 0;
        this.field329 = 0;
        this.field333 = 0;
        this.field336 = 0;
        this.field327 = 0;
    }

    @ObfuscatedName("au.s(I)I")
    public final int method816(int arg0) {
        if (this.field327 >= this.field337) {
            this.field336 = this.field334[this.field329++] << 15;
            if (this.field329 >= this.field335) {
                this.field329 = this.field335 - 1;
            }
            this.field337 = (int) ((double) this.field328[this.field329] / 65536.0D * (double) arg0);
            if (this.field337 > this.field327) {
                this.field333 = ((this.field334[this.field329] << 15) - this.field336) / (this.field337 - this.field327);
            }
        }
        this.field336 += this.field333;
        this.field327++;
        return this.field336 - this.field333 >> 15;
    }
}
