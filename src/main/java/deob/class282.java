package deob;

@ObfuscatedName("ji")
public class class282 extends class440 {

    @ObfuscatedName("ji.f")
    public class280 field3190;

    @ObfuscatedName("ji.w")
    public int field3185;

    @ObfuscatedName("ji.v")
    public class473 field3187;

    @ObfuscatedName("ji.s")
    public int field3188;

    @ObfuscatedName("ji.z")
    public static class282[] field3189 = new class282[300];

    @ObfuscatedName("ji.j")
    public static int field3191 = 0;

    @ObfuscatedName("cq.f(B)Lji;")
    public static class282 method2207() {
        return field3191 == 0 ? new class282() : field3189[--field3191];
    }

    @ObfuscatedName("hd.w(Ljv;Lrt;I)Lji;")
    public static class282 method4287(class280 arg0, class491 arg1) {
        class282 var2 = method2207();
        var2.field3190 = arg0;
        var2.field3185 = arg0.field3171;
        if (var2.field3185 == -1) {
            var2.field3187 = new class473(260);
        } else if (var2.field3185 == -2) {
            var2.field3187 = new class473(10000);
        } else if (var2.field3185 <= 18) {
            var2.field3187 = new class473(20);
        } else if (var2.field3185 <= 98) {
            var2.field3187 = new class473(100);
        } else {
            var2.field3187 = new class473(260);
        }
        var2.field3187.method7920(arg1);
        var2.field3187.method7908(var2.field3190.field3170);
        var2.field3188 = 0;
        return var2;
    }

    @ObfuscatedName("gp.v(I)Lji;")
    public static class282 method3621() {
        class282 var0 = method2207();
        var0.field3190 = null;
        var0.field3185 = 0;
        var0.field3187 = new class473(5000);
        return var0;
    }

    @ObfuscatedName("ji.s(B)V")
    public void method5052() {
        if (field3191 < field3189.length) {
            field3189[++field3191 - 1] = this;
        }
    }
}
