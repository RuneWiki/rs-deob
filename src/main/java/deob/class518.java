package deob;

import java.util.Iterator;

@ObfuscatedName("tc")
public class class518 extends class476 implements class300 {

    @ObfuscatedName("tc.ah")
    public final class379 field5148;

    @ObfuscatedName("tc.af")
    public final class302 field5149 = new class302(64);

    @ObfuscatedName("tc.at")
    public final int field5150;

    public class518(class366 arg0, int arg1, class394 arg2, class379 arg3) {
        super(arg0, arg2, arg3 == null ? 0 : arg3.method6338(arg1));
        this.field5148 = arg3;
        this.field5150 = arg1;
    }

    @ObfuscatedName("tc.az(IB)Lsm;")
    public class478 method7774(int arg0) {
        class302 var2 = this.field5149;
        synchronized (this.field5149) {
            class477 var3 = (class477) this.field5149.method5301((long) arg0);
            if (var3 == null) {
                var3 = this.method8294(arg0);
                this.field5149.method5304(var3, (long) arg0);
            }
            return var3;
        }
    }

    @ObfuscatedName("tc.ai(II)Lsj;")
    public class477 method8294(int arg0) {
        byte[] var2 = this.field5148.method6328(this.field5150, arg0);
        class477 var3 = new class477(arg0);
        if (var2 != null) {
            var3.method7790(new class535(var2));
        }
        return var3;
    }

    @ObfuscatedName("tc.ax(I)V")
    public void method8295() {
        class302 var1 = this.field5149;
        synchronized (this.field5149) {
            this.field5149.method5322();
        }
    }

    public Iterator iterator() {
        return new class517(this);
    }
}
