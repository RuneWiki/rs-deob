package deob;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("cd")
public class class83 {

    @ObfuscatedName("cd.h")
    public static int field1056 = 7;

    @ObfuscatedName("cd.x")
    public boolean field1053;

    @ObfuscatedName("cd.w")
    public boolean field1064;

    @ObfuscatedName("cd.t")
    public int field1055 = 1;

    @ObfuscatedName("cd.j")
    public String field1051 = null;

    @ObfuscatedName("cd.n")
    public boolean field1054 = false;

    @ObfuscatedName("cd.p")
    public double field1058 = 0.8D;

    @ObfuscatedName("cd.l")
    public int field1057 = 127;

    @ObfuscatedName("cd.z")
    public int field1060 = 127;

    @ObfuscatedName("cd.u")
    public int field1061 = 127;

    @ObfuscatedName("cd.e")
    public LinkedHashMap field1059 = new LinkedHashMap();

    public class83() {
        this.method1760(true);
    }

    public class83(class311 arg0) {
        if (arg0 == null || arg0.field3753 == null) {
            this.method1760(true);
        } else {
            int var2 = arg0.method5274();
            if (var2 >= 0 && var2 <= field1056) {
                if (arg0.method5274() == 1) {
                    this.field1053 = true;
                }
                if (var2 > 1) {
                    this.field1064 = arg0.method5274() == 1;
                }
                if (var2 > 3) {
                    this.field1055 = arg0.method5274();
                }
                if (var2 > 2) {
                    int var3 = arg0.method5274();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method5120();
                        int var6 = arg0.method5120();
                        this.field1059.put(var5, var6);
                    }
                }
                if (var2 > 4) {
                    this.field1051 = arg0.method5209();
                }
                if (var2 > 5) {
                    this.field1054 = arg0.method5333();
                }
                if (var2 > 6) {
                    this.field1058 = (double) arg0.method5274() / 100.0D;
                    this.field1057 = arg0.method5274();
                    this.field1060 = arg0.method5274();
                    this.field1061 = arg0.method5274();
                }
            } else {
                this.method1760(true);
            }
        }
    }

    @ObfuscatedName("cd.h(ZI)V")
    public void method1760(boolean arg0) {
    }

    @ObfuscatedName("cd.v(B)Lkj;")
    public class311 method1761() {
        class311 var1 = new class311(100);
        var1.method5095(field1056);
        var1.method5095(this.field1053 ? 1 : 0);
        var1.method5095(this.field1064 ? 1 : 0);
        var1.method5095(this.field1055);
        var1.method5095(this.field1059.size());
        Iterator var2 = this.field1059.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method5123((Integer) var3.getKey());
            var1.method5123((Integer) var3.getValue());
        }
        var1.method5105(this.field1051 == null ? "" : this.field1051);
        var1.method5104(this.field1054);
        var1.method5095((int) (this.field1058 * 100.0D));
        var1.method5095(this.field1057);
        var1.method5095(this.field1060);
        var1.method5095(this.field1061);
        return var1;
    }

    @ObfuscatedName("y.x(I)V")
    public static void method165() {
        class354 var0 = null;
        try {
            var0 = Statics.method529("", Statics.field1175.field3142, true);
            class311 var1 = Statics.field3618.method1761();
            var0.method6131(var1.field3753, 0, var1.field3752);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method6141(true);
            }
        } catch (Exception var4) {
        }
    }
}
