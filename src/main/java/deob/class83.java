package deob;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("cp")
public class class83 {

    @ObfuscatedName("cp.f")
    public static int field1086 = 6;

    @ObfuscatedName("cp.l")
    public boolean field1084;

    @ObfuscatedName("cp.m")
    public boolean field1082;

    @ObfuscatedName("cp.z")
    public int field1091 = 1;

    @ObfuscatedName("cp.q")
    public String field1087 = null;

    @ObfuscatedName("cp.k")
    public boolean field1088 = false;

    @ObfuscatedName("cp.c")
    public LinkedHashMap field1089 = new LinkedHashMap();

    public class83() {
        this.method1765(true);
    }

    public class83(class311 arg0) {
        if (arg0 == null || arg0.field3742 == null) {
            this.method1765(true);
        } else {
            int var2 = arg0.method5276();
            if (var2 >= 0 && var2 <= field1086) {
                if (arg0.method5276() == 1) {
                    this.field1084 = true;
                }
                if (var2 > 1) {
                    this.field1082 = arg0.method5276() == 1;
                }
                if (var2 > 3) {
                    this.field1091 = arg0.method5276();
                }
                if (var2 > 2) {
                    int var3 = arg0.method5276();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method5330();
                        int var6 = arg0.method5330();
                        this.field1089.put(var5, var6);
                    }
                }
                if (var2 > 4) {
                    this.field1087 = arg0.method5188();
                }
                if (var2 > 5) {
                    this.field1088 = arg0.method5187();
                }
            } else {
                this.method1765(true);
            }
        }
    }

    @ObfuscatedName("cp.f(ZB)V")
    public void method1765(boolean arg0) {
    }

    @ObfuscatedName("cp.b(I)Lkb;")
    public class311 method1764() {
        class311 var1 = new class311(100);
        var1.method5203(field1086);
        var1.method5203(this.field1084 ? 1 : 0);
        var1.method5203(this.field1082 ? 1 : 0);
        var1.method5203(this.field1091);
        var1.method5203(this.field1089.size());
        Iterator var2 = this.field1089.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method5166((Integer) var3.getKey());
            var1.method5166((Integer) var3.getValue());
        }
        var1.method5355(this.field1087 == null ? "" : this.field1087);
        var1.method5169(this.field1088);
        return var1;
    }

    @ObfuscatedName("eo.l(B)V")
    public static void method2738() {
        class354 var0 = null;
        try {
            var0 = class177.method592("", Statics.field59.field3142, true);
            class311 var1 = Statics.field108.method1764();
            var0.method6199(var1.field3742, 0, var1.field3741);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method6182(true);
            }
        } catch (Exception var4) {
        }
    }
}
