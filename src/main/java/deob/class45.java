package deob;

@ObfuscatedName("av")
public class class45 extends class204 {

    @ObfuscatedName("av.d")
    public static class193 field1032 = new class193(64);

    @ObfuscatedName("av.z")
    public int field1037 = -1;

    @ObfuscatedName("av.l")
    public int[] field1030;

    @ObfuscatedName("av.m")
    public short[] field1035;

    @ObfuscatedName("av.p")
    public short[] field1036;

    @ObfuscatedName("av.u")
    public short[] field1041;

    @ObfuscatedName("av.c")
    public short[] field1038;

    @ObfuscatedName("av.v")
    public int[] field1039 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("av.o")
    public boolean field1040 = false;

    @ObfuscatedName("f.g(Lfc;Lfc;B)V")
    public static void method162(class167 arg0, class167 arg1) {
        Statics.field1034 = arg0;
        Statics.field1033 = arg1;
        Statics.field1031 = Statics.field1034.method3088(3);
    }

    @ObfuscatedName("cm.b(II)Lav;")
    public static class45 method2073(int arg0) {
        class45 var1 = (class45) field1032.method3529((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1034.method3112(3, arg0);
        class45 var3 = new class45();
        if (var2 != null) {
            var3.method921(new class119(var2));
        }
        field1032.method3528(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("av.w(Ldm;I)V")
    public void method921(class119 arg0) {
        while (true) {
            int var2 = arg0.method2362();
            if (var2 == 0) {
                return;
            }
            this.method950(arg0, var2);
        }
    }

    @ObfuscatedName("av.d(Ldm;IB)V")
    public void method950(class119 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1037 = arg0.method2362();
        } else if (arg1 == 2) {
            int var3 = arg0.method2362();
            this.field1030 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1030[var4] = arg0.method2376();
            }
        } else if (arg1 == 3) {
            this.field1040 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2362();
            this.field1035 = new short[var5];
            this.field1036 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1035[var6] = (short) arg0.method2376();
                this.field1036[var6] = (short) arg0.method2376();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2362();
            this.field1041 = new short[var7];
            this.field1038 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1041[var8] = (short) arg0.method2376();
                this.field1038[var8] = (short) arg0.method2376();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field1039[arg1 - 60] = arg0.method2376();
        }
    }

    @ObfuscatedName("av.z(I)Z")
    public boolean method923() {
        if (this.field1030 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field1030.length; var2++) {
            if (!Statics.field1033.method3082(this.field1030[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("av.l(I)Lcd;")
    public class100 method924() {
        if (this.field1030 == null) {
            return null;
        }
        class100[] var1 = new class100[this.field1030.length];
        for (int var2 = 0; var2 < this.field1030.length; var2++) {
            var1[var2] = class100.method2080(Statics.field1033, this.field1030[var2], 0);
        }
        class100 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class100(var1, var1.length);
        }
        if (this.field1035 != null) {
            for (int var4 = 0; var4 < this.field1035.length; var4++) {
                var3.method2093(this.field1035[var4], this.field1036[var4]);
            }
        }
        if (this.field1041 != null) {
            for (int var5 = 0; var5 < this.field1041.length; var5++) {
                var3.method2094(this.field1041[var5], this.field1038[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("av.m(B)Z")
    public boolean method930() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field1039[var2] != -1 && !Statics.field1033.method3082(this.field1039[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("av.p(I)Lcd;")
    public class100 method920() {
        class100[] var1 = new class100[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field1039[var3] != -1) {
                var1[var2++] = class100.method2080(Statics.field1033, this.field1039[var3], 0);
            }
        }
        class100 var4 = new class100(var1, var2);
        if (this.field1035 != null) {
            for (int var5 = 0; var5 < this.field1035.length; var5++) {
                var4.method2093(this.field1035[var5], this.field1036[var5]);
            }
        }
        if (this.field1041 != null) {
            for (int var6 = 0; var6 < this.field1041.length; var6++) {
                var4.method2094(this.field1041[var6], this.field1038[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("az.u(I)V")
    public static void method1006() {
        field1032.method3532();
    }
}
