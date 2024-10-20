package deob;

@ObfuscatedName("ab")
public class class45 extends class204 {

    @ObfuscatedName("ab.h")
    public static class193 field1031 = new class193(64);

    @ObfuscatedName("ab.q")
    public int field1023 = -1;

    @ObfuscatedName("ab.u")
    public int[] field1019;

    @ObfuscatedName("ab.m")
    public short[] field1021;

    @ObfuscatedName("ab.y")
    public short[] field1018;

    @ObfuscatedName("ab.p")
    public short[] field1029;

    @ObfuscatedName("ab.t")
    public short[] field1024;

    @ObfuscatedName("ab.g")
    public int[] field1025 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("ab.v")
    public boolean field1026 = false;

    @ObfuscatedName("ac.f(II)Lab;")
    public static class45 method628(int arg0) {
        class45 var1 = (class45) field1031.method3456((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1022.method3030(3, arg0);
        class45 var3 = new class45();
        if (var2 != null) {
            var3.method879(new class119(var2));
        }
        field1031.method3451(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ab.i(Ldc;I)V")
    public void method879(class119 arg0) {
        while (true) {
            int var2 = arg0.method2290();
            if (var2 == 0) {
                return;
            }
            this.method865(arg0, var2);
        }
    }

    @ObfuscatedName("ab.h(Ldc;II)V")
    public void method865(class119 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1023 = arg0.method2290();
        } else if (arg1 == 2) {
            int var3 = arg0.method2290();
            this.field1019 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1019[var4] = arg0.method2292();
            }
        } else if (arg1 == 3) {
            this.field1026 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2290();
            this.field1021 = new short[var5];
            this.field1018 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1021[var6] = (short) arg0.method2292();
                this.field1018[var6] = (short) arg0.method2292();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2290();
            this.field1029 = new short[var7];
            this.field1024 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1029[var8] = (short) arg0.method2292();
                this.field1024[var8] = (short) arg0.method2292();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field1025[arg1 - 60] = arg0.method2292();
        }
    }

    @ObfuscatedName("ab.q(I)Z")
    public boolean method866() {
        if (this.field1019 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field1019.length; var2++) {
            if (!Statics.field3101.method2976(this.field1019[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ab.u(I)Lck;")
    public class100 method867() {
        if (this.field1019 == null) {
            return null;
        }
        class100[] var1 = new class100[this.field1019.length];
        for (int var2 = 0; var2 < this.field1019.length; var2++) {
            var1[var2] = class100.method2000(Statics.field3101, this.field1019[var2], 0);
        }
        class100 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class100(var1, var1.length);
        }
        if (this.field1021 != null) {
            for (int var4 = 0; var4 < this.field1021.length; var4++) {
                var3.method2013(this.field1021[var4], this.field1018[var4]);
            }
        }
        if (this.field1029 != null) {
            for (int var5 = 0; var5 < this.field1029.length; var5++) {
                var3.method2014(this.field1029[var5], this.field1024[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("ab.m(I)Z")
    public boolean method864() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field1025[var2] != -1 && !Statics.field3101.method2976(this.field1025[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ab.y(I)Lck;")
    public class100 method870() {
        class100[] var1 = new class100[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field1025[var3] != -1) {
                var1[var2++] = class100.method2000(Statics.field3101, this.field1025[var3], 0);
            }
        }
        class100 var4 = new class100(var1, var2);
        if (this.field1021 != null) {
            for (int var5 = 0; var5 < this.field1021.length; var5++) {
                var4.method2013(this.field1021[var5], this.field1018[var5]);
            }
        }
        if (this.field1029 != null) {
            for (int var6 = 0; var6 < this.field1029.length; var6++) {
                var4.method2014(this.field1029[var6], this.field1024[var6]);
            }
        }
        return var4;
    }
}
