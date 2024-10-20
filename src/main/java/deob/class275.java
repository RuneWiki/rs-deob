package deob;

@ObfuscatedName("jc")
public class class275 extends class430 {

    @ObfuscatedName("jc.a")
    public class273 field3128;

    @ObfuscatedName("jc.f")
    public int field3124;

    @ObfuscatedName("jc.c")
    public class463 field3123;

    @ObfuscatedName("jc.x")
    public int field3126;

    @ObfuscatedName("jc.h")
    public static class275[] field3125 = new class275[300];

    @ObfuscatedName("jc.j")
    public static int field3127 = 0;

    @ObfuscatedName("hb.a(B)Ljc;")
    public static class275 method4314() {
        return field3127 == 0 ? new class275() : field3125[--field3127];
    }

    @ObfuscatedName("gc.f(Ljn;Lro;I)Ljc;")
    public static class275 method3314(class273 arg0, class480 arg1) {
        class275 var2 = method4314();
        var2.field3128 = arg0;
        var2.field3124 = arg0.field3106;
        if (var2.field3124 == -1) {
            var2.field3123 = new class463(260);
        } else if (var2.field3124 == -2) {
            var2.field3123 = new class463(10000);
        } else if (var2.field3124 <= 18) {
            var2.field3123 = new class463(20);
        } else if (var2.field3124 <= 98) {
            var2.field3123 = new class463(100);
        } else {
            var2.field3123 = new class463(260);
        }
        var2.field3123.method7676(arg1);
        var2.field3123.method7659(var2.field3128.field3105);
        var2.field3126 = 0;
        return var2;
    }

    @ObfuscatedName("jd.c(I)Ljc;")
    public static class275 method4887() {
        class275 var0 = method4314();
        var0.field3128 = null;
        var0.field3124 = 0;
        var0.field3123 = new class463(5000);
        return var0;
    }

    @ObfuscatedName("jc.x(I)V")
    public void method4866() {
        if (field3127 < field3125.length) {
            field3125[++field3127 - 1] = this;
        }
    }
}
