package deob;

@ObfuscatedName("iy")
public class class257 extends class198 {

    @ObfuscatedName("iy.c")
    public static class193 field3413 = new class193(64);

    @ObfuscatedName("iy.f")
    public char field3414;

    @ObfuscatedName("iy.m")
    public char field3412;

    @ObfuscatedName("iy.h")
    public String field3416 = "null";

    @ObfuscatedName("iy.t")
    public int field3417;

    @ObfuscatedName("iy.p")
    public int field3418 = 0;

    @ObfuscatedName("iy.d")
    public int[] field3419;

    @ObfuscatedName("iy.n")
    public int[] field3420;

    @ObfuscatedName("iy.z")
    public String[] field3421;

    @ObfuscatedName("iy.s(Lfs;I)V")
    public void method4196(class177 arg0) {
        while (true) {
            int var2 = arg0.method2965();
            if (var2 == 0) {
                return;
            }
            this.method4194(arg0, var2);
        }
    }

    @ObfuscatedName("iy.c(Lfs;IB)V")
    public void method4194(class177 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3414 = (char) arg0.method2965();
        } else if (arg1 == 2) {
            this.field3412 = (char) arg0.method2965();
        } else if (arg1 == 3) {
            this.field3416 = arg0.method2973();
        } else if (arg1 == 4) {
            this.field3417 = arg0.method2970();
        } else if (arg1 == 5) {
            this.field3418 = arg0.method2967();
            this.field3419 = new int[this.field3418];
            this.field3421 = new String[this.field3418];
            for (int var3 = 0; var3 < this.field3418; var3++) {
                this.field3419[var3] = arg0.method2970();
                this.field3421[var3] = arg0.method2973();
            }
        } else if (arg1 == 6) {
            this.field3418 = arg0.method2967();
            this.field3419 = new int[this.field3418];
            this.field3420 = new int[this.field3418];
            for (int var4 = 0; var4 < this.field3418; var4++) {
                this.field3419[var4] = arg0.method2970();
                this.field3420[var4] = arg0.method2970();
            }
        }
    }
}
