package deob;

@ObfuscatedName("gj")
public class class201 {

    @ObfuscatedName("gj.m")
    public class200 field2565 = new class200();

    @ObfuscatedName("gj.p")
    public class200 field2566;

    public class201() {
        this.field2565.field2562 = this.field2565;
        this.field2565.field2564 = this.field2565;
    }

    @ObfuscatedName("gj.m()V")
    public void method3506() {
        while (true) {
            class200 var1 = this.field2565.field2562;
            if (this.field2565 == var1) {
                this.field2566 = null;
                return;
            }
            var1.method3476();
        }
    }

    @ObfuscatedName("gj.p(Lgh;)V")
    public void method3480(class200 arg0) {
        if (arg0.field2564 != null) {
            arg0.method3476();
        }
        arg0.field2564 = this.field2565.field2564;
        arg0.field2562 = this.field2565;
        arg0.field2564.field2562 = arg0;
        arg0.field2562.field2564 = arg0;
    }

    @ObfuscatedName("gj.i(Lgh;)V")
    public void method3482(class200 arg0) {
        if (arg0.field2564 != null) {
            arg0.method3476();
        }
        arg0.field2564 = this.field2565;
        arg0.field2562 = this.field2565.field2562;
        arg0.field2564.field2562 = arg0;
        arg0.field2562.field2564 = arg0;
    }

    @ObfuscatedName("gj.j(Lgh;Lgh;)V")
    public static void method3483(class200 arg0, class200 arg1) {
        if (arg0.field2564 != null) {
            arg0.method3476();
        }
        arg0.field2564 = arg1.field2564;
        arg0.field2562 = arg1;
        arg0.field2564.field2562 = arg0;
        arg0.field2562.field2564 = arg0;
    }

    @ObfuscatedName("gj.v()Lgh;")
    public class200 method3499() {
        class200 var1 = this.field2565.field2562;
        if (this.field2565 == var1) {
            return null;
        } else {
            var1.method3476();
            return var1;
        }
    }

    @ObfuscatedName("gj.x()Lgh;")
    public class200 method3485() {
        class200 var1 = this.field2565.field2564;
        if (this.field2565 == var1) {
            return null;
        } else {
            var1.method3476();
            return var1;
        }
    }

    @ObfuscatedName("gj.e()Lgh;")
    public class200 method3486() {
        class200 var1 = this.field2565.field2562;
        if (this.field2565 == var1) {
            this.field2566 = null;
            return null;
        } else {
            this.field2566 = var1.field2562;
            return var1;
        }
    }

    @ObfuscatedName("gj.l()Lgh;")
    public class200 method3487() {
        class200 var1 = this.field2565.field2564;
        if (this.field2565 == var1) {
            this.field2566 = null;
            return null;
        } else {
            this.field2566 = var1.field2564;
            return var1;
        }
    }

    @ObfuscatedName("gj.b()Lgh;")
    public class200 method3507() {
        class200 var1 = this.field2566;
        if (this.field2565 == var1) {
            this.field2566 = null;
            return null;
        } else {
            this.field2566 = var1.field2562;
            return var1;
        }
    }

    @ObfuscatedName("gj.n()Lgh;")
    public class200 method3489() {
        class200 var1 = this.field2566;
        if (this.field2565 == var1) {
            this.field2566 = null;
            return null;
        } else {
            this.field2566 = var1.field2564;
            return var1;
        }
    }
}
