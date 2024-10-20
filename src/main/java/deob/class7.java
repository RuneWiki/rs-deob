package deob;

@ObfuscatedName("v")
public final class class7 extends class179 {

    @ObfuscatedName("v.a")
    public static class177 field88 = new class177();

    @ObfuscatedName("v.r")
    public class32 field98;

    @ObfuscatedName("v.u")
    public int field94;

    @ObfuscatedName("v.t")
    public int field100;

    @ObfuscatedName("v.k")
    public int field87;

    @ObfuscatedName("v.x")
    public int field90;

    @ObfuscatedName("v.v")
    public int field95;

    @ObfuscatedName("v.g")
    public int field85;

    @ObfuscatedName("v.n")
    public int field91;

    @ObfuscatedName("v.q")
    public class45 field89;

    @ObfuscatedName("v.i")
    public int field93;

    @ObfuscatedName("v.p")
    public int field86;

    @ObfuscatedName("v.e")
    public int[] field92;

    @ObfuscatedName("v.o")
    public int field96;

    @ObfuscatedName("v.j")
    public class45 field97;

    @ObfuscatedName("bh.a(I)V")
    public static void method1342() {
        for (class7 var0 = (class7) field88.method3276(); var0 != null; var0 = (class7) field88.method3278()) {
            if (var0.field89 != null) {
                Statics.field1019.method1031(var0.field89);
                var0.field89 = null;
            }
            if (var0.field97 != null) {
                Statics.field1019.method1031(var0.field97);
                var0.field97 = null;
            }
        }
        field88.method3270();
    }

    @ObfuscatedName("v.r(I)V")
    public void method41() {
        int var1 = this.field91;
        class32 var2 = this.field98.method593();
        if (var2 == null) {
            this.field91 = -1;
            this.field85 = 0;
            this.field93 = 0;
            this.field86 = 0;
            this.field92 = null;
        } else {
            this.field91 = var2.field840;
            this.field85 = var2.field843 * 128;
            this.field93 = var2.field812;
            this.field86 = var2.field842;
            this.field92 = var2.field808;
        }
        if (this.field91 != var1 && this.field89 != null) {
            Statics.field1019.method1031(this.field89);
            this.field89 = null;
        }
    }

    @ObfuscatedName("p.u(IIILab;II)V")
    public static void method102(int arg0, int arg1, int arg2, class32 arg3, int arg4) {
        class7 var5 = new class7();
        var5.field94 = arg0;
        var5.field100 = arg1 * 128;
        var5.field87 = arg2 * 128;
        int var6 = arg3.field809;
        int var7 = arg3.field807;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field807;
            var7 = arg3.field809;
        }
        var5.field90 = (arg1 + var6) * 128;
        var5.field95 = (arg2 + var7) * 128;
        var5.field91 = arg3.field840;
        var5.field85 = arg3.field843 * 128;
        var5.field93 = arg3.field812;
        var5.field86 = arg3.field842;
        var5.field92 = arg3.field808;
        if (arg3.field828 != null) {
            var5.field98 = arg3;
            var5.method41();
        }
        field88.method3271(var5);
        if (var5.field92 != null) {
            var5.field96 = var5.field93 + (int) (Math.random() * (double) (var5.field86 - var5.field93));
        }
    }
}
