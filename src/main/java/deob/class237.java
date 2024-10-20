package deob;

@ObfuscatedName("jr")
public class class237 extends class502 {

    @ObfuscatedName("jr.au")
    public static class315 field2501 = new class315(64);

    @ObfuscatedName("jr.ax")
    public int field2499 = -1;

    @ObfuscatedName("jr.ao")
    public int[] field2500;

    @ObfuscatedName("jr.am")
    public short[] field2498;

    @ObfuscatedName("jr.ac")
    public short[] field2502;

    @ObfuscatedName("jr.ae")
    public short[] field2496;

    @ObfuscatedName("jr.ad")
    public short[] field2504;

    @ObfuscatedName("jr.aq")
    public int[] field2505 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("jr.al")
    public boolean field2506 = false;

    @ObfuscatedName("ay.ab(Lob;Lob;B)V")
    public static void method10(class389 arg0, class389 arg1) {
        Statics.field2503 = arg0;
        Statics.field2497 = arg1;
        Statics.field2336 = Statics.field2503.method6685(3);
    }

    @ObfuscatedName("gy.ay(II)Ljr;")
    public static class237 method3341(int arg0) {
        class237 var1 = (class237) field2501.method5586((long) arg0);
        if (var1 != null) {
            return var1;
        } else if (Statics.field2503 == null) {
            return null;
        } else {
            byte[] var2 = Statics.field2503.method6670(3, arg0);
            class237 var3 = new class237();
            if (var2 != null) {
                var3.method4431(new class549(var2));
            }
            field2501.method5589(var3, (long) arg0);
            return var3;
        }
    }

    @ObfuscatedName("jr.an(Lvg;I)V")
    public void method4431(class549 arg0) {
        while (true) {
            int var2 = arg0.method9025();
            if (var2 == 0) {
                return;
            }
            this.method4432(arg0, var2);
        }
    }

    @ObfuscatedName("jr.au(Lvg;II)V")
    public void method4432(class549 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2499 = arg0.method9025();
        } else if (arg1 == 2) {
            int var3 = arg0.method9025();
            this.field2500 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2500[var4] = arg0.method8968();
            }
        } else if (arg1 == 3) {
            this.field2506 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method9025();
            this.field2498 = new short[var5];
            this.field2502 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2498[var6] = (short) arg0.method8968();
                this.field2502[var6] = (short) arg0.method8968();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method9025();
            this.field2496 = new short[var7];
            this.field2504 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2496[var8] = (short) arg0.method8968();
                this.field2504[var8] = (short) arg0.method8968();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field2505[arg1 - 60] = arg0.method8968();
        }
    }

    @ObfuscatedName("jr.ax(III)Z")
    public boolean method4433(int arg0, int arg1) {
        if (arg1 == 1) {
            return this.field2499 == arg0 + 7;
        } else {
            return this.field2499 == arg0;
        }
    }

    @ObfuscatedName("jr.ao(I)Z")
    public boolean method4434() {
        if (this.field2500 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2500.length; var2++) {
            if (!Statics.field2497.method6656(this.field2500[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("jr.am(B)Lgm;")
    public class176 method4435() {
        if (this.field2500 == null) {
            return null;
        }
        class176[] var1 = new class176[this.field2500.length];
        for (int var2 = 0; var2 < this.field2500.length; var2++) {
            var1[var2] = class176.method3343(Statics.field2497, this.field2500[var2], 0);
        }
        class176 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class176(var1, var1.length);
        }
        if (this.field2498 != null) {
            for (int var4 = 0; var4 < this.field2498.length; var4++) {
                var3.method3350(this.field2498[var4], this.field2502[var4]);
            }
        }
        if (this.field2496 != null) {
            for (int var5 = 0; var5 < this.field2496.length; var5++) {
                var3.method3360(this.field2496[var5], this.field2504[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("jr.ac(I)Z")
    public boolean method4445() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field2505[var2] != -1 && !Statics.field2497.method6656(this.field2505[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("jr.ae(B)Lgm;")
    public class176 method4437() {
        class176[] var1 = new class176[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field2505[var3] != -1) {
                var1[var2++] = class176.method3343(Statics.field2497, this.field2505[var3], 0);
            }
        }
        class176 var4 = new class176(var1, var2);
        if (this.field2498 != null) {
            for (int var5 = 0; var5 < this.field2498.length; var5++) {
                var4.method3350(this.field2498[var5], this.field2502[var5]);
            }
        }
        if (this.field2496 != null) {
            for (int var6 = 0; var6 < this.field2496.length; var6++) {
                var4.method3360(this.field2496[var6], this.field2504[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ir.ad(I)V")
    public static void method4371() {
        field2501.method5588();
    }
}
