package deob;

@ObfuscatedName("jh")
public class class274 extends class215 {

    @ObfuscatedName("jh.q")
    public static class210 field3486 = new class210(64);

    @ObfuscatedName("jh.o")
    public char field3494;

    @ObfuscatedName("jh.p")
    public char field3488;

    @ObfuscatedName("jh.a")
    public String field3485 = "null";

    @ObfuscatedName("jh.h")
    public int field3487;

    @ObfuscatedName("jh.l")
    public int field3491 = 0;

    @ObfuscatedName("jh.y")
    public int[] field3492;

    @ObfuscatedName("jh.g")
    public int[] field3493;

    @ObfuscatedName("jh.c")
    public String[] field3495;

    @ObfuscatedName("cf.b(Lie;S)V")
    public static void method1916(class256 arg0) {
        Statics.field3490 = arg0;
    }

    @ObfuscatedName("ed.q(IB)Ljh;")
    public static class274 method2592(int arg0) {
        class274 var1 = (class274) field3486.method3658((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3490.method4158(8, arg0);
        class274 var3 = new class274();
        if (var2 != null) {
            var3.method4506(new class194(var2));
        }
        field3486.method3659(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jh.o(Lgn;I)V")
    public void method4506(class194 arg0) {
        while (true) {
            int var2 = arg0.method3247();
            if (var2 == 0) {
                return;
            }
            this.method4518(arg0, var2);
        }
    }

    @ObfuscatedName("jh.p(Lgn;II)V")
    public void method4518(class194 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3494 = (char) arg0.method3247();
        } else if (arg1 == 2) {
            this.field3488 = (char) arg0.method3247();
        } else if (arg1 == 3) {
            this.field3485 = arg0.method3256();
        } else if (arg1 == 4) {
            this.field3487 = arg0.method3261();
        } else if (arg1 == 5) {
            this.field3491 = arg0.method3249();
            this.field3492 = new int[this.field3491];
            this.field3495 = new String[this.field3491];
            for (int var3 = 0; var3 < this.field3491; var3++) {
                this.field3492[var3] = arg0.method3261();
                this.field3495[var3] = arg0.method3256();
            }
        } else if (arg1 == 6) {
            this.field3491 = arg0.method3249();
            this.field3492 = new int[this.field3491];
            this.field3493 = new int[this.field3491];
            for (int var4 = 0; var4 < this.field3491; var4++) {
                this.field3492[var4] = arg0.method3261();
                this.field3493[var4] = arg0.method3261();
            }
        }
    }

    @ObfuscatedName("jh.a(I)I")
    public int method4507() {
        return this.field3491;
    }
}
