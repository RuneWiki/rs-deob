package deob;

@ObfuscatedName("fe")
public class class175 {

    @ObfuscatedName("fe.j")
    public class177 field2755 = new class177();

    @ObfuscatedName("fe.y")
    public class177 field2754;

    public class175() {
        this.field2755.field2759 = this.field2755;
        this.field2755.field2760 = this.field2755;
    }

    @ObfuscatedName("fe.j()V")
    public void method3255() {
        while (true) {
            class177 var1 = this.field2755.field2759;
            if (this.field2755 == var1) {
                this.field2754 = null;
                return;
            }
            var1.method3289();
        }
    }

    @ObfuscatedName("fe.y(Lfa;)V")
    public void method3283(class177 arg0) {
        if (arg0.field2760 != null) {
            arg0.method3289();
        }
        arg0.field2760 = this.field2755.field2760;
        arg0.field2759 = this.field2755;
        arg0.field2760.field2759 = arg0;
        arg0.field2759.field2760 = arg0;
    }

    @ObfuscatedName("fe.x(Lfa;)V")
    public void method3244(class177 arg0) {
        if (arg0.field2760 != null) {
            arg0.method3289();
        }
        arg0.field2760 = this.field2755;
        arg0.field2759 = this.field2755.field2759;
        arg0.field2760.field2759 = arg0;
        arg0.field2759.field2760 = arg0;
    }

    @ObfuscatedName("fe.z(Lfa;Lfa;)V")
    public static void method3250(class177 arg0, class177 arg1) {
        if (arg0.field2760 != null) {
            arg0.method3289();
        }
        arg0.field2760 = arg1.field2760;
        arg0.field2759 = arg1;
        arg0.field2760.field2759 = arg0;
        arg0.field2759.field2760 = arg0;
    }

    @ObfuscatedName("fe.c()Lfa;")
    public class177 method3246() {
        class177 var1 = this.field2755.field2759;
        if (this.field2755 == var1) {
            return null;
        } else {
            var1.method3289();
            return var1;
        }
    }

    @ObfuscatedName("fe.e()Lfa;")
    public class177 method3247() {
        class177 var1 = this.field2755.field2760;
        if (this.field2755 == var1) {
            return null;
        } else {
            var1.method3289();
            return var1;
        }
    }

    @ObfuscatedName("fe.s()Lfa;")
    public class177 method3279() {
        class177 var1 = this.field2755.field2759;
        if (this.field2755 == var1) {
            this.field2754 = null;
            return null;
        } else {
            this.field2754 = var1.field2759;
            return var1;
        }
    }

    @ObfuscatedName("fe.i()Lfa;")
    public class177 method3264() {
        class177 var1 = this.field2755.field2760;
        if (this.field2755 == var1) {
            this.field2754 = null;
            return null;
        } else {
            this.field2754 = var1.field2760;
            return var1;
        }
    }

    @ObfuscatedName("fe.g()Lfa;")
    public class177 method3249() {
        class177 var1 = this.field2754;
        if (this.field2755 == var1) {
            this.field2754 = null;
            return null;
        } else {
            this.field2754 = var1.field2759;
            return var1;
        }
    }

    @ObfuscatedName("fe.q()Lfa;")
    public class177 method3248() {
        class177 var1 = this.field2754;
        if (this.field2755 == var1) {
            this.field2754 = null;
            return null;
        } else {
            this.field2754 = var1.field2760;
            return var1;
        }
    }
}
