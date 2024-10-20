package deob;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("bv")
public class class78 {

    @ObfuscatedName("bv.b")
    public static int field1188 = 6;

    @ObfuscatedName("bv.o")
    public boolean field1182;

    @ObfuscatedName("bv.p")
    public boolean field1183;

    @ObfuscatedName("bv.a")
    public int field1184 = 1;

    @ObfuscatedName("bv.h")
    public String field1185 = null;

    @ObfuscatedName("bv.l")
    public boolean field1186 = false;

    @ObfuscatedName("bv.y")
    public LinkedHashMap field1187 = new LinkedHashMap();

    public class78() {
        this.method1571(true);
    }

    public class78(class194 arg0) {
        if (arg0 == null || arg0.field2541 == null) {
            this.method1571(true);
        } else {
            int var2 = arg0.method3247();
            if (var2 >= 0 && var2 <= field1188) {
                if (arg0.method3247() == 1) {
                    this.field1182 = true;
                }
                if (var2 > 1) {
                    this.field1183 = arg0.method3247() == 1;
                }
                if (var2 > 3) {
                    this.field1184 = arg0.method3247();
                }
                if (var2 > 2) {
                    int var3 = arg0.method3247();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method3261();
                        int var6 = arg0.method3261();
                        this.field1187.put(var5, var6);
                    }
                }
                if (var2 > 4) {
                    this.field1185 = arg0.method3412();
                }
                if (var2 > 5) {
                    this.field1186 = arg0.method3254();
                }
            } else {
                this.method1571(true);
            }
        }
    }

    @ObfuscatedName("bv.b(ZI)V")
    public void method1571(boolean arg0) {
    }

    @ObfuscatedName("bv.q(I)Lgn;")
    public class194 method1564() {
        class194 var1 = new class194(100);
        var1.method3232(field1188);
        var1.method3232(this.field1182 ? 1 : 0);
        var1.method3232(this.field1183 ? 1 : 0);
        var1.method3232(this.field1184);
        var1.method3232(this.field1187.size());
        Iterator var2 = this.field1187.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method3235((Integer) var3.getKey());
            var1.method3235((Integer) var3.getValue());
        }
        var1.method3239(this.field1185 == null ? "" : this.field1185);
        var1.method3379(this.field1186);
        return var1;
    }

    @ObfuscatedName("ed.o(I)V")
    public static void method2590() {
        class122 var0 = null;
        try {
            var0 = class167.method57("", Statics.field457.field3311, true);
            class194 var1 = Statics.field1072.method1564();
            var0.method2336(var1.field2541, 0, var1.field2538);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method2338(true);
            }
        } catch (Exception var4) {
        }
    }
}
