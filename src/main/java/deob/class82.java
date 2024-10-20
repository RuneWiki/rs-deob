package deob;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("ct")
public class class82 {

    @ObfuscatedName("ct.a")
    public static int field1311 = 4;

    @ObfuscatedName("ct.n")
    public boolean field1305;

    @ObfuscatedName("ct.r")
    public boolean field1308;

    @ObfuscatedName("ct.v")
    public int field1309 = 1;

    @ObfuscatedName("ct.e")
    public LinkedHashMap field1310 = new LinkedHashMap();

    public class82() {
        this.method1421(true);
    }

    public class82(class174 arg0) {
        if (arg0 == null || arg0.field2391 == null) {
            this.method1421(true);
        } else {
            int var2 = arg0.method2871();
            if (var2 >= 0 && var2 <= field1311) {
                if (arg0.method2871() == 1) {
                    this.field1305 = true;
                }
                if (var2 > 1) {
                    this.field1308 = arg0.method2871() == 1;
                }
                if (var2 > 3) {
                    this.field1309 = arg0.method2871();
                }
                if (var2 > 2) {
                    int var3 = arg0.method2871();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method2876();
                        int var6 = arg0.method2876();
                        this.field1310.put(var5, var6);
                    }
                }
            } else {
                this.method1421(true);
            }
        }
    }

    @ObfuscatedName("ct.a(ZI)V")
    public void method1421(boolean arg0) {
    }

    @ObfuscatedName("ct.j(I)Lfe;")
    public class174 method1425() {
        class174 var1 = new class174(100);
        var1.method2908(field1311);
        var1.method2908(this.field1305 ? 1 : 0);
        var1.method2908(this.field1308 ? 1 : 0);
        var1.method2908(this.field1309);
        var1.method2908(this.field1310.size());
        Iterator var2 = this.field1310.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method2859((Integer) var3.getKey());
            var1.method2859((Integer) var3.getValue());
        }
        return var1;
    }

    @ObfuscatedName("jk.n(I)Lct;")
    public static class82 method4323() {
        class125 var0 = null;
        class82 var1 = new class82();
        try {
            var0 = class156.method2660("", Statics.field1516.field3199, false);
            byte[] var2 = new byte[(int) var0.method2133()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var0.method2134(var2, var3, var2.length - var3);
                if (var4 == -1) {
                    throw new IOException();
                }
            }
            var1 = new class82(new class174(var2));
        } catch (Exception var8) {
        }
        try {
            if (var0 != null) {
                var0.method2129();
            }
        } catch (Exception var7) {
        }
        return var1;
    }
}
