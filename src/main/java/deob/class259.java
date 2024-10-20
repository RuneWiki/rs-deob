package deob;

@ObfuscatedName("ip")
public class class259 extends class206 {

    @ObfuscatedName("ip.k")
    public static class201 field3434 = new class201(64);

    @ObfuscatedName("ip.u")
    public int field3439 = -1;

    @ObfuscatedName("ip.z")
    public int[] field3442;

    @ObfuscatedName("ip.t")
    public short[] field3436;

    @ObfuscatedName("ip.f")
    public short[] field3438;

    @ObfuscatedName("ip.g")
    public short[] field3435;

    @ObfuscatedName("ip.j")
    public short[] field3440;

    @ObfuscatedName("ip.x")
    public int[] field3441 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("ip.c")
    public boolean field3432 = false;

    @ObfuscatedName("gw.a(IB)Lip;")
    public static class259 method3292(int arg0) {
        class259 var1 = (class259) field3434.method3373((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3437.method3897(3, arg0);
        class259 var3 = new class259();
        if (var2 != null) {
            var3.method4137(new class185(var2));
        }
        field3434.method3375(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ip.w(Lgh;I)V")
    public void method4137(class185 arg0) {
        while (true) {
            int var2 = arg0.method2962();
            if (var2 == 0) {
                return;
            }
            this.method4153(arg0, var2);
        }
    }

    @ObfuscatedName("ip.e(Lgh;II)V")
    public void method4153(class185 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3439 = arg0.method2962();
        } else if (arg1 == 2) {
            int var3 = arg0.method2962();
            this.field3442 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3442[var4] = arg0.method3194();
            }
        } else if (arg1 == 3) {
            this.field3432 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2962();
            this.field3436 = new short[var5];
            this.field3438 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3436[var6] = (short) arg0.method3194();
                this.field3438[var6] = (short) arg0.method3194();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2962();
            this.field3435 = new short[var7];
            this.field3440 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3435[var8] = (short) arg0.method3194();
                this.field3440[var8] = (short) arg0.method3194();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field3441[arg1 - 60] = arg0.method3194();
        }
    }

    @ObfuscatedName("ip.k(I)Z")
    public boolean method4139() {
        if (this.field3442 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3442.length; var2++) {
            if (!Statics.field3433.method3901(this.field3442[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ip.u(B)Ldm;")
    public class127 method4142() {
        if (this.field3442 == null) {
            return null;
        }
        class127[] var1 = new class127[this.field3442.length];
        for (int var2 = 0; var2 < this.field3442.length; var2++) {
            var1[var2] = class127.method2217(Statics.field3433, this.field3442[var2], 0);
        }
        class127 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class127(var1, var1.length);
        }
        if (this.field3436 != null) {
            for (int var4 = 0; var4 < this.field3436.length; var4++) {
                var3.method2216(this.field3436[var4], this.field3438[var4]);
            }
        }
        if (this.field3435 != null) {
            for (int var5 = 0; var5 < this.field3435.length; var5++) {
                var3.method2226(this.field3435[var5], this.field3440[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("ip.z(B)Z")
    public boolean method4141() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field3441[var2] != -1 && !Statics.field3433.method3901(this.field3441[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ip.t(I)Ldm;")
    public class127 method4138() {
        class127[] var1 = new class127[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field3441[var3] != -1) {
                var1[var2++] = class127.method2217(Statics.field3433, this.field3441[var3], 0);
            }
        }
        class127 var4 = new class127(var1, var2);
        if (this.field3436 != null) {
            for (int var5 = 0; var5 < this.field3436.length; var5++) {
                var4.method2216(this.field3436[var5], this.field3438[var5]);
            }
        }
        if (this.field3435 != null) {
            for (int var6 = 0; var6 < this.field3435.length; var6++) {
                var4.method2226(this.field3435[var6], this.field3440[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ik.f(S)V")
    public static void method4032() {
        field3434.method3370();
    }
}
