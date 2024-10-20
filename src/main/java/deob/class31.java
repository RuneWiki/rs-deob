package deob;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("ao")
public class class31 {

    @ObfuscatedName("ao.s")
    public static int field696 = 4;

    @ObfuscatedName("ao.f")
    public boolean field700;

    @ObfuscatedName("ao.h")
    public boolean field703;

    @ObfuscatedName("ao.a")
    public int field697 = 1;

    @ObfuscatedName("ao.g")
    public LinkedHashMap field698 = new LinkedHashMap();

    public class31() {
        this.method635(true);
    }

    public class31(class154 arg0) {
        if (arg0 == null || arg0.field2100 == null) {
            this.method635(true);
        } else {
            int var2 = arg0.method2545();
            if (var2 >= 0 && var2 <= field696) {
                if (arg0.method2545() == 1) {
                    this.field700 = true;
                }
                if (var2 > 1) {
                    this.field703 = arg0.method2545() == 1;
                }
                if (var2 > 3) {
                    this.field697 = arg0.method2545();
                }
                if (var2 > 2) {
                    int var3 = arg0.method2545();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method2550();
                        int var6 = arg0.method2550();
                        this.field698.put(var5, var6);
                    }
                }
            } else {
                this.method635(true);
            }
        }
    }

    @ObfuscatedName("ao.s(ZI)V")
    public void method635(boolean arg0) {
    }

    @ObfuscatedName("ao.c(I)Lea;")
    public class154 method639() {
        class154 var1 = new class154(100);
        var1.method2531(field696);
        var1.method2531(this.field700 ? 1 : 0);
        var1.method2531(this.field703 ? 1 : 0);
        var1.method2531(this.field697);
        var1.method2531(this.field698.size());
        Iterator var2 = this.field698.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method2534((Integer) var3.getKey());
            var1.method2534((Integer) var3.getValue());
        }
        return var1;
    }

    @ObfuscatedName("fz.f(I)V")
    public static void method2869() {
        class74 var0 = null;
        try {
            var0 = class105.method665("", Statics.field2730.field2689, true);
            class154 var1 = Statics.field795.method639();
            var0.method1321(var1.field2100, 0, var1.field2098);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method1303();
            }
        } catch (Exception var4) {
        }
    }
}
