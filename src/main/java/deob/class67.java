package deob;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("bt")
public class class67 {

    @ObfuscatedName("bt.w")
    public static int field987 = 6;

    @ObfuscatedName("bt.q")
    public boolean field982;

    @ObfuscatedName("bt.b")
    public boolean field983;

    @ObfuscatedName("bt.f")
    public int field980 = 1;

    @ObfuscatedName("bt.n")
    public String field981 = null;

    @ObfuscatedName("bt.h")
    public boolean field978 = false;

    @ObfuscatedName("bt.x")
    public LinkedHashMap field976 = new LinkedHashMap();

    public class67() {
        this.method1543(true);
    }

    public class67(class183 arg0) {
        if (arg0 == null || arg0.field2366 == null) {
            this.method1543(true);
        } else {
            int var2 = arg0.method3436();
            if (var2 >= 0 && var2 <= field987) {
                if (arg0.method3436() == 1) {
                    this.field982 = true;
                }
                if (var2 > 1) {
                    this.field983 = arg0.method3436() == 1;
                }
                if (var2 > 3) {
                    this.field980 = arg0.method3436();
                }
                if (var2 > 2) {
                    int var3 = arg0.method3436();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method3267();
                        int var6 = arg0.method3267();
                        this.field976.put(var5, var6);
                    }
                }
                if (var2 > 4) {
                    this.field981 = arg0.method3270();
                }
                if (var2 > 5) {
                    this.field978 = arg0.method3350();
                }
            } else {
                this.method1543(true);
            }
        }
    }

    @ObfuscatedName("bt.w(ZB)V")
    public void method1543(boolean arg0) {
    }

    @ObfuscatedName("bt.m(B)Lgy;")
    public class183 method1534() {
        class183 var1 = new class183(100);
        var1.method3246(field987);
        var1.method3246(this.field982 ? 1 : 0);
        var1.method3246(this.field983 ? 1 : 0);
        var1.method3246(this.field980);
        var1.method3246(this.field976.size());
        Iterator var2 = this.field976.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method3249((Integer) var3.getKey());
            var1.method3249((Integer) var3.getValue());
        }
        var1.method3243(this.field981 == null ? "" : this.field981);
        var1.method3252(this.field978);
        return var1;
    }

    @ObfuscatedName("jy.q(I)V")
    public static void method4621() {
        class111 var0 = null;
        try {
            var0 = class156.method4229("", Statics.field2266.field3161, true);
            class183 var1 = Statics.field469.method1534();
            var0.method2343(var1.field2366, 0, var1.field2360);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method2341(true);
            }
        } catch (Exception var4) {
        }
    }
}
