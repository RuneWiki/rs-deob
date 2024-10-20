package deob;

@ObfuscatedName("jk")
public class class269 extends class209 {

    @ObfuscatedName("jk.c")
    public static class203 field3387 = new class203(64);

    @ObfuscatedName("jk.n")
    public char field3388;

    @ObfuscatedName("jk.u")
    public char field3389;

    @ObfuscatedName("jk.i")
    public String field3390 = class240.field2840;

    @ObfuscatedName("jk.r")
    public int field3395;

    @ObfuscatedName("jk.j")
    public int field3392 = 0;

    @ObfuscatedName("jk.p")
    public int[] field3393;

    @ObfuscatedName("jk.e")
    public int[] field3394;

    @ObfuscatedName("jk.s")
    public String[] field3386;

    @ObfuscatedName("bb.y(II)Ljk;")
    public static class269 method1596(int arg0) {
        class269 var1 = (class269) field3387.method3685((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3391.method4263(8, arg0);
        class269 var3 = new class269();
        if (var2 != null) {
            var3.method4642(new class185(var2));
        }
        field3387.method3687(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jk.c(Lge;I)V")
    public void method4642(class185 arg0) {
        while (true) {
            int var2 = arg0.method3299();
            if (var2 == 0) {
                return;
            }
            this.method4630(arg0, var2);
        }
    }

    @ObfuscatedName("jk.n(Lge;IB)V")
    public void method4630(class185 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3388 = (char) arg0.method3299();
        } else if (arg1 == 2) {
            this.field3389 = (char) arg0.method3299();
        } else if (arg1 == 3) {
            this.field3390 = arg0.method3277();
        } else if (arg1 == 4) {
            this.field3395 = arg0.method3374();
        } else if (arg1 == 5) {
            this.field3392 = arg0.method3280();
            this.field3393 = new int[this.field3392];
            this.field3386 = new String[this.field3392];
            for (int var3 = 0; var3 < this.field3392; var3++) {
                this.field3393[var3] = arg0.method3374();
                this.field3386[var3] = arg0.method3277();
            }
        } else if (arg1 == 6) {
            this.field3392 = arg0.method3280();
            this.field3393 = new int[this.field3392];
            this.field3394 = new int[this.field3392];
            for (int var4 = 0; var4 < this.field3392; var4++) {
                this.field3393[var4] = arg0.method3374();
                this.field3394[var4] = arg0.method3374();
            }
        }
    }

    @ObfuscatedName("jk.u(B)I")
    public int method4631() {
        return this.field3392;
    }
}
