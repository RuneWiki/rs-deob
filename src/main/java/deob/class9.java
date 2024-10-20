package deob;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("j")
public class class9 {

    @ObfuscatedName("j.t")
    public static int field128 = 4;

    @ObfuscatedName("j.p")
    public boolean field124;

    @ObfuscatedName("j.e")
    public boolean field125;

    @ObfuscatedName("j.i")
    public int field134 = 1;

    @ObfuscatedName("j.o")
    public LinkedHashMap field127 = new LinkedHashMap();

    public class9() {
        this.method103(true);
    }

    public class9(class111 arg0) {
        if (arg0 == null || arg0.field1869 == null) {
            this.method103(true);
        } else {
            int var2 = arg0.method2172();
            if (var2 >= 0 && var2 <= field128) {
                if (arg0.method2172() == 1) {
                    this.field124 = true;
                }
                if (var2 > 1) {
                    this.field125 = arg0.method2172() == 1;
                }
                if (var2 > 3) {
                    this.field134 = arg0.method2172();
                }
                if (var2 > 2) {
                    int var3 = arg0.method2172();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method2177();
                        int var6 = arg0.method2177();
                        this.field127.put(var5, var6);
                    }
                }
            } else {
                this.method103(true);
            }
        }
    }

    @ObfuscatedName("j.t(ZB)V")
    public void method103(boolean arg0) {
    }

    @ObfuscatedName("j.b(I)Ldc;")
    public class111 method104() {
        class111 var1 = new class111(100);
        var1.method2158(field128);
        var1.method2158(this.field124 ? 1 : 0);
        var1.method2158(this.field125 ? 1 : 0);
        var1.method2158(this.field134);
        var1.method2158(this.field127.size());
        Iterator var2 = this.field127.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method2174((Integer) var3.getKey());
            var1.method2174((Integer) var3.getValue());
        }
        return var1;
    }

    @ObfuscatedName("aj.p(I)Lj;")
    public static class9 method820() {
        class218 var0 = null;
        class9 var1 = new class9();
        try {
            var0 = class141.method614("", Statics.field230.field2161, false);
            byte[] var2 = new byte[(int) var0.method3690()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var0.method3702(var2, var3, var2.length - var3);
                if (var4 == -1) {
                    throw new IOException();
                }
            }
            var1 = new class9(new class111(var2));
        } catch (Exception var8) {
        }
        try {
            if (var0 != null) {
                var0.method3689();
            }
        } catch (Exception var7) {
        }
        return var1;
    }

    @ObfuscatedName("dv.e(B)V")
    public static void method2116() {
        class218 var0 = null;
        try {
            var0 = class141.method614("", Statics.field230.field2161, true);
            class111 var1 = Statics.field2092.method104();
            var0.method3692(var1.field1869, 0, var1.field1867);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method3689();
            }
        } catch (Exception var4) {
        }
    }
}
