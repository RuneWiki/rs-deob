package deob;

import java.util.Iterator;

@ObfuscatedName("gg")
public class class206 implements Iterable {

    @ObfuscatedName("gg.k")
    public class212 field3153 = new class212();

    @ObfuscatedName("gg.q")
    public class212 field3154;

    public class206() {
        this.field3153.field3167 = this.field3153;
        this.field3153.field3168 = this.field3153;
    }

    @ObfuscatedName("gg.k(Lhk;)V")
    public void method3636(class212 arg0) {
        if (arg0.field3168 != null) {
            arg0.method3703();
        }
        arg0.field3168 = this.field3153.field3168;
        arg0.field3167 = this.field3153;
        arg0.field3168.field3167 = arg0;
        arg0.field3167.field3168 = arg0;
    }

    @ObfuscatedName("gg.q(Lhk;)V")
    public void method3654(class212 arg0) {
        if (arg0.field3168 != null) {
            arg0.method3703();
        }
        arg0.field3168 = this.field3153;
        arg0.field3167 = this.field3153.field3167;
        arg0.field3168.field3167 = arg0;
        arg0.field3167.field3168 = arg0;
    }

    @ObfuscatedName("gg.f(Lhk;Lhk;)V")
    public static void method3639(class212 arg0, class212 arg1) {
        if (arg0.field3168 != null) {
            arg0.method3703();
        }
        arg0.field3168 = arg1;
        arg0.field3167 = arg1.field3167;
        arg0.field3168.field3167 = arg0;
        arg0.field3167.field3168 = arg0;
    }

    @ObfuscatedName("gg.c()Lhk;")
    public class212 method3645() {
        return this.method3640((class212) null);
    }

    @ObfuscatedName("gg.v(Lhk;)Lhk;")
    public class212 method3640(class212 arg0) {
        class212 var2;
        if (arg0 == null) {
            var2 = this.field3153.field3167;
        } else {
            var2 = arg0;
        }
        if (this.field3153 == var2) {
            this.field3154 = null;
            return null;
        } else {
            this.field3154 = var2.field3167;
            return var2;
        }
    }

    @ObfuscatedName("gg.y()Lhk;")
    public class212 method3665() {
        class212 var1 = this.field3154;
        if (this.field3153 == var1) {
            this.field3154 = null;
            return null;
        } else {
            this.field3154 = var1.field3167;
            return var1;
        }
    }

    @ObfuscatedName("gg.u()Z")
    public boolean method3649() {
        return this.field3153.field3167 == this.field3153;
    }

    public Iterator iterator() {
        return new class209(this);
    }
}
