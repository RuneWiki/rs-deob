package deob;

@ObfuscatedName("aw")
public class class45 extends class204 {

    @ObfuscatedName("aw.g")
    public static class193 field1034 = new class193(64);

    @ObfuscatedName("aw.m")
    public int field1036 = -1;

    @ObfuscatedName("aw.t")
    public int[] field1035;

    @ObfuscatedName("aw.j")
    public short[] field1038;

    @ObfuscatedName("aw.n")
    public short[] field1031;

    @ObfuscatedName("aw.l")
    public short[] field1033;

    @ObfuscatedName("aw.i")
    public short[] field1040;

    @ObfuscatedName("aw.w")
    public int[] field1041 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("aw.v")
    public boolean field1042 = false;

    @ObfuscatedName("ac.s(II)Law;")
    public static class45 method715(int arg0) {
        class45 var1 = (class45) field1034.method3497((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1037.method3038(3, arg0);
        class45 var3 = new class45();
        if (var2 != null) {
            var3.method908(new class119(var2));
        }
        field1034.method3508(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aw.q(Ldn;B)V")
    public void method908(class119 arg0) {
        while (true) {
            int var2 = arg0.method2363();
            if (var2 == 0) {
                return;
            }
            this.method899(arg0, var2);
        }
    }

    @ObfuscatedName("aw.g(Ldn;II)V")
    public void method899(class119 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1036 = arg0.method2363();
        } else if (arg1 == 2) {
            int var3 = arg0.method2363();
            this.field1035 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1035[var4] = arg0.method2353();
            }
        } else if (arg1 == 3) {
            this.field1042 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2363();
            this.field1038 = new short[var5];
            this.field1031 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1038[var6] = (short) arg0.method2353();
                this.field1031[var6] = (short) arg0.method2353();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2363();
            this.field1033 = new short[var7];
            this.field1040 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1033[var8] = (short) arg0.method2353();
                this.field1040[var8] = (short) arg0.method2353();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field1041[arg1 - 60] = arg0.method2353();
        }
    }

    @ObfuscatedName("aw.m(B)Z")
    public boolean method898() {
        if (this.field1035 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field1035.length; var2++) {
            if (!Statics.field1032.method3061(this.field1035[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("aw.t(I)Lcx;")
    public class100 method902() {
        if (this.field1035 == null) {
            return null;
        }
        class100[] var1 = new class100[this.field1035.length];
        for (int var2 = 0; var2 < this.field1035.length; var2++) {
            var1[var2] = class100.method2068(Statics.field1032, this.field1035[var2], 0);
        }
        class100 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class100(var1, var1.length);
        }
        if (this.field1038 != null) {
            for (int var4 = 0; var4 < this.field1038.length; var4++) {
                var3.method2082(this.field1038[var4], this.field1031[var4]);
            }
        }
        if (this.field1033 != null) {
            for (int var5 = 0; var5 < this.field1033.length; var5++) {
                var3.method2083(this.field1033[var5], this.field1040[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("aw.j(B)Z")
    public boolean method919() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field1041[var2] != -1 && !Statics.field1032.method3061(this.field1041[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("aw.n(B)Lcx;")
    public class100 method903() {
        class100[] var1 = new class100[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field1041[var3] != -1) {
                var1[var2++] = class100.method2068(Statics.field1032, this.field1041[var3], 0);
            }
        }
        class100 var4 = new class100(var1, var2);
        if (this.field1038 != null) {
            for (int var5 = 0; var5 < this.field1038.length; var5++) {
                var4.method2082(this.field1038[var5], this.field1031[var5]);
            }
        }
        if (this.field1033 != null) {
            for (int var6 = 0; var6 < this.field1033.length; var6++) {
                var4.method2083(this.field1033[var6], this.field1040[var6]);
            }
        }
        return var4;
    }
}
