package deob;

@ObfuscatedName("i")
public final class class21 extends class191 {

    @ObfuscatedName("i.v")
    public static class182 field564 = new class182();

    @ObfuscatedName("i.t")
    public int field565;

    @ObfuscatedName("i.f")
    public int field551;

    @ObfuscatedName("i.j")
    public int field552;

    @ObfuscatedName("i.l")
    public int field553;

    @ObfuscatedName("i.g")
    public int field554;

    @ObfuscatedName("i.k")
    public int field555;

    @ObfuscatedName("i.p")
    public int field556;

    @ObfuscatedName("i.y")
    public class59 field557;

    @ObfuscatedName("i.m")
    public int field558;

    @ObfuscatedName("i.o")
    public int field559;

    @ObfuscatedName("i.c")
    public int[] field550;

    @ObfuscatedName("i.r")
    public class37 field563;

    @ObfuscatedName("i.s")
    public int field561;

    @ObfuscatedName("i.n")
    public class59 field562;

    @ObfuscatedName("d.v(I)V")
    public static void method471() {
        for (class21 var0 = (class21) field564.method3303(); var0 != null; var0 = (class21) field564.method3305()) {
            if (var0.field563 != null) {
                var0.method488();
            }
        }
    }

    @ObfuscatedName("i.t(B)V")
    public void method488() {
        int var1 = this.field556;
        class37 var2 = this.field563.method665();
        if (var2 == null) {
            this.field556 = -1;
            this.field555 = 0;
            this.field558 = 0;
            this.field559 = 0;
            this.field550 = null;
        } else {
            this.field556 = var2.field889;
            this.field555 = var2.field857 * 128;
            this.field558 = var2.field884;
            this.field559 = var2.field886;
            this.field550 = var2.field887;
        }
        if (this.field556 != var1 && this.field557 != null) {
            Statics.field1345.method976(this.field557);
            this.field557 = null;
        }
    }

    @ObfuscatedName("aj.f(IIILap;II)V")
    public static void method606(int arg0, int arg1, int arg2, class37 arg3, int arg4) {
        class21 var5 = new class21();
        var5.field565 = arg0;
        var5.field551 = arg1 * 128;
        var5.field552 = arg2 * 128;
        int var6 = arg3.field854;
        int var7 = arg3.field875;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field875;
            var7 = arg3.field854;
        }
        var5.field553 = (arg1 + var6) * 128;
        var5.field554 = (arg2 + var7) * 128;
        var5.field556 = arg3.field889;
        var5.field555 = arg3.field857 * 128;
        var5.field558 = arg3.field884;
        var5.field559 = arg3.field886;
        var5.field550 = arg3.field887;
        if (arg3.field880 != null) {
            var5.field563 = arg3;
            var5.method488();
        }
        field564.method3323(var5);
        if (var5.field550 != null) {
            var5.field561 = var5.field558 + (int) (Math.random() * (double) (var5.field559 - var5.field558));
        }
    }
}
