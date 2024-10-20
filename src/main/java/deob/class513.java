package deob;

import java.util.Iterator;

@ObfuscatedName("tx")
public class class513 extends class471 implements class298 {

    @ObfuscatedName("tx.al")
    public final class374 field5062;

    @ObfuscatedName("tx.ak")
    public final class300 field5060 = new class300(64);

    @ObfuscatedName("tx.ax")
    public final int field5061;

    public class513(class363 arg0, int arg1, class389 arg2, class374 arg3) {
        super(arg0, arg2, arg3 == null ? 0 : arg3.method6273(arg1));
        this.field5062 = arg3;
        this.field5061 = arg1;
    }

    @ObfuscatedName("tx.ac(II)Lsl;")
    public class473 method7688(int arg0) {
        class300 var2 = this.field5060;
        synchronized (this.field5060) {
            class472 var3 = (class472) this.field5060.method5255((long) arg0);
            if (var3 == null) {
                var3 = this.method8183(arg0);
                this.field5060.method5272(var3, (long) arg0);
            }
            return var3;
        }
    }

    @ObfuscatedName("tx.aa(IB)Lsw;")
    public class472 method8183(int arg0) {
        byte[] var2 = this.field5062.method6342(this.field5061, arg0);
        class472 var3 = new class472(arg0);
        if (var2 != null) {
            var3.method7705(new class530(var2));
        }
        return var3;
    }

    @ObfuscatedName("tx.ap(I)V")
    public void method8184() {
        class300 var1 = this.field5060;
        synchronized (this.field5060) {
            this.field5060.method5270();
        }
    }

    public Iterator iterator() {
        return new class512(this);
    }
}
