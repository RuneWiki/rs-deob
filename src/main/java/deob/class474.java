package deob;

import java.util.Iterator;

@ObfuscatedName("su")
public class class474 extends class431 implements class276 {

    @ObfuscatedName("su.an")
    public final class344 field4938;

    @ObfuscatedName("su.aw")
    public final class278 field4937 = new class278(64);

    @ObfuscatedName("su.ac")
    public final int field4939;

    public class474(class333 arg0, int arg1, class359 arg2, class344 arg3) {
        super(arg0, arg2, arg3 == null ? 0 : arg3.method6081(arg1));
        this.field4938 = arg3;
        this.field4939 = arg1;
    }

    @ObfuscatedName("su.af(IB)Lqg;")
    public class433 method7570(int arg0) {
        class278 var2 = this.field4937;
        synchronized (this.field4937) {
            class432 var3 = (class432) this.field4937.method5084((long) arg0);
            if (var3 == null) {
                var3 = this.method8070(arg0);
                this.field4937.method5108(var3, (long) arg0);
            }
            return var3;
        }
    }

    @ObfuscatedName("su.ar(II)Lqb;")
    public class432 method8070(int arg0) {
        byte[] var2 = this.field4938.method6090(this.field4939, arg0);
        class432 var3 = new class432(arg0);
        if (var2 != null) {
            var3.method7582(new class489(var2));
        }
        return var3;
    }

    @ObfuscatedName("su.am(B)V")
    public void method8062() {
        class278 var1 = this.field4937;
        synchronized (this.field4937) {
            this.field4937.method5095();
        }
    }

    public Iterator iterator() {
        return new class473(this);
    }
}
