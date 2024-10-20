package deob;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("v")
public class class9 {

    @ObfuscatedName("v.w")
    public static int field154 = 4;

    @ObfuscatedName("v.t")
    public boolean field165;

    @ObfuscatedName("v.p")
    public boolean field158;

    @ObfuscatedName("v.e")
    public int field156 = 1;

    @ObfuscatedName("v.y")
    public LinkedHashMap field157 = new LinkedHashMap();

    public class9() {
        this.method101(true);
    }

    public class9(class120 arg0) {
        if (arg0 == null || arg0.field2013 == null) {
            this.method101(true);
        } else {
            int var2 = arg0.method2363();
            if (var2 >= 0 && var2 <= field154) {
                if (arg0.method2363() == 1) {
                    this.field165 = true;
                }
                if (var2 > 1) {
                    this.field158 = arg0.method2363() == 1;
                }
                if (var2 > 3) {
                    this.field156 = arg0.method2363();
                }
                if (var2 > 2) {
                    int var3 = arg0.method2363();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method2368();
                        int var6 = arg0.method2368();
                        this.field157.put(var5, var6);
                    }
                }
            } else {
                this.method101(true);
            }
        }
    }

    @ObfuscatedName("v.w(ZS)V")
    public void method101(boolean arg0) {
    }

    @ObfuscatedName("v.x(I)Lde;")
    public class120 method103() {
        class120 var1 = new class120(100);
        var1.method2430(field154);
        var1.method2430(this.field165 ? 1 : 0);
        var1.method2430(this.field158 ? 1 : 0);
        var1.method2430(this.field156);
        var1.method2430(this.field157.size());
        Iterator var2 = this.field157.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method2351((Integer) var3.getKey());
            var1.method2351((Integer) var3.getValue());
        }
        return var1;
    }

    @ObfuscatedName("s.t(S)V")
    public static void method151() {
        class228 var0 = null;
        try {
            var0 = class150.method2162("", Statics.field271.field2312, true);
            class120 var1 = Statics.field990.method103();
            var0.method3887(var1.field2013, 0, var1.field2012);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method3874();
            }
        } catch (Exception var4) {
        }
    }
}
