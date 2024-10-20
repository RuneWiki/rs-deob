package deob;

import java.util.Iterator;

@ObfuscatedName("uf")
public class class531 extends class489 implements class311 {

    @ObfuscatedName("uf.ay")
    public final class389 field5285;

    @ObfuscatedName("uf.an")
    public final class313 field5284 = new class313(64);

    @ObfuscatedName("uf.au")
    public final int field5286;

    public class531(class376 arg0, int arg1, class404 arg2, class389 arg3) {
        super(arg0, arg2, arg3 == null ? 0 : arg3.method6685(arg1));
        this.field5285 = arg3;
        this.field5286 = arg1;
    }

    @ObfuscatedName("uf.ab(II)Lst;")
    public class491 method8144(int arg0) {
        class313 var2 = this.field5284;
        synchronized (this.field5284) {
            class490 var3 = (class490) this.field5284.method5562((long) arg0);
            if (var3 == null) {
                var3 = this.method8629(arg0);
                this.field5284.method5565(var3, (long) arg0);
            }
            return var3;
        }
    }

    @ObfuscatedName("uf.af(II)Lsy;")
    public class490 method8629(int arg0) {
        byte[] var2 = this.field5285.method6670(this.field5286, arg0);
        class490 var3 = new class490(arg0);
        if (var2 != null) {
            var3.method8159(new class549(var2));
        }
        return var3;
    }

    @ObfuscatedName("uf.aa(I)V")
    public void method8628() {
        class313 var1 = this.field5284;
        synchronized (this.field5284) {
            this.field5284.method5560();
        }
    }

    public Iterator iterator() {
        return new class530(this);
    }
}
