package deob;

import java.util.Iterator;

@ObfuscatedName("tx")
public class class517 extends class475 implements class300 {

    @ObfuscatedName("tx.aw")
    public final class378 field5117;

    @ObfuscatedName("tx.al")
    public final class302 field5116 = new class302(64);

    @ObfuscatedName("tx.ai")
    public final int field5115;

    public class517(class366 arg0, int arg1, class393 arg2, class378 arg3) {
        super(arg0, arg2, arg3 == null ? 0 : arg3.method6429(arg1));
        this.field5117 = arg3;
        this.field5115 = arg1;
    }

    @ObfuscatedName("tx.aq(IB)Lsy;")
    public class477 method7918(int arg0) {
        class302 var2 = this.field5116;
        synchronized (this.field5116) {
            class476 var3 = (class476) this.field5116.method5384((long) arg0);
            if (var3 == null) {
                var3 = this.method8423(arg0);
                this.field5116.method5387(var3, (long) arg0);
            }
            return var3;
        }
    }

    @ObfuscatedName("tx.ak(II)Lsn;")
    public class476 method8423(int arg0) {
        byte[] var2 = this.field5117.method6489(this.field5115, arg0);
        class476 var3 = new class476(arg0);
        if (var2 != null) {
            var3.method7925(new class534(var2));
        }
        return var3;
    }

    @ObfuscatedName("tx.ah(I)V")
    public void method8424() {
        class302 var1 = this.field5116;
        synchronized (this.field5116) {
            this.field5116.method5390();
        }
    }

    public Iterator iterator() {
        return new class516(this);
    }
}
