package deob;

@ObfuscatedName("ay")
public class class45 extends class204 {

    @ObfuscatedName("ay.q")
    public static class193 field1016 = new class193(64);

    @ObfuscatedName("ay.j")
    public int field1011 = -1;

    @ObfuscatedName("ay.k")
    public int[] field1012;

    @ObfuscatedName("ay.i")
    public short[] field1013;

    @ObfuscatedName("ay.m")
    public short[] field1007;

    @ObfuscatedName("ay.p")
    public short[] field1015;

    @ObfuscatedName("ay.h")
    public short[] field1014;

    @ObfuscatedName("ay.e")
    public int[] field1017 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("ay.g")
    public boolean field1018 = false;

    @ObfuscatedName("al.n(IS)Lay;")
    public static class45 method699(int arg0) {
        class45 var1 = (class45) field1016.method3478((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1009.method3010(3, arg0);
        class45 var3 = new class45();
        if (var2 != null) {
            var3.method880(new class119(var2));
        }
        field1016.method3481(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ay.d(Ldq;I)V")
    public void method880(class119 arg0) {
        while (true) {
            int var2 = arg0.method2338();
            if (var2 == 0) {
                return;
            }
            this.method892(arg0, var2);
        }
    }

    @ObfuscatedName("ay.s(Ldq;II)V")
    public void method892(class119 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1011 = arg0.method2338();
        } else if (arg1 == 2) {
            int var3 = arg0.method2338();
            this.field1012 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1012[var4] = arg0.method2377();
            }
        } else if (arg1 == 3) {
            this.field1018 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2338();
            this.field1013 = new short[var5];
            this.field1007 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1013[var6] = (short) arg0.method2377();
                this.field1007[var6] = (short) arg0.method2377();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2338();
            this.field1015 = new short[var7];
            this.field1014 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1015[var8] = (short) arg0.method2377();
                this.field1014[var8] = (short) arg0.method2377();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field1017[arg1 - 60] = arg0.method2377();
        }
    }

    @ObfuscatedName("ay.q(B)Z")
    public boolean method898() {
        if (this.field1012 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field1012.length; var2++) {
            if (!Statics.field1010.method3012(this.field1012[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ay.j(B)Lcl;")
    public class100 method896() {
        if (this.field1012 == null) {
            return null;
        }
        class100[] var1 = new class100[this.field1012.length];
        for (int var2 = 0; var2 < this.field1012.length; var2++) {
            var1[var2] = class100.method2024(Statics.field1010, this.field1012[var2], 0);
        }
        class100 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class100(var1, var1.length);
        }
        if (this.field1013 != null) {
            for (int var4 = 0; var4 < this.field1013.length; var4++) {
                var3.method2060(this.field1013[var4], this.field1007[var4]);
            }
        }
        if (this.field1015 != null) {
            for (int var5 = 0; var5 < this.field1015.length; var5++) {
                var3.method2076(this.field1015[var5], this.field1014[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("ay.k(I)Z")
    public boolean method884() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field1017[var2] != -1 && !Statics.field1010.method3012(this.field1017[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ay.i(I)Lcl;")
    public class100 method885() {
        class100[] var1 = new class100[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field1017[var3] != -1) {
                var1[var2++] = class100.method2024(Statics.field1010, this.field1017[var3], 0);
            }
        }
        class100 var4 = new class100(var1, var2);
        if (this.field1013 != null) {
            for (int var5 = 0; var5 < this.field1013.length; var5++) {
                var4.method2060(this.field1013[var5], this.field1007[var5]);
            }
        }
        if (this.field1015 != null) {
            for (int var6 = 0; var6 < this.field1015.length; var6++) {
                var4.method2076(this.field1015[var6], this.field1014[var6]);
            }
        }
        return var4;
    }
}
