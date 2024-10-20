package deob;

@ObfuscatedName("iz")
public class class252 extends class176 {

    @ObfuscatedName("iz.x")
    public static class146 field3290 = new class146(64);

    @ObfuscatedName("iz.t")
    public char field3289;

    @ObfuscatedName("iz.g")
    public char field3294;

    @ObfuscatedName("iz.l")
    public String field3296 = class225.field2900;

    @ObfuscatedName("iz.u")
    public int field3293;

    @ObfuscatedName("iz.j")
    public int field3295 = 0;

    @ObfuscatedName("iz.v")
    public int[] field3291;

    @ObfuscatedName("iz.d")
    public int[] field3297;

    @ObfuscatedName("iz.z")
    public String[] field3292;

    @ObfuscatedName("hg.c(II)Liz;")
    public static class252 method3820(int arg0) {
        class252 var1 = (class252) field3290.method3061((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3298.method3825(8, arg0);
        class252 var3 = new class252();
        if (var2 != null) {
            var3.method4214(new class300(var2));
        }
        field3290.method3062(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iz.x(Lkz;I)V")
    public void method4214(class300 arg0) {
        while (true) {
            int var2 = arg0.method5103();
            if (var2 == 0) {
                return;
            }
            this.method4213(arg0, var2);
        }
    }

    @ObfuscatedName("iz.t(Lkz;II)V")
    public void method4213(class300 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3289 = (char) arg0.method5103();
        } else if (arg1 == 2) {
            this.field3294 = (char) arg0.method5103();
        } else if (arg1 == 3) {
            this.field3296 = arg0.method5112();
        } else if (arg1 == 4) {
            this.field3293 = arg0.method5208();
        } else if (arg1 == 5) {
            this.field3295 = arg0.method5304();
            this.field3291 = new int[this.field3295];
            this.field3292 = new String[this.field3295];
            for (int var3 = 0; var3 < this.field3295; var3++) {
                this.field3291[var3] = arg0.method5208();
                this.field3292[var3] = arg0.method5112();
            }
        } else if (arg1 == 6) {
            this.field3295 = arg0.method5304();
            this.field3291 = new int[this.field3295];
            this.field3297 = new int[this.field3295];
            for (int var4 = 0; var4 < this.field3295; var4++) {
                this.field3291[var4] = arg0.method5208();
                this.field3297[var4] = arg0.method5208();
            }
        }
    }

    @ObfuscatedName("iz.g(I)I")
    public int method4215() {
        return this.field3295;
    }
}
