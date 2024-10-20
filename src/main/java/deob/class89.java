package deob;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("cs")
public class class89 {

    @ObfuscatedName("cs.i")
    public static int field1189 = 8;

    @ObfuscatedName("cs.s")
    public boolean field1184;

    @ObfuscatedName("cs.a")
    public boolean field1186;

    @ObfuscatedName("cs.o")
    public int field1194 = 1;

    @ObfuscatedName("cs.g")
    public String field1188 = null;

    @ObfuscatedName("cs.e")
    public boolean field1185 = false;

    @ObfuscatedName("cs.p")
    public double field1190 = 0.8D;

    @ObfuscatedName("cs.j")
    public int field1191 = 127;

    @ObfuscatedName("cs.b")
    public int field1192 = 127;

    @ObfuscatedName("cs.x")
    public int field1187 = 127;

    @ObfuscatedName("cs.y")
    public int field1183 = -1;

    @ObfuscatedName("cs.k")
    public LinkedHashMap field1195 = new LinkedHashMap();

    public class89() {
        this.method2115(true);
    }

    public class89(class401 arg0) {
        if (arg0 == null || arg0.field4302 == null) {
            this.method2115(true);
        } else {
            int var2 = arg0.method6240();
            if (var2 >= 0 && var2 <= field1189) {
                if (arg0.method6240() == 1) {
                    this.field1184 = true;
                }
                if (var2 > 1) {
                    this.field1186 = arg0.method6240() == 1;
                }
                if (var2 > 3) {
                    this.field1194 = arg0.method6240();
                }
                if (var2 > 2) {
                    int var3 = arg0.method6240();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method6245();
                        int var6 = arg0.method6245();
                        this.field1195.put(var5, var6);
                    }
                }
                if (var2 > 4) {
                    this.field1188 = arg0.method6369();
                }
                if (var2 > 5) {
                    this.field1185 = arg0.method6429();
                }
                if (var2 > 6) {
                    this.field1190 = (double) arg0.method6240() / 100.0D;
                    this.field1191 = arg0.method6240();
                    this.field1192 = arg0.method6240();
                    this.field1187 = arg0.method6240();
                }
                if (var2 > 7) {
                    this.field1183 = arg0.method6240();
                }
            } else {
                this.method2115(true);
            }
        }
    }

    @ObfuscatedName("cs.i(ZI)V")
    public void method2115(boolean arg0) {
    }

    @ObfuscatedName("cs.w(I)Lop;")
    public class401 method2110() {
        class401 var1 = new class401(100);
        var1.method6223(field1189);
        var1.method6223(this.field1184 ? 1 : 0);
        var1.method6223(this.field1186 ? 1 : 0);
        var1.method6223(this.field1194);
        var1.method6223(this.field1195.size());
        Iterator var2 = this.field1195.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method6292((Integer) var3.getKey());
            var1.method6292((Integer) var3.getValue());
        }
        var1.method6230(this.field1188 == null ? "" : this.field1188);
        var1.method6262(this.field1185);
        var1.method6223((int) (this.field1190 * 100.0D));
        var1.method6223(this.field1191);
        var1.method6223(this.field1192);
        var1.method6223(this.field1187);
        var1.method6223(this.field1183);
        return var1;
    }

    @ObfuscatedName("bc.s(I)V")
    public static void method1836() {
        class385 var0 = null;
        try {
            var0 = class144.method359("", Statics.field1987.field3298, true);
            class401 var1 = Statics.field4363.method2110();
            var0.method6061(var1.field4302, 0, var1.field4300);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method6063(true);
            }
        } catch (Exception var4) {
        }
    }
}
