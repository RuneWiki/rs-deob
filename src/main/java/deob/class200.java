package deob;

@ObfuscatedName("ga")
public class class200 implements class221 {

    @ObfuscatedName("ga.v")
    public int field2230;

    @ObfuscatedName("ga.c")
    public int field2225;

    @ObfuscatedName("ga.i")
    public int field2226;

    @ObfuscatedName("ga.f")
    public int field2227;

    @ObfuscatedName("ga.b")
    public int field2228;

    @ObfuscatedName("ga.n")
    public int field2229;

    @ObfuscatedName("ga.s")
    public int field2234;

    @ObfuscatedName("ga.l")
    public int field2235;

    @ObfuscatedName("ga.q")
    public int field2231;

    @ObfuscatedName("ga.o")
    public int field2233;

    @ObfuscatedName("ga.v(Lgu;I)V")
    public void method3590(class201 arg0) {
        if (arg0.field2243 > this.field2234) {
            arg0.field2243 = this.field2234;
        }
        if (arg0.field2249 < this.field2231) {
            arg0.field2249 = this.field2231;
        }
        if (arg0.field2245 > this.field2235) {
            arg0.field2245 = this.field2235;
        }
        if (arg0.field2246 < this.field2233) {
            arg0.field2246 = this.field2233;
        }
    }

    @ObfuscatedName("ga.c(IIII)Z")
    public boolean method3597(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field2230 && arg0 < this.field2230 + this.field2225) {
            return arg1 >> 6 >= this.field2226 && arg1 >> 6 <= this.field2228 && arg2 >> 6 >= this.field2227 && arg2 >> 6 <= this.field2229;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ga.i(III)Z")
    public boolean method3602(int arg0, int arg1) {
        return arg0 >> 6 >= this.field2234 && arg0 >> 6 <= this.field2231 && arg1 >> 6 >= this.field2235 && arg1 >> 6 <= this.field2233;
    }

    @ObfuscatedName("ga.f(IIII)[I")
    public int[] method3592(int arg0, int arg1, int arg2) {
        return this.method3597(arg0, arg1, arg2) ? new int[] { this.field2234 * 64 - this.field2226 * 64 + arg1, this.field2235 * 64 - this.field2227 * 64 + arg2 } : null;
    }

    @ObfuscatedName("ga.b(III)Lks;")
    public class290 method3606(int arg0, int arg1) {
        if (this.method3602(arg0, arg1)) {
            int var3 = this.field2226 * 64 - this.field2234 * 64 + arg0;
            int var4 = this.field2227 * 64 - this.field2235 * 64 + arg1;
            return new class290(this.field2230, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("ga.n(Lpi;I)V")
    public void method3594(class438 arg0) {
        this.field2230 = arg0.method6971();
        this.field2225 = arg0.method6971();
        this.field2226 = arg0.method7148();
        this.field2227 = arg0.method7148();
        this.field2228 = arg0.method7148();
        this.field2229 = arg0.method7148();
        this.field2234 = arg0.method7148();
        this.field2235 = arg0.method7148();
        this.field2231 = arg0.method7148();
        this.field2233 = arg0.method7148();
        this.method3595();
    }

    @ObfuscatedName("ga.s(S)V")
    public void method3595() {
    }
}
