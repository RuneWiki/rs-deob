package deob;

@ObfuscatedName("q")
public final class class20 extends class187 {

    @ObfuscatedName("q.p")
    public static class178 field540 = new class178();

    @ObfuscatedName("q.g")
    public int field541;

    @ObfuscatedName("q.x")
    public int field543;

    @ObfuscatedName("q.c")
    public int field542;

    @ObfuscatedName("q.n")
    public int field544;

    @ObfuscatedName("q.s")
    public int field549;

    @ObfuscatedName("q.r")
    public class36 field554;

    @ObfuscatedName("q.w")
    public int field556;

    @ObfuscatedName("q.u")
    public int field548;

    @ObfuscatedName("q.d")
    public int field547;

    @ObfuscatedName("q.h")
    public class58 field546;

    @ObfuscatedName("q.a")
    public int field545;

    @ObfuscatedName("q.y")
    public int[] field551;

    @ObfuscatedName("q.v")
    public int field552;

    @ObfuscatedName("q.e")
    public class58 field553;

    @ObfuscatedName("q.p(I)V")
    public void method497() {
        int var1 = this.field547;
        class36 var2 = this.field554.method686();
        if (var2 == null) {
            this.field547 = -1;
            this.field548 = 0;
            this.field549 = 0;
            this.field545 = 0;
            this.field551 = null;
        } else {
            this.field547 = var2.field872;
            this.field548 = var2.field885 * 128;
            this.field549 = var2.field856;
            this.field545 = var2.field883;
            this.field551 = var2.field846;
        }
        if (this.field547 != var1 && this.field546 != null) {
            Statics.field2468.method1037(this.field546);
            this.field546 = null;
        }
    }

    @ObfuscatedName("z.g(IIILaj;IB)V")
    public static void method165(int arg0, int arg1, int arg2, class36 arg3, int arg4) {
        class20 var5 = new class20();
        var5.field541 = arg0;
        var5.field542 = arg1 * 128;
        var5.field543 = arg2 * 128;
        int var6 = arg3.field853;
        int var7 = arg3.field873;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field873;
            var7 = arg3.field853;
        }
        var5.field544 = (arg1 + var6) * 128;
        var5.field556 = (arg2 + var7) * 128;
        var5.field547 = arg3.field872;
        var5.field548 = arg3.field885 * 128;
        var5.field549 = arg3.field856;
        var5.field545 = arg3.field883;
        var5.field551 = arg3.field846;
        if (arg3.field881 != null) {
            var5.field554 = arg3;
            var5.method497();
        }
        field540.method3291(var5);
        if (var5.field551 != null) {
            var5.field552 = var5.field549 + (int) (Math.random() * (double) (var5.field545 - var5.field549));
        }
    }

    @ObfuscatedName("f.x(IIIIB)V")
    public static void method542(int arg0, int arg1, int arg2, int arg3) {
        for (class20 var4 = (class20) field540.method3303(); var4 != null; var4 = (class20) field540.method3300()) {
            if (var4.field547 != -1 || var4.field551 != null) {
                int var5 = 0;
                if (arg1 > var4.field544) {
                    var5 += arg1 - var4.field544;
                } else if (arg1 < var4.field542) {
                    var5 += var4.field542 - arg1;
                }
                if (arg2 > var4.field556) {
                    var5 += arg2 - var4.field556;
                } else if (arg2 < var4.field543) {
                    var5 += var4.field543 - arg2;
                }
                if (var5 - 64 > var4.field548 || client.field495 == 0 || var4.field541 != arg0) {
                    if (var4.field546 != null) {
                        Statics.field2468.method1037(var4.field546);
                        var4.field546 = null;
                    }
                    if (var4.field553 != null) {
                        Statics.field2468.method1037(var4.field553);
                        var4.field553 = null;
                    }
                } else {
                    var5 -= 64;
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    int var6 = client.field495 * (var4.field548 - var5) / var4.field548;
                    if (var4.field546 != null) {
                        var4.field546.method1155(var6);
                    } else if (var4.field547 >= 0) {
                        class52 var7 = class52.method1090(Statics.field1084, var4.field547, 0);
                        if (var7 != null) {
                            class56 var8 = var7.method1085().method1127(Statics.field975);
                            class58 var9 = class58.method1176(var8, 100, var6);
                            var9.method1265(-1);
                            Statics.field2468.method1001(var9);
                            var4.field546 = var9;
                        }
                    }
                    if (var4.field553 != null) {
                        var4.field553.method1155(var6);
                        if (!var4.field553.method3379()) {
                            var4.field553 = null;
                        }
                    } else if (var4.field551 != null && (var4.field552 -= arg3) <= 0) {
                        int var10 = (int) (Math.random() * (double) var4.field551.length);
                        class52 var11 = class52.method1090(Statics.field1084, var4.field551[var10], 0);
                        if (var11 != null) {
                            class56 var12 = var11.method1085().method1127(Statics.field975);
                            class58 var13 = class58.method1176(var12, 100, var6);
                            var13.method1265(0);
                            Statics.field2468.method1001(var13);
                            var4.field553 = var13;
                            var4.field552 = var4.field549 + (int) (Math.random() * (double) (var4.field545 - var4.field549));
                        }
                    }
                }
            }
        }
    }
}
