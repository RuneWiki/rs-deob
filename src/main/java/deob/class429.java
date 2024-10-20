package deob;

import java.util.Iterator;

@ObfuscatedName("pp")
public class class429 extends class394 implements class252 {

    @ObfuscatedName("pp.h")
    public final class316 field4645;

    @ObfuscatedName("pp.w")
    public final class254 field4646 = new class254(64);

    @ObfuscatedName("pp.v")
    public final int field4647;

    public class429(class305 arg0, int arg1, class331 arg2, class316 arg3) {
        super(arg0, arg2, arg3 == null ? 0 : arg3.method5184(arg1));
        this.field4645 = arg3;
        this.field4647 = arg1;
    }

    @ObfuscatedName("pp.s(IB)Lod;")
    public class396 method6357(int arg0) {
        class254 var2 = this.field4646;
        synchronized (this.field4646) {
            class395 var3 = (class395) this.field4646.method4578((long) arg0);
            if (var3 == null) {
                var3 = this.method6769(arg0);
                this.field4646.method4571(var3, (long) arg0);
            }
            return var3;
        }
    }

    @ObfuscatedName("pp.l(II)Lot;")
    public class395 method6769(int arg0) {
        byte[] var2 = this.field4645.method5179(this.field4647, arg0);
        class395 var3 = new class395(arg0);
        if (var2 != null) {
            var3.method6366(new class444(var2));
        }
        return var3;
    }

    @ObfuscatedName("pp.z(B)V")
    public void method6767() {
        class254 var1 = this.field4646;
        synchronized (this.field4646) {
            this.field4646.method4584();
        }
    }

    public Iterator iterator() {
        return new class428(this);
    }
}
