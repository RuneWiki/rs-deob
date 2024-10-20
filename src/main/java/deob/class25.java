package deob;

@ObfuscatedName("a")
public final class class25 extends class212 {

    @ObfuscatedName("a.m")
    public static class203 field625 = new class203();

    @ObfuscatedName("a.w")
    public int field603;

    @ObfuscatedName("a.e")
    public int field608;

    @ObfuscatedName("a.o")
    public int field618;

    @ObfuscatedName("a.g")
    public int field606;

    @ObfuscatedName("a.l")
    public int field607;

    @ObfuscatedName("a.j")
    public int field602;

    @ObfuscatedName("a.r")
    public class43 field616;

    @ObfuscatedName("a.x")
    public int field622;

    @ObfuscatedName("a.k")
    public class68 field610;

    @ObfuscatedName("a.v")
    public int field611;

    @ObfuscatedName("a.h")
    public int field612;

    @ObfuscatedName("a.u")
    public int[] field613;

    @ObfuscatedName("a.y")
    public int field614;

    @ObfuscatedName("a.p")
    public class68 field615;

    @ObfuscatedName("aj.m(B)V")
    public static void method602() {
        for (class25 var0 = (class25) field625.method3621(); var0 != null; var0 = (class25) field625.method3630()) {
            if (var0.field610 != null) {
                Statics.field255.method1194(var0.field610);
                var0.field610 = null;
            }
            if (var0.field615 != null) {
                Statics.field255.method1194(var0.field615);
                var0.field615 = null;
            }
        }
        field625.method3632();
    }

    @ObfuscatedName("dz.w(I)V")
    public static void method2219() {
        for (class25 var0 = (class25) field625.method3621(); var0 != null; var0 = (class25) field625.method3630()) {
            if (var0.field616 != null) {
                var0.method573();
            }
        }
    }

    @ObfuscatedName("a.e(I)V")
    public void method573() {
        int var1 = this.field622;
        class43 var2 = this.field616.method817();
        if (var2 == null) {
            this.field622 = -1;
            this.field602 = 0;
            this.field611 = 0;
            this.field612 = 0;
            this.field613 = null;
        } else {
            this.field622 = var2.field987;
            this.field602 = var2.field988 * 128;
            this.field611 = var2.field966;
            this.field612 = var2.field990;
            this.field613 = var2.field991;
        }
        if (this.field622 != var1 && this.field610 != null) {
            Statics.field255.method1194(this.field610);
            this.field610 = null;
        }
    }

    @ObfuscatedName("cp.o(IIILal;IB)V")
    public static void method2133(int arg0, int arg1, int arg2, class43 arg3, int arg4) {
        class25 var5 = new class25();
        var5.field603 = arg0;
        var5.field608 = arg1 * 128;
        var5.field618 = arg2 * 128;
        int var6 = arg3.field977;
        int var7 = arg3.field981;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field981;
            var7 = arg3.field977;
        }
        var5.field606 = (arg1 + var6) * 128;
        var5.field607 = (arg2 + var7) * 128;
        var5.field622 = arg3.field987;
        var5.field602 = arg3.field988 * 128;
        var5.field611 = arg3.field966;
        var5.field612 = arg3.field990;
        var5.field613 = arg3.field991;
        if (arg3.field984 != null) {
            var5.field616 = arg3;
            var5.method573();
        }
        field625.method3616(var5);
        if (var5.field613 != null) {
            var5.field614 = var5.field611 + (int) (Math.random() * (double) (var5.field612 - var5.field611));
        }
    }
}
