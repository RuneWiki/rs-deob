package deob;

@ObfuscatedName("fy")
public class class177 {

    @ObfuscatedName("fy.x")
    public class179 field2810 = new class179();

    @ObfuscatedName("fy.p")
    public class179 field2811;

    public class177() {
        this.field2810.field2815 = this.field2810;
        this.field2810.field2814 = this.field2810;
    }

    @ObfuscatedName("fy.x()V")
    public void method3262() {
        while (true) {
            class179 var1 = this.field2810.field2815;
            if (this.field2810 == var1) {
                this.field2811 = null;
                return;
            }
            var1.method3301();
        }
    }

    @ObfuscatedName("fy.p(Lfz;)V")
    public void method3264(class179 arg0) {
        if (arg0.field2814 != null) {
            arg0.method3301();
        }
        arg0.field2814 = this.field2810.field2814;
        arg0.field2815 = this.field2810;
        arg0.field2814.field2815 = arg0;
        arg0.field2815.field2814 = arg0;
    }

    @ObfuscatedName("fy.k(Lfz;)V")
    public void method3268(class179 arg0) {
        if (arg0.field2814 != null) {
            arg0.method3301();
        }
        arg0.field2814 = this.field2810;
        arg0.field2815 = this.field2810.field2815;
        arg0.field2814.field2815 = arg0;
        arg0.field2815.field2814 = arg0;
    }

    @ObfuscatedName("fy.a(Lfz;Lfz;)V")
    public static void method3292(class179 arg0, class179 arg1) {
        if (arg0.field2814 != null) {
            arg0.method3301();
        }
        arg0.field2814 = arg1.field2814;
        arg0.field2815 = arg1;
        arg0.field2814.field2815 = arg0;
        arg0.field2815.field2814 = arg0;
    }

    @ObfuscatedName("fy.q()Lfz;")
    public class179 method3279() {
        class179 var1 = this.field2810.field2815;
        if (this.field2810 == var1) {
            return null;
        } else {
            var1.method3301();
            return var1;
        }
    }

    @ObfuscatedName("fy.j()Lfz;")
    public class179 method3267() {
        class179 var1 = this.field2810.field2814;
        if (this.field2810 == var1) {
            return null;
        } else {
            var1.method3301();
            return var1;
        }
    }

    @ObfuscatedName("fy.v()Lfz;")
    public class179 method3280() {
        class179 var1 = this.field2810.field2815;
        if (this.field2810 == var1) {
            this.field2811 = null;
            return null;
        } else {
            this.field2811 = var1.field2815;
            return var1;
        }
    }

    @ObfuscatedName("fy.w()Lfz;")
    public class179 method3274() {
        class179 var1 = this.field2810.field2814;
        if (this.field2810 == var1) {
            this.field2811 = null;
            return null;
        } else {
            this.field2811 = var1.field2814;
            return var1;
        }
    }

    @ObfuscatedName("fy.l()Lfz;")
    public class179 method3269() {
        class179 var1 = this.field2811;
        if (this.field2810 == var1) {
            this.field2811 = null;
            return null;
        } else {
            this.field2811 = var1.field2815;
            return var1;
        }
    }

    @ObfuscatedName("fy.s()Lfz;")
    public class179 method3266() {
        class179 var1 = this.field2811;
        if (this.field2810 == var1) {
            this.field2811 = null;
            return null;
        } else {
            this.field2811 = var1.field2814;
            return var1;
        }
    }
}
