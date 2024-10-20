package deob;

import java.io.EOFException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

@ObfuscatedName("cj")
public class class98 {

    @ObfuscatedName("cj.i")
    public boolean[] field1301;

    @ObfuscatedName("cj.f")
    public Map field1293;

    @ObfuscatedName("cj.b")
    public String[] field1295;

    @ObfuscatedName("cj.n")
    public boolean field1298 = false;

    @ObfuscatedName("cj.s")
    public long field1297;

    public class98() {
        int var1 = Statics.field48.method5305(19);
        this.field1293 = new HashMap();
        this.field1301 = new boolean[var1];
        for (int var2 = 0; var2 < var1; var2++) {
            class173 var3 = class173.method6220(var2);
            this.field1301[var2] = var3.field1840;
        }
        int var4 = 0;
        if (Statics.field48.method5259(15)) {
            var4 = Statics.field48.method5305(15);
        }
        this.field1295 = new String[var4];
        this.method2315();
    }

    @ObfuscatedName("cj.v(III)V")
    public void method2339(int arg0, int arg1) {
        this.field1293.put(arg0, arg1);
        if (this.field1301[arg0]) {
            this.field1298 = true;
        }
    }

    @ObfuscatedName("cj.c(IS)I")
    public int method2307(int arg0) {
        Object var2 = this.field1293.get(arg0);
        return var2 instanceof Integer ? (Integer) var2 : -1;
    }

    @ObfuscatedName("cj.i(ILjava/lang/String;I)V")
    public void method2308(int arg0, String arg1) {
        this.field1293.put(arg0, arg1);
    }

    @ObfuscatedName("cj.f(II)Ljava/lang/String;")
    public String method2320(int arg0) {
        Object var2 = this.field1293.get(arg0);
        return var2 instanceof String ? (String) var2 : "";
    }

    @ObfuscatedName("cj.b(ILjava/lang/String;I)V")
    public void method2305(int arg0, String arg1) {
        this.field1295[arg0] = arg1;
    }

    @ObfuscatedName("cj.n(II)Ljava/lang/String;")
    public String method2309(int arg0) {
        return this.field1295[arg0];
    }

    @ObfuscatedName("cj.s(B)V")
    public void method2318() {
        for (int var1 = 0; var1 < this.field1301.length; var1++) {
            if (!this.field1301[var1]) {
                this.field1293.remove(var1);
            }
        }
        for (int var2 = 0; var2 < this.field1295.length; var2++) {
            this.field1295[var2] = null;
        }
    }

    @ObfuscatedName("cj.l(ZI)Lph;")
    public class424 method2313(boolean arg0) {
        return class158.method5515("2", Statics.field1306.field3564, arg0);
    }

    @ObfuscatedName("cj.q(I)V")
    public void method2314() {
        class424 var1 = this.method2313(true);
        try {
            int var2 = 3;
            int var3 = 0;
            Iterator var4 = this.field1293.entrySet().iterator();
            while (var4.hasNext()) {
                Entry var5 = (Entry) var4.next();
                int var6 = (Integer) var5.getKey();
                if (this.field1301[var6]) {
                    Object var7 = var5.getValue();
                    var2 += 3;
                    if (var7 instanceof Integer) {
                        var2 += 4;
                    } else if (var7 instanceof String) {
                        var2 += class438.method6861((String) var7);
                    }
                    var3++;
                }
            }
            class438 var8 = new class438(var2);
            var8.method6954(2);
            var8.method6955(var3);
            Iterator var9 = this.field1293.entrySet().iterator();
            label144: while (true) {
                Entry var10;
                int var11;
                do {
                    if (!var9.hasNext()) {
                        var1.method6822(var8.field4618, 0, var8.field4621);
                        break label144;
                    }
                    var10 = (Entry) var9.next();
                    var11 = (Integer) var10.getKey();
                } while (!this.field1301[var11]);
                var8.method6955(var11);
                Object var12 = var10.getValue();
                Class var13 = var12.getClass();
                class432[] var14 = class432.method6887();
                int var15 = 0;
                class432 var17;
                while (true) {
                    if (var15 >= var14.length) {
                        var17 = null;
                        break;
                    }
                    class432 var16 = var14[var15];
                    if (var16.field4594 == var13) {
                        var17 = var16;
                        break;
                    }
                    var15++;
                }
                var8.method6954(var17.field4597);
                class432.method6884(var12, var8);
            }
        } catch (Exception var30) {
        } finally {
            try {
                var1.method6814();
            } catch (Exception var29) {
            }
        }
        this.field1298 = false;
        this.field1297 = class270.method2724();
    }

    @ObfuscatedName("cj.o(I)V")
    public void method2315() {
        class424 var1 = this.method2313(false);
        try {
            byte[] var2 = new byte[(int) var1.method6813()];
            int var4;
            for (int var3 = 0; var3 < var2.length; var3 += var4) {
                var4 = var1.method6810(var2, var3, var2.length - var3);
                if (var4 == -1) {
                    throw new EOFException();
                }
            }
            class438 var5 = new class438(var2);
            if (var5.field4618.length - var5.field4621 < 1) {
                return;
            }
            int var7 = var5.method6971();
            if (var7 < 0 || var7 > 2) {
                return;
            }
            if (var7 >= 2) {
                int var9 = var5.method7148();
                for (int var10 = 0; var10 < var9; var10++) {
                    int var11 = var5.method7148();
                    int var12 = var5.method6971();
                    class432 var13 = (class432) class330.method4919(class432.method6887(), var12);
                    Object var14 = var13.method6886(var5);
                    if (this.field1301[var11]) {
                        this.field1293.put(var11, var14);
                    }
                }
            } else {
                int var15 = var5.method7148();
                for (int var16 = 0; var16 < var15; var16++) {
                    int var17 = var5.method7148();
                    int var18 = var5.method6976();
                    if (this.field1301[var17]) {
                        this.field1293.put(var17, var18);
                    }
                }
                int var19 = var5.method7148();
                for (int var20 = 0; var20 < var19; var20++) {
                    var5.method7148();
                    var5.method6981();
                }
            }
        } catch (Exception var34) {
        } finally {
            try {
                var1.method6814();
            } catch (Exception var33) {
            }
        }
        this.field1298 = false;
    }

    @ObfuscatedName("cj.r(I)V")
    public void method2316() {
        if (this.field1298 && this.field1297 < class270.method2724() - 60000L) {
            this.method2314();
        }
    }

    @ObfuscatedName("cj.p(B)Z")
    public boolean method2310() {
        return this.field1298;
    }
}
