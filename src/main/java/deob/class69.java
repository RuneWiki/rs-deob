package deob;

@ObfuscatedName("l")
public final class class69 extends class17 {

    @ObfuscatedName("l.f")
    public int field760;

    @ObfuscatedName("l.g")
    public int[] field764;

    @ObfuscatedName("l.d")
    public int field772;

    @ObfuscatedName("l.e")
    public class181 field766;

    @ObfuscatedName("l.b")
    public static class15 field755 = new class15();

    @ObfuscatedName("l.o")
    public int field765;

    @ObfuscatedName("l.l")
    public int field759;

    @ObfuscatedName("l.j")
    public class181 field758;

    @ObfuscatedName("l.k")
    public int field771;

    @ObfuscatedName("l.h")
    public int field754;

    @ObfuscatedName("l.w")
    public int field756;

    @ObfuscatedName("l.t")
    public int field753;

    @ObfuscatedName("l.s")
    public int field762;

    @ObfuscatedName("l.q")
    public class182 field767;

    @ObfuscatedName("l.x")
    public int field763;

    @ObfuscatedName("l.h(I)V")
    public void method1132() {
        int var1 = this.field760;
        class182 var2 = this.field767.method3297();
        if (var2 == null) {
            this.field760 = -1;
            this.field759 = 0;
            this.field762 = 0;
            this.field763 = 0;
            this.field764 = null;
        } else {
            this.field760 = var2.field2760;
            this.field759 = var2.field2800 * 128;
            this.field762 = var2.field2801;
            this.field763 = var2.field2781;
            this.field764 = var2.field2803;
        }
        if (this.field760 != var1 && this.field758 != null) {
            Statics.field675.method2812(this.field758);
            this.field758 = null;
        }
    }

    @ObfuscatedName("df.k(IIIII)V")
    public static void method555(int arg0, int arg1, int arg2, int arg3) {
        for (class69 var4 = (class69) field755.method212(); var4 != null; var4 = (class69) field755.method201()) {
            if (var4.field760 != -1 || var4.field764 != null) {
                int var5 = 0;
                if (arg1 > var4.field753) {
                    var5 += arg1 - var4.field753;
                } else if (arg1 < var4.field771) {
                    var5 += var4.field771 - arg1;
                }
                if (arg2 > var4.field772) {
                    var5 += arg2 - var4.field772;
                } else if (arg2 < var4.field756) {
                    var5 += var4.field756 - arg2;
                }
                if (var5 - 64 > var4.field759 || client.field1769 == 0 || var4.field754 != arg0) {
                    if (var4.field758 != null) {
                        Statics.field675.method2812(var4.field758);
                        var4.field758 = null;
                    }
                    if (var4.field766 != null) {
                        Statics.field675.method2812(var4.field766);
                        var4.field766 = null;
                    }
                } else {
                    var5 -= 64;
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    int var6 = client.field1769 * (var4.field759 - var5) / var4.field759;
                    if (var4.field758 != null) {
                        var4.field758.method3159(var6);
                    } else if (var4.field760 >= 0) {
                        class118 var7 = class118.method2123(Statics.field738, var4.field760, 0);
                        if (var7 != null) {
                            class120 var8 = var7.method2113().method2128(Statics.field1249);
                            class181 var9 = class181.method3153(var8, 100, var6);
                            var9.method3238(-1);
                            Statics.field675.method2799(var9);
                            var4.field758 = var9;
                        }
                    }
                    if (var4.field766 != null) {
                        var4.field766.method3159(var6);
                        if (!var4.field766.method230()) {
                            var4.field766 = null;
                        }
                    } else if (var4.field764 != null && (var4.field765 -= arg3) <= 0) {
                        int var10 = (int) (Math.random() * (double) var4.field764.length);
                        class118 var11 = class118.method2123(Statics.field738, var4.field764[var10], 0);
                        if (var11 != null) {
                            class120 var12 = var11.method2113().method2128(Statics.field1249);
                            class181 var13 = class181.method3153(var12, 100, var6);
                            var13.method3238(0);
                            Statics.field675.method2799(var13);
                            var4.field766 = var13;
                            var4.field765 = var4.field762 + (int) (Math.random() * (double) (var4.field763 - var4.field762));
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("cs.b(B)V")
    public static void method2386() {
        for (class69 var0 = (class69) field755.method212(); var0 != null; var0 = (class69) field755.method201()) {
            if (var0.field758 != null) {
                Statics.field675.method2812(var0.field758);
                var0.field758 = null;
            }
            if (var0.field766 != null) {
                Statics.field675.method2812(var0.field766);
                var0.field766 = null;
            }
        }
        field755.method193();
    }
}
