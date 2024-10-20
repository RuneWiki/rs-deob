package deob;

@ObfuscatedName("ii")
public class class257 extends class392 {

    @ObfuscatedName("ii.c")
    public class255 field2958;

    @ObfuscatedName("ii.l")
    public int field2955;

    @ObfuscatedName("ii.s")
    public class420 field2960;

    @ObfuscatedName("ii.e")
    public int field2957;

    @ObfuscatedName("ii.r")
    public static class257[] field2959 = new class257[300];

    @ObfuscatedName("ii.o")
    public static int field2956 = 0;

    @ObfuscatedName("ev.c(Lie;Lpv;B)Lii;")
    public static class257 method2630(class255 arg0, class437 arg1) {
        class257 var2;
        if (field2956 == 0) {
            var2 = new class257();
        } else {
            var2 = field2959[--field2956];
        }
        var2.field2958 = arg0;
        var2.field2955 = arg0.field2941;
        if (var2.field2955 == -1) {
            var2.field2960 = new class420(260);
        } else if (var2.field2955 == -2) {
            var2.field2960 = new class420(10000);
        } else if (var2.field2955 <= 18) {
            var2.field2960 = new class420(20);
        } else if (var2.field2955 <= 98) {
            var2.field2960 = new class420(100);
        } else {
            var2.field2960 = new class420(260);
        }
        var2.field2960.method6612(arg1);
        var2.field2960.method6610(var2.field2958.field2940);
        var2.field2957 = 0;
        return var2;
    }

    @ObfuscatedName("ii.l(I)V")
    public void method4497() {
        if (field2956 < field2959.length) {
            field2959[++field2956 - 1] = this;
        }
    }
}
