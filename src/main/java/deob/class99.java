package deob;

import java.io.EOFException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

@Deprecated
@ObfuscatedName("cb")
public class class99 {

    @ObfuscatedName("cb.f")
    public boolean[] field1326;

    @ObfuscatedName("cb.n")
    public Map field1332;

    /**
     * @deprecated
     */
    @ObfuscatedName("cb.k")
    public String[] field1327;

    @ObfuscatedName("cb.w")
    public boolean field1329 = false;

    @ObfuscatedName("cb.s")
    public long field1330;

    public class99() {
        int var1 = Statics.field1483.method5425(19);
        this.field1332 = new HashMap();
        this.field1326 = new boolean[var1];
        for (int var2 = 0; var2 < var1; var2++) {
            class173 var3 = (class173) class173.field1873.method4789((long) var2);
            class173 var4;
            if (var3 == null) {
                byte[] var5 = Statics.field1870.method5499(19, var2);
                class173 var6 = new class173();
                if (var5 != null) {
                    var6.method3197(new class445(var5));
                }
                class173.field1873.method4781(var6, (long) var2);
                var4 = var6;
            } else {
                var4 = var3;
            }
            this.field1326[var2] = var4.field1872;
        }
        int var8 = 0;
        if (Statics.field1483.method5379(15)) {
            var8 = Statics.field1483.method5425(15);
        }
        this.field1327 = new String[var8];
        this.method2476();
    }

    @ObfuscatedName("cb.c(IIS)V")
    public void method2500(int arg0, int arg1) {
        this.field1332.put(arg0, arg1);
        if (this.field1326[arg0]) {
            this.field1329 = true;
        }
    }

    @ObfuscatedName("cb.p(IB)I")
    public int method2489(int arg0) {
        Object var2 = this.field1332.get(arg0);
        return var2 instanceof Integer ? (Integer) var2 : -1;
    }

    @ObfuscatedName("cb.f(ILjava/lang/String;I)V")
    public void method2491(int arg0, String arg1) {
        this.field1332.put(arg0, arg1);
    }

    @ObfuscatedName("cb.n(II)Ljava/lang/String;")
    public String method2503(int arg0) {
        Object var2 = this.field1332.get(arg0);
        return var2 instanceof String ? (String) var2 : "";
    }

    /**
     * @deprecated
     */
    @Deprecated
    @ObfuscatedName("cb.k(ILjava/lang/String;I)V")
    public void method2501(int arg0, String arg1) {
        this.field1327[arg0] = arg1;
    }

    /**
     * @deprecated
     */
    @Deprecated
    @ObfuscatedName("cb.w(IB)Ljava/lang/String;")
    public String method2472(int arg0) {
        return this.field1327[arg0];
    }

    @ObfuscatedName("cb.s(I)V")
    public void method2473() {
        for (int var1 = 0; var1 < this.field1326.length; var1++) {
            if (!this.field1326[var1]) {
                this.field1332.remove(var1);
            }
        }
        for (int var2 = 0; var2 < this.field1327.length; var2++) {
            this.field1327[var2] = null;
        }
    }

    @ObfuscatedName("cb.q(ZI)Lpk;")
    public class427 method2474(boolean arg0) {
        return class159.method4267("2", Statics.field1730.field3639, arg0);
    }

    @ObfuscatedName("cb.m(B)V")
    public void method2475() {
        class427 var1 = this.method2474(true);
        try {
            int var2 = 3;
            int var3 = 0;
            Iterator var4 = this.field1332.entrySet().iterator();
            while (var4.hasNext()) {
                Entry var5 = (Entry) var4.next();
                int var6 = (Integer) var5.getKey();
                if (this.field1326[var6]) {
                    Object var7 = var5.getValue();
                    var2 += 3;
                    if (var7 instanceof Integer) {
                        var2 += 4;
                    } else if (var7 instanceof String) {
                        var2 += class445.method6110((String) var7);
                    }
                    var3++;
                }
            }
            class445 var8 = new class445(var2);
            var8.method7179(2);
            var8.method7286(var3);
            Iterator var9 = this.field1332.entrySet().iterator();
            while (var9.hasNext()) {
                Entry var10 = (Entry) var9.next();
                int var11 = (Integer) var10.getKey();
                if (this.field1326[var11]) {
                    var8.method7286(var11);
                    Object var12 = var10.getValue();
                    class435 var13 = class435.method7068(var12.getClass());
                    var8.method7179(var13.field4693);
                    class435.method7058(var12, var8);
                }
            }
            var1.method6973(var8.field4733, 0, var8.field4735);
        } catch (Exception var25) {
        } finally {
            try {
                var1.method6991();
            } catch (Exception var24) {
            }
        }
        this.field1329 = false;
        this.field1330 = class271.method5624();
    }

    @ObfuscatedName("cb.x(I)V")
    public void method2476() {
        class427 var1 = this.method2474(false);
        label215: {
            try {
                byte[] var2 = new byte[(int) var1.method6976()];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method6977(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }
                class445 var5 = new class445(var2);
                if (var5.field4733.length - var5.field4735 < 1) {
                    return;
                }
                int var7 = var5.method7196();
                if (var7 >= 0 && var7 <= 2) {
                    if (var7 >= 2) {
                        int var9 = var5.method7198();
                        int var10 = 0;
                        while (true) {
                            if (var10 >= var9) {
                                break label215;
                            }
                            int var11 = var5.method7198();
                            int var12 = var5.method7196();
                            class435 var13 = (class435) class331.method5118(class435.method7062(), var12);
                            Object var14 = var13.method7060(var5);
                            if (this.field1326[var11]) {
                                this.field1332.put(var11, var14);
                            }
                            var10++;
                        }
                    } else {
                        int var15 = var5.method7198();
                        for (int var16 = 0; var16 < var15; var16++) {
                            int var17 = var5.method7198();
                            int var18 = var5.method7201();
                            if (this.field1326[var17]) {
                                this.field1332.put(var17, var18);
                            }
                        }
                        int var19 = var5.method7198();
                        int var20 = 0;
                        while (true) {
                            if (var20 >= var19) {
                                break label215;
                            }
                            var5.method7198();
                            var5.method7206();
                            var20++;
                        }
                    }
                }
            } catch (Exception var34) {
                break label215;
            } finally {
                try {
                    var1.method6991();
                } catch (Exception var33) {
                }
            }
            return;
        }
        this.field1329 = false;
    }

    @ObfuscatedName("cb.j(I)V")
    public void method2470() {
        if (this.field1329 && this.field1330 < class271.method5624() - 60000L) {
            this.method2475();
        }
    }

    @ObfuscatedName("cb.v(I)Z")
    public boolean method2478() {
        return this.field1329;
    }
}
