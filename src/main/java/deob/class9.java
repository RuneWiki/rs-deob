package deob;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("n")
public class class9 {

    @ObfuscatedName("n.j")
    public static int field147 = 4;

    @ObfuscatedName("n.m")
    public boolean field146;

    @ObfuscatedName("n.z")
    public boolean field144;

    @ObfuscatedName("n.x")
    public int field145 = 1;

    @ObfuscatedName("n.e")
    public LinkedHashMap field143 = new LinkedHashMap();

    public class9() {
        this.method120(true);
    }

    public class9(class120 arg0) {
        if (arg0 == null || arg0.field1974 == null) {
            this.method120(true);
        } else {
            int var2 = arg0.method2361();
            if (var2 >= 0 && var2 <= field147) {
                if (arg0.method2361() == 1) {
                    this.field146 = true;
                }
                if (var2 > 1) {
                    this.field144 = arg0.method2361() == 1;
                }
                if (var2 > 3) {
                    this.field145 = arg0.method2361();
                }
                if (var2 > 2) {
                    int var3 = arg0.method2361();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method2366();
                        int var6 = arg0.method2366();
                        this.field143.put(var5, var6);
                    }
                }
            } else {
                this.method120(true);
            }
        }
    }

    @ObfuscatedName("n.j(ZI)V")
    public void method120(boolean arg0) {
    }

    @ObfuscatedName("n.h(I)Ldx;")
    public class120 method109() {
        class120 var1 = new class120(100);
        var1.method2364(field147);
        var1.method2364(this.field146 ? 1 : 0);
        var1.method2364(this.field144 ? 1 : 0);
        var1.method2364(this.field145);
        var1.method2364(this.field143.size());
        Iterator var2 = this.field143.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method2349((Integer) var3.getKey());
            var1.method2349((Integer) var3.getValue());
        }
        return var1;
    }

    @ObfuscatedName("aw.m(I)V")
    public static void method933() {
        class228 var0 = null;
        try {
            var0 = Statics.method2233("", Statics.field1361.field2274, true);
            class120 var1 = Statics.field76.method109();
            var0.method3845(var1.field1974, 0, var1.field1972);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method3836();
            }
        } catch (Exception var4) {
        }
    }
}
