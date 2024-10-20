package deob;

@ObfuscatedName("jd")
public class class265 extends class409 {

    @ObfuscatedName("jd.v")
    public class263 field3022;

    @ObfuscatedName("jd.c")
    public int field3017;

    @ObfuscatedName("jd.i")
    public class437 field3019;

    @ObfuscatedName("jd.f")
    public int field3020;

    @ObfuscatedName("jd.b")
    public static class265[] field3021 = new class265[300];

    @ObfuscatedName("jd.n")
    public static int field3018 = 0;

    @ObfuscatedName("hn.v(Ljl;Lqv;I)Ljd;")
    public static class265 method3935(class263 arg0, class454 arg1) {
        class265 var2;
        if (field3018 == 0) {
            var2 = new class265();
        } else {
            var2 = field3021[--field3018];
        }
        var2.field3022 = arg0;
        var2.field3017 = arg0.field3002;
        if (var2.field3017 == -1) {
            var2.field3019 = new class437(260);
        } else if (var2.field3017 == -2) {
            var2.field3019 = new class437(10000);
        } else if (var2.field3017 <= 18) {
            var2.field3019 = new class437(20);
        } else if (var2.field3017 <= 98) {
            var2.field3019 = new class437(100);
        } else {
            var2.field3019 = new class437(260);
        }
        var2.field3019.method6916(arg1);
        var2.field3019.method6917(var2.field3022.field2933);
        var2.field3020 = 0;
        return var2;
    }

    @ObfuscatedName("jd.c(I)V")
    public void method4668() {
        if (field3018 < field3021.length) {
            field3021[++field3018 - 1] = this;
        }
    }
}
