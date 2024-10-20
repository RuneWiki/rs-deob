package deob;

import java.util.Iterator;

@ObfuscatedName("op")
public class class410 extends class377 implements class245 {

    @ObfuscatedName("op.l")
    public final class307 field4482;

    @ObfuscatedName("op.s")
    public final class247 field4483 = new class247(64);

    @ObfuscatedName("op.e")
    public final int field4484;

    public class410(class296 arg0, int arg1, class322 arg2, class307 arg3) {
        super(arg0, arg2, arg3 == null ? 0 : arg3.method5029(arg1));
        this.field4482 = arg3;
        this.field4484 = arg1;
    }

    @ObfuscatedName("op.c(II)Lnu;")
    public class379 method6125(int arg0) {
        class247 var2 = this.field4483;
        synchronized (this.field4483) {
            class378 var3 = (class378) this.field4483.method4441((long) arg0);
            if (var3 == null) {
                var3 = this.method6538(arg0);
                this.field4483.method4444(var3, (long) arg0);
            }
            return var3;
        }
    }

    @ObfuscatedName("op.y(II)Lnt;")
    public class378 method6538(int arg0) {
        byte[] var2 = this.field4482.method5066(this.field4484, arg0);
        class378 var3 = new class378(arg0);
        if (var2 != null) {
            var3.method6134(new class421(var2));
        }
        return var3;
    }

    @ObfuscatedName("op.u(I)V")
    public void method6539() {
        class247 var1 = this.field4483;
        synchronized (this.field4483) {
            this.field4483.method4447();
        }
    }

    public Iterator iterator() {
        return new class409(this);
    }
}
