package deob;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("cn")
public class class90 {

    @ObfuscatedName("cn.s")
    public static int field1237 = 10;

    @ObfuscatedName("cn.w")
    public boolean field1233;

    @ObfuscatedName("cn.v")
    public boolean field1234 = false;

    @ObfuscatedName("cn.c")
    public boolean field1245;

    @ObfuscatedName("cn.q")
    public boolean field1236 = false;

    @ObfuscatedName("cn.i")
    public int field1241;

    @ObfuscatedName("cn.k")
    public double field1238 = 0.8D;

    @ObfuscatedName("cn.o")
    public int field1239 = 127;

    @ObfuscatedName("cn.n")
    public int field1240 = 127;

    @ObfuscatedName("cn.d")
    public int field1248 = 127;

    @ObfuscatedName("cn.a")
    public int field1242 = -1;

    @ObfuscatedName("cn.m")
    public String field1243 = null;

    @ObfuscatedName("cn.u")
    public int field1244 = 1;

    @ObfuscatedName("cn.l")
    public LinkedHashMap field1231 = new LinkedHashMap();

    public class90() {
        this.method2103(true);
    }

    public class90(class444 arg0) {
        if (arg0 == null || arg0.field4707 == null) {
            this.method2103(true);
        } else {
            int var2 = arg0.method6929();
            if (var2 >= 0 && var2 <= field1237) {
                if (arg0.method6929() == 1) {
                    this.field1233 = true;
                }
                if (var2 > 1) {
                    this.field1245 = arg0.method6929() == 1;
                }
                if (var2 > 3) {
                    this.field1244 = arg0.method6929();
                }
                if (var2 > 2) {
                    int var3 = arg0.method6929();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method6934();
                        int var6 = arg0.method6934();
                        this.field1231.put(var5, var6);
                    }
                }
                if (var2 > 4) {
                    this.field1243 = arg0.method6938();
                }
                if (var2 > 5) {
                    this.field1234 = arg0.method6937();
                }
                if (var2 > 6) {
                    this.field1238 = (double) arg0.method6929() / 100.0D;
                    this.field1239 = arg0.method6929();
                    this.field1240 = arg0.method6929();
                    this.field1248 = arg0.method6929();
                }
                if (var2 > 7) {
                    this.field1242 = arg0.method6929();
                }
                if (var2 > 8) {
                    this.field1236 = arg0.method6929() == 1;
                }
                if (var2 > 9) {
                    this.field1241 = arg0.method6934();
                }
            } else {
                this.method2103(true);
            }
        }
    }

    @ObfuscatedName("cn.s(ZI)V")
    public void method2103(boolean arg0) {
    }

    @ObfuscatedName("cn.h(I)Lqr;")
    public class444 method2096() {
        class444 var1 = new class444(100);
        var1.method6912(field1237);
        var1.method6912(this.field1233 ? 1 : 0);
        var1.method6912(this.field1245 ? 1 : 0);
        var1.method6912(this.field1244);
        var1.method6912(this.field1231.size());
        Iterator var2 = this.field1231.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method6915((Integer) var3.getKey());
            var1.method6915((Integer) var3.getValue());
        }
        var1.method6950(this.field1243 == null ? "" : this.field1243);
        var1.method6918(this.field1234);
        var1.method6912((int) (this.field1238 * 100.0D));
        var1.method6912(this.field1239);
        var1.method6912(this.field1240);
        var1.method6912(this.field1248);
        var1.method6912(this.field1242);
        var1.method6912(this.field1236 ? 1 : 0);
        var1.method6915(this.field1241);
        return var1;
    }

    @ObfuscatedName("ch.w(I)V")
    public static void method1972() {
        class426 var0 = null;
        try {
            var0 = class158.method6804("", Statics.field112.field3590, true);
            class444 var1 = Statics.field4303.method2096();
            var0.method6715(var1.field4707, 0, var1.field4708);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method6717(true);
            }
        } catch (Exception var4) {
        }
    }

    @ObfuscatedName("cn.v(ZI)V")
    public void method2123(boolean arg0) {
        this.field1233 = arg0;
        method1972();
    }

    @ObfuscatedName("cn.c(I)Z")
    public boolean method2091() {
        return this.field1233;
    }

    @ObfuscatedName("cn.q(ZI)V")
    public void method2092(boolean arg0) {
        this.field1234 = arg0;
        method1972();
    }

    @ObfuscatedName("cn.i(I)Z")
    public boolean method2093() {
        return this.field1234;
    }

    @ObfuscatedName("cn.k(ZI)V")
    public void method2094(boolean arg0) {
        this.field1245 = arg0;
        method1972();
    }

    @ObfuscatedName("cn.o(I)Z")
    public boolean method2095() {
        return this.field1245;
    }

    @ObfuscatedName("cn.n(ZB)V")
    public void method2158(boolean arg0) {
        this.field1236 = arg0;
        method1972();
    }

    @ObfuscatedName("cn.d(I)V")
    public void method2137() {
        this.method2158(!this.field1236);
    }

    @ObfuscatedName("cn.a(I)Z")
    public boolean method2098() {
        return this.field1236;
    }

    @ObfuscatedName("cn.m(II)V")
    public void method2099(int arg0) {
        this.field1241 = arg0;
        method1972();
    }

    @ObfuscatedName("cn.u(I)I")
    public int method2100() {
        return this.field1241;
    }

    @ObfuscatedName("cn.l(D)V")
    public void method2116(double arg0) {
        this.field1238 = arg0;
        method1972();
    }

    @ObfuscatedName("cn.z(S)D")
    public double method2102() {
        return this.field1238;
    }

    @ObfuscatedName("cn.r(IB)V")
    public void method2106(int arg0) {
        this.field1239 = arg0;
        method1972();
    }

    @ObfuscatedName("cn.y(I)I")
    public int method2104() {
        return this.field1239;
    }

    @ObfuscatedName("cn.p(II)V")
    public void method2167(int arg0) {
        this.field1240 = arg0;
        method1972();
    }

    @ObfuscatedName("cn.e(I)I")
    public int method2086() {
        return this.field1240;
    }

    @ObfuscatedName("cn.b(IB)V")
    public void method2107(int arg0) {
        this.field1248 = arg0;
        method1972();
    }

    @ObfuscatedName("cn.x(I)I")
    public int method2108() {
        return this.field1248;
    }

    @ObfuscatedName("cn.f(Ljava/lang/String;I)V")
    public void method2150(String arg0) {
        this.field1243 = arg0;
        method1972();
    }

    @ObfuscatedName("cn.t(I)Ljava/lang/String;")
    public String method2109() {
        return this.field1243;
    }

    @ObfuscatedName("cn.j(II)V")
    public void method2110(int arg0) {
        this.field1242 = arg0;
        method1972();
    }

    @ObfuscatedName("cn.g(B)I")
    public int method2111() {
        return this.field1242;
    }

    @ObfuscatedName("cn.ar(II)V")
    public void method2126(int arg0) {
        this.field1244 = arg0;
        method1972();
    }

    @ObfuscatedName("cn.aq(I)I")
    public int method2113() {
        return this.field1244;
    }
}
