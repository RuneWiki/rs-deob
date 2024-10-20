package deob;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("m")
public class class9 {

    @ObfuscatedName("m.y")
    public static int field151 = 4;

    @ObfuscatedName("m.g")
    public boolean field144;

    @ObfuscatedName("m.w")
    public boolean field145;

    @ObfuscatedName("m.e")
    public int field146 = 1;

    @ObfuscatedName("m.c")
    public LinkedHashMap field147 = new LinkedHashMap();

    public class9() {
        this.method126(true);
    }

    public class9(class119 arg0) {
        if (arg0 == null || arg0.field1974 == null) {
            this.method126(true);
        } else {
            int var2 = arg0.method2326();
            if (var2 >= 0 && var2 <= field151) {
                if (arg0.method2326() == 1) {
                    this.field144 = true;
                }
                if (var2 > 1) {
                    this.field145 = arg0.method2326() == 1;
                }
                if (var2 > 3) {
                    this.field146 = arg0.method2326();
                }
                if (var2 > 2) {
                    int var3 = arg0.method2326();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method2331();
                        int var6 = arg0.method2331();
                        this.field147.put(var5, var6);
                    }
                }
            } else {
                this.method126(true);
            }
        }
    }

    @ObfuscatedName("m.y(ZB)V")
    public void method126(boolean arg0) {
    }

    @ObfuscatedName("m.d(B)Ldd;")
    public class119 method114() {
        class119 var1 = new class119(100);
        var1.method2354(field151);
        var1.method2354(this.field144 ? 1 : 0);
        var1.method2354(this.field145 ? 1 : 0);
        var1.method2354(this.field146);
        var1.method2354(this.field147.size());
        Iterator var2 = this.field147.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method2423((Integer) var3.getKey());
            var1.method2423((Integer) var3.getValue());
        }
        return var1;
    }

    @ObfuscatedName("m.g(I)Lm;")
    public static class9 method118() {
        class227 var0 = null;
        class9 var1 = new class9();
        try {
            var0 = class149.method2114("", Statics.field1092.field2271, false);
            byte[] var2 = new byte[(int) var0.method3792()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var0.method3793(var2, var3, var2.length - var3);
                if (var4 == -1) {
                    throw new IOException();
                }
            }
            var1 = new class9(new class119(var2));
        } catch (Exception var8) {
        }
        try {
            if (var0 != null) {
                var0.method3788();
            }
        } catch (Exception var7) {
        }
        return var1;
    }

    @ObfuscatedName("w.w(I)V")
    public static void method38() {
        class227 var0 = null;
        try {
            var0 = class149.method2114("", Statics.field1092.field2271, true);
            class119 var1 = Statics.field1549.method114();
            var0.method3791(var1.field1974, 0, var1.field1973);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method3788();
            }
        } catch (Exception var4) {
        }
    }
}
