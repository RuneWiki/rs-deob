package deob;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("k")
public class class9 {

    @ObfuscatedName("k.s")
    public static int field131 = 4;

    @ObfuscatedName("k.t")
    public boolean field124;

    @ObfuscatedName("k.y")
    public boolean field125;

    @ObfuscatedName("k.p")
    public int field126 = 1;

    @ObfuscatedName("k.g")
    public LinkedHashMap field127 = new LinkedHashMap();

    public class9() {
        this.method108(true);
    }

    public class9(class123 arg0) {
        if (arg0 == null || arg0.field2033 == null) {
            this.method108(true);
        } else {
            int var2 = arg0.method2363();
            if (var2 >= 0 && var2 <= field131) {
                if (arg0.method2363() == 1) {
                    this.field124 = true;
                }
                if (var2 > 1) {
                    this.field125 = arg0.method2363() == 1;
                }
                if (var2 > 3) {
                    this.field126 = arg0.method2363();
                }
                if (var2 > 2) {
                    int var3 = arg0.method2363();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method2408();
                        int var6 = arg0.method2408();
                        this.field127.put(var5, var6);
                    }
                }
            } else {
                this.method108(true);
            }
        }
    }

    @ObfuscatedName("k.s(ZB)V")
    public void method108(boolean arg0) {
    }

    @ObfuscatedName("k.z(B)Ldy;")
    public class123 method106() {
        class123 var1 = new class123(100);
        var1.method2349(field131);
        var1.method2349(this.field124 ? 1 : 0);
        var1.method2349(this.field125 ? 1 : 0);
        var1.method2349(this.field126);
        var1.method2349(this.field127.size());
        Iterator var2 = this.field127.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method2524((Integer) var3.getKey());
            var1.method2524((Integer) var3.getValue());
        }
        return var1;
    }

    @ObfuscatedName("df.y(I)V")
    public static void method2692() {
        class231 var0 = null;
        try {
            var0 = class153.method930("", Statics.field467.field2331, true);
            class123 var1 = Statics.field985.method106();
            var0.method3894(var1.field2033, 0, var1.field2028);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method3898();
            }
        } catch (Exception var4) {
        }
    }
}
