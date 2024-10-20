package deob;

import java.util.Iterator;

@ObfuscatedName("pf")
public class class430 extends class395 implements class253 {

    @ObfuscatedName("pf.p")
    public final class317 field4682;

    @ObfuscatedName("pf.f")
    public final class255 field4680 = new class255(64);

    @ObfuscatedName("pf.n")
    public final int field4681;

    public class430(class306 arg0, int arg1, class332 arg2, class317 arg3) {
        super(arg0, arg2, arg3 == null ? 0 : arg3.method5425(arg1));
        this.field4682 = arg3;
        this.field4681 = arg1;
    }

    @ObfuscatedName("pf.c(IB)Lof;")
    public class397 method6596(int arg0) {
        class255 var2 = this.field4680;
        synchronized (this.field4680) {
            class396 var3 = (class396) this.field4680.method4743((long) arg0);
            if (var3 == null) {
                var3 = this.method7032(arg0);
                this.field4680.method4762(var3, (long) arg0);
            }
            return var3;
        }
    }

    @ObfuscatedName("pf.v(IS)Lol;")
    public class396 method7032(int arg0) {
        byte[] var2 = this.field4682.method5499(this.field4681, arg0);
        class396 var3 = new class396(arg0);
        if (var2 != null) {
            var3.method6611(new class445(var2));
        }
        return var3;
    }

    @ObfuscatedName("pf.h(I)V")
    public void method7028() {
        class255 var1 = this.field4680;
        synchronized (this.field4680) {
            this.field4680.method4749();
        }
    }

    public Iterator iterator() {
        return new class429(this);
    }
}
