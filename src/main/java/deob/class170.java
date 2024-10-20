package deob;

@ObfuscatedName("fj")
public class class170 implements class186 {

    @ObfuscatedName("fj.v")
    public int field2019;

    @ObfuscatedName("fj.n")
    public int field2012;

    @ObfuscatedName("fj.f")
    public int field2013;

    @ObfuscatedName("fj.y")
    public int field2017;

    @ObfuscatedName("fj.p")
    public int field2015;

    @ObfuscatedName("fj.j")
    public int field2016;

    @ObfuscatedName("fj.r")
    public int field2011;

    @ObfuscatedName("fj.b")
    public int field2018;

    @ObfuscatedName("fj.d")
    public int field2014;

    @ObfuscatedName("fj.s")
    public int field2020;

    @ObfuscatedName("fj.v(Lfo;I)V")
    public void method2996(class166 arg0) {
        if (arg0.field1968 > this.field2015) {
            arg0.field1968 = this.field2015;
        }
        if (arg0.field1959 < this.field2015) {
            arg0.field1959 = this.field2015;
        }
        if (arg0.field1967 > this.field2016) {
            arg0.field1967 = this.field2016;
        }
        if (arg0.field1966 < this.field2016) {
            arg0.field1966 = this.field2016;
        }
    }

    @ObfuscatedName("fj.n(IIII)Z")
    public boolean method2995(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field2019 && arg0 < this.field2019 + this.field2012) {
            return arg1 >= (this.field2013 << 6) + (this.field2011 << 3) && arg1 <= (this.field2013 << 6) + (this.field2011 << 3) + 7 && arg2 >= (this.field2018 << 3) + (this.field2017 << 6) && arg2 <= (this.field2018 << 3) + (this.field2017 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("fj.f(IIB)Z")
    public boolean method2998(int arg0, int arg1) {
        return arg0 >= (this.field2015 << 6) + (this.field2014 << 3) && arg0 <= (this.field2015 << 6) + (this.field2014 << 3) + 7 && arg1 >= (this.field2020 << 3) + (this.field2016 << 6) && arg1 <= (this.field2020 << 3) + (this.field2016 << 6) + 7;
    }

    @ObfuscatedName("fj.y(IIII)[I")
    public int[] method3002(int arg0, int arg1, int arg2) {
        return this.method2995(arg0, arg1, arg2) ? new int[] { this.field2014 * 8 - this.field2011 * 8 + this.field2015 * 64 - this.field2013 * 64 + arg1, this.field2020 * 8 - this.field2018 * 8 + this.field2016 * 64 - this.field2017 * 64 + arg2 } : null;
    }

    @ObfuscatedName("fj.p(III)Lii;")
    public class243 method3000(int arg0, int arg1) {
        if (this.method2998(arg0, arg1)) {
            int var3 = this.field2011 * 8 - this.field2014 * 8 + this.field2013 * 64 - this.field2015 * 64 + arg0;
            int var4 = this.field2018 * 8 - this.field2020 * 8 + this.field2017 * 64 - this.field2016 * 64 + arg1;
            return new class243(this.field2019, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("fj.j(Lnd;I)V")
    public void method3001(class383 arg0) {
        this.field2019 = arg0.method5965();
        this.field2012 = arg0.method5965();
        this.field2013 = arg0.method5967();
        this.field2011 = arg0.method5965();
        this.field2017 = arg0.method5967();
        this.field2018 = arg0.method5965();
        this.field2015 = arg0.method5967();
        this.field2014 = arg0.method5965();
        this.field2016 = arg0.method5967();
        this.field2020 = arg0.method5965();
        this.method3279();
    }

    @ObfuscatedName("fj.r(I)V")
    public void method3279() {
    }
}
