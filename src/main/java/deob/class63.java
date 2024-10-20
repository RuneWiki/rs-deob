package deob;

@ObfuscatedName("br")
public final class class63 extends class370 {

    @ObfuscatedName("br.i")
    public static class309 field770 = new class309();

    @ObfuscatedName("br.w")
    public int field769;

    @ObfuscatedName("br.s")
    public int field768;

    @ObfuscatedName("br.a")
    public int field779;

    @ObfuscatedName("br.o")
    public int field771;

    @ObfuscatedName("br.g")
    public int field772;

    @ObfuscatedName("br.e")
    public int field773;

    @ObfuscatedName("br.p")
    public int field774;

    @ObfuscatedName("br.j")
    public int field775;

    @ObfuscatedName("br.b")
    public class43 field776;

    @ObfuscatedName("br.x")
    public int field777;

    @ObfuscatedName("br.y")
    public int[] field778;

    @ObfuscatedName("br.k")
    public int field780;

    @ObfuscatedName("br.t")
    public class43 field781;

    @ObfuscatedName("br.l")
    public class169 field782;

    @ObfuscatedName("lw.i(B)V")
    public static void method5449() {
        for (class63 var0 = (class63) field770.method4981(); var0 != null; var0 = (class63) field770.method4987()) {
            if (var0.field782 != null) {
                var0.method1665();
            }
        }
    }

    @ObfuscatedName("br.w(I)V")
    public void method1665() {
        int var1 = this.field775;
        class169 var2 = this.field782.method2980();
        if (var2 == null) {
            this.field775 = -1;
            this.field774 = 0;
            this.field768 = 0;
            this.field777 = 0;
            this.field778 = null;
        } else {
            this.field775 = var2.field1867;
            this.field774 = var2.field1875 * 128;
            this.field768 = var2.field1852;
            this.field777 = var2.field1849;
            this.field778 = var2.field1872;
        }
        if (this.field775 != var1 && this.field776 != null) {
            Statics.field1331.method621(this.field776);
            this.field776 = null;
        }
    }

    @ObfuscatedName("dd.s(IIILfe;II)V")
    public static void method2427(int arg0, int arg1, int arg2, class169 arg3, int arg4) {
        class63 var5 = new class63();
        var5.field769 = arg0;
        var5.field779 = arg1 * 128;
        var5.field771 = arg2 * 128;
        int var6 = arg3.field1828;
        int var7 = arg3.field1840;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field1840;
            var7 = arg3.field1828;
        }
        var5.field772 = (arg1 + var6) * 128;
        var5.field773 = (arg2 + var7) * 128;
        var5.field775 = arg3.field1867;
        var5.field774 = arg3.field1875 * 128;
        var5.field768 = arg3.field1852;
        var5.field777 = arg3.field1849;
        var5.field778 = arg3.field1872;
        if (arg3.field1824 != null) {
            var5.field782 = arg3;
            var5.method1665();
        }
        field770.method4980(var5);
        if (var5.field778 != null) {
            var5.field780 = var5.field768 + (int) (Math.random() * (double) (var5.field777 - var5.field768));
        }
    }

    @ObfuscatedName("ed.a(IIIIB)V")
    public static void method2507(int arg0, int arg1, int arg2, int arg3) {
        for (class63 var4 = (class63) field770.method4981(); var4 != null; var4 = (class63) field770.method4987()) {
            if (var4.field775 != -1 || var4.field778 != null) {
                int var5 = 0;
                if (arg1 > var4.field772) {
                    var5 += arg1 - var4.field772;
                } else if (arg1 < var4.field779) {
                    var5 += var4.field779 - arg1;
                }
                if (arg2 > var4.field773) {
                    var5 += arg2 - var4.field773;
                } else if (arg2 < var4.field771) {
                    var5 += var4.field771 - arg2;
                }
                if (var5 - 64 > var4.field774 || Statics.field4363.field1187 == 0 || var4.field769 != arg0) {
                    if (var4.field776 != null) {
                        Statics.field1331.method621(var4.field776);
                        var4.field776 = null;
                    }
                    if (var4.field781 != null) {
                        Statics.field1331.method621(var4.field781);
                        var4.field781 = null;
                    }
                } else {
                    var5 -= 64;
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    int var6 = Statics.field4363.field1187 * (var4.field774 - var5) / var4.field774;
                    if (var4.field776 != null) {
                        var4.field776.method793(var6);
                    } else if (var4.field775 >= 0) {
                        class35 var7 = class35.method666(Statics.field58, var4.field775, 0);
                        if (var7 != null) {
                            class36 var8 = var7.method667().method677(Statics.field4201);
                            class43 var9 = class43.method789(var8, 100, var6);
                            var9.method800(-1);
                            Statics.field1331.method622(var9);
                            var4.field776 = var9;
                        }
                    }
                    if (var4.field781 != null) {
                        var4.field781.method793(var6);
                        if (!var4.field781.method5756()) {
                            var4.field781 = null;
                        }
                    } else if (var4.field778 != null && (var4.field780 -= arg3) <= 0) {
                        int var10 = (int) (Math.random() * (double) var4.field778.length);
                        class35 var11 = class35.method666(Statics.field58, var4.field778[var10], 0);
                        if (var11 != null) {
                            class36 var12 = var11.method667().method677(Statics.field4201);
                            class43 var13 = class43.method789(var12, 100, var6);
                            var13.method800(0);
                            Statics.field1331.method622(var13);
                            var4.field781 = var13;
                            var4.field780 = var4.field768 + (int) (Math.random() * (double) (var4.field777 - var4.field768));
                        }
                    }
                }
            }
        }
    }
}
