package deob;

@ObfuscatedName("hl")
public class class218 {

    @ObfuscatedName("hl.c")
    public class217 field2647 = new class217();

    @ObfuscatedName("hl.i")
    public class217 field2646;

    public class218() {
        this.field2647.field2643 = this.field2647;
        this.field2647.field2644 = this.field2647;
    }

    @ObfuscatedName("hl.c()V")
    public void method3715() {
        while (true) {
            class217 var1 = this.field2647.field2643;
            if (this.field2647 == var1) {
                this.field2646 = null;
                return;
            }
            var1.method3710();
        }
    }

    @ObfuscatedName("hl.i(Lhg;)V")
    public void method3716(class217 arg0) {
        if (arg0.field2644 != null) {
            arg0.method3710();
        }
        arg0.field2644 = this.field2647.field2644;
        arg0.field2643 = this.field2647;
        arg0.field2644.field2643 = arg0;
        arg0.field2643.field2644 = arg0;
    }

    @ObfuscatedName("hl.o(Lhg;)V")
    public void method3717(class217 arg0) {
        if (arg0.field2644 != null) {
            arg0.method3710();
        }
        arg0.field2644 = this.field2647;
        arg0.field2643 = this.field2647.field2643;
        arg0.field2644.field2643 = arg0;
        arg0.field2643.field2644 = arg0;
    }

    @ObfuscatedName("hl.j(Lhg;Lhg;)V")
    public static void method3741(class217 arg0, class217 arg1) {
        if (arg0.field2644 != null) {
            arg0.method3710();
        }
        arg0.field2644 = arg1.field2644;
        arg0.field2643 = arg1;
        arg0.field2644.field2643 = arg0;
        arg0.field2643.field2644 = arg0;
    }

    @ObfuscatedName("hl.k()Lhg;")
    public class217 method3718() {
        class217 var1 = this.field2647.field2643;
        if (this.field2647 == var1) {
            return null;
        } else {
            var1.method3710();
            return var1;
        }
    }

    @ObfuscatedName("hl.x()Lhg;")
    public class217 method3720() {
        class217 var1 = this.field2647.field2644;
        if (this.field2647 == var1) {
            return null;
        } else {
            var1.method3710();
            return var1;
        }
    }

    @ObfuscatedName("hl.z()Lhg;")
    public class217 method3723() {
        class217 var1 = this.field2647.field2643;
        if (this.field2647 == var1) {
            this.field2646 = null;
            return null;
        } else {
            this.field2646 = var1.field2643;
            return var1;
        }
    }

    @ObfuscatedName("hl.p()Lhg;")
    public class217 method3728() {
        class217 var1 = this.field2647.field2644;
        if (this.field2647 == var1) {
            this.field2646 = null;
            return null;
        } else {
            this.field2646 = var1.field2644;
            return var1;
        }
    }

    @ObfuscatedName("hl.w()Lhg;")
    public class217 method3722() {
        class217 var1 = this.field2646;
        if (this.field2647 == var1) {
            this.field2646 = null;
            return null;
        } else {
            this.field2646 = var1.field2643;
            return var1;
        }
    }

    @ObfuscatedName("hl.r()Lhg;")
    public class217 method3742() {
        class217 var1 = this.field2646;
        if (this.field2647 == var1) {
            this.field2646 = null;
            return null;
        } else {
            this.field2646 = var1.field2644;
            return var1;
        }
    }
}
