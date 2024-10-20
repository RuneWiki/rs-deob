package deob;

import java.util.Iterator;

@ObfuscatedName("bm")
public class class62 {

    @ObfuscatedName("bm.a")
    public final class383 field765;

    @ObfuscatedName("bm.o")
    public final class333 field764;

    @ObfuscatedName("bm.g")
    public final class331 field763;

    @ObfuscatedName("bm.e")
    public int field766 = 0;

    public class62(class383 arg0) {
        this.field765 = arg0;
        this.field764 = new class333(arg0);
        this.field763 = new class331(arg0);
    }

    @ObfuscatedName("bm.i(I)Z")
    public boolean method1661() {
        return this.field766 == 2;
    }

    @ObfuscatedName("bm.w(I)V")
    public final void method1650() {
        this.field766 = 1;
    }

    @ObfuscatedName("bm.s(Lop;IB)V")
    public final void method1595(class401 arg0, int arg1) {
        this.field764.method5416(arg0, arg1);
        this.field766 = 2;
        client.method2327();
    }

    @ObfuscatedName("bm.a(B)V")
    public final void method1624() {
        for (class336 var1 = (class336) this.field764.field3929.method5110(); var1 != null; var1 = (class336) this.field764.field3929.method5109()) {
            if ((long) var1.field3946 < class398.method2381() / 1000L - 5L) {
                if (var1.field3948 > 0) {
                    class98.method6175(5, "", var1.field3945 + class283.field3477);
                }
                if (var1.field3948 == 0) {
                    class98.method6175(5, "", var1.field3945 + class283.field3478);
                }
                var1.method5746();
            }
        }
    }

    @ObfuscatedName("bm.o(I)V")
    public final void method1594() {
        this.field766 = 0;
        this.field764.method5495();
        this.field763.method5495();
    }

