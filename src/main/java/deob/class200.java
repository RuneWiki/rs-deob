package deob;

@ObfuscatedName("gs")
public class class200 {

    @ObfuscatedName("gs.s")
    public class209 field3110 = new class209();

    @ObfuscatedName("gs.j")
    public class209 field3109;

    public class200() {
        this.field3110.field3125 = this.field3110;
        this.field3110.field3127 = this.field3110;
    }

    @ObfuscatedName("gs.s()V")
    public void method3547() {
        while (true) {
            class209 var1 = this.field3110.field3125;
            if (this.field3110 == var1) {
                this.field3109 = null;
                return;
            }
            var1.method3639();
        }
    }

    @ObfuscatedName("gs.j(Lhd;)V")
    public void method3548(class209 arg0) {
        if (arg0.field3127 != null) {
            arg0.method3639();
        }
        arg0.field3127 = this.field3110.field3127;
        arg0.field3125 = this.field3110;
        arg0.field3127.field3125 = arg0;
        arg0.field3125.field3127 = arg0;
    }

    @ObfuscatedName("gs.p(Lhd;)V")
    public void method3549(class209 arg0) {
        if (arg0.field3127 != null) {
            arg0.method3639();
        }
        arg0.field3127 = this.field3110;
        arg0.field3125 = this.field3110.field3125;
        arg0.field3127.field3125 = arg0;
        arg0.field3125.field3127 = arg0;
    }

    @ObfuscatedName("gs.x(Lhd;Lhd;)V")
    public static void method3550(class209 arg0, class209 arg1) {
        if (arg0.field3127 != null) {
            arg0.method3639();
        }
        arg0.field3127 = arg1.field3127;
        arg0.field3125 = arg1;
        arg0.field3127.field3125 = arg0;
        arg0.field3125.field3127 = arg0;
    }

    @ObfuscatedName("gs.d()Lhd;")
    public class209 method3551() {
        class209 var1 = this.field3110.field3125;
        if (this.field3110 == var1) {
            return null;
        } else {
            var1.method3639();
            return var1;
        }
    }

    @ObfuscatedName("gs.u()Lhd;")
    public class209 method3554() {
        class209 var1 = this.field3110.field3127;
        if (this.field3110 == var1) {
            return null;
        } else {
            var1.method3639();
            return var1;
        }
    }

    @ObfuscatedName("gs.o()Lhd;")
    public class209 method3553() {
        class209 var1 = this.field3110.field3125;
        if (this.field3110 == var1) {
            this.field3109 = null;
            return null;
        } else {
            this.field3109 = var1.field3125;
            return var1;
        }
    }

    @ObfuscatedName("gs.b()Lhd;")
    public class209 method3572() {
        class209 var1 = this.field3110.field3127;
        if (this.field3110 == var1) {
            this.field3109 = null;
            return null;
        } else {
            this.field3109 = var1.field3127;
            return var1;
        }
    }

    @ObfuscatedName("gs.k()Lhd;")
    public class209 method3558() {
        class209 var1 = this.field3109;
        if (this.field3110 == var1) {
            this.field3109 = null;
            return null;
        } else {
            this.field3109 = var1.field3125;
            return var1;
        }
    }

    @ObfuscatedName("gs.c()Lhd;")
    public class209 method3555() {
        class209 var1 = this.field3109;
        if (this.field3110 == var1) {
            this.field3109 = null;
            return null;
        } else {
            this.field3109 = var1.field3127;
            return var1;
        }
    }
}
