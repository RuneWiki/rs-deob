package deob;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("ae")
public class class31 {

    @ObfuscatedName("ae.x")
    public static int field694 = 4;

    @ObfuscatedName("ae.g")
    public boolean field691;

    @ObfuscatedName("ae.v")
    public boolean field692;

    @ObfuscatedName("ae.y")
    public int field698 = 1;

    @ObfuscatedName("ae.p")
    public LinkedHashMap field693 = new LinkedHashMap();

    public class31() {
        this.method693(true);
    }

    public class31(class154 arg0) {
        if (arg0 == null || arg0.field2086 == null) {
            this.method693(true);
        } else {
            int var2 = arg0.method2878();
            if (var2 >= 0 && var2 <= field694) {
                if (arg0.method2878() == 1) {
                    this.field691 = true;
                }
                if (var2 > 1) {
                    this.field692 = arg0.method2878() == 1;
                }
                if (var2 > 3) {
                    this.field698 = arg0.method2878();
                }
                if (var2 > 2) {
                    int var3 = arg0.method2878();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method2803();
                        int var6 = arg0.method2803();
                        this.field693.put(var5, var6);
                    }
                }
            } else {
                this.method693(true);
            }
        }
    }

    @ObfuscatedName("ae.x(ZB)V")
    public void method693(boolean arg0) {
    }

    @ObfuscatedName("ae.n(I)Leq;")
    public class154 method703() {
        class154 var1 = new class154(100);
        var1.method2688(field694);
        var1.method2688(this.field691 ? 1 : 0);
        var1.method2688(this.field692 ? 1 : 0);
        var1.method2688(this.field698);
        var1.method2688(this.field693.size());
        Iterator var2 = this.field693.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method2689((Integer) var3.getKey());
            var1.method2689((Integer) var3.getValue());
        }
        return var1;
    }

    @ObfuscatedName("eb.g(I)V")
    public static void method2626() {
        class74 var0 = null;
        try {
            var0 = class105.method3399("", Statics.field313.field2688, true);
            class154 var1 = Statics.field2945.method703();
            var0.method1417(var1.field2086, 0, var1.field2087);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method1410();
            }
        } catch (Exception var4) {
        }
    }
}
