package deob;

@ObfuscatedName("ji")
public class class272 {

    @ObfuscatedName("ji.z")
    public class190 field3557 = new class190();

    @ObfuscatedName("ji.k")
    public class190 field3556;

    public class272() {
        this.field3557.field2155 = this.field3557;
        this.field3557.field2156 = this.field3557;
    }

    @ObfuscatedName("ji.z()V")
    public void method4627() {
        while (true) {
            class190 var1 = this.field3557.field2155;
            if (this.field3557 == var1) {
                this.field3556 = null;
                return;
            }
            var1.method3401();
        }
    }

    @ObfuscatedName("ji.k(Lgw;)V")
    public void method4616(class190 arg0) {
        if (arg0.field2156 != null) {
            arg0.method3401();
        }
        arg0.field2156 = this.field3557.field2156;
        arg0.field2155 = this.field3557;
        arg0.field2156.field2155 = arg0;
        arg0.field2155.field2156 = arg0;
    }

    @ObfuscatedName("ji.s(Lgw;)V")
    public void method4617(class190 arg0) {
        if (arg0.field2156 != null) {
            arg0.method3401();
        }
        arg0.field2156 = this.field3557;
        arg0.field2155 = this.field3557.field2155;
        arg0.field2156.field2155 = arg0;
        arg0.field2155.field2156 = arg0;
    }

    @ObfuscatedName("ji.t(Lgw;Lgw;)V")
    public static void method4618(class190 arg0, class190 arg1) {
        if (arg0.field2156 != null) {
            arg0.method3401();
        }
        arg0.field2156 = arg1.field2156;
        arg0.field2155 = arg1;
        arg0.field2156.field2155 = arg0;
        arg0.field2155.field2156 = arg0;
    }

    @ObfuscatedName("ji.i()Lgw;")
    public class190 method4619() {
        class190 var1 = this.field3557.field2155;
        if (this.field3557 == var1) {
            return null;
        } else {
            var1.method3401();
            return var1;
        }
    }

    @ObfuscatedName("ji.o()Lgw;")
    public class190 method4620() {
        class190 var1 = this.field3557.field2156;
        if (this.field3557 == var1) {
            return null;
        } else {
            var1.method3401();
            return var1;
        }
    }

    @ObfuscatedName("ji.x()Lgw;")
    public class190 method4621() {
        class190 var1 = this.field3557.field2155;
        if (this.field3557 == var1) {
            this.field3556 = null;
            return null;
        } else {
            this.field3556 = var1.field2155;
            return var1;
        }
    }

    @ObfuscatedName("ji.w()Lgw;")
    public class190 method4622() {
        class190 var1 = this.field3557.field2156;
        if (this.field3557 == var1) {
            this.field3556 = null;
            return null;
        } else {
            this.field3556 = var1.field2156;
            return var1;
        }
    }

    @ObfuscatedName("ji.g()Lgw;")
    public class190 method4641() {
        class190 var1 = this.field3556;
        if (this.field3557 == var1) {
            this.field3556 = null;
            return null;
        } else {
            this.field3556 = var1.field2155;
            return var1;
        }
    }

    @ObfuscatedName("ji.m()Lgw;")
    public class190 method4615() {
        class190 var1 = this.field3556;
        if (this.field3557 == var1) {
            this.field3556 = null;
            return null;
        } else {
            this.field3556 = var1.field2156;
            return var1;
        }
    }
}
