package deob;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("w")
public class class9 {

    @ObfuscatedName("w.n")
    public static int field148 = 3;

    @ObfuscatedName("w.k")
    public boolean field140;

    @ObfuscatedName("w.i")
    public boolean field138;

    @ObfuscatedName("w.d")
    public LinkedHashMap field142 = new LinkedHashMap();

    public class9() {
        this.method109(true);
    }

    public class9(class107 arg0) {
        if (arg0 == null || arg0.field1829 == null) {
            this.method109(true);
        } else {
            int var2 = arg0.method2148();
            if (var2 >= 0 && var2 <= field148) {
                if (arg0.method2148() == 1) {
                    this.field140 = true;
                }
                if (var2 > 1) {
                    this.field138 = arg0.method2148() == 1;
                }
                if (var2 > 2) {
                    int var3 = arg0.method2148();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method2183();
                        int var6 = arg0.method2183();
                        this.field142.put(var5, var6);
                    }
                }
            } else {
                this.method109(true);
            }
        }
    }

    @ObfuscatedName("w.n(ZB)V")
    public void method109(boolean arg0) {
    }

    @ObfuscatedName("w.x(B)Ldw;")
    public class107 method108() {
        class107 var1 = new class107(100);
        var1.method2124(field148);
        var1.method2124(this.field140 ? 1 : 0);
        var1.method2124(this.field138 ? 1 : 0);
        var1.method2124(this.field142.size());
        Iterator var2 = this.field142.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method2127((Integer) var3.getKey());
            var1.method2127((Integer) var3.getValue());
        }
        return var1;
    }

    @ObfuscatedName("at.k(I)Lw;")
    public static class9 method620() {
        class196 var0 = null;
        class9 var1 = new class9();
        try {
            var0 = class136.method549("", Statics.field260.field2121, false);
            byte[] var2 = new byte[(int) var0.method3384()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var0.method3398(var2, var3, var2.length - var3);
                if (var4 == -1) {
                    throw new IOException();
                }
            }
            var1 = new class9(new class107(var2));
        } catch (Exception var8) {
        }
        try {
            if (var0 != null) {
                var0.method3385();
            }
        } catch (Exception var7) {
        }
        return var1;
    }
}
