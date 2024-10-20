package deob;

import java.io.EOFException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

@ObfuscatedName("cq")
public class class90 {

    @ObfuscatedName("cq.g")
    public boolean[] field1251;

    @ObfuscatedName("cq.x")
    public Map field1257;

    @ObfuscatedName("cq.h")
    public String[] field1252;

    @ObfuscatedName("cq.f")
    public boolean field1254 = false;

    @ObfuscatedName("cq.p")
    public long field1255;

    public class90() {
        int var1 = Statics.field97.method4419(19);
        this.field1257 = new HashMap();
        this.field1251 = new boolean[var1];
        for (int var2 = 0; var2 < var1; var2++) {
            class264 var3 = (class264) class264.field3344.method3885((long) var2);
            class264 var4;
            if (var3 == null) {
                byte[] var5 = Statics.field3347.method4422(19, var2);
                class264 var6 = new class264();
                if (var5 != null) {
                    var6.method4636(new class190(var5));
                }
                class264.field3344.method3878(var6, (long) var2);
                var4 = var6;
            } else {
                var4 = var3;
            }
            this.field1251[var2] = var4.field3346;
        }
        int var8 = 0;
        if (Statics.field97.method4531(15)) {
            var8 = Statics.field97.method4419(15);
        }
        this.field1252 = new String[var8];
        this.method2018();
    }

    @ObfuscatedName("cq.a(III)V")
    public void method2009(int arg0, int arg1) {
        this.field1257.put(arg0, arg1);
        if (this.field1251[arg0]) {
            this.field1254 = true;
        }
    }

    @ObfuscatedName("cq.s(IB)I")
    public int method2010(int arg0) {
        Object var2 = this.field1257.get(arg0);
        return var2 instanceof Integer ? (Integer) var2 : -1;
    }

    @ObfuscatedName("cq.g(ILjava/lang/String;I)V")
    public void method2011(int arg0, String arg1) {
        this.field1257.put(arg0, arg1);
    }

    @ObfuscatedName("cq.x(II)Ljava/lang/String;")
    public String method2014(int arg0) {
        Object var2 = this.field1257.get(arg0);
        return var2 instanceof String ? (String) var2 : "";
    }

    @ObfuscatedName("cq.h(ILjava/lang/String;I)V")
    public void method2013(int arg0, String arg1) {
        this.field1252[arg0] = arg1;
    }

    @ObfuscatedName("cq.f(II)Ljava/lang/String;")
    public String method2045(int arg0) {
        return this.field1252[arg0];
    }

    @ObfuscatedName("cq.p(B)V")
    public void method2023() {
        for (int var1 = 0; var1 < this.field1251.length; var1++) {
            if (!this.field1251[var1]) {
                this.field1257.remove(var1);
            }
        }
        for (int var2 = 0; var2 < this.field1252.length; var2++) {
            this.field1252[var2] = null;
        }
    }

    @ObfuscatedName("cq.m(ZI)Lda;")
    public class118 method2016(boolean arg0) {
        return class163.method3143("2", Statics.field39.field3224, arg0);
    }

    @ObfuscatedName("cq.q(I)V")
    public void method2008() {
        class118 var1 = this.method2016(true);
        try {
            int var2 = 3;
            int var3 = 0;
            Iterator var4 = this.field1257.entrySet().iterator();
            while (var4.hasNext()) {
                Entry var5 = (Entry) var4.next();
                int var6 = (Integer) var5.getKey();
                if (this.field1251[var6]) {
                    Object var7 = var5.getValue();
                    var2 += 3;
                    if (var7 instanceof Integer) {
                        var2 += 4;
                    } else if (var7 instanceof String) {
                        var2 += class190.method1171((String) var7);
                    }
                    var3++;
                }
            }
            class190 var8 = new class190(var2);
            var8.method3439(2);
            var8.method3440(var3);
            Iterator var9 = this.field1257.entrySet().iterator();
            while (var9.hasNext()) {
                Entry var10 = (Entry) var9.next();
                int var11 = (Integer) var10.getKey();
                if (this.field1251[var11]) {
                    var8.method3440(var11);
                    Object var12 = var10.getValue();
                    class4 var13 = class4.method30(var12.getClass());
                    var8.method3439(var13.field15);
                    class1 var14 = class4.method38(var12.getClass());
                    var14.method2(var12, var8);
                }
            }
            var1.method2540(var8.field2420, 0, var8.field2419);
        } catch (Exception var26) {
        } finally {
            try {
                var1.method2541();
            } catch (Exception var25) {
            }
        }
        this.field1254 = false;
        this.field1255 = class192.method183();
    }

    @ObfuscatedName("cq.b(B)V")
    public void method2018() {
        class118 var1 = this.method2016(false);
        label218: {
            try {
                byte[] var2 = new byte[(int) var1.method2543()];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method2544(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }
                class190 var5 = new class190(var2);
                if (var5.field2420.length - var5.field2419 >= 1) {
                    int var7 = var5.method3443();
                    if (var7 >= 0 && var7 <= 2) {
                        if (var7 >= 2) {
                            int var9 = var5.method3610();
                            int var10 = 0;
                            while (true) {
                                if (var10 >= var9) {
                                    break label218;
                                }
                                int var11 = var5.method3610();
                                int var12 = var5.method3443();
                                class4 var13 = (class4) Statics.method2007(class4.method41(), var12);
                                Object var14 = var13.method33(var5);
                                if (this.field1251[var11]) {
                                    this.field1257.put(var11, var14);
                                }
                                var10++;
                            }
                        } else {
                            int var15 = var5.method3610();
                            for (int var16 = 0; var16 < var15; var16++) {
                                int var17 = var5.method3610();
                                int var18 = var5.method3460();
                                if (this.field1251[var17]) {
                                    this.field1257.put(var17, var18);
                                }
                            }
                            int var19 = var5.method3610();
                            int var20 = 0;
                            while (true) {
                                if (var20 >= var19) {
                                    break label218;
                                }
                                var5.method3610();
                                var5.method3647();
                                var20++;
                            }
                        }
                    }
                    return;
                }
            } catch (Exception var34) {
                break label218;
            } finally {
                try {
                    var1.method2541();
                } catch (Exception var33) {
                }
            }
            return;
        }
        this.field1254 = false;
    }

    @ObfuscatedName("cq.n(B)V")
    public void method2019() {
        if (this.field1254 && this.field1255 < class192.method183() - 60000L) {
            this.method2008();
        }
    }

    @ObfuscatedName("cq.e(B)Z")
    public boolean method2020() {
        return this.field1254;
    }
}
