package deob;

@ObfuscatedName("ao")
public class class45 extends class204 {

    @ObfuscatedName("ao.n")
    public static class193 field1026 = new class193(64);

    @ObfuscatedName("ao.x")
    public int field1028 = -1;

    @ObfuscatedName("ao.q")
    public int[] field1027;

    @ObfuscatedName("ao.h")
    public short[] field1022;

    @ObfuscatedName("ao.d")
    public short[] field1025;

    @ObfuscatedName("ao.c")
    public short[] field1030;

    @ObfuscatedName("ao.y")
    public short[] field1031;

    @ObfuscatedName("ao.m")
    public int[] field1032 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("ao.e")
    public boolean field1029 = false;

    @ObfuscatedName("an.i(IB)Lao;")
    public static class45 method766(int arg0) {
        class45 var1 = (class45) field1026.method3464((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1033.method3035(3, arg0);
        class45 var3 = new class45();
        if (var2 != null) {
            var3.method912(new class119(var2));
        }
        field1026.method3466(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ao.v(Ldx;I)V")
    public void method912(class119 arg0) {
        while (true) {
            int var2 = arg0.method2380();
            if (var2 == 0) {
                return;
            }
            this.method913(arg0, var2);
        }
    }

    @ObfuscatedName("ao.r(Ldx;II)V")
    public void method913(class119 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1028 = arg0.method2380();
        } else if (arg1 == 2) {
            int var3 = arg0.method2380();
            this.field1027 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1027[var4] = arg0.method2347();
            }
        } else if (arg1 == 3) {
            this.field1029 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2380();
            this.field1022 = new short[var5];
            this.field1025 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1022[var6] = (short) arg0.method2347();
                this.field1025[var6] = (short) arg0.method2347();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2380();
            this.field1030 = new short[var7];
            this.field1031 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1030[var8] = (short) arg0.method2347();
                this.field1031[var8] = (short) arg0.method2347();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field1032[arg1 - 60] = arg0.method2347();
        }
    }

    @ObfuscatedName("ao.n(I)Z")
    public boolean method914() {
        if (this.field1027 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field1027.length; var2++) {
            if (!Statics.field1023.method3063(this.field1027[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ao.x(S)Lcx;")
    public class100 method915() {
        if (this.field1027 == null) {
            return null;
        }
        class100[] var1 = new class100[this.field1027.length];
        for (int var2 = 0; var2 < this.field1027.length; var2++) {
            var1[var2] = class100.method2042(Statics.field1023, this.field1027[var2], 0);
        }
        class100 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class100(var1, var1.length);
        }
        if (this.field1022 != null) {
            for (int var4 = 0; var4 < this.field1022.length; var4++) {
                var3.method2054(this.field1022[var4], this.field1025[var4]);
            }
        }
        if (this.field1030 != null) {
            for (int var5 = 0; var5 < this.field1030.length; var5++) {
                var3.method2055(this.field1030[var5], this.field1031[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("ao.q(B)Z")
    public boolean method918() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field1032[var2] != -1 && !Statics.field1023.method3063(this.field1032[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ao.h(I)Lcx;")
    public class100 method917() {
        class100[] var1 = new class100[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field1032[var3] != -1) {
                var1[var2++] = class100.method2042(Statics.field1023, this.field1032[var3], 0);
            }
        }
        class100 var4 = new class100(var1, var2);
        if (this.field1022 != null) {
            for (int var5 = 0; var5 < this.field1022.length; var5++) {
                var4.method2054(this.field1022[var5], this.field1025[var5]);
            }
        }
        if (this.field1030 != null) {
            for (int var6 = 0; var6 < this.field1030.length; var6++) {
                var4.method2055(this.field1030[var6], this.field1031[var6]);
            }
        }
        return var4;
    }
}
