package deob;

import java.util.Iterator;

@ObfuscatedName("gg")
public class class206 implements Iterable {

    @ObfuscatedName("gg.l")
    public class212 field3162 = new class212();

    @ObfuscatedName("gg.g")
    public class212 field3161;

    public class206() {
        this.field3162.field3174 = this.field3162;
        this.field3162.field3175 = this.field3162;
    }

    @ObfuscatedName("gg.l(Lhb;)V")
    public void method3756(class212 arg0) {
        if (arg0.field3175 != null) {
            arg0.method3815();
        }
        arg0.field3175 = this.field3162.field3175;
        arg0.field3174 = this.field3162;
        arg0.field3175.field3174 = arg0;
        arg0.field3174.field3175 = arg0;
    }

    @ObfuscatedName("gg.g(Lhb;)V")
    public void method3757(class212 arg0) {
        if (arg0.field3175 != null) {
            arg0.method3815();
        }
        arg0.field3175 = this.field3162;
        arg0.field3174 = this.field3162.field3174;
        arg0.field3175.field3174 = arg0;
        arg0.field3174.field3175 = arg0;
    }

    @ObfuscatedName("gg.r(Lhb;Lhb;)V")
    public static void method3758(class212 arg0, class212 arg1) {
        if (arg0.field3175 != null) {
            arg0.method3815();
        }
        arg0.field3175 = arg1;
        arg0.field3174 = arg1.field3174;
        arg0.field3175.field3174 = arg0;
        arg0.field3174.field3175 = arg0;
    }

    @ObfuscatedName("gg.e()Lhb;")
    public class212 method3759() {
        return this.method3760((class212) null);
    }

    @ObfuscatedName("gg.h(Lhb;)Lhb;")
    public class212 method3760(class212 arg0) {
        class212 var2;
        if (arg0 == null) {
            var2 = this.field3162.field3174;
        } else {
            var2 = arg0;
        }
        if (this.field3162 == var2) {
            this.field3161 = null;
            return null;
        } else {
            this.field3161 = var2.field3174;
            return var2;
        }
    }

    @ObfuscatedName("gg.s()Lhb;")
    public class212 method3761() {
        class212 var1 = this.field3161;
        if (this.field3162 == var1) {
            this.field3161 = null;
            return null;
        } else {
            this.field3161 = var1.field3174;
            return var1;
        }
    }

    @ObfuscatedName("gg.k()Z")
    public boolean method3765() {
        return this.field3162.field3174 == this.field3162;
    }

    public Iterator iterator() {
        return new class209(this);
    }
}
