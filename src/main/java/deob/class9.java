package deob;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("m")
public class class9 {

    @ObfuscatedName("m.b")
    public static int field130 = 4;

    @ObfuscatedName("m.a")
    public boolean field126;

    @ObfuscatedName("m.k")
    public boolean field127;

    @ObfuscatedName("m.p")
    public int field128 = 1;

    @ObfuscatedName("m.l")
    public LinkedHashMap field129 = new LinkedHashMap();

    public class9() {
        this.method102(true);
    }

    public class9(class111 arg0) {
        if (arg0 == null || arg0.field1897 == null) {
            this.method102(true);
        } else {
            int var2 = arg0.method2127();
            if (var2 >= 0 && var2 <= field130) {
                if (arg0.method2127() == 1) {
                    this.field126 = true;
                }
                if (var2 > 1) {
                    this.field127 = arg0.method2127() == 1;
                }
                if (var2 > 3) {
                    this.field128 = arg0.method2127();
                }
                if (var2 > 2) {
                    int var3 = arg0.method2127();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method2194();
                        int var6 = arg0.method2194();
                        this.field129.put(var5, var6);
                    }
                }
            } else {
                this.method102(true);
            }
        }
    }

    @ObfuscatedName("m.b(ZB)V")
    public void method102(boolean arg0) {
    }

    @ObfuscatedName("m.e(I)Ldj;")
    public class111 method103() {
        class111 var1 = new class111(100);
        var1.method2112(field130);
        var1.method2112(this.field126 ? 1 : 0);
        var1.method2112(this.field127 ? 1 : 0);
        var1.method2112(this.field128);
        var1.method2112(this.field129.size());
        Iterator var2 = this.field129.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method2115((Integer) var3.getKey());
            var1.method2115((Integer) var3.getValue());
        }
        return var1;
    }

    @ObfuscatedName("n.a(I)Lm;")
    public static class9 method139() {
        class218 var0 = null;
        class9 var1 = new class9();
        try {
            var0 = class141.method745("", Statics.field451.field2181, false);
            byte[] var2 = new byte[(int) var0.method3630()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var0.method3631(var2, var3, var2.length - var3);
                if (var4 == -1) {
                    throw new IOException();
                }
            }
            var1 = new class9(new class111(var2));
        } catch (Exception var8) {
        }
        try {
            if (var0 != null) {
                var0.method3632();
            }
        } catch (Exception var7) {
        }
        return var1;
    }
}
