package deob;

@ObfuscatedName("fc")
public class class171 extends class200 {

    @ObfuscatedName("fc.b")
    public class168 field2422;

    @ObfuscatedName("fc.s")
    public int field2417;

    @ObfuscatedName("fc.r")
    public class187 field2423;

    @ObfuscatedName("fc.g")
    public int field2424;

    @ObfuscatedName("fc.x")
    public static class171[] field2420 = new class171[300];

    @ObfuscatedName("fc.f")
    public static int field2421 = 0;

    @ObfuscatedName("cf.b(I)Lfc;")
    public static class171 method1668() {
        return field2421 == 0 ? new class171() : field2420[--field2421];
    }

    @ObfuscatedName("y.s(Lfi;Lgi;I)Lfc;")
    public static class171 method124(class168 arg0, class188 arg1) {
        class171 var2 = method1668();
        var2.field2422 = arg0;
        var2.field2417 = arg0.field2396;
        if (var2.field2417 == -1) {
            var2.field2423 = new class187(260);
        } else if (var2.field2417 == -2) {
            var2.field2423 = new class187(10000);
        } else if (var2.field2417 <= 18) {
            var2.field2423 = new class187(20);
        } else if (var2.field2417 <= 98) {
            var2.field2423 = new class187(100);
        } else {
            var2.field2423 = new class187(260);
        }
        var2.field2423.method3202(arg1);
        var2.field2423.method3203(var2.field2422.field2395);
        var2.field2424 = 0;
        return var2;
    }

    @ObfuscatedName("fc.r(I)V")
    public void method2865() {
        if (field2421 < field2420.length) {
            field2420[++field2421 - 1] = this;
        }
    }
}
