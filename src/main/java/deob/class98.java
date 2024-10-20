package deob;

import java.io.EOFException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

@Deprecated
@ObfuscatedName("ck")
public class class98 {

    @ObfuscatedName("ck.q")
    public boolean[] field1323;

    @ObfuscatedName("ck.f")
    public Map field1324;

    /**
     * @deprecated
     */
    @ObfuscatedName("ck.j")
    public String[] field1330;

    @ObfuscatedName("ck.e")
    public boolean field1325 = false;

    @ObfuscatedName("ck.g")
    public long field1322;

    public class98() {
        int var1 = Statics.field1651.method5313(19);
        this.field1324 = new HashMap();
        this.field1323 = new boolean[var1];
        for (int var2 = 0; var2 < var1; var2++) {
            class172 var3 = (class172) class172.field1854.method4691((long) var2);
            class172 var4;
            if (var3 == null) {
                byte[] var5 = Statics.field1855.method5305(19, var2);
                class172 var6 = new class172();
                if (var5 != null) {
                    var6.method3081(new class443(var5));
                }
                class172.field1854.method4693(var6, (long) var2);
                var4 = var6;
            } else {
                var4 = var3;
            }
            this.field1323[var2] = var4.field1853;
        }
        int var8 = 0;
        if (Statics.field1651.method5261(15)) {
            var8 = Statics.field1651.method5313(15);
        }
        this.field1330 = new String[var8];
        this.method2332();
    }

    @ObfuscatedName("ck.c(III)V")
    public void method2313(int arg0, int arg1) {
        this.field1324.put(arg0, arg1);
        if (this.field1323[arg0]) {
            this.field1325 = true;
        }
    }

    @ObfuscatedName("ck.v(IB)I")
    public int method2348(int arg0) {
        Object var2 = this.field1324.get(arg0);
        return var2 instanceof Integer ? (Integer) var2 : -1;
    }

    @ObfuscatedName("ck.q(ILjava/lang/String;I)V")
    public void method2341(int arg0, String arg1) {
        this.field1324.put(arg0, arg1);
    }

    @ObfuscatedName("ck.f(II)Ljava/lang/String;")
    public String method2334(int arg0) {
        Object var2 = this.field1324.get(arg0);
        return var2 instanceof String ? (String) var2 : "";
    }

    /**
     * @deprecated
     */
    @Deprecated
    @ObfuscatedName("ck.j(ILjava/lang/String;I)V")
    public void method2317(int arg0, String arg1) {
        this.field1330[arg0] = arg1;
    }

    /**
     * @deprecated
     */
    @Deprecated
    @ObfuscatedName("ck.e(IB)Ljava/lang/String;")
    public String method2318(int arg0) {
        return this.field1330[arg0];
    }

    @ObfuscatedName("ck.g(I)V")
    public void method2319() {
        for (int var1 = 0; var1 < this.field1323.length; var1++) {
            if (!this.field1323[var1]) {
                this.field1324.remove(var1);
            }
        }
        for (int var2 = 0; var2 < this.field1330.length; var2++) {
            this.field1330[var2] = null;
        }
    }

    @ObfuscatedName("ck.w(ZS)Lpn;")
    public class425 method2320(boolean arg0) {
        return class158.method1799("2", Statics.field3314.field3596, arg0);
    }

    @ObfuscatedName("ck.y(B)V")
    public void method2321() {
        class425 var1 = this.method2320(true);
        try {
            int var2 = 3;
            int var3 = 0;
            Iterator var4 = this.field1324.entrySet().iterator();
            while (var4.hasNext()) {
                Entry var5 = (Entry) var4.next();
                int var6 = (Integer) var5.getKey();
                if (this.field1323[var6]) {
                    Object var7 = var5.getValue();
                    var2 += 3;
                    if (var7 instanceof Integer) {
                        var2 += 4;
                    } else if (var7 instanceof String) {
                        var2 += class443.method2008((String) var7);
                    }
                    var3++;
                }
            }
            class443 var8 = new class443(var2);
            var8.method7031(2);
            var8.method7244(var3);
            Iterator var9 = this.field1324.entrySet().iterator();
            while (var9.hasNext()) {
                Entry var10 = (Entry) var9.next();
                int var11 = (Integer) var10.getKey();
                if (this.field1323[var11]) {
                    var8.method7244(var11);
                    Object var12 = var10.getValue();
                    class433 var13 = Statics.method6884(var12.getClass());
                    var8.method7031(var13.field4656);
                    class429 var14 = class433.method6899(var12.getClass());
                    var14.method6868(var12, var8);
                }
            }
            var1.method6812(var8.field4701, 0, var8.field4700);
        } catch (Exception var26) {
        } finally {
            try {
                var1.method6806();
            } catch (Exception var25) {
            }
        }
        this.field1325 = false;
        this.field1322 = class269.method2567();
    }

    @ObfuscatedName("ck.i(I)V")
    public void method2332() {
        class425 var1 = this.method2320(false);
        label215: {
            try {
                byte[] var2 = new byte[(int) var1.method6808()];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method6809(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }
                class443 var5 = new class443(var2);
                if (var5.field4701.length - var5.field4700 < 1) {
                    return;
                }
                int var7 = var5.method7047();
                if (var7 >= 0 && var7 <= 2) {
                    if (var7 >= 2) {
                        int var9 = var5.method7049();
                        int var10 = 0;
                        while (true) {
                            if (var10 >= var9) {
                                break label215;
                            }
                            int var11 = var5.method7049();
                            int var12 = var5.method7047();
                            class433 var13 = (class433) class329.method2087(class433.method6888(), var12);
                            Object var14 = var13.method6887(var5);
                            if (this.field1323[var11]) {
                                this.field1324.put(var11, var14);
                            }
                            var10++;
                        }
                    } else {
                        int var15 = var5.method7049();
                        for (int var16 = 0; var16 < var15; var16++) {
                            int var17 = var5.method7049();
                            int var18 = var5.method7052();
                            if (this.field1323[var17]) {
                                this.field1324.put(var17, var18);
                            }
                        }
                        int var19 = var5.method7049();
                        int var20 = 0;
                        while (true) {
                            if (var20 >= var19) {
                                break label215;
                            }
                            var5.method7049();
                            var5.method7057();
                            var20++;
                        }
                    }
                }
            } catch (Exception var34) {
                break label215;
            } finally {
                try {
                    var1.method6806();
                } catch (Exception var33) {
                }
            }
            return;
        }
        this.field1325 = false;
    }

    @ObfuscatedName("ck.s(I)V")
    public void method2323() {
        if (this.field1325 && this.field1322 < class269.method2567() - 60000L) {
            this.method2321();
        }
    }

    @ObfuscatedName("ck.t(I)Z")
    public boolean method2324() {
        return this.field1325;
    }
}
