package deob;

@ObfuscatedName("fc")
public class class177 {

    @ObfuscatedName("fc.k")
    public class186 field2851 = new class186();

    @ObfuscatedName("fc.b")
    public class186 field2850;

    public class177() {
        this.field2851.field2866 = this.field2851;
        this.field2851.field2868 = this.field2851;
    }

    @ObfuscatedName("fc.k()V")
    public void method3245() {
        while (true) {
            class186 var1 = this.field2851.field2866;
            if (this.field2851 == var1) {
                this.field2850 = null;
                return;
            }
            var1.method3321();
        }
    }

    @ObfuscatedName("fc.b(Lgy;)V")
    public void method3223(class186 arg0) {
        if (arg0.field2868 != null) {
            arg0.method3321();
        }
        arg0.field2868 = this.field2851.field2868;
        arg0.field2866 = this.field2851;
        arg0.field2868.field2866 = arg0;
        arg0.field2866.field2868 = arg0;
    }

    @ObfuscatedName("fc.e(Lgy;)V")
    public void method3224(class186 arg0) {
        if (arg0.field2868 != null) {
            arg0.method3321();
        }
        arg0.field2868 = this.field2851;
        arg0.field2866 = this.field2851.field2866;
        arg0.field2868.field2866 = arg0;
        arg0.field2866.field2868 = arg0;
    }

    @ObfuscatedName("fc.i(Lgy;Lgy;)V")
    public static void method3225(class186 arg0, class186 arg1) {
        if (arg0.field2868 != null) {
            arg0.method3321();
        }
        arg0.field2868 = arg1.field2868;
        arg0.field2866 = arg1;
        arg0.field2868.field2866 = arg0;
        arg0.field2866.field2868 = arg0;
    }

    @ObfuscatedName("fc.t()Lgy;")
    public class186 method3226() {
        class186 var1 = this.field2851.field2866;
        if (this.field2851 == var1) {
            return null;
        } else {
            var1.method3321();
            return var1;
        }
    }

    @ObfuscatedName("fc.z()Lgy;")
    public class186 method3229() {
        class186 var1 = this.field2851.field2868;
        if (this.field2851 == var1) {
            return null;
        } else {
            var1.method3321();
            return var1;
        }
    }

    @ObfuscatedName("fc.g()Lgy;")
    public class186 method3228() {
        class186 var1 = this.field2851.field2866;
        if (this.field2851 == var1) {
            this.field2850 = null;
            return null;
        } else {
            this.field2850 = var1.field2866;
            return var1;
        }
    }

    @ObfuscatedName("fc.c()Lgy;")
    public class186 method3239() {
        class186 var1 = this.field2851.field2868;
        if (this.field2851 == var1) {
            this.field2850 = null;
            return null;
        } else {
            this.field2850 = var1.field2868;
            return var1;
        }
    }

    @ObfuscatedName("fc.o()Lgy;")
    public class186 method3254() {
        class186 var1 = this.field2850;
        if (this.field2851 == var1) {
            this.field2850 = null;
            return null;
        } else {
            this.field2850 = var1.field2866;
            return var1;
        }
    }

    @ObfuscatedName("fc.q()Lgy;")
    public class186 method3231() {
        class186 var1 = this.field2850;
        if (this.field2851 == var1) {
            this.field2850 = null;
            return null;
        } else {
            this.field2850 = var1.field2868;
            return var1;
        }
    }
}
