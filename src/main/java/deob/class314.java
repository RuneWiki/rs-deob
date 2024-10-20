package deob;

import java.util.Iterator;

@ObfuscatedName("lm")
public class class314 implements Iterable {

    @ObfuscatedName("lm.i")
    public class365 field3824 = new class365();

    @ObfuscatedName("lm.w")
    public class365 field3823;

    public class314() {
        this.field3824.field4068 = this.field3824;
        this.field3824.field4069 = this.field3824;
    }

    @ObfuscatedName("lm.i()V")
    public void method5123() {
        while (this.field3824.field4068 != this.field3824) {
            this.field3824.field4068.method5748();
        }
    }

    @ObfuscatedName("lm.w(Lnt;)V")
    public void method5124(class365 arg0) {
        if (arg0.field4069 != null) {
            arg0.method5748();
        }
        arg0.field4069 = this.field3824.field4069;
        arg0.field4068 = this.field3824;
        arg0.field4069.field4068 = arg0;
        arg0.field4068.field4069 = arg0;
    }

    @ObfuscatedName("lm.s(Lnt;Lnt;)V")
    public static void method5126(class365 arg0, class365 arg1) {
        if (arg0.field4069 != null) {
            arg0.method5748();
        }
        arg0.field4069 = arg1;
        arg0.field4068 = arg1.field4068;
        arg0.field4069.field4068 = arg0;
        arg0.field4068.field4069 = arg0;
    }

    @ObfuscatedName("lm.a()Lnt;")
    public class365 method5128() {
        class365 var1 = this.field3824.field4068;
        if (this.field3824 == var1) {
            return null;
        } else {
            var1.method5748();
            return var1;
        }
    }

    @ObfuscatedName("lm.o()Lnt;")
    public class365 method5127() {
        return this.method5129((class365) null);
    }

    @ObfuscatedName("lm.g(Lnt;)Lnt;")
    public class365 method5129(class365 arg0) {
        class365 var2;
        if (arg0 == null) {
            var2 = this.field3824.field4068;
        } else {
            var2 = arg0;
        }
        if (this.field3824 == var2) {
            this.field3823 = null;
            return null;
        } else {
            this.field3823 = var2.field4068;
            return var2;
        }
    }

    @ObfuscatedName("lm.e()Lnt;")
    public class365 method5135() {
        class365 var1 = this.field3823;
        if (this.field3824 == var1) {
            this.field3823 = null;
            return null;
        } else {
            this.field3823 = var1.field4068;
            return var1;
        }
    }

    public Iterator iterator() {
        return new class313(this);
    }
}
