package deob;

@ObfuscatedName("jp")
public class class267 extends class209 {

    @ObfuscatedName("jp.q")
    public static class203 field3366 = new class203(64);

    @ObfuscatedName("jp.m")
    public char field3372;

    @ObfuscatedName("jp.j")
    public int field3369;

    @ObfuscatedName("jp.g")
    public String field3370;

    @ObfuscatedName("jp.i")
    public boolean field3371 = true;

    @ObfuscatedName("ir.c(Lih;I)V")
    public static void method4184(class250 arg0) {
        Statics.field3368 = arg0;
    }

    @ObfuscatedName("by.q(IB)Ljp;")
    public static class267 method1682(int arg0) {
        class267 var1 = (class267) field3366.method3654((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3368.method4210(11, arg0);
        class267 var3 = new class267();
        if (var2 != null) {
            var3.method4566(new class185(var2));
        }
        var3.method4565();
        field3366.method3646(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jp.m(I)V")
    public void method4565() {
    }

    @ObfuscatedName("jp.j(Lgg;I)V")
    public void method4566(class185 arg0) {
        while (true) {
            int var2 = arg0.method3243();
            if (var2 == 0) {
                return;
            }
            this.method4579(arg0, var2);
        }
    }

    @ObfuscatedName("jp.g(Lgg;II)V")
    public void method4579(class185 arg0, int arg1) {
        if (arg1 == 1) {
            byte var3 = arg0.method3244();
            int var4 = var3 & 0xFF;
            if (var4 == 0) {
                throw new IllegalArgumentException("");
            }
            if (var4 >= 128 && var4 < 160) {
                char var5 = class304.field3756[var4 - 128];
                if (var5 == 0) {
                    var5 = '?';
                }
                var4 = var5;
            }
            char var6 = (char) var4;
            this.field3372 = var6;
        } else if (arg1 == 2) {
            this.field3369 = arg0.method3323();
        } else if (arg1 == 4) {
            this.field3371 = false;
        } else if (arg1 == 5) {
            this.field3370 = arg0.method3251();
        }
    }

    @ObfuscatedName("jp.i(I)Z")
    public boolean method4568() {
        return this.field3372 == 's';
    }

    @ObfuscatedName("ir.h(I)V")
    public static void method4190() {
        field3366.method3647();
    }
}
