package deob;

@ObfuscatedName("fc")
public class class178 {

    @ObfuscatedName("fc.g")
    public class187 field2866 = new class187();

    @ObfuscatedName("fc.s")
    public class187 field2867;

    public class178() {
        this.field2866.field2883 = this.field2866;
        this.field2866.field2882 = this.field2866;
    }

    @ObfuscatedName("fc.g()V")
    public void method3183() {
        while (true) {
            class187 var1 = this.field2866.field2883;
            if (this.field2866 == var1) {
                this.field2867 = null;
                return;
            }
            var1.method3285();
        }
    }

    @ObfuscatedName("fc.s(Lgz;)V")
    public void method3184(class187 arg0) {
        if (arg0.field2882 != null) {
            arg0.method3285();
        }
        arg0.field2882 = this.field2866.field2882;
        arg0.field2883 = this.field2866;
        arg0.field2882.field2883 = arg0;
        arg0.field2883.field2882 = arg0;
    }

    @ObfuscatedName("fc.v(Lgz;)V")
    public void method3185(class187 arg0) {
        if (arg0.field2882 != null) {
            arg0.method3285();
        }
        arg0.field2882 = this.field2866;
        arg0.field2883 = this.field2866.field2883;
        arg0.field2882.field2883 = arg0;
        arg0.field2883.field2882 = arg0;
    }

    @ObfuscatedName("fc.o(Lgz;Lgz;)V")
    public static void method3198(class187 arg0, class187 arg1) {
        if (arg0.field2882 != null) {
            arg0.method3285();
        }
        arg0.field2882 = arg1.field2882;
        arg0.field2883 = arg1;
        arg0.field2882.field2883 = arg0;
        arg0.field2883.field2882 = arg0;
    }

    @ObfuscatedName("fc.k()Lgz;")
    public class187 method3187() {
        class187 var1 = this.field2866.field2883;
        if (this.field2866 == var1) {
            return null;
        } else {
            var1.method3285();
            return var1;
        }
    }

    @ObfuscatedName("fc.m()Lgz;")
    public class187 method3188() {
        class187 var1 = this.field2866.field2882;
        if (this.field2866 == var1) {
            return null;
        } else {
            var1.method3285();
            return var1;
        }
    }

    @ObfuscatedName("fc.i()Lgz;")
    public class187 method3189() {
        class187 var1 = this.field2866.field2883;
        if (this.field2866 == var1) {
            this.field2867 = null;
            return null;
        } else {
            this.field2867 = var1.field2883;
            return var1;
        }
    }

    @ObfuscatedName("fc.t()Lgz;")
    public class187 method3210() {
        class187 var1 = this.field2866.field2882;
        if (this.field2866 == var1) {
            this.field2867 = null;
            return null;
        } else {
            this.field2867 = var1.field2882;
            return var1;
        }
    }

    @ObfuscatedName("fc.l()Lgz;")
    public class187 method3182() {
        class187 var1 = this.field2867;
        if (this.field2866 == var1) {
            this.field2867 = null;
            return null;
        } else {
            this.field2867 = var1.field2883;
            return var1;
        }
    }

    @ObfuscatedName("fc.p()Lgz;")
    public class187 method3200() {
        class187 var1 = this.field2867;
        if (this.field2866 == var1) {
            this.field2867 = null;
            return null;
        } else {
            this.field2867 = var1.field2882;
            return var1;
        }
    }
}
