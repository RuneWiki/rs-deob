package deob;

import java.util.Iterator;

@ObfuscatedName("pb")
public class class411 implements Iterable {

    @ObfuscatedName("pb.ak")
    public class500 field4641 = new class500();

    @ObfuscatedName("pb.al")
    public class500 field4642;

    public class411() {
        this.field4641.field5042 = this.field4641;
        this.field4641.field5044 = this.field4641;
    }

    @ObfuscatedName("pb.ak()V")
    public void method6983() {
        while (this.field4641.field5042 != this.field4641) {
            this.field4641.field5042.method8183();
        }
    }

    @ObfuscatedName("pb.al(Ltm;)V")
    public void method6984(class500 arg0) {
        if (arg0.field5044 != null) {
            arg0.method8183();
        }
        arg0.field5044 = this.field4641.field5044;
        arg0.field5042 = this.field4641;
        arg0.field5044.field5042 = arg0;
        arg0.field5042.field5044 = arg0;
    }

    @ObfuscatedName("pb.aj(Ltm;Ltm;)V")
    public static void method6985(class500 arg0, class500 arg1) {
        if (arg0.field5044 != null) {
            arg0.method8183();
        }
        arg0.field5044 = arg1;
        arg0.field5042 = arg1.field5042;
        arg0.field5044.field5042 = arg0;
        arg0.field5042.field5044 = arg0;
    }

    @ObfuscatedName("pb.az()Ltm;")
    public class500 method6996() {
        class500 var1 = this.field4641.field5042;
        if (this.field4641 == var1) {
            return null;
        } else {
            var1.method8183();
            return var1;
        }
    }

    @ObfuscatedName("pb.af()Ltm;")
    public class500 method6987() {
        return this.method6988((class500) null);
    }

    @ObfuscatedName("pb.aa(Ltm;)Ltm;")
    public class500 method6988(class500 arg0) {
        class500 var2;
        if (arg0 == null) {
            var2 = this.field4641.field5042;
        } else {
            var2 = arg0;
        }
        if (this.field4641 == var2) {
            this.field4642 = null;
            return null;
        } else {
            this.field4642 = var2.field5042;
            return var2;
        }
    }

    @ObfuscatedName("pb.at()Ltm;")
    public class500 method6989() {
        class500 var1 = this.field4642;
        if (this.field4641 == var1) {
            this.field4642 = null;
            return null;
        } else {
            this.field4642 = var1.field5042;
            return var1;
        }
    }

    public Iterator iterator() {
        return new class410(this);
    }
}
