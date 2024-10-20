package deob;

@ObfuscatedName("gl")
public class class205 implements class221 {

    @ObfuscatedName("gl.v")
    public int field2295;

    @ObfuscatedName("gl.c")
    public int field2288;

    @ObfuscatedName("gl.i")
    public int field2289;

    @ObfuscatedName("gl.f")
    public int field2290;

    @ObfuscatedName("gl.b")
    public int field2291;

    @ObfuscatedName("gl.n")
    public int field2292;

    @ObfuscatedName("gl.s")
    public int field2296;

    @ObfuscatedName("gl.l")
    public int field2294;

    @ObfuscatedName("gl.q")
    public int field2287;

    @ObfuscatedName("gl.o")
    public int field2293;

    @ObfuscatedName("gl.v(Lgu;I)V")
    public void method3590(class201 arg0) {
        if (arg0.field2243 > this.field2291) {
            arg0.field2243 = this.field2291;
        }
        if (arg0.field2249 < this.field2291) {
            arg0.field2249 = this.field2291;
        }
        if (arg0.field2245 > this.field2292) {
            arg0.field2245 = this.field2292;
        }
        if (arg0.field2246 < this.field2292) {
            arg0.field2246 = this.field2292;
        }
    }

    @ObfuscatedName("gl.c(IIII)Z")
    public boolean method3597(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field2295 && arg0 < this.field2295 + this.field2288) {
            return arg1 >= (this.field2296 << 3) + (this.field2289 << 6) && arg1 <= (this.field2296 << 3) + (this.field2289 << 6) + 7 && arg2 >= (this.field2294 << 3) + (this.field2290 << 6) && arg2 <= (this.field2294 << 3) + (this.field2290 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("gl.i(III)Z")
    public boolean method3602(int arg0, int arg1) {
        return arg0 >= (this.field2291 << 6) + (this.field2287 << 3) && arg0 <= (this.field2291 << 6) + (this.field2287 << 3) + 7 && arg1 >= (this.field2293 << 3) + (this.field2292 << 6) && arg1 <= (this.field2293 << 3) + (this.field2292 << 6) + 7;
    }

    @ObfuscatedName("gl.f(IIII)[I")
    public int[] method3592(int arg0, int arg1, int arg2) {
        return this.method3597(arg0, arg1, arg2) ? new int[] { this.field2287 * 8 - this.field2296 * 8 + this.field2291 * 64 - this.field2289 * 64 + arg1, this.field2293 * 8 - this.field2294 * 8 + this.field2292 * 64 - this.field2290 * 64 + arg2 } : null;
    }

    @ObfuscatedName("gl.b(III)Lks;")
    public class290 method3606(int arg0, int arg1) {
        if (this.method3602(arg0, arg1)) {
            int var3 = this.field2296 * 8 - this.field2287 * 8 + this.field2289 * 64 - this.field2291 * 64 + arg0;
            int var4 = this.field2294 * 8 - this.field2293 * 8 + this.field2290 * 64 - this.field2292 * 64 + arg1;
            return new class290(this.field2295, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("gl.n(Lpi;I)V")
    public void method3594(class438 arg0) {
        this.field2295 = arg0.method6971();
        this.field2288 = arg0.method6971();
        this.field2289 = arg0.method7148();
        this.field2296 = arg0.method6971();
        this.field2290 = arg0.method7148();
        this.field2294 = arg0.method6971();
        this.field2291 = arg0.method7148();
        this.field2287 = arg0.method6971();
        this.field2292 = arg0.method7148();
        this.field2293 = arg0.method6971();
        this.method3880();
    }

    @ObfuscatedName("gl.s(I)V")
    public void method3880() {
    }
}
