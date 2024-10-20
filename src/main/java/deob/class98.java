package deob;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

@ObfuscatedName("dy")
public class class98 {

    @ObfuscatedName("dy.ax")
    public boolean field1262;

    @ObfuscatedName("dy.ap")
    public boolean field1257 = false;

    @ObfuscatedName("dy.ab")
    public boolean field1258;

    @ObfuscatedName("dy.ak")
    public boolean field1261 = false;

    @ObfuscatedName("dy.ae")
    public int field1265;

    @ObfuscatedName("dy.af")
    public double field1264 = 0.8D;

    @ObfuscatedName("dy.ao")
    public int field1267 = 127;

    @ObfuscatedName("dy.aa")
    public int field1268 = 127;

    @ObfuscatedName("dy.aj")
    public int field1269 = 127;

    @ObfuscatedName("dy.ad")
    public int field1270 = -1;

    @ObfuscatedName("dy.ac")
    public String field1271 = null;

    @ObfuscatedName("dy.ag")
    public int field1272 = 1;

    @ObfuscatedName("dy.ar")
    public final Map field1273 = new LinkedHashMap();

    public class98() {
        this.method2313(true);
    }

    public class98(class501 arg0) {
        if (arg0 == null || arg0.field5016 == null) {
            this.method2313(true);
        } else {
            int var2 = arg0.method8129();
            if (var2 >= 0 && var2 <= 10) {
                if (arg0.method8129() == 1) {
                    this.field1262 = true;
                }
                if (var2 > 1) {
                    this.field1258 = arg0.method8129() == 1;
                }
                if (var2 > 3) {
                    this.field1272 = arg0.method8129();
                }
                if (var2 > 2) {
                    int var3 = arg0.method8129();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method8134();
                        int var6 = arg0.method8134();
                        this.field1273.put(var5, var6);
                    }
                }
                if (var2 > 4) {
                    this.field1271 = arg0.method8128();
                }
                if (var2 > 5) {
                    this.field1257 = arg0.method8137();
                }
                if (var2 > 6) {
                    this.field1264 = (double) arg0.method8129() / 100.0D;
                    this.field1267 = arg0.method8129();
                    this.field1268 = arg0.method8129();
                    this.field1269 = arg0.method8129();
                }
                if (var2 > 7) {
                    this.field1270 = arg0.method8129();
                }
                if (var2 > 8) {
                    this.field1261 = arg0.method8129() == 1;
                }
                if (var2 > 9) {
                    this.field1265 = arg0.method8134();
                }
            } else {
                this.method2313(true);
            }
        }
    }

    @ObfuscatedName("dy.at(ZI)V")
    public void method2313(boolean arg0) {
    }

    @ObfuscatedName("dy.an(I)Ltz;")
    public class501 method2399() {
        class501 var1 = new class501(417, true);
        var1.method8113(10);
        var1.method8113(this.field1262 ? 1 : 0);
        var1.method8113(this.field1258 ? 1 : 0);
        var1.method8113(this.field1272);
        var1.method8113(this.field1273.size());
        Iterator var2 = this.field1273.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method8270((Integer) var3.getKey());
            var1.method8270((Integer) var3.getValue());
        }
        var1.method8119(this.field1271 == null ? "" : this.field1271);
        var1.method8118(this.field1257);
        var1.method8113((int) (this.field1264 * 100.0D));
        var1.method8113(this.field1267);
        var1.method8113(this.field1268);
        var1.method8113(this.field1269);
        var1.method8113(this.field1270);
        var1.method8113(this.field1261 ? 1 : 0);
        var1.method8270(this.field1265);
        return var1;
    }

    @ObfuscatedName("du.av(I)V")
    public static void method2500() {
        class483 var0 = null;
        try {
            var0 = class173.method7828("", Statics.field3842.field3854, true);
            class501 var1 = Statics.field48.method2399();
            var0.method7916(var1.field5016, 0, var1.field5017);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method7918(true);
            }
        } catch (Exception var4) {
        }
    }

    @ObfuscatedName("dy.as(ZB)V")
    public void method2371(boolean arg0) {
        this.field1262 = arg0;
        method2500();
    }

    @ObfuscatedName("dy.ax(I)Z")
    public boolean method2316() {
        return this.field1262;
    }

    @ObfuscatedName("dy.ap(ZI)V")
    public void method2406(boolean arg0) {
        this.field1257 = arg0;
        method2500();
    }

    @ObfuscatedName("dy.ab(I)Z")
    public boolean method2354() {
        return this.field1257;
    }

    @ObfuscatedName("dy.ak(ZI)V")
    public void method2318(boolean arg0) {
        this.field1258 = arg0;
        method2500();
    }

    @ObfuscatedName("dy.ae(I)Z")
    public boolean method2319() {
        return this.field1258;
    }

    @ObfuscatedName("dy.af(ZI)V")
    public void method2320(boolean arg0) {
        this.field1261 = arg0;
        method2500();
    }

    @ObfuscatedName("dy.ao(I)V")
    public void method2321() {
        this.method2320(!this.field1261);
    }

    @ObfuscatedName("dy.aa(I)Z")
    public boolean method2330() {
        return this.field1261;
    }

    @ObfuscatedName("dy.aj(IB)V")
    public void method2334(int arg0) {
        this.field1265 = arg0;
        method2500();
    }

    @ObfuscatedName("dy.ad(B)I")
    public int method2324() {
        return this.field1265;
    }

    @ObfuscatedName("dy.ac(D)V")
    public void method2325(double arg0) {
        this.field1264 = arg0;
        method2500();
    }

    @ObfuscatedName("dy.ag(I)D")
    public double method2312() {
        return this.field1264;
    }

    @ObfuscatedName("dy.ar(II)V")
    public void method2401(int arg0) {
        this.field1267 = arg0;
        method2500();
    }

    @ObfuscatedName("dy.ah(B)I")
    public int method2370() {
        return this.field1267;
    }

    @ObfuscatedName("dy.az(II)V")
    public void method2329(int arg0) {
        this.field1268 = arg0;
        method2500();
    }

    @ObfuscatedName("dy.au(I)I")
    public int method2327() {
        return this.field1268;
    }

    @ObfuscatedName("dy.ai(II)V")
    public void method2331(int arg0) {
        this.field1269 = arg0;
        method2500();
    }

    @ObfuscatedName("dy.aq(I)I")
    public int method2332() {
        return this.field1269;
    }

    @ObfuscatedName("dy.aw(Ljava/lang/String;I)V")
    public void method2314(String arg0) {
        this.field1271 = arg0;
        method2500();
    }

    @ObfuscatedName("dy.ay(I)Ljava/lang/String;")
    public String method2411() {
        return this.field1271;
    }

    @ObfuscatedName("dy.al(II)V")
    public void method2348(int arg0) {
        this.field1270 = arg0;
        method2500();
    }

    @ObfuscatedName("dy.am(I)I")
    public int method2336() {
        return this.field1270;
    }

    @ObfuscatedName("dy.bs(II)V")
    public void method2322(int arg0) {
        this.field1272 = arg0;
        method2500();
    }

    @ObfuscatedName("dy.bc(I)I")
    public int method2338() {
        return this.field1272;
    }

    @ObfuscatedName("dy.bj(Ljava/lang/String;II)V")
    public void method2339(String arg0, int arg1) {
        int var3 = this.method2342(arg0);
        if (this.field1273.size() >= 10 && !this.field1273.containsKey(var3)) {
            Iterator var4 = this.field1273.entrySet().iterator();
            var4.next();
            var4.remove();
        }
        this.field1273.put(var3, arg1);
        method2500();
    }

    @ObfuscatedName("dy.bo(Ljava/lang/String;B)Z")
    public boolean method2366(String arg0) {
        int var2 = this.method2342(arg0);
        return this.field1273.containsKey(var2);
    }

    @ObfuscatedName("dy.bq(Ljava/lang/String;I)I")
    public int method2341(String arg0) {
        int var2 = this.method2342(arg0);
        return this.field1273.containsKey(var2) ? (Integer) this.field1273.get(var2) : 0;
    }

    @ObfuscatedName("dy.bg(Ljava/lang/String;I)I")
    public int method2342(String arg0) {
        return class385.method4092(arg0.toLowerCase());
    }
}
