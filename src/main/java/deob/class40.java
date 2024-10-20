package deob;

@ObfuscatedName("al")
public class class40 extends class183 {

    @ObfuscatedName("al.m")
    public static class172 field940 = new class172(64);

    @ObfuscatedName("al.u")
    public int field941 = -1;

    @ObfuscatedName("al.j")
    public int[] field942;

    @ObfuscatedName("al.b")
    public short[] field953;

    @ObfuscatedName("al.v")
    public short[] field943;

    @ObfuscatedName("al.y")
    public short[] field949;

    @ObfuscatedName("al.w")
    public short[] field946;

    @ObfuscatedName("al.x")
    public int[] field945 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("al.k")
    public boolean field947 = false;

    @ObfuscatedName("cx.g(IB)Lal;")
    public static class40 method1854(int arg0) {
        class40 var1 = (class40) field940.method3130((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field939.method2667(3, arg0);
        class40 var3 = new class40();
        if (var2 != null) {
            var3.method758(new class107(var2));
        }
        field940.method3126(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("al.s(Ldi;I)V")
    public void method758(class107 arg0) {
        while (true) {
            int var2 = arg0.method2101();
            if (var2 == 0) {
                return;
            }
            this.method770(arg0, var2);
        }
    }

    @ObfuscatedName("al.h(Ldi;II)V")
    public void method770(class107 arg0, int arg1) {
        if (arg1 == 1) {
            this.field941 = arg0.method2101();
        } else if (arg1 == 2) {
            int var3 = arg0.method2101();
            this.field942 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field942[var4] = arg0.method2166();
            }
        } else if (arg1 == 3) {
            this.field947 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2101();
            this.field953 = new short[var5];
            this.field943 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field953[var6] = (short) arg0.method2166();
                this.field943[var6] = (short) arg0.method2166();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2101();
            this.field949 = new short[var7];
            this.field946 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field949[var8] = (short) arg0.method2166();
                this.field946[var8] = (short) arg0.method2166();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field945[arg1 - 60] = arg0.method2166();
        }
    }

    @ObfuscatedName("al.m(I)Z")
    public boolean method760() {
        if (this.field942 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field942.length; var2++) {
            if (!Statics.field2014.method2716(this.field942[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("al.u(B)Lcv;")
    public class93 method761() {
        if (this.field942 == null) {
            return null;
        }
        class93[] var1 = new class93[this.field942.length];
        for (int var2 = 0; var2 < this.field942.length; var2++) {
            var1[var2] = class93.method1865(Statics.field2014, this.field942[var2], 0);
        }
        class93 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class93(var1, var1.length);
        }
        if (this.field953 != null) {
            for (int var4 = 0; var4 < this.field953.length; var4++) {
                var3.method1877(this.field953[var4], this.field943[var4]);
            }
        }
        if (this.field949 != null) {
            for (int var5 = 0; var5 < this.field949.length; var5++) {
                var3.method1878(this.field949[var5], this.field946[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("al.j(S)Z")
    public boolean method772() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field945[var2] != -1 && !Statics.field2014.method2716(this.field945[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("al.b(I)Lcv;")
    public class93 method763() {
        class93[] var1 = new class93[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field945[var3] != -1) {
                var1[var2++] = class93.method1865(Statics.field2014, this.field945[var3], 0);
            }
        }
        class93 var4 = new class93(var1, var2);
        if (this.field953 != null) {
            for (int var5 = 0; var5 < this.field953.length; var5++) {
                var4.method1877(this.field953[var5], this.field943[var5]);
            }
        }
        if (this.field949 != null) {
            for (int var6 = 0; var6 < this.field949.length; var6++) {
                var4.method1878(this.field949[var6], this.field946[var6]);
            }
        }
        return var4;
    }
}
