package deob;

import java.util.Iterator;

@ObfuscatedName("pf")
public class class416 implements Iterable {

    @ObfuscatedName("pf.ap")
    public class511 field4738 = new class511();

    @ObfuscatedName("pf.aw")
    public class511 field4737;

    public class416() {
        this.field4738.field5163 = this.field4738;
        this.field4738.field5164 = this.field4738;
    }

    @ObfuscatedName("pf.ap()V")
    public void method7421() {
        while (this.field4738.field5163 != this.field4738) {
            this.field4738.field5163.method8665();
        }
    }

    @ObfuscatedName("pf.aw(Ltp;)V")
    public void method7400(class511 arg0) {
        if (arg0.field5164 != null) {
            arg0.method8665();
        }
        arg0.field5164 = this.field4738.field5164;
        arg0.field5163 = this.field4738;
        arg0.field5164.field5163 = arg0;
        arg0.field5163.field5164 = arg0;
    }

    @ObfuscatedName("pf.ak(Ltp;Ltp;)V")
    public static void method7401(class511 arg0, class511 arg1) {
        if (arg0.field5164 != null) {
            arg0.method8665();
        }
        arg0.field5164 = arg1;
        arg0.field5163 = arg1.field5163;
        arg0.field5164.field5163 = arg0;
        arg0.field5163.field5164 = arg0;
    }

    @ObfuscatedName("pf.aj()Ltp;")
    public class511 method7399() {
        class511 var1 = this.field4738.field5163;
        if (this.field4738 == var1) {
            return null;
        } else {
            var1.method8665();
            return var1;
        }
    }

    @ObfuscatedName("pf.ai()Ltp;")
    public class511 method7403() {
        return this.method7404((class511) null);
    }

    @ObfuscatedName("pf.ay(Ltp;)Ltp;")
    public class511 method7404(class511 arg0) {
        class511 var2;
        if (arg0 == null) {
            var2 = this.field4738.field5163;
        } else {
            var2 = arg0;
        }
        if (this.field4738 == var2) {
            this.field4737 = null;
            return null;
        } else {
            this.field4737 = var2.field5163;
            return var2;
        }
    }

    @ObfuscatedName("pf.as()Ltp;")
    public class511 method7402() {
        class511 var1 = this.field4737;
        if (this.field4738 == var1) {
            this.field4737 = null;
            return null;
        } else {
            this.field4737 = var1.field5163;
            return var1;
        }
    }

    public Iterator iterator() {
        return new class415(this);
    }
}
