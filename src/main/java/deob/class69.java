package deob;

import java.util.Iterator;

@ObfuscatedName("ck")
public class class69 {

    @ObfuscatedName("ck.as")
    public final class481 field829;

    @ObfuscatedName("ck.ax")
    public final class416 field830;

    @ObfuscatedName("ck.ap")
    public final class414 field828;

    @ObfuscatedName("ck.ab")
    public int field836 = 0;

    public class69(class481 arg0) {
        this.field829 = arg0;
        this.field830 = new class416(arg0);
        this.field828 = new class414(arg0);
    }

    @ObfuscatedName("ck.at(I)Z")
    public boolean method1714() {
        return this.field836 == 2;
    }

    @ObfuscatedName("ck.an(I)V")
    public final void method1715() {
        this.field836 = 1;
    }

    @ObfuscatedName("ck.av(Ltz;II)V")
    public final void method1734(class501 arg0, int arg1) {
        this.field830.method7078(arg0, arg1);
        this.field836 = 2;
        for (int var3 = 0; var3 < class107.field1332; var3++) {
            class92 var4 = client.field613[class107.field1335[var3]];
            var4.method2175();
        }
        Iterator var5 = class110.field1375.iterator();
        while (var5.hasNext()) {
            class65 var6 = (class65) var5.next();
            var6.method1083();
        }
        if (Statics.field4535 != null) {
            Statics.field4535.method7087();
        }
    }

    @ObfuscatedName("ck.as(B)V")
    public final void method1716() {
        for (class419 var1 = (class419) this.field830.field4577.method6434(); var1 != null; var1 = (class419) this.field830.field4577.method6436()) {
            if ((long) var1.field4592 < class301.method4630() / 1000L - 5L) {
                if (var1.field4594 > 0) {
                    class110.method1047(5, "", var1.field4593 + class350.field4040);
                }
                if (var1.field4594 == 0) {
                    class110.method1047(5, "", var1.field4593 + class350.field4087);
                }
                var1.method7553();
            }
        }
    }

    @ObfuscatedName("ck.ax(B)V")
    public final void method1718() {
        this.field836 = 0;
        this.field830.method7216();
        this.field828.method7216();
    }

    @ObfuscatedName("ck.ap(Lun;ZS)Z")
    public final boolean method1719(class525 arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        } else if (arg0.equals(Statics.field971.field1112)) {
            return true;
        } else {
            return this.field830.method7077(arg0, arg1);
        }
    }

    @ObfuscatedName("ck.ab(Lun;I)Z")
    public final boolean method1720(class525 arg0) {
        if (arg0 == null) {
            return false;
        } else {
            return this.field828.method7176(arg0);
        }
    }

    @ObfuscatedName("ck.ak(Ljava/lang/String;I)V")
    public final void method1721(String arg0) {
        if (arg0 == null) {
            return;
        }
        class525 var2 = new class525(arg0, this.field829);
        if (!var2.method8772()) {
            return;
        }
        if (this.method1722()) {
            method5157();
        } else if (Statics.field971.field1112.equals(var2)) {
            method3691();
        } else if (this.method1719(var2, false)) {
            method2813(arg0);
        } else if (this.method1720(var2)) {
            method2938(arg0);
        } else {
            class296 var3 = class296.method3619(class294.field3154, client.field568.field1380);
            var3.field3211.method8113(class501.method5933(arg0));
            var3.field3211.method8119(arg0);
            client.field568.method2642(var3);
        }
    }

    @ObfuscatedName("hj.ae(Ljava/lang/String;B)V")
    public static final void method3510(String arg0) {
        class110.method1047(30, "", arg0);
    }

    @ObfuscatedName("lw.af(I)V")
    public static final void method5157() {
        method3510(class350.field4059);
    }

    @ObfuscatedName("ey.ao(Ljava/lang/String;S)V")
    public static final void method2813(String arg0) {
        method3510(arg0 + class350.field3963);
    }

    @ObfuscatedName("fd.aa(Ljava/lang/String;B)V")
    public static final void method2938(String arg0) {
        method3510(class350.field4065 + arg0 + class350.field4066);
    }

    @ObfuscatedName("hz.aj(I)V")
    public static final void method3691() {
        method3510(class350.field4159);
    }

    @ObfuscatedName("ck.ad(I)Z")
    public final boolean method1722() {
        return this.field830.method7220() || this.field830.method7181() >= 200 && client.field631 != 1;
    }

    @ObfuscatedName("ck.ac(Ljava/lang/String;S)V")
    public final void method1723(String arg0) {
        if (arg0 == null) {
            return;
        }
        class525 var2 = new class525(arg0, this.field829);
        if (!var2.method8772()) {
            return;
        }
        if (this.method1724()) {
            method3510(class350.field4061);
        } else if (Statics.field971.field1112.equals(var2)) {
            method3510(class350.field4009);
        } else if (this.method1720(var2)) {
            method3510(arg0 + class350.field4062);
        } else if (this.method1719(var2, false)) {
            method3510(class350.field3987 + arg0 + class350.field4068);
        } else {
            method50(arg0);
        }
    }

    @ObfuscatedName("ak.ag(Ljava/lang/String;B)V")
    public static final void method50(String arg0) {
        class296 var1 = class296.method3619(class294.field3112, client.field568.field1380);
        var1.field3211.method8113(class501.method5933(arg0));
        var1.field3211.method8119(arg0);
        client.field568.method2642(var1);
    }

    @ObfuscatedName("ck.ar(B)Z")
    public final boolean method1724() {
        return this.field828.method7220() || this.field828.method7181() >= 100 && client.field631 != 1;
    }

    @ObfuscatedName("ck.ah(Ljava/lang/String;B)V")
    public final void method1725(String arg0) {
        if (arg0 == null) {
            return;
        }
        class525 var2 = new class525(arg0, this.field829);
        if (!var2.method8772()) {
            return;
        }
        if (this.field830.method7180(var2)) {
            client.method5135();
            class296 var3 = class296.method3619(class294.field3170, client.field568.field1380);
            var3.field3211.method8113(class501.method5933(arg0));
            var3.field3211.method8119(arg0);
            client.field568.method2642(var3);
        }
        for (int var4 = 0; var4 < class107.field1332; var4++) {
            class92 var5 = client.field613[class107.field1335[var4]];
            var5.method2175();
        }
        Iterator var6 = class110.field1375.iterator();
        while (var6.hasNext()) {
            class65 var7 = (class65) var6.next();
            var7.method1083();
        }
        if (Statics.field4535 != null) {
            Statics.field4535.method7087();
        }
    }

    @ObfuscatedName("ck.az(Ljava/lang/String;ZI)V")
    public final void method1726(String arg0, boolean arg1) {
        if (arg0 == null) {
            return;
        }
        class525 var3 = new class525(arg0, this.field829);
        if (!var3.method8772()) {
            return;
        }
        if (this.field828.method7180(var3)) {
            client.method5135();
            if (arg1) {
                class296 var4 = class296.method3619(class294.field3174, client.field568.field1380);
                var4.field3211.method8113(class501.method5933(arg0));
                var4.field3211.method8119(arg0);
                client.field568.method2642(var4);
            }
        }
        client.method2195();
    }

    @ObfuscatedName("ck.ai(Lun;B)Z")
    public final boolean method1764(class525 arg0) {
        class418 var2 = (class418) this.field830.method7177(arg0);
        return var2 != null && var2.method7251();
    }
}
