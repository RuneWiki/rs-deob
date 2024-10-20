package deob;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("f")
public class class9 {

    @ObfuscatedName("f.e")
    public static int field135 = 3;

    @ObfuscatedName("f.l")
    public boolean field128;

    @ObfuscatedName("f.c")
    public boolean field130;

    @ObfuscatedName("f.u")
    public LinkedHashMap field132 = new LinkedHashMap();

    public class9() {
        this.method119(true);
    }

    public class9(class111 arg0) {
        if (arg0 == null || arg0.field1835 == null) {
            this.method119(true);
        } else {
            int var2 = arg0.method2176();
            if (var2 >= 0 && var2 <= field135) {
                if (arg0.method2176() == 1) {
                    this.field128 = true;
                }
                if (var2 > 1) {
                    this.field130 = arg0.method2176() == 1;
                }
                if (var2 > 2) {
                    int var3 = arg0.method2176();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method2378();
                        int var6 = arg0.method2378();
                        this.field132.put(var5, var6);
                    }
                }
            } else {
                this.method119(true);
            }
        }
    }

    @ObfuscatedName("f.e(ZB)V")
    public void method119(boolean arg0) {
    }

    @ObfuscatedName("f.a(I)Ldh;")
    public class111 method124() {
        class111 var1 = new class111(100);
        var1.method2366(field135);
        var1.method2366(this.field128 ? 1 : 0);
        var1.method2366(this.field130 ? 1 : 0);
        var1.method2366(this.field132.size());
        Iterator var2 = this.field132.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method2229((Integer) var3.getKey());
            var1.method2229((Integer) var3.getValue());
        }
        return var1;
    }

    @ObfuscatedName("aa.l(I)V")
    public static void method1068() {
        class217 var0 = null;
        try {
            var0 = class141.method1114("", Statics.field418.field2140, true);
            class111 var1 = Statics.field1806.method124();
            var0.method3642(var1.field1835, 0, var1.field1834);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method3643();
            }
        } catch (Exception var4) {
        }
    }
}
