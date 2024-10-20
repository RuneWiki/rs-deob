package deob;

import java.io.EOFException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

@Deprecated
@ObfuscatedName("ct")
public class class97 {

    @ObfuscatedName("ct.p")
    public boolean[] field1264;

    @ObfuscatedName("ct.m")
    public Map field1266;

    /**
     * @deprecated
     */
    @ObfuscatedName("ct.t")
    public String[] field1269;

    @ObfuscatedName("ct.s")
    public boolean field1267 = false;

    @ObfuscatedName("ct.j")
    public long field1268;

    public class97() {
        int var1 = Statics.field1531.method5144(19);
        this.field1266 = new HashMap();
        this.field1264 = new boolean[var1];
        for (int var2 = 0; var2 < var1; var2++) {
            class165 var3 = (class165) class165.field1774.method4514((long) var2);
            class165 var4;
            if (var3 == null) {
                byte[] var5 = Statics.field1775.method5053(19, var2);
                class165 var6 = new class165();
                if (var5 != null) {
                    var6.method2899(new class419(var5));
                }
                class165.field1774.method4515(var6, (long) var2);
                var4 = var6;
            } else {
                var4 = var3;
            }
            this.field1264[var2] = var4.field1776;
        }
        int var8 = 0;
        if (Statics.field1531.method5045(15)) {
            var8 = Statics.field1531.method5144(15);
        }
        this.field1269 = new String[var8];
        this.method2271();
    }

    @ObfuscatedName("ct.c(IIB)V")
    public void method2295(int arg0, int arg1) {
        this.field1266.put(arg0, arg1);
        if (this.field1264[arg0]) {
            this.field1267 = true;
        }
    }

    @ObfuscatedName("ct.b(II)I")
    public int method2263(int arg0) {
        Object var2 = this.field1266.get(arg0);
        return var2 instanceof Integer ? (Integer) var2 : -1;
    }

    @ObfuscatedName("ct.p(ILjava/lang/String;I)V")
    public void method2264(int arg0, String arg1) {
        this.field1266.put(arg0, arg1);
    }

    @ObfuscatedName("ct.m(IB)Ljava/lang/String;")
    public String method2269(int arg0) {
        Object var2 = this.field1266.get(arg0);
        return var2 instanceof String ? (String) var2 : "";
    }

    /**
     * @deprecated
     */
    @Deprecated
    @ObfuscatedName("ct.t(ILjava/lang/String;I)V")
    public void method2266(int arg0, String arg1) {
        this.field1269[arg0] = arg1;
    }

    /**
     * @deprecated
     */
    @Deprecated
    @ObfuscatedName("ct.s(II)Ljava/lang/String;")
    public String method2267(int arg0) {
        return this.field1269[arg0];
    }

    @ObfuscatedName("ct.j(I)V")
    public void method2294() {
        for (int var1 = 0; var1 < this.field1264.length; var1++) {
            if (!this.field1264[var1]) {
                this.field1266.remove(var1);
            }
        }
        for (int var2 = 0; var2 < this.field1269.length; var2++) {
            this.field1269[var2] = null;
        }
    }

    @ObfuscatedName("ct.w(ZI)Loa;")
    public class402 method2265(boolean arg0) {
        return class154.method4394("2", Statics.field4055.field3455, arg0);
    }

    @ObfuscatedName("ct.n(I)V")
    public void method2270() {
        class402 var1 = this.method2265(true);
        try {
            int var2 = 3;
            int var3 = 0;
            Iterator var4 = this.field1266.entrySet().iterator();
            while (var4.hasNext()) {
                Entry var5 = (Entry) var4.next();
                int var6 = (Integer) var5.getKey();
                if (this.field1264[var6]) {
                    Object var7 = var5.getValue();
                    var2 += 3;
                    if (var7 instanceof Integer) {
                        var2 += 4;
                    } else if (var7 instanceof String) {
                        var2 += class419.method2537((String) var7);
                    }
                    var3++;
                }
            }
            class419 var8 = new class419(var2);
            var8.method6841(2);
            var8.method6654(var3);
            Iterator var9 = this.field1266.entrySet().iterator();
            while (var9.hasNext()) {
                Entry var10 = (Entry) var9.next();
                int var11 = (Integer) var10.getKey();
                if (this.field1264[var11]) {
                    var8.method6654(var11);
                    Object var12 = var10.getValue();
                    class410 var13 = class410.method6566(var12.getClass());
                    var8.method6841(var13.field4453);
                    class410.method6571(var12, var8);
                }
            }
            var1.method6486(var8.field4477, 0, var8.field4475);
        } catch (Exception var25) {
        } finally {
            try {
                var1.method6487();
            } catch (Exception var24) {
            }
        }
        this.field1267 = false;
        this.field1268 = class416.method5860();
    }

    @ObfuscatedName("ct.r(I)V")
    public void method2271() {
        class402 var1 = this.method2265(false);
        label217: {
            try {
                byte[] var2 = new byte[(int) var1.method6484()];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method6490(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }
                class419 var5 = new class419(var2);
                if (var5.field4477.length - var5.field4475 >= 1) {
                    int var7 = var5.method6781();
                    if (var7 >= 0 && var7 <= 2) {
                        if (var7 >= 2) {
                            int var9 = var5.method6672();
                            int var10 = 0;
                            while (true) {
                                if (var10 >= var9) {
                                    break label217;
                                }
                                int var11 = var5.method6672();
                                int var12 = var5.method6781();
                                class410[] var13 = new class410[] { class410.field4443, class410.field4450, class410.field4446 };
                                class410 var14 = (class410) class316.method2616(var13, var12);
                                Object var15 = var14.method6568(var5);
                                if (this.field1264[var11]) {
                                    this.field1266.put(var11, var15);
                                }
                                var10++;
                            }
                        } else {
                            int var16 = var5.method6672();
                            for (int var17 = 0; var17 < var16; var17++) {
                                int var18 = var5.method6672();
                                int var19 = var5.method6675();
                                if (this.field1264[var18]) {
                                    this.field1266.put(var18, var19);
                                }
                            }
                            int var20 = var5.method6672();
                            int var21 = 0;
                            while (true) {
                                if (var21 >= var20) {
                                    break label217;
                                }
                                var5.method6672();
                                var5.method6707();
                                var21++;
                            }
                        }
                    }
                    return;
                }
            } catch (Exception var35) {
                break label217;
            } finally {
                try {
                    var1.method6487();
                } catch (Exception var34) {
                }
            }
            return;
        }
        this.field1267 = false;
    }

    @ObfuscatedName("ct.o(I)V")
    public void method2262() {
        if (this.field1267 && this.field1268 < class416.method5860() - 60000L) {
            this.method2270();
        }
    }

    @ObfuscatedName("ct.v(I)Z")
    public boolean method2273() {
        return this.field1267;
    }
}
