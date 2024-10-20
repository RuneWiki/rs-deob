package deob;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("aa")
public class class31 {

    @ObfuscatedName("aa.b")
    public static int field699 = 4;

    @ObfuscatedName("aa.c")
    public boolean field687;

    @ObfuscatedName("aa.l")
    public boolean field688;

    @ObfuscatedName("aa.y")
    public int field698 = 1;

    @ObfuscatedName("aa.j")
    public LinkedHashMap field690 = new LinkedHashMap();

    public class31() {
        this.method653(true);
    }

    public class31(class154 arg0) {
        if (arg0 == null || arg0.field2084 == null) {
            this.method653(true);
        } else {
            int var2 = arg0.method2669();
            if (var2 >= 0 && var2 <= field699) {
                if (arg0.method2669() == 1) {
                    this.field687 = true;
                }
                if (var2 > 1) {
                    this.field688 = arg0.method2669() == 1;
                }
                if (var2 > 3) {
                    this.field698 = arg0.method2669();
                }
                if (var2 > 2) {
                    int var3 = arg0.method2669();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method2815();
                        int var6 = arg0.method2815();
                        this.field690.put(var5, var6);
                    }
                }
            } else {
                this.method653(true);
            }
        }
    }

    @ObfuscatedName("aa.b(ZI)V")
    public void method653(boolean arg0) {
    }

    @ObfuscatedName("aa.e(B)Lec;")
    public class154 method654() {
        class154 var1 = new class154(100);
        var1.method2780(field699);
        var1.method2780(this.field687 ? 1 : 0);
        var1.method2780(this.field688 ? 1 : 0);
        var1.method2780(this.field698);
        var1.method2780(this.field690.size());
        Iterator var2 = this.field690.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method2658((Integer) var3.getKey());
            var1.method2658((Integer) var3.getValue());
        }
        return var1;
    }

    @ObfuscatedName("client.c(I)Laa;")
    public static class31 method569() {
        class74 var0 = null;
        class31 var1 = new class31();
        try {
            var0 = class105.method717("", Statics.field77.field2695, false);
            byte[] var2 = new byte[(int) var0.method1362()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var0.method1375(var2, var3, var2.length - var3);
                if (var4 == -1) {
                    throw new IOException();
                }
            }
            var1 = new class31(new class154(var2));
        } catch (Exception var8) {
        }
        try {
            if (var0 != null) {
                var0.method1356();
            }
        } catch (Exception var7) {
        }
        return var1;
    }

    @ObfuscatedName("cl.l(I)V")
    public static void method1576() {
        class74 var0 = null;
        try {
            var0 = class105.method717("", Statics.field77.field2695, true);
            class154 var1 = Statics.field2073.method654();
            var0.method1368(var1.field2084, 0, var1.field2079);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method1356();
            }
        } catch (Exception var4) {
        }
    }
}
