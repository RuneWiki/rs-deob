package deob;

@ObfuscatedName("fv")
public class class180 extends class212 {

    @ObfuscatedName("fv.n")
    public class177 field2343;

    @ObfuscatedName("fv.h")
    public int field2344;

    @ObfuscatedName("fv.l")
    public class197 field2345;

    @ObfuscatedName("fv.g")
    public int field2346;

    @ObfuscatedName("fv.b")
    public static class180[] field2349 = new class180[300];

    @ObfuscatedName("fv.a")
    public static int field2348 = 0;

    @ObfuscatedName("kh.n(I)Lfv;")
    public static class180 method5309() {
        return field2348 == 0 ? new class180() : field2349[--field2348];
    }

    @ObfuscatedName("bt.h(Lff;Lgb;B)Lfv;")
    public static class180 method1090(class177 arg0, class198 arg1) {
        class180 var2 = method5309();
        var2.field2343 = arg0;
        var2.field2344 = arg0.field2320;
        if (var2.field2344 == -1) {
            var2.field2345 = new class197(260);
        } else if (var2.field2344 == -2) {
            var2.field2345 = new class197(10000);
        } else if (var2.field2344 <= 18) {
            var2.field2345 = new class197(20);
        } else if (var2.field2344 <= 98) {
            var2.field2345 = new class197(100);
        } else {
            var2.field2345 = new class197(260);
        }
        var2.field2345.method3767(arg1);
        var2.field2345.method3739(var2.field2343.field2319);
        var2.field2346 = 0;
        return var2;
    }

    @ObfuscatedName("fv.l(I)V")
    public void method3424() {
        if (field2348 < field2349.length) {
            field2349[++field2348 - 1] = this;
        }
    }
}
