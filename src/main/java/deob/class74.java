package deob;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("bf")
public class class74 {

    @ObfuscatedName("bf.f")
    public static int field1032 = 6;

    @ObfuscatedName("bf.y")
    public boolean field1028;

    @ObfuscatedName("bf.w")
    public boolean field1029;

    @ObfuscatedName("bf.p")
    public int field1038 = 1;

    @ObfuscatedName("bf.b")
    public String field1031 = null;

    @ObfuscatedName("bf.e")
    public boolean field1030 = false;

    @ObfuscatedName("bf.x")
    public LinkedHashMap field1033 = new LinkedHashMap();

    public class74() {
        this.method1667(true);
    }

    public class74(class300 arg0) {
        if (arg0 == null || arg0.field3704 == null) {
            this.method1667(true);
        } else {
            int var2 = arg0.method5110();
            if (var2 >= 0 && var2 <= field1032) {
                if (arg0.method5110() == 1) {
                    this.field1028 = true;
                }
                if (var2 > 1) {
                    this.field1029 = arg0.method5110() == 1;
                }
                if (var2 > 3) {
                    this.field1038 = arg0.method5110();
                }
                if (var2 > 2) {
                    int var3 = arg0.method5110();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method5192();
                        int var6 = arg0.method5192();
                        this.field1033.put(var5, var6);
                    }
                }
                if (var2 > 4) {
                    this.field1031 = arg0.method5118();
                }
                if (var2 > 5) {
                    this.field1030 = arg0.method5291();
                }
            } else {
                this.method1667(true);
            }
        }
    }

    @ObfuscatedName("bf.f(ZS)V")
    public void method1667(boolean arg0) {
    }

    @ObfuscatedName("bf.i(I)Lkq;")
    public class300 method1665() {
        class300 var1 = new class300(100);
        var1.method5094(field1032);
        var1.method5094(this.field1028 ? 1 : 0);
        var1.method5094(this.field1029 ? 1 : 0);
        var1.method5094(this.field1038);
        var1.method5094(this.field1033.size());
        Iterator var2 = this.field1033.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method5097((Integer) var3.getKey());
            var1.method5097((Integer) var3.getValue());
        }
        var1.method5101(this.field1031 == null ? "" : this.field1031);
        var1.method5100(this.field1030);
        return var1;
    }

    @ObfuscatedName("bi.y(I)V")
    public static void method1733() {
        class343 var0 = null;
        try {
            var0 = class168.method2049("", Statics.field285.field3084, true);
            class300 var1 = Statics.field1071.method1665();
            var0.method6095(var1.field3704, 0, var1.field3703);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method6096(true);
            }
        } catch (Exception var4) {
        }
    }
}
