package deob;

@ObfuscatedName("hf")
public class class218 {

    @ObfuscatedName("hf.t")
    public class217 field2640 = new class217();

    @ObfuscatedName("hf.q")
    public class217 field2639;

    public class218() {
        this.field2640.field2637 = this.field2640;
        this.field2640.field2638 = this.field2640;
    }

    @ObfuscatedName("hf.t()V")
    public void method3726() {
        while (true) {
            class217 var1 = this.field2640.field2637;
            if (this.field2640 == var1) {
                this.field2639 = null;
                return;
            }
            var1.method3721();
        }
    }

    @ObfuscatedName("hf.q(Lhx;)V")
    public void method3759(class217 arg0) {
        if (arg0.field2638 != null) {
            arg0.method3721();
        }
        arg0.field2638 = this.field2640.field2638;
        arg0.field2637 = this.field2640;
        arg0.field2638.field2637 = arg0;
        arg0.field2637.field2638 = arg0;
    }

    @ObfuscatedName("hf.i(Lhx;)V")
    public void method3728(class217 arg0) {
        if (arg0.field2638 != null) {
            arg0.method3721();
        }
        arg0.field2638 = this.field2640;
        arg0.field2637 = this.field2640.field2637;
        arg0.field2638.field2637 = arg0;
        arg0.field2637.field2638 = arg0;
    }

    @ObfuscatedName("hf.a(Lhx;Lhx;)V")
    public static void method3756(class217 arg0, class217 arg1) {
        if (arg0.field2638 != null) {
            arg0.method3721();
        }
        arg0.field2638 = arg1.field2638;
        arg0.field2637 = arg1;
        arg0.field2638.field2637 = arg0;
        arg0.field2637.field2638 = arg0;
    }

    @ObfuscatedName("hf.l()Lhx;")
    public class217 method3729() {
        class217 var1 = this.field2640.field2637;
        if (this.field2640 == var1) {
            return null;
        } else {
            var1.method3721();
            return var1;
        }
    }

    @ObfuscatedName("hf.b()Lhx;")
    public class217 method3730() {
        class217 var1 = this.field2640.field2638;
        if (this.field2640 == var1) {
            return null;
        } else {
            var1.method3721();
            return var1;
        }
    }

    @ObfuscatedName("hf.e()Lhx;")
    public class217 method3731() {
        class217 var1 = this.field2640.field2637;
        if (this.field2640 == var1) {
            this.field2639 = null;
            return null;
        } else {
            this.field2639 = var1.field2637;
            return var1;
        }
    }

    @ObfuscatedName("hf.x()Lhx;")
    public class217 method3734() {
        class217 var1 = this.field2640.field2638;
        if (this.field2640 == var1) {
            this.field2639 = null;
            return null;
        } else {
            this.field2639 = var1.field2638;
            return var1;
        }
    }

    @ObfuscatedName("hf.p()Lhx;")
    public class217 method3733() {
        class217 var1 = this.field2639;
        if (this.field2640 == var1) {
            this.field2639 = null;
            return null;
        } else {
            this.field2639 = var1.field2637;
            return var1;
        }
    }

    @ObfuscatedName("hf.o()Lhx;")
    public class217 method3744() {
        class217 var1 = this.field2639;
        if (this.field2640 == var1) {
            this.field2639 = null;
            return null;
        } else {
            this.field2639 = var1.field2638;
            return var1;
        }
    }
}
