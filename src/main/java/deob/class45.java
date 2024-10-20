package deob;

@ObfuscatedName("au")
public class class45 extends class204 {

    @ObfuscatedName("au.w")
    public static class193 field1028 = new class193(64);

    @ObfuscatedName("au.e")
    public int field1025 = -1;

    @ObfuscatedName("au.c")
    public int[] field1027;

    @ObfuscatedName("au.a")
    public short[] field1031;

    @ObfuscatedName("au.q")
    public short[] field1032;

    @ObfuscatedName("au.m")
    public short[] field1033;

    @ObfuscatedName("au.n")
    public short[] field1029;

    @ObfuscatedName("au.k")
    public int[] field1034 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("au.o")
    public boolean field1036 = false;

    @ObfuscatedName("c.y(IS)Lau;")
    public static class45 method68(int arg0) {
        class45 var1 = (class45) field1028.method3425((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1038.method3045(3, arg0);
        class45 var3 = new class45();
        if (var2 != null) {
            var3.method891(new class119(var2));
        }
        field1028.method3427(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("au.d(Ldd;I)V")
    public void method891(class119 arg0) {
        while (true) {
            int var2 = arg0.method2326();
            if (var2 == 0) {
                return;
            }
            this.method905(arg0, var2);
        }
    }

    @ObfuscatedName("au.g(Ldd;II)V")
    public void method905(class119 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1025 = arg0.method2326();
        } else if (arg1 == 2) {
            int var3 = arg0.method2326();
            this.field1027 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1027[var4] = arg0.method2525();
            }
        } else if (arg1 == 3) {
            this.field1036 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2326();
            this.field1031 = new short[var5];
            this.field1032 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1031[var6] = (short) arg0.method2525();
                this.field1032[var6] = (short) arg0.method2525();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2326();
            this.field1033 = new short[var7];
            this.field1029 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1033[var8] = (short) arg0.method2525();
                this.field1029[var8] = (short) arg0.method2525();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field1034[arg1 - 60] = arg0.method2525();
        }
    }

    @ObfuscatedName("au.w(I)Z")
    public boolean method912() {
        if (this.field1027 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field1027.length; var2++) {
            if (!Statics.field1026.method2998(this.field1027[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("au.e(B)Lcl;")
    public class100 method895() {
        if (this.field1027 == null) {
            return null;
        }
        class100[] var1 = new class100[this.field1027.length];
        for (int var2 = 0; var2 < this.field1027.length; var2++) {
            var1[var2] = class100.method2031(Statics.field1026, this.field1027[var2], 0);
        }
        class100 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class100(var1, var1.length);
        }
        if (this.field1031 != null) {
            for (int var4 = 0; var4 < this.field1031.length; var4++) {
                var3.method2089(this.field1031[var4], this.field1032[var4]);
            }
        }
        if (this.field1033 != null) {
            for (int var5 = 0; var5 < this.field1033.length; var5++) {
                var3.method2044(this.field1033[var5], this.field1029[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("au.c(I)Z")
    public boolean method896() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field1034[var2] != -1 && !Statics.field1026.method2998(this.field1034[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("au.a(I)Lcl;")
    public class100 method909() {
        class100[] var1 = new class100[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field1034[var3] != -1) {
                var1[var2++] = class100.method2031(Statics.field1026, this.field1034[var3], 0);
            }
        }
        class100 var4 = new class100(var1, var2);
        if (this.field1031 != null) {
            for (int var5 = 0; var5 < this.field1031.length; var5++) {
                var4.method2089(this.field1031[var5], this.field1032[var5]);
            }
        }
        if (this.field1033 != null) {
            for (int var6 = 0; var6 < this.field1033.length; var6++) {
                var4.method2044(this.field1033[var6], this.field1029[var6]);
            }
        }
        return var4;
    }
}
