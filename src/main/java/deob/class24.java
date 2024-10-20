package deob;

@ObfuscatedName("m")
public final class class24 extends class209 {

    @ObfuscatedName("m.t")
    public static class200 field600 = new class200();

    @ObfuscatedName("m.i")
    public int field597;

    @ObfuscatedName("m.g")
    public int field596;

    @ObfuscatedName("m.h")
    public int field610;

    @ObfuscatedName("m.z")
    public int field613;

    @ObfuscatedName("m.r")
    public class41 field599;

    @ObfuscatedName("m.f")
    public int field606;

    @ObfuscatedName("m.s")
    public int field598;

    @ObfuscatedName("m.d")
    public int field602;

    @ObfuscatedName("m.l")
    public int field603;

    @ObfuscatedName("m.y")
    public class65 field604;

    @ObfuscatedName("m.p")
    public int field605;

    @ObfuscatedName("m.k")
    public int[] field607;

    @ObfuscatedName("m.o")
    public int field608;

    @ObfuscatedName("m.b")
    public class65 field601;

    @ObfuscatedName("w.t(I)V")
    public static void method568() {
        for (class24 var0 = (class24) field600.method3534(); var0 != null; var0 = (class24) field600.method3516()) {
            if (var0.field604 != null) {
                Statics.field2066.method1060(var0.field604);
                var0.field604 = null;
            }
            if (var0.field601 != null) {
                Statics.field2066.method1060(var0.field601);
                var0.field601 = null;
            }
        }
        field600.method3509();
    }

    @ObfuscatedName("ch.i(I)V")
    public static void method1725() {
        for (class24 var0 = (class24) field600.method3534(); var0 != null; var0 = (class24) field600.method3516()) {
            if (var0.field599 != null) {
                var0.method555();
            }
        }
    }

    @ObfuscatedName("m.g(B)V")
    public void method555() {
        int var1 = this.field603;
        class41 var2 = this.field599.method766();
        if (var2 == null) {
            this.field603 = -1;
            this.field602 = 0;
            this.field598 = 0;
            this.field605 = 0;
            this.field607 = null;
        } else {
            this.field603 = var2.field959;
            this.field602 = var2.field960 * 128;
            this.field598 = var2.field961;
            this.field605 = var2.field962;
            this.field607 = var2.field963;
        }
        if (this.field603 != var1 && this.field604 != null) {
            Statics.field2066.method1060(this.field604);
            this.field604 = null;
        }
    }

    @ObfuscatedName("w.h(IIILao;II)V")
    public static void method565(int arg0, int arg1, int arg2, class41 arg3, int arg4) {
        class24 var5 = new class24();
        var5.field597 = arg0;
        var5.field596 = arg1 * 128;
        var5.field610 = arg2 * 128;
        int var6 = arg3.field955;
        int var7 = arg3.field924;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field924;
            var7 = arg3.field955;
        }
        var5.field613 = (arg1 + var6) * 128;
        var5.field606 = (arg2 + var7) * 128;
        var5.field603 = arg3.field959;
        var5.field602 = arg3.field960 * 128;
        var5.field598 = arg3.field961;
        var5.field605 = arg3.field962;
        var5.field607 = arg3.field963;
        if (arg3.field956 != null) {
            var5.field599 = arg3;
            var5.method555();
        }
        field600.method3508(var5);
        if (var5.field607 != null) {
            var5.field608 = var5.field598 + (int) (Math.random() * (double) (var5.field605 - var5.field598));
        }
    }
}
