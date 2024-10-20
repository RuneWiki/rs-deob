package deob;

@ObfuscatedName("ab")
public class class42 extends class195 {

    @ObfuscatedName("ab.w")
    public static class184 field994 = new class184(64);

    @ObfuscatedName("ab.m")
    public int field995 = -1;

    @ObfuscatedName("ab.h")
    public int[] field996;

    @ObfuscatedName("ab.i")
    public short[] field1001;

    @ObfuscatedName("ab.r")
    public short[] field998;

    @ObfuscatedName("ab.l")
    public short[] field992;

    @ObfuscatedName("ab.f")
    public short[] field1000;

    @ObfuscatedName("ab.e")
    public int[] field991 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("ab.z")
    public boolean field1006 = false;

    @ObfuscatedName("cb.n(Lfd;Lfd;I)V")
    public static void method2070(class158 arg0, class158 arg1) {
        Statics.field1005 = arg0;
        Statics.field997 = arg1;
        Statics.field1004 = Statics.field1005.method2945(3);
    }

    @ObfuscatedName("bq.o(II)Lab;")
    public static class42 method1404(int arg0) {
        class42 var1 = (class42) field994.method3373((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1005.method2925(3, arg0);
        class42 var3 = new class42();
        if (var2 != null) {
            var3.method816(new class111(var2));
        }
        field994.method3372(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ab.a(Ldl;I)V")
    public void method816(class111 arg0) {
        while (true) {
            int var2 = arg0.method2234();
            if (var2 == 0) {
                return;
            }
            this.method818(arg0, var2);
        }
    }

    @ObfuscatedName("ab.w(Ldl;II)V")
    public void method818(class111 arg0, int arg1) {
        if (arg1 == 1) {
            this.field995 = arg0.method2234();
        } else if (arg1 == 2) {
            int var3 = arg0.method2234();
            this.field996 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field996[var4] = arg0.method2236();
            }
        } else if (arg1 == 3) {
            this.field1006 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2234();
            this.field1001 = new short[var5];
            this.field998 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1001[var6] = (short) arg0.method2236();
                this.field998[var6] = (short) arg0.method2236();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2234();
            this.field992 = new short[var7];
            this.field1000 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field992[var8] = (short) arg0.method2236();
                this.field1000[var8] = (short) arg0.method2236();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field991[arg1 - 60] = arg0.method2236();
        }
    }

    @ObfuscatedName("ab.m(I)Z")
    public boolean method836() {
        if (this.field996 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field996.length; var2++) {
            if (!Statics.field997.method2995(this.field996[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ab.h(B)Lcz;")
    public class95 method819() {
        if (this.field996 == null) {
            return null;
        }
        class95[] var1 = new class95[this.field996.length];
        for (int var2 = 0; var2 < this.field996.length; var2++) {
            var1[var2] = class95.method2050(Statics.field997, this.field996[var2], 0);
        }
        class95 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class95(var1, var1.length);
        }
        if (this.field1001 != null) {
            for (int var4 = 0; var4 < this.field1001.length; var4++) {
                var3.method1985(this.field1001[var4], this.field998[var4]);
            }
        }
        if (this.field992 != null) {
            for (int var5 = 0; var5 < this.field992.length; var5++) {
                var3.method1986(this.field992[var5], this.field1000[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("ab.i(B)Z")
    public boolean method820() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field991[var2] != -1 && !Statics.field997.method2995(this.field991[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ab.r(I)Lcz;")
    public class95 method821() {
        class95[] var1 = new class95[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field991[var3] != -1) {
                var1[var2++] = class95.method2050(Statics.field997, this.field991[var3], 0);
            }
        }
        class95 var4 = new class95(var1, var2);
        if (this.field1001 != null) {
            for (int var5 = 0; var5 < this.field1001.length; var5++) {
                var4.method1985(this.field1001[var5], this.field998[var5]);
            }
        }
        if (this.field992 != null) {
            for (int var6 = 0; var6 < this.field992.length; var6++) {
                var4.method1986(this.field992[var6], this.field1000[var6]);
            }
        }
        return var4;
    }
}
