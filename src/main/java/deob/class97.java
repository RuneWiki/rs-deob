package deob;

import java.io.EOFException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

@ObfuscatedName("cf")
public class class97 {

    @ObfuscatedName("cf.f")
    public boolean[] field1267;

    @ObfuscatedName("cf.j")
    public Map field1266;

    @ObfuscatedName("cf.m")
    public String[] field1263;

    @ObfuscatedName("cf.k")
    public boolean field1268 = false;

    @ObfuscatedName("cf.t")
    public long field1269;

    public class97() {
        int var1 = Statics.field1989.method4774(19);
        this.field1266 = new HashMap();
        this.field1267 = new boolean[var1];
        for (int var2 = 0; var2 < var1; var2++) {
            class155 var3 = class155.method2534(var2);
            this.field1267[var2] = var3.field1651;
        }
        int var4 = 0;
        if (Statics.field1989.method4717(15)) {
            var4 = Statics.field1989.method4774(15);
        }
        this.field1263 = new String[var4];
        this.method2193();
    }

    @ObfuscatedName("cf.l(III)V")
    public void method2184(int arg0, int arg1) {
        this.field1266.put(arg0, arg1);
        if (this.field1267[arg0]) {
            this.field1268 = true;
        }
    }

    @ObfuscatedName("cf.q(II)I")
    public int method2211(int arg0) {
        Object var2 = this.field1266.get(arg0);
        return var2 instanceof Integer ? (Integer) var2 : -1;
    }

    @ObfuscatedName("cf.f(ILjava/lang/String;I)V")
    public void method2199(int arg0, String arg1) {
        this.field1266.put(arg0, arg1);
    }

    @ObfuscatedName("cf.j(II)Ljava/lang/String;")
    public String method2187(int arg0) {
        Object var2 = this.field1266.get(arg0);
        return var2 instanceof String ? (String) var2 : "";
    }

    @ObfuscatedName("cf.m(ILjava/lang/String;I)V")
    public void method2183(int arg0, String arg1) {
        this.field1263[arg0] = arg1;
    }

    @ObfuscatedName("cf.k(II)Ljava/lang/String;")
    public String method2205(int arg0) {
        return this.field1263[arg0];
    }

    @ObfuscatedName("cf.t(I)V")
    public void method2190() {
        for (int var1 = 0; var1 < this.field1267.length; var1++) {
            if (!this.field1267[var1]) {
                this.field1266.remove(var1);
            }
        }
        for (int var2 = 0; var2 < this.field1263.length; var2++) {
            this.field1263[var2] = null;
        }
    }

    @ObfuscatedName("cf.a(ZI)Lnj;")
    public class385 method2191(boolean arg0) {
        return class144.method1543("2", Statics.field4268.field3310, arg0);
    }

    @ObfuscatedName("cf.e(I)V")
    public void method2186() {
        class385 var1 = this.method2191(true);
        try {
            int var2 = 3;
            int var3 = 0;
            Iterator var4 = this.field1266.entrySet().iterator();
            while (var4.hasNext()) {
                Entry var5 = (Entry) var4.next();
                int var6 = (Integer) var5.getKey();
                if (this.field1267[var6]) {
                    Object var7 = var5.getValue();
                    var2 += 3;
                    if (var7 instanceof Integer) {
                        var2 += 4;
                    } else if (var7 instanceof String) {
                        var2 += class401.method2370((String) var7);
                    }
                    var3++;
                }
            }
            class401 var8 = new class401(var2);
            var8.method6269(2);
            var8.method6256(var3);
            Iterator var9 = this.field1266.entrySet().iterator();
            label144: while (true) {
                Entry var10;
                int var11;
                do {
                    if (!var9.hasNext()) {
                        var1.method6094(var8.field4294, 0, var8.field4292);
                        break label144;
                    }
                    var10 = (Entry) var9.next();
                    var11 = (Integer) var10.getKey();
                } while (!this.field1267[var11]);
                var8.method6256(var11);
                Object var12 = var10.getValue();
                Class var13 = var12.getClass();
                class393[] var14 = new class393[] { class393.field4267, class393.field4265, class393.field4274 };
                class393[] var15 = var14;
                int var16 = 0;
                class393 var18;
                while (true) {
                    if (var16 >= var15.length) {
                        var18 = null;
                        break;
                    }
                    class393 var17 = var15[var16];
                    if (var17.field4266 == var13) {
                        var18 = var17;
                        break;
                    }
                    var16++;
                }
                var8.method6269(var18.field4261);
                class393.method6183(var12, var8);
            }
        } catch (Exception var31) {
        } finally {
            try {
                var1.method6092();
            } catch (Exception var30) {
            }
        }
        this.field1268 = false;
        this.field1269 = class398.method2299();
    }

    @ObfuscatedName("cf.i(B)V")
    public void method2193() {
        class385 var1 = this.method2191(false);
        label204: {
            try {
                byte[] var2 = new byte[(int) var1.method6100()];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method6096(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }
                class401 var5 = new class401(var2);
                if (var5.field4294.length - var5.field4292 >= 1) {
                    int var7 = var5.method6272();
                    if (var7 < 0 || var7 > 2) {
                        return;
                    }
                    if (var7 >= 2) {
                        int var9 = var5.method6284();
                        int var10 = 0;
                        while (true) {
                            if (var10 >= var9) {
                                break label204;
                            }
                            int var11 = var5.method6284();
                            int var12 = var5.method6272();
                            class393[] var13 = new class393[] { class393.field4267, class393.field4265, class393.field4274 };
                            class393 var14 = (class393) class304.method2484(var13, var12);
                            Object var15 = var14.method6185(var5);
                            if (this.field1267[var11]) {
                                this.field1266.put(var11, var15);
                            }
                            var10++;
                        }
                    } else {
                        int var16 = var5.method6284();
                        for (int var17 = 0; var17 < var16; var17++) {
                            int var18 = var5.method6284();
                            int var19 = var5.method6277();
                            if (this.field1267[var18]) {
                                this.field1266.put(var18, var19);
                            }
                        }
                        int var20 = var5.method6284();
                        int var21 = 0;
                        while (true) {
                            if (var21 >= var20) {
                                break label204;
                            }
                            var5.method6284();
                            var5.method6474();
                            var21++;
                        }
                    }
                }
            } catch (Exception var35) {
                break label204;
            } finally {
                try {
                    var1.method6092();
                } catch (Exception var34) {
                }
            }
            return;
        }
        this.field1268 = false;
    }

    @ObfuscatedName("cf.y(I)V")
    public void method2213() {
        if (this.field1268 && this.field1269 < class398.method2299() - 60000L) {
            this.method2186();
        }
    }

    @ObfuscatedName("cf.w(B)Z")
    public boolean method2195() {
        return this.field1268;
    }
}
