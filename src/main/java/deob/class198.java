package deob;

@ObfuscatedName("gr")
public class class198 implements class201 {

    @ObfuscatedName("gr.n")
    public int field2187;

    @ObfuscatedName("gr.c")
    public int field2188;

    @ObfuscatedName("gr.m")
    public int field2191;

    @ObfuscatedName("gr.k")
    public int field2190;

    @ObfuscatedName("gr.o")
    public int field2193;

    @ObfuscatedName("gr.g")
    public int field2192;

    @ObfuscatedName("gr.n(Lfr;I)V")
    public void method3162(class181 arg0) {
        if (arg0.field2040 > this.field2193) {
            arg0.field2040 = this.field2193;
        }
        if (arg0.field2041 < this.field2193) {
            arg0.field2041 = this.field2193;
        }
        if (arg0.field2035 > this.field2192) {
            arg0.field2035 = this.field2192;
        }
        if (arg0.field2042 < this.field2192) {
            arg0.field2042 = this.field2192;
        }
    }

    @ObfuscatedName("gr.c(IIII)Z")
    public boolean method3174(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field2187 && arg0 < this.field2188 + this.field2187) {
            return arg1 >> 6 == this.field2191 && arg2 >> 6 == this.field2190;
        } else {
            return false;
        }
    }

    @ObfuscatedName("gr.m(III)Z")
    public boolean method3180(int arg0, int arg1) {
        return arg0 >> 6 == this.field2193 && arg1 >> 6 == this.field2192;
    }

    @ObfuscatedName("gr.k(IIII)[I")
    public int[] method3175(int arg0, int arg1, int arg2) {
        return this.method3174(arg0, arg1, arg2) ? new int[] { this.field2193 * 64 - this.field2191 * 64 + arg1, this.field2192 * 64 - this.field2190 * 64 + arg2 } : null;
    }

    @ObfuscatedName("gr.o(III)Liy;")
    public class258 method3166(int arg0, int arg1) {
        if (this.method3180(arg0, arg1)) {
            int var3 = this.field2191 * 64 - this.field2193 * 64 + arg0;
            int var4 = this.field2190 * 64 - this.field2192 * 64 + arg1;
            return new class258(this.field2187, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("gr.g(Lot;I)V")
    public void method3179(class400 arg0) {
        this.field2187 = arg0.method6217();
        this.field2188 = arg0.method6217();
        this.field2191 = arg0.method6219();
        this.field2190 = arg0.method6219();
        this.field2193 = arg0.method6219();
        this.field2192 = arg0.method6219();
        this.method3521();
    }

    @ObfuscatedName("gr.z(I)V")
    public void method3521() {
    }
}
