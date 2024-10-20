package deob;

@ObfuscatedName("hv")
public class class218 {

    @ObfuscatedName("hv.d")
    public class217 field2656 = new class217();

    @ObfuscatedName("hv.z")
    public class217 field2657;

    public class218() {
        this.field2656.field2654 = this.field2656;
        this.field2656.field2653 = this.field2656;
    }

    @ObfuscatedName("hv.d()V")
    public void method3792() {
        while (true) {
            class217 var1 = this.field2656.field2654;
            if (this.field2656 == var1) {
                this.field2657 = null;
                return;
            }
            var1.method3785();
        }
    }

    @ObfuscatedName("hv.z(Lho;)V")
    public void method3793(class217 arg0) {
        if (arg0.field2653 != null) {
            arg0.method3785();
        }
        arg0.field2653 = this.field2656.field2653;
        arg0.field2654 = this.field2656;
        arg0.field2653.field2654 = arg0;
        arg0.field2654.field2653 = arg0;
    }

    @ObfuscatedName("hv.n(Lho;)V")
    public void method3794(class217 arg0) {
        if (arg0.field2653 != null) {
            arg0.method3785();
        }
        arg0.field2653 = this.field2656;
        arg0.field2654 = this.field2656.field2654;
        arg0.field2653.field2654 = arg0;
        arg0.field2654.field2653 = arg0;
    }

    @ObfuscatedName("hv.r(Lho;Lho;)V")
    public static void method3795(class217 arg0, class217 arg1) {
        if (arg0.field2653 != null) {
            arg0.method3785();
        }
        arg0.field2653 = arg1.field2653;
        arg0.field2654 = arg1;
        arg0.field2653.field2654 = arg0;
        arg0.field2654.field2653 = arg0;
    }

    @ObfuscatedName("hv.e()Lho;")
    public class217 method3796() {
        class217 var1 = this.field2656.field2654;
        if (this.field2656 == var1) {
            return null;
        } else {
            var1.method3785();
            return var1;
        }
    }

    @ObfuscatedName("hv.y()Lho;")
    public class217 method3806() {
        class217 var1 = this.field2656.field2653;
        if (this.field2656 == var1) {
            return null;
        } else {
            var1.method3785();
            return var1;
        }
    }

    @ObfuscatedName("hv.k()Lho;")
    public class217 method3798() {
        class217 var1 = this.field2656.field2654;
        if (this.field2656 == var1) {
            this.field2657 = null;
            return null;
        } else {
            this.field2657 = var1.field2654;
            return var1;
        }
    }

    @ObfuscatedName("hv.s()Lho;")
    public class217 method3799() {
        class217 var1 = this.field2656.field2653;
        if (this.field2656 == var1) {
            this.field2657 = null;
            return null;
        } else {
            this.field2657 = var1.field2653;
            return var1;
        }
    }

    @ObfuscatedName("hv.x()Lho;")
    public class217 method3800() {
        class217 var1 = this.field2657;
        if (this.field2656 == var1) {
            this.field2657 = null;
            return null;
        } else {
            this.field2657 = var1.field2654;
            return var1;
        }
    }

    @ObfuscatedName("hv.h()Lho;")
    public class217 method3801() {
        class217 var1 = this.field2657;
        if (this.field2656 == var1) {
            this.field2657 = null;
            return null;
        } else {
            this.field2657 = var1.field2653;
            return var1;
        }
    }
}
