package deob;

import java.util.Iterator;

@ObfuscatedName("cf")
public class class80 {

    @ObfuscatedName("cf.d")
    public final class336 field1253;

    @ObfuscatedName("cf.h")
    public final class305 field1257;

    @ObfuscatedName("cf.m")
    public final class299 field1255;

    @ObfuscatedName("cf.z")
    public int field1254 = 0;

    public class80(class336 arg0) {
        this.field1253 = arg0;
        this.field1257 = new class305(arg0);
        this.field1255 = new class299(arg0);
    }

    @ObfuscatedName("cf.o(B)Z")
    public boolean method1587() {
        return this.field1254 == 2;
    }

    @ObfuscatedName("cf.k(B)V")
    public final void method1588() {
        this.field1254 = 1;
    }

    @ObfuscatedName("cf.t(Lgc;IB)V")
    public final void method1589(class195 arg0, int arg1) {
        this.field1257.method5007(arg0, arg1);
        this.field1254 = 2;
        for (int var3 = 0; var3 < class94.field1432; var3++) {
            class73 var4 = client.field986[class94.field1437[var3]];
            var4.method1075();
        }
        Iterator var5 = class96.field1451.iterator();
        while (var5.hasNext()) {
            class71 var6 = (class71) var5.next();
            var6.method1035();
        }
        if (Statics.field696 != null) {
            Statics.field696.method5044();
        }
    }

    @ObfuscatedName("cf.d(I)V")
    public final void method1590() {
        for (class309 var1 = (class309) this.field1257.field3857.method3735(); var1 != null; var1 = (class309) this.field1257.field3857.method3734()) {
            if ((long) var1.field3877 < class197.method1005() / 1000L - 5L) {
                if (var1.field3876 > 0) {
                    class96.method752(5, "", var1.field3878 + class252.field3069);
                }
                if (var1.field3876 == 0) {
                    class96.method752(5, "", var1.field3878 + class252.field3173);
                }
                var1.method3741();
            }
        }
    }

    @ObfuscatedName("cf.h(S)V")
    public final void method1611() {
        this.field1254 = 0;
        this.field1257.method4914();
        this.field1255.method4914();
    }

