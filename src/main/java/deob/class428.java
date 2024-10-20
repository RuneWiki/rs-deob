package deob;

import java.util.Iterator;

@ObfuscatedName("pr")
public class class428 extends class393 implements class252 {

    @ObfuscatedName("pr.v")
    public final class315 field4651;

    @ObfuscatedName("pr.q")
    public final class254 field4649 = new class254(64);

    @ObfuscatedName("pr.f")
    public final int field4650;

    public class428(class304 arg0, int arg1, class330 arg2, class315 arg3) {
        super(arg0, arg2, arg3 == null ? 0 : arg3.method5313(arg1));
        this.field4651 = arg3;
        this.field4650 = arg1;
    }

    @ObfuscatedName("pr.c(II)Loj;")
    public class395 method6432(int arg0) {
        class254 var2 = this.field4649;
        synchronized (this.field4649) {
            class394 var3 = (class394) this.field4649.method4664((long) arg0);
            if (var3 == null) {
                var3 = this.method6861(arg0);
                this.field4649.method4663(var3, (long) arg0);
            }
            return var3;
        }
    }

    @ObfuscatedName("pr.z(II)Lor;")
    public class394 method6861(int arg0) {
        byte[] var2 = this.field4651.method5305(this.field4650, arg0);
        class394 var3 = new class394(arg0);
        if (var2 != null) {
            var3.method6442(new class443(var2));
        }
        return var3;
    }

    @ObfuscatedName("pr.r(B)V")
    public void method6864() {
        class254 var1 = this.field4649;
        synchronized (this.field4649) {
            this.field4649.method4666();
        }
    }

    public Iterator iterator() {
        return new class427(this);
    }
}
