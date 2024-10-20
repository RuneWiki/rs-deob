package deob;

@ObfuscatedName("ab")
public class class39 {

    @ObfuscatedName("ab.i")
    public int field277 = 2;

    @ObfuscatedName("ab.w")
    public int[] field276 = new int[2];

    @ObfuscatedName("ab.s")
    public int[] field278 = new int[2];

    @ObfuscatedName("ab.a")
    public int field275;

    @ObfuscatedName("ab.o")
    public int field283;

    @ObfuscatedName("ab.g")
    public int field280;

    @ObfuscatedName("ab.e")
    public int field281;

    @ObfuscatedName("ab.p")
    public int field282;

    @ObfuscatedName("ab.j")
    public int field284;

    @ObfuscatedName("ab.b")
    public int field279;

    @ObfuscatedName("ab.y")
    public int field285;

    public class39() {
        this.field276[0] = 0;
        this.field276[1] = 65535;
        this.field278[0] = 0;
        this.field278[1] = 65535;
    }

    @ObfuscatedName("ab.i(Lop;)V")
    public final void method747(class401 arg0) {
        this.field280 = arg0.method6240();
        this.field275 = arg0.method6245();
        this.field283 = arg0.method6245();
        this.method737(arg0);
    }

    @ObfuscatedName("ab.w(Lop;)V")
    public final void method737(class401 arg0) {
        this.field277 = arg0.method6240();
        this.field276 = new int[this.field277];
        this.field278 = new int[this.field277];
        for (int var2 = 0; var2 < this.field277; var2++) {
            this.field276[var2] = arg0.method6242();
            this.field278[var2] = arg0.method6242();
        }
    }

    @ObfuscatedName("ab.s()V")
    public final void method738() {
        this.field281 = 0;
        this.field282 = 0;
        this.field284 = 0;
        this.field279 = 0;
        this.field285 = 0;
    }

    @ObfuscatedName("ab.a(I)I")
    public final int method752(int arg0) {
        if (this.field285 >= this.field281) {
            this.field279 = this.field278[this.field282++] << 15;
            if (this.field282 >= this.field277) {
                this.field282 = this.field277 - 1;
            }
            this.field281 = (int) ((double) this.field276[this.field282] / 65536.0D * (double) arg0);
            if (this.field281 > this.field285) {
                this.field284 = ((this.field278[this.field282] << 15) - this.field279) / (this.field281 - this.field285);
            }
        }
        this.field279 += this.field284;
        this.field285++;
        return this.field279 - this.field284 >> 15;
    }
}
