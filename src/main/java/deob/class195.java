package deob;

@ObfuscatedName("gi")
public class class195 {

    @ObfuscatedName("gi.j")
    public class194 field2472 = new class194();

    @ObfuscatedName("gi.h")
    public class194 field2471;

    public class195() {
        this.field2472.field2470 = this.field2472;
        this.field2472.field2468 = this.field2472;
    }

    @ObfuscatedName("gi.j()V")
    public void method3334() {
        while (true) {
            class194 var1 = this.field2472.field2470;
            if (this.field2472 == var1) {
                this.field2471 = null;
                return;
            }
            var1.method3314();
        }
    }

    @ObfuscatedName("gi.h(Lga;)V")
    public void method3317(class194 arg0) {
        if (arg0.field2468 != null) {
            arg0.method3314();
        }
        arg0.field2468 = this.field2472.field2468;
        arg0.field2470 = this.field2472;
        arg0.field2468.field2470 = arg0;
        arg0.field2470.field2468 = arg0;
    }

    @ObfuscatedName("gi.f(Lga;)V")
    public void method3318(class194 arg0) {
        if (arg0.field2468 != null) {
            arg0.method3314();
        }
        arg0.field2468 = this.field2472;
        arg0.field2470 = this.field2472.field2470;
        arg0.field2468.field2470 = arg0;
        arg0.field2470.field2468 = arg0;
    }

    @ObfuscatedName("gi.p(Lga;Lga;)V")
    public static void method3319(class194 arg0, class194 arg1) {
        if (arg0.field2468 != null) {
            arg0.method3314();
        }
        arg0.field2468 = arg1.field2468;
        arg0.field2470 = arg1;
        arg0.field2468.field2470 = arg0;
        arg0.field2470.field2468 = arg0;
    }

    @ObfuscatedName("gi.x()Lga;")
    public class194 method3325() {
        class194 var1 = this.field2472.field2470;
        if (this.field2472 == var1) {
            return null;
        } else {
            var1.method3314();
            return var1;
        }
    }

    @ObfuscatedName("gi.g()Lga;")
    public class194 method3320() {
        class194 var1 = this.field2472.field2468;
        if (this.field2472 == var1) {
            return null;
        } else {
            var1.method3314();
            return var1;
        }
    }

    @ObfuscatedName("gi.c()Lga;")
    public class194 method3326() {
        class194 var1 = this.field2472.field2470;
        if (this.field2472 == var1) {
            this.field2471 = null;
            return null;
        } else {
            this.field2471 = var1.field2470;
            return var1;
        }
    }

    @ObfuscatedName("gi.l()Lga;")
    public class194 method3322() {
        class194 var1 = this.field2472.field2468;
        if (this.field2472 == var1) {
            this.field2471 = null;
            return null;
        } else {
            this.field2471 = var1.field2468;
            return var1;
        }
    }

    @ObfuscatedName("gi.w()Lga;")
    public class194 method3323() {
        class194 var1 = this.field2471;
        if (this.field2472 == var1) {
            this.field2471 = null;
            return null;
        } else {
            this.field2471 = var1.field2470;
            return var1;
        }
    }

    @ObfuscatedName("gi.b()Lga;")
    public class194 method3324() {
        class194 var1 = this.field2471;
        if (this.field2472 == var1) {
            this.field2471 = null;
            return null;
        } else {
            this.field2471 = var1.field2468;
            return var1;
        }
    }
}
