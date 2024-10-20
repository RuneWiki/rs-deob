package deob;

@ObfuscatedName("iw")
public class class253 extends class176 {

    @ObfuscatedName("iw.t")
    public static class146 field3315 = new class146(64);

    @ObfuscatedName("iw.o")
    public char field3312;

    @ObfuscatedName("iw.e")
    public char field3313;

    @ObfuscatedName("iw.i")
    public String field3314 = class225.field2775;

    @ObfuscatedName("iw.g")
    public int field3320;

    @ObfuscatedName("iw.d")
    public int field3319 = 0;

    @ObfuscatedName("iw.l")
    public int[] field3311;

    @ObfuscatedName("iw.j")
    public int[] field3318;

    @ObfuscatedName("iw.m")
    public String[] field3316;

    @ObfuscatedName("ea.c(II)Liw;")
    public static class253 method3077(int arg0) {
        class253 var1 = (class253) field3315.method3100((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field85.method3845(8, arg0);
        class253 var3 = new class253();
        if (var2 != null) {
            var3.method4229(new class301(var2));
        }
        field3315.method3102(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iw.t(Lkp;I)V")
    public void method4229(class301 arg0) {
        while (true) {
            int var2 = arg0.method5129();
            if (var2 == 0) {
                return;
            }
            this.method4243(arg0, var2);
        }
    }

    @ObfuscatedName("iw.o(Lkp;II)V")
    public void method4243(class301 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3312 = (char) arg0.method5129();
        } else if (arg1 == 2) {
            this.field3313 = (char) arg0.method5129();
        } else if (arg1 == 3) {
            this.field3314 = arg0.method5138();
        } else if (arg1 == 4) {
            this.field3320 = arg0.method5134();
        } else if (arg1 == 5) {
            this.field3319 = arg0.method5124();
            this.field3311 = new int[this.field3319];
            this.field3316 = new String[this.field3319];
            for (int var3 = 0; var3 < this.field3319; var3++) {
                this.field3311[var3] = arg0.method5134();
                this.field3316[var3] = arg0.method5138();
            }
        } else if (arg1 == 6) {
            this.field3319 = arg0.method5124();
            this.field3311 = new int[this.field3319];
            this.field3318 = new int[this.field3319];
            for (int var4 = 0; var4 < this.field3319; var4++) {
                this.field3311[var4] = arg0.method5134();
                this.field3318[var4] = arg0.method5134();
            }
        }
    }

    @ObfuscatedName("iw.e(I)I")
    public int method4236() {
        return this.field3319;
    }
}
