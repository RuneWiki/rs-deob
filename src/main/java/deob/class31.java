package deob;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("aw")
public class class31 {

    @ObfuscatedName("aw.b")
    public static int field691 = 4;

    @ObfuscatedName("aw.i")
    public boolean field690;

    @ObfuscatedName("aw.t")
    public boolean field693;

    @ObfuscatedName("aw.k")
    public int field694 = 1;

    @ObfuscatedName("aw.h")
    public LinkedHashMap field689 = new LinkedHashMap();

    public class31() {
        this.method680(true);
    }

    public class31(class154 arg0) {
        if (arg0 == null || arg0.field2083 == null) {
            this.method680(true);
        } else {
            int var2 = arg0.method2678();
            if (var2 >= 0 && var2 <= field691) {
                if (arg0.method2678() == 1) {
                    this.field690 = true;
                }
                if (var2 > 1) {
                    this.field693 = arg0.method2678() == 1;
                }
                if (var2 > 3) {
                    this.field694 = arg0.method2678();
                }
                if (var2 > 2) {
                    int var3 = arg0.method2678();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method2683();
                        int var6 = arg0.method2683();
                        this.field689.put(var5, var6);
                    }
                }
            } else {
                this.method680(true);
            }
        }
    }

    @ObfuscatedName("aw.b(ZI)V")
    public void method680(boolean arg0) {
    }

    @ObfuscatedName("aw.l(B)Leg;")
    public class154 method681() {
        class154 var1 = new class154(100);
        var1.method2832(field691);
        var1.method2832(this.field690 ? 1 : 0);
        var1.method2832(this.field693 ? 1 : 0);
        var1.method2832(this.field694);
        var1.method2832(this.field689.size());
        Iterator var2 = this.field689.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method2666((Integer) var3.getKey());
            var1.method2666((Integer) var3.getValue());
        }
        return var1;
    }

    @ObfuscatedName("av.i(B)Law;")
    public static class31 method931() {
        class74 var0 = null;
        class31 var1 = new class31();
        try {
            var0 = class105.method1160("", Statics.field414.field2684, false);
            byte[] var2 = new byte[(int) var0.method1393()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var0.method1392(var2, var3, var2.length - var3);
                if (var4 == -1) {
                    throw new IOException();
                }
            }
            var1 = new class31(new class154(var2));
        } catch (Exception var8) {
        }
        try {
            if (var0 != null) {
                var0.method1394();
            }
        } catch (Exception var7) {
        }
        return var1;
    }

    @ObfuscatedName("cc.t(I)V")
    public static void method1879() {
        class74 var0 = null;
        try {
            var0 = class105.method1160("", Statics.field414.field2684, true);
            class154 var1 = Statics.field1552.method681();
            var0.method1391(var1.field2083, 0, var1.field2085);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method1394();
            }
        } catch (Exception var4) {
        }
    }
}
