package deob;

import java.io.EOFException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

@ObfuscatedName("cz")
public class class91 {

    @ObfuscatedName("cz.n")
    public boolean[] field1243;

    @ObfuscatedName("cz.q")
    public Map field1244;

    @ObfuscatedName("cz.v")
    public String[] field1245;

    @ObfuscatedName("cz.l")
    public boolean field1241 = false;

    @ObfuscatedName("cz.c")
    public long field1247;

    public class91() {
        int var1 = Statics.field286.method3953(19);
        this.field1244 = new HashMap();
        this.field1243 = new boolean[var1];
        for (int var2 = 0; var2 < var1; var2++) {
            class243 var3 = class243.method2438(var2);
            this.field1243[var2] = var3.field3223;
        }
        int var4 = 0;
        if (Statics.field286.method3998(15)) {
            var4 = Statics.field286.method3953(15);
        }
        this.field1245 = new String[var4];
        this.method2105();
    }

    @ObfuscatedName("cz.a(III)V")
    public void method2083(int arg0, int arg1) {
        this.field1244.put(arg0, arg1);
        if (this.field1243[arg0]) {
            this.field1241 = true;
        }
    }

    @ObfuscatedName("cz.t(II)I")
    public int method2084(int arg0) {
        Object var2 = this.field1244.get(arg0);
        return var2 instanceof Integer ? (Integer) var2 : -1;
    }

    @ObfuscatedName("cz.n(ILjava/lang/String;I)V")
    public void method2085(int arg0, String arg1) {
        this.field1244.put(arg0, arg1);
    }

    @ObfuscatedName("cz.q(II)Ljava/lang/String;")
    public String method2086(int arg0) {
        Object var2 = this.field1244.get(arg0);
        return var2 instanceof String ? (String) var2 : "";
    }

    @ObfuscatedName("cz.v(ILjava/lang/String;B)V")
    public void method2087(int arg0, String arg1) {
        this.field1245[arg0] = arg1;
    }

    @ObfuscatedName("cz.l(II)Ljava/lang/String;")
    public String method2082(int arg0) {
        return this.field1245[arg0];
    }

    @ObfuscatedName("cz.c(I)V")
    public void method2089() {
        for (int var1 = 0; var1 < this.field1243.length; var1++) {
            if (!this.field1243[var1]) {
                this.field1244.remove(var1);
            }
        }
        for (int var2 = 0; var2 < this.field1245.length; var2++) {
            this.field1245[var2] = null;
        }
    }

    @ObfuscatedName("cz.o(ZB)Lmh;")
    public class343 method2090(boolean arg0) {
        return class168.method3330("2", Statics.field459.field3098, arg0);
    }

    @ObfuscatedName("cz.i(I)V")
    public void method2091() {
        class343 var1 = this.method2090(true);
        try {
            int var2 = 3;
            int var3 = 0;
            Iterator var4 = this.field1244.entrySet().iterator();
            while (var4.hasNext()) {
                Entry var5 = (Entry) var4.next();
                int var6 = (Integer) var5.getKey();
                if (this.field1243[var6]) {
                    Object var7 = var5.getValue();
                    var2 += 3;
                    if (var7 instanceof Integer) {
                        var2 += 4;
                    } else if (var7 instanceof String) {
                        var2 += Statics.method3242((String) var7);
                    }
                    var3++;
                }
            }
            class300 var8 = new class300(var2);
            var8.method5253(2);
            var8.method5128(var3);
            Iterator var9 = this.field1244.entrySet().iterator();
            while (var9.hasNext()) {
                Entry var10 = (Entry) var9.next();
                int var11 = (Integer) var10.getKey();
                if (this.field1243[var11]) {
                    var8.method5128(var11);
                    Object var12 = var10.getValue();
                    class4 var13 = class4.method30(var12.getClass());
                    var8.method5253(var13.field15);
                    class4.method31(var12, var8);
                }
            }
            var1.method6158(var8.field3699, 0, var8.field3694);
        } catch (Exception var25) {
        } finally {
            try {
                var1.method6156();
            } catch (Exception var24) {
            }
        }
        this.field1241 = false;
        this.field1247 = class297.method3777();
    }

    @ObfuscatedName("cz.d(B)V")
    public void method2105() {
        class343 var1 = this.method2090(false);
        label203: {
            try {
                byte[] var2 = new byte[(int) var1.method6172()];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.method6159(var2, var3, var2.length - var3);
                    if (var4 == -1) {
                        throw new EOFException();
                    }
                }
                class300 var5 = new class300(var2);
                if (var5.field3699.length - var5.field3694 < 1) {
                    return;
                }
                int var7 = var5.method5123();
                if (var7 >= 0 && var7 <= 2) {
                    if (var7 >= 2) {
                        int var9 = var5.method5166();
                        int var10 = 0;
                        while (true) {
                            if (var10 >= var9) {
                                break label203;
                            }
                            int var11 = var5.method5166();
                            int var12 = var5.method5123();
                            class4[] var13 = new class4[] { class4.field14, class4.field19, class4.field18 };
                            class4 var14 = (class4) class196.method292(var13, var12);
                            Object var15 = var14.method34(var5);
                            if (this.field1243[var11]) {
                                this.field1244.put(var11, var15);
                            }
                            var10++;
                        }
                    } else {
                        int var16 = var5.method5166();
                        for (int var17 = 0; var17 < var16; var17++) {
                            int var18 = var5.method5166();
                            int var19 = var5.method5155();
                            if (this.field1243[var18]) {
                                this.field1244.put(var18, var19);
                            }
                        }
                        int var20 = var5.method5166();
                        int var21 = 0;
                        while (true) {
                            if (var21 >= var20) {
                                break label203;
                            }
                            var5.method5166();
                            var5.method5132();
                            var21++;
                        }
                    }
                }
            } catch (Exception var35) {
                break label203;
            } finally {
                try {
                    var1.method6156();
                } catch (Exception var34) {
                }
            }
            return;
        }
        this.field1241 = false;
    }

    @ObfuscatedName("cz.m(I)V")
    public void method2102() {
        if (this.field1241 && this.field1247 < class297.method3777() - 60000L) {
            this.method2091();
        }
    }

    @ObfuscatedName("cz.p(B)Z")
    public boolean method2094() {
        return this.field1241;
    }
}
