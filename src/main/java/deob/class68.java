package deob;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("bj")
public class class68 {

    @ObfuscatedName("bj.g")
    public static int field1031 = 6;

    @ObfuscatedName("bj.e")
    public boolean field1030;

    @ObfuscatedName("bj.q")
    public boolean field1036;

    @ObfuscatedName("bj.c")
    public int field1032 = 1;

    @ObfuscatedName("bj.l")
    public String field1035 = null;

    @ObfuscatedName("bj.b")
    public boolean field1034 = false;

    @ObfuscatedName("bj.w")
    public LinkedHashMap field1029 = new LinkedHashMap();

    public class68() {
        this.method1632(true);
    }

    public class68(class185 arg0) {
        if (arg0 == null || arg0.field2405 == null) {
            this.method1632(true);
        } else {
            int var2 = arg0.method3679();
            if (var2 >= 0 && var2 <= field1031) {
                if (arg0.method3679() == 1) {
                    this.field1030 = true;
                }
                if (var2 > 1) {
                    this.field1036 = arg0.method3679() == 1;
                }
                if (var2 > 3) {
                    this.field1032 = arg0.method3679();
                }
                if (var2 > 2) {
                    int var3 = arg0.method3679();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method3588();
                        int var6 = arg0.method3588();
                        this.field1029.put(var5, var6);
                    }
                }
                if (var2 > 4) {
                    this.field1035 = arg0.method3473();
                }
                if (var2 > 5) {
                    this.field1034 = arg0.method3472();
                }
            } else {
                this.method1632(true);
            }
        }
    }

    @ObfuscatedName("bj.g(ZB)V")
    public void method1632(boolean arg0) {
    }

    @ObfuscatedName("bj.r(I)Lgl;")
    public class185 method1633() {
        class185 var1 = new class185(100);
        var1.method3501(field1031);
        var1.method3501(this.field1030 ? 1 : 0);
        var1.method3501(this.field1036 ? 1 : 0);
        var1.method3501(this.field1032);
        var1.method3501(this.field1029.size());
        Iterator var2 = this.field1029.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method3617((Integer) var3.getKey());
            var1.method3617((Integer) var3.getValue());
        }
        var1.method3585(this.field1035 == null ? "" : this.field1035);
        var1.method3514(this.field1034);
        return var1;
    }

    @ObfuscatedName("bk.e(I)V")
    public static void method1123() {
        class113 var0 = null;
        try {
            var0 = class158.method86("", Statics.field647.field3203, true);
            class185 var1 = Statics.field436.method1633();
            var0.method2514(var1.field2405, 0, var1.field2406);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method2538(true);
            }
        } catch (Exception var4) {
        }
    }
}
