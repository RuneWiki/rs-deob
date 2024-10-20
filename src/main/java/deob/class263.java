package deob;

@ObfuscatedName("jx")
public class class263 extends class206 {

    @ObfuscatedName("jx.i")
    public static class201 field3446 = new class201(64);

    @ObfuscatedName("jx.w")
    public char field3447;

    @ObfuscatedName("jx.s")
    public int field3452;

    @ObfuscatedName("jx.j")
    public String field3450;

    @ObfuscatedName("jx.a")
    public boolean field3451 = true;

    @ObfuscatedName("gg.p(Lik;I)V")
    public static void method3333(class247 arg0) {
        Statics.field3449 = arg0;
    }

    @ObfuscatedName("fr.i(II)Ljx;")
    public static class263 method2891(int arg0) {
        class263 var1 = (class263) field3446.method3504((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3449.method4032(11, arg0);
        class263 var3 = new class263();
        if (var2 != null) {
            var3.method4340(new class185(var2));
        }
        var3.method4353();
        field3446.method3506(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jx.w(B)V")
    public void method4353() {
    }

    @ObfuscatedName("jx.s(Lgj;I)V")
    public void method4340(class185 arg0) {
        while (true) {
            int var2 = arg0.method3197();
            if (var2 == 0) {
                return;
            }
            this.method4346(arg0, var2);
        }
    }

    @ObfuscatedName("jx.j(Lgj;II)V")
    public void method4346(class185 arg0, int arg1) {
        if (arg1 == 1) {
            byte var3 = arg0.method3123();
            int var4 = var3 & 0xFF;
            if (var4 == 0) {
                throw new IllegalArgumentException("");
            }
            if (var4 >= 128 && var4 < 160) {
                char var5 = class290.field3763[var4 - 128];
                if (var5 == 0) {
                    var5 = '?';
                }
                var4 = var5;
            }
            char var6 = (char) var4;
            this.field3447 = var6;
        } else if (arg1 == 2) {
            this.field3452 = arg0.method3127();
        } else if (arg1 == 4) {
            this.field3451 = false;
        } else if (arg1 == 5) {
            this.field3450 = arg0.method3131();
        }
    }

    @ObfuscatedName("jx.a(I)Z")
    public boolean method4342() {
        return this.field3447 == 's';
    }

    @ObfuscatedName("jn.t(I)V")
    public static void method4586() {
        field3446.method3513();
    }
}
