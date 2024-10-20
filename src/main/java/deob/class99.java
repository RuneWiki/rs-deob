package deob;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

@ObfuscatedName("dl")
public class class99 {

    @ObfuscatedName("dl.ab")
    public boolean field1280;

    @ObfuscatedName("dl.au")
    public boolean field1284 = false;

    @ObfuscatedName("dl.aa")
    public boolean field1285;

    @ObfuscatedName("dl.ac")
    public boolean field1286 = false;

    @ObfuscatedName("dl.al")
    public int field1287;

    @ObfuscatedName("dl.az")
    public double field1295 = 0.8D;

    @ObfuscatedName("dl.ap")
    public int field1289 = 127;

    @ObfuscatedName("dl.av")
    public int field1290 = 127;

    @ObfuscatedName("dl.ax")
    public int field1282 = 127;

    @ObfuscatedName("dl.as")
    public int field1292 = -1;

    @ObfuscatedName("dl.ay")
    public String field1293 = null;

    @ObfuscatedName("dl.ak")
    public int field1294 = 1;

    @ObfuscatedName("dl.aj")
    public final Map field1283 = new LinkedHashMap();

    public class99() {
        this.method2409(true);
    }

    public class99(class527 arg0) {
        if (arg0 == null || arg0.field5140 == null) {
            this.method2409(true);
        } else {
            int var2 = arg0.method8410();
            if (var2 >= 0 && var2 <= 10) {
                if (arg0.method8410() == 1) {
                    this.field1280 = true;
                }
                if (var2 > 1) {
                    this.field1285 = arg0.method8410() == 1;
                }
                if (var2 > 3) {
                    this.field1294 = arg0.method8410();
                }
                if (var2 > 2) {
                    int var3 = arg0.method8410();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method8416();
                        int var6 = arg0.method8416();
                        this.field1283.put(var5, var6);
                    }
                }
                if (var2 > 4) {
                    this.field1293 = arg0.method8420();
                }
                if (var2 > 5) {
                    this.field1284 = arg0.method8572();
                }
                if (var2 > 6) {
                    this.field1295 = (double) arg0.method8410() / 100.0D;
                    this.field1289 = arg0.method8410();
                    this.field1290 = arg0.method8410();
                    this.field1282 = arg0.method8410();
                }
                if (var2 > 7) {
                    this.field1292 = arg0.method8410();
                }
                if (var2 > 8) {
                    this.field1286 = arg0.method8410() == 1;
                }
                if (var2 > 9) {
                    this.field1287 = arg0.method8416();
                }
            } else {
                this.method2409(true);
            }
        }
    }

    @ObfuscatedName("dl.at(ZB)V")
    public void method2409(boolean arg0) {
    }

    @ObfuscatedName("dl.ah(I)Luj;")
    public class527 method2475() {
        class527 var1 = new class527(417, true);
        var1.method8393(10);
        var1.method8393(this.field1280 ? 1 : 0);
        var1.method8393(this.field1285 ? 1 : 0);
        var1.method8393(this.field1294);
        var1.method8393(this.field1283.size());
        Iterator var2 = this.field1283.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method8396((Integer) var3.getKey());
            var1.method8396((Integer) var3.getValue());
        }
        var1.method8400(this.field1293 == null ? "" : this.field1293);
        var1.method8608(this.field1284);
        var1.method8393((int) (this.field1295 * 100.0D));
        var1.method8393(this.field1289);
        var1.method8393(this.field1290);
        var1.method8393(this.field1282);
        var1.method8393(this.field1292);
        var1.method8393(this.field1286 ? 1 : 0);
        var1.method8396(this.field1287);
        return var1;
    }

    @ObfuscatedName("kg.ar(I)V")
    public static void method5008() {
        class507 var0 = null;
        try {
            var0 = class212.method2944("", Statics.field1402.field3905, true);
            class527 var1 = Statics.field2450.method2475();
            var0.method8203(var1.field5140, 0, var1.field5137);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method8196(true);
            }
        } catch (Exception var4) {
        }
    }

    @ObfuscatedName("dl.ao(ZB)V")
    public void method2412(boolean arg0) {
        this.field1280 = arg0;
        method5008();
    }

    @ObfuscatedName("dl.ab(I)Z")
    public boolean method2413() {
        return this.field1280;
    }

    @ObfuscatedName("dl.au(ZI)V")
    public void method2455(boolean arg0) {
        this.field1284 = arg0;
        method5008();
    }

    @ObfuscatedName("dl.aa(I)Z")
    public boolean method2415() {
        return this.field1284;
    }

    @ObfuscatedName("dl.ac(ZS)V")
    public void method2443(boolean arg0) {
        this.field1285 = arg0;
        method5008();
    }

    @ObfuscatedName("dl.al(I)Z")
    public boolean method2503() {
        return this.field1285;
    }

    @ObfuscatedName("dl.az(ZI)V")
    public void method2418(boolean arg0) {
        this.field1286 = arg0;
        method5008();
    }

    @ObfuscatedName("dl.ap(I)V")
    public void method2419() {
        this.method2418(!this.field1286);
    }

    @ObfuscatedName("dl.av(I)Z")
    public boolean method2480() {
        return this.field1286;
    }

    @ObfuscatedName("dl.ax(IS)V")
    public void method2421(int arg0) {
        this.field1287 = arg0;
        method5008();
    }

    @ObfuscatedName("dl.as(B)I")
    public int method2476() {
        return this.field1287;
    }

    @ObfuscatedName("dl.ay(D)V")
    public void method2423(double arg0) {
        this.field1295 = arg0;
        method5008();
    }

    @ObfuscatedName("dl.ak(I)D")
    public double method2420() {
        return this.field1295;
    }

    @ObfuscatedName("dl.aj(II)V")
    public void method2425(int arg0) {
        this.field1289 = arg0;
        method5008();
    }

    @ObfuscatedName("dl.am(I)I")
    public int method2426() {
        return this.field1289;
    }

    @ObfuscatedName("dl.aq(IS)V")
    public void method2427(int arg0) {
        this.field1290 = arg0;
        method5008();
    }

    @ObfuscatedName("dl.ai(I)I")
    public int method2428() {
        return this.field1290;
    }

    @ObfuscatedName("dl.aw(II)V")
    public void method2431(int arg0) {
        this.field1282 = arg0;
        method5008();
    }

    @ObfuscatedName("dl.ae(I)I")
    public int method2477() {
        return this.field1282;
    }

    @ObfuscatedName("dl.an(Ljava/lang/String;I)V")
    public void method2458(String arg0) {
        this.field1293 = arg0;
        method5008();
    }

    @ObfuscatedName("dl.ag(B)Ljava/lang/String;")
    public String method2465() {
        return this.field1293;
    }

    @ObfuscatedName("dl.ad(II)V")
    public void method2433(int arg0) {
        this.field1292 = arg0;
        method5008();
    }

    @ObfuscatedName("dl.af(B)I")
    public int method2434() {
        return this.field1292;
    }

    @ObfuscatedName("dl.be(IB)V")
    public void method2435(int arg0) {
        this.field1294 = arg0;
        method5008();
    }

    @ObfuscatedName("dl.bd(I)I")
    public int method2436() {
        return this.field1294;
    }

    @ObfuscatedName("dl.bl(Ljava/lang/String;II)V")
    public void method2437(String arg0, int arg1) {
        int var3 = this.method2440(arg0);
        if (this.field1283.size() >= 10 && !this.field1283.containsKey(var3)) {
            Iterator var4 = this.field1283.entrySet().iterator();
            var4.next();
            var4.remove();
        }
        this.field1283.put(var3, arg1);
        method5008();
    }

    @ObfuscatedName("dl.bi(Ljava/lang/String;I)Z")
    public boolean method2438(String arg0) {
        int var2 = this.method2440(arg0);
        return this.field1283.containsKey(var2);
    }

    @ObfuscatedName("dl.bv(Ljava/lang/String;I)I")
    public int method2439(String arg0) {
        int var2 = this.method2440(arg0);
        return this.field1283.containsKey(var2) ? (Integer) this.field1283.get(var2) : 0;
    }

    @ObfuscatedName("dl.bf(Ljava/lang/String;B)I")
    public int method2440(String arg0) {
        return class399.method1164(arg0.toLowerCase());
    }
}
