package deob;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

@ObfuscatedName("db")
public class class96 {

    @ObfuscatedName("db.an")
    public boolean field1253;

    @ObfuscatedName("db.ao")
    public boolean field1261 = false;

    @ObfuscatedName("db.av")
    public boolean field1254;

    @ObfuscatedName("db.aq")
    public boolean field1256 = false;

    @ObfuscatedName("db.ap")
    public int field1255;

    @ObfuscatedName("db.ar")
    public double field1258 = 0.8D;

    @ObfuscatedName("db.ak")
    public int field1259 = 127;

    @ObfuscatedName("db.ax")
    public int field1260 = 127;

    @ObfuscatedName("db.as")
    public int field1257 = 127;

    @ObfuscatedName("db.ay")
    public int field1262 = -1;

    @ObfuscatedName("db.am")
    public String field1250 = null;

    @ObfuscatedName("db.az")
    public int field1264 = 1;

    @ObfuscatedName("db.ae")
    public final Map field1263 = new LinkedHashMap();

    public class96() {
        this.method2311(true);
    }

    public class96(class478 arg0) {
        if (arg0 == null || arg0.field4906 == null) {
            this.method2311(true);
        } else {
            int var2 = arg0.method7909();
            if (var2 >= 0 && var2 <= 10) {
                if (arg0.method7909() == 1) {
                    this.field1253 = true;
                }
                if (var2 > 1) {
                    this.field1254 = arg0.method7909() == 1;
                }
                if (var2 > 3) {
                    this.field1264 = arg0.method7909();
                }
                if (var2 > 2) {
                    int var3 = arg0.method7909();
                    for (int var4 = 0; var4 < var3; var4++) {
                        int var5 = arg0.method7908();
                        int var6 = arg0.method7908();
                        this.field1263.put(var5, var6);
                    }
                }
                if (var2 > 4) {
                    this.field1250 = arg0.method8048();
                }
                if (var2 > 5) {
                    this.field1261 = arg0.method8022();
                }
                if (var2 > 6) {
                    this.field1258 = (double) arg0.method7909() / 100.0D;
                    this.field1259 = arg0.method7909();
                    this.field1260 = arg0.method7909();
                    this.field1257 = arg0.method7909();
                }
                if (var2 > 7) {
                    this.field1262 = arg0.method7909();
                }
                if (var2 > 8) {
                    this.field1256 = arg0.method7909() == 1;
                }
                if (var2 > 9) {
                    this.field1255 = arg0.method7908();
                }
            } else {
                this.method2311(true);
            }
        }
    }

    @ObfuscatedName("db.aj(ZI)V")
    public void method2311(boolean arg0) {
    }

    @ObfuscatedName("db.al(B)Lsy;")
    public class478 method2399() {
        class478 var1 = new class478(417, true);
        var1.method7886(10);
        var1.method7886(this.field1253 ? 1 : 0);
        var1.method7886(this.field1254 ? 1 : 0);
        var1.method7886(this.field1264);
        var1.method7886(this.field1263.size());
        Iterator var2 = this.field1263.entrySet().iterator();
        while (var2.hasNext()) {
            Entry var3 = (Entry) var2.next();
            var1.method7957((Integer) var3.getKey());
            var1.method7957((Integer) var3.getValue());
        }
        var1.method7893(this.field1250 == null ? "" : this.field1250);
        var1.method7945(this.field1261);
        var1.method7886((int) (this.field1258 * 100.0D));
        var1.method7886(this.field1259);
        var1.method7886(this.field1260);
        var1.method7886(this.field1257);
        var1.method7886(this.field1262);
        var1.method7886(this.field1256 ? 1 : 0);
        var1.method7957(this.field1255);
        return var1;
    }

    @ObfuscatedName("fn.ac(I)V")
    public static void method2964() {
        class460 var0 = null;
        try {
            var0 = class171.method6049("", Statics.field4871.field3787, true);
            class478 var1 = Statics.field2929.method2399();
            var0.method7662(var1.field4906, 0, var1.field4904);
        } catch (Exception var5) {
        }
        try {
            if (var0 != null) {
                var0.method7659(true);
            }
        } catch (Exception var4) {
        }
    }

    @ObfuscatedName("db.ab(ZI)V")
    public void method2318(boolean arg0) {
        this.field1253 = arg0;
        method2964();
    }

