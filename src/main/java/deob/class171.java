package deob;

@ObfuscatedName("fb")
public class class171 implements class187 {

    @ObfuscatedName("fb.f")
    public int field2016;

    @ObfuscatedName("fb.e")
    public int field2014;

    @ObfuscatedName("fb.v")
    public int field2015;

    @ObfuscatedName("fb.y")
    public int field2013;

    @ObfuscatedName("fb.j")
    public int field2024;

    @ObfuscatedName("fb.o")
    public int field2018;

    @ObfuscatedName("fb.m")
    public int field2019;

    @ObfuscatedName("fb.r")
    public int field2020;

    @ObfuscatedName("fb.h")
    public int field2021;

    @ObfuscatedName("fb.d")
    public int field2022;

    @ObfuscatedName("fb.f(Lfa;B)V")
    public void method2991(class167 arg0) {
        if (arg0.field1973 > this.field2024) {
            arg0.field1973 = this.field2024;
        }
        if (arg0.field1980 < this.field2024) {
            arg0.field1980 = this.field2024;
        }
        if (arg0.field1976 > this.field2018) {
            arg0.field1976 = this.field2018;
        }
        if (arg0.field1968 < this.field2018) {
            arg0.field1968 = this.field2018;
        }
    }

    @ObfuscatedName("fb.e(IIII)Z")
    public boolean method3004(int arg0, int arg1, int arg2) {
        if (arg0 >= this.field2016 && arg0 < this.field2016 + this.field2014) {
            return arg1 >= (this.field2019 << 3) + (this.field2015 << 6) && arg1 <= (this.field2019 << 3) + (this.field2015 << 6) + 7 && arg2 >= (this.field2020 << 3) + (this.field2013 << 6) && arg2 <= (this.field2020 << 3) + (this.field2013 << 6) + 7;
        } else {
            return false;
        }
    }

    @ObfuscatedName("fb.v(III)Z")
    public boolean method3017(int arg0, int arg1) {
        return arg0 >= (this.field2024 << 6) + (this.field2021 << 3) && arg0 <= (this.field2024 << 6) + (this.field2021 << 3) + 7 && arg1 >= (this.field2022 << 3) + (this.field2018 << 6) && arg1 <= (this.field2022 << 3) + (this.field2018 << 6) + 7;
    }

    @ObfuscatedName("fb.y(IIII)[I")
    public int[] method2993(int arg0, int arg1, int arg2) {
        return this.method3004(arg0, arg1, arg2) ? new int[] { this.field2021 * 8 - this.field2019 * 8 + this.field2024 * 64 - this.field2015 * 64 + arg1, this.field2022 * 8 - this.field2020 * 8 + this.field2018 * 64 - this.field2013 * 64 + arg2 } : null;
    }

    @ObfuscatedName("fb.j(IIB)Liw;")
    public class244 method2994(int arg0, int arg1) {
        if (this.method3017(arg0, arg1)) {
            int var3 = this.field2019 * 8 - this.field2021 * 8 + this.field2015 * 64 - this.field2024 * 64 + arg0;
            int var4 = this.field2020 * 8 - this.field2022 * 8 + this.field2013 * 64 - this.field2018 * 64 + arg1;
            return new class244(this.field2016, var3, var4);
        } else {
            return null;
        }
    }

    @ObfuscatedName("fb.o(Lnt;I)V")
    public void method2995(class384 arg0) {
        this.field2016 = arg0.method5902();
        this.field2014 = arg0.method5902();
        this.field2015 = arg0.method5899();
        this.field2019 = arg0.method5902();
        this.field2013 = arg0.method5899();
        this.field2020 = arg0.method5902();
        this.field2024 = arg0.method5899();
        this.field2021 = arg0.method5902();
        this.field2018 = arg0.method5899();
        this.field2022 = arg0.method5902();
        this.method3264();
    }

    @ObfuscatedName("fb.m(I)V")
    public void method3264() {
    }
}
