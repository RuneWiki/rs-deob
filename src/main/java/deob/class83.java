package deob;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("cf")
public class class83 {

    @ObfuscatedName("cf.n")
    public static int field1069 = 7;

    @ObfuscatedName("cf.d")
    public boolean field1068;

    @ObfuscatedName("cf.c")
    public boolean field1077;

    @ObfuscatedName("cf.y")
    public int field1075 = 1;

    @ObfuscatedName("cf.h")
    public String field1076 = null;

    @ObfuscatedName("cf.z")
    public boolean field1072 = false;

    @ObfuscatedName("cf.e")
    public double field1073 = 0.8D;

    @ObfuscatedName("cf.q")
    public int field1074 = 127;

    @ObfuscatedName("cf.l")
    public int field1066 = 127;

    @ObfuscatedName("cf.s")
    public int field1071 = 127;

    @ObfuscatedName("cf.b")
    public LinkedHashMap field1070 = new LinkedHashMap();

    public class83() {
        this.method1801(true);
    }

    public class83(class311 arg0) {
        if (arg0 == null || arg0.field3746 == null) {
            this.method1801(true);
        } else {
            int var2 = arg0.method5310();
            if (var2 >= 0 && var2 <= field1069) {
                if (arg0.method5310() == 1) {
                    this.field1068 = true;
                }
                if (var2 > 1) {
                    this.field1077 = arg0.method5310() == 1;
                }
                if (var2 > 3) {
                    this.field1075 = arg0.method5310();
                }
                if (var2 > 2) {
                    int var3 = arg0.method5310();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method5455();
                        int var6 = arg0.method5455();
                        this.field1070.put(var5, var6);
                    }
                }
                if (var2 > 4) {
                    this.field1076 = arg0.method5253();
                }
                if (var2 > 5) {
                    this.field1072 = arg0.method5252();
                }
                if (var2 > 6) {
                    this.field1073 = (double) arg0.method5310() / 100.0D;
                    this.field1074 = arg0.method5310();
                    this.field1066 = arg0.method5310();
                    this.field1071 = arg0.method5310();
                }
            } else {
                this.method1801(true);
            }
        }
    }

    @ObfuscatedName("cf.n(ZI)V")
    public void method1801(boolean arg0) {
    }

    @ObfuscatedName("cf.v(I)Lkx;")
    public class311 method1807() {
        class311 var1 = new class311(100);
        var1.method5279(field1069);
        var1.method5279(this.field1068 ? 1 : 0);
        var1.method5279(this.field1077 ? 1 : 0);
        var1.method5279(this.field1075);
        var1.method5279(this.field1070.size());
        Iterator var2 = this.field1070.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method5231((Integer) var3.getKey());
            var1.method5231((Integer) var3.getValue());
        }
        var1.method5257(this.field1076 == null ? "" : this.field1076);
        var1.method5234(this.field1072);
        var1.method5279((int) (this.field1073 * 100.0D));
        var1.method5279(this.field1074);
        var1.method5279(this.field1066);
        var1.method5279(this.field1071);
        return var1;
    }

    @ObfuscatedName("r.d(I)V")
    public static void method213() {
        class354 var0 = null;
        try {
            var0 = class177.method327("", Statics.field3700.field3155, true);
            class311 var1 = Statics.field191.method1807();
            var0.method6266(var1.field3746, 0, var1.field3747);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method6268(true);
            }
        } catch (Exception var4) {
        }
    }
}
