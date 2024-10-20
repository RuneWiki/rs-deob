package deob;

@ObfuscatedName("aa")
public class class47 extends class208 {

    @ObfuscatedName("aa.z")
    public static class197 field1036 = new class197(64);

    @ObfuscatedName("aa.i")
    public int field1034 = -1;

    @ObfuscatedName("aa.b")
    public int[] field1038;

    @ObfuscatedName("aa.l")
    public short[] field1045;

    @ObfuscatedName("aa.m")
    public short[] field1040;

    @ObfuscatedName("aa.p")
    public short[] field1041;

    @ObfuscatedName("aa.f")
    public short[] field1042;

    @ObfuscatedName("aa.d")
    public int[] field1043 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("aa.v")
    public boolean field1044 = false;

    @ObfuscatedName("a.x(Lfp;Lfp;I)V")
    public static void method192(class171 arg0, class171 arg1) {
        Statics.field1037 = arg0;
        Statics.field1039 = arg1;
        Statics.field1035 = Statics.field1037.method3088(3);
    }

    @ObfuscatedName("t.r(IS)Laa;")
    public static class47 method155(int arg0) {
        class47 var1 = (class47) field1036.method3533((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1037.method3079(3, arg0);
        class47 var3 = new class47();
        if (var2 != null) {
            var3.method892(new class123(var2));
        }
        field1036.method3535(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aa.j(Ldp;I)V")
    public void method892(class123 arg0) {
        while (true) {
            int var2 = arg0.method2408();
            if (var2 == 0) {
                return;
            }
            this.method907(arg0, var2);
        }
    }

    @ObfuscatedName("aa.z(Ldp;IB)V")
    public void method907(class123 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1034 = arg0.method2408();
        } else if (arg1 == 2) {
            int var3 = arg0.method2408();
            this.field1038 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1038[var4] = arg0.method2403();
            }
        } else if (arg1 == 3) {
            this.field1044 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2408();
            this.field1045 = new short[var5];
            this.field1040 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1045[var6] = (short) arg0.method2403();
                this.field1040[var6] = (short) arg0.method2403();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2408();
            this.field1041 = new short[var7];
            this.field1042 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1041[var8] = (short) arg0.method2403();
                this.field1042[var8] = (short) arg0.method2403();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field1043[arg1 - 60] = arg0.method2403();
        }
    }

    @ObfuscatedName("aa.i(B)Z")
    public boolean method894() {
        if (this.field1038 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field1038.length; var2++) {
            if (!Statics.field1039.method3081(this.field1038[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("aa.b(I)Lcy;")
    public class104 method895() {
        if (this.field1038 == null) {
            return null;
        }
        class104[] var1 = new class104[this.field1038.length];
        for (int var2 = 0; var2 < this.field1038.length; var2++) {
            var1[var2] = class104.method2122(Statics.field1039, this.field1038[var2], 0);
        }
        class104 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class104(var1, var1.length);
        }
        if (this.field1045 != null) {
            for (int var4 = 0; var4 < this.field1045.length; var4++) {
                var3.method2197(this.field1045[var4], this.field1040[var4]);
            }
        }
        if (this.field1041 != null) {
            for (int var5 = 0; var5 < this.field1041.length; var5++) {
                var3.method2136(this.field1041[var5], this.field1042[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("aa.l(I)Z")
    public boolean method896() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field1043[var2] != -1 && !Statics.field1039.method3081(this.field1043[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("aa.m(I)Lcy;")
    public class104 method901() {
        class104[] var1 = new class104[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field1043[var3] != -1) {
                var1[var2++] = class104.method2122(Statics.field1039, this.field1043[var3], 0);
            }
        }
        class104 var4 = new class104(var1, var2);
        if (this.field1045 != null) {
            for (int var5 = 0; var5 < this.field1045.length; var5++) {
                var4.method2197(this.field1045[var5], this.field1040[var5]);
            }
        }
        if (this.field1041 != null) {
            for (int var6 = 0; var6 < this.field1041.length; var6++) {
                var4.method2136(this.field1041[var6], this.field1042[var6]);
            }
        }
        return var4;
    }
}
