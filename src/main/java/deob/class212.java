package deob;

import java.util.Iterator;

@ObfuscatedName("hl")
public class class212 implements Iterable {

    @ObfuscatedName("hl.b")
    public class213 field2610 = new class213();

    @ObfuscatedName("hl.q")
    public class213 field2609;

    public class212() {
        this.field2610.field2612 = this.field2610;
        this.field2610.field2611 = this.field2610;
    }

    @ObfuscatedName("hl.b()V")
    public void method3691() {
        while (this.field2610.field2612 != this.field2610) {
            this.field2610.field2612.method3726();
        }
    }

    @ObfuscatedName("hl.q(Lhe;)V")
    public void method3720(class213 arg0) {
        if (arg0.field2611 != null) {
            arg0.method3726();
        }
        arg0.field2611 = this.field2610.field2611;
        arg0.field2612 = this.field2610;
        arg0.field2611.field2612 = arg0;
        arg0.field2612.field2611 = arg0;
    }

    @ObfuscatedName("hl.o(Lhe;)V")
    public void method3693(class213 arg0) {
        if (arg0.field2611 != null) {
            arg0.method3726();
        }
        arg0.field2611 = this.field2610;
        arg0.field2612 = this.field2610.field2612;
        arg0.field2611.field2612 = arg0;
        arg0.field2612.field2611 = arg0;
    }

    @ObfuscatedName("hl.p(Lhe;Lhe;)V")
    public static void method3694(class213 arg0, class213 arg1) {
        if (arg0.field2611 != null) {
            arg0.method3726();
        }
        arg0.field2611 = arg1;
        arg0.field2612 = arg1.field2612;
        arg0.field2611.field2612 = arg0;
        arg0.field2612.field2611 = arg0;
    }

    @ObfuscatedName("hl.a()Lhe;")
    public class213 method3697() {
        class213 var1 = this.field2610.field2612;
        if (this.field2610 == var1) {
            return null;
        } else {
            var1.method3726();
            return var1;
        }
    }

    @ObfuscatedName("hl.h()Lhe;")
    public class213 method3696() {
        return this.method3716((class213) null);
    }

    @ObfuscatedName("hl.l(Lhe;)Lhe;")
    public class213 method3716(class213 arg0) {
        class213 var2;
        if (arg0 == null) {
            var2 = this.field2610.field2612;
        } else {
            var2 = arg0;
        }
        if (this.field2610 == var2) {
            this.field2609 = null;
            return null;
        } else {
            this.field2609 = var2.field2612;
            return var2;
        }
    }

    @ObfuscatedName("hl.y()Lhe;")
    public class213 method3718() {
        class213 var1 = this.field2609;
        if (this.field2610 == var1) {
            this.field2609 = null;
            return null;
        } else {
            this.field2609 = var1.field2612;
            return var1;
        }
    }

    @ObfuscatedName("hl.g()Z")
    public boolean method3699() {
        return this.field2610.field2612 == this.field2610;
    }

    public Iterator iterator() {
        return new class209(this);
    }
}
