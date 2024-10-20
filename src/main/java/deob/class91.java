package deob;

import java.io.EOFException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

@ObfuscatedName("ch")
public class class91 {

    @ObfuscatedName("ch.q")
    public boolean[] field1245;

    @ObfuscatedName("ch.w")
    public Map field1243;

    @ObfuscatedName("ch.o")
    public String[] field1246;

    @ObfuscatedName("ch.u")
    public boolean field1241 = false;

    @ObfuscatedName("ch.g")
    public long field1247;

    public class91() {
        int var1 = Statics.field1056.method4168(19);
        this.field1243 = new HashMap();
        this.field1245 = new boolean[var1];
        for (int var2 = 0; var2 < var1; var2++) {
            class254 var3 = class254.method3666(var2);
            this.field1245[var2] = var3.field3310;
        }
        int var4 = 0;
        if (Statics.field1056.method4272(15)) {
            var4 = Statics.field1056.method4168(15);
        }
        this.field1246 = new String[var4];
        this.method1948();
    }

    @ObfuscatedName("ch.m(III)V")
    public void method1939(int arg0, int arg1) {
        this.field1243.put(arg0, arg1);
        if (this.field1245[arg0]) {
            this.field1241 = true;
        }
    }

    @ObfuscatedName("ch.f(IB)I")
    public int method1940(int arg0) {
        Object var2 = this.field1243.get(arg0);
        return var2 instanceof Integer ? (Integer) var2 : -1;
    }

    @ObfuscatedName("ch.q(ILjava/lang/String;I)V")
    public void method1941(int arg0, String arg1) {
        this.field1243.put(arg0, arg1);
    }

    @ObfuscatedName("ch.w(II)Ljava/lang/String;")
    public String method1969(int arg0) {
        Object var2 = this.field1243.get(arg0);
        return var2 instanceof String ? (String) var2 : "";
    }

    @ObfuscatedName("ch.o(ILjava/lang/String;B)V")
    public void method1968(int arg0, String arg1) {
        this.field1246[arg0] = arg1;
    }

    @ObfuscatedName("ch.u(IB)Ljava/lang/String;")
    public String method1944(int arg0) {
        return this.field1246[arg0];
    }

    @ObfuscatedName("ch.g(I)V")
    public void method1943() {
        for (int var1 = 0; var1 < this.field1245.length; var1++) {
            if (!this.field1245[var1]) {
                this.field1243.remove(var1);
            }
        }
        for (int var2 = 0; var2 < this.field1246.length; var2++) {
            this.field1246[var2] = null;
        }
    }

    @ObfuscatedName("ch.l(ZB)Ldk;")
    public class119 method1946(boolean arg0) {
        return class169.method3317("2", Statics.field166.field3182, arg0);
    }

    @ObfuscatedName("ch.e(I)V")
    public void method1956() {
        class119 var1 = this.method1946(true);
        try {
            int var2 = 3;
            int var3 = 0;
            Iterator var4 = this.field1243.entrySet().iterator();
            while (var4.hasNext()) {
                Entry var5 = (Entry) var4.next();
                int var6 = (Integer) var5.getKey();
                if (this.field1245[var6]) {
                    Object var7 = var5.getValue();
                    var2 += 3;
                    if (var7 instanceof Integer) {
                        var2 += 4;
                    } else if (var7 instanceof String) {
                        var2 += class202.method493((String) var7);
                    }
                    var3++;
                }
            }
            class202 var8 = new class202(var2);
            var8.method3565(2);
            var8.method3402(var3);
            Iterator var9 = this.field1243.entrySet().iterator();
            label175: while (true) {
                Entry var10;
                int var11;
                do {
                    if (!var9.hasNext()) {
                        var1.method2473(var8.field2440, 0, var8.field2439);
                        break label175;
                    }
                    var10 = (Entry) var9.next();
                    var11 = (Integer) var10.getKey();
                } while (!this.field1245[var11]);
                var8.method3402(var11);
                Object var12 = var10.getValue();
                Class var13 = var12.getClass();
                class4[] var14 = class4.method23();
                int var15 = 0;
                class4 var17;
                while (true) {
                    if (var15 >= var14.length) {
                        var17 = null;
                        break;
                    }
                    class4 var16 = var14[var15];
                    if (var16.field19 == var13) {
                        var17 = var16;
                        break;
                    }
                    var15++;
                }
                var8.method3565(var17.field18);
                Class var19 = var12.getClass();
                class4[] var20 = class4.method23();
                int var21 = 0;
                class4 var23;
                while (true) {
                    if (var21 >= var20.length) {
                        var23 = null;
                        break;
                    }
                    class4 var22 = var20[var21];
                    if (var22.field19 == var19) {
                        var23 = var22;
                        break;
                    }
                    var21++;
                }
                if (var23 == null) {
                    throw new IllegalArgumentException();
                }
                class1 var25 = var23.field20;
                var25.method4(var12, var8);
            }
        } catch (Exception var38) {
        } finally {
            try {
                var1.method2474();
            } catch (Exception var37) {
            }
        }
        this.field1241 = false;
        this.field1247 = class204.method3658();
    }

    @ObfuscatedName("ch.x(I)V")
    public void method1948() {
        class119 var1 = this.method1946(false);
        label204: {
            try {
                byte[] var2 = new byte[(int) var1.method2476()];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method2477(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }
                class202 var5 = new class202(var2);
                if (var5.field2440.length - var5.field2439 >= 1) {
                    int var7 = var5.method3551();
                    if (var7 < 0 || var7 > 2) {
                        return;
                    }
                    if (var7 >= 2) {
                        int var9 = var5.method3530();
                        int var10 = 0;
                        while (true) {
                            if (var10 >= var9) {
                                break label204;
                            }
                            int var11 = var5.method3530();
                            int var12 = var5.method3551();
                            class4 var13 = (class4) class197.method999(class4.method23(), var12);
                            Object var14 = var13.method20(var5);
                            if (this.field1245[var11]) {
                                this.field1243.put(var11, var14);
                            }
                            var10++;
                        }
                    } else {
                        int var15 = var5.method3530();
                        for (int var16 = 0; var16 < var15; var16++) {
                            int var17 = var5.method3530();
                            int var18 = var5.method3620();
                            if (this.field1245[var17]) {
                                this.field1243.put(var17, var18);
                            }
                        }
                        int var19 = var5.method3530();
                        int var20 = 0;
                        while (true) {
                            if (var20 >= var19) {
                                break label204;
                            }
                            var5.method3530();
                            var5.method3426();
                            var20++;
                        }
                    }
                }
            } catch (Exception var34) {
                break label204;
            } finally {
                try {
                    var1.method2474();
                } catch (Exception var33) {
                }
            }
            return;
        }
        this.field1241 = false;
    }

    @ObfuscatedName("ch.d(I)V")
    public void method1970() {
        if (this.field1241 && this.field1247 < class204.method3658() - 60000L) {
            this.method1956();
        }
    }

    @ObfuscatedName("ch.a(I)Z")
    public boolean method1950() {
        return this.field1241;
    }
}
