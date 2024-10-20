package deob;

@ObfuscatedName("fq")
public class class171 extends class200 {

    @ObfuscatedName("fq.d")
    public class168 field2425;

    @ObfuscatedName("fq.x")
    public int field2422;

    @ObfuscatedName("fq.k")
    public class187 field2423;

    @ObfuscatedName("fq.z")
    public int field2424;

    @ObfuscatedName("fq.v")
    public static class171[] field2428 = new class171[300];

    @ObfuscatedName("fq.m")
    public static int field2426 = 0;

    @ObfuscatedName("cc.d(I)Lfq;")
    public static class171 method1630() {
        return field2426 == 0 ? new class171() : field2428[--field2426];
    }

    @ObfuscatedName("hd.x(Lfn;Lgh;I)Lfq;")
    public static class171 method3795(class168 arg0, class188 arg1) {
        class171 var2 = method1630();
        var2.field2425 = arg0;
        var2.field2422 = arg0.field2303;
        if (var2.field2422 == -1) {
            var2.field2423 = new class187(260);
        } else if (var2.field2422 == -2) {
            var2.field2423 = new class187(10000);
        } else if (var2.field2422 <= 18) {
            var2.field2423 = new class187(20);
        } else if (var2.field2422 <= 98) {
            var2.field2423 = new class187(100);
        } else {
            var2.field2423 = new class187(260);
        }
        var2.field2423.method3306(arg1);
        var2.field2423.method3291(var2.field2425.field2383);
        var2.field2424 = 0;
        return var2;
    }

    @ObfuscatedName("go.k(I)Lfq;")
    public static class171 method3340() {
        class171 var0 = method1630();
        var0.field2425 = null;
        var0.field2422 = 0;
        var0.field2423 = new class187(5000);
        return var0;
    }

    @ObfuscatedName("fq.z(B)V")
    public void method2952() {
        if (field2426 < field2428.length) {
            field2428[++field2426 - 1] = this;
        }
    }
}
