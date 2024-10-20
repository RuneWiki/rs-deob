package deob;

@ObfuscatedName("mq")
public class class352 {

    @ObfuscatedName("mq.h")
    public class433 field4331 = new class433();

    @ObfuscatedName("mq.e")
    public class433 field4330;

    public class352() {
        this.field4331.field4684 = this.field4331;
        this.field4331.field4685 = this.field4331;
    }

    @ObfuscatedName("mq.h()V")
    public void method6092() {
        while (true) {
            class433 var1 = this.field4331.field4684;
            if (this.field4331 == var1) {
                this.field4330 = null;
                return;
            }
            var1.method7230();
        }
    }

    @ObfuscatedName("mq.e(Lpl;)V")
    public void method6081(class433 arg0) {
        if (arg0.field4685 != null) {
            arg0.method7230();
        }
        arg0.field4685 = this.field4331.field4685;
        arg0.field4684 = this.field4331;
        arg0.field4685.field4684 = arg0;
        arg0.field4684.field4685 = arg0;
    }

    @ObfuscatedName("mq.v(Lpl;)V")
    public void method6082(class433 arg0) {
        if (arg0.field4685 != null) {
            arg0.method7230();
        }
        arg0.field4685 = this.field4331;
        arg0.field4684 = this.field4331.field4684;
        arg0.field4685.field4684 = arg0;
        arg0.field4684.field4685 = arg0;
    }

    @ObfuscatedName("mq.x(Lpl;Lpl;)V")
    public static void method6083(class433 arg0, class433 arg1) {
        if (arg0.field4685 != null) {
            arg0.method7230();
        }
        arg0.field4685 = arg1.field4685;
        arg0.field4684 = arg1;
        arg0.field4685.field4684 = arg0;
        arg0.field4684.field4685 = arg0;
    }

    @ObfuscatedName("mq.m()Lpl;")
    public class433 method6084() {
        class433 var1 = this.field4331.field4684;
        if (this.field4331 == var1) {
            return null;
        } else {
            var1.method7230();
            return var1;
        }
    }

    @ObfuscatedName("mq.q()Lpl;")
    public class433 method6107() {
        class433 var1 = this.field4331.field4685;
        if (this.field4331 == var1) {
            return null;
        } else {
            var1.method7230();
            return var1;
        }
    }

    @ObfuscatedName("mq.f()Lpl;")
    public class433 method6086() {
        class433 var1 = this.field4331.field4684;
        if (this.field4331 == var1) {
            this.field4330 = null;
            return null;
        } else {
            this.field4330 = var1.field4684;
            return var1;
        }
    }

    @ObfuscatedName("mq.r()Lpl;")
    public class433 method6087() {
        class433 var1 = this.field4331.field4685;
        if (this.field4331 == var1) {
            this.field4330 = null;
            return null;
        } else {
            this.field4330 = var1.field4685;
            return var1;
        }
    }

    @ObfuscatedName("mq.u()Lpl;")
    public class433 method6088() {
        class433 var1 = this.field4330;
        if (this.field4331 == var1) {
            this.field4330 = null;
            return null;
        } else {
            this.field4330 = var1.field4684;
            return var1;
        }
    }

    @ObfuscatedName("mq.b()Lpl;")
    public class433 method6099() {
        class433 var1 = this.field4330;
        if (this.field4331 == var1) {
            this.field4330 = null;
            return null;
        } else {
            this.field4330 = var1.field4685;
            return var1;
        }
    }
}
