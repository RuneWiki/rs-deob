package deob;

import java.util.Iterator;

@ObfuscatedName("tp")
public class class499 extends class457 implements class285 {

    @ObfuscatedName("tp.ay")
    public final class360 field5021;

    @ObfuscatedName("tp.ar")
    public final class287 field5019 = new class287(64);

    @ObfuscatedName("tp.am")
    public final int field5020;

    public class499(class349 arg0, int arg1, class375 arg2, class360 arg3) {
        super(arg0, arg2, arg3 == null ? 0 : arg3.method6127(arg1));
        this.field5021 = arg3;
        this.field5020 = arg1;
    }

    @ObfuscatedName("tp.aw(II)Lrc;")
    public class459 method7589(int arg0) {
        class287 var2 = this.field5019;
        synchronized (this.field5019) {
            class458 var3 = (class458) this.field5019.method5116((long) arg0);
            if (var3 == null) {
                var3 = this.method8075(arg0);
                this.field5019.method5114(var3, (long) arg0);
            }
            return var3;
        }
    }

    @ObfuscatedName("tp.ah(IB)Lrl;")
    public class458 method8075(int arg0) {
        byte[] var2 = this.field5021.method6117(this.field5020, arg0);
        class458 var3 = new class458(arg0);
        if (var2 != null) {
            var3.method7613(new class514(var2));
        }
        return var3;
    }

    @ObfuscatedName("tp.ax(I)V")
    public void method8074() {
        class287 var1 = this.field5019;
        synchronized (this.field5019) {
            this.field5019.method5117();
        }
    }

    public Iterator iterator() {
        return new class498(this);
    }
}
