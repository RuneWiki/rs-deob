package deob;

import java.util.Iterator;

@ObfuscatedName("pd")
public class class429 extends class394 implements class253 {

    @ObfuscatedName("pd.q")
    public final class316 field4646;

    @ObfuscatedName("pd.l")
    public final class255 field4647 = new class255(64);

    @ObfuscatedName("pd.k")
    public final int field4648;

    public class429(class305 arg0, int arg1, class331 arg2, class316 arg3) {
        super(arg0, arg2, arg3 == null ? 0 : arg3.method5200(arg1));
        this.field4646 = arg3;
        this.field4648 = arg1;
    }

    @ObfuscatedName("pd.o(II)Lou;")
    public class396 method6335(int arg0) {
        class255 var2 = this.field4647;
        synchronized (this.field4647) {
            class395 var3 = (class395) this.field4647.method4532((long) arg0);
            if (var3 == null) {
                var3 = this.method6786(arg0);
                this.field4647.method4534(var3, (long) arg0);
            }
            return var3;
        }
    }

    @ObfuscatedName("pd.t(IB)Low;")
    public class395 method6786(int arg0) {
        byte[] var2 = this.field4646.method5249(this.field4648, arg0);
        class395 var3 = new class395(arg0);
        if (var2 != null) {
            var3.method6351(new class440(var2));
        }
        return var3;
    }

    @ObfuscatedName("pd.g(I)V")
    public void method6787() {
        class255 var1 = this.field4647;
        synchronized (this.field4647) {
            this.field4647.method4537();
        }
    }

    public Iterator iterator() {
        return new class428(this);
    }
}
