package deob;

@ObfuscatedName("is")
public class class251 extends class176 {

    @ObfuscatedName("is.t")
    public static class146 field3299 = new class146(64);

    @ObfuscatedName("is.o")
    public char field3298;

    @ObfuscatedName("is.e")
    public int field3301;

    @ObfuscatedName("is.i")
    public String field3300;

    @ObfuscatedName("is.g")
    public boolean field3304 = true;

    @ObfuscatedName("gs.c(II)Lis;")
    public static class251 method3375(int arg0) {
        class251 var1 = (class251) field3299.method3100((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3303.method3845(11, arg0);
        class251 var3 = new class251();
        if (var2 != null) {
            var3.method4183(new class301(var2));
        }
        var3.method4182();
        field3299.method3102(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("is.t(I)V")
    public void method4182() {
    }

    @ObfuscatedName("is.o(Lkp;B)V")
    public void method4183(class301 arg0) {
        while (true) {
            int var2 = arg0.method5129();
            if (var2 == 0) {
                return;
            }
            this.method4184(arg0, var2);
        }
    }

    @ObfuscatedName("is.e(Lkp;II)V")
    public void method4184(class301 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3298 = class289.method3827(arg0.method5130());
        } else if (arg1 == 2) {
            this.field3301 = arg0.method5134();
        } else if (arg1 == 4) {
            this.field3304 = false;
        } else if (arg1 == 5) {
            this.field3300 = arg0.method5138();
        }
    }

    @ObfuscatedName("is.i(I)Z")
    public boolean method4185() {
        return this.field3298 == 's';
    }

    @ObfuscatedName("hl.g(I)V")
    public static void method3719() {
        field3299.method3103();
    }
}
