package deob;

import java.util.Iterator;

@ObfuscatedName("ur")
public class class530 extends class488 implements class309 {

    @ObfuscatedName("ur.ad")
    public final class388 field5280;

    @ObfuscatedName("ur.ag")
    public final class311 field5279 = new class311(64);

    @ObfuscatedName("ur.ak")
    public final int field5281;

    public class530(class375 arg0, int arg1, class403 arg2, class388 arg3) {
        super(arg0, arg2, arg3 == null ? 0 : arg3.method6549(arg1));
        this.field5280 = arg3;
        this.field5281 = arg1;
    }

    @ObfuscatedName("ur.aq(II)Lsm;")
    public class490 method8052(int arg0) {
        class311 var2 = this.field5279;
        synchronized (this.field5279) {
            class489 var3 = (class489) this.field5279.method5473((long) arg0);
            if (var3 == null) {
                var3 = this.method8559(arg0);
                this.field5279.method5471(var3, (long) arg0);
            }
            return var3;
        }
    }

    @ObfuscatedName("ur.az(IB)Lsi;")
    public class489 method8559(int arg0) {
        byte[] var2 = this.field5280.method6539(this.field5281, arg0);
        class489 var3 = new class489(arg0);
        if (var2 != null) {
            var3.method8060(new class547(var2));
        }
        return var3;
    }

    @ObfuscatedName("ur.ax(S)V")
    public void method8560() {
        class311 var1 = this.field5279;
        synchronized (this.field5279) {
            this.field5279.method5468();
        }
    }

    public Iterator iterator() {
        return new class529(this);
    }
}
