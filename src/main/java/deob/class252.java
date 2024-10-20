package deob;

@ObfuscatedName("in")
public class class252 extends class176 {

    @ObfuscatedName("in.f")
    public static class146 field3317 = new class146(64);

    @ObfuscatedName("in.b")
    public char field3322;

    @ObfuscatedName("in.g")
    public char field3320;

    @ObfuscatedName("in.z")
    public String field3321 = class225.field2777;

    @ObfuscatedName("in.p")
    public int field3324;

    @ObfuscatedName("in.h")
    public int field3323 = 0;

    @ObfuscatedName("in.y")
    public int[] field3318;

    @ObfuscatedName("in.w")
    public int[] field3325;

    @ObfuscatedName("in.i")
    public String[] field3326;

    @ObfuscatedName("gx.u(Lhf;I)V")
    public static void method3355(class234 arg0) {
        Statics.field3319 = arg0;
    }

    @ObfuscatedName("gc.f(II)Lin;")
    public static class252 method3379(int arg0) {
        class252 var1 = (class252) field3317.method3076((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3319.method3928(8, arg0);
        class252 var3 = new class252();
        if (var2 != null) {
            var3.method4236(new class300(var2));
        }
        field3317.method3078(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("in.b(Lkg;I)V")
    public void method4236(class300 arg0) {
        while (true) {
            int var2 = arg0.method5138();
            if (var2 == 0) {
                return;
            }
            this.method4237(arg0, var2);
        }
    }

    @ObfuscatedName("in.g(Lkg;II)V")
    public void method4237(class300 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3322 = (char) arg0.method5138();
        } else if (arg1 == 2) {
            this.field3320 = (char) arg0.method5138();
        } else if (arg1 == 3) {
            this.field3321 = arg0.method5147();
        } else if (arg1 == 4) {
            this.field3324 = arg0.method5277();
        } else if (arg1 == 5) {
            this.field3323 = arg0.method5337();
            this.field3318 = new int[this.field3323];
            this.field3326 = new String[this.field3323];
            for (int var3 = 0; var3 < this.field3323; var3++) {
                this.field3318[var3] = arg0.method5277();
                this.field3326[var3] = arg0.method5147();
            }
        } else if (arg1 == 6) {
            this.field3323 = arg0.method5337();
            this.field3318 = new int[this.field3323];
            this.field3325 = new int[this.field3323];
            for (int var4 = 0; var4 < this.field3323; var4++) {
                this.field3318[var4] = arg0.method5277();
                this.field3325[var4] = arg0.method5277();
            }
        }
    }

    @ObfuscatedName("in.z(I)I")
    public int method4238() {
        return this.field3323;
    }
}
