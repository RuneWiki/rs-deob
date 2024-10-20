package deob;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

@ObfuscatedName("da")
public class class99 {

    @ObfuscatedName("da.as")
    public boolean field1302;

    @ObfuscatedName("da.aj")
    public boolean field1292 = false;

    @ObfuscatedName("da.ag")
    public boolean field1293;

    @ObfuscatedName("da.az")
    public boolean field1300 = false;

    @ObfuscatedName("da.av")
    public int field1289;

    @ObfuscatedName("da.ap")
    public double field1296 = 0.8D;

    @ObfuscatedName("da.aq")
    public int field1297 = 127;

    @ObfuscatedName("da.at")
    public int field1294 = 127;

    @ObfuscatedName("da.ah")
    public int field1298 = 127;

    @ObfuscatedName("da.ax")
    public int field1291 = -1;

    @ObfuscatedName("da.aa")
    public String field1301 = null;

    @ObfuscatedName("da.au")
    public int field1299 = 1;

    @ObfuscatedName("da.ae")
    public final Map field1303 = new LinkedHashMap();

    public class99() {
        this.method2351(true);
    }

    public class99(class514 arg0) {
        if (arg0 == null || arg0.field5070 == null) {
            this.method2351(true);
        } else {
            int var2 = arg0.method8244();
            if (var2 >= 0 && var2 <= 10) {
                if (arg0.method8244() == 1) {
                    this.field1302 = true;
                }
                if (var2 > 1) {
                    this.field1293 = arg0.method8244() == 1;
                }
                if (var2 > 3) {
                    this.field1299 = arg0.method8244();
                }
                if (var2 > 2) {
                    int var3 = arg0.method8244();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method8496();
                        int var6 = arg0.method8496();
                        this.field1303.put(var5, var6);
                    }
                }
                if (var2 > 4) {
                    this.field1301 = arg0.method8254();
                }
                if (var2 > 5) {
                    this.field1292 = arg0.method8253();
                }
                if (var2 > 6) {
                    this.field1296 = (double) arg0.method8244() / 100.0D;
                    this.field1297 = arg0.method8244();
                    this.field1294 = arg0.method8244();
                    this.field1298 = arg0.method8244();
                }
                if (var2 > 7) {
                    this.field1291 = arg0.method8244();
                }
                if (var2 > 8) {
                    this.field1300 = arg0.method8244() == 1;
                }
                if (var2 > 9) {
                    this.field1289 = arg0.method8496();
                }
            } else {
                this.method2351(true);
            }
        }
    }

    @ObfuscatedName("da.aw(ZB)V")
    public void method2351(boolean arg0) {
    }

    @ObfuscatedName("da.ay(I)Lty;")
    public class514 method2352() {
        class514 var1 = new class514(417, true);
        var1.method8227(10);
        var1.method8227(this.field1302 ? 1 : 0);
        var1.method8227(this.field1293 ? 1 : 0);
        var1.method8227(this.field1299);
        var1.method8227(this.field1303.size());
        Iterator var2 = this.field1303.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method8230((Integer) var3.getKey());
            var1.method8230((Integer) var3.getValue());
        }
        var1.method8234(this.field1301 == null ? "" : this.field1301);
        var1.method8233(this.field1292);
        var1.method8227((int) (this.field1296 * 100.0D));
        var1.method8227(this.field1297);
        var1.method8227(this.field1294);
        var1.method8227(this.field1298);
        var1.method8227(this.field1291);
        var1.method8227(this.field1300 ? 1 : 0);
        var1.method8230(this.field1289);
        return var1;
    }

    @ObfuscatedName("ez.ar(I)Lda;")
    public static class99 method2811() {
        class496 var0 = null;
        class99 var1 = new class99();
        try {
            var0 = class174.method1075("", Statics.field139.field3879, false);
            byte[] var2 = new byte[(int) var0.method8022()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var0.method8024(var2, var3, var2.length - var3);
                if (var4 == -1) {
                    throw new IOException();
                }
            }
            var1 = new class99(new class514(var2));
        } catch (Exception var8) {
        }
        try {
            if (var0 != null) {
                var0.method8020();
            }
        } catch (Exception var7) {
        }
        return var1;
    }

    @ObfuscatedName("ng.am(B)V")
    public static void method6236() {
        class496 var0 = null;
        try {
            var0 = class174.method1075("", Statics.field139.field3879, true);
            class514 var1 = Statics.field1686.method2352();
            var0.method8019(var1.field5070, 0, var1.field5072);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method8033(true);
            }
        } catch (Exception var4) {
        }
    }

    @ObfuscatedName("da.as(ZB)V")
    public void method2353(boolean arg0) {
        this.field1302 = arg0;
        method6236();
    }

    @ObfuscatedName("da.aj(B)Z")
    public boolean method2354() {
        return this.field1302;
    }

    @ObfuscatedName("da.ag(ZI)V")
    public void method2418(boolean arg0) {
        this.field1292 = arg0;
        method6236();
    }

    @ObfuscatedName("da.az(I)Z")
    public boolean method2356() {
        return this.field1292;
    }

    @ObfuscatedName("da.av(ZI)V")
    public void method2357(boolean arg0) {
        this.field1293 = arg0;
        method6236();
    }

    @ObfuscatedName("da.ap(I)Z")
    public boolean method2358() {
        return this.field1293;
    }

    @ObfuscatedName("da.aq(ZI)V")
    public void method2408(boolean arg0) {
        this.field1300 = arg0;
        method6236();
    }

    @ObfuscatedName("da.at(I)V")
    public void method2390() {
        this.method2408(!this.field1300);
    }

    @ObfuscatedName("da.ah(B)Z")
    public boolean method2435() {
        return this.field1300;
    }

    @ObfuscatedName("da.ax(II)V")
    public void method2362(int arg0) {
        this.field1289 = arg0;
        method6236();
    }

    @ObfuscatedName("da.aa(S)I")
    public int method2350() {
        return this.field1289;
    }

    @ObfuscatedName("da.au(D)V")
    public void method2364(double arg0) {
        this.field1296 = arg0;
        method6236();
    }

    @ObfuscatedName("da.ae(B)D")
    public double method2365() {
        return this.field1296;
    }

    @ObfuscatedName("da.ab(II)V")
    public void method2417(int arg0) {
        this.field1297 = arg0;
        method6236();
    }

    @ObfuscatedName("da.ad(B)I")
    public int method2367() {
        return this.field1297;
    }

    @ObfuscatedName("da.ao(IB)V")
    public void method2368(int arg0) {
        this.field1294 = arg0;
        method6236();
    }

    @ObfuscatedName("da.ac(I)I")
    public int method2369() {
        return this.field1294;
    }

    @ObfuscatedName("da.ak(IB)V")
    public void method2445(int arg0) {
        this.field1298 = arg0;
        method6236();
    }

    @ObfuscatedName("da.an(I)I")
    public int method2370() {
        return this.field1298;
    }

    @ObfuscatedName("da.af(Ljava/lang/String;S)V")
    public void method2371(String arg0) {
        this.field1301 = arg0;
        method6236();
    }

    @ObfuscatedName("da.ai(I)Ljava/lang/String;")
    public String method2372() {
        return this.field1301;
    }

    @ObfuscatedName("da.al(II)V")
    public void method2373(int arg0) {
        this.field1291 = arg0;
        method6236();
    }

    @ObfuscatedName("da.bd(I)I")
    public int method2428() {
        return this.field1291;
    }

    @ObfuscatedName("da.bb(II)V")
    public void method2461(int arg0) {
        this.field1299 = arg0;
        method6236();
    }

    @ObfuscatedName("da.bn(B)I")
    public int method2376() {
        return this.field1299;
    }

    @ObfuscatedName("da.ba(Ljava/lang/String;II)V")
    public void method2377(String arg0, int arg1) {
        int var3 = this.method2380(arg0);
        if (this.field1303.size() >= 10 && !this.field1303.containsKey(var3)) {
            Iterator var4 = this.field1303.entrySet().iterator();
            var4.next();
            var4.remove();
        }
        this.field1303.put(var3, arg1);
        method6236();
    }

    @ObfuscatedName("da.bf(Ljava/lang/String;I)Z")
    public boolean method2429(String arg0) {
        int var2 = this.method2380(arg0);
        return this.field1303.containsKey(var2);
    }

    @ObfuscatedName("da.bs(Ljava/lang/String;I)I")
    public int method2379(String arg0) {
        int var2 = this.method2380(arg0);
        return this.field1303.containsKey(var2) ? (Integer) this.field1303.get(var2) : 0;
    }

    @ObfuscatedName("da.bp(Ljava/lang/String;I)I")
    public int method2380(String arg0) {
        return class388.method3924(arg0.toLowerCase());
    }
}
