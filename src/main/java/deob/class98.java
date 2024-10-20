package deob;

import java.io.EOFException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

@Deprecated
@ObfuscatedName("cg")
public class class98 {

    @ObfuscatedName("cg.w")
    public boolean[] field1321;

    @ObfuscatedName("cg.v")
    public Map field1315;

    /**
     * @deprecated
     */
    @ObfuscatedName("cg.c")
    public String[] field1316;

    @ObfuscatedName("cg.q")
    public boolean field1312 = false;

    @ObfuscatedName("cg.i")
    public long field1318;

    public class98() {
        int var1 = Statics.field2448.method5184(19);
        this.field1315 = new HashMap();
        this.field1321 = new boolean[var1];
        for (int var2 = 0; var2 < var1; var2++) {
            class172 var3 = class172.method2463(var2);
            this.field1321[var2] = var3.field1838;
        }
        int var4 = 0;
        if (Statics.field2448.method5147(15)) {
            var4 = Statics.field2448.method5184(15);
        }
        this.field1316 = new String[var4];
        this.method2268();
    }

    @ObfuscatedName("cg.s(III)V")
    public void method2260(int arg0, int arg1) {
        this.field1315.put(arg0, arg1);
        if (this.field1321[arg0]) {
            this.field1312 = true;
        }
    }

    @ObfuscatedName("cg.h(IB)I")
    public int method2259(int arg0) {
        Object var2 = this.field1315.get(arg0);
        return var2 instanceof Integer ? (Integer) var2 : -1;
    }

    @ObfuscatedName("cg.w(ILjava/lang/String;I)V")
    public void method2262(int arg0, String arg1) {
        this.field1315.put(arg0, arg1);
    }

    @ObfuscatedName("cg.v(II)Ljava/lang/String;")
    public String method2292(int arg0) {
        Object var2 = this.field1315.get(arg0);
        return var2 instanceof String ? (String) var2 : "";
    }

    /**
     * @deprecated
     */
    @Deprecated
    @ObfuscatedName("cg.c(ILjava/lang/String;I)V")
    public void method2286(int arg0, String arg1) {
        this.field1316[arg0] = arg1;
    }

    /**
     * @deprecated
     */
    @Deprecated
    @ObfuscatedName("cg.q(II)Ljava/lang/String;")
    public String method2270(int arg0) {
        return this.field1316[arg0];
    }

    @ObfuscatedName("cg.i(I)V")
    public void method2273() {
        for (int var1 = 0; var1 < this.field1321.length; var1++) {
            if (!this.field1321[var1]) {
                this.field1315.remove(var1);
            }
        }
        for (int var2 = 0; var2 < this.field1316.length; var2++) {
            this.field1316[var2] = null;
        }
    }

    @ObfuscatedName("cg.k(ZI)Lpn;")
    public class426 method2266(boolean arg0) {
        return class158.method6804("2", Statics.field112.field3590, arg0);
    }

    @ObfuscatedName("cg.o(B)V")
    public void method2267() {
        class426 var1 = this.method2266(true);
        try {
            int var2 = 3;
            int var3 = 0;
            Iterator var4 = this.field1315.entrySet().iterator();
            while (var4.hasNext()) {
                Entry var5 = (Entry) var4.next();
                int var6 = (Integer) var5.getKey();
                if (this.field1321[var6]) {
                    Object var7 = var5.getValue();
                    var2 += 3;
                    if (var7 instanceof Integer) {
                        var2 += 4;
                    } else if (var7 instanceof String) {
                        var2 += class444.method5118((String) var7);
                    }
                    var3++;
                }
            }
            class444 var8 = new class444(var2);
            var8.method6912(2);
            var8.method6913(var3);
            Iterator var9 = this.field1315.entrySet().iterator();
            while (var9.hasNext()) {
                Entry var10 = (Entry) var9.next();
                int var11 = (Integer) var10.getKey();
                if (this.field1321[var11]) {
                    var8.method6913(var11);
                    Object var12 = var10.getValue();
                    class434 var13 = Statics.method6793(var12.getClass());
                    var8.method6912(var13.field4659);
                    class430 var14 = class434.method6805(var12.getClass());
                    var14.method6778(var12, var8);
                }
            }
            var1.method6715(var8.field4707, 0, var8.field4708);
        } catch (Exception var26) {
        } finally {
            try {
                var1.method6716();
            } catch (Exception var25) {
            }
        }
        this.field1312 = false;
        this.field1318 = class270.method3146();
    }

    @ObfuscatedName("cg.n(B)V")
    public void method2268() {
        class426 var1 = this.method2266(false);
        label203: {
            try {
                byte[] var2 = new byte[(int) var1.method6713()];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method6719(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }
                class444 var5 = new class444(var2);
                if (var5.field4707.length - var5.field4708 >= 1) {
                    int var7 = var5.method6929();
                    if (var7 < 0 || var7 > 2) {
                        return;
                    }
                    if (var7 >= 2) {
                        int var9 = var5.method7120();
                        int var10 = 0;
                        while (true) {
                            if (var10 >= var9) {
                                break label203;
                            }
                            int var11 = var5.method7120();
                            int var12 = var5.method6929();
                            class434 var13 = (class434) class330.method525(Statics.method6797(), var12);
                            Object var14 = var13.method6796(var5);
                            if (this.field1321[var11]) {
                                this.field1315.put(var11, var14);
                            }
                            var10++;
                        }
                    } else {
                        int var15 = var5.method7120();
                        for (int var16 = 0; var16 < var15; var16++) {
                            int var17 = var5.method7120();
                            int var18 = var5.method6934();
                            if (this.field1321[var17]) {
                                this.field1315.put(var17, var18);
                            }
                        }
                        int var19 = var5.method7120();
                        int var20 = 0;
                        while (true) {
                            if (var20 >= var19) {
                                break label203;
                            }
                            var5.method7120();
                            var5.method6975();
                            var20++;
                        }
                    }
                }
            } catch (Exception var34) {
                break label203;
            } finally {
                try {
                    var1.method6716();
                } catch (Exception var33) {
                }
            }
            return;
        }
        this.field1312 = false;
    }

    @ObfuscatedName("cg.d(B)V")
    public void method2269() {
        if (this.field1312 && this.field1318 < class270.method3146() - 60000L) {
            this.method2267();
        }
    }

    @ObfuscatedName("cg.a(I)Z")
    public boolean method2274() {
        return this.field1312;
    }
}
