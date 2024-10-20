package deob;

@ObfuscatedName("ga")
public class class200 {

    @ObfuscatedName("ga.w")
    public class209 field3109 = new class209();

    @ObfuscatedName("ga.x")
    public class209 field3108;

    public class200() {
        this.field3109.field3125 = this.field3109;
        this.field3109.field3126 = this.field3109;
    }

    @ObfuscatedName("ga.w()V")
    public void method3582() {
        while (true) {
            class209 var1 = this.field3109.field3125;
            if (this.field3109 == var1) {
                this.field3108 = null;
                return;
            }
            var1.method3684();
        }
    }

    @ObfuscatedName("ga.x(Lhl;)V")
    public void method3583(class209 arg0) {
        if (arg0.field3126 != null) {
            arg0.method3684();
        }
        arg0.field3126 = this.field3109.field3126;
        arg0.field3125 = this.field3109;
        arg0.field3126.field3125 = arg0;
        arg0.field3125.field3126 = arg0;
    }

    @ObfuscatedName("ga.t(Lhl;)V")
    public void method3584(class209 arg0) {
        if (arg0.field3126 != null) {
            arg0.method3684();
        }
        arg0.field3126 = this.field3109;
        arg0.field3125 = this.field3109.field3125;
        arg0.field3126.field3125 = arg0;
        arg0.field3125.field3126 = arg0;
    }

    @ObfuscatedName("ga.p(Lhl;Lhl;)V")
    public static void method3608(class209 arg0, class209 arg1) {
        if (arg0.field3126 != null) {
            arg0.method3684();
        }
        arg0.field3126 = arg1.field3126;
        arg0.field3125 = arg1;
        arg0.field3126.field3125 = arg0;
        arg0.field3125.field3126 = arg0;
    }

    @ObfuscatedName("ga.e()Lhl;")
    public class209 method3586() {
        class209 var1 = this.field3109.field3125;
        if (this.field3109 == var1) {
            return null;
        } else {
            var1.method3684();
            return var1;
        }
    }

    @ObfuscatedName("ga.y()Lhl;")
    public class209 method3588() {
        class209 var1 = this.field3109.field3126;
        if (this.field3109 == var1) {
            return null;
        } else {
            var1.method3684();
            return var1;
        }
    }

    @ObfuscatedName("ga.m()Lhl;")
    public class209 method3585() {
        class209 var1 = this.field3109.field3125;
        if (this.field3109 == var1) {
            this.field3108 = null;
            return null;
        } else {
            this.field3108 = var1.field3125;
            return var1;
        }
    }

    @ObfuscatedName("ga.c()Lhl;")
    public class209 method3589() {
        class209 var1 = this.field3109.field3126;
        if (this.field3109 == var1) {
            this.field3108 = null;
            return null;
        } else {
            this.field3108 = var1.field3126;
            return var1;
        }
    }

    @ObfuscatedName("ga.v()Lhl;")
    public class209 method3590() {
        class209 var1 = this.field3108;
        if (this.field3109 == var1) {
            this.field3108 = null;
            return null;
        } else {
            this.field3108 = var1.field3125;
            return var1;
        }
    }

    @ObfuscatedName("ga.l()Lhl;")
    public class209 method3591() {
        class209 var1 = this.field3108;
        if (this.field3109 == var1) {
            this.field3108 = null;
            return null;
        } else {
            this.field3108 = var1.field3126;
            return var1;
        }
    }
}
