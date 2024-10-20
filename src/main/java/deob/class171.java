package deob;

@ObfuscatedName("fg")
public class class171 extends class200 {

    @ObfuscatedName("fg.m")
    public class168 field2425;

    @ObfuscatedName("fg.p")
    public int field2427;

    @ObfuscatedName("fg.i")
    public int field2428;

    @ObfuscatedName("fg.j")
    public class187 field2424;

    @ObfuscatedName("fg.v")
    public static class171[] field2426 = new class171[300];

    @ObfuscatedName("fg.x")
    public static int field2423 = 0;

    @ObfuscatedName("a.m(B)Lfg;")
    public static class171 method50() {
        return field2423 == 0 ? new class171() : field2426[--field2423];
    }

    @ObfuscatedName("bf.p(Lfo;Lga;B)Lfg;")
    public static class171 method1482(class168 arg0, class188 arg1) {
        class171 var2 = method50();
        var2.field2425 = arg0;
        var2.field2428 = arg0.field2403;
        if (var2.field2428 == -1) {
            var2.field2424 = new class187(260);
        } else if (var2.field2428 == -2) {
            var2.field2424 = new class187(10000);
        } else if (var2.field2428 <= 18) {
            var2.field2424 = new class187(20);
        } else if (var2.field2428 <= 98) {
            var2.field2424 = new class187(100);
        } else {
            var2.field2424 = new class187(260);
        }
        var2.field2424.method3280(arg1);
        var2.field2424.method3273(var2.field2425.field2402);
        var2.field2427 = 0;
        return var2;
    }

    @ObfuscatedName("fg.i(B)V")
    public void method2920() {
        if (field2423 < field2426.length) {
            field2426[++field2423 - 1] = this;
        }
    }
}
