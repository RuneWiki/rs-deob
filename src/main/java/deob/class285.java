package deob;

@ObfuscatedName("kp")
public class class285 extends class444 {

    @ObfuscatedName("kp.aj")
    public class283 field3167;

    @ObfuscatedName("kp.al")
    public int field3170;

    @ObfuscatedName("kp.ac")
    public class477 field3169;

    @ObfuscatedName("kp.ab")
    public int field3168;

    @ObfuscatedName("kp.an")
    public static class285[] field3171 = new class285[300];

    @ObfuscatedName("kp.ao")
    public static int field3172 = 0;

    @ObfuscatedName("eg.aj(Lkb;Ltk;B)Lkp;")
    public static class285 method2741(class283 arg0, class495 arg1) {
        class285 var2;
        if (field3172 == 0) {
            var2 = new class285();
        } else {
            var2 = field3171[--field3172];
        }
        var2.field3167 = arg0;
        var2.field3170 = arg0.field3154;
        if (var2.field3170 == -1) {
            var2.field3169 = new class477(260);
        } else if (var2.field3170 == -2) {
            var2.field3169 = new class477(10000);
        } else if (var2.field3170 <= 18) {
            var2.field3169 = new class477(20);
        } else if (var2.field3170 <= 98) {
            var2.field3169 = new class477(100);
        } else {
            var2.field3169 = new class477(260);
        }
        var2.field3169.method7846(arg1);
        var2.field3169.method7868(var2.field3167.field3118);
        var2.field3168 = 0;
        return var2;
    }

    @ObfuscatedName("iv.al(B)Lkp;")
    public static class285 method4392() {
        class285 var0;
        if (field3172 == 0) {
            var0 = new class285();
        } else {
            var0 = field3171[--field3172];
        }
        var0.field3167 = null;
        var0.field3170 = 0;
        var0.field3169 = new class477(5000);
        return var0;
    }

    @ObfuscatedName("kp.ac(I)V")
    public void method4946() {
        if (field3172 < field3171.length) {
            field3171[++field3172 - 1] = this;
        }
    }
}
