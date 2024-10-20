package deob;

@ObfuscatedName("ge")
public class class192 extends class425 {

    @ObfuscatedName("ge.f")
    public static class266 field2054 = new class266(64);

    @ObfuscatedName("ge.c")
    public class440 field2053;

    @ObfuscatedName("gi.a(II)Lge;")
    public static class192 method3706(int arg0) {
        class192 var1 = (class192) field2054.method4839((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2055.method5859(34, arg0);
        class192 var3 = new class192();
        if (var2 != null) {
            var3.method3361(new class464(var2));
        }
        var3.method3357();
        field2054.method4834(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ge.f(B)V")
    public void method3357() {
    }

    @ObfuscatedName("ge.c(Lqr;B)V")
    public void method3361(class464 arg0) {
        while (true) {
            int var2 = arg0.method7735();
            if (var2 == 0) {
                return;
            }
            this.method3350(arg0, var2);
        }
    }

    @ObfuscatedName("ge.x(Lqr;II)V")
    public void method3350(class464 arg0, int arg1) {
        if (arg1 == 249) {
            this.field2053 = class182.method4112(arg0, this.field2053);
        }
    }

    @ObfuscatedName("ge.h(III)I")
    public int method3353(int arg0, int arg1) {
        return class182.method6006(this.field2053, arg0, arg1);
    }

    @ObfuscatedName("ge.j(ILjava/lang/String;I)Ljava/lang/String;")
    public String method3352(int arg0, String arg1) {
        return class182.method6701(this.field2053, arg0, arg1);
    }
}
