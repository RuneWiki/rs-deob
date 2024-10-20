package deob;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("ai")
public class class31 {

    @ObfuscatedName("ai.n")
    public static int field691 = 4;

    @ObfuscatedName("ai.m")
    public boolean field692;

    @ObfuscatedName("ai.h")
    public boolean field689;

    @ObfuscatedName("ai.w")
    public int field693 = 1;

    @ObfuscatedName("ai.r")
    public LinkedHashMap field694 = new LinkedHashMap();

    public class31() {
        this.method674(true);
    }

    public class31(class161 arg0) {
        if (arg0 == null || arg0.field2291 == null) {
            this.method674(true);
        } else {
            int var2 = arg0.method2823();
            if (var2 >= 0 && var2 <= field691) {
                if (arg0.method2823() == 1) {
                    this.field692 = true;
                }
                if (var2 > 1) {
                    this.field689 = arg0.method2823() == 1;
                }
                if (var2 > 3) {
                    this.field693 = arg0.method2823();
                }
                if (var2 > 2) {
                    int var3 = arg0.method2823();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method2785();
                        int var6 = arg0.method2785();
                        this.field694.put(var5, var6);
                    }
                }
            } else {
                this.method674(true);
            }
        }
    }

    @ObfuscatedName("ai.n(ZI)V")
    public void method674(boolean arg0) {
    }

    @ObfuscatedName("ai.d(B)Lfa;")
    public class161 method671() {
        class161 var1 = new class161(100);
        var1.method2765(field691);
        var1.method2765(this.field692 ? 1 : 0);
        var1.method2765(this.field689 ? 1 : 0);
        var1.method2765(this.field693);
        var1.method2765(this.field694.size());
        Iterator var2 = this.field694.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method2768((Integer) var3.getKey());
            var1.method2768((Integer) var3.getValue());
        }
        return var1;
    }

    @ObfuscatedName("h.m(I)V")
    public static void method43() {
        class74 var0 = null;
        try {
            var0 = class105.method2171("", Statics.field759.field2697, true);
            class161 var1 = Statics.field1344.method671();
            var0.method1351(var1.field2291, 0, var1.field2285);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method1352();
            }
        } catch (Exception var4) {
        }
    }
}
