package deob;

import java.util.Iterator;

@ObfuscatedName("oo")
public class class405 extends class372 implements class245 {

    @ObfuscatedName("oo.b")
    public final class302 field4436;

    @ObfuscatedName("oo.p")
    public final class247 field4437 = new class247(64);

    @ObfuscatedName("oo.m")
    public final int field4438;

    public class405(class291 arg0, int arg1, class317 arg2, class302 arg3) {
        super(arg0, arg2, arg3 == null ? 0 : arg3.method5144(arg1));
        this.field4436 = arg3;
        this.field4438 = arg1;
    }

    @ObfuscatedName("oo.c(II)Lnp;")
    public class374 method6121(int arg0) {
        class247 var2 = this.field4437;
        synchronized (this.field4437) {
            class373 var3 = (class373) this.field4437.method4487((long) arg0);
            if (var3 == null) {
                var3 = this.method6547(arg0);
                this.field4437.method4497(var3, (long) arg0);
            }
            return var3;
        }
    }

    @ObfuscatedName("oo.e(II)Lnv;")
    public class373 method6547(int arg0) {
        byte[] var2 = this.field4436.method5053(this.field4438, arg0);
        class373 var3 = new class373(arg0);
        if (var2 != null) {
            var3.method6130(new class419(var2));
        }
        return var3;
    }

    @ObfuscatedName("oo.a(I)V")
    public void method6548() {
        class247 var1 = this.field4437;
        synchronized (this.field4437) {
            this.field4437.method4490();
        }
    }

    public Iterator iterator() {
        return new class404(this);
    }
}
