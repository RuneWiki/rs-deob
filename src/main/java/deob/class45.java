package deob;

@ObfuscatedName("av")
public class class45 extends class204 {

    @ObfuscatedName("av.n")
    public static class193 field1036 = new class193(64);

    @ObfuscatedName("av.f")
    public int field1034 = -1;

    @ObfuscatedName("av.g")
    public int[] field1038;

    @ObfuscatedName("av.o")
    public short[] field1039;

    @ObfuscatedName("av.s")
    public short[] field1040;

    @ObfuscatedName("av.k")
    public short[] field1041;

    @ObfuscatedName("av.b")
    public short[] field1043;

    @ObfuscatedName("av.c")
    public int[] field1044 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("av.l")
    public boolean field1035 = false;

    @ObfuscatedName("e.h(Lfv;Lfv;I)V")
    public static void method584(class167 arg0, class167 arg1) {
        Statics.field1042 = arg0;
        Statics.field2025 = arg1;
        Statics.field1037 = Statics.field1042.method3092(3);
    }

    @ObfuscatedName("as.q(II)Lav;")
    public static class45 method672(int arg0) {
        class45 var1 = (class45) field1036.method3538((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1042.method3073(3, arg0);
        class45 var3 = new class45();
        if (var2 != null) {
            var3.method895(new class119(var2));
        }
        field1036.method3540(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("av.v(Ldm;B)V")
    public void method895(class119 arg0) {
        while (true) {
            int var2 = arg0.method2383();
            if (var2 == 0) {
                return;
            }
            this.method893(arg0, var2);
        }
    }

    @ObfuscatedName("av.n(Ldm;II)V")
    public void method893(class119 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1034 = arg0.method2383();
        } else if (arg1 == 2) {
            int var3 = arg0.method2383();
            this.field1038 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1038[var4] = arg0.method2385();
            }
        } else if (arg1 == 3) {
            this.field1035 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2383();
            this.field1039 = new short[var5];
            this.field1040 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1039[var6] = (short) arg0.method2385();
                this.field1040[var6] = (short) arg0.method2385();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2383();
            this.field1041 = new short[var7];
            this.field1043 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1041[var8] = (short) arg0.method2385();
                this.field1043[var8] = (short) arg0.method2385();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field1044[arg1 - 60] = arg0.method2385();
        }
    }

    @ObfuscatedName("av.f(B)Z")
    public boolean method894() {
        if (this.field1038 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field1038.length; var2++) {
            if (!Statics.field2025.method3075(this.field1038[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("av.g(I)Lch;")
    public class100 method892() {
        if (this.field1038 == null) {
            return null;
        }
        class100[] var1 = new class100[this.field1038.length];
        for (int var2 = 0; var2 < this.field1038.length; var2++) {
            var1[var2] = class100.method2084(Statics.field2025, this.field1038[var2], 0);
        }
        class100 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class100(var1, var1.length);
        }
        if (this.field1039 != null) {
            for (int var4 = 0; var4 < this.field1039.length; var4++) {
                var3.method2097(this.field1039[var4], this.field1040[var4]);
            }
        }
        if (this.field1041 != null) {
            for (int var5 = 0; var5 < this.field1041.length; var5++) {
                var3.method2149(this.field1041[var5], this.field1043[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("av.o(I)Z")
    public boolean method896() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field1044[var2] != -1 && !Statics.field2025.method3075(this.field1044[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("av.s(I)Lch;")
    public class100 method897() {
        class100[] var1 = new class100[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field1044[var3] != -1) {
                var1[var2++] = class100.method2084(Statics.field2025, this.field1044[var3], 0);
            }
        }
        class100 var4 = new class100(var1, var2);
        if (this.field1039 != null) {
            for (int var5 = 0; var5 < this.field1039.length; var5++) {
                var4.method2097(this.field1039[var5], this.field1040[var5]);
            }
        }
        if (this.field1041 != null) {
            for (int var6 = 0; var6 < this.field1041.length; var6++) {
                var4.method2149(this.field1041[var6], this.field1043[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("a.k(I)V")
    public static void method600() {
        field1036.method3541();
    }
}
