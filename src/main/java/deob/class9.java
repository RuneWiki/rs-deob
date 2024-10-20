package deob;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("x")
public class class9 {

    @ObfuscatedName("x.m")
    public static int field138 = 4;

    @ObfuscatedName("x.e")
    public boolean field128;

    @ObfuscatedName("x.o")
    public boolean field133;

    @ObfuscatedName("x.g")
    public int field137 = 1;

    @ObfuscatedName("x.l")
    public LinkedHashMap field127 = new LinkedHashMap();

    public class9() {
        this.method103(true);
    }

    public class9(class123 arg0) {
        if (arg0 == null || arg0.field2048 == null) {
            this.method103(true);
        } else {
            int var2 = arg0.method2398();
            if (var2 >= 0 && var2 <= field138) {
                if (arg0.method2398() == 1) {
                    this.field128 = true;
                }
                if (var2 > 1) {
                    this.field133 = arg0.method2398() == 1;
                }
                if (var2 > 3) {
                    this.field137 = arg0.method2398();
                }
                if (var2 > 2) {
                    int var3 = arg0.method2398();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method2419();
                        int var6 = arg0.method2419();
                        this.field127.put(var5, var6);
                    }
                }
            } else {
                this.method103(true);
            }
        }
    }

    @ObfuscatedName("x.m(ZB)V")
    public void method103(boolean arg0) {
    }

    @ObfuscatedName("x.w(I)Ldj;")
    public class123 method104() {
        class123 var1 = new class123(100);
        var1.method2399(field138);
        var1.method2399(this.field128 ? 1 : 0);
        var1.method2399(this.field133 ? 1 : 0);
        var1.method2399(this.field137);
        var1.method2399(this.field127.size());
        Iterator var2 = this.field127.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method2402((Integer) var3.getKey());
            var1.method2402((Integer) var3.getValue());
        }
        return var1;
    }

    @ObfuscatedName("aa.e(I)V")
    public static void method660() {
        class231 var0 = null;
        try {
            var0 = class153.method92("", Statics.field1241.field2344, true);
            class123 var1 = Statics.field163.method104();
            var0.method3938(var1.field2048, 0, var1.field2046);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method3954();
            }
        } catch (Exception var4) {
        }
    }
}
