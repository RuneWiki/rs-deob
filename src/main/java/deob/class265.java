package deob;

@ObfuscatedName("jm")
public class class265 extends class411 {

    @ObfuscatedName("jm.o")
    public class263 field3082;

    @ObfuscatedName("jm.q")
    public int field3074;

    @ObfuscatedName("jm.l")
    public class439 field3075;

    @ObfuscatedName("jm.k")
    public int field3080;

    @ObfuscatedName("jm.a")
    public static class265[] field3073 = new class265[300];

    @ObfuscatedName("jm.m")
    public static int field3078 = 0;

    @ObfuscatedName("gi.o(I)Ljm;")
    public static class265 method3405() {
        return field3078 == 0 ? new class265() : field3073[--field3078];
    }

    @ObfuscatedName("hf.q(Ljj;Lqh;B)Ljm;")
    public static class265 method4070(class263 arg0, class456 arg1) {
        class265 var2 = method3405();
        var2.field3082 = arg0;
        var2.field3074 = arg0.field2965;
        if (var2.field3074 == -1) {
            var2.field3075 = new class439(260);
        } else if (var2.field3074 == -2) {
            var2.field3075 = new class439(10000);
        } else if (var2.field3074 <= 18) {
            var2.field3075 = new class439(20);
        } else if (var2.field3074 <= 98) {
            var2.field3075 = new class439(100);
        } else {
            var2.field3075 = new class439(260);
        }
        var2.field3075.method6833(arg1);
        var2.field3075.method6834(var2.field3082.field3022);
        var2.field3080 = 0;
        return var2;
    }

    @ObfuscatedName("fv.l(B)Ljm;")
    public static class265 method2945() {
        class265 var0 = method3405();
        var0.field3082 = null;
        var0.field3074 = 0;
        var0.field3075 = new class439(5000);
        return var0;
    }

    @ObfuscatedName("jm.k(S)V")
    public void method4586() {
        if (field3078 < field3073.length) {
            field3073[++field3078 - 1] = this;
        }
    }
}
