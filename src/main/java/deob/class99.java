package deob;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

@ObfuscatedName("dp")
public class class99 {

    @ObfuscatedName("dp.ac")
    public boolean field1314;

    @ObfuscatedName("dp.ai")
    public boolean field1305 = false;

    @ObfuscatedName("dp.az")
    public boolean field1313;

    @ObfuscatedName("dp.ap")
    public boolean field1308 = false;

    @ObfuscatedName("dp.aa")
    public int field1306;

    @ObfuscatedName("dp.af")
    public double field1309 = 0.8D;

    @ObfuscatedName("dp.ad")
    public int field1302 = 127;

    @ObfuscatedName("dp.aq")
    public int field1311 = 127;

    @ObfuscatedName("dp.al")
    public int field1312 = 127;

    @ObfuscatedName("dp.an")
    public int field1310 = -1;

    @ObfuscatedName("dp.ar")
    public String field1307 = null;

    @ObfuscatedName("dp.ab")
    public int field1315 = 1;

    @ObfuscatedName("dp.ag")
    public final Map field1316 = new LinkedHashMap();

    public class99() {
        this.method2340(true);
    }

    public class99(class515 arg0) {
        if (arg0 == null || arg0.field5108 == null) {
            this.method2340(true);
        } else {
            int var2 = arg0.method8300();
            if (var2 >= 0 && var2 <= 10) {
                if (arg0.method8300() == 1) {
                    this.field1314 = true;
                }
                if (var2 > 1) {
                    this.field1313 = arg0.method8300() == 1;
                }
                if (var2 > 3) {
                    this.field1315 = arg0.method8300();
                }
                if (var2 > 2) {
                    int var3 = arg0.method8300();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method8306();
                        int var6 = arg0.method8306();
                        this.field1316.put(var5, var6);
                    }
                }
                if (var2 > 4) {
                    this.field1307 = arg0.method8497();
                }
                if (var2 > 5) {
                    this.field1305 = arg0.method8309();
                }
                if (var2 > 6) {
                    this.field1309 = (double) arg0.method8300() / 100.0D;
                    this.field1302 = arg0.method8300();
                    this.field1311 = arg0.method8300();
                    this.field1312 = arg0.method8300();
                }
                if (var2 > 7) {
                    this.field1310 = arg0.method8300();
                }
                if (var2 > 8) {
                    this.field1308 = arg0.method8300() == 1;
                }
                if (var2 > 9) {
                    this.field1306 = arg0.method8306();
                }
            } else {
                this.method2340(true);
            }
        }
    }

    @ObfuscatedName("dp.au(ZB)V")
    public void method2340(boolean arg0) {
    }

    @ObfuscatedName("dp.ae(I)Ltm;")
    public class515 method2341() {
        class515 var1 = new class515(417, true);
        var1.method8283(10);
        var1.method8283(this.field1314 ? 1 : 0);
        var1.method8283(this.field1313 ? 1 : 0);
        var1.method8283(this.field1315);
        var1.method8283(this.field1316.size());
        Iterator var2 = this.field1316.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method8464((Integer) var3.getKey());
            var1.method8464((Integer) var3.getValue());
        }
        var1.method8290(this.field1307 == null ? "" : this.field1307);
        var1.method8289(this.field1305);
        var1.method8283((int) (this.field1309 * 100.0D));
        var1.method8283(this.field1302);
        var1.method8283(this.field1311);
        var1.method8283(this.field1312);
        var1.method8283(this.field1310);
        var1.method8283(this.field1308 ? 1 : 0);
        var1.method8464(this.field1306);
        return var1;
    }

    @ObfuscatedName("nq.ao(I)V")
    public static void method6038() {
        class495 var0 = null;
        try {
            var0 = class174.method1076("", Statics.field2998.field3893, true);
            class515 var1 = Statics.field4737.method2341();
            var0.method8077(var1.field5108, 0, var1.field5111);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method8095(true);
            }
        } catch (Exception var4) {
        }
    }

    @ObfuscatedName("dp.at(ZI)V")
    public void method2342(boolean arg0) {
        this.field1314 = arg0;
        method6038();
    }

    @ObfuscatedName("dp.ac(I)Z")
    public boolean method2343() {
        return this.field1314;
    }

    @ObfuscatedName("dp.ai(ZI)V")
    public void method2389(boolean arg0) {
        this.field1305 = arg0;
        method6038();
    }

    @ObfuscatedName("dp.az(I)Z")
    public boolean method2349() {
        return this.field1305;
    }

    @ObfuscatedName("dp.ap(ZI)V")
    public void method2369(boolean arg0) {
        this.field1313 = arg0;
        method6038();
    }

    @ObfuscatedName("dp.aa(B)Z")
    public boolean method2379() {
        return this.field1313;
    }

    @ObfuscatedName("dp.af(ZI)V")
    public void method2347(boolean arg0) {
        this.field1308 = arg0;
        method6038();
    }

    @ObfuscatedName("dp.ad(I)V")
    public void method2348() {
        this.method2347(!this.field1308);
    }

    @ObfuscatedName("dp.aq(I)Z")
    public boolean method2358() {
        return this.field1308;
    }

    @ObfuscatedName("dp.al(IB)V")
    public void method2350(int arg0) {
        this.field1306 = arg0;
        method6038();
    }

    @ObfuscatedName("dp.an(I)I")
    public int method2351() {
        return this.field1306;
    }

    @ObfuscatedName("dp.ar(D)V")
    public void method2411(double arg0) {
        this.field1309 = arg0;
        method6038();
    }

    @ObfuscatedName("dp.ab(I)D")
    public double method2400() {
        return this.field1309;
    }

    @ObfuscatedName("dp.ag(II)V")
    public void method2353(int arg0) {
        this.field1302 = arg0;
        method6038();
    }

    @ObfuscatedName("dp.am(B)I")
    public int method2346() {
        return this.field1302;
    }

    @ObfuscatedName("dp.ax(IB)V")
    public void method2356(int arg0) {
        this.field1311 = arg0;
        method6038();
    }

    @ObfuscatedName("dp.ah(I)I")
    public int method2357() {
        return this.field1311;
    }

    @ObfuscatedName("dp.as(II)V")
    public void method2451(int arg0) {
        this.field1312 = arg0;
        method6038();
    }

    @ObfuscatedName("dp.ay(B)I")
    public int method2449() {
        return this.field1312;
    }

    @ObfuscatedName("dp.aj(Ljava/lang/String;I)V")
    public void method2360(String arg0) {
        this.field1307 = arg0;
        method6038();
    }

    @ObfuscatedName("dp.av(B)Ljava/lang/String;")
    public String method2361() {
        return this.field1307;
    }

    @ObfuscatedName("dp.aw(II)V")
    public void method2442(int arg0) {
        this.field1310 = arg0;
        method6038();
    }

    @ObfuscatedName("dp.ak(I)I")
    public int method2363() {
        return this.field1310;
    }

    @ObfuscatedName("dp.bh(IB)V")
    public void method2364(int arg0) {
        this.field1315 = arg0;
        method6038();
    }

    @ObfuscatedName("dp.bj(I)I")
    public int method2365() {
        return this.field1315;
    }

    @ObfuscatedName("dp.bk(Ljava/lang/String;II)V")
    public void method2366(String arg0, int arg1) {
        int var3 = this.method2368(arg0);
        if (this.field1316.size() >= 10 && !this.field1316.containsKey(var3)) {
            Iterator var4 = this.field1316.entrySet().iterator();
            var4.next();
            var4.remove();
        }
        this.field1316.put(var3, arg1);
        method6038();
    }

    @ObfuscatedName("dp.bv(Ljava/lang/String;I)Z")
    public boolean method2367(String arg0) {
        int var2 = this.method2368(arg0);
        return this.field1316.containsKey(var2);
    }

    @ObfuscatedName("dp.bt(Ljava/lang/String;S)I")
    public int method2401(String arg0) {
        int var2 = this.method2368(arg0);
        return this.field1316.containsKey(var2) ? (Integer) this.field1316.get(var2) : 0;
    }

    @ObfuscatedName("dp.bd(Ljava/lang/String;B)I")
    public int method2368(String arg0) {
        return class387.method3513(arg0.toLowerCase());
    }
}
