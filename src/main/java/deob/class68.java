package deob;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("bc")
public class class68 {

    @ObfuscatedName("bc.f")
    public static int field990 = 6;

    @ObfuscatedName("bc.e")
    public boolean field989;

    @ObfuscatedName("bc.b")
    public boolean field991;

    @ObfuscatedName("bc.l")
    public int field995 = 1;

    @ObfuscatedName("bc.w")
    public String field992 = null;

    @ObfuscatedName("bc.d")
    public boolean field993 = false;

    @ObfuscatedName("bc.n")
    public LinkedHashMap field994 = new LinkedHashMap();

    public class68() {
        this.method1528(true);
    }

    public class68(class185 arg0) {
        if (arg0 == null || arg0.field2399 == null) {
            this.method1528(true);
        } else {
            int var2 = arg0.method3323();
            if (var2 >= 0 && var2 <= field990) {
                if (arg0.method3323() == 1) {
                    this.field989 = true;
                }
                if (var2 > 1) {
                    this.field991 = arg0.method3323() == 1;
                }
                if (var2 > 3) {
                    this.field995 = arg0.method3323();
                }
                if (var2 > 2) {
                    int var3 = arg0.method3323();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method3328();
                        int var6 = arg0.method3328();
                        this.field994.put(var5, var6);
                    }
                }
                if (var2 > 4) {
                    this.field992 = arg0.method3379();
                }
                if (var2 > 5) {
                    this.field993 = arg0.method3330();
                }
            } else {
                this.method1528(true);
            }
        }
    }

    @ObfuscatedName("bc.f(ZI)V")
    public void method1528(boolean arg0) {
    }

    @ObfuscatedName("bc.h(I)Lgx;")
    public class185 method1530() {
        class185 var1 = new class185(100);
        var1.method3531(field990);
        var1.method3531(this.field989 ? 1 : 0);
        var1.method3531(this.field991 ? 1 : 0);
        var1.method3531(this.field995);
        var1.method3531(this.field994.size());
        Iterator var2 = this.field994.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method3528((Integer) var3.getKey());
            var1.method3528((Integer) var3.getValue());
        }
        var1.method3314(this.field992 == null ? "" : this.field992);
        var1.method3313(this.field993);
        return var1;
    }

    @ObfuscatedName("ap.b(I)V")
    public static void method601() {
        class113 var0 = null;
        try {
            var0 = class158.method212("", Statics.field553.field3197, true);
            class185 var1 = Statics.field1159.method1530();
            var0.method2347(var1.field2399, 0, var1.field2397);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method2329(true);
            }
        } catch (Exception var4) {
        }
    }
}
