package deob;

import java.util.Iterator;

@ObfuscatedName("jq")
public class class276 implements Iterable {

    @ObfuscatedName("jq.m")
    public class185 field3578 = new class185();

    @ObfuscatedName("jq.o")
    public class185 field3577;

    public class276() {
        this.field3578.field2143 = this.field3578;
        this.field3578.field2145 = this.field3578;
    }

    @ObfuscatedName("jq.m()V")
    public void method4713() {
        while (this.field3578.field2143 != this.field3578) {
            this.field3578.field2143.method3379();
        }
    }

    @ObfuscatedName("jq.o(Lgf;)V")
    public void method4705(class185 arg0) {
        if (arg0.field2145 != null) {
            arg0.method3379();
        }
        arg0.field2145 = this.field3578.field2145;
        arg0.field2143 = this.field3578;
        arg0.field2145.field2143 = arg0;
        arg0.field2143.field2145 = arg0;
    }

    @ObfuscatedName("jq.q(Lgf;Lgf;)V")
    public static void method4709(class185 arg0, class185 arg1) {
        if (arg0.field2145 != null) {
            arg0.method3379();
        }
        arg0.field2145 = arg1;
        arg0.field2143 = arg1.field2143;
        arg0.field2145.field2143 = arg0;
        arg0.field2143.field2145 = arg0;
    }

    @ObfuscatedName("jq.j()Lgf;")
    public class185 method4707() {
        class185 var1 = this.field3578.field2143;
        if (this.field3578 == var1) {
            return null;
        } else {
            var1.method3379();
            return var1;
        }
    }

    @ObfuscatedName("jq.p()Lgf;")
    public class185 method4708() {
        return this.method4706((class185) null);
    }

    @ObfuscatedName("jq.g(Lgf;)Lgf;")
    public class185 method4706(class185 arg0) {
        class185 var2;
        if (arg0 == null) {
            var2 = this.field3578.field2143;
        } else {
            var2 = arg0;
        }
        if (this.field3578 == var2) {
            this.field3577 = null;
            return null;
        } else {
            this.field3577 = var2.field2143;
            return var2;
        }
    }

    @ObfuscatedName("jq.n()Lgf;")
    public class185 method4710() {
        class185 var1 = this.field3577;
        if (this.field3578 == var1) {
            this.field3577 = null;
            return null;
        } else {
            this.field3577 = var1.field2143;
            return var1;
        }
    }

    public Iterator iterator() {
        return new class274(this);
    }
}
