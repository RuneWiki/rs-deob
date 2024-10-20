package deob;

import java.util.Iterator;

@ObfuscatedName("sp")
public class class486 extends class444 implements class283 {

    @ObfuscatedName("sp.an")
    public final class357 field4964;

    @ObfuscatedName("sp.av")
    public final class285 field4962 = new class285(64);

    @ObfuscatedName("sp.as")
    public final int field4963;

    public class486(class346 arg0, int arg1, class372 arg2, class357 arg3) {
        super(arg0, arg2, arg3 == null ? 0 : arg3.method6135(arg1));
        this.field4964 = arg3;
        this.field4963 = arg1;
    }

    @ObfuscatedName("sp.at(II)Lrg;")
    public class446 method7500(int arg0) {
        class285 var2 = this.field4962;
        synchronized (this.field4962) {
            class445 var3 = (class445) this.field4962.method5091((long) arg0);
            if (var3 == null) {
                var3 = this.method7964(arg0);
                this.field4962.method5094(var3, (long) arg0);
            }
            return var3;
        }
    }

    @ObfuscatedName("sp.ac(II)Lrs;")
    public class445 method7964(int arg0) {
        byte[] var2 = this.field4964.method6080(this.field4963, arg0);
        class445 var3 = new class445(arg0);
        if (var2 != null) {
            var3.method7507(new class501(var2));
        }
        return var3;
    }

    @ObfuscatedName("sp.ag(I)V")
    public void method7965() {
        class285 var1 = this.field4962;
        synchronized (this.field4962) {
            this.field4962.method5097();
        }
    }

    public Iterator iterator() {
        return new class485(this);
    }
}
