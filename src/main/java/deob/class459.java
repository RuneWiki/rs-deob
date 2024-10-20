package deob;

import java.util.Iterator;

@ObfuscatedName("qt")
public class class459 extends class423 implements class269 {

    @ObfuscatedName("qt.w")
    public final class337 field4887;

    @ObfuscatedName("qt.v")
    public final class271 field4889 = new class271(64);

    @ObfuscatedName("qt.s")
    public final int field4886;

    public class459(class326 arg0, int arg1, class352 arg2, class337 arg3) {
        super(arg0, arg2, arg3 == null ? 0 : arg3.method5982(arg1));
        this.field4887 = arg3;
        this.field4886 = arg1;
    }

    @ObfuscatedName("qt.f(II)Lpj;")
    public class425 method7379(int arg0) {
        class271 var2 = this.field4889;
        synchronized (this.field4889) {
            class424 var3 = (class424) this.field4889.method4996((long) arg0);
            if (var3 == null) {
                var3 = this.method7807(arg0);
                this.field4889.method5001(var3, (long) arg0);
            }
            return var3;
        }
    }

    @ObfuscatedName("qt.b(II)Lpp;")
    public class424 method7807(int arg0) {
        byte[] var2 = this.field4887.method5990(this.field4886, arg0);
        class424 var3 = new class424(arg0);
        if (var2 != null) {
            var3.method7386(new class474(var2));
        }
        return var3;
    }

    @ObfuscatedName("qt.m(B)V")
    public void method7805() {
        class271 var1 = this.field4889;
        synchronized (this.field4889) {
            this.field4889.method5000();
        }
    }

    public Iterator iterator() {
        return new class458(this);
    }
}
