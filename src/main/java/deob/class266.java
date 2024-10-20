package deob;

import java.util.Iterator;

@ObfuscatedName("jq")
public class class266 implements Iterable {

    @ObfuscatedName("jq.a")
    public class176 field3537 = new class176();

    @ObfuscatedName("jq.t")
    public class176 field3538;

    public class266() {
        this.field3537.field2082 = this.field3537;
        this.field3537.field2083 = this.field3537;
    }

    @ObfuscatedName("jq.a()V")
    public void method4638() {
        while (this.field3537.field2082 != this.field3537) {
            this.field3537.field2082.method3378();
        }
    }

    @ObfuscatedName("jq.t(Lfa;)V")
    public void method4639(class176 arg0) {
        if (arg0.field2083 != null) {
            arg0.method3378();
        }
        arg0.field2083 = this.field3537.field2083;
        arg0.field2082 = this.field3537;
        arg0.field2083.field2082 = arg0;
        arg0.field2082.field2083 = arg0;
    }

    @ObfuscatedName("jq.n(Lfa;Lfa;)V")
    public static void method4640(class176 arg0, class176 arg1) {
        if (arg0.field2083 != null) {
            arg0.method3378();
        }
        arg0.field2083 = arg1;
        arg0.field2082 = arg1.field2082;
        arg0.field2083.field2082 = arg0;
        arg0.field2082.field2083 = arg0;
    }

    @ObfuscatedName("jq.q()Lfa;")
    public class176 method4653() {
        class176 var1 = this.field3537.field2082;
        if (this.field3537 == var1) {
            return null;
        } else {
            var1.method3378();
            return var1;
        }
    }

    @ObfuscatedName("jq.v()Lfa;")
    public class176 method4661() {
        return this.method4643((class176) null);
    }

    @ObfuscatedName("jq.l(Lfa;)Lfa;")
    public class176 method4643(class176 arg0) {
        class176 var2;
        if (arg0 == null) {
            var2 = this.field3537.field2082;
        } else {
            var2 = arg0;
        }
        if (this.field3537 == var2) {
            this.field3538 = null;
            return null;
        } else {
            this.field3538 = var2.field2082;
            return var2;
        }
    }

    @ObfuscatedName("jq.c()Lfa;")
    public class176 method4650() {
        class176 var1 = this.field3538;
        if (this.field3537 == var1) {
            this.field3538 = null;
            return null;
        } else {
            this.field3538 = var1.field2082;
            return var1;
        }
    }

    public Iterator iterator() {
        return new class264(this);
    }
}
