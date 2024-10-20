package deob;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("bx")
public class class74 {

    @ObfuscatedName("bx.s")
    public static int field1028 = 6;

    @ObfuscatedName("bx.i")
    public boolean field1030;

    @ObfuscatedName("bx.k")
    public boolean field1037;

    @ObfuscatedName("bx.u")
    public int field1032 = 1;

    @ObfuscatedName("bx.n")
    public String field1033 = null;

    @ObfuscatedName("bx.t")
    public boolean field1034 = false;

    @ObfuscatedName("bx.q")
    public LinkedHashMap field1031 = new LinkedHashMap();

    public class74() {
        this.method1658(true);
    }

    public class74(class300 arg0) {
        if (arg0 == null || arg0.field3701 == null) {
            this.method1658(true);
        } else {
            int var2 = arg0.method5179();
            if (var2 >= 0 && var2 <= field1028) {
                if (arg0.method5179() == 1) {
                    this.field1030 = true;
                }
                if (var2 > 1) {
                    this.field1037 = arg0.method5179() == 1;
                }
                if (var2 > 3) {
                    this.field1032 = arg0.method5179();
                }
                if (var2 > 2) {
                    int var3 = arg0.method5179();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method5056();
                        int var6 = arg0.method5056();
                        this.field1031.put(var5, var6);
                    }
                }
                if (var2 > 4) {
                    this.field1033 = arg0.method5059();
                }
                if (var2 > 5) {
                    this.field1034 = arg0.method5102();
                }
            } else {
                this.method1658(true);
            }
        }
    }

    @ObfuscatedName("bx.s(ZI)V")
    public void method1658(boolean arg0) {
    }

    @ObfuscatedName("bx.j(I)Lky;")
    public class300 method1659() {
        class300 var1 = new class300(100);
        var1.method5083(field1028);
        var1.method5083(this.field1030 ? 1 : 0);
        var1.method5083(this.field1037 ? 1 : 0);
        var1.method5083(this.field1032);
        var1.method5083(this.field1031.size());
        Iterator var2 = this.field1031.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method5166((Integer) var3.getKey());
            var1.method5166((Integer) var3.getValue());
        }
        var1.method5043(this.field1033 == null ? "" : this.field1033);
        var1.method5042(this.field1034);
        return var1;
    }

    @ObfuscatedName("r.i(I)V")
    public static void method135() {
        class343 var0 = null;
        try {
            var0 = class168.method3196("", Statics.field167.field3089, true);
            class300 var1 = Statics.field69.method1659();
            var0.method6043(var1.field3701, 0, var1.field3704);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method6039(true);
            }
        } catch (Exception var4) {
        }
    }
}
