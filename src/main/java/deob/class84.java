package deob;

import java.io.EOFException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

@ObfuscatedName("ci")
public class class84 {

    @ObfuscatedName("ci.v")
    public boolean[] field1185;

    @ObfuscatedName("ci.j")
    public Map field1186;

    @ObfuscatedName("ci.l")
    public String[] field1187;

    @ObfuscatedName("ci.n")
    public boolean field1189 = false;

    @ObfuscatedName("ci.w")
    public long field1188;

    public class84() {
        int var1 = Statics.field2149.method4484(19);
        this.field1186 = new HashMap();
        this.field1185 = new boolean[var1];
        for (int var2 = 0; var2 < var1; var2++) {
            class142 var3 = class142.method1614(var2);
            this.field1185[var2] = var3.field1557;
        }
        int var4 = 0;
        if (Statics.field2149.method4418(15)) {
            var4 = Statics.field2149.method4484(15);
        }
        this.field1187 = new String[var4];
        this.method1920();
    }

    @ObfuscatedName("ci.s(III)V")
    public void method1912(int arg0, int arg1) {
        this.field1186.put(arg0, arg1);
        if (this.field1185[arg0]) {
            this.field1189 = true;
        }
    }

    @ObfuscatedName("ci.t(II)I")
    public int method1913(int arg0) {
        Object var2 = this.field1186.get(arg0);
        return var2 instanceof Integer ? (Integer) var2 : -1;
    }

    @ObfuscatedName("ci.v(ILjava/lang/String;B)V")
    public void method1942(int arg0, String arg1) {
        this.field1186.put(arg0, arg1);
    }

    @ObfuscatedName("ci.j(II)Ljava/lang/String;")
    public String method1914(int arg0) {
        Object var2 = this.field1186.get(arg0);
        return var2 instanceof String ? (String) var2 : "";
    }

    @ObfuscatedName("ci.l(ILjava/lang/String;I)V")
    public void method1915(int arg0, String arg1) {
        this.field1187[arg0] = arg1;
    }

    @ObfuscatedName("ci.n(IB)Ljava/lang/String;")
    public String method1916(int arg0) {
        return this.field1187[arg0];
    }

    @ObfuscatedName("ci.w(I)V")
    public void method1911() {
        for (int var1 = 0; var1 < this.field1185.length; var1++) {
            if (!this.field1185[var1]) {
                this.field1186.remove(var1);
            }
        }
        for (int var2 = 0; var2 < this.field1187.length; var2++) {
            this.field1187[var2] = null;
        }
    }

    @ObfuscatedName("ci.f(ZB)Lnx;")
    public class369 method1918(boolean arg0) {
        return class131.method1860("2", Statics.field976.field3208, arg0);
    }

    @ObfuscatedName("ci.o(I)V")
    public void method1919() {
        class369 var1 = this.method1918(true);
        try {
            int var2 = 3;
            int var3 = 0;
            Iterator var4 = this.field1186.entrySet().iterator();
            while (var4.hasNext()) {
                Entry var5 = (Entry) var4.next();
                int var6 = (Integer) var5.getKey();
                if (this.field1185[var6]) {
                    Object var7 = var5.getValue();
                    var2 += 3;
                    if (var7 instanceof Integer) {
                        var2 += 4;
                    } else if (var7 instanceof String) {
                        var2 += class385.method4571((String) var7);
                    }
                    var3++;
                }
            }
            class385 var8 = new class385(var2);
            var8.method5941(2);
            var8.method6132(var3);
            Iterator var9 = this.field1186.entrySet().iterator();
            label175: while (true) {
                Entry var10;
                int var11;
                do {
                    if (!var9.hasNext()) {
                        var1.method5790(var8.field4184, 0, var8.field4182);
                        break label175;
                    }
                    var10 = (Entry) var9.next();
                    var11 = (Integer) var10.getKey();
                } while (!this.field1185[var11]);
                var8.method6132(var11);
                Object var12 = var10.getValue();
                Class var13 = var12.getClass();
                class377[] var14 = new class377[] { class377.field4165, class377.field4164, class377.field4160 };
                class377[] var15 = var14;
                int var16 = 0;
                class377 var18;
                while (true) {
                    if (var16 >= var15.length) {
                        var18 = null;
                        break;
                    }
                    class377 var17 = var15[var16];
                    if (var17.field4161 == var13) {
                        var18 = var17;
                        break;
                    }
                    var16++;
                }
                var8.method5941(var18.field4159);
                Class var20 = var12.getClass();
                class377[] var21 = new class377[] { class377.field4165, class377.field4164, class377.field4160 };
                class377[] var22 = var21;
                int var23 = 0;
                class377 var25;
                while (true) {
                    if (var23 >= var22.length) {
                        var25 = null;
                        break;
                    }
                    class377 var24 = var22[var23];
                    if (var24.field4161 == var20) {
                        var25 = var24;
                        break;
                    }
                    var23++;
                }
                if (var25 == null) {
                    throw new IllegalArgumentException();
                }
                class373 var27 = var25.field4163;
                var27.method5853(var12, var8);
            }
        } catch (Exception var40) {
        } finally {
            try {
                var1.method5786();
            } catch (Exception var39) {
            }
        }
        this.field1189 = false;
        this.field1188 = class382.method2013();
    }

    @ObfuscatedName("ci.x(B)V")
    public void method1920() {
        class369 var1 = this.method1918(false);
        label216: {
            try {
                byte[] var2 = new byte[(int) var1.method5783()];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method5789(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }
                class385 var5 = new class385(var2);
                if (var5.field4184.length - var5.field4182 < 1) {
                    return;
                }
                int var7 = var5.method5958();
                if (var7 >= 0 && var7 <= 2) {
                    if (var7 >= 2) {
                        int var9 = var5.method6053();
                        int var10 = 0;
                        while (true) {
                            if (var10 >= var9) {
                                break label216;
                            }
                            int var11 = var5.method6053();
                            int var12 = var5.method5958();
                            class377[] var13 = new class377[] { class377.field4165, class377.field4164, class377.field4160 };
                            class377 var14 = (class377) class291.method4326(var13, var12);
                            Object var15 = var14.method5869(var5);
                            if (this.field1185[var11]) {
                                this.field1186.put(var11, var15);
                            }
                            var10++;
                        }
                    } else {
                        int var16 = var5.method6053();
                        for (int var17 = 0; var17 < var16; var17++) {
                            int var18 = var5.method6053();
                            int var19 = var5.method6182();
                            if (this.field1185[var18]) {
                                this.field1186.put(var18, var19);
                            }
                        }
                        int var20 = var5.method6053();
                        int var21 = 0;
                        while (true) {
                            if (var21 >= var20) {
                                break label216;
                            }
                            var5.method6053();
                            var5.method5967();
                            var21++;
                        }
                    }
                }
            } catch (Exception var35) {
                break label216;
            } finally {
                try {
                    var1.method5786();
                } catch (Exception var34) {
                }
            }
            return;
        }
        this.field1189 = false;
    }

    @ObfuscatedName("ci.r(I)V")
    public void method1951() {
        if (this.field1189 && this.field1188 < class382.method2013() - 60000L) {
            this.method1919();
        }
    }

    @ObfuscatedName("ci.p(I)Z")
    public boolean method1945() {
        return this.field1189;
    }
}
