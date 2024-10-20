package deob;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("d")
public class class9 {

    @ObfuscatedName("d.i")
    public static int field148 = 3;

    @ObfuscatedName("d.h")
    public boolean field146;

    @ObfuscatedName("d.v")
    public boolean field147;

    @ObfuscatedName("d.q")
    public LinkedHashMap field158 = new LinkedHashMap();

    public class9() {
        this.method93(true);
    }

    public class9(class107 arg0) {
        if (arg0 == null || arg0.field1841 == null) {
            this.method93(true);
        } else {
            int var2 = arg0.method2151();
            if (var2 >= 0 && var2 <= field148) {
                if (arg0.method2151() == 1) {
                    this.field146 = true;
                }
                if (var2 > 1) {
                    this.field147 = arg0.method2151() == 1;
                }
                if (var2 > 2) {
                    int var3 = arg0.method2151();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method2156();
                        int var6 = arg0.method2156();
                        this.field158.put(var5, var6);
                    }
                }
            } else {
                this.method93(true);
            }
        }
    }

    @ObfuscatedName("d.i(ZI)V")
    public void method93(boolean arg0) {
    }

    @ObfuscatedName("d.c(I)Ldm;")
    public class107 method94() {
        class107 var1 = new class107(100);
        var1.method2137(field148);
        var1.method2137(this.field146 ? 1 : 0);
        var1.method2137(this.field147 ? 1 : 0);
        var1.method2137(this.field158.size());
        Iterator var2 = this.field158.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method2140((Integer) var3.getKey());
            var1.method2140((Integer) var3.getValue());
        }
        return var1;
    }

    @ObfuscatedName("dh.h(I)Ld;")
    public static class9 method2490() {
        class195 var0 = null;
        class9 var1 = new class9();
        try {
            var0 = class136.method1895("", Statics.field261.field2120, false);
            byte[] var2 = new byte[(int) var0.method3459()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var0.method3450(var2, var3, var2.length - var3);
                if (var4 == -1) {
                    throw new IOException();
                }
            }
            var1 = new class9(new class107(var2));
        } catch (Exception var8) {
        }
        try {
            if (var0 != null) {
                var0.method3448();
            }
        } catch (Exception var7) {
        }
        return var1;
    }

    @ObfuscatedName("dx.v(I)V")
    public static void method2552() {
        class195 var0 = null;
        try {
            var0 = class136.method1895("", Statics.field261.field2120, true);
            class107 var1 = Statics.field1357.method94();
            var0.method3447(var1.field1841, 0, var1.field1837);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method3448();
            }
        } catch (Exception var4) {
        }
    }
}
