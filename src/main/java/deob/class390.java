package deob;

@ObfuscatedName("on")
public class class390 {

    @ObfuscatedName("on.at")
    public class485 field4436 = new class485();

    @ObfuscatedName("on.ah")
    public class485 field4437;

    public class390() {
        this.field4436.field4850 = this.field4436;
        this.field4436.field4848 = this.field4436;
    }

    @ObfuscatedName("on.at()V")
    public void method6576() {
        while (true) {
            class485 var1 = this.field4436.field4850;
            if (this.field4436 == var1) {
                this.field4437 = null;
                return;
            }
            var1.method7828();
        }
    }

    @ObfuscatedName("on.ah(Lsh;)V")
    public void method6547(class485 arg0) {
        if (arg0.field4848 != null) {
            arg0.method7828();
        }
        arg0.field4848 = this.field4436.field4848;
        arg0.field4850 = this.field4436;
        arg0.field4848.field4850 = arg0;
        arg0.field4850.field4848 = arg0;
    }

    @ObfuscatedName("on.ar(Lsh;)V")
    public void method6575(class485 arg0) {
        if (arg0.field4848 != null) {
            arg0.method7828();
        }
        arg0.field4848 = this.field4436;
        arg0.field4850 = this.field4436.field4850;
        arg0.field4848.field4850 = arg0;
        arg0.field4850.field4848 = arg0;
    }

    @ObfuscatedName("on.ao(Lsh;Lsh;)V")
    public static void method6544(class485 arg0, class485 arg1) {
        if (arg0.field4848 != null) {
            arg0.method7828();
        }
        arg0.field4848 = arg1.field4848;
        arg0.field4850 = arg1;
        arg0.field4848.field4850 = arg0;
        arg0.field4850.field4848 = arg0;
    }

    @ObfuscatedName("on.ab()Lsh;")
    public class485 method6545() {
        class485 var1 = this.field4436.field4850;
        if (this.field4436 == var1) {
            return null;
        } else {
            var1.method7828();
            return var1;
        }
    }

    @ObfuscatedName("on.au()Lsh;")
    public class485 method6546() {
        class485 var1 = this.field4436.field4848;
        if (this.field4436 == var1) {
            return null;
        } else {
            var1.method7828();
            return var1;
        }
    }

    @ObfuscatedName("on.aa()Lsh;")
    public class485 method6579() {
        class485 var1 = this.field4436.field4850;
        if (this.field4436 == var1) {
            this.field4437 = null;
            return null;
        } else {
            this.field4437 = var1.field4850;
            return var1;
        }
    }

    @ObfuscatedName("on.ac()Lsh;")
    public class485 method6572() {
        class485 var1 = this.field4436.field4848;
        if (this.field4436 == var1) {
            this.field4437 = null;
            return null;
        } else {
            this.field4437 = var1.field4848;
            return var1;
        }
    }

    @ObfuscatedName("on.al()Lsh;")
    public class485 method6549() {
        class485 var1 = this.field4437;
        if (this.field4436 == var1) {
            this.field4437 = null;
            return null;
        } else {
            this.field4437 = var1.field4850;
            return var1;
        }
    }

    @ObfuscatedName("on.az()Lsh;")
    public class485 method6550() {
        class485 var1 = this.field4437;
        if (this.field4436 == var1) {
            this.field4437 = null;
            return null;
        } else {
            this.field4437 = var1.field4848;
            return var1;
        }
    }

    @ObfuscatedName("on.ap()Z")
    public boolean method6551() {
        return this.field4436.field4850 == this.field4436;
    }
}
