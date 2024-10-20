package deob;

@ObfuscatedName("o")
public final class class21 extends class189 {

    @ObfuscatedName("o.x")
    public int field542;

    @ObfuscatedName("o.v")
    public static class180 field557 = new class180();

    @ObfuscatedName("o.m")
    public int field540;

    @ObfuscatedName("o.e")
    public int field541;

    @ObfuscatedName("o.h")
    public int field551;

    @ObfuscatedName("o.p")
    public int field544;

    @ObfuscatedName("o.j")
    public int field545;

    @ObfuscatedName("o.i")
    public int field546;

    @ObfuscatedName("o.u")
    public class59 field547;

    @ObfuscatedName("o.l")
    public int field556;

    @ObfuscatedName("o.k")
    public int field549;

    @ObfuscatedName("o.q")
    public int[] field550;

    @ObfuscatedName("o.b")
    public int field543;

    @ObfuscatedName("o.w")
    public class59 field552;

    @ObfuscatedName("o.g")
    public class37 field553;

    @ObfuscatedName("y.x(I)V")
    public static void method515() {
        for (class21 var0 = (class21) field557.method3251(); var0 != null; var0 = (class21) field557.method3272()) {
            if (var0.field547 != null) {
                Statics.field1942.method973(var0.field547);
                var0.field547 = null;
            }
            if (var0.field552 != null) {
                Statics.field1942.method973(var0.field552);
                var0.field552 = null;
            }
        }
        field557.method3250();
    }

    @ObfuscatedName("v.v(I)V")
    public static void method5() {
        for (class21 var0 = (class21) field557.method3251(); var0 != null; var0 = (class21) field557.method3272()) {
            if (var0.field553 != null) {
                var0.method494();
            }
        }
    }

    @ObfuscatedName("o.m(I)V")
    public void method494() {
        int var1 = this.field546;
        class37 var2 = this.field553.method675();
        if (var2 == null) {
            this.field546 = -1;
            this.field545 = 0;
            this.field556 = 0;
            this.field549 = 0;
            this.field550 = null;
        } else {
            this.field546 = var2.field874;
            this.field545 = var2.field895 * 128;
            this.field556 = var2.field896;
            this.field549 = var2.field853;
            this.field550 = var2.field890;
        }
        if (this.field546 != var1 && this.field547 != null) {
            Statics.field1942.method973(this.field547);
            this.field547 = null;
        }
    }

    @ObfuscatedName("ap.e(IIILah;II)V")
    public static void method807(int arg0, int arg1, int arg2, class37 arg3, int arg4) {
        class21 var5 = new class21();
        var5.field540 = arg0;
        var5.field541 = arg1 * 128;
        var5.field542 = arg2 * 128;
        int var6 = arg3.field860;
        int var7 = arg3.field866;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field866;
            var7 = arg3.field860;
        }
        var5.field551 = (arg1 + var6) * 128;
        var5.field544 = (arg2 + var7) * 128;
        var5.field546 = arg3.field874;
        var5.field545 = arg3.field895 * 128;
        var5.field556 = arg3.field896;
        var5.field549 = arg3.field853;
        var5.field550 = arg3.field890;
        if (arg3.field891 != null) {
            var5.field553 = arg3;
            var5.method494();
        }
        field557.method3246(var5);
        if (var5.field550 != null) {
            var5.field543 = var5.field556 + (int) (Math.random() * (double) (var5.field549 - var5.field556));
        }
    }
}
