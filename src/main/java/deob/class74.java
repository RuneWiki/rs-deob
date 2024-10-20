package deob;

import java.util.Iterator;

@ObfuscatedName("bd")
public class class74 {

    @ObfuscatedName("bd.g")
    public final class334 field1024;

    @ObfuscatedName("bd.b")
    public final class296 field1025;

    @ObfuscatedName("bd.a")
    public final class290 field1026;

    @ObfuscatedName("bd.c")
    public int field1027 = 0;

    public class74(class334 arg0) {
        this.field1024 = arg0;
        this.field1025 = new class296(arg0);
        this.field1026 = new class290(arg0);
    }

    @ObfuscatedName("bd.n(B)Z")
    public boolean method1646() {
        return this.field1027 == 2;
    }

    @ObfuscatedName("bd.h(B)V")
    public final void method1660() {
        this.field1027 = 1;
    }

    @ObfuscatedName("bd.l(Lgc;IB)V")
    public final void method1648(class190 arg0, int arg1) {
        this.field1025.method5249(arg0, arg1);
        this.field1027 = 2;
        for (int var3 = 0; var3 < class89.field1213; var3++) {
            class67 var4 = client.field746[class89.field1214[var3]];
            var4.method1115();
        }
        Iterator var5 = class91.field1235.iterator();
        while (var5.hasNext()) {
            class65 var6 = (class65) var5.next();
            var6.method1060();
        }
        if (Statics.field481 != null) {
            Statics.field481.method5293();
        }
    }

    @ObfuscatedName("bd.g(I)V")
    public final void method1649() {
        for (class300 var1 = (class300) this.field1025.field3709.method4034(); var1 != null; var1 = (class300) this.field1025.field3709.method4028()) {
            if ((long) var1.field3728 < class192.method81() / 1000L - 5L) {
                if (var1.field3729 > 0) {
                    class91.method1872(5, "", var1.field3727 + class245.field2928);
                }
                if (var1.field3729 == 0) {
                    class91.method1872(5, "", var1.field3727 + class245.field2973);
                }
                var1.method4036();
            }
        }
    }

    @ObfuscatedName("bd.b(B)V")
    public final void method1699() {
        this.field1027 = 0;
        this.field1025.method5163();
        this.field1026.method5163();
    }

