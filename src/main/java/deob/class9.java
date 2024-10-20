package deob;

import java.io.IOException;

@ObfuscatedName("l")
public class class9 {

    @ObfuscatedName("l.e")
    public static int field146 = 2;

    @ObfuscatedName("l.p")
    public boolean field140;

    @ObfuscatedName("l.a")
    public boolean field141;

    public class9() {
        this.method87(true);
    }

    public class9(class107 arg0) {
        if (arg0 == null || arg0.field1845 == null) {
            this.method87(true);
        } else {
            int var2 = arg0.method2125();
            if (var2 >= 0 && var2 <= field146) {
                if (arg0.method2125() == 1) {
                    this.field140 = true;
                }
                if (var2 > 1) {
                    this.field141 = arg0.method2125() == 1;
                }
            } else {
                this.method87(true);
            }
        }
    }

    @ObfuscatedName("l.e(ZI)V")
    public void method87(boolean arg0) {
    }

    @ObfuscatedName("l.p(I)Ldp;")
    public class107 method88() {
        class107 var1 = new class107(100);
        var1.method2249(field146);
        var1.method2249(this.field140 ? 1 : 0);
        var1.method2249(this.field141 ? 1 : 0);
        return var1;
    }

    @ObfuscatedName("e.a(B)Ll;")
    public static class9 method2() {
        class192 var0 = null;
        class9 var1 = new class9();
        try {
            var0 = class136.method575("", Statics.field258.field2115, false);
            byte[] var2 = new byte[(int) var0.method3414()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var0.method3416(var2, var3, var2.length - var3);
                if (var4 == -1) {
                    throw new IOException();
                }
            }
            var1 = new class9(new class107(var2));
        } catch (Exception var8) {
        }
        try {
            if (var0 != null) {
                var0.method3413();
            }
        } catch (Exception var7) {
        }
        return var1;
    }

    @ObfuscatedName("d.g(I)V")
    public static void method137() {
        class192 var0 = null;
        try {
            var0 = class136.method575("", Statics.field258.field2115, true);
            class107 var1 = Statics.field908.method88();
            var0.method3412(var1.field1845, 0, var1.field1841);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method3413();
            }
        } catch (Exception var4) {
        }
    }
}
