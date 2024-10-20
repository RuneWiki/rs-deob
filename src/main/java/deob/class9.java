package deob;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("f")
public class class9 {

    @ObfuscatedName("f.n")
    public static int field128 = 4;

    @ObfuscatedName("f.i")
    public boolean field124;

    @ObfuscatedName("f.e")
    public boolean field125;

    @ObfuscatedName("f.h")
    public int field127 = 1;

    @ObfuscatedName("f.q")
    public LinkedHashMap field129 = new LinkedHashMap();

    public class9() {
        this.method91(true);
    }

    public class9(class111 arg0) {
        if (arg0 == null || arg0.field1886 == null) {
            this.method91(true);
        } else {
            int var2 = arg0.method2155();
            if (var2 >= 0 && var2 <= field128) {
                if (arg0.method2155() == 1) {
                    this.field124 = true;
                }
                if (var2 > 1) {
                    this.field125 = arg0.method2155() == 1;
                }
                if (var2 > 3) {
                    this.field127 = arg0.method2155();
                }
                if (var2 > 2) {
                    int var3 = arg0.method2155();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method2160();
                        int var6 = arg0.method2160();
                        this.field129.put(var5, var6);
                    }
                }
            } else {
                this.method91(true);
            }
        }
    }

    @ObfuscatedName("f.n(ZB)V")
    public void method91(boolean arg0) {
    }

    @ObfuscatedName("f.w(I)Ldo;")
    public class111 method86() {
        class111 var1 = new class111(100);
        var1.method2140(field128);
        var1.method2140(this.field124 ? 1 : 0);
        var1.method2140(this.field125 ? 1 : 0);
        var1.method2140(this.field127);
        var1.method2140(this.field129.size());
        Iterator var2 = this.field129.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method2143((Integer) var3.getKey());
            var1.method2143((Integer) var3.getValue());
        }
        return var1;
    }

    @ObfuscatedName("dw.i(B)Lf;")
    public static class9 method2091() {
        class218 var0 = null;
        class9 var1 = new class9();
        try {
            var0 = class141.method483("", Statics.field260.field2179, false);
            byte[] var2 = new byte[(int) var0.method3690()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var0.method3691(var2, var3, var2.length - var3);
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

    @ObfuscatedName("do.e(I)V")
    public static void method2360() {
        class218 var0 = null;
        try {
            var0 = class141.method483("", Statics.field260.field2179, true);
            class111 var1 = Statics.field1691.method86();
            var0.method3688(var1.field1886, 0, var1.field1888);
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
