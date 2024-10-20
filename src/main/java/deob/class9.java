package deob;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("y")
public class class9 {

    @ObfuscatedName("y.n")
    public static int field151 = 4;

    @ObfuscatedName("y.c")
    public boolean field156;

    @ObfuscatedName("y.l")
    public boolean field146;

    @ObfuscatedName("y.r")
    public int field147 = 1;

    @ObfuscatedName("y.u")
    public LinkedHashMap field157 = new LinkedHashMap();

    public class9() {
        this.method110(true);
    }

    public class9(class119 arg0) {
        if (arg0 == null || arg0.field1987 == null) {
            this.method110(true);
        } else {
            int var2 = arg0.method2360();
            if (var2 >= 0 && var2 <= field151) {
                if (arg0.method2360() == 1) {
                    this.field156 = true;
                }
                if (var2 > 1) {
                    this.field146 = arg0.method2360() == 1;
                }
                if (var2 > 3) {
                    this.field147 = arg0.method2360();
                }
                if (var2 > 2) {
                    int var3 = arg0.method2360();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method2365();
                        int var6 = arg0.method2365();
                        this.field157.put(var5, var6);
                    }
                }
            } else {
                this.method110(true);
            }
        }
    }

    @ObfuscatedName("y.n(ZI)V")
    public void method110(boolean arg0) {
    }

    @ObfuscatedName("y.q(I)Ldc;")
    public class119 method116() {
        class119 var1 = new class119(100);
        var1.method2345(field151);
        var1.method2345(this.field156 ? 1 : 0);
        var1.method2345(this.field146 ? 1 : 0);
        var1.method2345(this.field147);
        var1.method2345(this.field157.size());
        Iterator var2 = this.field157.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method2348((Integer) var3.getKey());
            var1.method2348((Integer) var3.getValue());
        }
        return var1;
    }
}
