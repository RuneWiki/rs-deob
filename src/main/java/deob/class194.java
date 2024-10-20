package deob;

@ObfuscatedName("ge")
public class class194 {

    @ObfuscatedName("ge.c")
    public class193 field2440 = new class193();

    @ObfuscatedName("ge.o")
    public class193 field2441;

    public class194() {
        this.field2440.field2438 = this.field2440;
        this.field2440.field2439 = this.field2440;
    }

    @ObfuscatedName("ge.c()V")
    public void method3289() {
        while (true) {
            class193 var1 = this.field2440.field2438;
            if (this.field2440 == var1) {
                this.field2441 = null;
                return;
            }
            var1.method3287();
        }
    }

    @ObfuscatedName("ge.o(Lgh;)V")
    public void method3290(class193 arg0) {
        if (arg0.field2439 != null) {
            arg0.method3287();
        }
        arg0.field2439 = this.field2440.field2439;
        arg0.field2438 = this.field2440;
        arg0.field2439.field2438 = arg0;
        arg0.field2438.field2439 = arg0;
    }

    @ObfuscatedName("ge.i(Lgh;)V")
    public void method3292(class193 arg0) {
        if (arg0.field2439 != null) {
            arg0.method3287();
        }
        arg0.field2439 = this.field2440;
        arg0.field2438 = this.field2440.field2438;
        arg0.field2439.field2438 = arg0;
        arg0.field2438.field2439 = arg0;
    }

    @ObfuscatedName("ge.u(Lgh;Lgh;)V")
    public static void method3293(class193 arg0, class193 arg1) {
        if (arg0.field2439 != null) {
            arg0.method3287();
        }
        arg0.field2439 = arg1.field2439;
        arg0.field2438 = arg1;
        arg0.field2439.field2438 = arg0;
        arg0.field2438.field2439 = arg0;
    }

    @ObfuscatedName("ge.g()Lgh;")
    public class193 method3291() {
        class193 var1 = this.field2440.field2438;
        if (this.field2440 == var1) {
            return null;
        } else {
            var1.method3287();
            return var1;
        }
    }

    @ObfuscatedName("ge.m()Lgh;")
    public class193 method3295() {
        class193 var1 = this.field2440.field2439;
        if (this.field2440 == var1) {
            return null;
        } else {
            var1.method3287();
            return var1;
        }
    }

    @ObfuscatedName("ge.s()Lgh;")
    public class193 method3296() {
        class193 var1 = this.field2440.field2438;
        if (this.field2440 == var1) {
            this.field2441 = null;
            return null;
        } else {
            this.field2441 = var1.field2438;
            return var1;
        }
    }

    @ObfuscatedName("ge.x()Lgh;")
    public class193 method3297() {
        class193 var1 = this.field2440.field2439;
        if (this.field2440 == var1) {
            this.field2441 = null;
            return null;
        } else {
            this.field2441 = var1.field2439;
            return var1;
        }
    }

    @ObfuscatedName("ge.p()Lgh;")
    public class193 method3298() {
        class193 var1 = this.field2441;
        if (this.field2440 == var1) {
            this.field2441 = null;
            return null;
        } else {
            this.field2441 = var1.field2438;
            return var1;
        }
    }

    @ObfuscatedName("ge.k()Lgh;")
    public class193 method3304() {
        class193 var1 = this.field2441;
        if (this.field2440 == var1) {
            this.field2441 = null;
            return null;
        } else {
            this.field2441 = var1.field2439;
            return var1;
        }
    }
}
