package deob;

@ObfuscatedName("fl")
public class class180 implements class201 {

    @ObfuscatedName("fl.l")
    public int field2041;

    @ObfuscatedName("fl.q")
    public int field2033;

    @ObfuscatedName("fl.f")
    public int field2034;

    @ObfuscatedName("fl.j")
    public int field2035;

    @ObfuscatedName("fl.m")
    public int field2036;

    @ObfuscatedName("fl.k")
    public int field2037;

    @ObfuscatedName("fl.t")
    public int field2032;

    @ObfuscatedName("fl.a")
    public int field2039;

    @ObfuscatedName("fl.e")
    public int field2040;

    @ObfuscatedName("fl.i")
    public int field2038;

    @ObfuscatedName("fl.l(Lfr;I)V")
    public void method3212(class181 arg0) {
        if (arg0.field2042 > this.field2032) {
            arg0.field2042 = this.field2032;
        }
        if (arg0.field2048 < this.field2040) {
            arg0.field2048 = this.field2040;
        }
        if (arg0.field2050 > this.field2039) {
            arg0.field2050 = this.field2039;
        }
        if (arg0.field2051 < this.field2038) {
            arg0.field2051 = this.field2038;
        }
    }

    @ObfuscatedName("fl.q(IIII)Z")
    public boolean method3214(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field2041 && arg0 < this.field2041 + this.field2033) {
            return arg1 >> 6 >= this.field2034 && arg1 >> 6 <= this.field2036 && arg2 >> 6 >= this.field2035 && arg2 >> 6 <= this.field2037;
        } else {
            return false;
        }
    }

    @ObfuscatedName("fl.f(III)Z")
    public boolean method3219(int arg0, int arg1) {
        return arg0 >> 6 >= this.field2032 && arg0 >> 6 <= this.field2040 && arg1 >> 6 >= this.field2039 && arg1 >> 6 <= this.field2038;
    }

    @ObfuscatedName("fl.j(IIIB)[I")
    public int[] method3225(int arg0, int arg1, int arg2) {
        return this.method3214(arg0, arg1, arg2) ? new int[] { this.field2032 * 64 - this.field2034 * 64 + arg1, this.field2039 * 64 - this.field2035 * 64 + arg2 } : null;
    }

    @ObfuscatedName("fl.m(III)Lic;")
    public class258 method3216(int arg0, int arg1) {
        if (this.method3219(arg0, arg1)) {
            int var3 = this.field2034 * 64 - this.field2032 * 64 + arg0;
            int var4 = this.field2035 * 64 - this.field2039 * 64 + arg1;
            return new class258(this.field2041, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("fl.k(Lot;B)V")
    public void method3217(class401 arg0) {
        this.field2041 = arg0.method6272();
        this.field2033 = arg0.method6272();
        this.field2034 = arg0.method6284();
        this.field2035 = arg0.method6284();
        this.field2036 = arg0.method6284();
        this.field2037 = arg0.method6284();
        this.field2032 = arg0.method6284();
        this.field2039 = arg0.method6284();
        this.field2040 = arg0.method6284();
        this.field2038 = arg0.method6284();
        this.method3218();
    }

    @ObfuscatedName("fl.t(I)V")
    public void method3218() {
    }
}
