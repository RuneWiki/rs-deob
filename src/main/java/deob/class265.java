package deob;

@ObfuscatedName("jg")
public class class265 extends class411 {

    @ObfuscatedName("jg.s")
    public class263 field3041;

    @ObfuscatedName("jg.h")
    public int field3044;

    @ObfuscatedName("jg.w")
    public class443 field3039;

    @ObfuscatedName("jg.v")
    public int field3042;

    @ObfuscatedName("jg.c")
    public static class265[] field3043 = new class265[300];

    @ObfuscatedName("jg.q")
    public static int field3040 = 0;

    @ObfuscatedName("j.s(Ljb;Lqb;B)Ljg;")
    public static class265 method349(class263 arg0, class460 arg1) {
        class265 var2;
        if (field3040 == 0) {
            var2 = new class265();
        } else {
            var2 = field3043[--field3040];
        }
        var2.field3041 = arg0;
        var2.field3044 = arg0.field3009;
        if (var2.field3044 == -1) {
            var2.field3039 = new class443(260);
        } else if (var2.field3044 == -2) {
            var2.field3039 = new class443(10000);
        } else if (var2.field3044 <= 18) {
            var2.field3039 = new class443(20);
        } else if (var2.field3044 <= 98) {
            var2.field3039 = new class443(100);
        } else {
            var2.field3039 = new class443(260);
        }
        var2.field3039.method6882(arg1);
        var2.field3039.method6871(var2.field3041.field2927);
        var2.field3042 = 0;
        return var2;
    }

    @ObfuscatedName("jg.h(I)V")
    public void method4619() {
        if (field3040 < field3043.length) {
            field3043[++field3040 - 1] = this;
        }
    }
}
