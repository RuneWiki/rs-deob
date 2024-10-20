package deob;

@ObfuscatedName("gm")
public class class203 {

    @ObfuscatedName("gm.e")
    public class212 field3146 = new class212();

    @ObfuscatedName("gm.l")
    public class212 field3145;

    public class203() {
        this.field3146.field3163 = this.field3146;
        this.field3146.field3164 = this.field3146;
    }

    @ObfuscatedName("gm.e()V")
    public void method3672() {
        while (true) {
            class212 var1 = this.field3146.field3163;
            if (this.field3146 == var1) {
                this.field3145 = null;
                return;
            }
            var1.method3755();
        }
    }

    @ObfuscatedName("gm.l(Lhs;)V")
    public void method3650(class212 arg0) {
        if (arg0.field3164 != null) {
            arg0.method3755();
        }
        arg0.field3164 = this.field3146.field3164;
        arg0.field3163 = this.field3146;
        arg0.field3164.field3163 = arg0;
        arg0.field3163.field3164 = arg0;
    }

    @ObfuscatedName("gm.c(Lhs;)V")
    public void method3651(class212 arg0) {
        if (arg0.field3164 != null) {
            arg0.method3755();
        }
        arg0.field3164 = this.field3146;
        arg0.field3163 = this.field3146.field3163;
        arg0.field3164.field3163 = arg0;
        arg0.field3163.field3164 = arg0;
    }

    @ObfuscatedName("gm.h(Lhs;Lhs;)V")
    public static void method3657(class212 arg0, class212 arg1) {
        if (arg0.field3164 != null) {
            arg0.method3755();
        }
        arg0.field3164 = arg1.field3164;
        arg0.field3163 = arg1;
        arg0.field3164.field3163 = arg0;
        arg0.field3163.field3164 = arg0;
    }

    @ObfuscatedName("gm.r()Lhs;")
    public class212 method3652() {
        class212 var1 = this.field3146.field3163;
        if (this.field3146 == var1) {
            return null;
        } else {
            var1.method3755();
            return var1;
        }
    }

    @ObfuscatedName("gm.a()Lhs;")
    public class212 method3653() {
        class212 var1 = this.field3146.field3164;
        if (this.field3146 == var1) {
            return null;
        } else {
            var1.method3755();
            return var1;
        }
    }

    @ObfuscatedName("gm.b()Lhs;")
    public class212 method3654() {
        class212 var1 = this.field3146.field3163;
        if (this.field3146 == var1) {
            this.field3145 = null;
            return null;
        } else {
            this.field3145 = var1.field3163;
            return var1;
        }
    }

    @ObfuscatedName("gm.u()Lhs;")
    public class212 method3655() {
        class212 var1 = this.field3146.field3164;
        if (this.field3146 == var1) {
            this.field3145 = null;
            return null;
        } else {
            this.field3145 = var1.field3164;
            return var1;
        }
    }

    @ObfuscatedName("gm.o()Lhs;")
    public class212 method3673() {
        class212 var1 = this.field3145;
        if (this.field3146 == var1) {
            this.field3145 = null;
            return null;
        } else {
            this.field3145 = var1.field3163;
            return var1;
        }
    }

    @ObfuscatedName("gm.p()Lhs;")
    public class212 method3648() {
        class212 var1 = this.field3145;
        if (this.field3146 == var1) {
            this.field3145 = null;
            return null;
        } else {
            this.field3145 = var1.field3164;
            return var1;
        }
    }
}
