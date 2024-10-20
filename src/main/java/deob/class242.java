package deob;

@ObfuscatedName("is")
public class class242 extends class370 {

    @ObfuscatedName("is.l")
    public class240 field2785;

    @ObfuscatedName("is.q")
    public int field2786;

    @ObfuscatedName("is.f")
    public class400 field2780;

    @ObfuscatedName("is.j")
    public int field2779;

    @ObfuscatedName("is.m")
    public static class242[] field2782 = new class242[300];

    @ObfuscatedName("is.k")
    public static int field2783 = 0;

    @ObfuscatedName("hz.l(B)Lis;")
    public static class242 method3744() {
        return field2783 == 0 ? new class242() : field2782[--field2783];
    }

    @ObfuscatedName("cl.q(Liz;Lpv;B)Lis;")
    public static class242 method2075(class240 arg0, class417 arg1) {
        class242 var2 = method3744();
        var2.field2785 = arg0;
        var2.field2786 = arg0.field2745;
        if (var2.field2786 == -1) {
            var2.field2780 = new class400(260);
        } else if (var2.field2786 == -2) {
            var2.field2780 = new class400(10000);
        } else if (var2.field2786 <= 18) {
            var2.field2780 = new class400(20);
        } else if (var2.field2786 <= 98) {
            var2.field2780 = new class400(100);
        } else {
            var2.field2780 = new class400(260);
        }
        var2.field2780.method6219(arg1);
        var2.field2780.method6236(var2.field2785.field2766);
        var2.field2779 = 0;
        return var2;
    }

    @ObfuscatedName("is.f(I)V")
    public void method4236() {
        if (field2783 < field2782.length) {
            field2782[++field2783 - 1] = this;
        }
    }
}
