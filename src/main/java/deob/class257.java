package deob;

@ObfuscatedName("ig")
public class class257 extends class198 {

    @ObfuscatedName("ig.o")
    public static class193 field3420 = new class193(64);

    @ObfuscatedName("ig.x")
    public char field3415;

    @ObfuscatedName("ig.k")
    public char field3416;

    @ObfuscatedName("ig.f")
    public String field3413 = "null";

    @ObfuscatedName("ig.i")
    public int field3418;

    @ObfuscatedName("ig.j")
    public int field3417 = 0;

    @ObfuscatedName("ig.m")
    public int[] field3423;

    @ObfuscatedName("ig.u")
    public int[] field3414;

    @ObfuscatedName("ig.r")
    public String[] field3422;

    @ObfuscatedName("cw.w(Liq;I)V")
    public static void method1596(class239 arg0) {
        Statics.field3419 = arg0;
    }

    @ObfuscatedName("eh.o(II)Lig;")
    public static class257 method2615(int arg0) {
        class257 var1 = (class257) field3420.method3239((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3419.method3754(8, arg0);
        class257 var3 = new class257();
        if (var2 != null) {
            var3.method4088(new class177(var2));
        }
        field3420.method3241(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ig.x(Lfi;B)V")
    public void method4088(class177 arg0) {
        while (true) {
            int var2 = arg0.method2931();
            if (var2 == 0) {
                return;
            }
            this.method4087(arg0, var2);
        }
    }

    @ObfuscatedName("ig.k(Lfi;II)V")
    public void method4087(class177 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3415 = (char) arg0.method2931();
        } else if (arg1 == 2) {
            this.field3416 = (char) arg0.method2931();
        } else if (arg1 == 3) {
            this.field3413 = arg0.method2892();
        } else if (arg1 == 4) {
            this.field3418 = arg0.method2904();
        } else if (arg1 == 5) {
            this.field3417 = arg0.method2886();
            this.field3423 = new int[this.field3417];
            this.field3422 = new String[this.field3417];
            for (int var3 = 0; var3 < this.field3417; var3++) {
                this.field3423[var3] = arg0.method2904();
                this.field3422[var3] = arg0.method2892();
            }
        } else if (arg1 == 6) {
            this.field3417 = arg0.method2886();
            this.field3423 = new int[this.field3417];
            this.field3414 = new int[this.field3417];
            for (int var4 = 0; var4 < this.field3417; var4++) {
                this.field3423[var4] = arg0.method2904();
                this.field3414[var4] = arg0.method2904();
            }
        }
    }
}
