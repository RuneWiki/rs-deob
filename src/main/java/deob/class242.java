package deob;

@ObfuscatedName("ib")
public class class242 extends class370 {

    @ObfuscatedName("ib.i")
    public class240 field2786;

    @ObfuscatedName("ib.w")
    public int field2785;

    @ObfuscatedName("ib.s")
    public class400 field2792;

    @ObfuscatedName("ib.a")
    public int field2787;

    @ObfuscatedName("ib.o")
    public static class242[] field2788 = new class242[300];

    @ObfuscatedName("ib.g")
    public static int field2789 = 0;

    @ObfuscatedName("cw.i(I)Lib;")
    public static class242 method2170() {
        return field2789 == 0 ? new class242() : field2788[--field2789];
    }

    @ObfuscatedName("gl.w(Lik;Lpw;B)Lib;")
    public static class242 method3564(class240 arg0, class417 arg1) {
        class242 var2 = method2170();
        var2.field2786 = arg0;
        var2.field2785 = arg0.field2772;
        if (var2.field2785 == -1) {
            var2.field2792 = new class400(260);
        } else if (var2.field2785 == -2) {
            var2.field2792 = new class400(10000);
        } else if (var2.field2785 <= 18) {
            var2.field2792 = new class400(20);
        } else if (var2.field2785 <= 98) {
            var2.field2792 = new class400(100);
        } else {
            var2.field2792 = new class400(260);
        }
        var2.field2792.method6183(arg1);
        var2.field2792.method6181(var2.field2786.field2771);
        var2.field2787 = 0;
        return var2;
    }

    @ObfuscatedName("ib.s(I)V")
    public void method4223() {
        if (field2789 < field2788.length) {
            field2788[++field2789 - 1] = this;
        }
    }
}
