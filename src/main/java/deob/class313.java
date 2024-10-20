package deob;

@ObfuscatedName("mh")
public class class313 extends class493 {

    @ObfuscatedName("mh.az")
    public class311 field3322;

    @ObfuscatedName("mh.ah")
    public int field3317;

    @ObfuscatedName("mh.af")
    public class534 field3318;

    @ObfuscatedName("mh.at")
    public int field3319;

    @ObfuscatedName("mh.an")
    public static class313[] field3320 = new class313[300];

    @ObfuscatedName("mh.ao")
    public static int field3316 = 0;

    @ObfuscatedName("kt.az(I)Lmh;")
    public static class313 method5166() {
        return field3316 == 0 ? new class313() : field3320[--field3316];
    }

    @ObfuscatedName("qh.ah(Llw;Lvb;B)Lmh;")
    public static class313 method7156(class311 arg0, class552 arg1) {
        class313 var2 = method5166();
        var2.field3322 = arg0;
        var2.field3317 = arg0.field3302;
        if (var2.field3317 == -1) {
            var2.field3318 = new class534(260);
        } else if (var2.field3317 == -2) {
            var2.field3318 = new class534(10000);
        } else if (var2.field3317 <= 18) {
            var2.field3318 = new class534(20);
        } else if (var2.field3317 <= 98) {
            var2.field3318 = new class534(100);
        } else {
            var2.field3318 = new class534(260);
        }
        var2.field3318.method8441(arg1);
        var2.field3318.method8408(var2.field3322.field3301);
        var2.field3319 = 0;
        return var2;
    }

    @ObfuscatedName("gh.af(I)Lmh;")
    public static class313 method3153() {
        class313 var0 = method5166();
        var0.field3322 = null;
        var0.field3317 = 0;
        var0.field3318 = new class534(5000);
        return var0;
    }

    @ObfuscatedName("mh.at(I)V")
    public void method5357() {
        if (field3316 < field3320.length) {
            field3320[++field3316 - 1] = this;
        }
    }
}
