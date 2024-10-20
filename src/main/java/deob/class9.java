package deob;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("n")
public class class9 {

    @ObfuscatedName("n.j")
    public static int field150 = 4;

    @ObfuscatedName("n.a")
    public boolean field143;

    @ObfuscatedName("n.i")
    public boolean field144;

    @ObfuscatedName("n.f")
    public int field145 = 1;

    @ObfuscatedName("n.m")
    public LinkedHashMap field146 = new LinkedHashMap();

    public class9() {
        this.method100(true);
    }

    public class9(class119 arg0) {
        if (arg0 == null || arg0.field1996 == null) {
            this.method100(true);
        } else {
            int var2 = arg0.method2316();
            if (var2 >= 0 && var2 <= field150) {
                if (arg0.method2316() == 1) {
                    this.field143 = true;
                }
                if (var2 > 1) {
                    this.field144 = arg0.method2316() == 1;
                }
                if (var2 > 3) {
                    this.field145 = arg0.method2316();
                }
                if (var2 > 2) {
                    int var3 = arg0.method2316();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method2321();
                        int var6 = arg0.method2321();
                        this.field146.put(var5, var6);
                    }
                }
            } else {
                this.method100(true);
            }
        }
    }

    @ObfuscatedName("n.j(ZI)V")
    public void method100(boolean arg0) {
    }

    @ObfuscatedName("n.l(I)Ldc;")
    public class119 method98() {
        class119 var1 = new class119(100);
        var1.method2301(field150);
        var1.method2301(this.field143 ? 1 : 0);
        var1.method2301(this.field144 ? 1 : 0);
        var1.method2301(this.field145);
        var1.method2301(this.field146.size());
        Iterator var2 = this.field146.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method2304((Integer) var3.getKey());
            var1.method2304((Integer) var3.getValue());
        }
        return var1;
    }

    @ObfuscatedName("i.a(I)V")
    public static void method36() {
        class227 var0 = null;
        try {
            var0 = class149.method2("", Statics.field351.field2296, true);
            class119 var1 = Statics.field170.method98();
            var0.method3810(var1.field1996, 0, var1.field1999);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method3818();
            }
        } catch (Exception var4) {
        }
    }
}
