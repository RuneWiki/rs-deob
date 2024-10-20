package deob;

import java.util.Iterator;

@ObfuscatedName("ga")
public class class206 implements Iterable {

    @ObfuscatedName("ga.m")
    public class212 field3155 = new class212();

    @ObfuscatedName("ga.w")
    public class212 field3154;

    public class206() {
        this.field3155.field3169 = this.field3155;
        this.field3155.field3167 = this.field3155;
    }

    @ObfuscatedName("ga.m(Lhf;)V")
    public void method3667(class212 arg0) {
        if (arg0.field3167 != null) {
            arg0.method3729();
        }
        arg0.field3167 = this.field3155.field3167;
        arg0.field3169 = this.field3155;
        arg0.field3167.field3169 = arg0;
        arg0.field3169.field3167 = arg0;
    }

    @ObfuscatedName("ga.w(Lhf;)V")
    public void method3657(class212 arg0) {
        if (arg0.field3167 != null) {
            arg0.method3729();
        }
        arg0.field3167 = this.field3155;
        arg0.field3169 = this.field3155.field3169;
        arg0.field3167.field3169 = arg0;
        arg0.field3169.field3167 = arg0;
    }

    @ObfuscatedName("ga.e(Lhf;Lhf;)V")
    public static void method3662(class212 arg0, class212 arg1) {
        if (arg0.field3167 != null) {
            arg0.method3729();
        }
        arg0.field3167 = arg1;
        arg0.field3169 = arg1.field3169;
        arg0.field3167.field3169 = arg0;
        arg0.field3169.field3167 = arg0;
    }

    @ObfuscatedName("ga.o()Lhf;")
    public class212 method3660() {
        return this.method3661((class212) null);
    }

    @ObfuscatedName("ga.g(Lhf;)Lhf;")
    public class212 method3661(class212 arg0) {
        class212 var2;
        if (arg0 == null) {
            var2 = this.field3155.field3169;
        } else {
            var2 = arg0;
        }
        if (this.field3155 == var2) {
            this.field3154 = null;
            return null;
        } else {
            this.field3154 = var2.field3169;
            return var2;
        }
    }

    @ObfuscatedName("ga.l()Lhf;")
    public class212 method3675() {
        class212 var1 = this.field3154;
        if (this.field3155 == var1) {
            this.field3154 = null;
            return null;
        } else {
            this.field3154 = var1.field3169;
            return var1;
        }
    }

    @ObfuscatedName("ga.j()Z")
    public boolean method3663() {
        return this.field3155.field3169 == this.field3155;
    }

    public Iterator iterator() {
        return new class209(this);
    }
}
