package deob;

import java.util.Iterator;

@ObfuscatedName("nh")
public class class369 extends class340 implements class195 {

    @ObfuscatedName("nh.o")
    public final class253 field4122;

    @ObfuscatedName("nh.u")
    public final class197 field4120;

    @ObfuscatedName("nh.p")
    public final int field4123;

    public class369() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("nh.f(II)Lmd;")
    public class342 method5322(int arg0) {
        class197 var2 = this.field4120;
        synchronized (this.field4120) {
            class341 var3 = (class341) this.field4120.method3353((long) arg0);
            if (var3 == null) {
                var3 = this.method5745(arg0);
                this.field4120.method3362(var3, (long) arg0);
            }
            return var3;
        }
    }

    @ObfuscatedName("nh.c(II)Lmx;")
    public class341 method5745(int arg0) {
        byte[] var2 = this.field4122.method3933(this.field4123, arg0);
        class341 var3 = new class341(arg0);
        if (var2 != null) {
            var3.method5341(new class382(var2));
        }
        return var3;
    }

    public Iterator iterator() {
        return new class368(this);
    }
}
