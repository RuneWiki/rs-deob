package deob;

@ObfuscatedName("gz")
public class class206 {

    @ObfuscatedName("gz.w")
    public class205 field2452 = new class205();

    @ObfuscatedName("gz.m")
    public class205 field2451;

    public class206() {
        this.field2452.field2448 = this.field2452;
        this.field2452.field2449 = this.field2452;
    }

    @ObfuscatedName("gz.w()V")
    public void method3789() {
        while (true) {
            class205 var1 = this.field2452.field2448;
            if (this.field2452 == var1) {
                this.field2451 = null;
                return;
            }
            var1.method3782();
        }
    }

    @ObfuscatedName("gz.m(Lgl;)V")
    public void method3810(class205 arg0) {
        if (arg0.field2449 != null) {
            arg0.method3782();
        }
        arg0.field2449 = this.field2452.field2449;
        arg0.field2448 = this.field2452;
        arg0.field2449.field2448 = arg0;
        arg0.field2448.field2449 = arg0;
    }

    @ObfuscatedName("gz.q(Lgl;)V")
    public void method3791(class205 arg0) {
        if (arg0.field2449 != null) {
            arg0.method3782();
        }
        arg0.field2449 = this.field2452;
        arg0.field2448 = this.field2452.field2448;
        arg0.field2449.field2448 = arg0;
        arg0.field2448.field2449 = arg0;
    }

    @ObfuscatedName("gz.x(Lgl;Lgl;)V")
    public static void method3816(class205 arg0, class205 arg1) {
        if (arg0.field2449 != null) {
            arg0.method3782();
        }
        arg0.field2449 = arg1.field2449;
        arg0.field2448 = arg1;
        arg0.field2449.field2448 = arg0;
        arg0.field2448.field2449 = arg0;
    }

    @ObfuscatedName("gz.j()Lgl;")
    public class205 method3793() {
        class205 var1 = this.field2452.field2448;
        if (this.field2452 == var1) {
            return null;
        } else {
            var1.method3782();
            return var1;
        }
    }

    @ObfuscatedName("gz.a()Lgl;")
    public class205 method3794() {
        class205 var1 = this.field2452.field2449;
        if (this.field2452 == var1) {
            return null;
        } else {
            var1.method3782();
            return var1;
        }
    }

    @ObfuscatedName("gz.l()Lgl;")
    public class205 method3797() {
        class205 var1 = this.field2452.field2448;
        if (this.field2452 == var1) {
            this.field2451 = null;
            return null;
        } else {
            this.field2451 = var1.field2448;
            return var1;
        }
    }

    @ObfuscatedName("gz.d()Lgl;")
    public class205 method3796() {
        class205 var1 = this.field2452.field2449;
        if (this.field2452 == var1) {
            this.field2451 = null;
            return null;
        } else {
            this.field2451 = var1.field2449;
            return var1;
        }
    }

    @ObfuscatedName("gz.s()Lgl;")
    public class205 method3788() {
        class205 var1 = this.field2451;
        if (this.field2452 == var1) {
            this.field2451 = null;
            return null;
        } else {
            this.field2451 = var1.field2448;
            return var1;
        }
    }

    @ObfuscatedName("gz.p()Lgl;")
    public class205 method3798() {
        class205 var1 = this.field2451;
        if (this.field2452 == var1) {
            this.field2451 = null;
            return null;
        } else {
            this.field2451 = var1.field2449;
            return var1;
        }
    }
}
