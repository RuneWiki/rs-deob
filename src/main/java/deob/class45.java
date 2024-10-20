package deob;

@ObfuscatedName("aa")
public class class45 extends class204 {

    @ObfuscatedName("aa.f")
    public static class193 field1018 = new class193(64);

    @ObfuscatedName("aa.d")
    public int field1019 = -1;

    @ObfuscatedName("aa.l")
    public int[] field1020;

    @ObfuscatedName("aa.r")
    public short[] field1016;

    @ObfuscatedName("aa.g")
    public short[] field1022;

    @ObfuscatedName("aa.h")
    public short[] field1021;

    @ObfuscatedName("aa.n")
    public short[] field1024;

    @ObfuscatedName("aa.j")
    public int[] field1017 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("aa.a")
    public boolean field1026 = false;

    @ObfuscatedName("ab.z(Lfl;Lfl;I)V")
    public static void method615(class167 arg0, class167 arg1) {
        Statics.field1028 = arg0;
        Statics.field1025 = arg1;
        Statics.field2029 = Statics.field1028.method2996(3);
    }

    @ObfuscatedName("ao.q(II)Laa;")
    public static class45 method874(int arg0) {
        class45 var1 = (class45) field1018.method3439((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1028.method2986(3, arg0);
        class45 var3 = new class45();
        if (var2 != null) {
            var3.method876(new class119(var2));
        }
        field1018.method3429(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aa.k(Lda;B)V")
    public void method876(class119 arg0) {
        while (true) {
            int var2 = arg0.method2457();
            if (var2 == 0) {
                return;
            }
            this.method875(arg0, var2);
        }
    }

    @ObfuscatedName("aa.f(Lda;II)V")
    public void method875(class119 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1019 = arg0.method2457();
        } else if (arg1 == 2) {
            int var3 = arg0.method2457();
            this.field1020 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1020[var4] = arg0.method2415();
            }
        } else if (arg1 == 3) {
            this.field1026 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2457();
            this.field1016 = new short[var5];
            this.field1022 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1016[var6] = (short) arg0.method2415();
                this.field1022[var6] = (short) arg0.method2415();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2457();
            this.field1021 = new short[var7];
            this.field1024 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1021[var8] = (short) arg0.method2415();
                this.field1024[var8] = (short) arg0.method2415();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field1017[arg1 - 60] = arg0.method2415();
        }
    }

    @ObfuscatedName("aa.d(I)Z")
    public boolean method877() {
        if (this.field1020 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field1020.length; var2++) {
            if (!Statics.field1025.method3067(this.field1020[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("aa.l(B)Lcn;")
    public class100 method878() {
        if (this.field1020 == null) {
            return null;
        }
        class100[] var1 = new class100[this.field1020.length];
        for (int var2 = 0; var2 < this.field1020.length; var2++) {
            var1[var2] = class100.method2071(Statics.field1025, this.field1020[var2], 0);
        }
        class100 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class100(var1, var1.length);
        }
        if (this.field1016 != null) {
            for (int var4 = 0; var4 < this.field1016.length; var4++) {
                var3.method2010(this.field1016[var4], this.field1022[var4]);
            }
        }
        if (this.field1021 != null) {
            for (int var5 = 0; var5 < this.field1021.length; var5++) {
                var3.method2011(this.field1021[var5], this.field1024[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("aa.r(B)Z")
    public boolean method879() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field1017[var2] != -1 && !Statics.field1025.method3067(this.field1017[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("aa.g(B)Lcn;")
    public class100 method880() {
        class100[] var1 = new class100[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field1017[var3] != -1) {
                var1[var2++] = class100.method2071(Statics.field1025, this.field1017[var3], 0);
            }
        }
        class100 var4 = new class100(var1, var2);
        if (this.field1016 != null) {
            for (int var5 = 0; var5 < this.field1016.length; var5++) {
                var4.method2010(this.field1016[var5], this.field1022[var5]);
            }
        }
        if (this.field1021 != null) {
            for (int var6 = 0; var6 < this.field1021.length; var6++) {
                var4.method2011(this.field1021[var6], this.field1024[var6]);
            }
        }
        return var4;
    }
}
