package deob;

import java.util.Iterator;

@ObfuscatedName("hy")
public class class228 implements Iterable {

    @ObfuscatedName("hy.g")
    public class219 field2682 = new class219();

    @ObfuscatedName("hy.e")
    public class219 field2681;

    public class228() {
        this.field2682.field2664 = this.field2682;
        this.field2682.field2665 = this.field2682;
    }

    @ObfuscatedName("hy.g()V")
    public void method3901() {
        while (this.field2682.field2664 != this.field2682) {
            this.field2682.field2664.method3840();
        }
    }

    @ObfuscatedName("hy.e(Lhf;)V")
    public void method3900(class219 arg0) {
        if (arg0.field2665 != null) {
            arg0.method3840();
        }
        arg0.field2665 = this.field2682.field2665;
        arg0.field2664 = this.field2682;
        arg0.field2665.field2664 = arg0;
        arg0.field2664.field2665 = arg0;
    }

    @ObfuscatedName("hy.b()Lhf;")
    public class219 method3880() {
        class219 var1 = this.field2682.field2664;
        if (this.field2682 == var1) {
            return null;
        } else {
            var1.method3840();
            return var1;
        }
    }

    @ObfuscatedName("hy.z()Lhf;")
    public class219 method3881() {
        return this.method3887((class219) null);
    }

    @ObfuscatedName("hy.n(Lhf;)Lhf;")
    public class219 method3887(class219 arg0) {
        class219 var2;
        if (arg0 == null) {
            var2 = this.field2682.field2664;
        } else {
            var2 = arg0;
        }
        if (this.field2682 == var2) {
            this.field2681 = null;
            return null;
        } else {
            this.field2681 = var2.field2664;
            return var2;
        }
    }

    @ObfuscatedName("hy.l()Lhf;")
    public class219 method3886() {
        class219 var1 = this.field2681;
        if (this.field2682 == var1) {
            this.field2681 = null;
            return null;
        } else {
            this.field2681 = var1.field2664;
            return var1;
        }
    }

    public Iterator iterator() {
        return new class227(this);
    }
}
