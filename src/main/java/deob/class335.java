package deob;

@ObfuscatedName("lv")
public class class335 {

    @ObfuscatedName("lv.o")
    public class411 field4142 = new class411();

    @ObfuscatedName("lv.q")
    public class411 field4143;

    public class335() {
        this.field4142.field4467 = this.field4142;
        this.field4142.field4466 = this.field4142;
    }

    @ObfuscatedName("lv.o()V")
    public void method5412() {
        while (true) {
            class411 var1 = this.field4142.field4467;
            if (this.field4142 == var1) {
                this.field4143 = null;
                return;
            }
            var1.method6399();
        }
    }

    @ObfuscatedName("lv.q(Los;)V")
    public void method5413(class411 arg0) {
        if (arg0.field4466 != null) {
            arg0.method6399();
        }
        arg0.field4466 = this.field4142.field4466;
        arg0.field4467 = this.field4142;
        arg0.field4466.field4467 = arg0;
        arg0.field4467.field4466 = arg0;
    }

    @ObfuscatedName("lv.l(Los;)V")
    public void method5414(class411 arg0) {
        if (arg0.field4466 != null) {
            arg0.method6399();
        }
        arg0.field4466 = this.field4142;
        arg0.field4467 = this.field4142.field4467;
        arg0.field4466.field4467 = arg0;
        arg0.field4467.field4466 = arg0;
    }

    @ObfuscatedName("lv.k(Los;Los;)V")
    public static void method5415(class411 arg0, class411 arg1) {
        if (arg0.field4466 != null) {
            arg0.method6399();
        }
        arg0.field4466 = arg1.field4466;
        arg0.field4467 = arg1;
        arg0.field4466.field4467 = arg0;
        arg0.field4467.field4466 = arg0;
    }

    @ObfuscatedName("lv.a()Los;")
    public class411 method5416() {
        class411 var1 = this.field4142.field4467;
        if (this.field4142 == var1) {
            return null;
        } else {
            var1.method6399();
            return var1;
        }
    }

    @ObfuscatedName("lv.m()Los;")
    public class411 method5425() {
        class411 var1 = this.field4142.field4466;
        if (this.field4142 == var1) {
            return null;
        } else {
            var1.method6399();
            return var1;
        }
    }

    @ObfuscatedName("lv.p()Los;")
    public class411 method5431() {
        class411 var1 = this.field4142.field4467;
        if (this.field4142 == var1) {
            this.field4143 = null;
            return null;
        } else {
            this.field4143 = var1.field4467;
            return var1;
        }
    }

    @ObfuscatedName("lv.s()Los;")
    public class411 method5418() {
        class411 var1 = this.field4142.field4466;
        if (this.field4142 == var1) {
            this.field4143 = null;
            return null;
        } else {
            this.field4143 = var1.field4466;
            return var1;
        }
    }

    @ObfuscatedName("lv.r()Los;")
    public class411 method5419() {
        class411 var1 = this.field4143;
        if (this.field4142 == var1) {
            this.field4143 = null;
            return null;
        } else {
            this.field4143 = var1.field4467;
            return var1;
        }
    }

    @ObfuscatedName("lv.v()Los;")
    public class411 method5420() {
        class411 var1 = this.field4143;
        if (this.field4142 == var1) {
            this.field4143 = null;
            return null;
        } else {
            this.field4143 = var1.field4466;
            return var1;
        }
    }
}
