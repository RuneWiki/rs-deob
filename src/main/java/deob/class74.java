package deob;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("bw")
public class class74 {

    @ObfuscatedName("bw.a")
    public static int field1032 = 6;

    @ObfuscatedName("bw.n")
    public boolean field1037;

    @ObfuscatedName("bw.q")
    public boolean field1034;

    @ObfuscatedName("bw.v")
    public int field1035 = 1;

    @ObfuscatedName("bw.l")
    public String field1036 = null;

    @ObfuscatedName("bw.c")
    public boolean field1038 = false;

    @ObfuscatedName("bw.o")
    public LinkedHashMap field1039 = new LinkedHashMap();

    public class74() {
        this.method1749(true);
    }

    public class74(class300 arg0) {
        if (arg0 == null || arg0.field3699 == null) {
            this.method1749(true);
        } else {
            int var2 = arg0.method5123();
            if (var2 >= 0 && var2 <= field1032) {
                if (arg0.method5123() == 1) {
                    this.field1037 = true;
                }
                if (var2 > 1) {
                    this.field1034 = arg0.method5123() == 1;
                }
                if (var2 > 3) {
                    this.field1035 = arg0.method5123();
                }
                if (var2 > 2) {
                    int var3 = arg0.method5123();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method5155();
                        int var6 = arg0.method5155();
                        this.field1039.put(var5, var6);
                    }
                }
                if (var2 > 4) {
                    this.field1036 = arg0.method5292();
                }
                if (var2 > 5) {
                    this.field1038 = arg0.method5134();
                }
            } else {
                this.method1749(true);
            }
        }
    }

    @ObfuscatedName("bw.a(ZI)V")
    public void method1749(boolean arg0) {
    }

    @ObfuscatedName("bw.t(I)Lkc;")
    public class300 method1751() {
        class300 var1 = new class300(100);
        var1.method5253(field1032);
        var1.method5253(this.field1037 ? 1 : 0);
        var1.method5253(this.field1034 ? 1 : 0);
        var1.method5253(this.field1035);
        var1.method5253(this.field1039.size());
        Iterator var2 = this.field1039.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method5262((Integer) var3.getKey());
            var1.method5262((Integer) var3.getValue());
        }
        var1.method5114(this.field1036 == null ? "" : this.field1036);
        var1.method5113(this.field1038);
        return var1;
    }

    @ObfuscatedName("ee.n(I)Lbw;")
    public static class74 method2904() {
        class343 var0 = null;
        class74 var1 = new class74();
        try {
            var0 = class168.method3330("", Statics.field459.field3098, false);
            byte[] var2 = new byte[(int) var0.method6172()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var0.method6159(var2, var3, var2.length - var3);
                if (var4 == -1) {
                    throw new IOException();
                }
            }
            var1 = new class74(new class300(var2));
        } catch (Exception var8) {
        }
        try {
            if (var0 != null) {
                var0.method6156();
            }
        } catch (Exception var7) {
        }
        return var1;
    }

    @ObfuscatedName("ii.q(I)V")
    public static void method4291() {
        class343 var0 = null;
        try {
            var0 = class168.method3330("", Statics.field459.field3098, true);
            class300 var1 = Statics.field562.method1751();
            var0.method6158(var1.field3699, 0, var1.field3694);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method6157(true);
            }
        } catch (Exception var4) {
        }
    }
}
