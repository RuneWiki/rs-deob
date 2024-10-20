package deob;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("j")
public class class9 {

    @ObfuscatedName("j.k")
    public static int field134 = 3;

    @ObfuscatedName("j.s")
    public boolean field129;

    @ObfuscatedName("j.g")
    public boolean field130;

    @ObfuscatedName("j.h")
    public LinkedHashMap field131 = new LinkedHashMap();

    public class9() {
        this.method89(true);
    }

    public class9(class107 arg0) {
        if (arg0 == null || arg0.field1844 == null) {
            this.method89(true);
        } else {
            int var2 = arg0.method2138();
            if (var2 >= 0 && var2 <= field134) {
                if (arg0.method2138() == 1) {
                    this.field129 = true;
                }
                if (var2 > 1) {
                    this.field130 = arg0.method2138() == 1;
                }
                if (var2 > 2) {
                    int var3 = arg0.method2138();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method2143();
                        int var6 = arg0.method2143();
                        this.field131.put(var5, var6);
                    }
                }
            } else {
                this.method89(true);
            }
        }
    }

    @ObfuscatedName("j.k(ZI)V")
    public void method89(boolean arg0) {
    }

    @ObfuscatedName("j.y(I)Ldy;")
    public class107 method90() {
        class107 var1 = new class107(100);
        var1.method2124(field134);
        var1.method2124(this.field129 ? 1 : 0);
        var1.method2124(this.field130 ? 1 : 0);
        var1.method2124(this.field131.size());
        Iterator var2 = this.field131.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method2127((Integer) var3.getKey());
            var1.method2127((Integer) var3.getValue());
        }
        return var1;
    }

    @ObfuscatedName("o.s(B)V")
    public static void method466() {
        class196 var0 = null;
        try {
            var0 = class136.method463("", Statics.field122.field2147, true);
            class107 var1 = Statics.field2674.method90();
            var0.method3496(var1.field1844, 0, var1.field1838);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method3497();
            }
        } catch (Exception var4) {
        }
    }
}
