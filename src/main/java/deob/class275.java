package deob;

@ObfuscatedName("je")
public class class275 extends class219 {

    @ObfuscatedName("je.r")
    public static class213 field3505 = new class213(64);

    @ObfuscatedName("je.e")
    public int field3506 = -1;

    @ObfuscatedName("je.y")
    public int[] field3507;

    @ObfuscatedName("je.k")
    public short[] field3512;

    @ObfuscatedName("je.s")
    public short[] field3513;

    @ObfuscatedName("je.p")
    public short[] field3510;

    @ObfuscatedName("je.x")
    public short[] field3514;

    @ObfuscatedName("je.m")
    public int[] field3504 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("je.h")
    public boolean field3503 = false;

    @ObfuscatedName("kv.d(IB)Lje;")
    public static class275 method5093(int arg0) {
        class275 var1 = (class275) field3505.method3707((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field14.method4273(3, arg0);
        class275 var3 = new class275();
        if (var2 != null) {
            var3.method4560(new class195(var2));
        }
        field3505.method3697(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("je.z(Lgy;I)V")
    public void method4560(class195 arg0) {
        while (true) {
            int var2 = arg0.method3330();
            if (var2 == 0) {
                return;
            }
            this.method4561(arg0, var2);
        }
    }

    @ObfuscatedName("je.n(Lgy;IB)V")
    public void method4561(class195 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3506 = arg0.method3330();
        } else if (arg1 == 2) {
            int var3 = arg0.method3330();
            this.field3507 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3507[var4] = arg0.method3269();
            }
        } else if (arg1 == 3) {
            this.field3503 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method3330();
            this.field3512 = new short[var5];
            this.field3513 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3512[var6] = (short) arg0.method3269();
                this.field3513[var6] = (short) arg0.method3269();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method3330();
            this.field3510 = new short[var7];
            this.field3514 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3510[var8] = (short) arg0.method3269();
                this.field3514[var8] = (short) arg0.method3269();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field3504[arg1 - 60] = arg0.method3269();
        }
    }

    @ObfuscatedName("je.r(B)Z")
    public boolean method4562() {
        if (this.field3507 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3507.length; var2++) {
            if (!Statics.field3511.method4275(this.field3507[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("je.e(I)Ldf;")
    public class126 method4559() {
        if (this.field3507 == null) {
            return null;
        }
        class126[] var1 = new class126[this.field3507.length];
        for (int var2 = 0; var2 < this.field3507.length; var2++) {
            var1[var2] = class126.method2428(Statics.field3511, this.field3507[var2], 0);
        }
        class126 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class126(var1, var1.length);
        }
        if (this.field3512 != null) {
            for (int var4 = 0; var4 < this.field3512.length; var4++) {
                var3.method2441(this.field3512[var4], this.field3513[var4]);
            }
        }
        if (this.field3510 != null) {
            for (int var5 = 0; var5 < this.field3510.length; var5++) {
                var3.method2442(this.field3510[var5], this.field3514[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("je.y(B)Z")
    public boolean method4571() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field3504[var2] != -1 && !Statics.field3511.method4275(this.field3504[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("je.k(I)Ldf;")
    public class126 method4564() {
        class126[] var1 = new class126[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field3504[var3] != -1) {
                var1[var2++] = class126.method2428(Statics.field3511, this.field3504[var3], 0);
            }
        }
        class126 var4 = new class126(var1, var2);
        if (this.field3512 != null) {
            for (int var5 = 0; var5 < this.field3512.length; var5++) {
                var4.method2441(this.field3512[var5], this.field3513[var5]);
            }
        }
        if (this.field3510 != null) {
            for (int var6 = 0; var6 < this.field3510.length; var6++) {
                var4.method2442(this.field3510[var6], this.field3514[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("hc.s(I)V")
    public static void method3891() {
        field3505.method3700();
    }
}
