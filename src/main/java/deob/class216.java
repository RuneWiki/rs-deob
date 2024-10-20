package deob;

import java.util.Iterator;

@ObfuscatedName("hq")
public class class216 implements Iterable {

    @ObfuscatedName("hq.w")
    public class207 field2472 = new class207();

    @ObfuscatedName("hq.m")
    public class207 field2471;

    public class216() {
        this.field2472.field2454 = this.field2472;
        this.field2472.field2453 = this.field2472;
    }

    @ObfuscatedName("hq.w()V")
    public void method3859() {
        while (this.field2472.field2454 != this.field2472) {
            this.field2472.field2454.method3819();
        }
    }

    @ObfuscatedName("hq.m(Lgc;)V")
    public void method3851(class207 arg0) {
        if (arg0.field2453 != null) {
            arg0.method3819();
        }
        arg0.field2453 = this.field2472.field2453;
        arg0.field2454 = this.field2472;
        arg0.field2453.field2454 = arg0;
        arg0.field2454.field2453 = arg0;
    }

    @ObfuscatedName("hq.q()Lgc;")
    public class207 method3852() {
        class207 var1 = this.field2472.field2454;
        if (this.field2472 == var1) {
            return null;
        } else {
            var1.method3819();
            return var1;
        }
    }

    @ObfuscatedName("hq.x()Lgc;")
    public class207 method3853() {
        return this.method3854((class207) null);
    }

    @ObfuscatedName("hq.j(Lgc;)Lgc;")
    public class207 method3854(class207 arg0) {
        class207 var2;
        if (arg0 == null) {
            var2 = this.field2472.field2454;
        } else {
            var2 = arg0;
        }
        if (this.field2472 == var2) {
            this.field2471 = null;
            return null;
        } else {
            this.field2471 = var2.field2454;
            return var2;
        }
    }

    @ObfuscatedName("hq.a()Lgc;")
    public class207 method3855() {
        class207 var1 = this.field2471;
        if (this.field2472 == var1) {
            this.field2471 = null;
            return null;
        } else {
            this.field2471 = var1.field2454;
            return var1;
        }
    }

    public Iterator iterator() {
        return new class215(this);
    }
}
