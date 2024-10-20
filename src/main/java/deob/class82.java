package deob;

@ObfuscatedName("co")
public final class class82 extends class200 {

    @ObfuscatedName("co.d")
    public static class201 field1249 = new class201();

    @ObfuscatedName("co.x")
    public int field1245;

    @ObfuscatedName("co.k")
    public int field1242;

    @ObfuscatedName("co.z")
    public int field1252;

    @ObfuscatedName("co.v")
    public int field1243;

    @ObfuscatedName("co.m")
    public int field1246;

    @ObfuscatedName("co.b")
    public int field1247;

    @ObfuscatedName("co.t")
    public int field1248;

    @ObfuscatedName("co.p")
    public class117 field1254;

    @ObfuscatedName("co.r")
    public class263 field1255;

    @ObfuscatedName("co.l")
    public int field1250;

    @ObfuscatedName("co.u")
    public int field1244;

    @ObfuscatedName("co.n")
    public int[] field1241;

    @ObfuscatedName("co.c")
    public int field1253;

    @ObfuscatedName("co.y")
    public class117 field1251;

    @ObfuscatedName("bf.d(I)V")
    public static void method1020() {
        for (class82 var0 = (class82) field1249.method3500(); var0 != null; var0 = (class82) field1249.method3511()) {
            if (var0.field1254 != null) {
                Statics.field822.method1806(var0.field1254);
                var0.field1254 = null;
            }
            if (var0.field1251 != null) {
                Statics.field822.method1806(var0.field1251);
                var0.field1251 = null;
            }
        }
        field1249.method3506();
    }

    @ObfuscatedName("bx.x(B)V")
    public static void method1031() {
        for (class82 var0 = (class82) field1249.method3500(); var0 != null; var0 = (class82) field1249.method3511()) {
            if (var0.field1255 != null) {
                var0.method1521();
            }
        }
    }

    @ObfuscatedName("co.k(I)V")
    public void method1521() {
        int var1 = this.field1248;
        class263 var2 = this.field1255.method4355();
        if (var2 == null) {
            this.field1248 = -1;
            this.field1247 = 0;
            this.field1250 = 0;
            this.field1244 = 0;
            this.field1241 = null;
        } else {
            this.field1248 = var2.field3544;
            this.field1247 = var2.field3542 * 128;
            this.field1250 = var2.field3501;
            this.field1244 = var2.field3547;
            this.field1241 = var2.field3548;
        }
        if (this.field1248 != var1 && this.field1254 != null) {
            Statics.field822.method1806(this.field1254);
            this.field1254 = null;
        }
    }

    @ObfuscatedName("cw.z(IIILjv;IB)V")
    public static void method1490(int arg0, int arg1, int arg2, class263 arg3, int arg4) {
        class82 var5 = new class82();
        var5.field1242 = arg0;
        var5.field1243 = arg1 * 128;
        var5.field1245 = arg2 * 128;
        int var6 = arg3.field3550;
        int var7 = arg3.field3508;
        if (arg4 == 1 || arg4 == 3) {
            var6 = arg3.field3508;
            var7 = arg3.field3550;
        }
        var5.field1252 = (arg1 + var6) * 128;
        var5.field1246 = (arg2 + var7) * 128;
        var5.field1248 = arg3.field3544;
        var5.field1247 = arg3.field3542 * 128;
        var5.field1250 = arg3.field3501;
        var5.field1244 = arg3.field3547;
        var5.field1241 = arg3.field3548;
        if (arg3.field3541 != null) {
            var5.field1255 = arg3;
            var5.method1521();
        }
        field1249.method3502(var5);
        if (var5.field1241 != null) {
            var5.field1253 = var5.field1250 + (int) (Math.random() * (double) (var5.field1244 - var5.field1250));
        }
    }
}
