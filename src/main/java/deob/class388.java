package deob;

import java.util.Iterator;

@ObfuscatedName("no")
public class class388 extends class355 implements class232 {

    @ObfuscatedName("no.w")
    public final class290 field4263;

    @ObfuscatedName("no.s")
    public final class234 field4261 = new class234(64);

    @ObfuscatedName("no.a")
    public final int field4260;

    public class388(class279 arg0, int arg1, class305 arg2, class290 arg3) {
        super(arg0, arg2, arg3 == null ? 0 : arg3.method4768(arg1));
        this.field4263 = arg3;
        this.field4260 = arg1;
    }

    @ObfuscatedName("no.i(IB)Lmn;")
    public class357 method5709(int arg0) {
        class234 var2 = this.field4261;
        synchronized (this.field4261) {
            class356 var3 = (class356) this.field4261.method4179((long) arg0);
            if (var3 == null) {
                var3 = this.method6119(arg0);
                this.field4261.method4195(var3, (long) arg0);
            }
            return var3;
        }
    }

    @ObfuscatedName("no.l(IB)Lmf;")
    public class356 method6119(int arg0) {
        byte[] var2 = this.field4263.method4743(this.field4260, arg0);
        class356 var3 = new class356(arg0);
        if (var2 != null) {
            var3.method5722(new class401(var2));
        }
        return var3;
    }

    @ObfuscatedName("no.u(I)V")
    public void method6114() {
        class234 var1 = this.field4261;
        synchronized (this.field4261) {
            this.field4261.method4177();
        }
    }

    public Iterator iterator() {
        return new class387(this);
    }
}
