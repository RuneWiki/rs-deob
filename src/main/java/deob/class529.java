package deob;

import java.util.Iterator;

@ObfuscatedName("uj")
public class class529 extends class487 implements class308 {

    @ObfuscatedName("uj.al")
    public final class387 field5256;

    @ObfuscatedName("uj.aj")
    public final class310 field5257 = new class310(64);

    @ObfuscatedName("uj.az")
    public final int field5258;

    public class529(class374 arg0, int arg1, class402 arg2, class387 arg3) {
        super(arg0, arg2, arg3 == null ? 0 : arg3.method6591(arg1));
        this.field5256 = arg3;
        this.field5258 = arg1;
    }

    @ObfuscatedName("uj.ak(IB)Lsp;")
    public class489 method8110(int arg0) {
        class310 var2 = this.field5257;
        synchronized (this.field5257) {
            class488 var3 = (class488) this.field5257.method5526((long) arg0);
            if (var3 == null) {
                var3 = this.method8633(arg0);
                this.field5257.method5529(var3, (long) arg0);
            }
            return var3;
        }
    }

    @ObfuscatedName("uj.ap(II)Lsu;")
    public class488 method8633(int arg0) {
        byte[] var2 = this.field5256.method6573(this.field5258, arg0);
        class488 var3 = new class488(arg0);
        if (var2 != null) {
            var3.method8126(new class546(var2));
        }
        return var3;
    }

    @ObfuscatedName("uj.ae(I)V")
    public void method8634() {
        class310 var1 = this.field5257;
        synchronized (this.field5257) {
            this.field5257.method5535();
        }
    }

    public Iterator iterator() {
        return new class528(this);
    }
}
