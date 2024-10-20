package deob;

@ObfuscatedName("me")
public class class325 extends class515 {

    @ObfuscatedName("me.ap")
    public class323 field3431;

    @ObfuscatedName("me.aw")
    public int field3430;

    @ObfuscatedName("me.ak")
    public class557 field3433;

    @ObfuscatedName("me.aj")
    public int field3432;

    @ObfuscatedName("me.ai")
    public static class325[] field3435 = new class325[300];

    @ObfuscatedName("me.ay")
    public static int field3434 = 0;

    @ObfuscatedName("ef.ap(Lmm;Lwh;B)Lme;")
    public static class325 method2983(class323 arg0, class575 arg1) {
        class325 var2;
        if (field3434 == 0) {
            var2 = new class325();
        } else {
            var2 = field3435[--field3434];
        }
        var2.field3431 = arg0;
        var2.field3430 = arg0.field3414;
        if (var2.field3430 == -1) {
            var2.field3433 = new class557(260);
        } else if (var2.field3430 == -2) {
            var2.field3433 = new class557(10000);
        } else if (var2.field3430 <= 18) {
            var2.field3433 = new class557(20);
        } else if (var2.field3430 <= 98) {
            var2.field3433 = new class557(100);
        } else {
            var2.field3433 = new class557(260);
        }
        var2.field3433.method9215(arg1);
        var2.field3433.method9201(var2.field3431.field3413);
        var2.field3432 = 0;
        return var2;
    }

    @ObfuscatedName("mj.aw(I)Lme;")
    public static class325 method5954() {
        class325 var0;
        if (field3434 == 0) {
            var0 = new class325();
        } else {
            var0 = field3435[--field3434];
        }
        var0.field3431 = null;
        var0.field3430 = 0;
        var0.field3433 = new class557(5000);
        return var0;
    }

    @ObfuscatedName("me.ak(I)V")
    public void method5957() {
        if (field3434 < field3435.length) {
            field3435[++field3434 - 1] = this;
        }
    }
}
