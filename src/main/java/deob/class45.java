package deob;

@ObfuscatedName("aa")
public class class45 extends class205 {

    @ObfuscatedName("aa.h")
    public static class194 field1027 = new class194(64);

    @ObfuscatedName("aa.z")
    public int field1028 = -1;

    @ObfuscatedName("aa.r")
    public int[] field1029;

    @ObfuscatedName("aa.f")
    public short[] field1030;

    @ObfuscatedName("aa.s")
    public short[] field1037;

    @ObfuscatedName("aa.d")
    public short[] field1042;

    @ObfuscatedName("aa.l")
    public short[] field1033;

    @ObfuscatedName("aa.y")
    public int[] field1034 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("aa.p")
    public boolean field1035 = false;

    @ObfuscatedName("cp.t(IB)Laa;")
    public static class45 method2085(int arg0) {
        class45 var1 = (class45) field1027.method3453((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2937.method3002(3, arg0);
        class45 var3 = new class45();
        if (var2 != null) {
            var3.method864(new class120(var2));
        }
        field1027.method3461(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aa.i(Ldr;I)V")
    public void method864(class120 arg0) {
        while (true) {
            int var2 = arg0.method2334();
            if (var2 == 0) {
                return;
            }
            this.method865(arg0, var2);
        }
    }

    @ObfuscatedName("aa.g(Ldr;II)V")
    public void method865(class120 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1028 = arg0.method2334();
        } else if (arg1 == 2) {
            int var3 = arg0.method2334();
            this.field1029 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1029[var4] = arg0.method2310();
            }
        } else if (arg1 == 3) {
            this.field1035 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2334();
            this.field1030 = new short[var5];
            this.field1037 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1030[var6] = (short) arg0.method2310();
                this.field1037[var6] = (short) arg0.method2310();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2334();
            this.field1042 = new short[var7];
            this.field1033 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1042[var8] = (short) arg0.method2310();
                this.field1033[var8] = (short) arg0.method2310();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field1034[arg1 - 60] = arg0.method2310();
        }
    }

    @ObfuscatedName("aa.h(S)Z")
    public boolean method868() {
        if (this.field1029 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field1029.length; var2++) {
            if (!Statics.field3171.method3040(this.field1029[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("aa.z(I)Lca;")
    public class101 method866() {
        if (this.field1029 == null) {
            return null;
        }
        class101[] var1 = new class101[this.field1029.length];
        for (int var2 = 0; var2 < this.field1029.length; var2++) {
            var1[var2] = class101.method2021(Statics.field3171, this.field1029[var2], 0);
        }
        class101 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class101(var1, var1.length);
        }
        if (this.field1030 != null) {
            for (int var4 = 0; var4 < this.field1030.length; var4++) {
                var3.method2050(this.field1030[var4], this.field1037[var4]);
            }
        }
        if (this.field1042 != null) {
            for (int var5 = 0; var5 < this.field1042.length; var5++) {
                var3.method2038(this.field1042[var5], this.field1033[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("aa.r(I)Z")
    public boolean method867() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field1034[var2] != -1 && !Statics.field3171.method3040(this.field1034[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("aa.f(I)Lca;")
    public class101 method869() {
        class101[] var1 = new class101[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field1034[var3] != -1) {
                var1[var2++] = class101.method2021(Statics.field3171, this.field1034[var3], 0);
            }
        }
        class101 var4 = new class101(var1, var2);
        if (this.field1030 != null) {
            for (int var5 = 0; var5 < this.field1030.length; var5++) {
                var4.method2050(this.field1030[var5], this.field1037[var5]);
            }
        }
        if (this.field1042 != null) {
            for (int var6 = 0; var6 < this.field1042.length; var6++) {
                var4.method2038(this.field1042[var6], this.field1033[var6]);
            }
        }
        return var4;
    }
}
