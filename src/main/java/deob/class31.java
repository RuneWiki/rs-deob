package deob;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("af")
public class class31 {

    @ObfuscatedName("af.u")
    public static int field696 = 4;

    @ObfuscatedName("af.i")
    public boolean field691;

    @ObfuscatedName("af.a")
    public boolean field693;

    @ObfuscatedName("af.f")
    public int field688 = 1;

    @ObfuscatedName("af.c")
    public LinkedHashMap field692 = new LinkedHashMap();

    public class31() {
        this.method661(true);
    }

    public class31(class154 arg0) {
        if (arg0 == null || arg0.field2078 == null) {
            this.method661(true);
        } else {
            int var2 = arg0.method2708();
            if (var2 >= 0 && var2 <= field696) {
                if (arg0.method2708() == 1) {
                    this.field691 = true;
                }
                if (var2 > 1) {
                    this.field693 = arg0.method2708() == 1;
                }
                if (var2 > 3) {
                    this.field688 = arg0.method2708();
                }
                if (var2 > 2) {
                    int var3 = arg0.method2708();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method2593();
                        int var6 = arg0.method2593();
                        this.field692.put(var5, var6);
                    }
                }
            } else {
                this.method661(true);
            }
        }
    }

    @ObfuscatedName("af.u(ZI)V")
    public void method661(boolean arg0) {
    }

    @ObfuscatedName("af.x(I)Len;")
    public class154 method666() {
        class154 var1 = new class154(100);
        var1.method2573(field696);
        var1.method2573(this.field691 ? 1 : 0);
        var1.method2573(this.field693 ? 1 : 0);
        var1.method2573(this.field688);
        var1.method2573(this.field692.size());
        Iterator var2 = this.field692.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method2576((Integer) var3.getKey());
            var1.method2576((Integer) var3.getValue());
        }
        return var1;
    }

    @ObfuscatedName("l.i(I)V")
    public static void method109() {
        class74 var0 = null;
        try {
            var0 = class105.method843("", Statics.field140.field2670, true);
            class154 var1 = Statics.field22.method666();
            var0.method1305(var1.field2078, 0, var1.field2073);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method1295();
            }
        } catch (Exception var4) {
        }
    }
}
