package deob;

import java.io.EOFException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

@Deprecated
@ObfuscatedName("ct")
public class class97 {

    @ObfuscatedName("ct.s")
    public boolean[] field1300;

    @ObfuscatedName("ct.e")
    public Map field1301;

    /**
     * @deprecated
     */
    @ObfuscatedName("ct.r")
    public String[] field1294;

    @ObfuscatedName("ct.o")
    public boolean field1298 = false;

    @ObfuscatedName("ct.i")
    public long field1299;

    public class97() {
        int var1 = Statics.field4152.method5029(19);
        this.field1301 = new HashMap();
        this.field1300 = new boolean[var1];
        for (int var2 = 0; var2 < var1; var2++) {
            class165 var3 = class165.method2934(var2);
            this.field1300[var2] = var3.field1788;
        }
        int var4 = 0;
        if (Statics.field4152.method4984(15)) {
            var4 = Statics.field4152.method5029(15);
        }
        this.field1294 = new String[var4];
        this.method2210();
    }

    @ObfuscatedName("ct.c(III)V")
    public void method2202(int arg0, int arg1) {
        this.field1301.put(arg0, arg1);
        if (this.field1300[arg0]) {
            this.field1298 = true;
        }
    }

    @ObfuscatedName("ct.l(II)I")
    public int method2218(int arg0) {
        Object var2 = this.field1301.get(arg0);
        return var2 instanceof Integer ? (Integer) var2 : -1;
    }

    @ObfuscatedName("ct.s(ILjava/lang/String;I)V")
    public void method2204(int arg0, String arg1) {
        this.field1301.put(arg0, arg1);
    }

    @ObfuscatedName("ct.e(II)Ljava/lang/String;")
    public String method2205(int arg0) {
        Object var2 = this.field1301.get(arg0);
        return var2 instanceof String ? (String) var2 : "";
    }

    /**
     * @deprecated
     */
    @Deprecated
    @ObfuscatedName("ct.r(ILjava/lang/String;B)V")
    public void method2206(int arg0, String arg1) {
        this.field1294[arg0] = arg1;
    }

    /**
     * @deprecated
     */
    @Deprecated
    @ObfuscatedName("ct.o(II)Ljava/lang/String;")
    public String method2207(int arg0) {
        return this.field1294[arg0];
    }

    @ObfuscatedName("ct.i(I)V")
    public void method2208() {
        for (int var1 = 0; var1 < this.field1300.length; var1++) {
            if (!this.field1300[var1]) {
                this.field1301.remove(var1);
            }
        }
        for (int var2 = 0; var2 < this.field1294.length; var2++) {
            this.field1294[var2] = null;
        }
    }

    @ObfuscatedName("ct.w(ZI)Loo;")
    public class407 method2209(boolean arg0) {
        return class154.method3040("2", Statics.field1847.field3497, arg0);
    }

    @ObfuscatedName("ct.v(I)V")
    public void method2212() {
        class407 var1 = this.method2209(true);
        try {
            int var2 = 3;
            int var3 = 0;
            Iterator var4 = this.field1301.entrySet().iterator();
            while (var4.hasNext()) {
                Entry var5 = (Entry) var4.next();
                int var6 = (Integer) var5.getKey();
                if (this.field1300[var6]) {
                    Object var7 = var5.getValue();
                    var2 += 3;
                    if (var7 instanceof Integer) {
                        var2 += 4;
                    } else if (var7 instanceof String) {
                        var2 += class421.method5127((String) var7);
                    }
                    var3++;
                }
            }
            class421 var8 = new class421(var2);
            var8.method6644(2);
            var8.method6757(var3);
            Iterator var9 = this.field1301.entrySet().iterator();
            while (var9.hasNext()) {
                Entry var10 = (Entry) var9.next();
                int var11 = (Integer) var10.getKey();
                if (this.field1300[var11]) {
                    var8.method6757(var11);
                    Object var12 = var10.getValue();
                    class415 var13 = class415.method6574(var12.getClass());
                    var8.method6644(var13.field4492);
                    class415.method6564(var12, var8);
                }
            }
            var1.method6480(var8.field4511, 0, var8.field4512);
        } catch (Exception var25) {
        } finally {
            try {
                var1.method6483();
            } catch (Exception var24) {
            }
        }
        this.field1298 = false;
        this.field1299 = class262.method4787();
    }

    @ObfuscatedName("ct.a(I)V")
    public void method2210() {
        class407 var1 = this.method2209(false);
        label203: {
            try {
                byte[] var2 = new byte[(int) var1.method6485()];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method6486(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }
                class421 var5 = new class421(var2);
                if (var5.field4511.length - var5.field4512 >= 1) {
                    int var7 = var5.method6686();
                    if (var7 < 0 || var7 > 2) {
                        return;
                    }
                    if (var7 >= 2) {
                        int var9 = var5.method6666();
                        int var10 = 0;
                        while (true) {
                            if (var10 >= var9) {
                                break label203;
                            }
                            int var11 = var5.method6666();
                            int var12 = var5.method6686();
                            class415 var13 = (class415) class321.method2696(class415.method6570(), var12);
                            Object var14 = var13.method6566(var5);
                            if (this.field1300[var11]) {
                                this.field1301.put(var11, var14);
                            }
                            var10++;
                        }
                    } else {
                        int var15 = var5.method6666();
                        for (int var16 = 0; var16 < var15; var16++) {
                            int var17 = var5.method6666();
                            int var18 = var5.method6669();
                            if (this.field1300[var17]) {
                                this.field1301.put(var17, var18);
                            }
                        }
                        int var19 = var5.method6666();
                        int var20 = 0;
                        while (true) {
                            if (var20 >= var19) {
                                break label203;
                            }
                            var5.method6666();
                            var5.method6674();
                            var20++;
                        }
                    }
                }
            } catch (Exception var34) {
                break label203;
            } finally {
                try {
                    var1.method6483();
                } catch (Exception var33) {
                }
            }
            return;
        }
        this.field1298 = false;
    }

    @ObfuscatedName("ct.y(I)V")
    public void method2211() {
        if (this.field1298 && this.field1299 < class262.method4787() - 60000L) {
            this.method2212();
        }
    }

    @ObfuscatedName("ct.u(B)Z")
    public boolean method2201() {
        return this.field1298;
    }
}
