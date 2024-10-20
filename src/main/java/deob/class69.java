package deob;

import java.util.Iterator;

@ObfuscatedName("ci")
public class class69 {

    @ObfuscatedName("ci.at")
    public final class493 field851;

    @ObfuscatedName("ci.ac")
    public final class428 field855;

    @ObfuscatedName("ci.ai")
    public final class426 field853;

    @ObfuscatedName("ci.az")
    public int field852 = 0;

    public class69(class493 arg0) {
        this.field851 = arg0;
        this.field855 = new class428(arg0);
        this.field853 = new class426(arg0);
    }

    @ObfuscatedName("ci.au(I)Z")
    public boolean method1770() {
        return this.field852 == 2;
    }

    @ObfuscatedName("ci.ae(I)V")
    public final void method1771() {
        this.field852 = 1;
    }

    @ObfuscatedName("ci.ao(Ltm;II)V")
    public final void method1800(class515 arg0, int arg1) {
        this.field855.method7197(arg0, arg1);
        this.field852 = 2;
        for (int var3 = 0; var3 < class108.field1380; var3++) {
            class92 var4 = client.field700[class108.field1381[var3]];
            var4.method2209();
        }
        Iterator var5 = class111.field1420.iterator();
        while (var5.hasNext()) {
            class65 var6 = (class65) var5.next();
            var6.method1127();
        }
        if (Statics.field265 != null) {
            Statics.field265.method7207();
        }
    }

    @ObfuscatedName("ci.at(I)V")
    public final void method1773() {
        for (class431 var1 = (class431) this.field855.field4632.method6522(); var1 != null; var1 = (class431) this.field855.field4632.method6518()) {
            if ((long) var1.field4652 < class302.method655() / 1000L - 5L) {
                if (var1.field4650 > 0) {
                    class111.method683(5, "", var1.field4649 + class352.field4074);
                }
                if (var1.field4650 == 0) {
                    class111.method683(5, "", var1.field4649 + class352.field3968);
                }
                var1.method7693();
            }
        }
    }

    @ObfuscatedName("ci.ac(B)V")
    public final void method1774() {
        this.field852 = 0;
        this.field855.method7272();
        this.field853.method7272();
    }

