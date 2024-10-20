package deob;

import java.util.Iterator;

@ObfuscatedName("nh")
public class class364 implements Iterable {

    @ObfuscatedName("nh.aj")
    public class439 field4331 = new class439();

    @ObfuscatedName("nh.al")
    public class439 field4330;

    public class364() {
        this.field4331.field4666 = this.field4331;
        this.field4331.field4665 = this.field4331;
    }

    @ObfuscatedName("nh.aj()V")
    public void method6244() {
        while (this.field4331.field4666 != this.field4331) {
            this.field4331.field4666.method7331();
        }
    }

    @ObfuscatedName("nh.al(Lqk;)V")
    public void method6238(class439 arg0) {
        if (arg0.field4665 != null) {
            arg0.method7331();
        }
        arg0.field4665 = this.field4331.field4665;
        arg0.field4666 = this.field4331;
        arg0.field4665.field4666 = arg0;
        arg0.field4666.field4665 = arg0;
    }

    @ObfuscatedName("nh.ac(Lqk;Lqk;)V")
    public static void method6246(class439 arg0, class439 arg1) {
        if (arg0.field4665 != null) {
            arg0.method7331();
        }
        arg0.field4665 = arg1;
        arg0.field4666 = arg1.field4666;
        arg0.field4665.field4666 = arg0;
        arg0.field4666.field4665 = arg0;
    }

    @ObfuscatedName("nh.ab()Lqk;")
    public class439 method6248() {
        class439 var1 = this.field4331.field4666;
        if (this.field4331 == var1) {
            return null;
        } else {
            var1.method7331();
            return var1;
        }
    }

    @ObfuscatedName("nh.an()Lqk;")
    public class439 method6240() {
        return this.method6242((class439) null);
    }

    @ObfuscatedName("nh.ao(Lqk;)Lqk;")
    public class439 method6242(class439 arg0) {
        class439 var2;
        if (arg0 == null) {
            var2 = this.field4331.field4666;
        } else {
            var2 = arg0;
        }
        if (this.field4331 == var2) {
            this.field4330 = null;
            return null;
        } else {
            this.field4330 = var2.field4666;
            return var2;
        }
    }

    @ObfuscatedName("nh.av()Lqk;")
    public class439 method6243() {
        class439 var1 = this.field4330;
        if (this.field4331 == var1) {
            this.field4330 = null;
            return null;
        } else {
            this.field4330 = var1.field4666;
            return var1;
        }
    }

    public Iterator iterator() {
        return new class363(this);
    }
}
