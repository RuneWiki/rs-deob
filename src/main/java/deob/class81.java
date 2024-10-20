package deob;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("cq")
public class class81 {

    @ObfuscatedName("cq.i")
    public static int field1316 = 6;

    @ObfuscatedName("cq.a")
    public boolean field1317;

    @ObfuscatedName("cq.r")
    public boolean field1318;

    @ObfuscatedName("cq.o")
    public int field1322 = 1;

    @ObfuscatedName("cq.n")
    public String field1320 = null;

    @ObfuscatedName("cq.q")
    public boolean field1321 = false;

    @ObfuscatedName("cq.b")
    public LinkedHashMap field1319 = new LinkedHashMap();

    public class81() {
        this.method1451(true);
    }

    public class81(class175 arg0) {
        if (arg0 == null || arg0.field2392 == null) {
            this.method1451(true);
        } else {
            int var2 = arg0.method2999();
            if (var2 >= 0 && var2 <= field1316) {
                if (arg0.method2999() == 1) {
                    this.field1317 = true;
                }
                if (var2 > 1) {
                    this.field1318 = arg0.method2999() == 1;
                }
                if (var2 > 3) {
                    this.field1322 = arg0.method2999();
                }
                if (var2 > 2) {
                    int var3 = arg0.method2999();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method2998();
                        int var6 = arg0.method2998();
                        this.field1319.put(var5, var6);
                    }
                }
                if (var2 > 4) {
                    this.field1320 = arg0.method3021();
                }
                if (var2 > 5) {
                    this.field1321 = arg0.method3000();
                }
            } else {
                this.method1451(true);
            }
        }
    }

    @ObfuscatedName("cq.i(ZI)V")
    public void method1451(boolean arg0) {
    }

    @ObfuscatedName("cq.j(I)Lfp;")
    public class175 method1452() {
        class175 var1 = new class175(100);
        var1.method3102(field1316);
        var1.method3102(this.field1317 ? 1 : 0);
        var1.method3102(this.field1318 ? 1 : 0);
        var1.method3102(this.field1322);
        var1.method3102(this.field1319.size());
        Iterator var2 = this.field1319.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method3136((Integer) var3.getKey());
            var1.method3136((Integer) var3.getValue());
        }
        var1.method2984(this.field1320 == null ? "" : this.field1320);
        var1.method3105(this.field1321);
        return var1;
    }

    @ObfuscatedName("j.a(I)Lcq;")
    public static class81 method1() {
        class124 var0 = null;
        class81 var1 = new class81();
        try {
            var0 = class157.method2894("", Statics.field696.field3200, false);
            byte[] var2 = new byte[(int) var0.method2165()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var0.method2166(var2, var3, var2.length - var3);
                if (var4 == -1) {
                    throw new IOException();
                }
            }
            var1 = new class81(new class175(var2));
        } catch (Exception var8) {
        }
        try {
            if (var0 != null) {
                var0.method2163();
            }
        } catch (Exception var7) {
        }
        return var1;
    }

    @ObfuscatedName("m.r(I)V")
    public static void method163() {
        class124 var0 = null;
        try {
            var0 = class157.method2894("", Statics.field696.field3200, true);
            class175 var1 = Statics.field2396.method1452();
            var0.method2162(var1.field2392, 0, var1.field2395);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method2169(true);
            }
        } catch (Exception var4) {
        }
    }
}
