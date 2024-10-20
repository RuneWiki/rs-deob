package deob;

import java.util.Iterator;

@ObfuscatedName("qk")
public class class452 extends class416 implements class265 {

    @ObfuscatedName("qk.e")
    public final class333 field4864;

    @ObfuscatedName("qk.v")
    public final class267 field4865 = new class267(64);

    @ObfuscatedName("qk.x")
    public final int field4863;

    public class452(class322 arg0, int arg1, class348 arg2, class333 arg3) {
        super(arg0, arg2, arg3 == null ? 0 : arg3.method5869(arg1));
        this.field4864 = arg3;
        this.field4863 = arg1;
    }

    @ObfuscatedName("qk.h(II)Lpv;")
    public class418 method7166(int arg0) {
        class267 var2 = this.field4865;
        synchronized (this.field4865) {
            class417 var3 = (class417) this.field4865.method4881((long) arg0);
            if (var3 == null) {
                var3 = this.method7626(arg0);
                this.field4865.method4884(var3, (long) arg0);
            }
            return var3;
        }
    }

    @ObfuscatedName("qk.a(II)Lpe;")
    public class417 method7626(int arg0) {
        byte[] var2 = this.field4864.method5909(this.field4863, arg0);
        class417 var3 = new class417(arg0);
        if (var2 != null) {
            var3.method7184(new class467(var2));
        }
        return var3;
    }

    @ObfuscatedName("qk.s(I)V")
    public void method7620() {
        class267 var1 = this.field4865;
        synchronized (this.field4865) {
            this.field4865.method4880();
        }
    }

    public Iterator iterator() {
        return new class451(this);
    }
}
