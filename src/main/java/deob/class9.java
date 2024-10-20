package deob;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("l")
public class class9 {

    @ObfuscatedName("l.b")
    public static int field137 = 4;

    @ObfuscatedName("l.j")
    public boolean field133;

    @ObfuscatedName("l.d")
    public boolean field129;

    @ObfuscatedName("l.x")
    public int field132 = 1;

    @ObfuscatedName("l.y")
    public LinkedHashMap field134 = new LinkedHashMap();

    public class9() {
        this.method96(true);
    }

    public class9(class120 arg0) {
        if (arg0 == null || arg0.field1983 == null) {
            this.method96(true);
        } else {
            int var2 = arg0.method2344();
            if (var2 >= 0 && var2 <= field137) {
                if (arg0.method2344() == 1) {
                    this.field133 = true;
                }
                if (var2 > 1) {
                    this.field129 = arg0.method2344() == 1;
                }
                if (var2 > 3) {
                    this.field132 = arg0.method2344();
                }
                if (var2 > 2) {
                    int var3 = arg0.method2344();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method2349();
                        int var6 = arg0.method2349();
                        this.field134.put(var5, var6);
                    }
                }
            } else {
                this.method96(true);
            }
        }
    }

    @ObfuscatedName("l.b(ZI)V")
    public void method96(boolean arg0) {
    }

    @ObfuscatedName("l.g(I)Lds;")
    public class120 method115() {
        class120 var1 = new class120(100);
        var1.method2480(field137);
        var1.method2480(this.field133 ? 1 : 0);
        var1.method2480(this.field129 ? 1 : 0);
        var1.method2480(this.field132);
        var1.method2480(this.field134.size());
        Iterator var2 = this.field134.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method2332((Integer) var3.getKey());
            var1.method2332((Integer) var3.getValue());
        }
        return var1;
    }

    @ObfuscatedName("ak.j(I)Ll;")
    public static class9 method845() {
        class228 var0 = null;
        class9 var1 = new class9();
        try {
            var0 = class150.method2798("", Statics.field571.field2275, false);
            byte[] var2 = new byte[(int) var0.method3837()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var0.method3842(var2, var3, var2.length - var3);
                if (var4 == -1) {
                    throw new IOException();
                }
            }
            var1 = new class9(new class120(var2));
        } catch (Exception var8) {
        }
        try {
            if (var0 != null) {
                var0.method3840();
            }
        } catch (Exception var7) {
        }
        return var1;
    }

    @ObfuscatedName("l.d(I)V")
    public static void method95() {
        class228 var0 = null;
        try {
            var0 = class150.method2798("", Statics.field571.field2275, true);
            class120 var1 = Statics.field2638.method115();
            var0.method3851(var1.field1983, 0, var1.field1977);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method3840();
            }
        } catch (Exception var4) {
        }
    }
}
