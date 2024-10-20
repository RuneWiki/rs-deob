package deob;

@ObfuscatedName("jw")
public class class263 {

    @ObfuscatedName("jw.c")
    public class181 field3531 = new class181();

    @ObfuscatedName("jw.t")
    public class181 field3532;

    public class263() {
        this.field3531.field2114 = this.field3531;
        this.field3531.field2113 = this.field3531;
    }

    @ObfuscatedName("jw.c()V")
    public void method4557() {
        while (true) {
            class181 var1 = this.field3531.field2114;
            if (this.field3531 == var1) {
                this.field3532 = null;
                return;
            }
            var1.method3351();
        }
    }

    @ObfuscatedName("jw.t(Lft;)V")
    public void method4545(class181 arg0) {
        if (arg0.field2113 != null) {
            arg0.method3351();
        }
        arg0.field2113 = this.field3531.field2113;
        arg0.field2114 = this.field3531;
        arg0.field2113.field2114 = arg0;
        arg0.field2114.field2113 = arg0;
    }

    @ObfuscatedName("jw.o(Lft;)V")
    public void method4565(class181 arg0) {
        if (arg0.field2113 != null) {
            arg0.method3351();
        }
        arg0.field2113 = this.field3531;
        arg0.field2114 = this.field3531.field2114;
        arg0.field2113.field2114 = arg0;
        arg0.field2114.field2113 = arg0;
    }

    @ObfuscatedName("jw.e(Lft;Lft;)V")
    public static void method4561(class181 arg0, class181 arg1) {
        if (arg0.field2113 != null) {
            arg0.method3351();
        }
        arg0.field2113 = arg1.field2113;
        arg0.field2114 = arg1;
        arg0.field2113.field2114 = arg0;
        arg0.field2114.field2113 = arg0;
    }

    @ObfuscatedName("jw.i()Lft;")
    public class181 method4548() {
        class181 var1 = this.field3531.field2114;
        if (this.field3531 == var1) {
            return null;
        } else {
            var1.method3351();
            return var1;
        }
    }

    @ObfuscatedName("jw.g()Lft;")
    public class181 method4549() {
        class181 var1 = this.field3531.field2113;
        if (this.field3531 == var1) {
            return null;
        } else {
            var1.method3351();
            return var1;
        }
    }

    @ObfuscatedName("jw.d()Lft;")
    public class181 method4543() {
        class181 var1 = this.field3531.field2114;
        if (this.field3531 == var1) {
            this.field3532 = null;
            return null;
        } else {
            this.field3532 = var1.field2114;
            return var1;
        }
    }

    @ObfuscatedName("jw.l()Lft;")
    public class181 method4551() {
        class181 var1 = this.field3531.field2113;
        if (this.field3531 == var1) {
            this.field3532 = null;
            return null;
        } else {
            this.field3532 = var1.field2113;
            return var1;
        }
    }

    @ObfuscatedName("jw.j()Lft;")
    public class181 method4564() {
        class181 var1 = this.field3532;
        if (this.field3531 == var1) {
            this.field3532 = null;
            return null;
        } else {
            this.field3532 = var1.field2114;
            return var1;
        }
    }

    @ObfuscatedName("jw.m()Lft;")
    public class181 method4553() {
        class181 var1 = this.field3532;
        if (this.field3531 == var1) {
            this.field3532 = null;
            return null;
        } else {
            this.field3532 = var1.field2113;
            return var1;
        }
    }
}
