package deob;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("bh")
public class class78 {

    @ObfuscatedName("bh.p")
    public static int field1188 = 6;

    @ObfuscatedName("bh.w")
    public boolean field1184;

    @ObfuscatedName("bh.s")
    public boolean field1185;

    @ObfuscatedName("bh.j")
    public int field1190 = 1;

    @ObfuscatedName("bh.a")
    public String field1182 = null;

    @ObfuscatedName("bh.t")
    public boolean field1186 = false;

    @ObfuscatedName("bh.r")
    public LinkedHashMap field1189 = new LinkedHashMap();

    public class78() {
        this.method1531(true);
    }

    public class78(class185 arg0) {
        if (arg0 == null || arg0.field2491 == null) {
            this.method1531(true);
        } else {
            int var2 = arg0.method3197();
            if (var2 >= 0 && var2 <= field1188) {
                if (arg0.method3197() == 1) {
                    this.field1184 = true;
                }
                if (var2 > 1) {
                    this.field1185 = arg0.method3197() == 1;
                }
                if (var2 > 3) {
                    this.field1190 = arg0.method3197();
                }
                if (var2 > 2) {
                    int var3 = arg0.method3197();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method3127();
                        int var6 = arg0.method3127();
                        this.field1189.put(var5, var6);
                    }
                }
                if (var2 > 4) {
                    this.field1182 = arg0.method3181();
                }
                if (var2 > 5) {
                    this.field1186 = arg0.method3129();
                }
            } else {
                this.method1531(true);
            }
        }
    }

    @ObfuscatedName("bh.p(ZI)V")
    public void method1531(boolean arg0) {
    }

    @ObfuscatedName("bh.i(I)Lgj;")
    public class185 method1539() {
        class185 var1 = new class185(100);
        var1.method3107(field1188);
        var1.method3107(this.field1184 ? 1 : 0);
        var1.method3107(this.field1185 ? 1 : 0);
        var1.method3107(this.field1190);
        var1.method3107(this.field1189.size());
        Iterator var2 = this.field1189.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method3110((Integer) var3.getKey());
            var1.method3110((Integer) var3.getValue());
        }
        var1.method3189(this.field1182 == null ? "" : this.field1182);
        var1.method3211(this.field1186);
        return var1;
    }

    @ObfuscatedName("r.w(B)Lbh;")
    public static class78 method48() {
        class122 var0 = null;
        class78 var1 = new class78();
        try {
            var0 = class158.method2819("", Statics.field262.field3271, false);
            byte[] var2 = new byte[(int) var0.method2309()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var0.method2315(var2, var3, var2.length - var3);
                if (var4 == -1) {
                    throw new IOException();
                }
            }
            var1 = new class78(new class185(var2));
        } catch (Exception var8) {
        }
        try {
            if (var0 != null) {
                var0.method2312();
            }
        } catch (Exception var7) {
        }
        return var1;
    }

    @ObfuscatedName("bo.s(I)V")
    public static void method1030() {
        class122 var0 = null;
        try {
            var0 = class158.method2819("", Statics.field262.field3271, true);
            class185 var1 = Statics.field2688.method1539();
            var0.method2311(var1.field2491, 0, var1.field2488);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method2324(true);
            }
        } catch (Exception var4) {
        }
    }
}
