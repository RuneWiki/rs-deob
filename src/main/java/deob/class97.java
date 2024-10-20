package deob;

import java.io.EOFException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

@ObfuscatedName("cg")
public class class97 {

    @ObfuscatedName("cg.m")
    public boolean[] field1258;

    @ObfuscatedName("cg.k")
    public Map field1263;

    @ObfuscatedName("cg.o")
    public String[] field1262;

    @ObfuscatedName("cg.g")
    public boolean field1260 = false;

    @ObfuscatedName("cg.z")
    public long field1264;

    public class97() {
        int var1 = Statics.field1382.method4720(19);
        this.field1263 = new HashMap();
        this.field1258 = new boolean[var1];
        for (int var2 = 0; var2 < var1; var2++) {
            class155 var3 = class155.method6515(var2);
            this.field1258[var2] = var3.field1647;
        }
        int var4 = 0;
        if (Statics.field1382.method4682(15)) {
            var4 = Statics.field1382.method4720(15);
        }
        this.field1262 = new String[var4];
        this.method2157();
    }

    @ObfuscatedName("cg.n(IIB)V")
    public void method2148(int arg0, int arg1) {
        this.field1263.put(arg0, arg1);
        if (this.field1258[arg0]) {
            this.field1260 = true;
        }
    }

    @ObfuscatedName("cg.c(IB)I")
    public int method2149(int arg0) {
        Object var2 = this.field1263.get(arg0);
        return var2 instanceof Integer ? (Integer) var2 : -1;
    }

    @ObfuscatedName("cg.m(ILjava/lang/String;B)V")
    public void method2150(int arg0, String arg1) {
        this.field1263.put(arg0, arg1);
    }

    @ObfuscatedName("cg.k(II)Ljava/lang/String;")
    public String method2163(int arg0) {
        Object var2 = this.field1263.get(arg0);
        return var2 instanceof String ? (String) var2 : "";
    }

    @ObfuscatedName("cg.o(ILjava/lang/String;B)V")
    public void method2152(int arg0, String arg1) {
        this.field1262[arg0] = arg1;
    }

    @ObfuscatedName("cg.g(IB)Ljava/lang/String;")
    public String method2153(int arg0) {
        return this.field1262[arg0];
    }

    @ObfuscatedName("cg.z(I)V")
    public void method2154() {
        for (int var1 = 0; var1 < this.field1258.length; var1++) {
            if (!this.field1258[var1]) {
                this.field1263.remove(var1);
            }
        }
        for (int var2 = 0; var2 < this.field1262.length; var2++) {
            this.field1262[var2] = null;
        }
    }

    @ObfuscatedName("cg.a(ZB)Lnn;")
    public class384 method2168(boolean arg0) {
        return class144.method18("2", Statics.field84.field3301, arg0);
    }

    @ObfuscatedName("cg.u(I)V")
    public void method2151() {
        class384 var1 = this.method2168(true);
        try {
            int var2 = 3;
            int var3 = 0;
            Iterator var4 = this.field1263.entrySet().iterator();
            while (var4.hasNext()) {
                Entry var5 = (Entry) var4.next();
                int var6 = (Integer) var5.getKey();
                if (this.field1258[var6]) {
                    Object var7 = var5.getValue();
                    var2 += 3;
                    if (var7 instanceof Integer) {
                        var2 += 4;
                    } else if (var7 instanceof String) {
                        var2 += class400.method5614((String) var7);
                    }
                    var3++;
                }
            }
            class400 var8 = new class400(var2);
            var8.method6200(2);
            var8.method6311(var3);
            Iterator var9 = this.field1263.entrySet().iterator();
            while (var9.hasNext()) {
                Entry var10 = (Entry) var9.next();
                int var11 = (Integer) var10.getKey();
                if (this.field1258[var11]) {
                    var8.method6311(var11);
                    Object var12 = var10.getValue();
                    class392 var13 = class392.method6122(var12.getClass());
                    var8.method6200(var13.field4238);
                    class392.method6123(var12, var8);
                }
            }
            var1.method6055(var8.field4271, 0, var8.field4272);
        } catch (Exception var25) {
        } finally {
            try {
                var1.method6070();
            } catch (Exception var24) {
            }
        }
        this.field1260 = false;
        this.field1264 = class397.method3986();
    }

    @ObfuscatedName("cg.e(B)V")
    public void method2157() {
        class384 var1 = this.method2168(false);
        label218: {
            try {
                byte[] var2 = new byte[(int) var1.method6058()];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method6059(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }
                class400 var5 = new class400(var2);
                if (var5.field4271.length - var5.field4272 >= 1) {
                    int var7 = var5.method6217();
                    if (var7 >= 0 && var7 <= 2) {
                        if (var7 >= 2) {
                            int var9 = var5.method6219();
                            int var10 = 0;
                            while (true) {
                                if (var10 >= var9) {
                                    break label218;
                                }
                                int var11 = var5.method6219();
                                int var12 = var5.method6217();
                                class392[] var13 = new class392[] { class392.field4241, class392.field4239, class392.field4242 };
                                class392 var14 = (class392) class304.method4518(var13, var12);
                                Object var15 = var14.method6124(var5);
                                if (this.field1258[var11]) {
                                    this.field1263.put(var11, var15);
                                }
                                var10++;
                            }
                        } else {
                            int var16 = var5.method6219();
                            for (int var17 = 0; var17 < var16; var17++) {
                                int var18 = var5.method6219();
                                int var19 = var5.method6222();
                                if (this.field1258[var18]) {
                                    this.field1263.put(var18, var19);
                                }
                            }
                            int var20 = var5.method6219();
                            int var21 = 0;
                            while (true) {
                                if (var21 >= var20) {
                                    break label218;
                                }
                                var5.method6219();
                                var5.method6226();
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
                    var1.method6070();
                } catch (Exception var34) {
                }
            }
            return;
        }
        this.field1260 = false;
    }

    @ObfuscatedName("cg.l(I)V")
    public void method2158() {
        if (this.field1260 && this.field1264 < class397.method3986() - 60000L) {
            this.method2151();
        }
    }

    @ObfuscatedName("cg.y(I)Z")
    public boolean method2159() {
        return this.field1260;
    }
}
