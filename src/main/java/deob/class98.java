package deob;

import java.io.EOFException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

@Deprecated
@ObfuscatedName("cu")
public class class98 {

    @ObfuscatedName("cu.l")
    public boolean[] field1328;

    @ObfuscatedName("cu.k")
    public Map field1322;

    /**
     * @deprecated
     */
    @ObfuscatedName("cu.a")
    public String[] field1323;

    @ObfuscatedName("cu.m")
    public boolean field1324 = false;

    @ObfuscatedName("cu.p")
    public long field1325;

    public class98() {
        int var1 = Statics.field4249.method5200(19);
        this.field1322 = new HashMap();
        this.field1328 = new boolean[var1];
        for (int var2 = 0; var2 < var1; var2++) {
            class173 var3 = (class173) class173.field1891.method4566((long) var2);
            class173 var4;
            if (var3 == null) {
                byte[] var5 = Statics.field1892.method5249(19, var2);
                class173 var6 = new class173();
                if (var5 != null) {
                    var6.method3026(new class440(var5));
                }
                class173.field1891.method4571(var6, (long) var2);
                var4 = var6;
            } else {
                var4 = var3;
            }
            this.field1328[var2] = var4.field1890;
        }
        int var8 = 0;
        if (Statics.field4249.method5160(15)) {
            var8 = Statics.field4249.method5200(15);
        }
        this.field1323 = new String[var8];
        this.method2321();
    }

    @ObfuscatedName("cu.o(IIB)V")
    public void method2295(int arg0, int arg1) {
        this.field1322.put(arg0, arg1);
        if (this.field1328[arg0]) {
            this.field1324 = true;
        }
    }

    @ObfuscatedName("cu.q(II)I")
    public int method2325(int arg0) {
        Object var2 = this.field1322.get(arg0);
        return var2 instanceof Integer ? (Integer) var2 : -1;
    }

    @ObfuscatedName("cu.l(ILjava/lang/String;I)V")
    public void method2314(int arg0, String arg1) {
        this.field1322.put(arg0, arg1);
    }

    @ObfuscatedName("cu.k(II)Ljava/lang/String;")
    public String method2298(int arg0) {
        Object var2 = this.field1322.get(arg0);
        return var2 instanceof String ? (String) var2 : "";
    }

    /**
     * @deprecated
     */
    @Deprecated
    @ObfuscatedName("cu.a(ILjava/lang/String;I)V")
    public void method2299(int arg0, String arg1) {
        this.field1323[arg0] = arg1;
    }

    /**
     * @deprecated
     */
    @Deprecated
    @ObfuscatedName("cu.m(II)Ljava/lang/String;")
    public String method2309(int arg0) {
        return this.field1323[arg0];
    }

    @ObfuscatedName("cu.p(I)V")
    public void method2304() {
        for (int var1 = 0; var1 < this.field1328.length; var1++) {
            if (!this.field1328[var1]) {
                this.field1322.remove(var1);
            }
        }
        for (int var2 = 0; var2 < this.field1323.length; var2++) {
            this.field1323[var2] = null;
        }
    }

    @ObfuscatedName("cu.s(ZI)Lpu;")
    public class426 method2302(boolean arg0) {
        return class158.method2457("2", Statics.field474.field3628, arg0);
    }

    @ObfuscatedName("cu.r(B)V")
    public void method2303() {
        class426 var1 = this.method2302(true);
        try {
            int var2 = 3;
            int var3 = 0;
            Iterator var4 = this.field1322.entrySet().iterator();
            while (var4.hasNext()) {
                Entry var5 = (Entry) var4.next();
                int var6 = (Integer) var5.getKey();
                if (this.field1328[var6]) {
                    Object var7 = var5.getValue();
                    var2 += 3;
                    if (var7 instanceof Integer) {
                        var2 += 4;
                    } else if (var7 instanceof String) {
                        var2 += class440.method6331((String) var7);
                    }
                    var3++;
                }
            }
            class440 var8 = new class440(var2);
            var8.method6876(2);
            var8.method6877(var3);
            Iterator var9 = this.field1322.entrySet().iterator();
            label143: while (true) {
                Entry var10;
                int var11;
                do {
                    if (!var9.hasNext()) {
                        var1.method6735(var8.field4679, 0, var8.field4678);
                        break label143;
                    }
                    var10 = (Entry) var9.next();
                    var11 = (Integer) var10.getKey();
                } while (!this.field1328[var11]);
                var8.method6877(var11);
                Object var12 = var10.getValue();
                Class var13 = var12.getClass();
                class434[] var14 = new class434[] { class434.field4656, class434.field4657, class434.field4665 };
                class434[] var15 = var14;
                int var16 = 0;
                class434 var18;
                while (true) {
                    if (var16 >= var15.length) {
                        var18 = null;
                        break;
                    }
                    class434 var17 = var15[var16];
                    if (var17.field4668 == var13) {
                        var18 = var17;
                        break;
                    }
                    var16++;
                }
                var8.method6876(var18.field4659);
                class434.method6807(var12, var8);
            }
        } catch (Exception var31) {
        } finally {
            try {
                var1.method6725();
            } catch (Exception var30) {
            }
        }
        this.field1324 = false;
        this.field1325 = class270.method2485();
    }

    @ObfuscatedName("cu.v(S)V")
    public void method2321() {
        class426 var1 = this.method2302(false);
        label215: {
            try {
                byte[] var2 = new byte[(int) var1.method6724()];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method6731(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }
                class440 var5 = new class440(var2);
                if (var5.field4679.length - var5.field4678 < 1) {
                    return;
                }
                int var7 = var5.method7071();
                if (var7 >= 0 && var7 <= 2) {
                    if (var7 >= 2) {
                        int var9 = var5.method7082();
                        int var10 = 0;
                        while (true) {
                            if (var10 >= var9) {
                                break label215;
                            }
                            int var11 = var5.method7082();
                            int var12 = var5.method7071();
                            class434[] var13 = new class434[] { class434.field4656, class434.field4657, class434.field4665 };
                            class434 var14 = (class434) class330.method4934(var13, var12);
                            Object var15 = var14.method6809(var5);
                            if (this.field1328[var11]) {
                                this.field1322.put(var11, var15);
                            }
                            var10++;
                        }
                    } else {
                        int var16 = var5.method7082();
                        for (int var17 = 0; var17 < var16; var17++) {
                            int var18 = var5.method7082();
                            int var19 = var5.method6898();
                            if (this.field1328[var18]) {
                                this.field1322.put(var18, var19);
                            }
                        }
                        int var20 = var5.method7082();
                        int var21 = 0;
                        while (true) {
                            if (var21 >= var20) {
                                break label215;
                            }
                            var5.method7082();
                            var5.method7044();
                            var21++;
                        }
                    }
                }
            } catch (Exception var35) {
                break label215;
            } finally {
                try {
                    var1.method6725();
                } catch (Exception var34) {
                }
            }
            return;
        }
        this.field1324 = false;
    }

    @ObfuscatedName("cu.y(I)V")
    public void method2305() {
        if (this.field1324 && this.field1325 < class270.method2485() - 60000L) {
            this.method2303();
        }
    }

    @ObfuscatedName("cu.c(I)Z")
    public boolean method2306() {
        return this.field1324;
    }
}