    @ObfuscatedName("ci.ai(Luc;ZI)Z")
    public final boolean method1775(class538 arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        } else if (arg0.equals(Statics.field2132.field1146)) {
            return true;
        } else {
            return this.field855.method7195(arg0, arg1);
        }
    }

    @ObfuscatedName("ci.az(Luc;I)Z")
    public final boolean method1776(class538 arg0) {
        if (arg0 == null) {
            return false;
        } else {
            return this.field853.method7307(arg0);
        }
    }

    @ObfuscatedName("ci.ap(Ljava/lang/String;B)V")
    public final void method1777(String arg0) {
        if (arg0 == null) {
            return;
        }
        class538 var2 = new class538(arg0, this.field851);
        if (!var2.method8930()) {
            return;
        }
        if (this.method1778()) {
            method2745(class352.field4093);
        } else if (Statics.field2132.field1146.equals(var2)) {
            method3262();
        } else if (this.method1775(var2, false)) {
            method6060(arg0);
        } else if (this.method1776(var2)) {
            method2745(class352.field4099 + arg0 + class352.field4100);
        } else {
            method692(arg0);
        }
    }

    @ObfuscatedName("eb.aa(Ljava/lang/String;B)V")
    public static final void method2745(String arg0) {
        class111.method683(30, "", arg0);
    }

    @ObfuscatedName("nr.af(Ljava/lang/String;B)V")
    public static final void method6060(String arg0) {
        method2745(arg0 + class352.field3915);
    }

    @ObfuscatedName("ht.ad(I)V")
    public static final void method3262() {
        method2745(class352.field4097);
    }

    @ObfuscatedName("bf.aq(Ljava/lang/String;I)V")
    public static final void method692(String arg0) {
        class297 var1 = class297.method1166(class295.field3115, client.field592.field1429);
        var1.field3227.method8283(class515.method7389(arg0));
        var1.field3227.method8290(arg0);
        client.field592.method2665(var1);
    }

    @ObfuscatedName("ci.al(I)Z")
    public final boolean method1778() {
        return this.field855.method7274() || this.field855.method7328() >= 200 && client.field656 != 1;
    }

    @ObfuscatedName("ci.an(Ljava/lang/String;I)V")
    public final void method1779(String arg0) {
        if (arg0 == null) {
            return;
        }
        class538 var2 = new class538(arg0, this.field851);
        if (!var2.method8930()) {
            return;
        }
        if (this.method1791()) {
            method2745(class352.field4095);
        } else if (Statics.field2132.field1146.equals(var2)) {
            method8177();
        } else if (this.method1776(var2)) {
            method460(arg0);
        } else if (this.method1775(var2, false)) {
            method2745(class352.field3913 + arg0 + class352.field4072);
        } else {
            class297 var3 = class297.method1166(class295.field3163, client.field592.field1429);
            var3.field3227.method8283(class515.method7389(arg0));
            var3.field3227.method8290(arg0);
            client.field592.method2665(var3);
        }
    }

    @ObfuscatedName("bd.ar(Ljava/lang/String;I)V")
    public static final void method460(String arg0) {
        method2745(arg0 + class352.field4096);
    }

    @ObfuscatedName("tz.ab(I)V")
    public static final void method8177() {
        method2745(class352.field4098);
    }

    @ObfuscatedName("ci.ag(I)Z")
    public final boolean method1791() {
        return this.field853.method7274() || this.field853.method7328() >= 100 && client.field656 != 1;
    }

    @ObfuscatedName("ci.am(Ljava/lang/String;I)V")
    public final void method1781(String arg0) {
        if (arg0 == null) {
            return;
        }
        class538 var2 = new class538(arg0, this.field851);
        if (!var2.method8930()) {
            return;
        }
        if (this.field855.method7325(var2)) {
            client.method2720();
            class297 var3 = class297.method1166(class295.field3143, client.field592.field1429);
            var3.field3227.method8283(class515.method7389(arg0));
            var3.field3227.method8290(arg0);
            client.field592.method2665(var3);
        }
        for (int var4 = 0; var4 < class108.field1380; var4++) {
            class92 var5 = client.field700[class108.field1381[var4]];
            var5.method2209();
        }
        Iterator var6 = class111.field1420.iterator();
        while (var6.hasNext()) {
            class65 var7 = (class65) var6.next();
            var7.method1127();
        }
        if (Statics.field265 != null) {
            Statics.field265.method7207();
        }
    }

    @ObfuscatedName("ci.ax(Ljava/lang/String;ZI)V")
    public final void method1782(String arg0, boolean arg1) {
        if (arg0 == null) {
            return;
        }
        class538 var3 = new class538(arg0, this.field851);
        if (!var3.method8930()) {
            return;
        }
        if (this.field853.method7325(var3)) {
            client.method2720();
            if (arg1) {
                class297 var4 = class297.method1166(class295.field3165, client.field592.field1429);
                var4.field3227.method8283(class515.method7389(arg0));
                var4.field3227.method8290(arg0);
                client.field592.method2665(var4);
            }
        }
        client.method7388();
    }

    @ObfuscatedName("gw.ah(Ljava/lang/String;II)V")
    public static final void method3070(String arg0, int arg1) {
        class297 var2 = class297.method1166(class295.field3182, client.field592.field1429);
        var2.field3227.method8283(class515.method7389(arg0) + 1);
        var2.field3227.method8283(arg1);
        var2.field3227.method8290(arg0);
        client.field592.method2665(var2);
    }

    @ObfuscatedName("ci.as(Luc;I)Z")
    public final boolean method1822(class538 arg0) {
        class430 var2 = (class430) this.field855.method7276(arg0);
        return var2 != null && var2.method7354();
    }
}
