package deob;

@ObfuscatedName("lx")
public class class311 extends class488 {

    @ObfuscatedName("lx.ac")
    public class309 field3254;

    @ObfuscatedName("lx.al")
    public int field3249;

    @ObfuscatedName("lx.ak")
    public class529 field3250;

    @ObfuscatedName("lx.ax")
    public int field3256;

    @ObfuscatedName("lx.ao")
    public static class311[] field3252 = new class311[300];

    @ObfuscatedName("lx.ah")
    public static int field3251 = 0;

    @ObfuscatedName("le.ac(B)Llx;")
    public static class311 method5304() {
        return field3251 == 0 ? new class311() : field3252[--field3251];
    }

    @ObfuscatedName("fv.al(Lln;Lvd;I)Llx;")
    public static class311 method2978(class309 arg0, class547 arg1) {
        class311 var2 = method5304();
        var2.field3254 = arg0;
        var2.field3249 = arg0.field3233;
        if (var2.field3249 == -1) {
            var2.field3250 = new class529(260);
        } else if (var2.field3249 == -2) {
            var2.field3250 = new class529(10000);
        } else if (var2.field3249 <= 18) {
            var2.field3250 = new class529(20);
        } else if (var2.field3249 <= 98) {
            var2.field3250 = new class529(100);
        } else {
            var2.field3250 = new class529(260);
        }
        var2.field3250.method8334(arg1);
        var2.field3250.method8330(var2.field3254.field3232);
        var2.field3256 = 0;
        return var2;
    }

    @ObfuscatedName("da.ak(I)Llx;")
    public static class311 method2571() {
        class311 var0 = method5304();
        var0.field3254 = null;
        var0.field3249 = 0;
        var0.field3250 = new class529(5000);
        return var0;
    }

    @ObfuscatedName("lx.ax(I)V")
    public void method5315() {
        if (field3251 < field3252.length) {
            field3252[++field3251 - 1] = this;
        }
    }
}
