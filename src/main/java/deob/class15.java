package deob;

@ObfuscatedName("fr")
public class class15 {

    @ObfuscatedName("fr.b")
    public class17 field209 = new class17();

    @ObfuscatedName("fr.h")
    public class17 field208;

    @ObfuscatedName("fr.b()V")
    public void method193() {
        while (true) {
            class17 var1 = this.field209.field214;
            if (this.field209 == var1) {
                this.field208 = null;
                return;
            }
            var1.method234();
        }
    }

    @ObfuscatedName("fr.w(Lft;Lft;)V")
    public static void method194(class17 arg0, class17 arg1) {
        if (arg0.field215 != null) {
            arg0.method234();
        }
        arg0.field215 = arg1.field215;
        arg0.field214 = arg1;
        arg0.field215.field214 = arg0;
        arg0.field214.field215 = arg0;
    }

    @ObfuscatedName("fr.t()Lft;")
    public class17 method197() {
        class17 var1 = this.field209.field214;
        if (this.field209 == var1) {
            return null;
        } else {
            var1.method234();
            return var1;
        }
    }

    @ObfuscatedName("fr.d()Lft;")
    public class17 method198() {
        class17 var1 = this.field209.field215;
        if (this.field209 == var1) {
            return null;
        } else {
            var1.method234();
            return var1;
        }
    }

    @ObfuscatedName("fr.f()Lft;")
    public class17 method200() {
        class17 var1 = this.field209.field215;
        if (this.field209 == var1) {
            this.field208 = null;
            return null;
        } else {
            this.field208 = var1.field215;
            return var1;
        }
    }

    @ObfuscatedName("fr.s()Lft;")
    public class17 method201() {
        class17 var1 = this.field208;
        if (this.field209 == var1) {
            this.field208 = null;
            return null;
        } else {
            this.field208 = var1.field214;
            return var1;
        }
    }

    @ObfuscatedName("fr.j()Lft;")
    public class17 method202() {
        class17 var1 = this.field208;
        if (this.field209 == var1) {
            this.field208 = null;
            return null;
        } else {
            this.field208 = var1.field215;
            return var1;
        }
    }

    @ObfuscatedName("fr.k(Lft;)V")
    public void method204(class17 arg0) {
        if (arg0.field215 != null) {
            arg0.method234();
        }
        arg0.field215 = this.field209;
        arg0.field214 = this.field209.field214;
        arg0.field215.field214 = arg0;
        arg0.field214.field215 = arg0;
    }

    @ObfuscatedName("fr.l()Lft;")
    public class17 method212() {
        class17 var1 = this.field209.field214;
        if (this.field209 == var1) {
            this.field208 = null;
            return null;
        } else {
            this.field208 = var1.field214;
            return var1;
        }
    }

    public class15() {
        this.field209.field214 = this.field209;
        this.field209.field215 = this.field209;
    }

    @ObfuscatedName("fr.h(Lft;)V")
    public void method219(class17 arg0) {
        if (arg0.field215 != null) {
            arg0.method234();
        }
        arg0.field215 = this.field209.field215;
        arg0.field214 = this.field209;
        arg0.field215.field214 = arg0;
        arg0.field214.field215 = arg0;
    }
}
