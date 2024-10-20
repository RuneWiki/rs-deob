package deob;

import java.io.EOFException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

@ObfuscatedName("ca")
public class class91 {

    @ObfuscatedName("ca.e")
    public boolean[] field1269;

    @ObfuscatedName("ca.p")
    public Map field1272;

    @ObfuscatedName("ca.k")
    public String[] field1270;

    @ObfuscatedName("ca.l")
    public boolean field1271 = false;

    @ObfuscatedName("ca.b")
    public long field1273;

    public class91() {
        int var1 = Statics.field2545.method3785(19);
        this.field1272 = new HashMap();
        this.field1269 = new boolean[var1];
        for (int var2 = 0; var2 < var1; var2++) {
            class243 var3 = (class243) class243.field3233.method3039((long) var2);
            class243 var4;
            if (var3 == null) {
                byte[] var5 = Statics.field3234.method3775(19, var2);
                class243 var6 = new class243();
                if (var5 != null) {
                    var6.method4018(new class301(var5));
                }
                class243.field3233.method3041(var6, (long) var2);
                var4 = var6;
            } else {
                var4 = var3;
            }
            this.field1269[var2] = var4.field3235;
        }
        int var8 = 0;
        if (Statics.field2545.method3896(15)) {
            var8 = Statics.field2545.method3785(15);
        }
        this.field1270 = new String[var8];
        this.method1913();
    }

    @ObfuscatedName("ca.q(III)V")
    public void method1921(int arg0, int arg1) {
        this.field1272.put(arg0, arg1);
        if (this.field1269[arg0]) {
            this.field1271 = true;
        }
    }

    @ObfuscatedName("ca.w(IB)I")
    public int method1905(int arg0) {
        Object var2 = this.field1272.get(arg0);
        return var2 instanceof Integer ? (Integer) var2 : -1;
    }

    @ObfuscatedName("ca.e(ILjava/lang/String;I)V")
    public void method1934(int arg0, String arg1) {
        this.field1272.put(arg0, arg1);
    }

    @ObfuscatedName("ca.p(II)Ljava/lang/String;")
    public String method1907(int arg0) {
        Object var2 = this.field1272.get(arg0);
        return var2 instanceof String ? (String) var2 : "";
    }

    @ObfuscatedName("ca.k(ILjava/lang/String;I)V")
    public void method1945(int arg0, String arg1) {
        this.field1270[arg0] = arg1;
    }

    @ObfuscatedName("ca.l(II)Ljava/lang/String;")
    public String method1954(int arg0) {
        return this.field1270[arg0];
    }

    @ObfuscatedName("ca.b(I)V")
    public void method1910() {
        for (int var1 = 0; var1 < this.field1269.length; var1++) {
            if (!this.field1269[var1]) {
                this.field1272.remove(var1);
            }
        }
        for (int var2 = 0; var2 < this.field1270.length; var2++) {
            this.field1270[var2] = null;
        }
    }

    @ObfuscatedName("ca.i(ZI)Lma;")
    public class344 method1911(boolean arg0) {
        return class168.method193("2", Statics.field249.field3112, arg0);
    }

    @ObfuscatedName("ca.c(I)V")
    public void method1909() {
        class344 var1 = this.method1911(true);
        try {
            int var2 = 3;
            int var3 = 0;
            Iterator var4 = this.field1272.entrySet().iterator();
            while (var4.hasNext()) {
                Entry var5 = (Entry) var4.next();
                int var6 = (Integer) var5.getKey();
                if (this.field1269[var6]) {
                    Object var7 = var5.getValue();
                    var2 += 3;
                    if (var7 instanceof Integer) {
                        var2 += 4;
                    } else if (var7 instanceof String) {
                        var2 += class301.method3582((String) var7);
                    }
                    var3++;
                }
            }
            class301 var8 = new class301(var2);
            var8.method5228(2);
            var8.method5052(var3);
            Iterator var9 = this.field1272.entrySet().iterator();
            label144: while (true) {
                Entry var10;
                int var11;
                do {
                    if (!var9.hasNext()) {
                        var1.method6077(var8.field3731, 0, var8.field3733);
                        break label144;
                    }
                    var10 = (Entry) var9.next();
                    var11 = (Integer) var10.getKey();
                } while (!this.field1269[var11]);
                var8.method5052(var11);
                Object var12 = var10.getValue();
                Class var13 = var12.getClass();
                class4[] var14 = new class4[] { class4.field10, class4.field15, class4.field8 };
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
                var8.method5228(var18.field12);
                class4.method21(var12, var8);
            }
        } catch (Exception var31) {
        } finally {
            try {
                var1.method6066();
            } catch (Exception var30) {
            }
        }
        this.field1271 = false;
        this.field1273 = class298.method3576();
    }

    @ObfuscatedName("ca.u(B)V")
    public void method1913() {
        class344 var1 = this.method1911(false);
        label204: {
            try {
                byte[] var2 = new byte[(int) var1.method6068()];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method6070(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }
                class301 var5 = new class301(var2);
                if (var5.field3731.length - var5.field3733 >= 1) {
                    int var7 = var5.method5077();
                    if (var7 < 0 || var7 > 2) {
                        return;
                    }
                    if (var7 >= 2) {
                        int var9 = var5.method5069();
                        int var10 = 0;
                        while (true) {
                            if (var10 >= var9) {
                                break label204;
                            }
                            int var11 = var5.method5069();
                            int var12 = var5.method5077();
                            class4[] var13 = new class4[] { class4.field10, class4.field15, class4.field8 };
                            class4 var14 = (class4) class196.method2257(var13, var12);
                            Object var15 = var14.method25(var5);
                            if (this.field1269[var11]) {
                                this.field1272.put(var11, var15);
                            }
                            var10++;
                        }
                    } else {
                        int var16 = var5.method5069();
                        for (int var17 = 0; var17 < var16; var17++) {
                            int var18 = var5.method5069();
                            int var19 = var5.method5072();
                            if (this.field1269[var18]) {
                                this.field1272.put(var18, var19);
                            }
                        }
                        int var20 = var5.method5069();
                        int var21 = 0;
                        while (true) {
                            if (var21 >= var20) {
                                break label204;
                            }
                            var5.method5069();
                            var5.method5076();
                            var21++;
                        }
                    }
                }
            } catch (Exception var35) {
                break label204;
            } finally {
                try {
                    var1.method6066();
                } catch (Exception var34) {
                }
            }
            return;
        }
        this.field1271 = false;
    }

    @ObfuscatedName("ca.x(I)V")
    public void method1914() {
        if (this.field1271 && this.field1273 < class298.method3576() - 60000L) {
            this.method1909();
        }
    }

    @ObfuscatedName("ca.r(I)Z")
    public boolean method1908() {
        return this.field1271;
    }
}
