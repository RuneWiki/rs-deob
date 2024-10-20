package deob;

@ObfuscatedName("h")
public final class class21 extends class189 {

    @ObfuscatedName("h.l")
    public static class180 field554 = new class180();

    @ObfuscatedName("h.y")
    public int field552;

    @ObfuscatedName("h.g")
    public int field548;

    @ObfuscatedName("h.j")
    public int field545;

    @ObfuscatedName("h.w")
    public int field539;

    @ObfuscatedName("h.c")
    public int field540;

    @ObfuscatedName("h.x")
    public int field541;

    @ObfuscatedName("h.f")
    public int field542;

    @ObfuscatedName("h.t")
    public class59 field543;

    @ObfuscatedName("h.n")
    public int field544;

    @ObfuscatedName("h.p")
    public int field547;

    @ObfuscatedName("h.a")
    public int[] field546;

    @ObfuscatedName("h.o")
    public int field537;

    @ObfuscatedName("h.b")
    public class59 field536;

    @ObfuscatedName("h.r")
    public class37 field538;

    @ObfuscatedName("el.l(B)V")
    public static void method2881() {
        for (class21 var0 = (class21) field554.method3304(); var0 != null; var0 = (class21) field554.method3297()) {
            if (var0.field538 != null) {
                var0.method485();
            }
        }
    }

    @ObfuscatedName("h.y(B)V")
    public void method485() {
        int var1 = this.field542;
        class37 var2 = this.field538.method662();
        if (var2 == null) {
            this.field542 = -1;
            this.field541 = 0;
            this.field544 = 0;
            this.field547 = 0;
            this.field546 = null;
        } else {
            this.field542 = var2.field874;
            this.field541 = var2.field875 * 128;
            this.field544 = var2.field876;
            this.field547 = var2.field854;
            this.field546 = var2.field829;
        }
        if (this.field542 != var1 && this.field543 != null) {
            Statics.field1275.method949(this.field543);
            this.field543 = null;
        }
    }

    @ObfuscatedName("fm.g(IIILam;II)V")
    public static void method2956(int arg0, int arg1, int arg2, class37 arg3, int arg4) {
        class21 var5 = new class21();
        var5.field552 = arg0;
        var5.field548 = arg1 * 128;
        var5.field545 = arg2 * 128;
        int var6 = arg3.field845;
        int var7 = arg3.field869;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field869;
            var7 = arg3.field845;
        }
        var5.field539 = (arg1 + var6) * 128;
        var5.field540 = (arg2 + var7) * 128;
        var5.field542 = arg3.field874;
        var5.field541 = arg3.field875 * 128;
        var5.field544 = arg3.field876;
        var5.field547 = arg3.field854;
        var5.field546 = arg3.field829;
        if (arg3.field857 != null) {
            var5.field538 = arg3;
            var5.method485();
        }
        field554.method3278(var5);
        if (var5.field546 != null) {
            var5.field537 = var5.field544 + (int) (Math.random() * (double) (var5.field547 - var5.field544));
        }
    }

    @ObfuscatedName("f.j(IIIII)V")
    public static void method107(int arg0, int arg1, int arg2, int arg3) {
        for (class21 var4 = (class21) field554.method3304(); var4 != null; var4 = (class21) field554.method3297()) {
            if (var4.field542 != -1 || var4.field546 != null) {
                int var5 = 0;
                if (arg1 > var4.field539) {
                    var5 += arg1 - var4.field539;
                } else if (arg1 < var4.field548) {
                    var5 += var4.field548 - arg1;
                }
                if (arg2 > var4.field540) {
                    var5 += arg2 - var4.field540;
                } else if (arg2 < var4.field545) {
                    var5 += var4.field545 - arg2;
                }
                if (var5 - 64 > var4.field541 || client.field476 == 0 || var4.field552 != arg0) {
                    if (var4.field543 != null) {
                        Statics.field1275.method949(var4.field543);
                        var4.field543 = null;
                    }
                    if (var4.field536 != null) {
                        Statics.field1275.method949(var4.field536);
                        var4.field536 = null;
                    }
                } else {
                    var5 -= 64;
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    int var6 = client.field476 * (var4.field541 - var5) / var4.field541;
                    if (var4.field543 != null) {
                        var4.field543.method1174(var6);
                    } else if (var4.field542 >= 0) {
                        class53 var7 = class53.method1027(Statics.field608, var4.field542, 0);
                        if (var7 != null) {
                            class57 var8 = var7.method1029().method1068(Statics.field1803);
                            class59 var9 = class59.method1108(var8, 100, var6);
                            var9.method1094(-1);
                            Statics.field1275.method957(var9);
                            var4.field543 = var9;
                        }
                    }
                    if (var4.field536 != null) {
                        var4.field536.method1174(var6);
                        if (!var4.field536.method3374()) {
                            var4.field536 = null;
                        }
                    } else if (var4.field546 != null && (var4.field537 -= arg3) <= 0) {
                        int var10 = (int) (Math.random() * (double) var4.field546.length);
                        class53 var11 = class53.method1027(Statics.field608, var4.field546[var10], 0);
                        if (var11 != null) {
                            class57 var12 = var11.method1029().method1068(Statics.field1803);
                            class59 var13 = class59.method1108(var12, 100, var6);
                            var13.method1094(0);
                            Statics.field1275.method957(var13);
                            var4.field536 = var13;
                            var4.field537 = var4.field544 + (int) (Math.random() * (double) (var4.field547 - var4.field544));
                        }
                    }
                }
            }
        }
    }
}