    @ObfuscatedName("cf.m(Lkz;ZB)Z")
    public final boolean method1592(class306 arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        } else if (arg0.equals(Statics.field642.field842)) {
            return true;
        } else {
            return this.field1257.method5008(arg0, arg1);
        }
    }

    @ObfuscatedName("cf.z(Lkz;B)Z")
    public final boolean method1593(class306 arg0) {
        if (arg0 == null) {
            return false;
        } else {
            return this.field1255.method4918(arg0);
        }
    }

    @ObfuscatedName("cf.i(Ljava/lang/String;B)V")
    public final void method1635(String arg0) {
        if (arg0 == null) {
            return;
        }
        class306 var2 = new class306(arg0, this.field1253);
        if (!var2.method5017()) {
            return;
        }
        class252 var8;
        if (this.method1595()) {
            var8 = (class252) null;
            String var3 = class252.field3191;
            class96.method752(30, "", var3);
        } else if (Statics.field642.field842.equals(var2)) {
            var8 = (class252) null;
            String var4 = class252.field3195;
            class96.method752(30, "", var4);
        } else {
            StringBuilder var10000;
            class252 var10001;
            if (this.method1592(var2, false)) {
                var10000 = (new StringBuilder()).append(arg0);
                var10001 = (class252) null;
                String var5 = var10000.append(class252.field3192).toString();
                class96.method752(30, "", var5);
            } else if (this.method1593(var2)) {
                var10000 = new StringBuilder();
                var10001 = (class252) null;
                StringBuilder var7 = var10000.append(class252.field3197).append(arg0);
                class252 var9 = (class252) null;
                String var6 = var7.append(class252.field3198).toString();
                class96.method752(30, "", var6);
            } else {
                method584(arg0);
            }
        }
    }

    @ObfuscatedName("an.u(Ljava/lang/String;I)V")
    public static final void method584(String arg0) {
        class185 var1 = class185.method267(class182.field2435, client.field958.field1485);
        var1.field2505.method3189(class195.method451(arg0));
        var1.field2505.method3214(arg0);
        client.field958.method1882(var1);
    }

    @ObfuscatedName("cf.x(I)Z")
    public final boolean method1595() {
        return this.field1257.method4917() || this.field1257.method4916() >= 200 && client.field988 != 1;
    }

    @ObfuscatedName("cf.y(Ljava/lang/String;B)V")
    public final void method1637(String arg0) {
        if (arg0 == null) {
            return;
        }
        class306 var2 = new class306(arg0, this.field1253);
        if (!var2.method5017()) {
            return;
        }
        if (this.method1596()) {
            method188();
        } else if (Statics.field642.field842.equals(var2)) {
            class252 var6 = (class252) null;
            String var3 = class252.field3196;
            class96.method752(30, "", var3);
        } else if (this.method1593(var2)) {
            method3918(arg0);
        } else if (this.method1592(var2, false)) {
            StringBuilder var10000 = new StringBuilder();
            class252 var10001 = (class252) null;
            StringBuilder var5 = var10000.append(class252.field3165).append(arg0);
            class252 var7 = (class252) null;
            String var4 = var5.append(class252.field3200).toString();
            class96.method752(30, "", var4);
        } else {
            method4136(arg0);
        }
    }

    @ObfuscatedName("e.a(B)V")
    public static final void method188() {
        class252 var10000 = (class252) null;
        String var0 = class252.field3193;
        class96.method752(30, "", var0);
    }

    @ObfuscatedName("hn.v(Ljava/lang/String;I)V")
    public static final void method3918(String arg0) {
        StringBuilder var10000 = (new StringBuilder()).append(arg0);
        class252 var10001 = (class252) null;
        String var1 = var10000.append(class252.field3053).toString();
        class96.method752(30, "", var1);
    }

    @ObfuscatedName("id.q(Ljava/lang/String;I)V")
    public static final void method4136(String arg0) {
        class185 var1 = class185.method267(class182.field2472, client.field958.field1485);
        var1.field2505.method3189(class195.method451(arg0));
        var1.field2505.method3214(arg0);
        client.field958.method1882(var1);
    }

    @ObfuscatedName("cf.r(B)Z")
    public final boolean method1596() {
        return this.field1255.method4917() || this.field1255.method4916() >= 100 && client.field988 != 1;
    }

    @ObfuscatedName("cf.j(Ljava/lang/String;I)V")
    public final void method1597(String arg0) {
        if (arg0 == null) {
            return;
        }
        class306 var2 = new class306(arg0, this.field1253);
        if (!var2.method5017()) {
            return;
        }
        if (this.field1257.method4951(var2)) {
            client.method1135();
            class185 var3 = class185.method267(class182.field2476, client.field958.field1485);
            var3.field2505.method3189(class195.method451(arg0));
            var3.field2505.method3214(arg0);
            client.field958.method1882(var3);
        }
        for (int var4 = 0; var4 < class94.field1432; var4++) {
            class73 var5 = client.field986[class94.field1437[var4]];
            var5.method1075();
        }
        Iterator var6 = class96.field1451.iterator();
        while (var6.hasNext()) {
            class71 var7 = (class71) var6.next();
            var7.method1035();
        }
        if (Statics.field696 != null) {
            Statics.field696.method5044();
        }
    }

    @ObfuscatedName("cf.b(Ljava/lang/String;I)V")
    public final void method1598(String arg0) {
        if (arg0 == null) {
            return;
        }
        class306 var2 = new class306(arg0, this.field1253);
        if (!var2.method5017()) {
            return;
        }
        if (this.field1255.method4951(var2)) {
            client.method1135();
            class185 var3 = class185.method267(class182.field2471, client.field958.field1485);
            var3.field2505.method3189(class195.method451(arg0));
            var3.field2505.method3214(arg0);
            client.field958.method1882(var3);
        }
        client.method3434();
    }

    @ObfuscatedName("cf.g(Lkz;B)Z")
    public final boolean method1631(class306 arg0) {
        class307 var2 = (class307) this.field1257.method4919(arg0);
        return var2 != null && var2.method4991();
    }
}
