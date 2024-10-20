package deob;

import java.util.Iterator;

@ObfuscatedName("ko")
public class class299 implements Iterable {

    @ObfuscatedName("ko.v")
    public class347 field3718 = new class347();

    @ObfuscatedName("ko.n")
    public class347 field3717;

    public class299() {
        this.field3718.field3931 = this.field3718;
        this.field3718.field3933 = this.field3718;
    }

    @ObfuscatedName("ko.v()V")
    public void method4862() {
        while (this.field3718.field3931 != this.field3718) {
            this.field3718.field3931.method5487();
        }
    }

    @ObfuscatedName("ko.n(Lmf;)V")
    public void method4853(class347 arg0) {
        if (arg0.field3933 != null) {
            arg0.method5487();
        }
        arg0.field3933 = this.field3718.field3933;
        arg0.field3931 = this.field3718;
        arg0.field3933.field3931 = arg0;
        arg0.field3931.field3933 = arg0;
    }

    @ObfuscatedName("ko.f(Lmf;Lmf;)V")
    public static void method4854(class347 arg0, class347 arg1) {
        if (arg0.field3933 != null) {
            arg0.method5487();
        }
        arg0.field3933 = arg1;
        arg0.field3931 = arg1.field3931;
        arg0.field3933.field3931 = arg0;
        arg0.field3931.field3933 = arg0;
    }

    @ObfuscatedName("ko.y()Lmf;")
    public class347 method4855() {
        class347 var1 = this.field3718.field3931;
        if (this.field3718 == var1) {
            return null;
        } else {
            var1.method5487();
            return var1;
        }
    }

    @ObfuscatedName("ko.p()Lmf;")
    public class347 method4856() {
        return this.method4857((class347) null);
    }

    @ObfuscatedName("ko.j(Lmf;)Lmf;")
    public class347 method4857(class347 arg0) {
        class347 var2;
        if (arg0 == null) {
            var2 = this.field3718.field3931;
        } else {
            var2 = arg0;
        }
        if (this.field3718 == var2) {
            this.field3717 = null;
            return null;
        } else {
            this.field3717 = var2.field3931;
            return var2;
        }
    }

    @ObfuscatedName("ko.r()Lmf;")
    public class347 method4858() {
        class347 var1 = this.field3717;
        if (this.field3718 == var1) {
            this.field3717 = null;
            return null;
        } else {
            this.field3717 = var1.field3931;
            return var1;
        }
    }

    public Iterator iterator() {
        return new class298(this);
    }
}
