package deob;

@ObfuscatedName("p")
public final class class7 extends class179 {

    @ObfuscatedName("p.d")
    public static class177 field109 = new class177();

    @ObfuscatedName("p.g")
    public int field110;

    @ObfuscatedName("p.a")
    public int field96;

    @ObfuscatedName("p.t")
    public int field102;

    @ObfuscatedName("p.f")
    public int field98;

    @ObfuscatedName("p.c")
    public int field99;

    @ObfuscatedName("p.p")
    public int field100;

    @ObfuscatedName("p.s")
    public int field108;

    @ObfuscatedName("p.k")
    public int field101;

    @ObfuscatedName("p.m")
    public class45 field95;

    @ObfuscatedName("p.y")
    public int field104;

    @ObfuscatedName("p.b")
    public int[] field105;

    @ObfuscatedName("p.l")
    public int field106;

    @ObfuscatedName("p.x")
    public class45 field107;

    @ObfuscatedName("p.z")
    public class32 field103;

    @ObfuscatedName("p.d(I)V")
    public static void method52() {
        for (class7 var0 = (class7) field109.method3278(); var0 != null; var0 = (class7) field109.method3280()) {
            if (var0.field95 != null) {
                Statics.field205.method1091(var0.field95);
                var0.field95 = null;
            }
            if (var0.field107 != null) {
                Statics.field205.method1091(var0.field107);
                var0.field107 = null;
            }
        }
        field109.method3279();
    }

    @ObfuscatedName("p.g(I)V")
    public void method58() {
        int var1 = this.field101;
        class32 var2 = this.field103.method618();
        if (var2 == null) {
            this.field101 = -1;
            this.field100 = 0;
            this.field108 = 0;
            this.field104 = 0;
            this.field105 = null;
        } else {
            this.field101 = var2.field815;
            this.field100 = var2.field846 * 128;
            this.field108 = var2.field847;
            this.field104 = var2.field848;
            this.field105 = var2.field849;
        }
        if (this.field101 != var1 && this.field95 != null) {
            Statics.field205.method1091(this.field95);
            this.field95 = null;
        }
    }

    @ObfuscatedName("b.a(IIILai;II)V")
    public static void method126(int arg0, int arg1, int arg2, class32 arg3, int arg4) {
        class7 var5 = new class7();
        var5.field110 = arg0;
        var5.field96 = arg1 * 128;
        var5.field102 = arg2 * 128;
        int var6 = arg3.field818;
        int var7 = arg3.field816;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field816;
            var7 = arg3.field818;
        }
        var5.field98 = (arg1 + var6) * 128;
        var5.field99 = (arg2 + var7) * 128;
        var5.field101 = arg3.field815;
        var5.field100 = arg3.field846 * 128;
        var5.field108 = arg3.field847;
        var5.field104 = arg3.field848;
        var5.field105 = arg3.field849;
        if (arg3.field801 != null) {
            var5.field103 = arg3;
            var5.method58();
        }
        field109.method3273(var5);
        if (var5.field105 != null) {
            var5.field106 = var5.field108 + (int) (Math.random() * (double) (var5.field104 - var5.field108));
        }
    }

    @ObfuscatedName("c.t(IIIII)V")
    public static void method45(int arg0, int arg1, int arg2, int arg3) {
        for (class7 var4 = (class7) field109.method3278(); var4 != null; var4 = (class7) field109.method3280()) {
            if (var4.field101 != -1 || var4.field105 != null) {
                int var5 = 0;
                if (arg1 > var4.field98) {
                    var5 += arg1 - var4.field98;
                } else if (arg1 < var4.field96) {
                    var5 += var4.field96 - arg1;
                }
                if (arg2 > var4.field99) {
                    var5 += arg2 - var4.field99;
                } else if (arg2 < var4.field102) {
                    var5 += var4.field102 - arg2;
                }
                if (var5 - 64 > var4.field100 || client.field701 == 0 || var4.field110 != arg0) {
                    if (var4.field95 != null) {
                        Statics.field205.method1091(var4.field95);
                        var4.field95 = null;
                    }
                    if (var4.field107 != null) {
                        Statics.field205.method1091(var4.field107);
                        var4.field107 = null;
                    }
                } else {
                    var5 -= 64;
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    int var6 = client.field701 * (var4.field100 - var5) / var4.field100;
                    if (var4.field95 != null) {
                        var4.field95.method935(var6);
                    } else if (var4.field101 >= 0) {
                        class57 var7 = class57.method1221(Statics.field1030, var4.field101, 0);
                        if (var7 != null) {
                            class63 var8 = var7.method1223().method1293(Statics.field1379);
                            class45 var9 = class45.method931(var8, 100, var6);
                            var9.method943(-1);
                            Statics.field205.method1090(var9);
                            var4.field95 = var9;
                        }
                    }
                    if (var4.field107 != null) {
                        var4.field107.method935(var6);
                        if (!var4.field107.method3307()) {
                            var4.field107 = null;
                        }
                    } else if (var4.field105 != null && (var4.field106 -= arg3) <= 0) {
                        int var10 = (int) (Math.random() * (double) var4.field105.length);
                        class57 var11 = class57.method1221(Statics.field1030, var4.field105[var10], 0);
                        if (var11 != null) {
                            class63 var12 = var11.method1223().method1293(Statics.field1379);
                            class45 var13 = class45.method931(var12, 100, var6);
                            var13.method943(0);
                            Statics.field205.method1090(var13);
                            var4.field107 = var13;
                            var4.field106 = var4.field108 + (int) (Math.random() * (double) (var4.field104 - var4.field108));
                        }
                    }
                }
            }
        }
    }
}
