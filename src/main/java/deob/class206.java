package deob;

import java.util.Iterator;

@ObfuscatedName("gm")
public class class206 implements Iterable {

    @ObfuscatedName("gm.f")
    public class212 field3154 = new class212();

    @ObfuscatedName("gm.e")
    public class212 field3153;

    public class206() {
        this.field3154.field3166 = this.field3154;
        this.field3154.field3168 = this.field3154;
    }

    @ObfuscatedName("gm.f(Lhs;)V")
    public void method3685(class212 arg0) {
        if (arg0.field3168 != null) {
            arg0.method3744();
        }
        arg0.field3168 = this.field3154.field3168;
        arg0.field3166 = this.field3154;
        arg0.field3168.field3166 = arg0;
        arg0.field3166.field3168 = arg0;
    }

    @ObfuscatedName("gm.e(Lhs;)V")
    public void method3686(class212 arg0) {
        if (arg0.field3168 != null) {
            arg0.method3744();
        }
        arg0.field3168 = this.field3154;
        arg0.field3166 = this.field3154.field3166;
        arg0.field3168.field3166 = arg0;
        arg0.field3166.field3168 = arg0;
    }

    @ObfuscatedName("gm.n(Lhs;Lhs;)V")
    public static void method3692(class212 arg0, class212 arg1) {
        if (arg0.field3168 != null) {
            arg0.method3744();
        }
        arg0.field3168 = arg1;
        arg0.field3166 = arg1.field3166;
        arg0.field3168.field3166 = arg0;
        arg0.field3166.field3168 = arg0;
    }

    @ObfuscatedName("gm.t()Lhs;")
    public class212 method3688() {
        return this.method3689((class212) null);
    }

    @ObfuscatedName("gm.v(Lhs;)Lhs;")
    public class212 method3689(class212 arg0) {
        class212 var2;
        if (arg0 == null) {
            var2 = this.field3154.field3166;
        } else {
            var2 = arg0;
        }
        if (this.field3154 == var2) {
            this.field3153 = null;
            return null;
        } else {
            this.field3153 = var2.field3166;
            return var2;
        }
    }

    @ObfuscatedName("gm.b()Lhs;")
    public class212 method3684() {
        class212 var1 = this.field3153;
        if (this.field3154 == var1) {
            this.field3153 = null;
            return null;
        } else {
            this.field3153 = var1.field3166;
            return var1;
        }
    }

    @ObfuscatedName("gm.m()Z")
    public boolean method3691() {
        return this.field3154.field3166 == this.field3154;
    }

    public Iterator iterator() {
        return new class209(this);
    }
}
