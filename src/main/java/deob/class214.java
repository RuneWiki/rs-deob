package deob;

@ObfuscatedName("hh")
public class class214 {

    @ObfuscatedName("hh.b")
    public class213 field2615 = new class213();

    @ObfuscatedName("hh.q")
    public class213 field2614;

    public class214() {
        this.field2615.field2612 = this.field2615;
        this.field2615.field2611 = this.field2615;
    }

    @ObfuscatedName("hh.b()V")
    public void method3734() {
        while (true) {
            class213 var1 = this.field2615.field2612;
            if (this.field2615 == var1) {
                this.field2614 = null;
                return;
            }
            var1.method3726();
        }
    }

    @ObfuscatedName("hh.q(Lhe;)V")
    public void method3741(class213 arg0) {
        if (arg0.field2611 != null) {
            arg0.method3726();
        }
        arg0.field2611 = this.field2615.field2611;
        arg0.field2612 = this.field2615;
        arg0.field2611.field2612 = arg0;
        arg0.field2612.field2611 = arg0;
    }

    @ObfuscatedName("hh.o(Lhe;)V")
    public void method3747(class213 arg0) {
        if (arg0.field2611 != null) {
            arg0.method3726();
        }
        arg0.field2611 = this.field2615;
        arg0.field2612 = this.field2615.field2612;
        arg0.field2611.field2612 = arg0;
        arg0.field2612.field2611 = arg0;
    }

    @ObfuscatedName("hh.p(Lhe;Lhe;)V")
    public static void method3736(class213 arg0, class213 arg1) {
        if (arg0.field2611 != null) {
            arg0.method3726();
        }
        arg0.field2611 = arg1.field2611;
        arg0.field2612 = arg1;
        arg0.field2611.field2612 = arg0;
        arg0.field2612.field2611 = arg0;
    }

    @ObfuscatedName("hh.a()Lhe;")
    public class213 method3737() {
        class213 var1 = this.field2615.field2612;
        if (this.field2615 == var1) {
            return null;
        } else {
            var1.method3726();
            return var1;
        }
    }

    @ObfuscatedName("hh.h()Lhe;")
    public class213 method3738() {
        class213 var1 = this.field2615.field2611;
        if (this.field2615 == var1) {
            return null;
        } else {
            var1.method3726();
            return var1;
        }
    }

    @ObfuscatedName("hh.l()Lhe;")
    public class213 method3739() {
        class213 var1 = this.field2615.field2612;
        if (this.field2615 == var1) {
            this.field2614 = null;
            return null;
        } else {
            this.field2614 = var1.field2612;
            return var1;
        }
    }

    @ObfuscatedName("hh.y()Lhe;")
    public class213 method3733() {
        class213 var1 = this.field2615.field2611;
        if (this.field2615 == var1) {
            this.field2614 = null;
            return null;
        } else {
            this.field2614 = var1.field2611;
            return var1;
        }
    }

    @ObfuscatedName("hh.g()Lhe;")
    public class213 method3745() {
        class213 var1 = this.field2614;
        if (this.field2615 == var1) {
            this.field2614 = null;
            return null;
        } else {
            this.field2614 = var1.field2612;
            return var1;
        }
    }

    @ObfuscatedName("hh.c()Lhe;")
    public class213 method3742() {
        class213 var1 = this.field2614;
        if (this.field2615 == var1) {
            this.field2614 = null;
            return null;
        } else {
            this.field2614 = var1.field2611;
            return var1;
        }
    }
}
