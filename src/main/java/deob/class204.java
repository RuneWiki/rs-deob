package deob;

@ObfuscatedName("gg")
public class class204 extends class210 {

    @ObfuscatedName("gg.v")
    public int field2284;

    @ObfuscatedName("gg.c")
    public int field2283;

    @ObfuscatedName("gg.i")
    public int field2285;

    @ObfuscatedName("gg.f")
    public int field2286;

    @ObfuscatedName("gg.v(Lpi;I)V")
    public void method3856(class438 arg0) {
        int var2 = arg0.method6971();
        if (class216.field2388.field2385 != var2) {
            throw new IllegalStateException("");
        }
        this.field2345 = arg0.method6971();
        this.field2334 = arg0.method6971();
        this.field2344 = arg0.method7148();
        this.field2339 = arg0.method7148();
        this.field2284 = arg0.method6971();
        this.field2283 = arg0.method6971();
        this.field2336 = arg0.method7148();
        this.field2337 = arg0.method7148();
        this.field2285 = arg0.method6971();
        this.field2286 = arg0.method6971();
        this.field2340 = arg0.method6989();
        this.field2341 = arg0.method6989();
    }

    @ObfuscatedName("gg.c(Lpi;I)V")
    public void method3548(class438 arg0) {
        this.field2334 = Math.min(this.field2334, 4);
        this.field2342 = new short[1][64][64];
        this.field2338 = new short[this.field2334][64][64];
        this.field2335 = new byte[this.field2334][64][64];
        this.field2343 = new byte[this.field2334][64][64];
        this.field2346 = new class212[this.field2334][64][64][];
        int var2 = arg0.method6971();
        if (class215.field2379.field2383 != var2) {
            throw new IllegalStateException("");
        }
        int var3 = arg0.method6971();
        int var4 = arg0.method6971();
        int var5 = arg0.method6971();
        int var6 = arg0.method6971();
        if (this.field2336 != var3 || this.field2337 != var4 || this.field2285 != var5 || this.field2286 != var6) {
            throw new IllegalStateException("");
        }
        for (int var7 = 0; var7 < 8; var7++) {
            for (int var8 = 0; var8 < 8; var8++) {
                this.method3905(this.field2285 * 8 + var7, this.field2286 * 8 + var8, arg0);
            }
        }
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof class204)) {
            return false;
        }
        class204 var2 = (class204) arg0;
        if (this.field2336 == var2.field2336 && this.field2337 == var2.field2337) {
            return this.field2285 == var2.field2285 && this.field2286 == var2.field2286;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field2336 | this.field2337 << 8 | this.field2285 << 16 | this.field2286 << 24;
    }

    @ObfuscatedName("gg.i(B)I")
    public int method3858() {
        return this.field2284;
    }

    @ObfuscatedName("gg.f(I)I")
    public int method3859() {
        return this.field2283;
    }

    @ObfuscatedName("gg.n(I)I")
    public int method3860() {
        return this.field2285;
    }

    @ObfuscatedName("gg.s(I)I")
    public int method3867() {
        return this.field2286;
    }
}
