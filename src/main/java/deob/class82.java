package deob;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("cn")
public class class82 {

    @ObfuscatedName("cn.j")
    public static int field1313 = 4;

    @ObfuscatedName("cn.f")
    public boolean field1315;

    @ObfuscatedName("cn.p")
    public boolean field1310;

    @ObfuscatedName("cn.x")
    public int field1311 = 1;

    @ObfuscatedName("cn.g")
    public LinkedHashMap field1312 = new LinkedHashMap();

    public class82() {
        this.method1450(true);
    }

    public class82(class175 arg0) {
        if (arg0 == null || arg0.field2390 == null) {
            this.method1450(true);
        } else {
            int var2 = arg0.method2903();
            if (var2 >= 0 && var2 <= field1313) {
                if (arg0.method2903() == 1) {
                    this.field1315 = true;
                }
                if (var2 > 1) {
                    this.field1310 = arg0.method2903() == 1;
                }
                if (var2 > 3) {
                    this.field1311 = arg0.method2903();
                }
                if (var2 > 2) {
                    int var3 = arg0.method2903();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method2908();
                        int var6 = arg0.method2908();
                        this.field1312.put(var5, var6);
                    }
                }
            } else {
                this.method1450(true);
            }
        }
    }

    @ObfuscatedName("cn.j(ZI)V")
    public void method1450(boolean arg0) {
    }

    @ObfuscatedName("cn.h(I)Lfb;")
    public class175 method1452() {
        class175 var1 = new class175(100);
        var1.method2888(field1313);
        var1.method2888(this.field1315 ? 1 : 0);
        var1.method2888(this.field1310 ? 1 : 0);
        var1.method2888(this.field1311);
        var1.method2888(this.field1312.size());
        Iterator var2 = this.field1312.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method2891((Integer) var3.getKey());
            var1.method2891((Integer) var3.getValue());
        }
        return var1;
    }

    @ObfuscatedName("aj.f(I)V")
    public static void method333() {
        class126 var0 = null;
        try {
            var0 = class157.method53("", Statics.field506.field3184, true);
            class175 var1 = Statics.field22.method1452();
            var0.method2159(var1.field2390, 0, var1.field2394);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method2161();
            }
        } catch (Exception var4) {
        }
    }
}
