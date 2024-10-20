package deob;

@ObfuscatedName("hg")
public class class229 extends class354 {

    @ObfuscatedName("hg.s")
    public class227 field2685;

    @ObfuscatedName("hg.t")
    public int field2686;

    @ObfuscatedName("hg.v")
    public class384 field2691;

    @ObfuscatedName("hg.j")
    public int field2688;

    @ObfuscatedName("hg.l")
    public static class229[] field2689 = new class229[300];

    @ObfuscatedName("hg.n")
    public static int field2687 = 0;

    @ObfuscatedName("fy.s(B)Lhg;")
    public static class229 method2886() {
        return field2687 == 0 ? new class229() : field2689[--field2687];
    }

    @ObfuscatedName("ey.t(Lhx;Log;I)Lhg;")
    public static class229 method2538(class227 arg0, class401 arg1) {
        class229 var2 = method2886();
        var2.field2685 = arg0;
        var2.field2686 = arg0.field2670;
        if (var2.field2686 == -1) {
            var2.field2691 = new class384(260);
        } else if (var2.field2686 == -2) {
            var2.field2691 = new class384(10000);
        } else if (var2.field2686 <= 18) {
            var2.field2691 = new class384(20);
        } else if (var2.field2686 <= 98) {
            var2.field2691 = new class384(100);
        } else {
            var2.field2691 = new class384(260);
        }
        var2.field2691.method5896(arg1);
        var2.field2691.method5897(var2.field2685.field2669);
        var2.field2688 = 0;
        return var2;
    }

    @ObfuscatedName("ba.v(I)Lhg;")
    public static class229 method1686() {
        class229 var0 = method2886();
        var0.field2685 = null;
        var0.field2686 = 0;
        var0.field2691 = new class384(5000);
        return var0;
    }

    @ObfuscatedName("hg.j(I)V")
    public void method3942() {
        if (field2687 < field2689.length) {
            field2689[++field2687 - 1] = this;
        }
    }
}
