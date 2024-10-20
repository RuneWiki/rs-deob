package deob;

import java.util.Iterator;

@ObfuscatedName("jk")
public class class266 implements Iterable {

    @ObfuscatedName("jk.q")
    public class176 field3552 = new class176();

    @ObfuscatedName("jk.w")
    public class176 field3551;

    public class266() {
        this.field3552.field2105 = this.field3552;
        this.field3552.field2107 = this.field3552;
    }

    @ObfuscatedName("jk.q()V")
    public void method4564() {
        while (this.field3552.field2105 != this.field3552) {
            this.field3552.field2105.method3276();
        }
    }

    @ObfuscatedName("jk.w(Lfb;)V")
    public void method4565(class176 arg0) {
        if (arg0.field2107 != null) {
            arg0.method3276();
        }
        arg0.field2107 = this.field3552.field2107;
        arg0.field2105 = this.field3552;
        arg0.field2107.field2105 = arg0;
        arg0.field2105.field2107 = arg0;
    }

    @ObfuscatedName("jk.e(Lfb;Lfb;)V")
    public static void method4573(class176 arg0, class176 arg1) {
        if (arg0.field2107 != null) {
            arg0.method3276();
        }
        arg0.field2107 = arg1;
        arg0.field2105 = arg1.field2105;
        arg0.field2107.field2105 = arg0;
        arg0.field2105.field2107 = arg0;
    }

    @ObfuscatedName("jk.p()Lfb;")
    public class176 method4567() {
        class176 var1 = this.field3552.field2105;
        if (this.field3552 == var1) {
            return null;
        } else {
            var1.method3276();
            return var1;
        }
    }

    @ObfuscatedName("jk.k()Lfb;")
    public class176 method4568() {
        return this.method4569((class176) null);
    }

    @ObfuscatedName("jk.l(Lfb;)Lfb;")
    public class176 method4569(class176 arg0) {
        class176 var2;
        if (arg0 == null) {
            var2 = this.field3552.field2105;
        } else {
            var2 = arg0;
        }
        if (this.field3552 == var2) {
            this.field3551 = null;
            return null;
        } else {
            this.field3551 = var2.field2105;
            return var2;
        }
    }

    @ObfuscatedName("jk.b()Lfb;")
    public class176 method4598() {
        class176 var1 = this.field3551;
        if (this.field3552 == var1) {
            this.field3551 = null;
            return null;
        } else {
            this.field3551 = var1.field2105;
            return var1;
        }
    }

    public Iterator iterator() {
        return new class264(this);
    }
}
