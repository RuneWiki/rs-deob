package deob;

@ObfuscatedName("o")
public class class19 implements class32 {

    @ObfuscatedName("o.z")
    public int field138;

    @ObfuscatedName("o.w")
    public int field149;

    @ObfuscatedName("o.s")
    public int field139;

    @ObfuscatedName("o.l")
    public int field140;

    @ObfuscatedName("o.u")
    public int field141;

    @ObfuscatedName("o.q")
    public int field142;

    @ObfuscatedName("o.k")
    public int field143;

    @ObfuscatedName("o.i")
    public int field137;

    @ObfuscatedName("o.x")
    public int field145;

    @ObfuscatedName("o.e")
    public int field146;

    @ObfuscatedName("o.z(La;B)V")
    public void method116(class21 arg0) {
        if (arg0.field167 > this.field143) {
            arg0.field167 = this.field143;
        }
        if (arg0.field168 < this.field145) {
            arg0.field168 = this.field145;
        }
        if (arg0.field169 > this.field137) {
            arg0.field169 = this.field137;
        }
        if (arg0.field163 < this.field146) {
            arg0.field163 = this.field146;
        }
    }

    @ObfuscatedName("o.w(IIII)Z")
    public boolean method117(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field138 && arg0 < this.field149 + this.field138) {
            return arg1 >> 6 >= this.field139 && arg1 >> 6 <= this.field141 && arg2 >> 6 >= this.field140 && arg2 >> 6 <= this.field142;
        } else {
            return false;
        }
    }

    @ObfuscatedName("o.s(III)Z")
    public boolean method118(int arg0, int arg1) {
        return arg0 >> 6 >= this.field143 && arg0 >> 6 <= this.field145 && arg1 >> 6 >= this.field137 && arg1 >> 6 <= this.field146;
    }

    @ObfuscatedName("o.l(IIIB)[I")
    public int[] method119(int arg0, int arg1, int arg2) {
        return this.method117(arg0, arg1, arg2) ? new int[] { this.field143 * 64 - this.field139 * 64 + arg1, this.field137 * 64 - this.field140 * 64 + arg2 } : null;
    }

    @ObfuscatedName("o.u(III)Lha;")
    public class227 method120(int arg0, int arg1) {
        if (this.method118(arg0, arg1)) {
            int var3 = this.field139 * 64 - this.field143 * 64 + arg0;
            int var4 = this.field140 * 64 - this.field137 * 64 + arg1;
            return new class227(this.field138, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("o.q(Lgk;B)V")
    public void method121(class183 arg0) {
        this.field138 = arg0.method3247();
        this.field149 = arg0.method3247();
        this.field139 = arg0.method3253();
        this.field140 = arg0.method3253();
        this.field141 = arg0.method3253();
        this.field142 = arg0.method3253();
        this.field143 = arg0.method3253();
        this.field137 = arg0.method3253();
        this.field145 = arg0.method3253();
        this.field146 = arg0.method3253();
        this.method175();
    }

    @ObfuscatedName("o.i(B)V")
    public void method175() {
    }
}
