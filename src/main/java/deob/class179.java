package deob;

@ObfuscatedName("fc")
public class class179 {

    @ObfuscatedName("fc.i")
    public class181 field2834 = new class181();

    @ObfuscatedName("fc.b")
    public class181 field2835;

    public class179() {
        this.field2834.field2838 = this.field2834;
        this.field2834.field2840 = this.field2834;
    }

    @ObfuscatedName("fc.i()V")
    public void method3333() {
        while (true) {
            class181 var1 = this.field2834.field2838;
            if (this.field2834 == var1) {
                this.field2835 = null;
                return;
            }
            var1.method3363();
        }
    }

    @ObfuscatedName("fc.b(Lfx;)V")
    public void method3334(class181 arg0) {
        if (arg0.field2840 != null) {
            arg0.method3363();
        }
        arg0.field2840 = this.field2834.field2840;
        arg0.field2838 = this.field2834;
        arg0.field2840.field2838 = arg0;
        arg0.field2838.field2840 = arg0;
    }

    @ObfuscatedName("fc.r(Lfx;)V")
    public void method3335(class181 arg0) {
        if (arg0.field2840 != null) {
            arg0.method3363();
        }
        arg0.field2840 = this.field2834;
        arg0.field2838 = this.field2834.field2838;
        arg0.field2840.field2838 = arg0;
        arg0.field2838.field2840 = arg0;
    }

    @ObfuscatedName("fc.l(Lfx;Lfx;)V")
    public static void method3343(class181 arg0, class181 arg1) {
        if (arg0.field2840 != null) {
            arg0.method3363();
        }
        arg0.field2840 = arg1.field2840;
        arg0.field2838 = arg1;
        arg0.field2840.field2838 = arg0;
        arg0.field2838.field2840 = arg0;
    }

    @ObfuscatedName("fc.s()Lfx;")
    public class181 method3337() {
        class181 var1 = this.field2834.field2838;
        if (this.field2834 == var1) {
            return null;
        } else {
            var1.method3363();
            return var1;
        }
    }

    @ObfuscatedName("fc.d()Lfx;")
    public class181 method3338() {
        class181 var1 = this.field2834.field2840;
        if (this.field2834 == var1) {
            return null;
        } else {
            var1.method3363();
            return var1;
        }
    }

    @ObfuscatedName("fc.e()Lfx;")
    public class181 method3339() {
        class181 var1 = this.field2834.field2838;
        if (this.field2834 == var1) {
            this.field2835 = null;
            return null;
        } else {
            this.field2835 = var1.field2838;
            return var1;
        }
    }

    @ObfuscatedName("fc.u()Lfx;")
    public class181 method3340() {
        class181 var1 = this.field2834.field2840;
        if (this.field2834 == var1) {
            this.field2835 = null;
            return null;
        } else {
            this.field2835 = var1.field2840;
            return var1;
        }
    }

    @ObfuscatedName("fc.q()Lfx;")
    public class181 method3353() {
        class181 var1 = this.field2835;
        if (this.field2834 == var1) {
            this.field2835 = null;
            return null;
        } else {
            this.field2835 = var1.field2838;
            return var1;
        }
    }

    @ObfuscatedName("fc.o()Lfx;")
    public class181 method3342() {
        class181 var1 = this.field2835;
        if (this.field2834 == var1) {
            this.field2835 = null;
            return null;
        } else {
            this.field2835 = var1.field2840;
            return var1;
        }
    }
}
