package deob;

import java.util.Iterator;

@ObfuscatedName("th")
public class class498 extends class456 implements class284 {

    @ObfuscatedName("th.ae")
    public final class359 field5021;

    @ObfuscatedName("th.ao")
    public final class286 field5022 = new class286(64);

    @ObfuscatedName("th.at")
    public final int field5020;

    public class498(class348 arg0, int arg1, class374 arg2, class359 arg3) {
        super(arg0, arg2, arg3 == null ? 0 : arg3.method6173(arg1));
        this.field5021 = arg3;
        this.field5020 = arg1;
    }

    @ObfuscatedName("th.au(IB)Lrv;")
    public class458 method7627(int arg0) {
        class286 var2 = this.field5022;
        synchronized (this.field5022) {
            class457 var3 = (class457) this.field5022.method5146((long) arg0);
            if (var3 == null) {
                var3 = this.method8143(arg0);
                this.field5022.method5149(var3, (long) arg0);
            }
            return var3;
        }
    }

    @ObfuscatedName("th.ab(IB)Lrg;")
    public class457 method8143(int arg0) {
        byte[] var2 = this.field5021.method6128(this.field5020, arg0);
        class457 var3 = new class457(arg0);
        if (var2 != null) {
            var3.method7635(new class515(var2));
        }
        return var3;
    }

    @ObfuscatedName("th.ag(I)V")
    public void method8139() {
        class286 var1 = this.field5022;
        synchronized (this.field5022) {
            this.field5022.method5152();
        }
    }

    public Iterator iterator() {
        return new class497(this);
    }
}
