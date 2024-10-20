package deob;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("bj")
public class class74 {

    @ObfuscatedName("bj.c")
    public static int field1045 = 6;

    @ObfuscatedName("bj.o")
    public boolean field1049;

    @ObfuscatedName("bj.e")
    public boolean field1046;

    @ObfuscatedName("bj.i")
    public int field1043 = 1;

    @ObfuscatedName("bj.g")
    public String field1047 = null;

    @ObfuscatedName("bj.d")
    public boolean field1051 = false;

    @ObfuscatedName("bj.l")
    public LinkedHashMap field1050 = new LinkedHashMap();

    public class74() {
        this.method1679(true);
    }

    public class74(class301 arg0) {
        if (arg0 == null || arg0.field3708 == null) {
            this.method1679(true);
        } else {
            int var2 = arg0.method5129();
            if (var2 >= 0 && var2 <= field1045) {
                if (arg0.method5129() == 1) {
                    this.field1049 = true;
                }
                if (var2 > 1) {
                    this.field1046 = arg0.method5129() == 1;
                }
                if (var2 > 3) {
                    this.field1043 = arg0.method5129();
                }
                if (var2 > 2) {
                    int var3 = arg0.method5129();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method5134();
                        int var6 = arg0.method5134();
                        this.field1050.put(var5, var6);
                    }
                }
                if (var2 > 4) {
                    this.field1047 = arg0.method5196();
                }
                if (var2 > 5) {
                    this.field1051 = arg0.method5136();
                }
            } else {
                this.method1679(true);
            }
        }
    }

    @ObfuscatedName("bj.c(ZI)V")
    public void method1679(boolean arg0) {
    }

    @ObfuscatedName("bj.t(I)Lkp;")
    public class301 method1671() {
        class301 var1 = new class301(100);
        var1.method5272(field1045);
        var1.method5272(this.field1049 ? 1 : 0);
        var1.method5272(this.field1046 ? 1 : 0);
        var1.method5272(this.field1043);
        var1.method5272(this.field1050.size());
        Iterator var2 = this.field1050.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method5306((Integer) var3.getKey());
            var1.method5306((Integer) var3.getValue());
        }
        var1.method5310(this.field1047 == null ? "" : this.field1047);
        var1.method5277(this.field1051);
        return var1;
    }

    @ObfuscatedName("ar.o(I)V")
    public static void method586() {
        class344 var0 = null;
        try {
            var0 = class168.method264("", Statics.field103.field3119, true);
            class301 var1 = Statics.field221.method1671();
            var0.method6128(var1.field3708, 0, var1.field3707);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method6137(true);
            }
        } catch (Exception var4) {
        }
    }
}
