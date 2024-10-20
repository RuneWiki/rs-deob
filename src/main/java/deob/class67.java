package deob;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("bx")
public class class67 {

    @ObfuscatedName("bx.z")
    public static int field965 = 6;

    @ObfuscatedName("bx.s")
    public boolean field961;

    @ObfuscatedName("bx.l")
    public boolean field959;

    @ObfuscatedName("bx.u")
    public int field958 = 1;

    @ObfuscatedName("bx.q")
    public String field960 = null;

    @ObfuscatedName("bx.k")
    public boolean field963 = false;

    @ObfuscatedName("bx.i")
    public LinkedHashMap field964 = new LinkedHashMap();

    public class67() {
        this.method1506(true);
    }

    public class67(class183 arg0) {
        if (arg0 == null || arg0.field2339 == null) {
            this.method1506(true);
        } else {
            int var2 = arg0.method3247();
            if (var2 >= 0 && var2 <= field965) {
                if (arg0.method3247() == 1) {
                    this.field961 = true;
                }
                if (var2 > 1) {
                    this.field959 = arg0.method3247() == 1;
                }
                if (var2 > 3) {
                    this.field958 = arg0.method3247();
                }
                if (var2 > 2) {
                    int var3 = arg0.method3247();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method3374();
                        int var6 = arg0.method3374();
                        this.field964.put(var5, var6);
                    }
                }
                if (var2 > 4) {
                    this.field960 = arg0.method3455();
                }
                if (var2 > 5) {
                    this.field963 = arg0.method3258();
                }
            } else {
                this.method1506(true);
            }
        }
    }

    @ObfuscatedName("bx.z(ZI)V")
    public void method1506(boolean arg0) {
    }

    @ObfuscatedName("bx.w(I)Lgk;")
    public class183 method1502() {
        class183 var1 = new class183(100);
        var1.method3235(field965);
        var1.method3235(this.field961 ? 1 : 0);
        var1.method3235(this.field959 ? 1 : 0);
        var1.method3235(this.field958);
        var1.method3235(this.field964.size());
        Iterator var2 = this.field964.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method3410((Integer) var3.getKey());
            var1.method3410((Integer) var3.getValue());
        }
        var1.method3402(this.field960 == null ? "" : this.field960);
        var1.method3469(this.field963);
        return var1;
    }

    @ObfuscatedName("cb.s(S)Lbx;")
    public static class67 method1734() {
        class111 var0 = null;
        class67 var1 = new class67();
        try {
            var0 = class156.method264("", Statics.field1456.field3145, false);
            byte[] var2 = new byte[(int) var0.method2305()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var0.method2306(var2, var3, var2.length - var3);
                if (var4 == -1) {
                    throw new IOException();
                }
            }
            var1 = new class67(new class183(var2));
        } catch (Exception var8) {
        }
        try {
            if (var0 != null) {
                var0.method2303();
            }
        } catch (Exception var7) {
        }
        return var1;
    }

    @ObfuscatedName("bi.l(I)V")
    public static void method939() {
        class111 var0 = null;
        try {
            var0 = class156.method264("", Statics.field1456.field3145, true);
            class183 var1 = Statics.field62.method1502();
            var0.method2302(var1.field2339, 0, var1.field2340);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method2304(true);
            }
        } catch (Exception var4) {
        }
    }
}
