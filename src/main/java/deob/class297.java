package deob;

@ObfuscatedName("ly")
public class class297 extends class473 {

    @ObfuscatedName("ly.au")
    public class295 field3221;

    @ObfuscatedName("ly.ae")
    public int field3222;

    @ObfuscatedName("ly.ao")
    public class514 field3227;

    @ObfuscatedName("ly.at")
    public int field3223;

    @ObfuscatedName("ly.ac")
    public static class297[] field3224 = new class297[300];

    @ObfuscatedName("ly.ai")
    public static int field3225 = 0;

    @ObfuscatedName("fn.au(B)Lly;")
    public static class297 method2971() {
        return field3225 == 0 ? new class297() : field3224[--field3225];
    }

    @ObfuscatedName("cl.ae(Llw;Lux;I)Lly;")
    public static class297 method1166(class295 arg0, class532 arg1) {
        class297 var2 = method2971();
        var2.field3221 = arg0;
        var2.field3222 = arg0.field3178;
        if (var2.field3222 == -1) {
            var2.field3227 = new class514(260);
        } else if (var2.field3222 == -2) {
            var2.field3227 = new class514(10000);
        } else if (var2.field3222 <= 18) {
            var2.field3227 = new class514(20);
        } else if (var2.field3222 <= 98) {
            var2.field3227 = new class514(100);
        } else {
            var2.field3227 = new class514(260);
        }
        var2.field3227.method8240(arg1);
        var2.field3227.method8242(var2.field3221.field3127);
        var2.field3223 = 0;
        return var2;
    }

    @ObfuscatedName("ly.ao(I)V")
    public void method5193() {
        if (field3225 < field3224.length) {
            field3224[++field3225 - 1] = this;
        }
    }
}
