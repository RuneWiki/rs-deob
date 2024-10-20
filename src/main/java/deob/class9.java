package deob;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("f")
public class class9 {

    @ObfuscatedName("f.e")
    public static int field143 = 3;

    @ObfuscatedName("f.y")
    public boolean field148;

    @ObfuscatedName("f.b")
    public boolean field145;

    @ObfuscatedName("f.w")
    public LinkedHashMap field142 = new LinkedHashMap();

    public class9() {
        this.method81(true);
    }

    public class9(class107 arg0) {
        if (arg0 == null || arg0.field1840 == null) {
            this.method81(true);
        } else {
            int var2 = arg0.method2123();
            if (var2 >= 0 && var2 <= field143) {
                if (arg0.method2123() == 1) {
                    this.field148 = true;
                }
                if (var2 > 1) {
                    this.field145 = arg0.method2123() == 1;
                }
                if (var2 > 2) {
                    int var3 = arg0.method2123();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method2207();
                        int var6 = arg0.method2207();
                        this.field142.put(var5, var6);
                    }
                }
            } else {
                this.method81(true);
            }
        }
    }

    @ObfuscatedName("f.e(ZB)V")
    public void method81(boolean arg0) {
    }

    @ObfuscatedName("f.o(I)Ldl;")
    public class107 method93() {
        class107 var1 = new class107(100);
        var1.method2051(field143);
        var1.method2051(this.field148 ? 1 : 0);
        var1.method2051(this.field145 ? 1 : 0);
        var1.method2051(this.field142.size());
        Iterator var2 = this.field142.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method2054((Integer) var3.getKey());
            var1.method2054((Integer) var3.getValue());
        }
        return var1;
    }

    @ObfuscatedName("l.y(I)Lf;")
    public static class9 method69() {
        class195 var0 = null;
        class9 var1 = new class9();
        try {
            var0 = class136.method522("", Statics.field1860.field2112, false);
            byte[] var2 = new byte[(int) var0.method3337()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var0.method3334(var2, var3, var2.length - var3);
                if (var4 == -1) {
                    throw new IOException();
                }
            }
            var1 = new class9(new class107(var2));
        } catch (Exception var8) {
        }
        try {
            if (var0 != null) {
                var0.method3332();
            }
        } catch (Exception var7) {
        }
        return var1;
    }

    @ObfuscatedName("am.b(I)V")
    public static void method819() {
        class195 var0 = null;
        try {
            var0 = class136.method522("", Statics.field1860.field2112, true);
            class107 var1 = Statics.field92.method93();
            var0.method3341(var1.field1840, 0, var1.field1841);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method3332();
            }
        } catch (Exception var4) {
        }
    }
}
