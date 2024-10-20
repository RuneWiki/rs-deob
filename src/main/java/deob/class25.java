package deob;

@ObfuscatedName("s")
public final class class25 extends class212 {

    @ObfuscatedName("s.f")
    public static class203 field627 = new class203();

    @ObfuscatedName("s.e")
    public int field628;

    @ObfuscatedName("s.n")
    public int field614;

    @ObfuscatedName("s.t")
    public int field615;

    @ObfuscatedName("s.v")
    public int field616;

    @ObfuscatedName("s.b")
    public int field617;

    @ObfuscatedName("s.m")
    public int field618;

    @ObfuscatedName("s.k")
    public int field619;

    @ObfuscatedName("s.c")
    public class68 field620;

    @ObfuscatedName("s.w")
    public int field629;

    @ObfuscatedName("s.l")
    public int field621;

    @ObfuscatedName("s.h")
    public int[] field623;

    @ObfuscatedName("s.i")
    public int field612;

    @ObfuscatedName("s.u")
    public class68 field625;

    @ObfuscatedName("s.x")
    public class43 field626;

    @ObfuscatedName("z.f(I)V")
    public static void method569() {
        for (class25 var0 = (class25) field627.method3646(); var0 != null; var0 = (class25) field627.method3648()) {
            if (var0.field620 != null) {
                Statics.field60.method1153(var0.field620);
                var0.field620 = null;
            }
            if (var0.field625 != null) {
                Statics.field60.method1153(var0.field625);
                var0.field625 = null;
            }
        }
        field627.method3641();
    }

    @ObfuscatedName("z.e(B)V")
    public static void method568() {
        for (class25 var0 = (class25) field627.method3646(); var0 != null; var0 = (class25) field627.method3648()) {
            if (var0.field626 != null) {
                var0.method590();
            }
        }
    }

    @ObfuscatedName("s.n(I)V")
    public void method590() {
        int var1 = this.field619;
        class43 var2 = this.field626.method811();
        if (var2 == null) {
            this.field619 = -1;
            this.field618 = 0;
            this.field629 = 0;
            this.field621 = 0;
            this.field623 = null;
        } else {
            this.field619 = var2.field966;
            this.field618 = var2.field967 * 128;
            this.field629 = var2.field974;
            this.field621 = var2.field969;
            this.field623 = var2.field970;
        }
        if (this.field619 != var1 && this.field620 != null) {
            Statics.field60.method1153(this.field620);
            this.field620 = null;
        }
    }

    @ObfuscatedName("z.t(IIILak;II)V")
    public static void method564(int arg0, int arg1, int arg2, class43 arg3, int arg4) {
        class25 var5 = new class25();
        var5.field628 = arg0;
        var5.field614 = arg1 * 128;
        var5.field615 = arg2 * 128;
        int var6 = arg3.field937;
        int var7 = arg3.field938;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field938;
            var7 = arg3.field937;
        }
        var5.field616 = (arg1 + var6) * 128;
        var5.field617 = (arg2 + var7) * 128;
        var5.field619 = arg3.field966;
        var5.field618 = arg3.field967 * 128;
        var5.field629 = arg3.field974;
        var5.field621 = arg3.field969;
        var5.field623 = arg3.field970;
        if (arg3.field963 != null) {
            var5.field626 = arg3;
            var5.method590();
        }
        field627.method3642(var5);
        if (var5.field623 != null) {
            var5.field612 = var5.field629 + (int) (Math.random() * (double) (var5.field621 - var5.field629));
        }
    }
}
