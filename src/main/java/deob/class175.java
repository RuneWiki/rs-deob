package deob;

@ObfuscatedName("fy")
public class class175 {

    @ObfuscatedName("fy.z")
    public class177 field2751 = new class177();

    @ObfuscatedName("fy.h")
    public class177 field2750;

    public class175() {
        this.field2751.field2754 = this.field2751;
        this.field2751.field2756 = this.field2751;
    }

    @ObfuscatedName("fy.z()V")
    public void method3302() {
        while (true) {
            class177 var1 = this.field2751.field2754;
            if (this.field2751 == var1) {
                this.field2750 = null;
                return;
            }
            var1.method3346();
        }
    }

    @ObfuscatedName("fy.h(Lfk;)V")
    public void method3303(class177 arg0) {
        if (arg0.field2756 != null) {
            arg0.method3346();
        }
        arg0.field2756 = this.field2751.field2756;
        arg0.field2754 = this.field2751;
        arg0.field2756.field2754 = arg0;
        arg0.field2754.field2756 = arg0;
    }

    @ObfuscatedName("fy.c(Lfk;)V")
    public void method3304(class177 arg0) {
        if (arg0.field2756 != null) {
            arg0.method3346();
        }
        arg0.field2756 = this.field2751;
        arg0.field2754 = this.field2751.field2754;
        arg0.field2756.field2754 = arg0;
        arg0.field2754.field2756 = arg0;
    }

    @ObfuscatedName("fy.p(Lfk;Lfk;)V")
    public static void method3305(class177 arg0, class177 arg1) {
        if (arg0.field2756 != null) {
            arg0.method3346();
        }
        arg0.field2756 = arg1.field2756;
        arg0.field2754 = arg1;
        arg0.field2756.field2754 = arg0;
        arg0.field2754.field2756 = arg0;
    }

    @ObfuscatedName("fy.i()Lfk;")
    public class177 method3330() {
        class177 var1 = this.field2751.field2754;
        if (this.field2751 == var1) {
            return null;
        } else {
            var1.method3346();
            return var1;
        }
    }

    @ObfuscatedName("fy.v()Lfk;")
    public class177 method3341() {
        class177 var1 = this.field2751.field2756;
        if (this.field2751 == var1) {
            return null;
        } else {
            var1.method3346();
            return var1;
        }
    }

    @ObfuscatedName("fy.l()Lfk;")
    public class177 method3317() {
        class177 var1 = this.field2751.field2754;
        if (this.field2751 == var1) {
            this.field2750 = null;
            return null;
        } else {
            this.field2750 = var1.field2754;
            return var1;
        }
    }

    @ObfuscatedName("fy.m()Lfk;")
    public class177 method3309() {
        class177 var1 = this.field2751.field2756;
        if (this.field2751 == var1) {
            this.field2750 = null;
            return null;
        } else {
            this.field2750 = var1.field2756;
            return var1;
        }
    }

    @ObfuscatedName("fy.g()Lfk;")
    public class177 method3310() {
        class177 var1 = this.field2750;
        if (this.field2751 == var1) {
            this.field2750 = null;
            return null;
        } else {
            this.field2750 = var1.field2754;
            return var1;
        }
    }

    @ObfuscatedName("fy.t()Lfk;")
    public class177 method3311() {
        class177 var1 = this.field2750;
        if (this.field2751 == var1) {
            this.field2750 = null;
            return null;
        } else {
            this.field2750 = var1.field2756;
            return var1;
        }
    }
}
