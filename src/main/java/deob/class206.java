package deob;

import java.util.Iterator;

@ObfuscatedName("gz")
public class class206 implements Iterable {

    @ObfuscatedName("gz.s")
    public class212 field3153 = new class212();

    @ObfuscatedName("gz.z")
    public class212 field3154;

    public class206() {
        this.field3153.field3166 = this.field3153;
        this.field3153.field3168 = this.field3153;
    }

    @ObfuscatedName("gz.s(Lhg;)V")
    public void method3627(class212 arg0) {
        if (arg0.field3168 != null) {
            arg0.method3699();
        }
        arg0.field3168 = this.field3153.field3168;
        arg0.field3166 = this.field3153;
        arg0.field3168.field3166 = arg0;
        arg0.field3166.field3168 = arg0;
    }

    @ObfuscatedName("gz.z(Lhg;)V")
    public void method3631(class212 arg0) {
        if (arg0.field3168 != null) {
            arg0.method3699();
        }
        arg0.field3168 = this.field3153;
        arg0.field3166 = this.field3153.field3166;
        arg0.field3168.field3166 = arg0;
        arg0.field3166.field3168 = arg0;
    }

    @ObfuscatedName("gz.t(Lhg;Lhg;)V")
    public static void method3626(class212 arg0, class212 arg1) {
        if (arg0.field3168 != null) {
            arg0.method3699();
        }
        arg0.field3168 = arg1;
        arg0.field3166 = arg1.field3166;
        arg0.field3168.field3166 = arg0;
        arg0.field3166.field3168 = arg0;
    }

    @ObfuscatedName("gz.y()Lhg;")
    public class212 method3630() {
        return this.method3634((class212) null);
    }

    @ObfuscatedName("gz.p(Lhg;)Lhg;")
    public class212 method3634(class212 arg0) {
        class212 var2;
        if (arg0 == null) {
            var2 = this.field3153.field3166;
        } else {
            var2 = arg0;
        }
        if (this.field3153 == var2) {
            this.field3154 = null;
            return null;
        } else {
            this.field3154 = var2.field3166;
            return var2;
        }
    }

    @ObfuscatedName("gz.g()Lhg;")
    public class212 method3632() {
        class212 var1 = this.field3154;
        if (this.field3153 == var1) {
            this.field3154 = null;
            return null;
        } else {
            this.field3154 = var1.field3166;
            return var1;
        }
    }

    @ObfuscatedName("gz.m()Z")
    public boolean method3646() {
        return this.field3153.field3166 == this.field3153;
    }

    public Iterator iterator() {
        return new class209(this);
    }
}
