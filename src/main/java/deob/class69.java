package deob;

@ObfuscatedName("bo")
public class class69 {

    @ObfuscatedName("bo.j")
    public final class331 field1028;

    @ObfuscatedName("bo.g")
    public final class293 field1025;

    @ObfuscatedName("bo.i")
    public final class287 field1029;

    @ObfuscatedName("bo.h")
    public int field1030 = 0;

    public class69(class331 arg0) {
        this.field1028 = arg0;
        this.field1025 = new class293(arg0);
        this.field1029 = new class287(arg0);
    }

    @ObfuscatedName("bo.c(I)Z")
    public boolean method1517() {
        return this.field1030 == 2;
    }

    @ObfuscatedName("bo.q(B)V")
    public final void method1518() {
        this.field1030 = 1;
    }

    @ObfuscatedName("bo.m(Lgg;II)V")
    public final void method1519(class185 arg0, int arg1) {
        this.field1025.method5066(arg0, arg1);
        this.field1030 = 2;
        for (int var3 = 0; var3 < class84.field1212; var3++) {
            class62 var4 = client.field758[class84.field1211[var3]];
            var4.method1037();
        }
        class86.method539();
        if (Statics.field928 != null) {
            Statics.field928.method5101();
        }
    }

    @ObfuscatedName("bo.j(I)V")
    public final void method1520() {
        for (class297 var1 = (class297) this.field1025.field3685.method3770(); var1 != null; var1 = (class297) this.field1025.field3685.method3769()) {
            if ((long) var1.field3706 < class187.method918() / 1000L - 5L) {
                if (var1.field3705 > 0) {
                    class86.method1671(5, "", var1.field3709 + class240.field2974);
                }
                if (var1.field3705 == 0) {
                    class86.method1671(5, "", var1.field3709 + class240.field2975);
                }
                var1.method3780();
            }
        }
    }

    @ObfuscatedName("bo.g(I)V")
    public final void method1521() {
        this.field1030 = 0;
        this.field1025.method5017();
        this.field1029.method5017();
    }

    @ObfuscatedName("bo.i(Lkz;ZI)Z")
    public final boolean method1522(class294 arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        } else if (arg0.equals(Statics.field241.field633)) {
            return true;
        } else {
            return this.field1025.method5065(arg0, arg1);
        }
    }

    @ObfuscatedName("bo.h(Lkz;I)Z")
    public final boolean method1528(class294 arg0) {
        if (arg0 == null) {
            return false;
        } else {
            return this.field1029.method4972(arg0);
        }
    }

    @ObfuscatedName("bo.l(Ljava/lang/String;I)V")
    public final void method1524(String arg0) {
        if (arg0 == null) {
            return;
        }
        class294 var2 = new class294(arg0, this.field1028);
        if (!var2.method5076()) {
            return;
        }
        if (this.method1525()) {
            method1448(class240.field2993);
        } else if (Statics.field241.field633.equals(var2)) {
            method1448(class240.field2997);
        } else if (this.method1522(var2, false)) {
            method1448(arg0 + class240.field2881);
        } else if (this.method1528(var2)) {
            method1448(class240.field2999 + arg0 + class240.field3000);
        } else {
            method1515(arg0);
        }
    }

    @ObfuscatedName("client.o(Ljava/lang/String;I)V")
    public static final void method1448(String arg0) {
        class86.method1671(30, "", arg0);
    }

    @ObfuscatedName("bi.k(Ljava/lang/String;I)V")
    public static final void method1515(String arg0) {
        class175 var1 = class175.method948(class172.field2263, client.field689.field1278);
        var1.field2308.method3227(class185.method1686(arg0));
        var1.field2308.method3234(arg0);
        client.field689.method1848(var1);
    }

    @ObfuscatedName("bo.v(I)Z")
    public final boolean method1525() {
        return this.field1025.method4998() || this.field1025.method4970() >= 200 && client.field760 != 1;
    }

    @ObfuscatedName("bo.p(Ljava/lang/String;I)V")
    public final void method1526(String arg0) {
        if (arg0 == null) {
            return;
        }
        class294 var2 = new class294(arg0, this.field1028);
        if (!var2.method5076()) {
            return;
        }
        if (this.method1575()) {
            method1448(class240.field2995);
        } else if (Statics.field241.field633.equals(var2)) {
            method1448(class240.field2920);
        } else if (this.method1528(var2)) {
            method662(arg0);
        } else if (this.method1522(var2, false)) {
            method2874(arg0);
        } else {
            method537(arg0);
        }
    }

    @ObfuscatedName("ag.n(Ljava/lang/String;B)V")
    public static final void method662(String arg0) {
        method1448(arg0 + class240.field2996);
    }

    @ObfuscatedName("ej.t(Ljava/lang/String;I)V")
    public static final void method2874(String arg0) {
        method1448(class240.field3001 + arg0 + class240.field3002);
    }

    @ObfuscatedName("ah.r(Ljava/lang/String;I)V")
    public static final void method537(String arg0) {
        class175 var1 = class175.method948(class172.field2181, client.field689.field1278);
        var1.field2308.method3227(class185.method1686(arg0));
        var1.field2308.method3234(arg0);
        client.field689.method1848(var1);
    }

    @ObfuscatedName("bo.x(B)Z")
    public final boolean method1575() {
        return this.field1029.method4998() || this.field1029.method4970() >= 100 && client.field760 != 1;
    }

    @ObfuscatedName("bo.b(Ljava/lang/String;I)V")
    public final void method1546(String arg0) {
        if (arg0 == null) {
            return;
        }
        class294 var2 = new class294(arg0, this.field1028);
        if (!var2.method5076()) {
            return;
        }
        if (this.field1025.method4995(var2)) {
            client.method2536();
            class175 var3 = class175.method948(class172.field2201, client.field689.field1278);
            var3.field2308.method3227(class185.method1686(arg0));
            var3.field2308.method3234(arg0);
            client.field689.method1848(var3);
        }
        for (int var4 = 0; var4 < class84.field1212; var4++) {
            class62 var5 = client.field758[class84.field1211[var4]];
            var5.method1037();
        }
        class86.method539();
        if (Statics.field928 != null) {
            Statics.field928.method5101();
        }
    }

    @ObfuscatedName("bo.w(Ljava/lang/String;B)V")
    public final void method1545(String arg0) {
        if (arg0 == null) {
            return;
        }
        class294 var2 = new class294(arg0, this.field1028);
        if (!var2.method5076()) {
            return;
        }
        if (this.field1029.method4995(var2)) {
            client.method2536();
            class175 var3 = class175.method948(class172.field2183, client.field689.field1278);
            var3.field2308.method3227(class185.method1686(arg0));
            var3.field2308.method3234(arg0);
            client.field689.method1848(var3);
        }
        client.method2288();
    }

    @ObfuscatedName("bo.a(Lkz;I)Z")
    public final boolean method1516(class294 arg0) {
        class295 var2 = (class295) this.field1025.method4973(arg0);
        return var2 != null && var2.method5056();
    }
}
