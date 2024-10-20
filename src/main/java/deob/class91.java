package deob;

import java.io.EOFException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

@ObfuscatedName("ck")
public class class91 {

    @ObfuscatedName("ck.y")
    public boolean[] field1246;

    @ObfuscatedName("ck.w")
    public Map field1247;

    @ObfuscatedName("ck.p")
    public String[] field1248;

    @ObfuscatedName("ck.b")
    public boolean field1253 = false;

    @ObfuscatedName("ck.e")
    public long field1250;

    public class91() {
        int var1 = Statics.field6.method3764(19);
        this.field1247 = new HashMap();
        this.field1246 = new boolean[var1];
        for (int var2 = 0; var2 < var1; var2++) {
            class243 var3 = class243.method3654(var2);
            this.field1246[var2] = var3.field3207;
        }
        int var4 = 0;
        if (Statics.field6.method3893(15)) {
            var4 = Statics.field6.method3764(15);
        }
        this.field1248 = new String[var4];
        this.method1979();
    }

    @ObfuscatedName("ck.f(IIB)V")
    public void method1977(int arg0, int arg1) {
        this.field1247.put(arg0, arg1);
        if (this.field1246[arg0]) {
            this.field1253 = true;
        }
    }

    @ObfuscatedName("ck.i(II)I")
    public int method1978(int arg0) {
        Object var2 = this.field1247.get(arg0);
        return var2 instanceof Integer ? (Integer) var2 : -1;
    }

    @ObfuscatedName("ck.y(ILjava/lang/String;B)V")
    public void method1985(int arg0, String arg1) {
        this.field1247.put(arg0, arg1);
    }

    @ObfuscatedName("ck.w(IB)Ljava/lang/String;")
    public String method1980(int arg0) {
        Object var2 = this.field1247.get(arg0);
        return var2 instanceof String ? (String) var2 : "";
    }

    @ObfuscatedName("ck.p(ILjava/lang/String;B)V")
    public void method1976(int arg0, String arg1) {
        this.field1248[arg0] = arg1;
    }

    @ObfuscatedName("ck.b(II)Ljava/lang/String;")
    public String method2010(int arg0) {
        return this.field1248[arg0];
    }

    @ObfuscatedName("ck.e(I)V")
    public void method1984() {
        for (int var1 = 0; var1 < this.field1246.length; var1++) {
            if (!this.field1246[var1]) {
                this.field1247.remove(var1);
            }
        }
        for (int var2 = 0; var2 < this.field1248.length; var2++) {
            this.field1248[var2] = null;
        }
    }

    @ObfuscatedName("ck.x(ZI)Lmk;")
    public class343 method2011(boolean arg0) {
        return class168.method2049("2", Statics.field285.field3084, arg0);
    }

    @ObfuscatedName("ck.a(S)V")
    public void method2018() {
        class343 var1 = this.method2011(true);
        try {
            int var2 = 3;
            int var3 = 0;
            Iterator var4 = this.field1247.entrySet().iterator();
            while (var4.hasNext()) {
                Entry var5 = (Entry) var4.next();
                int var6 = (Integer) var5.getKey();
                if (this.field1246[var6]) {
                    Object var7 = var5.getValue();
                    var2 += 3;
                    if (var7 instanceof Integer) {
                        var2 += 4;
                    } else if (var7 instanceof String) {
                        var2 += class300.method2738((String) var7);
                    }
                    var3++;
                }
            }
            class300 var8 = new class300(var2);
            var8.method5094(2);
            var8.method5095(var3);
            Iterator var9 = this.field1247.entrySet().iterator();
            label144: while (true) {
                Entry var10;
                int var11;
                do {
                    if (!var9.hasNext()) {
                        var1.method6095(var8.field3704, 0, var8.field3703);
                        break label144;
                    }
                    var10 = (Entry) var9.next();
                    var11 = (Integer) var10.getKey();
                } while (!this.field1246[var11]);
                var8.method5095(var11);
                Object var12 = var10.getValue();
                Class var13 = var12.getClass();
                class4[] var14 = new class4[] { class4.field20, class4.field10, class4.field11 };
                class4[] var15 = var14;
                int var16 = 0;
                class4 var18;
                while (true) {
                    if (var16 >= var15.length) {
                        var18 = null;
                        break;
                    }
                    class4 var17 = var15[var16];
                    if (var17.field13 == var13) {
                        var18 = var17;
                        break;
                    }
                    var16++;
                }
                var8.method5094(var18.field12);
                class4.method23(var12, var8);
            }
        } catch (Exception var31) {
        } finally {
            try {
                var1.method6105();
            } catch (Exception var30) {
            }
        }
        this.field1253 = false;
        this.field1250 = class297.method481();
    }

    @ObfuscatedName("ck.d(I)V")
    public void method1979() {
        class343 var1 = this.method2011(false);
        label218: {
            try {
                byte[] var2 = new byte[(int) var1.method6098()];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method6097(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }
                class300 var5 = new class300(var2);
                if (var5.field3704.length - var5.field3703 >= 1) {
                    int var7 = var5.method5110();
                    if (var7 >= 0 && var7 <= 2) {
                        if (var7 >= 2) {
                            int var9 = var5.method5112();
                            int var10 = 0;
                            while (true) {
                                if (var10 >= var9) {
                                    break label218;
                                }
                                int var11 = var5.method5112();
                                int var12 = var5.method5110();
                                class4[] var13 = new class4[] { class4.field20, class4.field10, class4.field11 };
                                class4 var14 = (class4) class196.method2065(var13, var12);
                                Object var15 = var14.method25(var5);
                                if (this.field1246[var11]) {
                                    this.field1247.put(var11, var15);
                                }
                                var10++;
                            }
                        } else {
                            int var16 = var5.method5112();
                            for (int var17 = 0; var17 < var16; var17++) {
                                int var18 = var5.method5112();
                                int var19 = var5.method5192();
                                if (this.field1246[var18]) {
                                    this.field1247.put(var18, var19);
                                }
                            }
                            int var20 = var5.method5112();
                            int var21 = 0;
                            while (true) {
                                if (var21 >= var20) {
                                    break label218;
                                }
                                var5.method5112();
                                var5.method5119();
                                var21++;
                            }
                        }
                    }
                    return;
                }
            } catch (Exception var35) {
                break label218;
            } finally {
                try {
                    var1.method6105();
                } catch (Exception var34) {
                }
            }
            return;
        }
        this.field1253 = false;
    }

    @ObfuscatedName("ck.c(B)V")
    public void method1987() {
        if (this.field1253 && this.field1250 < class297.method481() - 60000L) {
            this.method2018();
        }
    }

    @ObfuscatedName("ck.o(I)Z")
    public boolean method1988() {
        return this.field1253;
    }
}
