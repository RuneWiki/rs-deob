package deob;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("n")
public class class9 {

    @ObfuscatedName("n.j")
    public static int field142 = 3;

    @ObfuscatedName("n.y")
    public boolean field140;

    @ObfuscatedName("n.h")
    public boolean field147;

    @ObfuscatedName("n.r")
    public LinkedHashMap field139 = new LinkedHashMap();

    public class9() {
        this.method98(true);
    }

    public class9(class107 arg0) {
        if (arg0 == null || arg0.field1849 == null) {
            this.method98(true);
        } else {
            int var2 = arg0.method2130();
            if (var2 >= 0 && var2 <= field142) {
                if (arg0.method2130() == 1) {
                    this.field140 = true;
                }
                if (var2 > 1) {
                    this.field147 = arg0.method2130() == 1;
                }
                if (var2 > 2) {
                    int var3 = arg0.method2130();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method2135();
                        int var6 = arg0.method2135();
                        this.field139.put(var5, var6);
                    }
                }
            } else {
                this.method98(true);
            }
        }
    }

    @ObfuscatedName("n.j(ZI)V")
    public void method98(boolean arg0) {
    }

    @ObfuscatedName("n.z(I)Lde;")
    public class107 method101() {
        class107 var1 = new class107(100);
        var1.method2116(field142);
        var1.method2116(this.field140 ? 1 : 0);
        var1.method2116(this.field147 ? 1 : 0);
        var1.method2116(this.field139.size());
        Iterator var2 = this.field139.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method2119((Integer) var3.getKey());
            var1.method2119((Integer) var3.getValue());
        }
        return var1;
    }

    @ObfuscatedName("ak.y(B)V")
    public static void method552() {
        class193 var0 = null;
        try {
            var0 = class136.method3322("", Statics.field800.field2127, true);
            class107 var1 = Statics.field1921.method101();
            var0.method3433(var1.field1849, 0, var1.field1847);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method3434();
            }
        } catch (Exception var4) {
        }
    }
}
