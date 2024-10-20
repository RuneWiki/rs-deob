package deob;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("u")
public class class9 {

    @ObfuscatedName("u.x")
    public static int field138 = 3;

    @ObfuscatedName("u.m")
    public boolean field128;

    @ObfuscatedName("u.e")
    public boolean field129;

    @ObfuscatedName("u.h")
    public LinkedHashMap field130 = new LinkedHashMap();

    public class9() {
        this.method86(true);
    }

    public class9(class108 arg0) {
        if (arg0 == null || arg0.field1839 == null) {
            this.method86(true);
        } else {
            int var2 = arg0.method2299();
            if (var2 >= 0 && var2 <= field138) {
                if (arg0.method2299() == 1) {
                    this.field128 = true;
                }
                if (var2 > 1) {
                    this.field129 = arg0.method2299() == 1;
                }
                if (var2 > 2) {
                    int var3 = arg0.method2299();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method2132();
                        int var6 = arg0.method2132();
                        this.field130.put(var5, var6);
                    }
                }
            } else {
                this.method86(true);
            }
        }
    }

    @ObfuscatedName("u.x(ZI)V")
    public void method86(boolean arg0) {
    }

    @ObfuscatedName("u.v(I)Ldm;")
    public class108 method90() {
        class108 var1 = new class108(100);
        var1.method2113(field138);
        var1.method2113(this.field128 ? 1 : 0);
        var1.method2113(this.field129 ? 1 : 0);
        var1.method2113(this.field130.size());
        Iterator var2 = this.field130.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method2233((Integer) var3.getKey());
            var1.method2233((Integer) var3.getValue());
        }
        return var1;
    }

    @ObfuscatedName("p.m(I)V")
    public static void method62() {
        class207 var0 = null;
        try {
            var0 = class138.method603("", Statics.field242.field2134, true);
            class108 var1 = Statics.field140.method90();
            var0.method3559(var1.field1839, 0, var1.field1841);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method3560();
            }
        } catch (Exception var4) {
        }
    }
}
