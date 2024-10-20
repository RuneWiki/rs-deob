package deob;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("ce")
public class class79 {

    @ObfuscatedName("ce.g")
    public static int field1234 = 6;

    @ObfuscatedName("ce.b")
    public boolean field1228;

    @ObfuscatedName("ce.z")
    public boolean field1227;

    @ObfuscatedName("ce.n")
    public int field1230 = 1;

    @ObfuscatedName("ce.l")
    public String field1231 = null;

    @ObfuscatedName("ce.s")
    public boolean field1232 = false;

    @ObfuscatedName("ce.y")
    public LinkedHashMap field1229 = new LinkedHashMap();

    public class79() {
        this.method1645(true);
    }

    public class79(class195 arg0) {
        if (arg0 == null || arg0.field2563 == null) {
            this.method1645(true);
        } else {
            int var2 = arg0.method3332();
            if (var2 >= 0 && var2 <= field1234) {
                if (arg0.method3332() == 1) {
                    this.field1228 = true;
                }
                if (var2 > 1) {
                    this.field1227 = arg0.method3332() == 1;
                }
                if (var2 > 3) {
                    this.field1230 = arg0.method3332();
                }
                if (var2 > 2) {
                    int var3 = arg0.method3332();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method3472();
                        int var6 = arg0.method3472();
                        this.field1229.put(var5, var6);
                    }
                }
                if (var2 > 4) {
                    this.field1231 = arg0.method3352();
                }
                if (var2 > 5) {
                    this.field1232 = arg0.method3315();
                }
            } else {
                this.method1645(true);
            }
        }
    }

    @ObfuscatedName("ce.g(ZB)V")
    public void method1645(boolean arg0) {
    }

    @ObfuscatedName("ce.e(S)Lgg;")
    public class195 method1646() {
        class195 var1 = new class195(100);
        var1.method3363(field1234);
        var1.method3363(this.field1228 ? 1 : 0);
        var1.method3363(this.field1227 ? 1 : 0);
        var1.method3363(this.field1230);
        var1.method3363(this.field1229.size());
        Iterator var2 = this.field1229.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method3319((Integer) var3.getKey());
            var1.method3319((Integer) var3.getValue());
        }
        var1.method3300(this.field1231 == null ? "" : this.field1231);
        var1.method3299(this.field1232);
        return var1;
    }

    @ObfuscatedName("l.b(I)Lce;")
    public static class79 method18() {
        class123 var0 = null;
        class79 var1 = new class79();
        try {
            var0 = class168.method9("", Statics.field297.field3357, false);
            byte[] var2 = new byte[(int) var0.method2441()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var0.method2432(var2, var3, var2.length - var3);
                if (var4 == -1) {
                    throw new IOException();
                }
            }
            var1 = new class79(new class195(var2));
        } catch (Exception var8) {
        }
        try {
            if (var0 != null) {
                var0.method2444();
            }
        } catch (Exception var7) {
        }
        return var1;
    }

    @ObfuscatedName("iz.z(I)V")
    public static void method4185() {
        class123 var0 = null;
        try {
            var0 = class168.method9("", Statics.field297.field3357, true);
            class195 var1 = Statics.field1117.method1646();
            var0.method2429(var1.field2563, 0, var1.field2562);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method2430(true);
            }
        } catch (Exception var4) {
        }
    }
}
