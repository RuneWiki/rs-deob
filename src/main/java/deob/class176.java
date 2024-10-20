package deob;

@ObfuscatedName("fh")
public class class176 {

    @ObfuscatedName("fh.u")
    public class178 field2803 = new class178();

    @ObfuscatedName("fh.k")
    public class178 field2802;

    public class176() {
        this.field2803.field2807 = this.field2803;
        this.field2803.field2806 = this.field2803;
    }

    @ObfuscatedName("fh.u()V")
    public void method3322() {
        while (true) {
            class178 var1 = this.field2803.field2807;
            if (this.field2803 == var1) {
                this.field2802 = null;
                return;
            }
            var1.method3357();
        }
    }

    @ObfuscatedName("fh.k(Lfv;)V")
    public void method3323(class178 arg0) {
        if (arg0.field2806 != null) {
            arg0.method3357();
        }
        arg0.field2806 = this.field2803.field2806;
        arg0.field2807 = this.field2803;
        arg0.field2806.field2807 = arg0;
        arg0.field2807.field2806 = arg0;
    }

    @ObfuscatedName("fh.x(Lfv;)V")
    public void method3324(class178 arg0) {
        if (arg0.field2806 != null) {
            arg0.method3357();
        }
        arg0.field2806 = this.field2803;
        arg0.field2807 = this.field2803.field2807;
        arg0.field2806.field2807 = arg0;
        arg0.field2807.field2806 = arg0;
    }

    @ObfuscatedName("fh.m(Lfv;Lfv;)V")
    public static void method3334(class178 arg0, class178 arg1) {
        if (arg0.field2806 != null) {
            arg0.method3357();
        }
        arg0.field2806 = arg1.field2806;
        arg0.field2807 = arg1;
        arg0.field2806.field2807 = arg0;
        arg0.field2807.field2806 = arg0;
    }

    @ObfuscatedName("fh.n()Lfv;")
    public class178 method3325() {
        class178 var1 = this.field2803.field2807;
        if (this.field2803 == var1) {
            return null;
        } else {
            var1.method3357();
            return var1;
        }
    }

    @ObfuscatedName("fh.q()Lfv;")
    public class178 method3327() {
        class178 var1 = this.field2803.field2806;
        if (this.field2803 == var1) {
            return null;
        } else {
            var1.method3357();
            return var1;
        }
    }

    @ObfuscatedName("fh.a()Lfv;")
    public class178 method3326() {
        class178 var1 = this.field2803.field2807;
        if (this.field2803 == var1) {
            this.field2802 = null;
            return null;
        } else {
            this.field2802 = var1.field2807;
            return var1;
        }
    }

    @ObfuscatedName("fh.g()Lfv;")
    public class178 method3354() {
        class178 var1 = this.field2803.field2806;
        if (this.field2803 == var1) {
            this.field2802 = null;
            return null;
        } else {
            this.field2802 = var1.field2806;
            return var1;
        }
    }

    @ObfuscatedName("fh.j()Lfv;")
    public class178 method3330() {
        class178 var1 = this.field2802;
        if (this.field2803 == var1) {
            this.field2802 = null;
            return null;
        } else {
            this.field2802 = var1.field2807;
            return var1;
        }
    }

    @ObfuscatedName("fh.l()Lfv;")
    public class178 method3331() {
        class178 var1 = this.field2802;
        if (this.field2803 == var1) {
            this.field2802 = null;
            return null;
        } else {
            this.field2802 = var1.field2806;
            return var1;
        }
    }
}
