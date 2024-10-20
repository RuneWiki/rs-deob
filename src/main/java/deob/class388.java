package deob;

import java.util.Iterator;

@ObfuscatedName("nc")
public class class388 extends class355 implements class232 {

    @ObfuscatedName("nc.q")
    public final class290 field4255;

    @ObfuscatedName("nc.f")
    public final class234 field4254 = new class234(64);

    @ObfuscatedName("nc.j")
    public final int field4256;

    public class388(class279 arg0, int arg1, class305 arg2, class290 arg3) {
        super(arg0, arg2, arg3 == null ? 0 : arg3.method4774(arg1));
        this.field4255 = arg3;
        this.field4256 = arg1;
    }

    @ObfuscatedName("nc.l(IB)Lmp;")
    public class357 method5722(int arg0) {
        class234 var2 = this.field4254;
        synchronized (this.field4254) {
            class356 var3 = (class356) this.field4254.method4201((long) arg0);
            if (var3 == null) {
                var3 = this.method6158(arg0);
                this.field4254.method4193(var3, (long) arg0);
            }
            return var3;
        }
    }

    @ObfuscatedName("nc.b(IB)Lmh;")
    public class356 method6158(int arg0) {
        byte[] var2 = this.field4255.method4756(this.field4256, arg0);
        class356 var3 = new class356(arg0);
        if (var2 != null) {
            var3.method5743(new class401(var2));
        }
        return var3;
    }

    @ObfuscatedName("nc.x(B)V")
    public void method6152() {
        class234 var1 = this.field4254;
        synchronized (this.field4254) {
            this.field4254.method4196();
        }
    }

    public Iterator iterator() {
        return new class387(this);
    }
}
