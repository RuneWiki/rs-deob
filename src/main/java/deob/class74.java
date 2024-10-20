package deob;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("bk")
public class class74 {

    @ObfuscatedName("bk.q")
    public static int field1063 = 6;

    @ObfuscatedName("bk.e")
    public boolean field1061;

    @ObfuscatedName("bk.p")
    public boolean field1064;

    @ObfuscatedName("bk.k")
    public int field1065 = 1;

    @ObfuscatedName("bk.l")
    public String field1066 = null;

    @ObfuscatedName("bk.b")
    public boolean field1067 = false;

    @ObfuscatedName("bk.i")
    public LinkedHashMap field1068 = new LinkedHashMap();

    public class74() {
        this.method1584(true);
    }

    public class74(class301 arg0) {
        if (arg0 == null || arg0.field3731 == null) {
            this.method1584(true);
        } else {
            int var2 = arg0.method5077();
            if (var2 >= 0 && var2 <= field1063) {
                if (arg0.method5077() == 1) {
                    this.field1061 = true;
                }
                if (var2 > 1) {
                    this.field1064 = arg0.method5077() == 1;
                }
                if (var2 > 3) {
                    this.field1065 = arg0.method5077();
                }
                if (var2 > 2) {
                    int var3 = arg0.method5077();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method5072();
                        int var6 = arg0.method5072();
                        this.field1068.put(var5, var6);
                    }
                }
                if (var2 > 4) {
                    this.field1066 = arg0.method5049();
                }
                if (var2 > 5) {
                    this.field1067 = arg0.method5271();
                }
            } else {
                this.method1584(true);
            }
        }
    }

    @ObfuscatedName("bk.q(ZS)V")
    public void method1584(boolean arg0) {
    }

    @ObfuscatedName("bk.w(I)Lkf;")
    public class301 method1581() {
        class301 var1 = new class301(100);
        var1.method5228(field1063);
        var1.method5228(this.field1061 ? 1 : 0);
        var1.method5228(this.field1064 ? 1 : 0);
        var1.method5228(this.field1065);
        var1.method5228(this.field1068.size());
        Iterator var2 = this.field1068.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method5054((Integer) var3.getKey());
            var1.method5054((Integer) var3.getValue());
        }
        var1.method5058(this.field1066 == null ? "" : this.field1066);
        var1.method5057(this.field1067);
        return var1;
    }

    @ObfuscatedName("eu.e(I)Lbk;")
    public static class74 method2992() {
        class344 var0 = null;
        class74 var1 = new class74();
        try {
            var0 = class168.method193("", Statics.field249.field3112, false);
            byte[] var2 = new byte[(int) var0.method6068()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var0.method6070(var2, var3, var2.length - var3);
                if (var4 == -1) {
                    throw new IOException();
                }
            }
            var1 = new class74(new class301(var2));
        } catch (Exception var8) {
        }
        try {
            if (var0 != null) {
                var0.method6066();
            }
        } catch (Exception var7) {
        }
        return var1;
    }

    @ObfuscatedName("ce.p(I)V")
    public static void method2072() {
        class344 var0 = null;
        try {
            var0 = class168.method193("", Statics.field249.field3112, true);
            class301 var1 = Statics.field118.method1581();
            var0.method6077(var1.field3731, 0, var1.field3733);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method6071(true);
            }
        } catch (Exception var4) {
        }
    }
}
