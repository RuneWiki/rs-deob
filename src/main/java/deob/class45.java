package deob;

@ObfuscatedName("ae")
public class class45 extends class204 {

    @ObfuscatedName("ae.l")
    public static class193 field1028 = new class193(64);

    @ObfuscatedName("ae.r")
    public int field1041 = -1;

    @ObfuscatedName("ae.u")
    public int[] field1030;

    @ObfuscatedName("ae.j")
    public short[] field1035;

    @ObfuscatedName("ae.w")
    public short[] field1032;

    @ObfuscatedName("ae.y")
    public short[] field1033;

    @ObfuscatedName("ae.o")
    public short[] field1034;

    @ObfuscatedName("ae.h")
    public int[] field1029 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("ae.e")
    public boolean field1036 = false;

    @ObfuscatedName("ar.n(II)Lae;")
    public static class45 method995(int arg0) {
        class45 var1 = (class45) field1028.method3475((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1027.method3094(3, arg0);
        class45 var3 = new class45();
        if (var2 != null) {
            var3.method919(new class119(var2));
        }
        field1028.method3488(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ae.q(Ldc;I)V")
    public void method919(class119 arg0) {
        while (true) {
            int var2 = arg0.method2360();
            if (var2 == 0) {
                return;
            }
            this.method918(arg0, var2);
        }
    }

    @ObfuscatedName("ae.c(Ldc;II)V")
    public void method918(class119 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1041 = arg0.method2360();
        } else if (arg1 == 2) {
            int var3 = arg0.method2360();
            this.field1030 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1030[var4] = arg0.method2430();
            }
        } else if (arg1 == 3) {
            this.field1036 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2360();
            this.field1035 = new short[var5];
            this.field1032 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1035[var6] = (short) arg0.method2430();
                this.field1032[var6] = (short) arg0.method2430();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2360();
            this.field1033 = new short[var7];
            this.field1034 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1033[var8] = (short) arg0.method2430();
                this.field1034[var8] = (short) arg0.method2430();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field1029[arg1 - 60] = arg0.method2430();
        }
    }

    @ObfuscatedName("ae.l(I)Z")
    public boolean method921() {
        if (this.field1030 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field1030.length; var2++) {
            if (!Statics.field1026.method3022(this.field1030[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ae.r(I)Lcg;")
    public class100 method922() {
        if (this.field1030 == null) {
            return null;
        }
        class100[] var1 = new class100[this.field1030.length];
        for (int var2 = 0; var2 < this.field1030.length; var2++) {
            var1[var2] = class100.method2075(Statics.field1026, this.field1030[var2], 0);
        }
        class100 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class100(var1, var1.length);
        }
        if (this.field1035 != null) {
            for (int var4 = 0; var4 < this.field1035.length; var4++) {
                var3.method2085(this.field1035[var4], this.field1032[var4]);
            }
        }
        if (this.field1033 != null) {
            for (int var5 = 0; var5 < this.field1033.length; var5++) {
                var3.method2124(this.field1033[var5], this.field1034[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("ae.u(S)Z")
    public boolean method923() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field1029[var2] != -1 && !Statics.field1026.method3022(this.field1029[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ae.j(B)Lcg;")
    public class100 method924() {
        class100[] var1 = new class100[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field1029[var3] != -1) {
                var1[var2++] = class100.method2075(Statics.field1026, this.field1029[var3], 0);
            }
        }
        class100 var4 = new class100(var1, var2);
        if (this.field1035 != null) {
            for (int var5 = 0; var5 < this.field1035.length; var5++) {
                var4.method2085(this.field1035[var5], this.field1032[var5]);
            }
        }
        if (this.field1033 != null) {
            for (int var6 = 0; var6 < this.field1033.length; var6++) {
                var4.method2124(this.field1033[var6], this.field1034[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("j.w(B)V")
    public static void method104() {
        field1028.method3479();
    }
}