    @ObfuscatedName("bm.g(Lpb;ZI)Z")
    public final boolean method1632(class422 arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        } else if (arg0.equals(Statics.field1674.field1048)) {
            return true;
        } else {
            return this.field764.method5413(arg0, arg1);
        }
    }

    @ObfuscatedName("bm.e(Lpb;I)Z")
    public final boolean method1598(class422 arg0) {
        if (arg0 == null) {
            return false;
        } else {
            return this.field763.method5498(arg0);
        }
    }

    @ObfuscatedName("bm.p(Ljava/lang/String;I)V")
    public final void method1599(String arg0) {
        if (arg0 == null) {
            return;
        }
        class422 var2 = new class422(arg0, this.field765);
        if (!var2.method6816()) {
            return;
        }
        if (this.method1643()) {
            method286();
        } else if (Statics.field1674.field1048.equals(var2)) {
            class283 var6 = (class283) null;
            String var3 = class283.field3500;
            class98.method6175(30, "", var3);
        } else if (this.method1632(var2, false)) {
            StringBuilder var10000 = (new StringBuilder()).append(arg0);
            class283 var10001 = (class283) null;
            String var4 = var10000.append(class283.field3407).toString();
            class98.method6175(30, "", var4);
        } else if (this.method1598(var2)) {
            method4665(arg0);
        } else {
            class242 var5 = class242.method3564(class240.field2748, client.field562.field1277);
            var5.field2792.method6223(Statics.method1282(arg0));
            var5.field2792.method6230(arg0);
            client.field562.method2269(var5);
        }
    }

    @ObfuscatedName("r.j(B)V")
    public static final void method286() {
        class283 var10000 = (class283) null;
        String var0 = class283.field3587;
        class98.method6175(30, "", var0);
    }

    @ObfuscatedName("jo.b(Ljava/lang/String;I)V")
    public static final void method4665(String arg0) {
        StringBuilder var10000 = new StringBuilder();
        class283 var10001 = (class283) null;
        StringBuilder var2 = var10000.append(class283.field3370).append(arg0);
        class283 var3 = (class283) null;
        String var1 = var2.append(class283.field3636).toString();
        class98.method6175(30, "", var1);
    }

    @ObfuscatedName("bm.x(I)Z")
    public final boolean method1643() {
        return this.field764.method5497() || this.field764.method5496() >= 200 && client.field589 != 1;
    }

    @ObfuscatedName("bm.y(Ljava/lang/String;I)V")
    public final void method1601(String arg0) {
        if (arg0 == null) {
            return;
        }
        class422 var2 = new class422(arg0, this.field765);
        if (!var2.method6816()) {
            return;
        }
        class283 var6;
        if (this.method1602()) {
            var6 = (class283) null;
            String var3 = class283.field3515;
            class98.method6175(30, "", var3);
        } else if (Statics.field1674.field1048.equals(var2)) {
            var6 = (class283) null;
            String var4 = class283.field3501;
            class98.method6175(30, "", var4);
        } else if (this.method1598(var2)) {
            StringBuilder var10000 = (new StringBuilder()).append(arg0);
            class283 var10001 = (class283) null;
            String var5 = var10000.append(class283.field3381).toString();
            class98.method6175(30, "", var5);
        } else if (this.method1632(var2, false)) {
            method316(arg0);
        } else {
            method75(arg0);
        }
    }

    @ObfuscatedName("f.k(Ljava/lang/String;I)V")
    public static final void method316(String arg0) {
        StringBuilder var10000 = new StringBuilder();
        class283 var10001 = (class283) null;
        StringBuilder var2 = var10000.append(class283.field3504).append(arg0);
        class283 var3 = (class283) null;
        String var1 = var2.append(class283.field3468).toString();
        class98.method6175(30, "", var1);
    }

    @ObfuscatedName("b.t(Ljava/lang/String;I)V")
    public static final void method75(String arg0) {
        class242 var1 = class242.method3564(class240.field2753, client.field562.field1277);
        var1.field2792.method6223(Statics.method1282(arg0));
        var1.field2792.method6230(arg0);
        client.field562.method2269(var1);
    }

    @ObfuscatedName("bm.l(B)Z")
    public final boolean method1602() {
        return this.field763.method5497() || this.field763.method5496() >= 100 && client.field589 != 1;
    }

    @ObfuscatedName("bm.u(Ljava/lang/String;B)V")
    public final void method1603(String arg0) {
        if (arg0 == null) {
            return;
        }
        class422 var2 = new class422(arg0, this.field765);
        if (!var2.method6816()) {
            return;
        }
        if (this.field764.method5569(var2)) {
            client.method2723();
            class242 var3 = class242.method3564(class240.field2685, client.field562.field1277);
            var3.field2792.method6223(Statics.method1282(arg0));
            var3.field2792.method6230(arg0);
            client.field562.method2269(var3);
        }
        for (int var4 = 0; var4 < class96.field1244; var4++) {
            class83 var5 = client.field587[class96.field1239[var4]];
            var5.method1993();
        }
        Iterator var6 = class98.field1267.iterator();
        while (var6.hasNext()) {
            class58 var7 = (class58) var6.next();
            var7.method1048();
        }
        if (Statics.field3704 != null) {
            Statics.field3704.method5431();
        }
    }

    @ObfuscatedName("bm.n(Ljava/lang/String;B)V")
    public final void method1596(String arg0) {
        if (arg0 == null) {
            return;
        }
        class422 var2 = new class422(arg0, this.field765);
        if (!var2.method6816()) {
            return;
        }
        if (this.field763.method5569(var2)) {
            client.method2723();
            class242 var3 = class242.method3564(class240.field2701, client.field562.field1277);
            var3.field2792.method6223(Statics.method1282(arg0));
            var3.field2792.method6230(arg0);
            client.field562.method2269(var3);
        }
        client.method4048();
    }

    @ObfuscatedName("y.z(Ljava/lang/String;II)V")
    public static final void method99(String arg0, int arg1) {
        class242 var2 = class242.method3564(class240.field2747, client.field562.field1277);
        var2.field2792.method6223(Statics.method1282(arg0) + 1);
        var2.field2792.method6230(arg0);
        var2.field2792.method6223(arg1);
        client.field562.method2269(var2);
    }

    @ObfuscatedName("bm.q(Lpb;I)Z")
    public final boolean method1605(class422 arg0) {
        class335 var2 = (class335) this.field764.method5499(arg0);
        return var2 != null && var2.method5586();
    }
}
