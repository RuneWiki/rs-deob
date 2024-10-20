package deob;

@ObfuscatedName("hn")
public class class218 {

    @ObfuscatedName("hn.g")
    public class217 field2662 = new class217();

    @ObfuscatedName("hn.e")
    public class217 field2661;

    public class218() {
        this.field2662.field2659 = this.field2662;
        this.field2662.field2658 = this.field2662;
    }

    @ObfuscatedName("hn.g()V")
    public void method3811() {
        while (true) {
            class217 var1 = this.field2662.field2659;
            if (this.field2662 == var1) {
                this.field2661 = null;
                return;
            }
            var1.method3796();
        }
    }

    @ObfuscatedName("hn.e(Lht;)V")
    public void method3829(class217 arg0) {
        if (arg0.field2658 != null) {
            arg0.method3796();
        }
        arg0.field2658 = this.field2662.field2658;
        arg0.field2659 = this.field2662;
        arg0.field2658.field2659 = arg0;
        arg0.field2659.field2658 = arg0;
    }

    @ObfuscatedName("hn.b(Lht;)V")
    public void method3805(class217 arg0) {
        if (arg0.field2658 != null) {
            arg0.method3796();
        }
        arg0.field2658 = this.field2662;
        arg0.field2659 = this.field2662.field2659;
        arg0.field2658.field2659 = arg0;
        arg0.field2659.field2658 = arg0;
    }

    @ObfuscatedName("hn.z(Lht;Lht;)V")
    public static void method3806(class217 arg0, class217 arg1) {
        if (arg0.field2658 != null) {
            arg0.method3796();
        }
        arg0.field2658 = arg1.field2658;
        arg0.field2659 = arg1;
        arg0.field2658.field2659 = arg0;
        arg0.field2659.field2658 = arg0;
    }

    @ObfuscatedName("hn.n()Lht;")
    public class217 method3807() {
        class217 var1 = this.field2662.field2659;
        if (this.field2662 == var1) {
            return null;
        } else {
            var1.method3796();
            return var1;
        }
    }

    @ObfuscatedName("hn.l()Lht;")
    public class217 method3808() {
        class217 var1 = this.field2662.field2658;
        if (this.field2662 == var1) {
            return null;
        } else {
            var1.method3796();
            return var1;
        }
    }

    @ObfuscatedName("hn.s()Lht;")
    public class217 method3809() {
        class217 var1 = this.field2662.field2659;
        if (this.field2662 == var1) {
            this.field2661 = null;
            return null;
        } else {
            this.field2661 = var1.field2659;
            return var1;
        }
    }

    @ObfuscatedName("hn.y()Lht;")
    public class217 method3835() {
        class217 var1 = this.field2662.field2658;
        if (this.field2662 == var1) {
            this.field2661 = null;
            return null;
        } else {
            this.field2661 = var1.field2658;
            return var1;
        }
    }

    @ObfuscatedName("hn.c()Lht;")
    public class217 method3832() {
        class217 var1 = this.field2661;
        if (this.field2662 == var1) {
            this.field2661 = null;
            return null;
        } else {
            this.field2661 = var1.field2659;
            return var1;
        }
    }

    @ObfuscatedName("hn.o()Lht;")
    public class217 method3812() {
        class217 var1 = this.field2661;
        if (this.field2662 == var1) {
            this.field2661 = null;
            return null;
        } else {
            this.field2661 = var1.field2658;
            return var1;
        }
    }
}
