package deob;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("cw")
public class class81 {

    @ObfuscatedName("cw.b")
    public static int field1230 = 6;

    @ObfuscatedName("cw.r")
    public boolean field1235;

    @ObfuscatedName("cw.g")
    public boolean field1231;

    @ObfuscatedName("cw.x")
    public int field1232 = 1;

    @ObfuscatedName("cw.f")
    public String field1233 = null;

    @ObfuscatedName("cw.u")
    public boolean field1236 = false;

    @ObfuscatedName("cw.t")
    public LinkedHashMap field1228 = new LinkedHashMap();

    public class81() {
        this.method1452(true);
    }

    public class81(class181 arg0) {
        if (arg0 == null || arg0.field2495 == null) {
            this.method1452(true);
        } else {
            int var2 = arg0.method2945();
            if (var2 >= 0 && var2 <= field1230) {
                if (arg0.method2945() == 1) {
                    this.field1235 = true;
                }
                if (var2 > 1) {
                    this.field1231 = arg0.method2945() == 1;
                }
                if (var2 > 3) {
                    this.field1232 = arg0.method2945();
                }
                if (var2 > 2) {
                    int var3 = arg0.method2945();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method2996();
                        int var6 = arg0.method2996();
                        this.field1228.put(var5, var6);
                    }
                }
                if (var2 > 4) {
                    this.field1233 = arg0.method3003();
                }
                if (var2 > 5) {
                    this.field1236 = arg0.method2952();
                }
            } else {
                this.method1452(true);
            }
        }
    }

    @ObfuscatedName("cw.b(ZI)V")
    public void method1452(boolean arg0) {
    }

    @ObfuscatedName("cw.s(I)Lfs;")
    public class181 method1448() {
        class181 var1 = new class181(100);
        var1.method2929(field1230);
        var1.method2929(this.field1235 ? 1 : 0);
        var1.method2929(this.field1231 ? 1 : 0);
        var1.method2929(this.field1232);
        var1.method2929(this.field1228.size());
        Iterator var2 = this.field1228.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method2977((Integer) var3.getKey());
            var1.method2977((Integer) var3.getValue());
        }
        var1.method2936(this.field1233 == null ? "" : this.field1233);
        var1.method2935(this.field1236);
        return var1;
    }

    @ObfuscatedName("f.r(I)Lcw;")
    public static class81 method16() {
        class124 var0 = null;
        class81 var1 = new class81();
        try {
            var0 = class157.method2296("", Statics.field3263.field3257, false);
            byte[] var2 = new byte[(int) var0.method2174()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var0.method2171(var2, var3, var2.length - var3);
                if (var4 == -1) {
                    throw new IOException();
                }
            }
            var1 = new class81(new class181(var2));
        } catch (Exception var8) {
        }
        try {
            if (var0 != null) {
                var0.method2180();
            }
        } catch (Exception var7) {
        }
        return var1;
    }

    @ObfuscatedName("bt.g(I)V")
    public static void method842() {
        class124 var0 = null;
        try {
            var0 = class157.method2296("", Statics.field3263.field3257, true);
            class181 var1 = Statics.field801.method1448();
            var0.method2167(var1.field2495, 0, var1.field2488);
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
