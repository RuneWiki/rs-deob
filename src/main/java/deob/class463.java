package deob;

import java.util.Iterator;

@ObfuscatedName("rw")
public class class463 extends class427 implements class272 {

    @ObfuscatedName("rw.al")
    public final class340 field4850;

    @ObfuscatedName("rw.ac")
    public final class274 field4851 = new class274(64);

    @ObfuscatedName("rw.ab")
    public final int field4852;

    public class463(class329 arg0, int arg1, class355 arg2, class340 arg3) {
        super(arg0, arg2, arg3 == null ? 0 : arg3.method5934(arg1));
        this.field4850 = arg3;
        this.field4852 = arg1;
    }

    @ObfuscatedName("rw.aj(II)Lqd;")
    public class429 method7273(int arg0) {
        class274 var2 = this.field4851;
        synchronized (this.field4851) {
            class428 var3 = (class428) this.field4851.method4891((long) arg0);
            if (var3 == null) {
                var3 = this.method7733(arg0);
                this.field4851.method4890(var3, (long) arg0);
            }
            return var3;
        }
    }

    @ObfuscatedName("rw.as(II)Lqf;")
    public class428 method7733(int arg0) {
        byte[] var2 = this.field4850.method5860(this.field4852, arg0);
        class428 var3 = new class428(arg0);
        if (var2 != null) {
            var3.method7291(new class478(var2));
        }
        return var3;
    }

    @ObfuscatedName("rw.ay(I)V")
    public void method7727() {
        class274 var1 = this.field4851;
        synchronized (this.field4851) {
            this.field4851.method4903();
        }
    }

    public Iterator iterator() {
        return new class462(this);
    }
}
