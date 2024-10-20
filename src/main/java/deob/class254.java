package deob;

@ObfuscatedName("iy")
public class class254 extends class195 {

    @ObfuscatedName("iy.p")
    public static class190 field3413 = new class190(64);

    @ObfuscatedName("iy.i")
    public char field3407;

    @ObfuscatedName("iy.j")
    public char field3408;

    @ObfuscatedName("iy.f")
    public String field3409 = "null";

    @ObfuscatedName("iy.m")
    public int field3406;

    @ObfuscatedName("iy.c")
    public int field3405 = 0;

    @ObfuscatedName("iy.z")
    public int[] field3412;

    @ObfuscatedName("iy.h")
    public int[] field3416;

    @ObfuscatedName("iy.g")
    public String[] field3414;

    @ObfuscatedName("hc.n(Lis;I)V")
    public static void method3805(class236 arg0) {
        Statics.field3411 = arg0;
    }

    @ObfuscatedName("y.p(II)Liy;")
    public static class254 method92(int arg0) {
        class254 var1 = (class254) field3413.method3280((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3411.method3880(8, arg0);
        class254 var3 = new class254();
        if (var2 != null) {
            var3.method4179(new class174(var2));
        }
        field3413.method3282(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iy.i(Lfl;B)V")
    public void method4179(class174 arg0) {
        while (true) {
            int var2 = arg0.method2925();
            if (var2 == 0) {
                return;
            }
            this.method4180(arg0, var2);
        }
    }

    @ObfuscatedName("iy.j(Lfl;II)V")
    public void method4180(class174 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3407 = (char) arg0.method2925();
        } else if (arg1 == 2) {
            this.field3408 = (char) arg0.method2925();
        } else if (arg1 == 3) {
            this.field3409 = arg0.method3098();
        } else if (arg1 == 4) {
            this.field3406 = arg0.method3058();
        } else if (arg1 == 5) {
            this.field3405 = arg0.method3065();
            this.field3412 = new int[this.field3405];
            this.field3414 = new String[this.field3405];
            for (int var3 = 0; var3 < this.field3405; var3++) {
                this.field3412[var3] = arg0.method3058();
                this.field3414[var3] = arg0.method3098();
            }
        } else if (arg1 == 6) {
            this.field3405 = arg0.method3065();
            this.field3412 = new int[this.field3405];
            this.field3416 = new int[this.field3405];
            for (int var4 = 0; var4 < this.field3405; var4++) {
                this.field3412[var4] = arg0.method3058();
                this.field3416[var4] = arg0.method3058();
            }
        }
    }
}
