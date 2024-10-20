package deob;

@ObfuscatedName("l")
public final class class7 extends class177 {

    @ObfuscatedName("l.z")
    public int field94;

    @ObfuscatedName("l.h")
    public static class175 field109 = new class175();

    @ObfuscatedName("l.c")
    public int field91;

    @ObfuscatedName("l.p")
    public int field92;

    @ObfuscatedName("l.i")
    public int field93;

    @ObfuscatedName("l.v")
    public int field95;

    @ObfuscatedName("l.l")
    public int field96;

    @ObfuscatedName("l.m")
    public int field97;

    @ObfuscatedName("l.g")
    public class44 field98;

    @ObfuscatedName("l.t")
    public int field104;

    @ObfuscatedName("l.o")
    public int field90;

    @ObfuscatedName("l.b")
    public int[] field106;

    @ObfuscatedName("l.d")
    public int field102;

    @ObfuscatedName("l.k")
    public class44 field103;

    @ObfuscatedName("l.f")
    public class31 field100;

    @ObfuscatedName("ac.z(I)V")
    public static void method899() {
        for (class7 var0 = (class7) field109.method3317(); var0 != null; var0 = (class7) field109.method3310()) {
            if (var0.field100 != null) {
                var0.method43();
            }
        }
    }

    @ObfuscatedName("l.h(B)V")
    public void method43() {
        int var1 = this.field97;
        class31 var2 = this.field100.method657();
        if (var2 == null) {
            this.field97 = -1;
            this.field96 = 0;
            this.field104 = 0;
            this.field90 = 0;
            this.field106 = null;
        } else {
            this.field97 = var2.field854;
            this.field96 = var2.field863 * 128;
            this.field104 = var2.field864;
            this.field90 = var2.field865;
            this.field106 = var2.field866;
        }
        if (this.field97 != var1 && this.field98 != null) {
            Statics.field332.method1113(this.field98);
            this.field98 = null;
        }
    }

    @ObfuscatedName("client.c(IIILad;II)V")
    public static void method560(int arg0, int arg1, int arg2, class31 arg3, int arg4) {
        class7 var5 = new class7();
        var5.field91 = arg0;
        var5.field92 = arg1 * 128;
        var5.field93 = arg2 * 128;
        int var6 = arg3.field832;
        int var7 = arg3.field829;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field829;
            var7 = arg3.field832;
        }
        var5.field94 = (arg1 + var6) * 128;
        var5.field95 = (arg2 + var7) * 128;
        var5.field97 = arg3.field854;
        var5.field96 = arg3.field863 * 128;
        var5.field104 = arg3.field864;
        var5.field90 = arg3.field865;
        var5.field106 = arg3.field866;
        if (arg3.field817 != null) {
            var5.field100 = arg3;
            var5.method43();
        }
        field109.method3303(var5);
        if (var5.field106 != null) {
            var5.field102 = var5.field104 + (int) (Math.random() * (double) (var5.field90 - var5.field104));
        }
    }

    @ObfuscatedName("cq.p(IIIII)V")
    public static void method1834(int arg0, int arg1, int arg2, int arg3) {
        for (class7 var4 = (class7) field109.method3317(); var4 != null; var4 = (class7) field109.method3310()) {
            if (var4.field97 != -1 || var4.field106 != null) {
                int var5 = 0;
                if (arg1 > var4.field94) {
                    var5 += arg1 - var4.field94;
                } else if (arg1 < var4.field92) {
                    var5 += var4.field92 - arg1;
                }
                if (arg2 > var4.field95) {
                    var5 += arg2 - var4.field95;
                } else if (arg2 < var4.field93) {
                    var5 += var4.field93 - arg2;
                }
                if (var5 - 64 > var4.field96 || client.field713 == 0 || var4.field91 != arg0) {
                    if (var4.field98 != null) {
                        Statics.field332.method1113(var4.field98);
                        var4.field98 = null;
                    }
                    if (var4.field103 != null) {
                        Statics.field332.method1113(var4.field103);
                        var4.field103 = null;
                    }
                } else {
                    var5 -= 64;
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    int var6 = client.field713 * (var4.field96 - var5) / var4.field96;
                    if (var4.field98 != null) {
                        var4.field98.method947(var6);
                    } else if (var4.field97 >= 0) {
                        class56 var7 = class56.method1245(Statics.field2348, var4.field97, 0);
                        if (var7 != null) {
                            class62 var8 = var7.method1250().method1308(Statics.field1637);
                            class44 var9 = class44.method943(var8, 100, var6);
                            var9.method946(-1);
                            Statics.field332.method1094(var9);
                            var4.field98 = var9;
                        }
                    }
                    if (var4.field103 != null) {
                        var4.field103.method947(var6);
                        if (!var4.field103.method3347()) {
                            var4.field103 = null;
                        }
                    } else if (var4.field106 != null && (var4.field102 -= arg3) <= 0) {
                        int var10 = (int) (Math.random() * (double) var4.field106.length);
                        class56 var11 = class56.method1245(Statics.field2348, var4.field106[var10], 0);
                        if (var11 != null) {
                            class62 var12 = var11.method1250().method1308(Statics.field1637);
                            class44 var13 = class44.method943(var12, 100, var6);
                            var13.method946(0);
                            Statics.field332.method1094(var13);
                            var4.field103 = var13;
                            var4.field102 = var4.field104 + (int) (Math.random() * (double) (var4.field90 - var4.field104));
                        }
                    }
                }
            }
        }
    }
}
