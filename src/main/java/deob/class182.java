package deob;

@ObfuscatedName("fs")
public class class182 {

    @ObfuscatedName("fs.b")
    public class191 field2889 = new class191();

    @ObfuscatedName("fs.e")
    public class191 field2888;

    public class182() {
        this.field2889.field2904 = this.field2889;
        this.field2889.field2906 = this.field2889;
    }

    @ObfuscatedName("fs.b()V")
    public void method3287() {
        while (true) {
            class191 var1 = this.field2889.field2904;
            if (this.field2889 == var1) {
                this.field2888 = null;
                return;
            }
            var1.method3392();
        }
    }

    @ObfuscatedName("fs.e(Lgx;)V")
    public void method3302(class191 arg0) {
        if (arg0.field2906 != null) {
            arg0.method3392();
        }
        arg0.field2906 = this.field2889.field2906;
        arg0.field2904 = this.field2889;
        arg0.field2906.field2904 = arg0;
        arg0.field2904.field2906 = arg0;
    }

    @ObfuscatedName("fs.i(Lgx;)V")
    public void method3289(class191 arg0) {
        if (arg0.field2906 != null) {
            arg0.method3392();
        }
        arg0.field2906 = this.field2889;
        arg0.field2904 = this.field2889.field2904;
        arg0.field2906.field2904 = arg0;
        arg0.field2904.field2906 = arg0;
    }

    @ObfuscatedName("fs.k(Lgx;Lgx;)V")
    public static void method3290(class191 arg0, class191 arg1) {
        if (arg0.field2906 != null) {
            arg0.method3392();
        }
        arg0.field2906 = arg1.field2906;
        arg0.field2904 = arg1;
        arg0.field2906.field2904 = arg0;
        arg0.field2904.field2906 = arg0;
    }

    @ObfuscatedName("fs.h()Lgx;")
    public class191 method3291() {
        class191 var1 = this.field2889.field2904;
        if (this.field2889 == var1) {
            return null;
        } else {
            var1.method3392();
            return var1;
        }
    }

    @ObfuscatedName("fs.p()Lgx;")
    public class191 method3314() {
        class191 var1 = this.field2889.field2906;
        if (this.field2889 == var1) {
            return null;
        } else {
            var1.method3392();
            return var1;
        }
    }

    @ObfuscatedName("fs.n()Lgx;")
    public class191 method3293() {
        class191 var1 = this.field2889.field2904;
        if (this.field2889 == var1) {
            this.field2888 = null;
            return null;
        } else {
            this.field2888 = var1.field2904;
            return var1;
        }
    }

    @ObfuscatedName("fs.o()Lgx;")
    public class191 method3294() {
        class191 var1 = this.field2889.field2906;
        if (this.field2889 == var1) {
            this.field2888 = null;
            return null;
        } else {
            this.field2888 = var1.field2906;
            return var1;
        }
    }

    @ObfuscatedName("fs.g()Lgx;")
    public class191 method3288() {
        class191 var1 = this.field2888;
        if (this.field2889 == var1) {
            this.field2888 = null;
            return null;
        } else {
            this.field2888 = var1.field2904;
            return var1;
        }
    }

    @ObfuscatedName("fs.z()Lgx;")
    public class191 method3296() {
        class191 var1 = this.field2888;
        if (this.field2889 == var1) {
            this.field2888 = null;
            return null;
        } else {
            this.field2888 = var1.field2906;
            return var1;
        }
    }
}
