package deob;

@ObfuscatedName("mn")
public class class313 extends class492 {

    @ObfuscatedName("mn.aq")
    public class311 field3294;

    @ObfuscatedName("mn.aw")
    public int field3289;

    @ObfuscatedName("mn.al")
    public class533 field3291;

    @ObfuscatedName("mn.ai")
    public int field3292;

    @ObfuscatedName("mn.ar")
    public static class313[] field3295 = new class313[300];

    @ObfuscatedName("mn.as")
    public static int field3293 = 0;

    @ObfuscatedName("qu.aq(B)Lmn;")
    public static class313 method7273() {
        return field3293 == 0 ? new class313() : field3295[--field3293];
    }

    @ObfuscatedName("kr.aw(Llt;Lvk;S)Lmn;")
    public static class313 method5301(class311 arg0, class551 arg1) {
        class313 var2 = method7273();
        var2.field3294 = arg0;
        var2.field3289 = arg0.field3274;
        if (var2.field3289 == -1) {
            var2.field3291 = new class533(260);
        } else if (var2.field3289 == -2) {
            var2.field3291 = new class533(10000);
        } else if (var2.field3289 <= 18) {
            var2.field3291 = new class533(20);
        } else if (var2.field3289 <= 98) {
            var2.field3291 = new class533(100);
        } else {
            var2.field3291 = new class533(260);
        }
        var2.field3291.method8543(arg1);
        var2.field3291.method8544(var2.field3294.field3273);
        var2.field3292 = 0;
        return var2;
    }

    @ObfuscatedName("gl.al(I)Lmn;")
    public static class313 method3190() {
        class313 var0 = method7273();
        var0.field3294 = null;
        var0.field3289 = 0;
        var0.field3291 = new class533(5000);
        return var0;
    }

    @ObfuscatedName("mn.ai(I)V")
    public void method5433() {
        if (field3293 < field3295.length) {
            field3295[++field3293 - 1] = this;
        }
    }
}
