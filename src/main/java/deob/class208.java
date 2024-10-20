package deob;

@ObfuscatedName("gk")
public class class208 implements class221 {

    @ObfuscatedName("gk.v")
    public int field2317;

    @ObfuscatedName("gk.c")
    public int field2308;

    @ObfuscatedName("gk.i")
    public int field2313;

    @ObfuscatedName("gk.f")
    public int field2310;

    @ObfuscatedName("gk.b")
    public int field2315;

    @ObfuscatedName("gk.n")
    public int field2312;

    @ObfuscatedName("gk.s")
    public int field2307;

    @ObfuscatedName("gk.l")
    public int field2314;

    @ObfuscatedName("gk.q")
    public int field2321;

    @ObfuscatedName("gk.o")
    public int field2316;

    @ObfuscatedName("gk.r")
    public int field2309;

    @ObfuscatedName("gk.p")
    public int field2318;

    @ObfuscatedName("gk.w")
    public int field2311;

    @ObfuscatedName("gk.k")
    public int field2320;

    @ObfuscatedName("gk.v(Lgu;I)V")
    public void method3590(class201 arg0) {
        if (arg0.field2243 > this.field2315) {
            arg0.field2243 = this.field2315;
        }
        if (arg0.field2249 < this.field2315) {
            arg0.field2249 = this.field2315;
        }
        if (arg0.field2245 > this.field2312) {
            arg0.field2245 = this.field2312;
        }
        if (arg0.field2246 < this.field2312) {
            arg0.field2246 = this.field2312;
        }
    }

    @ObfuscatedName("gk.c(IIII)Z")
    public boolean method3597(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field2317 && arg0 < this.field2317 + this.field2308) {
            return arg1 >= (this.field2313 << 6) + (this.field2307 << 3) && arg1 <= (this.field2321 << 3) + (this.field2313 << 6) + 7 && arg2 >= (this.field2314 << 3) + (this.field2310 << 6) && arg2 <= (this.field2316 << 3) + (this.field2310 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("gk.i(III)Z")
    public boolean method3602(int arg0, int arg1) {
        return arg0 >= (this.field2315 << 6) + (this.field2309 << 3) && arg0 <= (this.field2315 << 6) + (this.field2311 << 3) + 7 && arg1 >= (this.field2318 << 3) + (this.field2312 << 6) && arg1 <= (this.field2320 << 3) + (this.field2312 << 6) + 7;
    }

    @ObfuscatedName("gk.f(IIII)[I")
    public int[] method3592(int arg0, int arg1, int arg2) {
        return this.method3597(arg0, arg1, arg2) ? new int[] { this.field2309 * 8 - this.field2307 * 8 + this.field2315 * 64 - this.field2313 * 64 + arg1, this.field2318 * 8 - this.field2314 * 8 + this.field2312 * 64 - this.field2310 * 64 + arg2 } : null;
    }

    @ObfuscatedName("gk.b(III)Lks;")
    public class290 method3606(int arg0, int arg1) {
        if (this.method3602(arg0, arg1)) {
            int var3 = this.field2307 * 8 - this.field2309 * 8 + this.field2313 * 64 - this.field2315 * 64 + arg0;
            int var4 = this.field2314 * 8 - this.field2318 * 8 + this.field2310 * 64 - this.field2312 * 64 + arg1;
            return new class290(this.field2317, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("gk.n(Lpi;I)V")
    public void method3594(class438 arg0) {
        this.field2317 = arg0.method6971();
        this.field2308 = arg0.method6971();
        this.field2313 = arg0.method7148();
        this.field2307 = arg0.method6971();
        this.field2321 = arg0.method6971();
        this.field2310 = arg0.method7148();
        this.field2314 = arg0.method6971();
        this.field2316 = arg0.method6971();
        this.field2315 = arg0.method7148();
        this.field2309 = arg0.method6971();
        this.field2311 = arg0.method6971();
        this.field2312 = arg0.method7148();
        this.field2318 = arg0.method6971();
        this.field2320 = arg0.method6971();
        this.method3889();
    }

    @ObfuscatedName("gk.s(I)V")
    public void method3889() {
    }
}
