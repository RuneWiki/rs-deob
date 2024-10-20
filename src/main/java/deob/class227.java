package deob;

@ObfuscatedName("hq")
public class class227 extends class352 {

    @ObfuscatedName("hq.v")
    public class225 field2697;

    @ObfuscatedName("hq.n")
    public int field2692;

    @ObfuscatedName("hq.f")
    public class382 field2693;

    @ObfuscatedName("hq.y")
    public int field2694;

    @ObfuscatedName("hq.p")
    public static class227[] field2698 = new class227[300];

    @ObfuscatedName("hq.j")
    public static int field2696 = 0;

    @ObfuscatedName("w.v(Lhs;Loy;B)Lhq;")
    public static class227 method171(class225 arg0, class399 arg1) {
        class227 var2;
        if (field2696 == 0) {
            var2 = new class227();
        } else {
            var2 = field2698[--field2696];
        }
        var2.field2697 = arg0;
        var2.field2692 = arg0.field2680;
        if (var2.field2692 == -1) {
            var2.field2693 = new class382(260);
        } else if (var2.field2692 == -2) {
            var2.field2693 = new class382(10000);
        } else if (var2.field2692 <= 18) {
            var2.field2693 = new class382(20);
        } else if (var2.field2692 <= 98) {
            var2.field2693 = new class382(100);
        } else {
            var2.field2693 = new class382(260);
        }
        var2.field2693.method5914(arg1);
        var2.field2693.method5917(var2.field2697.field2618);
        var2.field2694 = 0;
        return var2;
    }

    @ObfuscatedName("t.n(I)Lhq;")
    public static class227 method173() {
        class227 var0;
        if (field2696 == 0) {
            var0 = new class227();
        } else {
            var0 = field2698[--field2696];
        }
        var0.field2697 = null;
        var0.field2692 = 0;
        var0.field2693 = new class382(5000);
        return var0;
    }

    @ObfuscatedName("hq.f(B)V")
    public void method3968() {
        if (field2696 < field2698.length) {
            field2698[++field2696 - 1] = this;
        }
    }
}
