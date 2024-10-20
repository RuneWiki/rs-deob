package deob;

@ObfuscatedName("lr")
public class class311 extends class489 {

    @ObfuscatedName("lr.am")
    public class309 field3281;

    @ObfuscatedName("lr.ap")
    public int field3278;

    @ObfuscatedName("lr.af")
    public class530 field3279;

    @ObfuscatedName("lr.aj")
    public int field3280;

    @ObfuscatedName("lr.aq")
    public static class311[] field3277 = new class311[300];

    @ObfuscatedName("lr.ar")
    public static int field3282 = 0;

    @ObfuscatedName("sx.ap(Llo;Lvd;B)Llr;")
    public static class311 method7979(class309 arg0, class548 arg1) {
        class311 var2 = Statics.method2150();
        var2.field3281 = arg0;
        var2.field3278 = arg0.field3252;
        if (var2.field3278 == -1) {
            var2.field3279 = new class530(260);
        } else if (var2.field3278 == -2) {
            var2.field3279 = new class530(10000);
        } else if (var2.field3278 <= 18) {
            var2.field3279 = new class530(20);
        } else if (var2.field3278 <= 98) {
            var2.field3279 = new class530(100);
        } else {
            var2.field3279 = new class530(260);
        }
        var2.field3279.method8497(arg1);
        var2.field3279.method8498(var2.field3281.field3262);
        var2.field3280 = 0;
        return var2;
    }

    @ObfuscatedName("lr.af(B)V")
    public void method5419() {
        if (field3282 < field3277.length) {
            field3277[++field3282 - 1] = this;
        }
    }
}
