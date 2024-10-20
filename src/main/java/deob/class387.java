package deob;

import java.util.Iterator;

@ObfuscatedName("ni")
public class class387 extends class354 implements class232 {

    @ObfuscatedName("ni.c")
    public final class290 field4230;

    @ObfuscatedName("ni.m")
    public final class234 field4231 = new class234(64);

    @ObfuscatedName("ni.k")
    public final int field4232;

    public class387(class279 arg0, int arg1, class305 arg2, class290 arg3) {
        super(arg0, arg2, arg3 == null ? 0 : arg3.method4720(arg1));
        this.field4230 = arg3;
        this.field4232 = arg1;
    }

    @ObfuscatedName("ni.n(IB)Lmi;")
    public class356 method5689(int arg0) {
        class234 var2 = this.field4231;
        synchronized (this.field4231) {
            class355 var3 = (class355) this.field4231.method4136((long) arg0);
            if (var3 == null) {
                var3 = this.method6102(arg0);
                this.field4231.method4155(var3, (long) arg0);
            }
            return var3;
        }
    }

    @ObfuscatedName("ni.j(II)Lmf;")
    public class355 method6102(int arg0) {
        byte[] var2 = this.field4230.method4710(this.field4232, arg0);
        class355 var3 = new class355(arg0);
        if (var2 != null) {
            var3.method5701(new class400(var2));
        }
        return var3;
    }

    @ObfuscatedName("ni.x(B)V")
    public void method6103() {
        class234 var1 = this.field4231;
        synchronized (this.field4231) {
            this.field4231.method4142();
        }
    }

    public Iterator iterator() {
        return new class386(this);
    }
}
