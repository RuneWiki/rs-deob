package deob;

@ObfuscatedName("aq")
public class class45 extends class205 {

    @ObfuscatedName("aq.c")
    public static class194 field1043 = new class194(64);

    @ObfuscatedName("aq.y")
    public int field1041 = -1;

    @ObfuscatedName("aq.k")
    public int[] field1050;

    @ObfuscatedName("aq.r")
    public short[] field1047;

    @ObfuscatedName("aq.p")
    public short[] field1042;

    @ObfuscatedName("aq.q")
    public short[] field1045;

    @ObfuscatedName("aq.m")
    public short[] field1046;

    @ObfuscatedName("aq.e")
    public int[] field1037 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("aq.x")
    public boolean field1048 = false;

    @ObfuscatedName("fk.a(IB)Laq;")
    public static class45 method3060(int arg0) {
        class45 var1 = (class45) field1043.method3579((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1040.method3188(3, arg0);
        class45 var3 = new class45();
        if (var2 != null) {
            var3.method991(new class120(var2));
        }
        field1043.method3581(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aq.w(Ldx;S)V")
    public void method991(class120 arg0) {
        while (true) {
            int var2 = arg0.method2462();
            if (var2 == 0) {
                return;
            }
            this.method992(arg0, var2);
        }
    }

    @ObfuscatedName("aq.d(Ldx;IB)V")
    public void method992(class120 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1041 = arg0.method2462();
        } else if (arg1 == 2) {
            int var3 = arg0.method2462();
            this.field1050 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1050[var4] = arg0.method2464();
            }
        } else if (arg1 == 3) {
            this.field1048 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2462();
            this.field1047 = new short[var5];
            this.field1042 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1047[var6] = (short) arg0.method2464();
                this.field1042[var6] = (short) arg0.method2464();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2462();
            this.field1045 = new short[var7];
            this.field1046 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1045[var8] = (short) arg0.method2464();
                this.field1046[var8] = (short) arg0.method2464();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field1037[arg1 - 60] = arg0.method2464();
        }
    }

    @ObfuscatedName("aq.c(I)Z")
    public boolean method1011() {
        if (this.field1050 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field1050.length; var2++) {
            if (!Statics.field1038.method3214(this.field1050[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("aq.y(I)Lcx;")
    public class101 method1007() {
        if (this.field1050 == null) {
            return null;
        }
        class101[] var1 = new class101[this.field1050.length];
        for (int var2 = 0; var2 < this.field1050.length; var2++) {
            var1[var2] = class101.method2165(Statics.field1038, this.field1050[var2], 0);
        }
        class101 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class101(var1, var1.length);
        }
        if (this.field1047 != null) {
            for (int var4 = 0; var4 < this.field1047.length; var4++) {
                var3.method2161(this.field1047[var4], this.field1042[var4]);
            }
        }
        if (this.field1045 != null) {
            for (int var5 = 0; var5 < this.field1045.length; var5++) {
                var3.method2162(this.field1045[var5], this.field1046[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("aq.k(I)Z")
    public boolean method995() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field1037[var2] != -1 && !Statics.field1038.method3214(this.field1037[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("aq.r(S)Lcx;")
    public class101 method1006() {
        class101[] var1 = new class101[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field1037[var3] != -1) {
                var1[var2++] = class101.method2165(Statics.field1038, this.field1037[var3], 0);
            }
        }
        class101 var4 = new class101(var1, var2);
        if (this.field1047 != null) {
            for (int var5 = 0; var5 < this.field1047.length; var5++) {
                var4.method2161(this.field1047[var5], this.field1042[var5]);
            }
        }
        if (this.field1045 != null) {
            for (int var6 = 0; var6 < this.field1045.length; var6++) {
                var4.method2162(this.field1045[var6], this.field1046[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("o.p(I)V")
    public static void method668() {
        field1043.method3582();
    }
}
