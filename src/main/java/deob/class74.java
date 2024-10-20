package deob;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("bs")
public class class74 {

    @ObfuscatedName("bs.u")
    public static int field1049 = 6;

    @ObfuscatedName("bs.b")
    public boolean field1055;

    @ObfuscatedName("bs.g")
    public boolean field1048;

    @ObfuscatedName("bs.z")
    public int field1050 = 1;

    @ObfuscatedName("bs.p")
    public String field1056 = null;

    @ObfuscatedName("bs.h")
    public boolean field1051 = false;

    @ObfuscatedName("bs.y")
    public LinkedHashMap field1052 = new LinkedHashMap();

    public class74() {
        this.method1676(true);
    }

    public class74(class300 arg0) {
        if (arg0 == null || arg0.field3708 == null) {
            this.method1676(true);
        } else {
            int var2 = arg0.method5138();
            if (var2 >= 0 && var2 <= field1049) {
                if (arg0.method5138() == 1) {
                    this.field1055 = true;
                }
                if (var2 > 1) {
                    this.field1048 = arg0.method5138() == 1;
                }
                if (var2 > 3) {
                    this.field1050 = arg0.method5138();
                }
                if (var2 > 2) {
                    int var3 = arg0.method5138();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method5277();
                        int var6 = arg0.method5277();
                        this.field1052.put(var5, var6);
                    }
                }
                if (var2 > 4) {
                    this.field1056 = arg0.method5146();
                }
                if (var2 > 5) {
                    this.field1051 = arg0.method5176();
                }
            } else {
                this.method1676(true);
            }
        }
    }

    @ObfuscatedName("bs.u(ZI)V")
    public void method1676(boolean arg0) {
    }

    @ObfuscatedName("bs.f(I)Lkg;")
    public class300 method1672() {
        class300 var1 = new class300(100);
        var1.method5290(field1049);
        var1.method5290(this.field1055 ? 1 : 0);
        var1.method5290(this.field1048 ? 1 : 0);
        var1.method5290(this.field1050);
        var1.method5290(this.field1052.size());
        Iterator var2 = this.field1052.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method5231((Integer) var3.getKey());
            var1.method5231((Integer) var3.getValue());
        }
        var1.method5129(this.field1056 == null ? "" : this.field1056);
        var1.method5355(this.field1051);
        return var1;
    }

    @ObfuscatedName("af.b(I)Lbs;")
    public static class74 method358() {
        class343 var0 = null;
        class74 var1 = new class74();
        try {
            var0 = class168.method3393("", Statics.field1974.field3120, false);
            byte[] var2 = new byte[(int) var0.method6118()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var0.method6119(var2, var3, var2.length - var3);
                if (var4 == -1) {
                    throw new IOException();
                }
            }
            var1 = new class74(new class300(var2));
        } catch (Exception var8) {
        }
        try {
            if (var0 != null) {
                var0.method6116();
            }
        } catch (Exception var7) {
        }
        return var1;
    }

    @ObfuscatedName("az.g(B)V")
    public static void method650() {
        class343 var0 = null;
        try {
            var0 = class168.method3393("", Statics.field1974.field3120, true);
            class300 var1 = Statics.field1978.method1672();
            var0.method6115(var1.field3708, 0, var1.field3707);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method6128(true);
            }
        } catch (Exception var4) {
        }
    }
}