    @ObfuscatedName("db.an(I)Z")
    public boolean method2344() {
        return this.field1253;
    }

    @ObfuscatedName("db.ao(ZI)V")
    public void method2345(boolean arg0) {
        this.field1261 = arg0;
        method2964();
    }

    @ObfuscatedName("db.av(I)Z")
    public boolean method2315() {
        return this.field1261;
    }

    @ObfuscatedName("db.aq(ZI)V")
    public void method2386(boolean arg0) {
        this.field1254 = arg0;
        method2964();
    }

    @ObfuscatedName("db.ap(I)Z")
    public boolean method2331() {
        return this.field1254;
    }

    @ObfuscatedName("db.ar(ZB)V")
    public void method2409(boolean arg0) {
        this.field1256 = arg0;
        method2964();
    }

    @ObfuscatedName("db.ak(B)V")
    public void method2319() {
        this.method2409(!this.field1256);
    }

    @ObfuscatedName("db.ax(I)Z")
    public boolean method2312() {
        return this.field1256;
    }

    @ObfuscatedName("db.as(IS)V")
    public void method2321(int arg0) {
        this.field1255 = arg0;
        method2964();
    }

    @ObfuscatedName("db.ay(I)I")
    public int method2415() {
        return this.field1255;
    }

    @ObfuscatedName("db.am(D)V")
    public void method2408(double arg0) {
        this.field1258 = arg0;
        method2964();
    }

    @ObfuscatedName("db.az(B)D")
    public double method2324() {
        return this.field1258;
    }

    @ObfuscatedName("db.ae(IB)V")
    public void method2314(int arg0) {
        this.field1259 = arg0;
        method2964();
    }

    @ObfuscatedName("db.au(I)I")
    public int method2326() {
        return this.field1259;
    }

    @ObfuscatedName("db.ag(II)V")
    public void method2327(int arg0) {
        this.field1260 = arg0;
        method2964();
    }

    @ObfuscatedName("db.at(I)I")
    public int method2328() {
        return this.field1260;
    }

    @ObfuscatedName("db.af(II)V")
    public void method2329(int arg0) {
        this.field1257 = arg0;
        method2964();
    }

    @ObfuscatedName("db.ai(B)I")
    public int method2349() {
        return this.field1257;
    }

    @ObfuscatedName("db.aw(Ljava/lang/String;I)V")
    public void method2325(String arg0) {
        this.field1250 = arg0;
        method2964();
    }

    @ObfuscatedName("db.aa(I)Ljava/lang/String;")
    public String method2332() {
        return this.field1250;
    }

    @ObfuscatedName("db.ah(IB)V")
    public void method2333(int arg0) {
        this.field1262 = arg0;
        method2964();
    }

    @ObfuscatedName("db.ad(I)I")
    public int method2334() {
        return this.field1262;
    }

    @ObfuscatedName("db.bm(IB)V")
    public void method2396(int arg0) {
        this.field1264 = arg0;
        method2964();
    }

    @ObfuscatedName("db.bv(B)I")
    public int method2336() {
        return this.field1264;
    }

    @ObfuscatedName("db.bo(Ljava/lang/String;IB)V")
    public void method2374(String arg0, int arg1) {
        int var3 = this.method2340(arg0);
        if (this.field1263.size() >= 10 && !this.field1263.containsKey(var3)) {
            Iterator var4 = this.field1263.entrySet().iterator();
            var4.next();
            var4.remove();
        }
        this.field1263.put(var3, arg1);
        method2964();
    }

    @ObfuscatedName("db.bs(Ljava/lang/String;I)Z")
    public boolean method2338(String arg0) {
        int var2 = this.method2340(arg0);
        return this.field1263.containsKey(var2);
    }

    @ObfuscatedName("db.bg(Ljava/lang/String;I)I")
    public int method2339(String arg0) {
        int var2 = this.method2340(arg0);
        return this.field1263.containsKey(var2) ? (Integer) this.field1263.get(var2) : 0;
    }

    @ObfuscatedName("db.bh(Ljava/lang/String;I)I")
    public int method2340(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = var2.length();
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            var4 = (var4 << 5) - var4 + var2.charAt(var5);
        }
        return var4;
    }
}
