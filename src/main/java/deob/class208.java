package deob;

@ObfuscatedName("gn")
public class class208 {

    @ObfuscatedName("gn.y")
    public class207 field2474 = new class207();

    @ObfuscatedName("gn.c")
    public class207 field2473;

    public class208() {
        this.field2474.field2471 = this.field2474;
        this.field2474.field2472 = this.field2474;
    }

    @ObfuscatedName("gn.y()V")
    public void method3779() {
        while (true) {
            class207 var1 = this.field2474.field2471;
            if (this.field2474 == var1) {
                this.field2473 = null;
                return;
            }
            var1.method3766();
        }
    }

    @ObfuscatedName("gn.c(Lgp;)V")
    public void method3773(class207 arg0) {
        if (arg0.field2472 != null) {
            arg0.method3766();
        }
        arg0.field2472 = this.field2474.field2472;
        arg0.field2471 = this.field2474;
        arg0.field2472.field2471 = arg0;
        arg0.field2471.field2472 = arg0;
    }

    @ObfuscatedName("gn.n(Lgp;)V")
    public void method3774(class207 arg0) {
        if (arg0.field2472 != null) {
            arg0.method3766();
        }
        arg0.field2472 = this.field2474;
        arg0.field2471 = this.field2474.field2471;
        arg0.field2472.field2471 = arg0;
        arg0.field2471.field2472 = arg0;
    }

    @ObfuscatedName("gn.u(Lgp;Lgp;)V")
    public static void method3805(class207 arg0, class207 arg1) {
        if (arg0.field2472 != null) {
            arg0.method3766();
        }
        arg0.field2472 = arg1.field2472;
        arg0.field2471 = arg1;
        arg0.field2472.field2471 = arg0;
        arg0.field2471.field2472 = arg0;
    }

    @ObfuscatedName("gn.i()Lgp;")
    public class207 method3792() {
        class207 var1 = this.field2474.field2471;
        if (this.field2474 == var1) {
            return null;
        } else {
            var1.method3766();
            return var1;
        }
    }

    @ObfuscatedName("gn.p()Lgp;")
    public class207 method3777() {
        class207 var1 = this.field2474.field2472;
        if (this.field2474 == var1) {
            return null;
        } else {
            var1.method3766();
            return var1;
        }
    }

    @ObfuscatedName("gn.e()Lgp;")
    public class207 method3799() {
        class207 var1 = this.field2474.field2471;
        if (this.field2474 == var1) {
            this.field2473 = null;
            return null;
        } else {
            this.field2473 = var1.field2471;
            return var1;
        }
    }

    @ObfuscatedName("gn.s()Lgp;")
    public class207 method3788() {
        class207 var1 = this.field2474.field2472;
        if (this.field2474 == var1) {
            this.field2473 = null;
            return null;
        } else {
            this.field2473 = var1.field2472;
            return var1;
        }
    }

    @ObfuscatedName("gn.v()Lgp;")
    public class207 method3780() {
        class207 var1 = this.field2473;
        if (this.field2474 == var1) {
            this.field2473 = null;
            return null;
        } else {
            this.field2473 = var1.field2471;
            return var1;
        }
    }

    @ObfuscatedName("gn.k()Lgp;")
    public class207 method3781() {
        class207 var1 = this.field2473;
        if (this.field2474 == var1) {
            this.field2473 = null;
            return null;
        } else {
            this.field2473 = var1.field2472;
            return var1;
        }
    }
}
