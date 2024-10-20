package deob;

import java.util.Iterator;

@ObfuscatedName("gq")
public class class193 implements Iterable {

    @ObfuscatedName("gq.o")
    public class199 field3001 = new class199();

    public class193() {
        this.field3001.field3013 = this.field3001;
        this.field3001.field3014 = this.field3001;
    }

    @ObfuscatedName("gq.o(Lgj;)V")
    public void method3518(class199 arg0) {
        if (arg0.field3014 != null) {
            arg0.method3564();
        }
        arg0.field3014 = this.field3001.field3014;
        arg0.field3013 = this.field3001;
        arg0.field3014.field3013 = arg0;
        arg0.field3013.field3014 = arg0;
    }

    @ObfuscatedName("gq.l()Lgj;")
    public class199 method3519() {
        return this.method3517((class199) null);
    }

    @ObfuscatedName("gq.g(Lgj;)Lgj;")
    public class199 method3517(class199 arg0) {
        class199 var2;
        if (arg0 == null) {
            var2 = this.field3001.field3013;
        } else {
            var2 = arg0;
        }
        return this.field3001 == var2 ? null : var2;
    }

    public Iterator iterator() {
        return new class196(this);
    }
}
