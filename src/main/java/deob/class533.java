package deob;

import java.util.Iterator;

@ObfuscatedName("uf")
public class class533 extends class491 implements class313 {

    @ObfuscatedName("uf.ae")
    public final class391 field5322;

    @ObfuscatedName("uf.ag")
    public final class315 field5321 = new class315(64);

    @ObfuscatedName("uf.am")
    public final int field5320;

    public class533(class378 arg0, int arg1, class406 arg2, class391 arg3) {
        super(arg0, arg2, arg3 == null ? 0 : arg3.method6792(arg1));
        this.field5322 = arg3;
        this.field5320 = arg1;
    }

    @ObfuscatedName("uf.ac(IB)Lsz;")
    public class493 method8291(int arg0) {
        class315 var2 = this.field5321;
        synchronized (this.field5321) {
            class492 var3 = (class492) this.field5321.method5703((long) arg0);
            if (var3 == null) {
                var3 = this.method8788(arg0);
                this.field5321.method5706(var3, (long) arg0);
            }
            return var3;
        }
    }

    @ObfuscatedName("uf.aa(IB)Lsx;")
    public class492 method8788(int arg0) {
        byte[] var2 = this.field5322.method6782(this.field5320, arg0);
        class492 var3 = new class492(arg0);
        if (var2 != null) {
            var3.method8298(new class551(var2));
        }
        return var3;
    }

    @ObfuscatedName("uf.ai(I)V")
    public void method8793() {
        class315 var1 = this.field5321;
        synchronized (this.field5321) {
            this.field5321.method5709();
        }
    }

    public Iterator iterator() {
        return new class532(this);
    }
}
