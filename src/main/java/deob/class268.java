package deob;

@ObfuscatedName("je")
public class class268 extends class215 {

    @ObfuscatedName("je.p")
    public static class210 field3443 = new class210(64);

    @ObfuscatedName("je.a")
    public int field3446 = -1;

    @ObfuscatedName("je.h")
    public int[] field3447;

    @ObfuscatedName("je.l")
    public short[] field3448;

    @ObfuscatedName("je.y")
    public short[] field3449;

    @ObfuscatedName("je.g")
    public short[] field3450;

    @ObfuscatedName("je.c")
    public short[] field3451;

    @ObfuscatedName("je.u")
    public int[] field3452 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("je.r")
    public boolean field3453 = false;

    @ObfuscatedName("gn.b(II)Lje;")
    public static class268 method3448(int arg0) {
        class268 var1 = (class268) field3443.method3658((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3445.method4158(3, arg0);
        class268 var3 = new class268();
        if (var2 != null) {
            var3.method4414(new class194(var2));
        }
        field3443.method3659(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("je.q(Lgn;B)V")
    public void method4414(class194 arg0) {
        while (true) {
            int var2 = arg0.method3247();
            if (var2 == 0) {
                return;
            }
            this.method4425(arg0, var2);
        }
    }

    @ObfuscatedName("je.o(Lgn;II)V")
    public void method4425(class194 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3446 = arg0.method3247();
        } else if (arg1 == 2) {
            int var3 = arg0.method3247();
            this.field3447 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3447[var4] = arg0.method3249();
            }
        } else if (arg1 == 3) {
            this.field3453 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method3247();
            this.field3448 = new short[var5];
            this.field3449 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3448[var6] = (short) arg0.method3249();
                this.field3449[var6] = (short) arg0.method3249();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method3247();
            this.field3450 = new short[var7];
            this.field3451 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3450[var8] = (short) arg0.method3249();
                this.field3451[var8] = (short) arg0.method3249();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field3452[arg1 - 60] = arg0.method3249();
        }
    }

    @ObfuscatedName("je.p(B)Z")
    public boolean method4420() {
        if (this.field3447 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3447.length; var2++) {
            if (!Statics.field2168.method4221(this.field3447[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("je.a(I)Ldy;")
    public class125 method4433() {
        if (this.field3447 == null) {
            return null;
        }
        class125[] var1 = new class125[this.field3447.length];
        for (int var2 = 0; var2 < this.field3447.length; var2++) {
            var1[var2] = class125.method2389(Statics.field2168, this.field3447[var2], 0);
        }
        class125 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class125(var1, var1.length);
        }
        if (this.field3448 != null) {
            for (int var4 = 0; var4 < this.field3448.length; var4++) {
                var3.method2401(this.field3448[var4], this.field3449[var4]);
            }
        }
        if (this.field3450 != null) {
            for (int var5 = 0; var5 < this.field3450.length; var5++) {
                var3.method2402(this.field3450[var5], this.field3451[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("je.h(I)Z")
    public boolean method4430() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field3452[var2] != -1 && !Statics.field2168.method4221(this.field3452[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("je.l(I)Ldy;")
    public class125 method4418() {
        class125[] var1 = new class125[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field3452[var3] != -1) {
                var1[var2++] = class125.method2389(Statics.field2168, this.field3452[var3], 0);
            }
        }
        class125 var4 = new class125(var1, var2);
        if (this.field3448 != null) {
            for (int var5 = 0; var5 < this.field3448.length; var5++) {
                var4.method2401(this.field3448[var5], this.field3449[var5]);
            }
        }
        if (this.field3450 != null) {
            for (int var6 = 0; var6 < this.field3450.length; var6++) {
                var4.method2402(this.field3450[var6], this.field3451[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ec.y(S)V")
    public static void method2862() {
        field3443.method3661();
    }
}
