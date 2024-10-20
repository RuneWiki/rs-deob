package deob;

@ObfuscatedName("md")
public class class321 extends class504 {

    @ObfuscatedName("md.ak")
    public class319 field3398;

    @ObfuscatedName("md.al")
    public int field3392;

    @ObfuscatedName("md.aj")
    public class545 field3393;

    @ObfuscatedName("md.az")
    public int field3395;

    @ObfuscatedName("md.af")
    public static class321[] field3394 = new class321[300];

    @ObfuscatedName("md.aa")
    public static int field3396 = 0;

    @ObfuscatedName("lw.ak(S)Lmd;")
    public static class321 method5519() {
        return field3396 == 0 ? new class321() : field3394[--field3396];
    }

    @ObfuscatedName("hr.al(Lmc;Lvr;I)Lmd;")
    public static class321 method3542(class319 arg0, class563 arg1) {
        class321 var2 = method5519();
        var2.field3398 = arg0;
        var2.field3392 = arg0.field3296;
        if (var2.field3392 == -1) {
            var2.field3393 = new class545(260);
        } else if (var2.field3392 == -2) {
            var2.field3393 = new class545(10000);
        } else if (var2.field3392 <= 18) {
            var2.field3393 = new class545(20);
        } else if (var2.field3392 <= 98) {
            var2.field3393 = new class545(100);
        } else {
            var2.field3393 = new class545(260);
        }
        var2.field3393.method8750(arg1);
        var2.field3393.method8733(var2.field3398.field3373);
        var2.field3395 = 0;
        return var2;
    }

    @ObfuscatedName("md.aj(S)V")
    public void method5592() {
        if (field3396 < field3394.length) {
            field3394[++field3396 - 1] = this;
        }
    }
}
