package deob;

@ObfuscatedName("fj")
public class class181 extends class428 {

    @ObfuscatedName("fj.x")
    public static class269 field1964 = new class269(64);

    @ObfuscatedName("fj.m")
    public int field1965 = -1;

    @ObfuscatedName("fj.q")
    public int[] field1966;

    @ObfuscatedName("fj.f")
    public short[] field1968;

    @ObfuscatedName("fj.r")
    public short[] field1962;

    @ObfuscatedName("fj.u")
    public short[] field1969;

    @ObfuscatedName("fj.b")
    public short[] field1970;

    @ObfuscatedName("fj.j")
    public int[] field1967 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("fj.g")
    public boolean field1972 = false;

    @ObfuscatedName("ou.h(II)Lfj;")
    public static class181 method6957(int arg0) {
        class181 var1 = (class181) field1964.method4917((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1963.method5909(3, arg0);
        class181 var3 = new class181();
        if (var2 != null) {
            var3.method3251(new class467(var2));
        }
        field1964.method4925(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("fj.e(Lqy;B)V")
    public void method3251(class467 arg0) {
        while (true) {
            int var2 = arg0.method7792();
            if (var2 == 0) {
                return;
            }
            this.method3245(arg0, var2);
        }
    }

    @ObfuscatedName("fj.v(Lqy;IB)V")
    public void method3245(class467 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1965 = arg0.method7792();
        } else if (arg1 == 2) {
            int var3 = arg0.method7792();
            this.field1966 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1966[var4] = arg0.method7794();
            }
        } else if (arg1 == 3) {
            this.field1972 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method7792();
            this.field1968 = new short[var5];
            this.field1962 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1968[var6] = (short) arg0.method7794();
                this.field1962[var6] = (short) arg0.method7794();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method7792();
            this.field1969 = new short[var7];
            this.field1970 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1969[var8] = (short) arg0.method7794();
                this.field1970[var8] = (short) arg0.method7794();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field1967[arg1 - 60] = arg0.method7794();
        }
    }

    @ObfuscatedName("fj.x(I)Z")
    public boolean method3264() {
        if (this.field1966 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field1966.length; var2++) {
            if (!Statics.field1971.method5901(this.field1966[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("fj.m(B)Lgi;")
    public class208 method3261() {
        if (this.field1966 == null) {
            return null;
        }
        class208[] var1 = new class208[this.field1966.length];
        for (int var2 = 0; var2 < this.field1966.length; var2++) {
            var1[var2] = class208.method3813(Statics.field1971, this.field1966[var2], 0);
        }
        class208 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class208(var1, var1.length);
        }
        if (this.field1968 != null) {
            for (int var4 = 0; var4 < this.field1968.length; var4++) {
                var3.method3828(this.field1968[var4], this.field1962[var4]);
            }
        }
        if (this.field1969 != null) {
            for (int var5 = 0; var5 < this.field1969.length; var5++) {
                var3.method3829(this.field1969[var5], this.field1970[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("fj.q(B)Z")
    public boolean method3248() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field1967[var2] != -1 && !Statics.field1971.method5901(this.field1967[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("fj.f(I)Lgi;")
    public class208 method3249() {
        class208[] var1 = new class208[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field1967[var3] != -1) {
                var1[var2++] = class208.method3813(Statics.field1971, this.field1967[var3], 0);
            }
        }
        class208 var4 = new class208(var1, var2);
        if (this.field1968 != null) {
            for (int var5 = 0; var5 < this.field1968.length; var5++) {
                var4.method3828(this.field1968[var5], this.field1962[var5]);
            }
        }
        if (this.field1969 != null) {
            for (int var6 = 0; var6 < this.field1969.length; var6++) {
                var4.method3829(this.field1969[var6], this.field1970[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("bl.r(I)V")
    public static void method1094() {
        field1964.method4918();
    }
}
