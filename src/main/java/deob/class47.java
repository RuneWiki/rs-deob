package deob;

@ObfuscatedName("al")
public class class47 extends class208 {

    @ObfuscatedName("al.y")
    public static class197 field1016 = new class197(64);

    @ObfuscatedName("al.p")
    public int field1009 = -1;

    @ObfuscatedName("al.g")
    public int[] field1011;

    @ObfuscatedName("al.m")
    public short[] field1008;

    @ObfuscatedName("al.f")
    public short[] field1007;

    @ObfuscatedName("al.k")
    public short[] field1012;

    @ObfuscatedName("al.h")
    public short[] field1013;

    @ObfuscatedName("al.r")
    public int[] field1014 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("al.w")
    public boolean field1015 = false;

    @ObfuscatedName("l.s(II)Lal;")
    public static class47 method572(int arg0) {
        class47 var1 = (class47) field1016.method3523((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1010.method3091(3, arg0);
        class47 var3 = new class47();
        if (var2 != null) {
            var3.method910(new class123(var2));
        }
        field1016.method3521(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("al.z(Ldy;B)V")
    public void method910(class123 arg0) {
        while (true) {
            int var2 = arg0.method2363();
            if (var2 == 0) {
                return;
            }
            this.method921(arg0, var2);
        }
    }

    @ObfuscatedName("al.t(Ldy;II)V")
    public void method921(class123 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1009 = arg0.method2363();
        } else if (arg1 == 2) {
            int var3 = arg0.method2363();
            this.field1011 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1011[var4] = arg0.method2550();
            }
        } else if (arg1 == 3) {
            this.field1015 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2363();
            this.field1008 = new short[var5];
            this.field1007 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1008[var6] = (short) arg0.method2550();
                this.field1007[var6] = (short) arg0.method2550();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2363();
            this.field1012 = new short[var7];
            this.field1013 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1012[var8] = (short) arg0.method2550();
                this.field1013[var8] = (short) arg0.method2550();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field1014[arg1 - 60] = arg0.method2550();
        }
    }

    @ObfuscatedName("al.y(B)Z")
    public boolean method912() {
        if (this.field1011 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field1011.length; var2++) {
            if (!Statics.field1942.method3071(this.field1011[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("al.p(I)Lch;")
    public class104 method919() {
        if (this.field1011 == null) {
            return null;
        }
        class104[] var1 = new class104[this.field1011.length];
        for (int var2 = 0; var2 < this.field1011.length; var2++) {
            var1[var2] = class104.method2078(Statics.field1942, this.field1011[var2], 0);
        }
        class104 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class104(var1, var1.length);
        }
        if (this.field1008 != null) {
            for (int var4 = 0; var4 < this.field1008.length; var4++) {
                var3.method2091(this.field1008[var4], this.field1007[var4]);
            }
        }
        if (this.field1012 != null) {
            for (int var5 = 0; var5 < this.field1012.length; var5++) {
                var3.method2128(this.field1012[var5], this.field1013[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("al.g(B)Z")
    public boolean method909() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field1014[var2] != -1 && !Statics.field1942.method3071(this.field1014[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("al.m(B)Lch;")
    public class104 method915() {
        class104[] var1 = new class104[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field1014[var3] != -1) {
                var1[var2++] = class104.method2078(Statics.field1942, this.field1014[var3], 0);
            }
        }
        class104 var4 = new class104(var1, var2);
        if (this.field1008 != null) {
            for (int var5 = 0; var5 < this.field1008.length; var5++) {
                var4.method2091(this.field1008[var5], this.field1007[var5]);
            }
        }
        if (this.field1012 != null) {
            for (int var6 = 0; var6 < this.field1012.length; var6++) {
                var4.method2128(this.field1012[var6], this.field1013[var6]);
            }
        }
        return var4;
    }
}
