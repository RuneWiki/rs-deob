package deob;

@ObfuscatedName("gu")
public class class185 implements class201 {

    @ObfuscatedName("gu.l")
    public int field2091;

    @ObfuscatedName("gu.q")
    public int field2092;

    @ObfuscatedName("gu.f")
    public int field2093;

    @ObfuscatedName("gu.j")
    public int field2094;

    @ObfuscatedName("gu.m")
    public int field2099;

    @ObfuscatedName("gu.k")
    public int field2096;

    @ObfuscatedName("gu.t")
    public int field2097;

    @ObfuscatedName("gu.a")
    public int field2098;

    @ObfuscatedName("gu.e")
    public int field2101;

    @ObfuscatedName("gu.i")
    public int field2100;

    @ObfuscatedName("gu.l(Lfr;I)V")
    public void method3212(class181 arg0) {
        if (arg0.field2042 > this.field2099) {
            arg0.field2042 = this.field2099;
        }
        if (arg0.field2048 < this.field2099) {
            arg0.field2048 = this.field2099;
        }
        if (arg0.field2050 > this.field2096) {
            arg0.field2050 = this.field2096;
        }
        if (arg0.field2051 < this.field2096) {
            arg0.field2051 = this.field2096;
        }
    }

    @ObfuscatedName("gu.q(IIII)Z")
    public boolean method3214(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field2091 && arg0 < this.field2092 + this.field2091) {
            return arg1 >= (this.field2097 << 3) + (this.field2093 << 6) && arg1 <= (this.field2097 << 3) + (this.field2093 << 6) + 7 && arg2 >= (this.field2098 << 3) + (this.field2094 << 6) && arg2 <= (this.field2098 << 3) + (this.field2094 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("gu.f(III)Z")
    public boolean method3219(int arg0, int arg1) {
        return arg0 >= (this.field2101 << 3) + (this.field2099 << 6) && arg0 <= (this.field2101 << 3) + (this.field2099 << 6) + 7 && arg1 >= (this.field2100 << 3) + (this.field2096 << 6) && arg1 <= (this.field2100 << 3) + (this.field2096 << 6) + 7;
    }

    @ObfuscatedName("gu.j(IIIB)[I")
    public int[] method3225(int arg0, int arg1, int arg2) {
        return this.method3214(arg0, arg1, arg2) ? new int[] { this.field2101 * 8 - this.field2097 * 8 + this.field2099 * 64 - this.field2093 * 64 + arg1, this.field2100 * 8 - this.field2098 * 8 + this.field2096 * 64 - this.field2094 * 64 + arg2 } : null;
    }

    @ObfuscatedName("gu.m(III)Lic;")
    public class258 method3216(int arg0, int arg1) {
        if (this.method3219(arg0, arg1)) {
            int var3 = this.field2097 * 8 - this.field2101 * 8 + this.field2093 * 64 - this.field2099 * 64 + arg0;
            int var4 = this.field2098 * 8 - this.field2100 * 8 + this.field2094 * 64 - this.field2096 * 64 + arg1;
            return new class258(this.field2091, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("gu.k(Lot;B)V")
    public void method3217(class401 arg0) {
        this.field2091 = arg0.method6272();
        this.field2092 = arg0.method6272();
        this.field2093 = arg0.method6284();
        this.field2097 = arg0.method6272();
        this.field2094 = arg0.method6284();
        this.field2098 = arg0.method6272();
        this.field2099 = arg0.method6284();
        this.field2101 = arg0.method6272();
        this.field2096 = arg0.method6284();
        this.field2100 = arg0.method6272();
        this.method3497();
    }

    @ObfuscatedName("gu.t(B)V")
    public void method3497() {
    }
}
