package deob;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("ag")
public class class31 {

    @ObfuscatedName("ag.f")
    public static int field721 = 4;

    @ObfuscatedName("ag.u")
    public boolean field717;

    @ObfuscatedName("ag.h")
    public boolean field720;

    @ObfuscatedName("ag.r")
    public int field715 = 1;

    @ObfuscatedName("ag.o")
    public LinkedHashMap field716 = new LinkedHashMap();

    public class31() {
        this.method636(true);
    }

    public class31(class154 arg0) {
        if (arg0 == null || arg0.field2114 == null) {
            this.method636(true);
        } else {
            int var2 = arg0.method2666();
            if (var2 >= 0 && var2 <= field721) {
                if (arg0.method2666() == 1) {
                    this.field717 = true;
                }
                if (var2 > 1) {
                    this.field720 = arg0.method2666() == 1;
                }
                if (var2 > 3) {
                    this.field715 = arg0.method2666();
                }
                if (var2 > 2) {
                    int var3 = arg0.method2666();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method2695();
                        int var6 = arg0.method2695();
                        this.field716.put(var5, var6);
                    }
                }
            } else {
                this.method636(true);
            }
        }
    }

    @ObfuscatedName("ag.f(ZI)V")
    public void method636(boolean arg0) {
    }

    @ObfuscatedName("ag.i(B)Leo;")
    public class154 method647() {
        class154 var1 = new class154(100);
        var1.method2651(field721);
        var1.method2651(this.field717 ? 1 : 0);
        var1.method2651(this.field720 ? 1 : 0);
        var1.method2651(this.field715);
        var1.method2651(this.field716.size());
        Iterator var2 = this.field716.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method2654((Integer) var3.getKey());
            var1.method2654((Integer) var3.getValue());
        }
        return var1;
    }

    @ObfuscatedName("ec.r(S)V")
    public static void method2638() {
        class74 var0 = null;
        try {
            var0 = class105.method849("", Statics.field305.field2710, true);
            class154 var1 = Statics.field2059.method647();
            var0.method1360(var1.field2114, 0, var1.field2111);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method1361();
            }
        } catch (Exception var4) {
        }
    }
}
