package deob;

import java.io.EOFException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

@ObfuscatedName("cu")
public class class91 {

    @ObfuscatedName("cu.o")
    public boolean[] field1252;

    @ObfuscatedName("cu.e")
    public Map field1253;

    @ObfuscatedName("cu.i")
    public String[] field1254;

    @ObfuscatedName("cu.g")
    public boolean field1251 = false;

    @ObfuscatedName("cu.d")
    public long field1250;

    public class91() {
        int var1 = Statics.field30.method3848(19);
        this.field1253 = new HashMap();
        this.field1252 = new boolean[var1];
        for (int var2 = 0; var2 < var1; var2++) {
            class244 var3 = (class244) class244.field3233.method3100((long) var2);
            class244 var4;
            if (var3 == null) {
                byte[] var5 = Statics.field3232.method3845(19, var2);
                class244 var6 = new class244();
                if (var5 != null) {
                    var6.method4079(new class301(var5));
                }
                class244.field3233.method3102(var6, (long) var2);
                var4 = var6;
            } else {
                var4 = var3;
            }
            this.field1252[var2] = var4.field3234;
        }
        int var8 = 0;
        if (Statics.field30.method3962(15)) {
            var8 = Statics.field30.method3848(15);
        }
        this.field1254 = new String[var8];
        this.method2023();
    }

    @ObfuscatedName("cu.c(III)V")
    public void method2014(int arg0, int arg1) {
        this.field1253.put(arg0, arg1);
        if (this.field1252[arg0]) {
            this.field1251 = true;
        }
    }

    @ObfuscatedName("cu.t(IB)I")
    public int method2052(int arg0) {
        Object var2 = this.field1253.get(arg0);
        return var2 instanceof Integer ? (Integer) var2 : -1;
    }

    @ObfuscatedName("cu.o(ILjava/lang/String;I)V")
    public void method2016(int arg0, String arg1) {
        this.field1253.put(arg0, arg1);
    }

    @ObfuscatedName("cu.e(IB)Ljava/lang/String;")
    public String method2017(int arg0) {
        Object var2 = this.field1253.get(arg0);
        return var2 instanceof String ? (String) var2 : "";
    }

    @ObfuscatedName("cu.i(ILjava/lang/String;B)V")
    public void method2018(int arg0, String arg1) {
        this.field1254[arg0] = arg1;
    }

    @ObfuscatedName("cu.g(II)Ljava/lang/String;")
    public String method2027(int arg0) {
        return this.field1254[arg0];
    }

    @ObfuscatedName("cu.d(I)V")
    public void method2030() {
        for (int var1 = 0; var1 < this.field1252.length; var1++) {
            if (!this.field1252[var1]) {
                this.field1253.remove(var1);
            }
        }
        for (int var2 = 0; var2 < this.field1254.length; var2++) {
            this.field1254[var2] = null;
        }
    }

    @ObfuscatedName("cu.l(ZI)Lmx;")
    public class344 method2021(boolean arg0) {
        return class168.method264("2", Statics.field103.field3119, arg0);
    }

    @ObfuscatedName("cu.j(I)V")
    public void method2022() {
        class344 var1 = this.method2021(true);
        try {
            int var2 = 3;
            int var3 = 0;
            Iterator var4 = this.field1253.entrySet().iterator();
            while (var4.hasNext()) {
                Entry var5 = (Entry) var4.next();
                int var6 = (Integer) var5.getKey();
                if (this.field1252[var6]) {
                    Object var7 = var5.getValue();
                    var2 += 3;
                    if (var7 instanceof Integer) {
                        var2 += 4;
                    } else if (var7 instanceof String) {
                        var2 += class301.method4819((String) var7);
                    }
                    var3++;
                }
            }
            class301 var8 = new class301(var2);
            var8.method5272(2);
            var8.method5114(var3);
            Iterator var9 = this.field1253.entrySet().iterator();
            while (var9.hasNext()) {
                Entry var10 = (Entry) var9.next();
                int var11 = (Integer) var10.getKey();
                if (this.field1252[var11]) {
                    var8.method5114(var11);
                    Object var12 = var10.getValue();
                    class4 var13 = class4.method38(var12.getClass());
                    var8.method5272(var13.field19);
                    class4.method22(var12, var8);
                }
            }
            var1.method6128(var8.field3708, 0, var8.field3707);
        } catch (Exception var25) {
        } finally {
            try {
                var1.method6129();
            } catch (Exception var24) {
            }
        }
        this.field1251 = false;
        this.field1250 = Statics.method184();
    }

    @ObfuscatedName("cu.m(I)V")
    public void method2023() {
        class344 var1 = this.method2021(false);
        label216: {
            try {
                byte[] var2 = new byte[(int) var1.method6131()];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method6132(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }
                class301 var5 = new class301(var2);
                if (var5.field3708.length - var5.field3707 < 1) {
                    return;
                }
                int var7 = var5.method5129();
                if (var7 >= 0 && var7 <= 2) {
                    if (var7 >= 2) {
                        int var9 = var5.method5124();
                        int var10 = 0;
                        while (true) {
                            if (var10 >= var9) {
                                break label216;
                            }
                            int var11 = var5.method5124();
                            int var12 = var5.method5129();
                            class4[] var13 = new class4[] { class4.field16, class4.field23, class4.field17 };
                            class4 var14 = (class4) class196.method222(var13, var12);
                            Object var15 = var14.method25(var5);
                            if (this.field1252[var11]) {
                                this.field1253.put(var11, var15);
                            }
                            var10++;
                        }
                    } else {
                        int var16 = var5.method5124();
                        for (int var17 = 0; var17 < var16; var17++) {
                            int var18 = var5.method5124();
                            int var19 = var5.method5134();
                            if (this.field1252[var18]) {
                                this.field1253.put(var18, var19);
                            }
                        }
                        int var20 = var5.method5124();
                        int var21 = 0;
                        while (true) {
                            if (var21 >= var20) {
                                break label216;
                            }
                            var5.method5124();
                            var5.method5138();
                            var21++;
                        }
                    }
                }
            } catch (Exception var35) {
                break label216;
            } finally {
                try {
                    var1.method6129();
                } catch (Exception var34) {
                }
            }
            return;
        }
        this.field1251 = false;
    }

    @ObfuscatedName("cu.p(I)V")
    public void method2024() {
        if (this.field1251 && this.field1250 < Statics.method184() - 60000L) {
            this.method2022();
        }
    }

    @ObfuscatedName("cu.h(I)Z")
    public boolean method2025() {
        return this.field1251;
    }
}