    @ObfuscatedName("bd.a(Lku;ZI)Z")
    public final boolean method1651(class297 arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        } else if (arg0.equals(Statics.field218.field595)) {
            return true;
        } else {
            return this.field1025.method5250(arg0, arg1);
        }
    }

    @ObfuscatedName("bd.c(Lku;B)Z")
    public final boolean method1694(class297 arg0) {
        if (arg0 == null) {
            return false;
        } else {
            return this.field1026.method5166(arg0);
        }
    }

    @ObfuscatedName("bd.z(Ljava/lang/String;B)V")
    public final void method1653(String arg0) {
        if (arg0 == null) {
            return;
        }
        class297 var2 = new class297(arg0, this.field1024);
        if (!var2.method5264()) {
            return;
        }
        if (this.method1654()) {
            method3103();
        } else if (Statics.field218.field595.equals(var2)) {
            method92(class245.field3042);
        } else if (this.method1651(var2, false)) {
            method1008(arg0);
        } else if (this.method1694(var2)) {
            method92(class245.field3044 + arg0 + class245.field3045);
        } else {
            class180 var3 = class180.method1090(class177.field2307, client.field886.field1271);
            var3.field2345.method3646(class190.method3098(arg0));
            var3.field2345.method3669(arg0);
            client.field886.method2059(var3);
        }
    }

    @ObfuscatedName("d.j(Ljava/lang/String;S)V")
    public static final void method92(String arg0) {
        class91.method1872(30, "", arg0);
    }

    @ObfuscatedName("ez.d(I)V")
    public static final void method3103() {
        method92(class245.field3038);
    }

    @ObfuscatedName("bj.i(Ljava/lang/String;I)V")
    public static final void method1008(String arg0) {
        method92(arg0 + class245.field3039);
    }

    @ObfuscatedName("bd.m(B)Z")
    public final boolean method1654() {
        return this.field1025.method5165() || this.field1025.method5164() >= 200 && client.field789 != 1;
    }

    @ObfuscatedName("bd.v(Ljava/lang/String;I)V")
    public final void method1655(String arg0) {
        if (arg0 == null) {
            return;
        }
        class297 var2 = new class297(arg0, this.field1024);
        if (!var2.method5264()) {
            return;
        }
        if (this.method1656()) {
            method1863();
        } else if (Statics.field218.field595.equals(var2)) {
            method92(class245.field3043);
        } else if (this.method1694(var2)) {
            method92(arg0 + class245.field2876);
        } else if (this.method1651(var2, false)) {
            method92(class245.field3046 + arg0 + class245.field3047);
        } else {
            method4785(arg0);
        }
    }

    @ObfuscatedName("cf.r(I)V")
    public static final void method1863() {
        method92(class245.field3040);
    }

    @ObfuscatedName("jc.x(Ljava/lang/String;I)V")
    public static final void method4785(String arg0) {
        class180 var1 = class180.method1090(class177.field2309, client.field886.field1271);
        var1.field2345.method3646(class190.method3098(arg0));
        var1.field2345.method3669(arg0);
        client.field886.method2059(var1);
    }

    @ObfuscatedName("bd.y(I)Z")
    public final boolean method1656() {
        return this.field1026.method5165() || this.field1026.method5164() >= 100 && client.field789 != 1;
    }

    @ObfuscatedName("bd.p(Ljava/lang/String;I)V")
    public final void method1715(String arg0) {
        if (arg0 == null) {
            return;
        }
        class297 var2 = new class297(arg0, this.field1024);
        if (!var2.method5264()) {
            return;
        }
        if (this.field1025.method5170(var2)) {
            client.field642 = client.field740;
            class180 var3 = class180.method1090(class177.field2273, client.field886.field1271);
            var3.field2345.method3646(class190.method3098(arg0));
            var3.field2345.method3669(arg0);
            client.field886.method2059(var3);
        }
        for (int var4 = 0; var4 < class89.field1213; var4++) {
            class67 var5 = client.field746[class89.field1214[var4]];
            var5.method1115();
        }
        Iterator var6 = class91.field1235.iterator();
        while (var6.hasNext()) {
            class65 var7 = (class65) var6.next();
            var7.method1060();
        }
        if (Statics.field481 != null) {
            Statics.field481.method5293();
        }
    }

    @ObfuscatedName("bd.k(Ljava/lang/String;I)V")
    public final void method1658(String arg0) {
        if (arg0 == null) {
            return;
        }
        class297 var2 = new class297(arg0, this.field1024);
        if (!var2.method5264()) {
            return;
        }
        if (this.field1026.method5170(var2)) {
            client.field642 = client.field740;
            class180 var3 = class180.method1090(class177.field2247, client.field886.field1271);
            var3.field2345.method3646(class190.method3098(arg0));
            var3.field2345.method3669(arg0);
            client.field886.method2059(var3);
        }
        client.method5304();
    }

    @ObfuscatedName("bf.o(Ljava/lang/String;II)V")
    public static final void method899(String arg0, int arg1) {
        class180 var2 = class180.method1090(class177.field2296, client.field886.field1271);
        var2.field2345.method3646(class190.method3098(arg0) + 1);
        var2.field2345.method3669(arg0);
        var2.field2345.method3646(arg1);
        client.field886.method2059(var2);
    }

    @ObfuscatedName("bd.s(Lku;B)Z")
    public final boolean method1659(class297 arg0) {
        class298 var2 = (class298) this.field1025.method5217(arg0);
        return var2 != null && var2.method5234();
    }
}
