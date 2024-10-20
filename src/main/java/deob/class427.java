package deob;

import java.util.Iterator;

@ObfuscatedName("pj")
public class class427 extends class393 implements class253 {

    @ObfuscatedName("pj.c")
    public final class316 field4585;

    @ObfuscatedName("pj.i")
    public final class255 field4584 = new class255(64);

    @ObfuscatedName("pj.f")
    public final int field4586;

    public class427(class305 arg0, int arg1, class331 arg2, class316 arg3) {
        super(arg0, arg2, arg3 == null ? 0 : arg3.method5305(arg1));
        this.field4585 = arg3;
        this.field4586 = arg1;
    }

    @ObfuscatedName("pj.v(IB)Lox;")
    public class395 method6457(int arg0) {
        class255 var2 = this.field4584;
        synchronized (this.field4584) {
            class394 var3 = (class394) this.field4584.method4615((long) arg0);
            if (var3 == null) {
                var3 = this.method6863(arg0);
                this.field4584.method4622(var3, (long) arg0);
            }
            return var3;
        }
    }

    @ObfuscatedName("pj.k(II)Loh;")
    public class394 method6863(int arg0) {
        byte[] var2 = this.field4585.method5296(this.field4586, arg0);
        class394 var3 = new class394(arg0);
        if (var2 != null) {
            var3.method6464(new class438(var2));
        }
        return var3;
    }

    @ObfuscatedName("pj.d(B)V")
    public void method6862() {
        class255 var1 = this.field4584;
        synchronized (this.field4584) {
            this.field4584.method4620();
        }
    }

    public Iterator iterator() {
        return new class426(this);
    }
}
