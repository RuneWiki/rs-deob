package deob;

import java.io.EOFException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

@ObfuscatedName("ch")
public class class91 {

    @ObfuscatedName("ch.i")
    public boolean[] field1239;

    @ObfuscatedName("ch.k")
    public Map field1240;

    @ObfuscatedName("ch.u")
    public String[] field1241;

    @ObfuscatedName("ch.n")
    public boolean field1237 = false;

    @ObfuscatedName("ch.t")
    public long field1244;

    public class91() {
        int var1 = Statics.field985.method3776(19);
        this.field1240 = new HashMap();
        this.field1239 = new boolean[var1];
        for (int var2 = 0; var2 < var1; var2++) {
            class243 var3 = class243.method3216(var2);
            this.field1239[var2] = var3.field3215;
        }
        int var4 = 0;
        if (Statics.field985.method3891(15)) {
            var4 = Statics.field985.method3776(15);
        }
        this.field1241 = new String[var4];
        this.method1968();
    }

    @ObfuscatedName("ch.s(III)V")
    public void method1961(int arg0, int arg1) {
        this.field1240.put(arg0, arg1);
        if (this.field1239[arg0]) {
            this.field1237 = true;
        }
    }

    @ObfuscatedName("ch.j(IB)I")
    public int method1960(int arg0) {
        Object var2 = this.field1240.get(arg0);
        return var2 instanceof Integer ? (Integer) var2 : -1;
    }

    @ObfuscatedName("ch.i(ILjava/lang/String;I)V")
    public void method1994(int arg0, String arg1) {
        this.field1240.put(arg0, arg1);
    }

    @ObfuscatedName("ch.k(IB)Ljava/lang/String;")
    public String method1982(int arg0) {
        Object var2 = this.field1240.get(arg0);
        return var2 instanceof String ? (String) var2 : "";
    }

    @ObfuscatedName("ch.u(ILjava/lang/String;I)V")
    public void method1963(int arg0, String arg1) {
        this.field1241[arg0] = arg1;
    }

    @ObfuscatedName("ch.n(IB)Ljava/lang/String;")
    public String method1962(int arg0) {
        return this.field1241[arg0];
    }

    @ObfuscatedName("ch.t(B)V")
    public void method1965() {
        for (int var1 = 0; var1 < this.field1239.length; var1++) {
            if (!this.field1239[var1]) {
                this.field1240.remove(var1);
            }
        }
        for (int var2 = 0; var2 < this.field1241.length; var2++) {
            this.field1241[var2] = null;
        }
    }

    @ObfuscatedName("ch.q(ZI)Lmm;")
    public class343 method1966(boolean arg0) {
        return class168.method3196("2", Statics.field167.field3089, arg0);
    }

    @ObfuscatedName("ch.x(I)V")
    public void method1967() {
        class343 var1 = this.method1966(true);
        try {
            int var2 = 3;
            int var3 = 0;
            Iterator var4 = this.field1240.entrySet().iterator();
            while (var4.hasNext()) {
                Entry var5 = (Entry) var4.next();
                int var6 = (Integer) var5.getKey();
                if (this.field1239[var6]) {
                    Object var7 = var5.getValue();
                    var2 += 3;
                    if (var7 instanceof Integer) {
                        var2 += 4;
                    } else if (var7 instanceof String) {
                        var2 += class300.method4752((String) var7);
                    }
                    var3++;
                }
            }
            class300 var8 = new class300(var2);
            var8.method5083(2);
            var8.method5037(var3);
            Iterator var9 = this.field1240.entrySet().iterator();
            label175: while (true) {
                Entry var10;
                int var11;
                do {
                    if (!var9.hasNext()) {
                        var1.method6043(var8.field3701, 0, var8.field3704);
                        break label175;
                    }
                    var10 = (Entry) var9.next();
                    var11 = (Integer) var10.getKey();
                } while (!this.field1239[var11]);
                var8.method5037(var11);
                Object var12 = var10.getValue();
                Class var13 = var12.getClass();
                class4[] var14 = class4.method29();
                int var15 = 0;
                class4 var17;
                while (true) {
                    if (var15 >= var14.length) {
                        var17 = null;
                        break;
                    }
                    class4 var16 = var14[var15];
                    if (var16.field30 == var13) {
                        var17 = var16;
                        break;
                    }
                    var15++;
                }
                var8.method5083(var17.field19);
                Class var19 = var12.getClass();
                class4[] var20 = class4.method29();
                int var21 = 0;
                class4 var23;
                while (true) {
                    if (var21 >= var20.length) {
                        var23 = null;
                        break;
                    }
                    class4 var22 = var20[var21];
                    if (var22.field30 == var19) {
                        var23 = var22;
                        break;
                    }
                    var21++;
                }
                if (var23 == null) {
                    throw new IllegalArgumentException();
                }
                class1 var25 = var23.field14;
                var25.method3(var12, var8);
            }
        } catch (Exception var38) {
        } finally {
            try {
                var1.method6036();
            } catch (Exception var37) {
            }
        }
        this.field1237 = false;
        this.field1244 = class297.method4369();
    }

    @ObfuscatedName("ch.d(B)V")
    public void method1968() {
        class343 var1 = this.method1966(false);
        label216: {
            try {
                byte[] var2 = new byte[(int) var1.method6034()];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method6038(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }
                class300 var5 = new class300(var2);
                if (var5.field3701.length - var5.field3704 < 1) {
                    return;
                }
                int var7 = var5.method5179();
                if (var7 >= 0 && var7 <= 2) {
                    if (var7 >= 2) {
                        int var9 = var5.method5054();
                        int var10 = 0;
                        while (true) {
                            if (var10 >= var9) {
                                break label216;
                            }
                            int var11 = var5.method5054();
                            int var12 = var5.method5179();
                            class4 var13 = (class4) class196.method1723(class4.method29(), var12);
                            Object var14 = var13.method28(var5);
                            if (this.field1239[var11]) {
                                this.field1240.put(var11, var14);
                            }
                            var10++;
                        }
                    } else {
                        int var15 = var5.method5054();
                        for (int var16 = 0; var16 < var15; var16++) {
                            int var17 = var5.method5054();
                            int var18 = var5.method5056();
                            if (this.field1239[var17]) {
                                this.field1240.put(var17, var18);
                            }
                        }
                        int var19 = var5.method5054();
                        int var20 = 0;
                        while (true) {
                            if (var20 >= var19) {
                                break label216;
                            }
                            var5.method5054();
                            var5.method5150();
                            var20++;
                        }
                    }
                }
            } catch (Exception var34) {
                break label216;
            } finally {
                try {
                    var1.method6036();
                } catch (Exception var33) {
                }
            }
            return;
        }
        this.field1237 = false;
    }

    @ObfuscatedName("ch.f(I)V")
    public void method1969() {
        if (this.field1237 && this.field1244 < class297.method4369() - 60000L) {
            this.method1967();
        }
    }

    @ObfuscatedName("ch.c(I)Z")
    public boolean method1970() {
        return this.field1237;
    }
}
