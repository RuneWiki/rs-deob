package deob;

@ObfuscatedName("gt")
public class class185 implements class201 {

    @ObfuscatedName("gt.n")
    public int field2094;

    @ObfuscatedName("gt.c")
    public int field2086;

    @ObfuscatedName("gt.m")
    public int field2096;

    @ObfuscatedName("gt.k")
    public int field2088;

    @ObfuscatedName("gt.o")
    public int field2095;

    @ObfuscatedName("gt.g")
    public int field2090;

    @ObfuscatedName("gt.z")
    public int field2085;

    @ObfuscatedName("gt.a")
    public int field2092;

    @ObfuscatedName("gt.u")
    public int field2093;

    @ObfuscatedName("gt.e")
    public int field2089;

    @ObfuscatedName("gt.n(Lfr;I)V")
    public void method3162(class181 arg0) {
        if (arg0.field2040 > this.field2095) {
            arg0.field2040 = this.field2095;
        }
        if (arg0.field2041 < this.field2095) {
            arg0.field2041 = this.field2095;
        }
        if (arg0.field2035 > this.field2090) {
            arg0.field2035 = this.field2090;
        }
        if (arg0.field2042 < this.field2090) {
            arg0.field2042 = this.field2090;
        }
    }

    @ObfuscatedName("gt.c(IIII)Z")
    public boolean method3174(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field2094 && arg0 < this.field2094 + this.field2086) {
            return arg1 >= (this.field2096 << 6) + (this.field2085 << 3) && arg1 <= (this.field2096 << 6) + (this.field2085 << 3) + 7 && arg2 >= (this.field2092 << 3) + (this.field2088 << 6) && arg2 <= (this.field2092 << 3) + (this.field2088 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("gt.m(III)Z")
    public boolean method3180(int arg0, int arg1) {
        return arg0 >= (this.field2095 << 6) + (this.field2093 << 3) && arg0 <= (this.field2095 << 6) + (this.field2093 << 3) + 7 && arg1 >= (this.field2090 << 6) + (this.field2089 << 3) && arg1 <= (this.field2090 << 6) + (this.field2089 << 3) + 7;
    }

    @ObfuscatedName("gt.k(IIII)[I")
    public int[] method3175(int arg0, int arg1, int arg2) {
        return this.method3174(arg0, arg1, arg2) ? new int[] { this.field2093 * 8 - this.field2085 * 8 + this.field2095 * 64 - this.field2096 * 64 + arg1, this.field2089 * 8 - this.field2092 * 8 + this.field2090 * 64 - this.field2088 * 64 + arg2 } : null;
    }

    @ObfuscatedName("gt.o(III)Liy;")
    public class258 method3166(int arg0, int arg1) {
        if (this.method3180(arg0, arg1)) {
            int var3 = this.field2085 * 8 - this.field2093 * 8 + this.field2096 * 64 - this.field2095 * 64 + arg0;
            int var4 = this.field2092 * 8 - this.field2089 * 8 + this.field2088 * 64 - this.field2090 * 64 + arg1;
            return new class258(this.field2094, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("gt.g(Lot;I)V")
    public void method3179(class400 arg0) {
        this.field2094 = arg0.method6217();
        this.field2086 = arg0.method6217();
        this.field2096 = arg0.method6219();
        this.field2085 = arg0.method6217();
        this.field2088 = arg0.method6219();
        this.field2092 = arg0.method6217();
        this.field2095 = arg0.method6219();
        this.field2093 = arg0.method6217();
        this.field2090 = arg0.method6219();
        this.field2089 = arg0.method6217();
        this.method3457();
    }

    @ObfuscatedName("gt.z(I)V")
    public void method3457() {
    }
}
