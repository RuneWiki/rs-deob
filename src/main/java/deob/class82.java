package deob;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("cc")
public class class82 {

    @ObfuscatedName("cc.c")
    public static int field1300 = 4;

    @ObfuscatedName("cc.i")
    public boolean field1299;

    @ObfuscatedName("cc.u")
    public boolean field1301;

    @ObfuscatedName("cc.g")
    public int field1302 = 1;

    @ObfuscatedName("cc.m")
    public LinkedHashMap field1303 = new LinkedHashMap();

    public class82() {
        this.method1423(true);
    }

    public class82(class174 arg0) {
        if (arg0 == null || arg0.field2355 == null) {
            this.method1423(true);
        } else {
            int var2 = arg0.method2843();
            if (var2 >= 0 && var2 <= field1300) {
                if (arg0.method2843() == 1) {
                    this.field1299 = true;
                }
                if (var2 > 1) {
                    this.field1301 = arg0.method2843() == 1;
                }
                if (var2 > 3) {
                    this.field1302 = arg0.method2843();
                }
                if (var2 > 2) {
                    int var3 = arg0.method2843();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method2987();
                        int var6 = arg0.method2987();
                        this.field1303.put(var5, var6);
                    }
                }
            } else {
                this.method1423(true);
            }
        }
    }

    @ObfuscatedName("cc.c(ZI)V")
    public void method1423(boolean arg0) {
    }

    @ObfuscatedName("cc.o(S)Lfp;")
    public class174 method1431() {
        class174 var1 = new class174(100);
        var1.method2922(field1300);
        var1.method2922(this.field1299 ? 1 : 0);
        var1.method2922(this.field1301 ? 1 : 0);
        var1.method2922(this.field1302);
        var1.method2922(this.field1303.size());
        Iterator var2 = this.field1303.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method3024((Integer) var3.getKey());
            var1.method3024((Integer) var3.getValue());
        }
        return var1;
    }

    @ObfuscatedName("bi.i(I)Lcc;")
    public static class82 method880() {
        class125 var0 = null;
        class82 var1 = new class82();
        try {
            var0 = class156.method2605("", Statics.field1498.field3160, false);
            byte[] var2 = new byte[(int) var0.method2105()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var0.method2095(var2, var3, var2.length - var3);
                if (var4 == -1) {
                    throw new IOException();
                }
            }
            var1 = new class82(new class174(var2));
        } catch (Exception var8) {
        }
        try {
            if (var0 != null) {
                var0.method2094();
            }
        } catch (Exception var7) {
        }
        return var1;
    }

    @ObfuscatedName("r.u(B)V")
    public static void method43() {
        class125 var0 = null;
        try {
            var0 = class156.method2605("", Statics.field1498.field3160, true);
            class174 var1 = Statics.field479.method1431();
            var0.method2093(var1.field2355, 0, var1.field2357);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method2094();
            }
        } catch (Exception var4) {
        }
    }
}
