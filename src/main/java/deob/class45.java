package deob;

@ObfuscatedName("ae")
public class class45 extends class204 {

    @ObfuscatedName("ae.i")
    public static class193 field1027 = new class193(64);

    @ObfuscatedName("ae.f")
    public int field1028 = -1;

    @ObfuscatedName("ae.m")
    public int[] field1026;

    @ObfuscatedName("ae.o")
    public short[] field1030;

    @ObfuscatedName("ae.h")
    public short[] field1029;

    @ObfuscatedName("ae.n")
    public short[] field1032;

    @ObfuscatedName("ae.k")
    public short[] field1035;

    @ObfuscatedName("ae.r")
    public int[] field1034 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("ae.b")
    public boolean field1024 = false;

    @ObfuscatedName("do.j(II)Lae;")
    public static class45 method2262(int arg0) {
        class45 var1 = (class45) field1027.method3466((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1031.method3005(3, arg0);
        class45 var3 = new class45();
        if (var2 != null) {
            var3.method911(new class119(var2));
        }
        field1027.method3468(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ae.l(Ldc;B)V")
    public void method911(class119 arg0) {
        while (true) {
            int var2 = arg0.method2316();
            if (var2 == 0) {
                return;
            }
            this.method901(arg0, var2);
        }
    }

    @ObfuscatedName("ae.a(Ldc;II)V")
    public void method901(class119 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1028 = arg0.method2316();
        } else if (arg1 == 2) {
            int var3 = arg0.method2316();
            this.field1026 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1026[var4] = arg0.method2318();
            }
        } else if (arg1 == 3) {
            this.field1024 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2316();
            this.field1030 = new short[var5];
            this.field1029 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1030[var6] = (short) arg0.method2318();
                this.field1029[var6] = (short) arg0.method2318();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2316();
            this.field1032 = new short[var7];
            this.field1035 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1032[var8] = (short) arg0.method2318();
                this.field1035[var8] = (short) arg0.method2318();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field1034[arg1 - 60] = arg0.method2318();
        }
    }

    @ObfuscatedName("ae.i(I)Z")
    public boolean method902() {
        if (this.field1026 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field1026.length; var2++) {
            if (!Statics.field1025.method3007(this.field1026[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ae.f(I)Lcb;")
    public class100 method903() {
        if (this.field1026 == null) {
            return null;
        }
        class100[] var1 = new class100[this.field1026.length];
        for (int var2 = 0; var2 < this.field1026.length; var2++) {
            var1[var2] = class100.method2109(Statics.field1025, this.field1026[var2], 0);
        }
        class100 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class100(var1, var1.length);
        }
        if (this.field1030 != null) {
            for (int var4 = 0; var4 < this.field1030.length; var4++) {
                var3.method2061(this.field1030[var4], this.field1029[var4]);
            }
        }
        if (this.field1032 != null) {
            for (int var5 = 0; var5 < this.field1032.length; var5++) {
                var3.method2055(this.field1032[var5], this.field1035[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("ae.m(I)Z")
    public boolean method904() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field1034[var2] != -1 && !Statics.field1025.method3007(this.field1034[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ae.o(I)Lcb;")
    public class100 method905() {
        class100[] var1 = new class100[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field1034[var3] != -1) {
                var1[var2++] = class100.method2109(Statics.field1025, this.field1034[var3], 0);
            }
        }
        class100 var4 = new class100(var1, var2);
        if (this.field1030 != null) {
            for (int var5 = 0; var5 < this.field1030.length; var5++) {
                var4.method2061(this.field1030[var5], this.field1029[var5]);
            }
        }
        if (this.field1032 != null) {
            for (int var6 = 0; var6 < this.field1032.length; var6++) {
                var4.method2055(this.field1032[var6], this.field1035[var6]);
            }
        }
        return var4;
    }
}
