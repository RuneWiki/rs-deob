package deob;

import java.util.Iterator;

@ObfuscatedName("gr")
public class class206 implements Iterable {

    @ObfuscatedName("gr.y")
    public class207 field2468 = new class207();

    @ObfuscatedName("gr.c")
    public class207 field2469;

    public class206() {
        this.field2468.field2471 = this.field2468;
        this.field2468.field2472 = this.field2468;
    }

    @ObfuscatedName("gr.y()V")
    public void method3736() {
        while (this.field2468.field2471 != this.field2468) {
            this.field2468.field2471.method3766();
        }
    }

    @ObfuscatedName("gr.c(Lgp;)V")
    public void method3749(class207 arg0) {
        if (arg0.field2472 != null) {
            arg0.method3766();
        }
        arg0.field2472 = this.field2468.field2472;
        arg0.field2471 = this.field2468;
        arg0.field2472.field2471 = arg0;
        arg0.field2471.field2472 = arg0;
    }

    @ObfuscatedName("gr.n(Lgp;)V")
    public void method3751(class207 arg0) {
        if (arg0.field2472 != null) {
            arg0.method3766();
        }
        arg0.field2472 = this.field2468;
        arg0.field2471 = this.field2468.field2471;
        arg0.field2472.field2471 = arg0;
        arg0.field2471.field2472 = arg0;
    }

    @ObfuscatedName("gr.u(Lgp;Lgp;)V")
    public static void method3744(class207 arg0, class207 arg1) {
        if (arg0.field2472 != null) {
            arg0.method3766();
        }
        arg0.field2472 = arg1;
        arg0.field2471 = arg1.field2471;
        arg0.field2472.field2471 = arg0;
        arg0.field2471.field2472 = arg0;
    }

    @ObfuscatedName("gr.i()Lgp;")
    public class207 method3740() {
        return this.method3741((class207) null);
    }

    @ObfuscatedName("gr.p(Lgp;)Lgp;")
    public class207 method3741(class207 arg0) {
        class207 var2;
        if (arg0 == null) {
            var2 = this.field2468.field2471;
        } else {
            var2 = arg0;
        }
        if (this.field2468 == var2) {
            this.field2469 = null;
            return null;
        } else {
            this.field2469 = var2.field2471;
            return var2;
        }
    }

    @ObfuscatedName("gr.e()Lgp;")
    public class207 method3759() {
        class207 var1 = this.field2469;
        if (this.field2468 == var1) {
            this.field2469 = null;
            return null;
        } else {
            this.field2469 = var1.field2471;
            return var1;
        }
    }

    @ObfuscatedName("gr.s()Z")
    public boolean method3743() {
        return this.field2468.field2471 == this.field2468;
    }

    public Iterator iterator() {
        return new class202(this);
    }
}
