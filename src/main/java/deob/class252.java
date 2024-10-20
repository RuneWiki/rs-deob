package deob;

@ObfuscatedName("ia")
public class class252 extends class176 {

    @ObfuscatedName("ia.n")
    public static class146 field3300 = new class146(64);

    @ObfuscatedName("ia.v")
    public char field3299;

    @ObfuscatedName("ia.u")
    public char field3298;

    @ObfuscatedName("ia.r")
    public String field3301 = class225.field2755;

    @ObfuscatedName("ia.p")
    public int field3297;

    @ObfuscatedName("ia.q")
    public int field3303 = 0;

    @ObfuscatedName("ia.m")
    public int[] field3304;

    @ObfuscatedName("ia.y")
    public int[] field3305;

    @ObfuscatedName("ia.i")
    public String[] field3302;

    @ObfuscatedName("et.z(II)Lia;")
    public static class252 method3067(int arg0) {
        class252 var1 = (class252) field3300.method2992((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3306.method3726(8, arg0);
        class252 var3 = new class252();
        if (var2 != null) {
            var3.method4099(new class300(var2));
        }
        field3300.method2994(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ia.n(Lkl;I)V")
    public void method4099(class300 arg0) {
        while (true) {
            int var2 = arg0.method4990();
            if (var2 == 0) {
                return;
            }
            this.method4100(arg0, var2);
        }
    }

    @ObfuscatedName("ia.v(Lkl;II)V")
    public void method4100(class300 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3299 = (char) arg0.method4990();
        } else if (arg1 == 2) {
            this.field3298 = (char) arg0.method4990();
        } else if (arg1 == 3) {
            this.field3301 = arg0.method4999();
        } else if (arg1 == 4) {
            this.field3297 = arg0.method5085();
        } else if (arg1 == 5) {
            this.field3303 = arg0.method4992();
            this.field3304 = new int[this.field3303];
            this.field3302 = new String[this.field3303];
            for (int var3 = 0; var3 < this.field3303; var3++) {
                this.field3304[var3] = arg0.method5085();
                this.field3302[var3] = arg0.method4999();
            }
        } else if (arg1 == 6) {
            this.field3303 = arg0.method4992();
            this.field3304 = new int[this.field3303];
            this.field3305 = new int[this.field3303];
            for (int var4 = 0; var4 < this.field3303; var4++) {
                this.field3304[var4] = arg0.method5085();
                this.field3305[var4] = arg0.method5085();
            }
        }
    }

    @ObfuscatedName("ia.u(I)I")
    public int method4098() {
        return this.field3303;
    }
}
