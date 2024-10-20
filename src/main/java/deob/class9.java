package deob;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("t")
public class class9 {

    @ObfuscatedName("t.l")
    public static int field142 = 4;

    @ObfuscatedName("t.q")
    public boolean field139;

    @ObfuscatedName("t.o")
    public boolean field140;

    @ObfuscatedName("t.g")
    public int field144 = 1;

    @ObfuscatedName("t.m")
    public LinkedHashMap field137 = new LinkedHashMap();

    public class9() {
        this.method101(true);
    }

    public class9(class119 arg0) {
        if (arg0 == null || arg0.field1986 == null) {
            this.method101(true);
        } else {
            int var2 = arg0.method2388();
            if (var2 >= 0 && var2 <= field142) {
                if (arg0.method2388() == 1) {
                    this.field139 = true;
                }
                if (var2 > 1) {
                    this.field140 = arg0.method2388() == 1;
                }
                if (var2 > 3) {
                    this.field144 = arg0.method2388();
                }
                if (var2 > 2) {
                    int var3 = arg0.method2388();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method2393();
                        int var6 = arg0.method2393();
                        this.field137.put(var5, var6);
                    }
                }
            } else {
                this.method101(true);
            }
        }
    }

    @ObfuscatedName("t.l(ZI)V")
    public void method101(boolean arg0) {
    }

    @ObfuscatedName("t.e(B)Ldl;")
    public class119 method115() {
        class119 var1 = new class119(100);
        var1.method2503(field142);
        var1.method2503(this.field139 ? 1 : 0);
        var1.method2503(this.field140 ? 1 : 0);
        var1.method2503(this.field144);
        var1.method2503(this.field137.size());
        Iterator var2 = this.field137.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method2376((Integer) var3.getKey());
            var1.method2376((Integer) var3.getValue());
        }
        return var1;
    }

    @ObfuscatedName("ca.q(I)Lt;")
    public static class9 method2164() {
        class227 var0 = null;
        class9 var1 = new class9();
        try {
            var0 = class149.method1596("", Statics.field2613.field2277, false);
            byte[] var2 = new byte[(int) var0.method3816()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var0.method3812(var2, var3, var2.length - var3);
                if (var4 == -1) {
                    throw new IOException();
                }
            }
            var1 = new class9(new class119(var2));
        } catch (Exception var8) {
        }
        try {
            if (var0 != null) {
                var0.method3817();
            }
        } catch (Exception var7) {
        }
        return var1;
    }

    @ObfuscatedName("hy.o(I)V")
    public static void method3716() {
        class227 var0 = null;
        try {
            var0 = class149.method1596("", Statics.field2613.field2277, true);
            class119 var1 = Statics.field1371.method115();
            var0.method3829(var1.field1986, 0, var1.field1988);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method3817();
            }
        } catch (Exception var4) {
        }
    }
}
