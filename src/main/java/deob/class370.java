package deob;

import java.util.Iterator;

@ObfuscatedName("nu")
public class class370 extends class341 implements class217 {

    @ObfuscatedName("nu.n")
    public final class275 field4120;

    @ObfuscatedName("nu.f")
    public final class219 field4119 = new class219(64);

    @ObfuscatedName("nu.y")
    public final int field4118;

    public class370(class264 arg0, int arg1, class290 arg2, class275 arg3) {
        super(arg0, arg2, arg3 == null ? 0 : arg3.method4478(arg1));
        this.field4120 = arg3;
        this.field4118 = arg1;
    }

    @ObfuscatedName("nu.v(II)Lml;")
    public class343 method5466(int arg0) {
        class219 var2 = this.field4119;
        synchronized (this.field4119) {
            class342 var3 = (class342) this.field4119.method3911((long) arg0);
            if (var3 == null) {
                var3 = this.method5859(arg0);
                this.field4119.method3914(var3, (long) arg0);
            }
            return var3;
        }
    }

    @ObfuscatedName("nu.g(II)Lmq;")
    public class342 method5859(int arg0) {
        byte[] var2 = this.field4120.method4468(this.field4118, arg0);
        class342 var3 = new class342(arg0);
        if (var2 != null) {
            var3.method5474(new class383(var2));
        }
        return var3;
    }

    @ObfuscatedName("nu.a(I)V")
    public void method5860() {
        class219 var1 = this.field4119;
        synchronized (this.field4119) {
            this.field4119.method3917();
        }
    }

    public Iterator iterator() {
        return new class369(this);
    }
}
