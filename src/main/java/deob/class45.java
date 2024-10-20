package deob;

@ObfuscatedName("an")
public class class45 extends class204 {

    @ObfuscatedName("an.o")
    public static class193 field1019 = new class193(64);

    @ObfuscatedName("an.g")
    public int field1021 = -1;

    @ObfuscatedName("an.m")
    public int[] field1022;

    @ObfuscatedName("an.b")
    public short[] field1023;

    @ObfuscatedName("an.p")
    public short[] field1024;

    @ObfuscatedName("an.t")
    public short[] field1025;

    @ObfuscatedName("an.w")
    public short[] field1026;

    @ObfuscatedName("an.x")
    public int[] field1033 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("an.k")
    public boolean field1027 = false;

    @ObfuscatedName("dc.l(Lfo;Lfo;I)V")
    public static void method2660(class167 arg0, class167 arg1) {
        Statics.field3134 = arg0;
        Statics.field2068 = arg1;
        Statics.field1031 = Statics.field3134.method3085(3);
    }

    @ObfuscatedName("ea.e(II)Lan;")
    public static class45 method2802(int arg0) {
        class45 var1 = (class45) field1019.method3478((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3134.method3050(3, arg0);
        class45 var3 = new class45();
        if (var2 != null) {
            var3.method911(new class119(var2));
        }
        field1019.method3479(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("an.q(Ldl;I)V")
    public void method911(class119 arg0) {
        while (true) {
            int var2 = arg0.method2388();
            if (var2 == 0) {
                return;
            }
            this.method912(arg0, var2);
        }
    }

    @ObfuscatedName("an.o(Ldl;II)V")
    public void method912(class119 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1021 = arg0.method2388();
        } else if (arg1 == 2) {
            int var3 = arg0.method2388();
            this.field1022 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1022[var4] = arg0.method2440();
            }
        } else if (arg1 == 3) {
            this.field1027 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2388();
            this.field1023 = new short[var5];
            this.field1024 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1023[var6] = (short) arg0.method2440();
                this.field1024[var6] = (short) arg0.method2440();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2388();
            this.field1025 = new short[var7];
            this.field1026 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1025[var8] = (short) arg0.method2440();
                this.field1026[var8] = (short) arg0.method2440();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field1033[arg1 - 60] = arg0.method2440();
        }
    }

    @ObfuscatedName("an.g(B)Z")
    public boolean method938() {
        if (this.field1022 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field1022.length; var2++) {
            if (!Statics.field2068.method3088(this.field1022[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("an.m(I)Lcm;")
    public class100 method914() {
        if (this.field1022 == null) {
            return null;
        }
        class100[] var1 = new class100[this.field1022.length];
        for (int var2 = 0; var2 < this.field1022.length; var2++) {
            var1[var2] = class100.method2077(Statics.field2068, this.field1022[var2], 0);
        }
        class100 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class100(var1, var1.length);
        }
        if (this.field1023 != null) {
            for (int var4 = 0; var4 < this.field1023.length; var4++) {
                var3.method2090(this.field1023[var4], this.field1024[var4]);
            }
        }
        if (this.field1025 != null) {
            for (int var5 = 0; var5 < this.field1025.length; var5++) {
                var3.method2091(this.field1025[var5], this.field1026[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("an.b(I)Z")
    public boolean method910() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field1033[var2] != -1 && !Statics.field2068.method3088(this.field1033[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("an.p(I)Lcm;")
    public class100 method916() {
        class100[] var1 = new class100[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field1033[var3] != -1) {
                var1[var2++] = class100.method2077(Statics.field2068, this.field1033[var3], 0);
            }
        }
        class100 var4 = new class100(var1, var2);
        if (this.field1023 != null) {
            for (int var5 = 0; var5 < this.field1023.length; var5++) {
                var4.method2090(this.field1023[var5], this.field1024[var5]);
            }
        }
        if (this.field1025 != null) {
            for (int var6 = 0; var6 < this.field1025.length; var6++) {
                var4.method2091(this.field1025[var6], this.field1026[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("v.t(I)V")
    public static void method155() {
        field1019.method3481();
    }
}
