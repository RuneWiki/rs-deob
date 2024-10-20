package deob;

import java.io.EOFException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

@ObfuscatedName("ch")
public class class97 {

    @ObfuscatedName("ch.s")
    public boolean[] field1258;

    @ObfuscatedName("ch.a")
    public Map field1256;

    @ObfuscatedName("ch.o")
    public String[] field1260;

    @ObfuscatedName("ch.g")
    public boolean field1257 = false;

    @ObfuscatedName("ch.e")
    public long field1262;

    public class97() {
        int var1 = Statics.field5.method4768(19);
        this.field1256 = new HashMap();
        this.field1258 = new boolean[var1];
        for (int var2 = 0; var2 < var1; var2++) {
            class155 var3 = (class155) class155.field1643.method4205((long) var2);
            class155 var4;
            if (var3 == null) {
                byte[] var5 = Statics.field1644.method4743(19, var2);
                class155 var6 = new class155();
                if (var5 != null) {
                    var6.method2716(new class401(var5));
                }
                class155.field1643.method4206(var6, (long) var2);
                var4 = var6;
            } else {
                var4 = var3;
            }
            this.field1258[var2] = var4.field1645;
        }
        int var8 = 0;
        if (Statics.field5.method4710(15)) {
            var8 = Statics.field5.method4768(15);
        }
        this.field1260 = new String[var8];
        this.method2202();
    }

    @ObfuscatedName("ch.i(IIB)V")
    public void method2234(int arg0, int arg1) {
        this.field1256.put(arg0, arg1);
        if (this.field1258[arg0]) {
            this.field1257 = true;
        }
    }

    @ObfuscatedName("ch.w(II)I")
    public int method2195(int arg0) {
        Object var2 = this.field1256.get(arg0);
        return var2 instanceof Integer ? (Integer) var2 : -1;
    }

    @ObfuscatedName("ch.s(ILjava/lang/String;I)V")
    public void method2219(int arg0, String arg1) {
        this.field1256.put(arg0, arg1);
    }

    @ObfuscatedName("ch.a(IB)Ljava/lang/String;")
    public String method2197(int arg0) {
        Object var2 = this.field1256.get(arg0);
        return var2 instanceof String ? (String) var2 : "";
    }

    @ObfuscatedName("ch.o(ILjava/lang/String;B)V")
    public void method2198(int arg0, String arg1) {
        this.field1260[arg0] = arg1;
    }

    @ObfuscatedName("ch.g(II)Ljava/lang/String;")
    public String method2199(int arg0) {
        return this.field1260[arg0];
    }

    @ObfuscatedName("ch.e(B)V")
    public void method2200() {
        for (int var1 = 0; var1 < this.field1258.length; var1++) {
            if (!this.field1258[var1]) {
                this.field1256.remove(var1);
            }
        }
        for (int var2 = 0; var2 < this.field1260.length; var2++) {
            this.field1260[var2] = null;
        }
    }

    @ObfuscatedName("ch.p(ZI)Lnv;")
    public class385 method2201(boolean arg0) {
        return class144.method359("2", Statics.field1987.field3298, arg0);
    }

    @ObfuscatedName("ch.j(I)V")
    public void method2239() {
        class385 var1 = this.method2201(true);
        try {
            int var2 = 3;
            int var3 = 0;
            Iterator var4 = this.field1256.entrySet().iterator();
            while (var4.hasNext()) {
                Entry var5 = (Entry) var4.next();
                int var6 = (Integer) var5.getKey();
                if (this.field1258[var6]) {
                    Object var7 = var5.getValue();
                    var2 += 3;
                    if (var7 instanceof Integer) {
                        var2 += 4;
                    } else if (var7 instanceof String) {
                        var2 += Statics.method1282((String) var7);
                    }
                    var3++;
                }
            }
            class401 var8 = new class401(var2);
            var8.method6223(2);
            var8.method6224(var3);
            Iterator var9 = this.field1256.entrySet().iterator();
            while (var9.hasNext()) {
                Entry var10 = (Entry) var9.next();
                int var11 = (Integer) var10.getKey();
                if (this.field1258[var11]) {
                    var8.method6224(var11);
                    Object var12 = var10.getValue();
                    class393 var13 = class393.method6141(var12.getClass());
                    var8.method6223(var13.field4274);
                    Class var14 = var12.getClass();
                    class393 var15 = class393.method6141(var14);
                    if (var15 == null) {
                        throw new IllegalArgumentException();
                    }
                    class389 var16 = var15.field4276;
                    var16.method6122(var12, var8);
                }
            }
            var1.method6061(var8.field4302, 0, var8.field4300);
        } catch (Exception var29) {
        } finally {
            try {
                var1.method6062();
            } catch (Exception var28) {
            }
        }
        this.field1257 = false;
        this.field1262 = class398.method2381();
    }

    @ObfuscatedName("ch.b(I)V")
    public void method2202() {
        class385 var1 = this.method2201(false);
        label218: {
            try {
                byte[] var2 = new byte[(int) var1.method6075()];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method6065(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }
                class401 var5 = new class401(var2);
                if (var5.field4302.length - var5.field4300 >= 1) {
                    int var7 = var5.method6240();
                    if (var7 >= 0 && var7 <= 2) {
                        if (var7 >= 2) {
                            int var9 = var5.method6242();
                            int var10 = 0;
                            while (true) {
                                if (var10 >= var9) {
                                    break label218;
                                }
                                int var11 = var5.method6242();
                                int var12 = var5.method6240();
                                class393 var13 = (class393) class304.method2319(class393.method6140(), var12);
                                Object var14 = var13.method6143(var5);
                                if (this.field1258[var11]) {
                                    this.field1256.put(var11, var14);
                                }
                                var10++;
                            }
                        } else {
                            int var15 = var5.method6242();
                            for (int var16 = 0; var16 < var15; var16++) {
                                int var17 = var5.method6242();
                                int var18 = var5.method6245();
                                if (this.field1258[var17]) {
                                    this.field1256.put(var17, var18);
                                }
                            }
                            int var19 = var5.method6242();
                            int var20 = 0;
                            while (true) {
                                if (var20 >= var19) {
                                    break label218;
                                }
                                var5.method6242();
                                var5.method6335();
                                var20++;
                            }
                        }
                    }
                    return;
                }
            } catch (Exception var34) {
                break label218;
            } finally {
                try {
                    var1.method6062();
                } catch (Exception var33) {
                }
            }
            return;
        }
        this.field1257 = false;
    }

    @ObfuscatedName("ch.x(I)V")
    public void method2203() {
        if (this.field1257 && this.field1262 < class398.method2381() - 60000L) {
            this.method2239();
        }
    }

    @ObfuscatedName("ch.y(I)Z")
    public boolean method2204() {
        return this.field1257;
    }
}
