package deob;

import java.util.Iterator;

@ObfuscatedName("ns")
public class class372 extends class341 implements class219 {

    @ObfuscatedName("ns.t")
    public final class277 field4151;

    @ObfuscatedName("ns.v")
    public final class221 field4152 = new class221(64);

    @ObfuscatedName("ns.j")
    public final int field4150;

    public class372(class266 arg0, int arg1, class292 arg2, class277 arg3) {
        super(arg0, arg2, arg3 == null ? 0 : arg3.method4484(arg1));
        this.field4151 = arg3;
        this.field4150 = arg1;
    }

    @ObfuscatedName("ns.s(II)Lmd;")
    public class343 method5409(int arg0) {
        class221 var2 = this.field4152;
        synchronized (this.field4152) {
            class342 var3 = (class342) this.field4152.method3896((long) arg0);
            if (var3 == null) {
                var3 = this.method5841(arg0);
                this.field4152.method3899(var3, (long) arg0);
            }
            return var3;
        }
    }

    @ObfuscatedName("ns.q(II)Lmm;")
    public class342 method5841(int arg0) {
        byte[] var2 = this.field4151.method4459(this.field4150, arg0);
        class342 var3 = new class342(arg0);
        if (var2 != null) {
            var3.method5423(new class385(var2));
        }
        return var3;
    }

    @ObfuscatedName("ns.u(I)V")
    public void method5842() {
        class221 var1 = this.field4152;
        synchronized (this.field4152) {
            this.field4152.method3902();
        }
    }

    public Iterator iterator() {
        return new class371(this);
    }
}
