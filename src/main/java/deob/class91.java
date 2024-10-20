package deob;

import java.io.EOFException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

@ObfuscatedName("ct")
public class class91 {

    @ObfuscatedName("ct.v")
    public boolean[] field1248;

    @ObfuscatedName("ct.u")
    public Map field1250;

    @ObfuscatedName("ct.r")
    public String[] field1252;

    @ObfuscatedName("ct.p")
    public boolean field1259 = false;

    @ObfuscatedName("ct.q")
    public long field1254;

    public class91() {
        int var1 = Statics.field1866.method3738(19);
        this.field1250 = new HashMap();
        this.field1248 = new boolean[var1];
        for (int var2 = 0; var2 < var1; var2++) {
            class243 var3 = (class243) class243.field3213.method2992((long) var2);
            class243 var4;
            if (var3 == null) {
                byte[] var5 = Statics.field3215.method3726(19, var2);
                class243 var6 = new class243();
                if (var5 != null) {
                    var6.method3968(new class300(var5));
                }
                class243.field3213.method2994(var6, (long) var2);
                var4 = var6;
            } else {
                var4 = var3;
            }
            this.field1248[var2] = var4.field3212;
        }
        int var8 = 0;
        if (Statics.field1866.method3850(15)) {
            var8 = Statics.field1866.method3738(15);
        }
        this.field1252 = new String[var8];
        this.method1961();
    }

    @ObfuscatedName("ct.z(III)V")
    public void method1980(int arg0, int arg1) {
        this.field1250.put(arg0, arg1);
        if (this.field1248[arg0]) {
            this.field1259 = true;
        }
    }

    @ObfuscatedName("ct.n(IB)I")
    public int method1960(int arg0) {
        Object var2 = this.field1250.get(arg0);
        return var2 instanceof Integer ? (Integer) var2 : -1;
    }

    @ObfuscatedName("ct.v(ILjava/lang/String;B)V")
    public void method1954(int arg0, String arg1) {
        this.field1250.put(arg0, arg1);
    }

    @ObfuscatedName("ct.u(IB)Ljava/lang/String;")
    public String method1955(int arg0) {
        Object var2 = this.field1250.get(arg0);
        return var2 instanceof String ? (String) var2 : "";
    }

    @ObfuscatedName("ct.r(ILjava/lang/String;I)V")
    public void method1956(int arg0, String arg1) {
        this.field1252[arg0] = arg1;
    }

    @ObfuscatedName("ct.p(IB)Ljava/lang/String;")
    public String method1951(int arg0) {
        return this.field1252[arg0];
    }

    @ObfuscatedName("ct.q(B)V")
    public void method1959() {
        for (int var1 = 0; var1 < this.field1248.length; var1++) {
            if (!this.field1248[var1]) {
                this.field1250.remove(var1);
            }
        }
        for (int var2 = 0; var2 < this.field1252.length; var2++) {
            this.field1252[var2] = null;
        }
    }

    @ObfuscatedName("ct.m(ZI)Lmh;")
    public class343 method1976(boolean arg0) {
        return class168.method3269("2", Statics.field102.field3094, arg0);
    }

    @ObfuscatedName("ct.y(B)V")
    public void method1958() {
        class343 var1 = this.method1976(true);
        try {
            int var2 = 3;
            int var3 = 0;
            Iterator var4 = this.field1250.entrySet().iterator();
            while (var4.hasNext()) {
                Entry var5 = (Entry) var4.next();
                int var6 = (Integer) var5.getKey();
                if (this.field1248[var6]) {
                    Object var7 = var5.getValue();
                    var2 += 3;
                    if (var7 instanceof Integer) {
                        var2 += 4;
                    } else if (var7 instanceof String) {
                        var2 += class300.method4526((String) var7);
                    }
                    var3++;
                }
            }
            class300 var8 = new class300(var2);
            var8.method5065(2);
            var8.method4975(var3);
            Iterator var9 = this.field1250.entrySet().iterator();
            while (var9.hasNext()) {
                Entry var10 = (Entry) var9.next();
                int var11 = (Integer) var10.getKey();
                if (this.field1248[var11]) {
                    var8.method4975(var11);
                    Object var12 = var10.getValue();
                    class4 var13 = class4.method24(var12.getClass());
                    var8.method5065(var13.field10);
                    Class var14 = var12.getClass();
                    class4 var15 = class4.method24(var14);
                    if (var15 == null) {
                        throw new IllegalArgumentException();
                    }
                    class1 var16 = var15.field14;
                    var16.method5(var12, var8);
                }
            }
            var1.method5993(var8.field3699, 0, var8.field3702);
        } catch (Exception var29) {
        } finally {
            try {
                var1.method5997();
            } catch (Exception var28) {
            }
        }
        this.field1259 = false;
        this.field1254 = class297.method502();
    }

    @ObfuscatedName("ct.i(B)V")
    public void method1961() {
        class343 var1 = this.method1976(false);
        label216: {
            try {
                byte[] var2 = new byte[(int) var1.method5982()];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method5983(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }
                class300 var5 = new class300(var2);
                if (var5.field3699.length - var5.field3702 < 1) {
                    return;
                }
                int var7 = var5.method4990();
                if (var7 >= 0 && var7 <= 2) {
                    if (var7 >= 2) {
                        int var9 = var5.method4992();
                        int var10 = 0;
                        while (true) {
                            if (var10 >= var9) {
                                break label216;
                            }
                            int var11 = var5.method4992();
                            int var12 = var5.method4990();
                            class4 var13 = (class4) class196.method3185(class4.method32(), var12);
                            Object var14 = var13.method26(var5);
                            if (this.field1248[var11]) {
                                this.field1250.put(var11, var14);
                            }
                            var10++;
                        }
                    } else {
                        int var15 = var5.method4992();
                        for (int var16 = 0; var16 < var15; var16++) {
                            int var17 = var5.method4992();
                            int var18 = var5.method5085();
                            if (this.field1248[var17]) {
                                this.field1250.put(var17, var18);
                            }
                        }
                        int var19 = var5.method4992();
                        int var20 = 0;
                        while (true) {
                            if (var20 >= var19) {
                                break label216;
                            }
                            var5.method4992();
                            var5.method4999();
                            var20++;
                        }
                    }
                }
            } catch (Exception var34) {
                break label216;
            } finally {
                try {
                    var1.method5997();
                } catch (Exception var33) {
                }
            }
            return;
        }
        this.field1259 = false;
    }

    @ObfuscatedName("ct.c(B)V")
    public void method1962() {
        if (this.field1259 && this.field1254 < class297.method502() - 60000L) {
            this.method1958();
        }
    }

    @ObfuscatedName("ct.b(I)Z")
    public boolean method1963() {
        return this.field1259;
    }
}
