package deob;

@ObfuscatedName("cg")
public class class65 {

    @ObfuscatedName("cg.ac")
    public final class469 field809;

    @ObfuscatedName("cg.au")
    public final class403 field811;

    @ObfuscatedName("cg.ab")
    public final class401 field812;

    @ObfuscatedName("cg.aq")
    public int field813 = 0;

    public class65(class469 arg0) {
        this.field809 = arg0;
        this.field811 = new class403(arg0);
        this.field812 = new class401(arg0);
    }

    @ObfuscatedName("cg.af(I)Z")
    public boolean method1749() {
        return this.field813 == 2;
    }

    @ObfuscatedName("cg.an(B)V")
    public final void method1736() {
        this.field813 = 1;
    }

    @ObfuscatedName("cg.aw(Lsg;II)V")
    public final void method1790(class489 arg0, int arg1) {
        this.field811.method7097(arg0, arg1);
        this.field813 = 2;
        for (int var3 = 0; var3 < class103.field1335; var3++) {
            class88 var4 = client.field611[class103.field1341[var3]];
            var4.method2184();
        }
        class106.method578();
        if (Statics.field1426 != null) {
            Statics.field1426.method7112();
        }
    }

    @ObfuscatedName("cg.ac(I)V")
    public final void method1785() {
        for (class406 var1 = (class406) this.field811.field4559.method6446(); var1 != null; var1 = (class406) this.field811.field4559.method6449()) {
            if ((long) var1.field4576 < class294.method2504() / 1000L - 5L) {
                if (var1.field4575 > 0) {
                    class106.method2767(5, "", var1.field4573 + class337.field3997);
                }
                if (var1.field4575 == 0) {
                    class106.method2767(5, "", var1.field4573 + class337.field3998);
                }
                var1.method7639();
            }
        }
    }

    @ObfuscatedName("cg.au(B)V")
    public final void method1759() {
        this.field813 = 0;
        this.field811.method7231();
        this.field812.method7231();
    }

    @ObfuscatedName("cg.ab(Ltm;ZB)Z")
    public final boolean method1740(class513 arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        } else if (arg0.equals(Statics.field3454.field1089)) {
            return true;
        } else {
            return this.field811.method7105(arg0, arg1);
        }
    }

    @ObfuscatedName("cg.aq(Ltm;I)Z")
    public final boolean method1741(class513 arg0) {
        if (arg0 == null) {
            return false;
        } else {
            return this.field812.method7218(arg0);
        }
    }

    @ObfuscatedName("cg.al(Ljava/lang/String;B)V")
    public final void method1742(String arg0) {
        if (arg0 == null) {
            return;
        }
        class513 var2 = new class513(arg0, this.field809);
        if (!var2.method8843()) {
            return;
        }
        if (this.method1743()) {
            method3511(class337.field4016);
        } else if (Statics.field3454.field1089.equals(var2)) {
            method495();
        } else if (this.method1740(var2, false)) {
            method3511(arg0 + class337.field4081);
        } else if (this.method1741(var2)) {
            method1103(arg0);
        } else {
            class289 var3 = class289.method5974(class287.field3154, client.field753.field1385);
            var3.field3212.method8285(class489.method2043(arg0));
            var3.field3212.method8238(arg0);
            client.field753.method2650(var3);
        }
    }

    @ObfuscatedName("hn.at(Ljava/lang/String;I)V")
    public static final void method3511(String arg0) {
        class106.method2767(30, "", arg0);
    }

    @ObfuscatedName("cq.aa(Ljava/lang/String;B)V")
    public static final void method1103(String arg0) {
        method3511(class337.field4022 + arg0 + class337.field4023);
    }

    @ObfuscatedName("bz.ay(I)V")
    public static final void method495() {
        method3511(class337.field4020);
    }

    @ObfuscatedName("cg.ao(B)Z")
    public final boolean method1743() {
        return this.field811.method7196() || this.field811.method7195() >= 200 && client.field613 != 1;
    }

    @ObfuscatedName("cg.ax(Ljava/lang/String;I)V")
    public final void method1744(String arg0) {
        if (arg0 == null) {
            return;
        }
        class513 var2 = new class513(arg0, this.field809);
        if (!var2.method8843()) {
            return;
        }
        if (this.method1757()) {
            method3511(class337.field4018);
        } else if (Statics.field3454.field1089.equals(var2)) {
            method1153();
        } else if (this.method1741(var2)) {
            method3511(arg0 + class337.field4019);
        } else if (this.method1740(var2, false)) {
            method3511(class337.field3943 + arg0 + class337.field3974);
        } else {
            class289 var3 = class289.method5974(class287.field3120, client.field753.field1385);
            var3.field3212.method8285(class489.method2043(arg0));
            var3.field3212.method8238(arg0);
            client.field753.method2650(var3);
        }
    }

    @ObfuscatedName("cf.ai(I)V")
    public static final void method1153() {
        method3511(class337.field3849);
    }

    @ObfuscatedName("cg.ag(I)Z")
    public final boolean method1757() {
        return this.field812.method7196() || this.field812.method7195() >= 100 && client.field613 != 1;
    }

    @ObfuscatedName("cg.ah(Ljava/lang/String;I)V")
    public final void method1746(String arg0) {
        if (arg0 == null) {
            return;
        }
        class513 var2 = new class513(arg0, this.field809);
        if (!var2.method8843()) {
            return;
        }
        if (this.field811.method7206(var2)) {
            client.field690 = client.field680;
            class289 var3 = class289.method5974(class287.field3195, client.field753.field1385);
            var3.field3212.method8285(class489.method2043(arg0));
            var3.field3212.method8238(arg0);
            client.field753.method2650(var3);
        }
        for (int var4 = 0; var4 < class103.field1335; var4++) {
            class88 var5 = client.field611[class103.field1341[var4]];
            var5.method2184();
        }
        class106.method578();
        if (Statics.field1426 != null) {
            Statics.field1426.method7112();
        }
    }

    @ObfuscatedName("cg.av(Ljava/lang/String;ZB)V")
    public final void method1747(String arg0, boolean arg1) {
        if (arg0 == null) {
            return;
        }
        class513 var3 = new class513(arg0, this.field809);
        if (!var3.method8843()) {
            return;
        }
        if (this.field812.method7206(var3)) {
            client.field690 = client.field680;
            if (arg1) {
                class289 var4 = class289.method5974(class287.field3113, client.field753.field1385);
                var4.field3212.method8285(class489.method2043(arg0));
                var4.field3212.method8238(arg0);
                client.field753.method2650(var4);
            }
        }
        client.method2005();
    }

    @ObfuscatedName("dp.ar(Ljava/lang/String;IB)V")
    public static final void method2319(String arg0, int arg1) {
        class289 var2 = class289.method5974(class287.field3152, client.field753.field1385);
        var2.field3212.method8285(class489.method2043(arg0) + 1);
        var2.field3212.method8238(arg0);
        var2.field3212.method8285(arg1);
        client.field753.method2650(var2);
    }

    @ObfuscatedName("cg.am(Ltm;I)Z")
    public final boolean method1748(class513 arg0) {
        class405 var2 = (class405) this.field811.method7224(arg0);
        return var2 != null && var2.method7273();
    }
}
