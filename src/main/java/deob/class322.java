package deob;

@ObfuscatedName("mb")
public class class322 extends class505 {

    @ObfuscatedName("mb.aq")
    public class320 field3396;

    @ObfuscatedName("mb.ad")
    public int field3393;

    @ObfuscatedName("mb.ag")
    public class546 field3394;

    @ObfuscatedName("mb.ak")
    public int field3395;

    @ObfuscatedName("mb.ap")
    public static class322[] field3398 = new class322[300];

    @ObfuscatedName("mb.an")
    public static int field3392 = 0;

    @ObfuscatedName("ma.aq(B)Lmb;")
    public static class322 method5536() {
        return field3392 == 0 ? new class322() : field3398[--field3392];
    }

    @ObfuscatedName("gl.ad(Lmi;Lvs;S)Lmb;")
    public static class322 method3236(class320 arg0, class564 arg1) {
        class322 var2 = method5536();
        var2.field3396 = arg0;
        var2.field3393 = arg0.field3378;
        if (var2.field3393 == -1) {
            var2.field3394 = new class546(260);
        } else if (var2.field3393 == -2) {
            var2.field3394 = new class546(10000);
        } else if (var2.field3393 <= 18) {
            var2.field3394 = new class546(20);
        } else if (var2.field3393 <= 98) {
            var2.field3394 = new class546(100);
        } else {
            var2.field3394 = new class546(260);
        }
        var2.field3394.method8671(arg1);
        var2.field3394.method8699(var2.field3396.field3369);
        var2.field3395 = 0;
        return var2;
    }

    @ObfuscatedName("js.ag(B)Lmb;")
    public static class322 method4566() {
        class322 var0 = method5536();
        var0.field3396 = null;
        var0.field3393 = 0;
        var0.field3394 = new class546(5000);
        return var0;
    }

    @ObfuscatedName("mb.ak(I)V")
    public void method5520() {
        if (field3392 < field3398.length) {
            field3398[++field3392 - 1] = this;
        }
    }
}
