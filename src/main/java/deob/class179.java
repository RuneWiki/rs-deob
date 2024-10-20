package deob;

@ObfuscatedName("fh")
public class class179 extends class199 {

    @ObfuscatedName("fh.n")
    public final int field2016;

    @ObfuscatedName("fh.c")
    public final class182 field2015;

    @ObfuscatedName("fh.m")
    public int field2017;

    @ObfuscatedName("fh.k")
    public class194 field2019;

    @ObfuscatedName("fh.o")
    public int field2018;

    @ObfuscatedName("fh.g")
    public int field2020;

    public class179(class258 arg0, class258 arg1, int arg2, class182 arg3) {
        super(arg0, arg1);
        this.field2016 = arg2;
        this.field2015 = arg3;
        this.method3154();
    }

    @ObfuscatedName("fh.n(I)V")
    public void method3154() {
        this.field2017 = class169.method2878(this.field2016).method2895().field1852;
        this.field2019 = this.field2015.method3300(class154.method1007(this.field2017));
        class154 var1 = class154.method1007(this.method3144());
        class413 var2 = var1.method2602(false);
        if (var2 == null) {
            this.field2018 = 0;
            this.field2020 = 0;
        } else {
            this.field2018 = var2.field4375;
            this.field2020 = var2.field4378;
        }
    }

    @ObfuscatedName("fh.c(B)I")
    public int method3144() {
        return this.field2017;
    }

    @ObfuscatedName("fh.m(S)Lgz;")
    public class194 method3145() {
        return this.field2019;
    }

    @ObfuscatedName("fh.k(B)I")
    public int method3146() {
        return this.field2018;
    }

    @ObfuscatedName("fh.o(I)I")
    public int method3155() {
        return this.field2020;
    }
}
