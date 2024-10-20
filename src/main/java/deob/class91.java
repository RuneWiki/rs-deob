package deob;

import java.io.EOFException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

@ObfuscatedName("cj")
public class class91 {

    @ObfuscatedName("cj.t")
    public boolean[] field1241;

    @ObfuscatedName("cj.g")
    public Map field1238;

    @ObfuscatedName("cj.l")
    public String[] field1239;

    @ObfuscatedName("cj.u")
    public boolean field1236 = false;

    @ObfuscatedName("cj.j")
    public long field1240;

    public class91() {
        int var1 = Statics.field2075.method3837(19);
        this.field1238 = new HashMap();
        this.field1241 = new boolean[var1];
        for (int var2 = 0; var2 < var1; var2++) {
            class243 var3 = class243.method3348(var2);
            this.field1241[var2] = var3.field3210;
        }
        int var4 = 0;
        if (Statics.field2075.method3942(15)) {
            var4 = Statics.field2075.method3837(15);
        }
        this.field1239 = new String[var4];
        this.method1994();
    }

    @ObfuscatedName("cj.c(IIS)V")
    public void method2012(int arg0, int arg1) {
        this.field1238.put(arg0, arg1);
        if (this.field1241[arg0]) {
            this.field1236 = true;
        }
    }

    @ObfuscatedName("cj.x(II)I")
    public int method2014(int arg0) {
        Object var2 = this.field1238.get(arg0);
        return var2 instanceof Integer ? (Integer) var2 : -1;
    }

    @ObfuscatedName("cj.t(ILjava/lang/String;I)V")
    public void method1979(int arg0, String arg1) {
        this.field1238.put(arg0, arg1);
    }

    @ObfuscatedName("cj.g(IB)Ljava/lang/String;")
    public String method1980(int arg0) {
        Object var2 = this.field1238.get(arg0);
        return var2 instanceof String ? (String) var2 : "";
    }

    @ObfuscatedName("cj.l(ILjava/lang/String;I)V")
    public void method1981(int arg0, String arg1) {
        this.field1239[arg0] = arg1;
    }

    @ObfuscatedName("cj.u(II)Ljava/lang/String;")
    public String method1991(int arg0) {
        return this.field1239[arg0];
    }

    @ObfuscatedName("cj.j(I)V")
    public void method1983() {
        for (int var1 = 0; var1 < this.field1241.length; var1++) {
            if (!this.field1241[var1]) {
                this.field1238.remove(var1);
            }
        }
        for (int var2 = 0; var2 < this.field1239.length; var2++) {
            this.field1239[var2] = null;
        }
    }

    @ObfuscatedName("cj.v(ZI)Lmr;")
    public class343 method1984(boolean arg0) {
        return class168.method96("2", Statics.field360.field3084, arg0);
    }

    @ObfuscatedName("cj.d(B)V")
    public void method1985() {
        class343 var1 = this.method1984(true);
        try {
            int var2 = 3;
            int var3 = 0;
            Iterator var4 = this.field1238.entrySet().iterator();
            while (var4.hasNext()) {
                Entry var5 = (Entry) var4.next();
                int var6 = (Integer) var5.getKey();
                if (this.field1241[var6]) {
                    Object var7 = var5.getValue();
                    var2 += 3;
                    if (var7 instanceof Integer) {
                        var2 += 4;
                    } else if (var7 instanceof String) {
                        var2 += class300.method2018((String) var7);
                    }
                    var3++;
                }
            }
            class300 var8 = new class300(var2);
            var8.method5087(2);
            var8.method5145(var3);
            Iterator var9 = this.field1238.entrySet().iterator();
            label175: while (true) {
                Entry var10;
                int var11;
                do {
                    if (!var9.hasNext()) {
                        var1.method6102(var8.field3694, 0, var8.field3696);
                        break label175;
                    }
                    var10 = (Entry) var9.next();
                    var11 = (Integer) var10.getKey();
                } while (!this.field1241[var11]);
                var8.method5145(var11);
                Object var12 = var10.getValue();
                Class var13 = var12.getClass();
                class4[] var14 = new class4[] { class4.field11, class4.field14, class4.field8 };
                class4[] var15 = var14;
                int var16 = 0;
                class4 var18;
                while (true) {
                    if (var16 >= var15.length) {
                        var18 = null;
                        break;
                    }
                    class4 var17 = var15[var16];
                    if (var17.field12 == var13) {
                        var18 = var17;
                        break;
                    }
                    var16++;
                }
                var8.method5087(var18.field13);
                Class var20 = var12.getClass();
                class4[] var21 = new class4[] { class4.field11, class4.field14, class4.field8 };
                class4[] var22 = var21;
                int var23 = 0;
                class4 var25;
                while (true) {
                    if (var23 >= var22.length) {
                        var25 = null;
                        break;
                    }
                    class4 var24 = var22[var23];
                    if (var24.field12 == var20) {
                        var25 = var24;
                        break;
                    }
                    var23++;
                }
                if (var25 == null) {
                    throw new IllegalArgumentException();
                }
                class1 var27 = var25.field9;
                var27.method5(var12, var8);
            }
        } catch (Exception var40) {
        } finally {
            try {
                var1.method6094();
            } catch (Exception var39) {
            }
        }
        this.field1236 = false;
        this.field1240 = Statics.method2303();
    }

    @ObfuscatedName("cj.z(B)V")
    public void method1994() {
        class343 var1 = this.method1984(false);
        label204: {
            try {
                byte[] var2 = new byte[(int) var1.method6096()];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method6097(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }
                class300 var5 = new class300(var2);
                if (var5.field3694.length - var5.field3696 >= 1) {
                    int var7 = var5.method5103();
                    if (var7 < 0 || var7 > 2) {
                        return;
                    }
                    if (var7 >= 2) {
                        int var9 = var5.method5304();
                        int var10 = 0;
                        while (true) {
                            if (var10 >= var9) {
                                break label204;
                            }
                            int var11 = var5.method5304();
                            int var12 = var5.method5103();
                            class4[] var13 = new class4[] { class4.field11, class4.field14, class4.field8 };
                            class4 var14 = (class4) class196.method3332(var13, var12);
                            Object var15 = var14.method28(var5);
                            if (this.field1241[var11]) {
                                this.field1238.put(var11, var15);
                            }
                            var10++;
                        }
                    } else {
                        int var16 = var5.method5304();
                        for (int var17 = 0; var17 < var16; var17++) {
                            int var18 = var5.method5304();
                            int var19 = var5.method5208();
                            if (this.field1241[var18]) {
                                this.field1238.put(var18, var19);
                            }
                        }
                        int var20 = var5.method5304();
                        int var21 = 0;
                        while (true) {
                            if (var21 >= var20) {
                                break label204;
                            }
                            var5.method5304();
                            var5.method5112();
                            var21++;
                        }
                    }
                }
            } catch (Exception var35) {
                break label204;
            } finally {
                try {
                    var1.method6094();
                } catch (Exception var34) {
                }
            }
            return;
        }
        this.field1236 = false;
    }

    @ObfuscatedName("cj.s(I)V")
    public void method1987() {
        if (this.field1236 && this.field1240 < Statics.method2303() - 60000L) {
            this.method1985();
        }
    }

    @ObfuscatedName("cj.p(B)Z")
    public boolean method1982() {
        return this.field1236;
    }
}
