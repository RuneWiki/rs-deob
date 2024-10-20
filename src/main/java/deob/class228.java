package deob;

@ObfuscatedName("hg")
public class class228 extends class353 {

    @ObfuscatedName("hg.f")
    public class226 field2698;

    @ObfuscatedName("hg.e")
    public int field2697;

    @ObfuscatedName("hg.v")
    public class383 field2700;

    @ObfuscatedName("hg.y")
    public int field2699;

    @ObfuscatedName("hg.j")
    public static class228[] field2703 = new class228[300];

    @ObfuscatedName("hg.o")
    public static int field2701 = 0;

    @ObfuscatedName("fu.f(I)Lhg;")
    public static class228 method3263() {
        return field2701 == 0 ? new class228() : field2703[--field2701];
    }

    @ObfuscatedName("ci.e(Lhw;Lod;I)Lhg;")
    public static class228 method1927(class226 arg0, class400 arg1) {
        class228 var2;
        if (field2701 == 0) {
            var2 = new class228();
        } else {
            var2 = field2703[--field2701];
        }
        var2.field2698 = arg0;
        var2.field2697 = arg0.field2625;
        if (var2.field2697 == -1) {
            var2.field2700 = new class383(260);
        } else if (var2.field2697 == -2) {
            var2.field2700 = new class383(10000);
        } else if (var2.field2697 <= 18) {
            var2.field2700 = new class383(20);
        } else if (var2.field2697 <= 98) {
            var2.field2700 = new class383(100);
        } else {
            var2.field2700 = new class383(260);
        }
        var2.field2700.method5847(arg1);
        var2.field2700.method5849(var2.field2698.field2681);
        var2.field2699 = 0;
        return var2;
    }

    @ObfuscatedName("ce.v(I)Lhg;")
    public static class228 method1901() {
        class228 var0 = method3263();
        var0.field2698 = null;
        var0.field2697 = 0;
        var0.field2700 = new class383(5000);
        return var0;
    }

    @ObfuscatedName("hg.y(I)V")
    public void method4009() {
        if (field2701 < field2703.length) {
            field2703[++field2701 - 1] = this;
        }
    }
}
