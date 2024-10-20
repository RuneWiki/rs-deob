package deob;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("cd")
public class class82 {

    @ObfuscatedName("cd.i")
    public static int field1289 = 4;

    @ObfuscatedName("cd.u")
    public boolean field1285;

    @ObfuscatedName("cd.q")
    public boolean field1286;

    @ObfuscatedName("cd.g")
    public int field1287 = 1;

    @ObfuscatedName("cd.v")
    public LinkedHashMap field1288 = new LinkedHashMap();

    public class82() {
        this.method1483(true);
    }

    public class82(class174 arg0) {
        if (arg0 == null || arg0.field2387 == null) {
            this.method1483(true);
        } else {
            int var2 = arg0.method2930();
            if (var2 >= 0 && var2 <= field1289) {
                if (arg0.method2930() == 1) {
                    this.field1285 = true;
                }
                if (var2 > 1) {
                    this.field1286 = arg0.method2930() == 1;
                }
                if (var2 > 3) {
                    this.field1287 = arg0.method2930();
                }
                if (var2 > 2) {
                    int var3 = arg0.method2930();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method2927();
                        int var6 = arg0.method2927();
                        this.field1288.put(var5, var6);
                    }
                }
            } else {
                this.method1483(true);
            }
        }
    }

    @ObfuscatedName("cd.i(ZI)V")
    public void method1483(boolean arg0) {
    }

    @ObfuscatedName("cd.h(B)Lfv;")
    public class174 method1480() {
        class174 var1 = new class174(100);
        var1.method3031(field1289);
        var1.method3031(this.field1285 ? 1 : 0);
        var1.method3031(this.field1286 ? 1 : 0);
        var1.method3031(this.field1287);
        var1.method3031(this.field1288.size());
        Iterator var2 = this.field1288.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method2919((Integer) var3.getKey());
            var1.method2919((Integer) var3.getValue());
        }
        return var1;
    }

    @ObfuscatedName("at.u(B)Lcd;")
    public static class82 method501() {
        class125 var0 = null;
        class82 var1 = new class82();
        try {
            var0 = class156.method105("", Statics.field26.field3188, false);
            byte[] var2 = new byte[(int) var0.method2170()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var0.method2171(var2, var3, var2.length - var3);
                if (var4 == -1) {
                    throw new IOException();
                }
            }
            var1 = new class82(new class174(var2));
        } catch (Exception var8) {
        }
        try {
            if (var0 != null) {
                var0.method2169();
            }
        } catch (Exception var7) {
        }
        return var1;
    }

    @ObfuscatedName("dc.q(I)V")
    public static void method2307() {
        class125 var0 = null;
        try {
            var0 = class156.method105("", Statics.field26.field3188, true);
            class174 var1 = Statics.field1990.method1480();
            var0.method2168(var1.field2387, 0, var1.field2384);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method2169();
            }
        } catch (Exception var4) {
        }
    }
}
