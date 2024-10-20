package deob;

@ObfuscatedName("aj")
public class class45 extends class204 {

    @ObfuscatedName("aj.s")
    public static class193 field1029 = new class193(64);

    @ObfuscatedName("aj.y")
    public int field1030 = -1;

    @ObfuscatedName("aj.e")
    public int[] field1031;

    @ObfuscatedName("aj.g")
    public short[] field1034;

    @ObfuscatedName("aj.m")
    public short[] field1026;

    @ObfuscatedName("aj.j")
    public short[] field1036;

    @ObfuscatedName("aj.n")
    public short[] field1035;

    @ObfuscatedName("aj.l")
    public int[] field1033 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("aj.h")
    public boolean field1037 = false;

    @ObfuscatedName("s.a(Lfz;Lfz;I)V")
    public static void method46(class167 arg0, class167 arg1) {
        Statics.field1032 = arg0;
        Statics.field1027 = arg1;
        Statics.field1028 = Statics.field1032.method3035(3);
    }

    @ObfuscatedName("ac.r(IB)Laj;")
    public static class45 method696(int arg0) {
        class45 var1 = (class45) field1029.method3507((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1032.method3025(3, arg0);
        class45 var3 = new class45();
        if (var2 != null) {
            var3.method904(new class119(var2));
        }
        field1029.method3509(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aj.f(Lds;I)V")
    public void method904(class119 arg0) {
        while (true) {
            int var2 = arg0.method2412();
            if (var2 == 0) {
                return;
            }
            this.method910(arg0, var2);
        }
    }

    @ObfuscatedName("aj.s(Lds;IB)V")
    public void method910(class119 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1030 = arg0.method2412();
        } else if (arg1 == 2) {
            int var3 = arg0.method2412();
            this.field1031 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1031[var4] = arg0.method2347();
            }
        } else if (arg1 == 3) {
            this.field1037 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2412();
            this.field1034 = new short[var5];
            this.field1026 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1034[var6] = (short) arg0.method2347();
                this.field1026[var6] = (short) arg0.method2347();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2412();
            this.field1036 = new short[var7];
            this.field1035 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1036[var8] = (short) arg0.method2347();
                this.field1035[var8] = (short) arg0.method2347();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field1033[arg1 - 60] = arg0.method2347();
        }
    }

    @ObfuscatedName("aj.y(B)Z")
    public boolean method905() {
        if (this.field1031 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field1031.length; var2++) {
            if (!Statics.field1027.method3027(this.field1031[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("aj.e(I)Lch;")
    public class100 method916() {
        if (this.field1031 == null) {
            return null;
        }
        class100[] var1 = new class100[this.field1031.length];
        for (int var2 = 0; var2 < this.field1031.length; var2++) {
            var1[var2] = class100.method2066(Statics.field1027, this.field1031[var2], 0);
        }
        class100 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class100(var1, var1.length);
        }
        if (this.field1034 != null) {
            for (int var4 = 0; var4 < this.field1034.length; var4++) {
                var3.method2101(this.field1034[var4], this.field1026[var4]);
            }
        }
        if (this.field1036 != null) {
            for (int var5 = 0; var5 < this.field1036.length; var5++) {
                var3.method2121(this.field1036[var5], this.field1035[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("aj.g(I)Z")
    public boolean method907() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field1033[var2] != -1 && !Statics.field1027.method3027(this.field1033[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("aj.m(I)Lch;")
    public class100 method930() {
        class100[] var1 = new class100[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field1033[var3] != -1) {
                var1[var2++] = class100.method2066(Statics.field1027, this.field1033[var3], 0);
            }
        }
        class100 var4 = new class100(var1, var2);
        if (this.field1034 != null) {
            for (int var5 = 0; var5 < this.field1034.length; var5++) {
                var4.method2101(this.field1034[var5], this.field1026[var5]);
            }
        }
        if (this.field1036 != null) {
            for (int var6 = 0; var6 < this.field1036.length; var6++) {
                var4.method2121(this.field1036[var6], this.field1035[var6]);
            }
        }
        return var4;
    }
}
