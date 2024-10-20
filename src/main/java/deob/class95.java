package deob;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

@ObfuscatedName("ch")
public class class95 {

    @ObfuscatedName("ch.m")
    public boolean field1289;

    @ObfuscatedName("ch.q")
    public boolean field1293 = false;

    @ObfuscatedName("ch.f")
    public boolean field1294;

    @ObfuscatedName("ch.r")
    public boolean field1295 = false;

    @ObfuscatedName("ch.u")
    public int field1297;

    @ObfuscatedName("ch.b")
    public double field1304 = 0.8D;

    @ObfuscatedName("ch.j")
    public int field1298 = 127;

    @ObfuscatedName("ch.g")
    public int field1299 = 127;

    @ObfuscatedName("ch.i")
    public int field1300 = 127;

    @ObfuscatedName("ch.o")
    public int field1301 = -1;

    @ObfuscatedName("ch.n")
    public String field1302 = null;

    @ObfuscatedName("ch.k")
    public int field1303 = 1;

    @ObfuscatedName("ch.a")
    public final Map field1296 = new LinkedHashMap();

    public class95() {
        this.method2282(true);
    }

    public class95(class467 arg0) {
        if (arg0 == null || arg0.field4917 == null) {
            this.method2282(true);
        } else {
            int var2 = arg0.method7792();
            if (var2 >= 0 && var2 <= 10) {
                if (arg0.method7792() == 1) {
                    this.field1289 = true;
                }
                if (var2 > 1) {
                    this.field1294 = arg0.method7792() == 1;
                }
                if (var2 > 3) {
                    this.field1303 = arg0.method7792();
                }
                if (var2 > 2) {
                    int var3 = arg0.method7792();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method7946();
                        int var6 = arg0.method7946();
                        this.field1296.put(var5, var6);
                    }
                }
                if (var2 > 4) {
                    this.field1302 = arg0.method7800();
                }
                if (var2 > 5) {
                    this.field1293 = arg0.method7799();
                }
                if (var2 > 6) {
                    this.field1304 = (double) arg0.method7792() / 100.0D;
                    this.field1298 = arg0.method7792();
                    this.field1299 = arg0.method7792();
                    this.field1300 = arg0.method7792();
                }
                if (var2 > 7) {
                    this.field1301 = arg0.method7792();
                }
                if (var2 > 8) {
                    this.field1295 = arg0.method7792() == 1;
                }
                if (var2 > 9) {
                    this.field1297 = arg0.method7946();
                }
            } else {
                this.method2282(true);
            }
        }
    }

    @ObfuscatedName("ch.h(ZB)V")
    public void method2282(boolean arg0) {
    }

    @ObfuscatedName("ch.e(I)Lqy;")
    public class467 method2283() {
        class467 var1 = new class467(417, true);
        var1.method7789(10);
        var1.method7789(this.field1289 ? 1 : 0);
        var1.method7789(this.field1294 ? 1 : 0);
        var1.method7789(this.field1303);
        var1.method7789(this.field1296.size());
        Iterator var2 = this.field1296.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method7778((Integer) var3.getKey());
            var1.method7778((Integer) var3.getValue());
        }
        var1.method7782(this.field1302 == null ? "" : this.field1302);
        var1.method7781(this.field1293);
        var1.method7789((int) (this.field1304 * 100.0D));
        var1.method7789(this.field1298);
        var1.method7789(this.field1299);
        var1.method7789(this.field1300);
        var1.method7789(this.field1301);
        var1.method7789(this.field1295 ? 1 : 0);
        var1.method7778(this.field1297);
        return var1;
    }

    @ObfuscatedName("ls.v(S)Lch;")
    public static class95 method5773() {
        class449 var0 = null;
        class95 var1 = new class95();
        try {
            var0 = class166.method2159("", Statics.field3303.field3800, false);
            byte[] var2 = new byte[(int) var0.method7572()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var0.method7566(var2, var3, var2.length - var3);
                if (var4 == -1) {
                    throw new IOException();
                }
            }
            var1 = new class95(new class467(var2));
        } catch (Exception var8) {
        }
        try {
            if (var0 != null) {
                var0.method7563();
            }
        } catch (Exception var7) {
        }
        return var1;
    }

    @ObfuscatedName("he.x(I)V")
    public static void method3923() {
        class449 var0 = null;
        try {
            var0 = class166.method2159("", Statics.field3303.field3800, true);
            class467 var1 = Statics.field2126.method2283();
            var0.method7562(var1.field4917, 0, var1.field4915);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method7564(true);
            }
        } catch (Exception var4) {
        }
    }

    @ObfuscatedName("ch.m(ZI)V")
    public void method2359(boolean arg0) {
        this.field1289 = arg0;
        method3923();
    }

    @ObfuscatedName("ch.q(I)Z")
    public boolean method2285() {
        return this.field1289;
    }

    @ObfuscatedName("ch.f(ZB)V")
    public void method2334(boolean arg0) {
        this.field1293 = arg0;
        method3923();
    }

    @ObfuscatedName("ch.r(I)Z")
    public boolean method2286() {
        return this.field1293;
    }

    @ObfuscatedName("ch.u(ZB)V")
    public void method2321(boolean arg0) {
        this.field1294 = arg0;
        method3923();
    }

    @ObfuscatedName("ch.b(B)Z")
    public boolean method2301() {
        return this.field1294;
    }

    @ObfuscatedName("ch.j(ZS)V")
    public void method2343(boolean arg0) {
        this.field1295 = arg0;
        method3923();
    }

    @ObfuscatedName("ch.g(I)V")
    public void method2306() {
        this.method2343(!this.field1295);
    }

    @ObfuscatedName("ch.i(I)Z")
    public boolean method2292() {
        return this.field1295;
    }

    @ObfuscatedName("ch.o(IB)V")
    public void method2293(int arg0) {
        this.field1297 = arg0;
        method3923();
    }

    @ObfuscatedName("ch.n(I)I")
    public int method2294() {
        return this.field1297;
    }

    @ObfuscatedName("ch.k(D)V")
    public void method2348(double arg0) {
        this.field1304 = arg0;
        method3923();
    }

    @ObfuscatedName("ch.a(I)D")
    public double method2295() {
        return this.field1304;
    }

    @ObfuscatedName("ch.s(IS)V")
    public void method2287(int arg0) {
        this.field1298 = arg0;
        method3923();
    }

    @ObfuscatedName("ch.l(S)I")
    public int method2298() {
        return this.field1298;
    }

    @ObfuscatedName("ch.t(IB)V")
    public void method2344(int arg0) {
        this.field1299 = arg0;
        method3923();
    }

    @ObfuscatedName("ch.c(I)I")
    public int method2299() {
        return this.field1299;
    }

    @ObfuscatedName("ch.p(II)V")
    public void method2300(int arg0) {
        this.field1300 = arg0;
        method3923();
    }

    @ObfuscatedName("ch.d(I)I")
    public int method2379() {
        return this.field1300;
    }

    @ObfuscatedName("ch.y(Ljava/lang/String;I)V")
    public void method2302(String arg0) {
        this.field1302 = arg0;
        method3923();
    }

    @ObfuscatedName("ch.z(B)Ljava/lang/String;")
    public String method2303() {
        return this.field1302;
    }

    @ObfuscatedName("ch.w(II)V")
    public void method2304(int arg0) {
        this.field1301 = arg0;
        method3923();
    }

    @ObfuscatedName("ch.as(I)I")
    public int method2297() {
        return this.field1301;
    }

    @ObfuscatedName("ch.ad(IS)V")
    public void method2333(int arg0) {
        this.field1303 = arg0;
        method3923();
    }

    @ObfuscatedName("ch.ao(I)I")
    public int method2307() {
        return this.field1303;
    }

    @ObfuscatedName("ch.am(Ljava/lang/String;II)V")
    public void method2308(String arg0, int arg1) {
        int var3 = this.method2311(arg0);
        if (this.field1296.size() >= 10 && !this.field1296.containsKey(var3)) {
            Iterator var4 = this.field1296.entrySet().iterator();
            var4.next();
            var4.remove();
        }
        this.field1296.put(var3, arg1);
        method3923();
    }

    @ObfuscatedName("ch.av(Ljava/lang/String;I)Z")
    public boolean method2309(String arg0) {
        int var2 = this.method2311(arg0);
        return this.field1296.containsKey(var2);
    }

    @ObfuscatedName("ch.au(Ljava/lang/String;I)I")
    public int method2310(String arg0) {
        int var2 = this.method2311(arg0);
        return this.field1296.containsKey(var2) ? (Integer) this.field1296.get(var2) : 0;
    }

    @ObfuscatedName("ch.ar(Ljava/lang/String;B)I")
    public int method2311(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = var2.length();
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            var4 = (var4 << 5) - var4 + var2.charAt(var5);
        }
        return var4;
    }
}
