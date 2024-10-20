package deob;

import java.util.Iterator;

@ObfuscatedName("tl")
public class class510 extends class468 implements class295 {

    @ObfuscatedName("tl.ah")
    public final class371 field5054;

    @ObfuscatedName("tl.ar")
    public final class297 field5055 = new class297(64);

    @ObfuscatedName("tl.ao")
    public final int field5053;

    public class510(class360 arg0, int arg1, class386 arg2, class371 arg3) {
        super(arg0, arg2, arg3 == null ? 0 : arg3.method6294(arg1));
        this.field5054 = arg3;
        this.field5053 = arg1;
    }

    @ObfuscatedName("tl.at(IB)Lsj;")
    public class470 method7762(int arg0) {
        class297 var2 = this.field5055;
        synchronized (this.field5055) {
            class469 var3 = (class469) this.field5055.method5254((long) arg0);
            if (var3 == null) {
                var3 = this.method8250(arg0);
                this.field5055.method5277(var3, (long) arg0);
            }
            return var3;
        }
    }

    @ObfuscatedName("tl.ay(IB)Lsg;")
    public class469 method8250(int arg0) {
        byte[] var2 = this.field5054.method6284(this.field5053, arg0);
        class469 var3 = new class469(arg0);
        if (var2 != null) {
            var3.method7778(new class527(var2));
        }
        return var3;
    }

    @ObfuscatedName("tl.ak(I)V")
    public void method8251() {
        class297 var1 = this.field5055;
        synchronized (this.field5055) {
            this.field5055.method5260();
        }
    }

    public Iterator iterator() {
        return new class509(this);
    }
}
