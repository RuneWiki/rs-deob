package deob;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("bn")
public class class73 {

    @ObfuscatedName("bn.n")
    public static int field1011 = 6;

    @ObfuscatedName("bn.l")
    public boolean field1013;

    @ObfuscatedName("bn.g")
    public boolean field1014;

    @ObfuscatedName("bn.b")
    public int field1016 = 1;

    @ObfuscatedName("bn.a")
    public String field1017 = null;

    @ObfuscatedName("bn.c")
    public boolean field1015 = false;

    @ObfuscatedName("bn.z")
    public LinkedHashMap field1018 = new LinkedHashMap();

    public class73() {
        this.method1636(true);
    }

    public class73(class190 arg0) {
        if (arg0 == null || arg0.field2424 == null) {
            this.method1636(true);
        } else {
            int var2 = arg0.method3511();
            if (var2 >= 0 && var2 <= field1011) {
                if (arg0.method3511() == 1) {
                    this.field1013 = true;
                }
                if (var2 > 1) {
                    this.field1014 = arg0.method3511() == 1;
                }
                if (var2 > 3) {
                    this.field1016 = arg0.method3511();
                }
                if (var2 > 2) {
                    int var3 = arg0.method3511();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method3562();
                        int var6 = arg0.method3562();
                        this.field1018.put(var5, var6);
                    }
                }
                if (var2 > 4) {
                    this.field1017 = arg0.method3575();
                }
                if (var2 > 5) {
                    this.field1015 = arg0.method3518();
                }
            } else {
                this.method1636(true);
            }
        }
    }

    @ObfuscatedName("bn.n(ZI)V")
    public void method1636(boolean arg0) {
    }

    @ObfuscatedName("bn.h(I)Lgc;")
    public class190 method1640() {
        class190 var1 = new class190(100);
        var1.method3646(field1011);
        var1.method3646(this.field1013 ? 1 : 0);
        var1.method3646(this.field1014 ? 1 : 0);
        var1.method3646(this.field1016);
        var1.method3646(this.field1018.size());
        Iterator var2 = this.field1018.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method3576((Integer) var3.getKey());
            var1.method3576((Integer) var3.getValue());
        }
        var1.method3669(this.field1017 == null ? "" : this.field1017);
        var1.method3501(this.field1015);
        return var1;
    }

    @ObfuscatedName("cy.l(I)V")
    public static void method1874() {
        class118 var0 = null;
        try {
            var0 = Statics.method3209("", Statics.field118.field3203, true);
            class190 var1 = Statics.field2667.method1640();
            var0.method2522(var1.field2424, 0, var1.field2423);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method2536(true);
            }
        } catch (Exception var4) {
        }
    }
}
