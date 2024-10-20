package deob;

@ObfuscatedName("hr")
public class class218 {

    @ObfuscatedName("hr.o")
    public class217 field2656 = new class217();

    @ObfuscatedName("hr.k")
    public class217 field2655;

    public class218() {
        this.field2656.field2653 = this.field2656;
        this.field2656.field2654 = this.field2656;
    }

    @ObfuscatedName("hr.o()V")
    public void method3695() {
        while (true) {
            class217 var1 = this.field2656.field2653;
            if (this.field2656 == var1) {
                this.field2655 = null;
                return;
            }
            var1.method3681();
        }
    }

    @ObfuscatedName("hr.k(Lhj;)V")
    public void method3690(class217 arg0) {
        if (arg0.field2654 != null) {
            arg0.method3681();
        }
        arg0.field2654 = this.field2656.field2654;
        arg0.field2653 = this.field2656;
        arg0.field2654.field2653 = arg0;
        arg0.field2653.field2654 = arg0;
    }

    @ObfuscatedName("hr.t(Lhj;)V")
    public void method3691(class217 arg0) {
        if (arg0.field2654 != null) {
            arg0.method3681();
        }
        arg0.field2654 = this.field2656;
        arg0.field2653 = this.field2656.field2653;
        arg0.field2654.field2653 = arg0;
        arg0.field2653.field2654 = arg0;
    }

    @ObfuscatedName("hr.d(Lhj;Lhj;)V")
    public static void method3692(class217 arg0, class217 arg1) {
        if (arg0.field2654 != null) {
            arg0.method3681();
        }
        arg0.field2654 = arg1.field2654;
        arg0.field2653 = arg1;
        arg0.field2654.field2653 = arg0;
        arg0.field2653.field2654 = arg0;
    }

    @ObfuscatedName("hr.h()Lhj;")
    public class217 method3693() {
        class217 var1 = this.field2656.field2653;
        if (this.field2656 == var1) {
            return null;
        } else {
            var1.method3681();
            return var1;
        }
    }

    @ObfuscatedName("hr.m()Lhj;")
    public class217 method3711() {
        class217 var1 = this.field2656.field2654;
        if (this.field2656 == var1) {
            return null;
        } else {
            var1.method3681();
            return var1;
        }
    }

    @ObfuscatedName("hr.z()Lhj;")
    public class217 method3707() {
        class217 var1 = this.field2656.field2653;
        if (this.field2656 == var1) {
            this.field2655 = null;
            return null;
        } else {
            this.field2655 = var1.field2653;
            return var1;
        }
    }

    @ObfuscatedName("hr.i()Lhj;")
    public class217 method3708() {
        class217 var1 = this.field2656.field2654;
        if (this.field2656 == var1) {
            this.field2655 = null;
            return null;
        } else {
            this.field2655 = var1.field2654;
            return var1;
        }
    }

    @ObfuscatedName("hr.u()Lhj;")
    public class217 method3697() {
        class217 var1 = this.field2655;
        if (this.field2656 == var1) {
            this.field2655 = null;
            return null;
        } else {
            this.field2655 = var1.field2653;
            return var1;
        }
    }

    @ObfuscatedName("hr.x()Lhj;")
    public class217 method3698() {
        class217 var1 = this.field2655;
        if (this.field2656 == var1) {
            this.field2655 = null;
            return null;
        } else {
            this.field2655 = var1.field2654;
            return var1;
        }
    }
}
