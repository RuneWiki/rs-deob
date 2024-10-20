package deob;

import java.util.Iterator;

@ObfuscatedName("tx")
public class class514 extends class472 implements class298 {

    @ObfuscatedName("tx.ap")
    public final class375 field5094;

    @ObfuscatedName("tx.af")
    public final class300 field5095 = new class300(64);

    @ObfuscatedName("tx.aj")
    public final int field5096;

    public class514(class363 arg0, int arg1, class390 arg2, class375 arg3) {
        super(arg0, arg2, arg3 == null ? 0 : arg3.method6406(arg1));
        this.field5094 = arg3;
        this.field5096 = arg1;
    }

    @ObfuscatedName("tx.am(II)Lsf;")
    public class474 method7912(int arg0) {
        class300 var2 = this.field5095;
        synchronized (this.field5095) {
            class473 var3 = (class473) this.field5095.method5361((long) arg0);
            if (var3 == null) {
                var3 = this.method8402(arg0);
                this.field5095.method5364(var3, (long) arg0);
            }
            return var3;
        }
    }

    @ObfuscatedName("tx.aw(IB)Lsr;")
    public class473 method8402(int arg0) {
        byte[] var2 = this.field5094.method6396(this.field5096, arg0);
        class473 var3 = new class473(arg0);
        if (var2 != null) {
            var3.method7922(new class531(var2));
        }
        return var3;
    }

    @ObfuscatedName("tx.az(I)V")
    public void method8403() {
        class300 var1 = this.field5095;
        synchronized (this.field5095) {
            this.field5095.method5367();
        }
    }

    public Iterator iterator() {
        return new class513(this);
    }
}
