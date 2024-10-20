package deob;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("l")
public class class9 {

    @ObfuscatedName("l.f")
    public static int field149 = 4;

    @ObfuscatedName("l.q")
    public boolean field153;

    @ObfuscatedName("l.g")
    public boolean field147;

    @ObfuscatedName("l.m")
    public int field150 = 1;

    @ObfuscatedName("l.t")
    public LinkedHashMap field151 = new LinkedHashMap();

    public class9() {
        this.method106(true);
    }

    public class9(class119 arg0) {
        if (arg0 == null || arg0.field2000 == null) {
            this.method106(true);
        } else {
            int var2 = arg0.method2363();
            if (var2 >= 0 && var2 <= field149) {
                if (arg0.method2363() == 1) {
                    this.field153 = true;
                }
                if (var2 > 1) {
                    this.field147 = arg0.method2363() == 1;
                }
                if (var2 > 3) {
                    this.field150 = arg0.method2363();
                }
                if (var2 > 2) {
                    int var3 = arg0.method2363();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method2368();
                        int var6 = arg0.method2368();
                        this.field151.put(var5, var6);
                    }
                }
            } else {
                this.method106(true);
            }
        }
    }

    @ObfuscatedName("l.f(ZI)V")
    public void method106(boolean arg0) {
    }

    @ObfuscatedName("l.s(I)Ldn;")
    public class119 method107() {
        class119 var1 = new class119(100);
        var1.method2426(field149);
        var1.method2426(this.field153 ? 1 : 0);
        var1.method2426(this.field147 ? 1 : 0);
        var1.method2426(this.field150);
        var1.method2426(this.field151.size());
        Iterator var2 = this.field151.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method2351((Integer) var3.getKey());
            var1.method2351((Integer) var3.getValue());
        }
        return var1;
    }

    @ObfuscatedName("cj.q(I)Ll;")
    public static class9 method2060() {
        class227 var0 = null;
        class9 var1 = new class9();
        try {
            var0 = class149.method697("", Statics.field1974.field2270, false);
            byte[] var2 = new byte[(int) var0.method3858()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var0.method3857(var2, var3, var2.length - var3);
                if (var4 == -1) {
                    throw new IOException();
                }
            }
            var1 = new class9(new class119(var2));
        } catch (Exception var8) {
        }
        try {
            if (var0 != null) {
                var0.method3859();
            }
        } catch (Exception var7) {
        }
        return var1;
    }

    @ObfuscatedName("cy.g(I)V")
    public static void method1958() {
        class227 var0 = null;
        try {
            var0 = class149.method697("", Statics.field1974.field2270, true);
            class119 var1 = Statics.field2060.method107();
            var0.method3846(var1.field2000, 0, var1.field1994);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method3859();
            }
        } catch (Exception var4) {
        }
    }
}
