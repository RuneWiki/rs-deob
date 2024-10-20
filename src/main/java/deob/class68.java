package deob;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("bi")
public class class68 {

    @ObfuscatedName("bi.c")
    public static int field1018 = 6;

    @ObfuscatedName("bi.m")
    public boolean field1017;

    @ObfuscatedName("bi.j")
    public boolean field1019;

    @ObfuscatedName("bi.g")
    public int field1020 = 1;

    @ObfuscatedName("bi.i")
    public String field1016 = null;

    @ObfuscatedName("bi.h")
    public boolean field1022 = false;

    @ObfuscatedName("bi.l")
    public LinkedHashMap field1023 = new LinkedHashMap();

    public class68() {
        this.method1505(true);
    }

    public class68(class185 arg0) {
        if (arg0 == null || arg0.field2388 == null) {
            this.method1505(true);
        } else {
            int var2 = arg0.method3243();
            if (var2 >= 0 && var2 <= field1018) {
                if (arg0.method3243() == 1) {
                    this.field1017 = true;
                }
                if (var2 > 1) {
                    this.field1019 = arg0.method3243() == 1;
                }
                if (var2 > 3) {
                    this.field1020 = arg0.method3243();
                }
                if (var2 > 2) {
                    int var3 = arg0.method3243();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method3323();
                        int var6 = arg0.method3323();
                        this.field1023.put(var5, var6);
                    }
                }
                if (var2 > 4) {
                    this.field1016 = arg0.method3250();
                }
                if (var2 > 5) {
                    this.field1022 = arg0.method3249();
                }
            } else {
                this.method1505(true);
            }
        }
    }

    @ObfuscatedName("bi.c(ZI)V")
    public void method1505(boolean arg0) {
    }

    @ObfuscatedName("bi.q(B)Lgg;")
    public class185 method1508() {
        class185 var1 = new class185(100);
        var1.method3227(field1018);
        var1.method3227(this.field1017 ? 1 : 0);
        var1.method3227(this.field1019 ? 1 : 0);
        var1.method3227(this.field1020);
        var1.method3227(this.field1023.size());
        Iterator var2 = this.field1023.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method3230((Integer) var3.getKey());
            var1.method3230((Integer) var3.getValue());
        }
        var1.method3234(this.field1016 == null ? "" : this.field1016);
        var1.method3431(this.field1022);
        return var1;
    }

    @ObfuscatedName("bf.m(B)V")
    public static void method1080() {
        class113 var0 = null;
        try {
            var0 = class158.method3074("", Statics.field391.field3176, true);
            class185 var1 = Statics.field580.method1508();
            var0.method2265(var1.field2388, 0, var1.field2386);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method2267(true);
            }
        } catch (Exception var4) {
        }
    }
}
