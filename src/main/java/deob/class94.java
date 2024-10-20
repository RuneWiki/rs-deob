package deob;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

@ObfuscatedName("du")
public class class94 {

    @ObfuscatedName("du.au")
    public boolean field1250;

    @ObfuscatedName("du.ab")
    public boolean field1251 = false;

    @ObfuscatedName("du.aq")
    public boolean field1248;

    @ObfuscatedName("du.al")
    public boolean field1253 = false;

    @ObfuscatedName("du.at")
    public int field1261;

    @ObfuscatedName("du.aa")
    public double field1254 = 0.8D;

    @ObfuscatedName("du.ay")
    public int field1247 = 127;

    @ObfuscatedName("du.ao")
    public int field1252 = 127;

    @ObfuscatedName("du.ax")
    public int field1258 = 127;

    @ObfuscatedName("du.ai")
    public int field1256 = -1;

    @ObfuscatedName("du.ag")
    public String field1260 = null;

    @ObfuscatedName("du.ah")
    public int field1259 = 1;

    @ObfuscatedName("du.av")
    public final Map field1262 = new LinkedHashMap();

    public class94() {
        this.method2323(true);
    }

    public class94(class489 arg0) {
        if (arg0 == null || arg0.field4991 == null) {
            this.method2323(true);
        } else {
            int var2 = arg0.method8248();
            if (var2 >= 0 && var2 <= 10) {
                if (arg0.method8248() == 1) {
                    this.field1250 = true;
                }
                if (var2 > 1) {
                    this.field1248 = arg0.method8248() == 1;
                }
                if (var2 > 3) {
                    this.field1259 = arg0.method8248();
                }
                if (var2 > 2) {
                    int var3 = arg0.method8248();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method8254();
                        int var6 = arg0.method8254();
                        this.field1262.put(var5, var6);
                    }
                }
                if (var2 > 4) {
                    this.field1260 = arg0.method8305();
                }
                if (var2 > 5) {
                    this.field1251 = arg0.method8296();
                }
                if (var2 > 6) {
                    this.field1254 = (double) arg0.method8248() / 100.0D;
                    this.field1247 = arg0.method8248();
                    this.field1252 = arg0.method8248();
                    this.field1258 = arg0.method8248();
                }
                if (var2 > 7) {
                    this.field1256 = arg0.method8248();
                }
                if (var2 > 8) {
                    this.field1253 = arg0.method8248() == 1;
                }
                if (var2 > 9) {
                    this.field1261 = arg0.method8254();
                }
            } else {
                this.method2323(true);
            }
        }
    }

    @ObfuscatedName("du.af(ZI)V")
    public void method2323(boolean arg0) {
    }

    @ObfuscatedName("du.an(B)Lsg;")
    public class489 method2324() {
        class489 var1 = new class489(417, true);
        var1.method8285(10);
        var1.method8285(this.field1250 ? 1 : 0);
        var1.method8285(this.field1248 ? 1 : 0);
        var1.method8285(this.field1259);
        var1.method8285(this.field1262.size());
        Iterator var2 = this.field1262.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method8234((Integer) var3.getKey());
            var1.method8234((Integer) var3.getValue());
        }
        var1.method8238(this.field1260 == null ? "" : this.field1260);
        var1.method8237(this.field1251);
        var1.method8285((int) (this.field1254 * 100.0D));
        var1.method8285(this.field1247);
        var1.method8285(this.field1252);
        var1.method8285(this.field1258);
        var1.method8285(this.field1256);
        var1.method8285(this.field1253 ? 1 : 0);
        var1.method8234(this.field1261);
        return var1;
    }

    @ObfuscatedName("he.aw(I)Ldu;")
    public static class94 method3874() {
        class471 var0 = null;
        class94 var1 = new class94();
        try {
            var0 = class170.method4098("", Statics.field491.field3813, false);
            byte[] var2 = new byte[(int) var0.method8010()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var0.method8011(var2, var3, var2.length - var3);
                if (var4 == -1) {
                    throw new IOException();
                }
            }
            var1 = new class94(new class489(var2));
        } catch (Exception var8) {
        }
        try {
            if (var0 != null) {
                var0.method8005();
            }
        } catch (Exception var7) {
        }
        return var1;
    }

    @ObfuscatedName("dn.ac(B)V")
    public static void method2544() {
        class471 var0 = null;
        try {
            var0 = class170.method4098("", Statics.field491.field3813, true);
            class489 var1 = Statics.field112.method2324();
            var0.method8023(var1.field4991, 0, var1.field4989);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method8009(true);
            }
        } catch (Exception var4) {
        }
    }

    @ObfuscatedName("du.au(ZI)V")
    public void method2326(boolean arg0) {
        this.field1250 = arg0;
        method2544();
    }

    @ObfuscatedName("du.ab(I)Z")
    public boolean method2391() {
        return this.field1250;
    }

    @ObfuscatedName("du.aq(ZI)V")
    public void method2327(boolean arg0) {
        this.field1251 = arg0;
        method2544();
    }

    @ObfuscatedName("du.al(I)Z")
    public boolean method2328() {
        return this.field1251;
    }

    @ObfuscatedName("du.at(ZI)V")
    public void method2409(boolean arg0) {
        this.field1248 = arg0;
        method2544();
    }

    @ObfuscatedName("du.aa(I)Z")
    public boolean method2412() {
        return this.field1248;
    }

    @ObfuscatedName("du.ay(ZI)V")
    public void method2361(boolean arg0) {
        this.field1253 = arg0;
        method2544();
    }

    @ObfuscatedName("du.ao(I)V")
    public void method2321() {
        this.method2361(!this.field1253);
    }

    @ObfuscatedName("du.ax(S)Z")
    public boolean method2333() {
        return this.field1253;
    }

    @ObfuscatedName("du.ai(IB)V")
    public void method2418(int arg0) {
        this.field1261 = arg0;
        method2544();
    }

    @ObfuscatedName("du.ag(I)I")
    public int method2345() {
        return this.field1261;
    }

    @ObfuscatedName("du.ah(D)V")
    public void method2336(double arg0) {
        this.field1254 = arg0;
        method2544();
    }

    @ObfuscatedName("du.av(I)D")
    public double method2337() {
        return this.field1254;
    }

    @ObfuscatedName("du.ar(II)V")
    public void method2338(int arg0) {
        this.field1247 = arg0;
        method2544();
    }

    @ObfuscatedName("du.am(I)I")
    public int method2339() {
        return this.field1247;
    }

    @ObfuscatedName("du.as(II)V")
    public void method2340(int arg0) {
        this.field1252 = arg0;
        method2544();
    }

    @ObfuscatedName("du.aj(I)I")
    public int method2341() {
        return this.field1252;
    }

    @ObfuscatedName("du.ak(II)V")
    public void method2342(int arg0) {
        this.field1258 = arg0;
        method2544();
    }

    @ObfuscatedName("du.az(I)I")
    public int method2343() {
        return this.field1258;
    }

    @ObfuscatedName("du.ad(Ljava/lang/String;I)V")
    public void method2344(String arg0) {
        this.field1260 = arg0;
        method2544();
    }

    @ObfuscatedName("du.ae(I)Ljava/lang/String;")
    public String method2351() {
        return this.field1260;
    }

    @ObfuscatedName("du.ap(II)V")
    public void method2346(int arg0) {
        this.field1256 = arg0;
        method2544();
    }

    @ObfuscatedName("du.by(I)I")
    public int method2347() {
        return this.field1256;
    }

    @ObfuscatedName("du.bb(II)V")
    public void method2348(int arg0) {
        this.field1259 = arg0;
        method2544();
    }

    @ObfuscatedName("du.bi(B)I")
    public int method2349() {
        return this.field1259;
    }

    @ObfuscatedName("du.be(Ljava/lang/String;IB)V")
    public void method2366(String arg0, int arg1) {
        int var3 = this.method2365(arg0);
        if (this.field1262.size() >= 10 && !this.field1262.containsKey(var3)) {
            Iterator var4 = this.field1262.entrySet().iterator();
            var4.next();
            var4.remove();
        }
        this.field1262.put(var3, arg1);
        method2544();
    }

    @ObfuscatedName("du.bk(Ljava/lang/String;B)Z")
    public boolean method2334(String arg0) {
        int var2 = this.method2365(arg0);
        return this.field1262.containsKey(var2);
    }

    @ObfuscatedName("du.bx(Ljava/lang/String;B)I")
    public int method2352(String arg0) {
        int var2 = this.method2365(arg0);
        return this.field1262.containsKey(var2) ? (Integer) this.field1262.get(var2) : 0;
    }

    @ObfuscatedName("du.bo(Ljava/lang/String;I)I")
    public int method2365(String arg0) {
        return class372.method2278(arg0.toLowerCase());
    }
}
