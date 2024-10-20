package deob;

import java.util.Iterator;

@ObfuscatedName("nz")
public class class371 extends class342 implements class218 {

    @ObfuscatedName("nz.e")
    public final class276 field4117;

    @ObfuscatedName("nz.v")
    public final class220 field4121 = new class220(64);

    @ObfuscatedName("nz.y")
    public final int field4119;

    public class371(class265 arg0, int arg1, class291 arg2, class276 arg3) {
        super(arg0, arg2, arg3 == null ? 0 : arg3.method4514(arg1));
        this.field4117 = arg3;
        this.field4119 = arg1;
    }

    @ObfuscatedName("nz.f(II)Lmq;")
    public class344 method5382(int arg0) {
        class220 var2 = this.field4121;
        synchronized (this.field4121) {
            class343 var3 = (class343) this.field4121.method3970((long) arg0);
            if (var3 == null) {
                var3 = this.method5783(arg0);
                this.field4121.method3975(var3, (long) arg0);
            }
            return var3;
        }
    }

    @ObfuscatedName("nz.x(II)Lma;")
    public class343 method5783(int arg0) {
        byte[] var2 = this.field4117.method4504(this.field4119, arg0);
        class343 var3 = new class343(arg0);
        if (var2 != null) {
            var3.method5392(new class384(var2));
        }
        return var3;
    }

    @ObfuscatedName("nz.u(B)V")
    public void method5782() {
        class220 var1 = this.field4121;
        synchronized (this.field4121) {
            this.field4121.method3965();
        }
    }

    public Iterator iterator() {
        return new class370(this);
    }
}
