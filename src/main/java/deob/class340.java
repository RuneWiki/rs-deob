package deob;

import java.util.Iterator;

@ObfuscatedName("ma")
public class class340 implements Iterable {

    @ObfuscatedName("ma.o")
    public class406 field4154 = new class406();

    @ObfuscatedName("ma.q")
    public class406 field4155;

    public class340() {
        this.field4154.field4460 = this.field4154;
        this.field4154.field4461 = this.field4154;
    }

    @ObfuscatedName("ma.o()V")
    public void method5571() {
        while (this.field4154.field4460 != this.field4154) {
            this.field4154.field4460.method6393();
        }
    }

    @ObfuscatedName("ma.q(Loq;)V")
    public void method5572(class406 arg0) {
        if (arg0.field4461 != null) {
            arg0.method6393();
        }
        arg0.field4461 = this.field4154.field4461;
        arg0.field4460 = this.field4154;
        arg0.field4461.field4460 = arg0;
        arg0.field4460.field4461 = arg0;
    }

    @ObfuscatedName("ma.l(Loq;Loq;)V")
    public static void method5573(class406 arg0, class406 arg1) {
        if (arg0.field4461 != null) {
            arg0.method6393();
        }
        arg0.field4461 = arg1;
        arg0.field4460 = arg1.field4460;
        arg0.field4461.field4460 = arg0;
        arg0.field4460.field4461 = arg0;
    }

    @ObfuscatedName("ma.k()Loq;")
    public class406 method5582() {
        class406 var1 = this.field4154.field4460;
        if (this.field4154 == var1) {
            return null;
        } else {
            var1.method6393();
            return var1;
        }
    }

    @ObfuscatedName("ma.a()Loq;")
    public class406 method5589() {
        return this.method5576((class406) null);
    }

    @ObfuscatedName("ma.m(Loq;)Loq;")
    public class406 method5576(class406 arg0) {
        class406 var2;
        if (arg0 == null) {
            var2 = this.field4154.field4460;
        } else {
            var2 = arg0;
        }
        if (this.field4154 == var2) {
            this.field4155 = null;
            return null;
        } else {
            this.field4155 = var2.field4460;
            return var2;
        }
    }

    @ObfuscatedName("ma.p()Loq;")
    public class406 method5577() {
        class406 var1 = this.field4155;
        if (this.field4154 == var1) {
            this.field4155 = null;
            return null;
        } else {
            this.field4155 = var1.field4460;
            return var1;
        }
    }

    public Iterator iterator() {
        return new class339(this);
    }
}
