package deob;

import java.util.Iterator;

@ObfuscatedName("cj")
public class class69 {

    @ObfuscatedName("cj.ao")
    public final class505 field814;

    @ObfuscatedName("cj.ab")
    public final class440 field815;

    @ObfuscatedName("cj.au")
    public final class438 field816;

    @ObfuscatedName("cj.aa")
    public int field817 = 0;

    public class69(class505 arg0) {
        this.field814 = arg0;
        this.field815 = new class440(arg0);
        this.field816 = new class438(arg0);
    }

    @ObfuscatedName("cj.at(B)Z")
    public boolean method1796() {
        return this.field817 == 2;
    }

    @ObfuscatedName("cj.ah(I)V")
    public final void method1823() {
        this.field817 = 1;
    }

    @ObfuscatedName("cj.ar(Luj;II)V")
    public final void method1798(class527 arg0, int arg1) {
        this.field815.method7352(arg0, arg1);
        this.field817 = 2;
        for (int var3 = 0; var3 < class108.field1362; var3++) {
            class92 var4 = client.field651[class108.field1370[var3]];
            var4.method2297();
        }
        Iterator var5 = class111.field1397.iterator();
        while (var5.hasNext()) {
            class65 var6 = (class65) var5.next();
            var6.method1133();
        }
        if (Statics.field106 != null) {
            Statics.field106.method7360();
        }
    }

    @ObfuscatedName("cj.ao(I)V")
    public final void method1799() {
        for (class443 var1 = (class443) this.field815.field4668.method6678(); var1 != null; var1 = (class443) this.field815.field4668.method6676()) {
            if ((long) var1.field4684 < class313.method3460() / 1000L - 5L) {
                if (var1.field4685 > 0) {
                    class111.method6477(5, "", var1.field4683 + class364.field4087);
                }
                if (var1.field4685 == 0) {
                    class111.method6477(5, "", var1.field4683 + class364.field4088);
                }
                var1.method7820();
            }
        }
    }

    @ObfuscatedName("cj.ab(I)V")
    public final void method1801() {
        this.field817 = 0;
        this.field815.method7460();
        this.field816.method7460();
    }

    @ObfuscatedName("cj.au(Lvj;ZI)Z")
    public final boolean method1840(class550 arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        } else if (arg0.equals(Statics.field2420.field1103)) {
            return true;
        } else {
            return this.field815.method7350(arg0, arg1);
        }
    }

    @ObfuscatedName("cj.aa(Lvj;I)Z")
    public final boolean method1802(class550 arg0) {
        if (arg0 == null) {
            return false;
        } else {
            return this.field816.method7439(arg0);
        }
    }

    @ObfuscatedName("cj.ac(Ljava/lang/String;I)V")
    public final void method1859(String arg0) {
        if (arg0 == null) {
            return;
        }
        class550 var2 = new class550(arg0, this.field814);
        if (!var2.method9075()) {
            return;
        }
        if (this.method1804()) {
            method2611();
        } else if (Statics.field2420.field1103.equals(var2)) {
            method3172();
        } else if (this.method1840(var2, false)) {
            method3945(arg0);
        } else if (this.method1802(var2)) {
            method7432(arg0);
        } else {
            class308 var3 = class308.method2768(class306.field3155, client.field590.field1405);
            var3.field3243.method8393(class527.method3196(arg0));
            var3.field3243.method8400(arg0);
            client.field590.method2719(var3);
        }
    }

    @ObfuscatedName("jv.al(Ljava/lang/String;B)V")
    public static final void method4245(String arg0) {
        class111.method6477(30, "", arg0);
    }

    @ObfuscatedName("dy.az(B)V")
    public static final void method2611() {
        method4245(class364.field4035);
    }

    @ObfuscatedName("ix.ap(Ljava/lang/String;B)V")
    public static final void method3945(String arg0) {
        method4245(arg0 + class364.field4107);
    }

    @ObfuscatedName("rn.av(Ljava/lang/String;B)V")
    public static final void method7432(String arg0) {
        method4245(class364.field4112 + arg0 + class364.field4113);
    }

    @ObfuscatedName("gq.ax(B)V")
    public static final void method3172() {
        method4245(class364.field4026);
    }

    @ObfuscatedName("cj.as(I)Z")
    public final boolean method1804() {
        return this.field815.method7501() || this.field815.method7456() >= 200 && client.field755 != 1;
    }

    @ObfuscatedName("cj.ay(Ljava/lang/String;I)V")
    public final void method1811(String arg0) {
        if (arg0 == null) {
            return;
        }
        class550 var2 = new class550(arg0, this.field814);
        if (!var2.method9075()) {
            return;
        }
        if (this.method1806()) {
            method4245(class364.field4108);
        } else if (Statics.field2420.field1103.equals(var2)) {
            method3156();
        } else if (this.method1802(var2)) {
            method4245(arg0 + class364.field4109);
        } else if (this.method1840(var2, false)) {
            method4245(class364.field4114 + arg0 + class364.field4010);
        } else {
            Statics.method1132(arg0);
        }
    }

    @ObfuscatedName("gl.ak(I)V")
    public static final void method3156() {
        method4245(class364.field4122);
    }

    @ObfuscatedName("cj.am(I)Z")
    public final boolean method1806() {
        return this.field816.method7501() || this.field816.method7456() >= 100 && client.field755 != 1;
    }

    @ObfuscatedName("cj.aq(Ljava/lang/String;B)V")
    public final void method1807(String arg0) {
        if (arg0 == null) {
            return;
        }
        class550 var2 = new class550(arg0, this.field814);
        if (!var2.method9075()) {
            return;
        }
        if (this.field815.method7444(var2)) {
            client.method3899();
            class308 var3 = class308.method2768(class306.field3200, client.field590.field1405);
            var3.field3243.method8393(class527.method3196(arg0));
            var3.field3243.method8400(arg0);
            client.field590.method2719(var3);
        }
        for (int var4 = 0; var4 < class108.field1362; var4++) {
            class92 var5 = client.field651[class108.field1370[var4]];
            var5.method2297();
        }
        Iterator var6 = class111.field1397.iterator();
        while (var6.hasNext()) {
            class65 var7 = (class65) var6.next();
            var7.method1133();
        }
        if (Statics.field106 != null) {
            Statics.field106.method7360();
        }
    }

    @ObfuscatedName("cj.ai(Ljava/lang/String;ZI)V")
    public final void method1808(String arg0, boolean arg1) {
        if (arg0 == null) {
            return;
        }
        class550 var3 = new class550(arg0, this.field814);
        if (!var3.method9075()) {
            return;
        }
        if (this.field816.method7444(var3)) {
            client.method3899();
            if (arg1) {
                class308 var4 = class308.method2768(class306.field3134, client.field590.field1405);
                var4.field3243.method8393(class527.method3196(arg0));
                var4.field3243.method8400(arg0);
                client.field590.method2719(var4);
            }
        }
        client.method7122();
    }

    @ObfuscatedName("ax.aw(Ljava/lang/String;IB)V")
    public static final void method161(String arg0, int arg1) {
        class308 var2 = class308.method2768(class306.field3180, client.field590.field1405);
        var2.field3243.method8393(class527.method3196(arg0) + 1);
        var2.field3243.method8400(arg0);
        var2.field3243.method8441(arg1);
        client.field590.method2719(var2);
    }

    @ObfuscatedName("cj.ae(Lvj;I)Z")
    public final boolean method1809(class550 arg0) {
        class442 var2 = (class442) this.field815.method7442(arg0);
        return var2 != null && var2.method7518();
    }
}
