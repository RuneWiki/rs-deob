package deob;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

@ObfuscatedName("dh")
public class class99 {

    @ObfuscatedName("dh.aq")
    public boolean field1279;

    @ObfuscatedName("dh.ar")
    public boolean field1277 = false;

    @ObfuscatedName("dh.ag")
    public boolean field1290;

    @ObfuscatedName("dh.ao")
    public boolean field1282 = false;

    @ObfuscatedName("dh.ae")
    public int field1283;

    @ObfuscatedName("dh.aa")
    public double field1281 = 0.8D;

    @ObfuscatedName("dh.au")
    public int field1285 = 127;

    @ObfuscatedName("dh.an")
    public int field1286 = 127;

    @ObfuscatedName("dh.ad")
    public int field1287 = 127;

    @ObfuscatedName("dh.ax")
    public int field1288 = -1;

    @ObfuscatedName("dh.aw")
    public String field1289 = null;

    @ObfuscatedName("dh.az")
    public int field1278 = 1;

    @ObfuscatedName("dh.av")
    public final Map field1280 = new LinkedHashMap();

    public class99() {
        this.method2431(true);
    }

    public class99(class531 arg0) {
        if (arg0 == null || arg0.field5178 == null) {
            this.method2431(true);
        } else {
            int var2 = arg0.method8561();
            if (var2 >= 0 && var2 <= 10) {
                if (arg0.method8561() == 1) {
                    this.field1279 = true;
                }
                if (var2 > 1) {
                    this.field1290 = arg0.method8561() == 1;
                }
                if (var2 > 3) {
                    this.field1278 = arg0.method8561();
                }
                if (var2 > 2) {
                    int var3 = arg0.method8561();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method8566();
                        int var6 = arg0.method8566();
                        this.field1280.put(var5, var6);
                    }
                }
                if (var2 > 4) {
                    this.field1289 = arg0.method8602();
                }
                if (var2 > 5) {
                    this.field1277 = arg0.method8795();
                }
                if (var2 > 6) {
                    this.field1281 = (double) arg0.method8561() / 100.0D;
                    this.field1285 = arg0.method8561();
                    this.field1286 = arg0.method8561();
                    this.field1287 = arg0.method8561();
                }
                if (var2 > 7) {
                    this.field1288 = arg0.method8561();
                }
                if (var2 > 8) {
                    this.field1282 = arg0.method8561() == 1;
                }
                if (var2 > 9) {
                    this.field1283 = arg0.method8566();
                }
            } else {
                this.method2431(true);
            }
        }
    }

    @ObfuscatedName("dh.am(ZB)V")
    public void method2431(boolean arg0) {
    }

    @ObfuscatedName("dh.ap(I)Luk;")
    public class531 method2432() {
        class531 var1 = new class531(417, true);
        var1.method8699(10);
        var1.method8699(this.field1279 ? 1 : 0);
        var1.method8699(this.field1290 ? 1 : 0);
        var1.method8699(this.field1278);
        var1.method8699(this.field1280.size());
        Iterator var2 = this.field1280.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method8547((Integer) var3.getKey());
            var1.method8547((Integer) var3.getValue());
        }
        var1.method8551(this.field1289 == null ? "" : this.field1289);
        var1.method8565(this.field1277);
        var1.method8699((int) (this.field1281 * 100.0D));
        var1.method8699(this.field1285);
        var1.method8699(this.field1286);
        var1.method8699(this.field1287);
        var1.method8699(this.field1288);
        var1.method8699(this.field1282 ? 1 : 0);
        var1.method8547(this.field1283);
        return var1;
    }

    @ObfuscatedName("pn.af(B)V")
    public static void method6940() {
        class511 var0 = null;
        try {
            var0 = class213.method6289("", Statics.field4.field3950, true);
            class531 var1 = Statics.field1155.method2432();
            var0.method8348(var1.field5178, 0, var1.field5181);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method8362(true);
            }
        } catch (Exception var4) {
        }
    }

    @ObfuscatedName("dh.aj(ZI)V")
    public void method2476(boolean arg0) {
        this.field1279 = arg0;
        method6940();
    }

    @ObfuscatedName("dh.aq(I)Z")
    public boolean method2434() {
        return this.field1279;
    }

    @ObfuscatedName("dh.ar(ZI)V")
    public void method2435(boolean arg0) {
        this.field1277 = arg0;
        method6940();
    }

    @ObfuscatedName("dh.ag(I)Z")
    public boolean method2518() {
        return this.field1277;
    }

    @ObfuscatedName("dh.ao(ZB)V")
    public void method2488(boolean arg0) {
        this.field1290 = arg0;
        method6940();
    }

    @ObfuscatedName("dh.ae(B)Z")
    public boolean method2445() {
        return this.field1290;
    }

    @ObfuscatedName("dh.aa(ZI)V")
    public void method2467(boolean arg0) {
        this.field1282 = arg0;
        method6940();
    }

    @ObfuscatedName("dh.au(I)V")
    public void method2454() {
        this.method2467(!this.field1282);
    }

    @ObfuscatedName("dh.an(B)Z")
    public boolean method2440() {
        return this.field1282;
    }

    @ObfuscatedName("dh.ad(II)V")
    public void method2441(int arg0) {
        this.field1283 = arg0;
        method6940();
    }

    @ObfuscatedName("dh.ax(I)I")
    public int method2442() {
        return this.field1283;
    }

    @ObfuscatedName("dh.aw(D)V")
    public void method2443(double arg0) {
        this.field1281 = arg0;
        method6940();
    }

    @ObfuscatedName("dh.az(B)D")
    public double method2447() {
        return this.field1281;
    }

    @ObfuscatedName("dh.av(II)V")
    public void method2527(int arg0) {
        this.field1285 = arg0;
        method6940();
    }

    @ObfuscatedName("dh.ak(I)I")
    public int method2496() {
        return this.field1285;
    }

    @ObfuscatedName("dh.ay(II)V")
    public void method2446(int arg0) {
        this.field1286 = arg0;
        method6940();
    }

    @ObfuscatedName("dh.as(I)I")
    public int method2448() {
        return this.field1286;
    }

    @ObfuscatedName("dh.ab(II)V")
    public void method2438(int arg0) {
        this.field1287 = arg0;
        method6940();
    }

    @ObfuscatedName("dh.ah(I)I")
    public int method2450() {
        return this.field1287;
    }

    @ObfuscatedName("dh.ai(Ljava/lang/String;B)V")
    public void method2503(String arg0) {
        this.field1289 = arg0;
        method6940();
    }

    @ObfuscatedName("dh.ac(I)Ljava/lang/String;")
    public String method2452() {
        return this.field1289;
    }

    @ObfuscatedName("dh.al(II)V")
    public void method2498(int arg0) {
        this.field1288 = arg0;
        method6940();
    }

    @ObfuscatedName("dh.at(I)I")
    public int method2504() {
        return this.field1288;
    }

    @ObfuscatedName("dh.bj(II)V")
    public void method2455(int arg0) {
        this.field1278 = arg0;
        method6940();
    }

    @ObfuscatedName("dh.bd(B)I")
    public int method2451() {
        return this.field1278;
    }

    @ObfuscatedName("dh.bg(Ljava/lang/String;II)V")
    public void method2457(String arg0, int arg1) {
        int var3 = this.method2485(arg0);
        if (this.field1280.size() >= 10 && !this.field1280.containsKey(var3)) {
            Iterator var4 = this.field1280.entrySet().iterator();
            var4.next();
            var4.remove();
        }
        this.field1280.put(var3, arg1);
        method6940();
    }

    @ObfuscatedName("dh.bt(Ljava/lang/String;I)Z")
    public boolean method2458(String arg0) {
        int var2 = this.method2485(arg0);
        return this.field1280.containsKey(var2);
    }

    @ObfuscatedName("dh.br(Ljava/lang/String;B)I")
    public int method2459(String arg0) {
        int var2 = this.method2485(arg0);
        return this.field1280.containsKey(var2) ? (Integer) this.field1280.get(var2) : 0;
    }

    @ObfuscatedName("dh.ba(Ljava/lang/String;S)I")
    public int method2485(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = var2.length();
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            var4 = (var4 << 5) - var4 + var2.charAt(var5);
        }
        return var4;
    }
}
