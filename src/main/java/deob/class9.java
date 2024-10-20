package deob;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("u")
public class class9 {

    @ObfuscatedName("u.p")
    public static int field153 = 3;

    @ObfuscatedName("u.x")
    public boolean field145;

    @ObfuscatedName("u.c")
    public boolean field144;

    @ObfuscatedName("u.n")
    public LinkedHashMap field147 = new LinkedHashMap();

    public class9() {
        this.method94(true);
    }

    public class9(class107 arg0) {
        if (arg0 == null || arg0.field1838 == null) {
            this.method94(true);
        } else {
            int var2 = arg0.method2173();
            if (var2 >= 0 && var2 <= field153) {
                if (arg0.method2173() == 1) {
                    this.field145 = true;
                }
                if (var2 > 1) {
                    this.field144 = arg0.method2173() == 1;
                }
                if (var2 > 2) {
                    int var3 = arg0.method2173();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method2305();
                        int var6 = arg0.method2305();
                        this.field147.put(var5, var6);
                    }
                }
            } else {
                this.method94(true);
            }
        }
    }

    @ObfuscatedName("u.p(ZB)V")
    public void method94(boolean arg0) {
    }

    @ObfuscatedName("u.g(I)Ldp;")
    public class107 method95() {
        class107 var1 = new class107(100);
        var1.method2159(field153);
        var1.method2159(this.field145 ? 1 : 0);
        var1.method2159(this.field144 ? 1 : 0);
        var1.method2159(this.field147.size());
        Iterator var2 = this.field147.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method2162((Integer) var3.getKey());
            var1.method2162((Integer) var3.getValue());
        }
        return var1;
    }

    @ObfuscatedName("bi.x(B)Lu;")
    public static class9 method1369() {
        class196 var0 = null;
        class9 var1 = new class9();
        try {
            var0 = class136.method551("", Statics.field258.field2123, false);
            byte[] var2 = new byte[(int) var0.method3493()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var0.method3507(var2, var3, var2.length - var3);
                if (var4 == -1) {
                    throw new IOException();
                }
            }
            var1 = new class9(new class107(var2));
        } catch (Exception var8) {
        }
        try {
            if (var0 != null) {
                var0.method3492();
            }
        } catch (Exception var7) {
        }
        return var1;
    }

    @ObfuscatedName("ca.c(I)V")
    public static void method2015() {
        class196 var0 = null;
        try {
            var0 = class136.method551("", Statics.field258.field2123, true);
            class107 var1 = Statics.field813.method95();
            var0.method3491(var1.field1838, 0, var1.field1837);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method3492();
            }
        } catch (Exception var4) {
        }
    }
}
