package deob;

@ObfuscatedName("at")
public class class45 extends class205 {

    @ObfuscatedName("at.x")
    public static class194 field1026 = new class194(64);

    @ObfuscatedName("at.d")
    public int field1027 = -1;

    @ObfuscatedName("at.u")
    public int[] field1023;

    @ObfuscatedName("at.o")
    public short[] field1029;

    @ObfuscatedName("at.b")
    public short[] field1030;

    @ObfuscatedName("at.k")
    public short[] field1025;

    @ObfuscatedName("at.c")
    public short[] field1032;

    @ObfuscatedName("at.l")
    public int[] field1039 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("at.t")
    public boolean field1034 = false;

    @ObfuscatedName("ep.s(Lfa;Lfa;S)V")
    public static void method2765(class168 arg0, class168 arg1) {
        Statics.field1035 = arg0;
        Statics.field1024 = arg1;
        Statics.field1038 = Statics.field1035.method3024(3);
    }

    @ObfuscatedName("r.j(II)Lat;")
    public static class45 method163(int arg0) {
        class45 var1 = (class45) field1026.method3484((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1035.method3014(3, arg0);
        class45 var3 = new class45();
        if (var2 != null) {
            var3.method876(new class120(var2));
        }
        field1026.method3486(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("at.p(Lds;B)V")
    public void method876(class120 arg0) {
        while (true) {
            int var2 = arg0.method2338();
            if (var2 == 0) {
                return;
            }
            this.method889(arg0, var2);
        }
    }

    @ObfuscatedName("at.x(Lds;II)V")
    public void method889(class120 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1027 = arg0.method2338();
        } else if (arg1 == 2) {
            int var3 = arg0.method2338();
            this.field1023 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1023[var4] = arg0.method2430();
            }
        } else if (arg1 == 3) {
            this.field1034 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2338();
            this.field1029 = new short[var5];
            this.field1030 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1029[var6] = (short) arg0.method2430();
                this.field1030[var6] = (short) arg0.method2430();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2338();
            this.field1025 = new short[var7];
            this.field1032 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1025[var8] = (short) arg0.method2430();
                this.field1032[var8] = (short) arg0.method2430();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field1039[arg1 - 60] = arg0.method2430();
        }
    }

    @ObfuscatedName("at.d(B)Z")
    public boolean method901() {
        if (this.field1023 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field1023.length; var2++) {
            if (!Statics.field1024.method3047(this.field1023[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("at.u(B)Lcq;")
    public class101 method879() {
        if (this.field1023 == null) {
            return null;
        }
        class101[] var1 = new class101[this.field1023.length];
        for (int var2 = 0; var2 < this.field1023.length; var2++) {
            var1[var2] = class101.method2040(Statics.field1024, this.field1023[var2], 0);
        }
        class101 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class101(var1, var1.length);
        }
        if (this.field1029 != null) {
            for (int var4 = 0; var4 < this.field1029.length; var4++) {
                var3.method2053(this.field1029[var4], this.field1030[var4]);
            }
        }
        if (this.field1025 != null) {
            for (int var5 = 0; var5 < this.field1025.length; var5++) {
                var3.method2054(this.field1025[var5], this.field1032[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("at.o(I)Z")
    public boolean method880() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field1039[var2] != -1 && !Statics.field1024.method3047(this.field1039[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("at.b(I)Lcq;")
    public class101 method899() {
        class101[] var1 = new class101[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field1039[var3] != -1) {
                var1[var2++] = class101.method2040(Statics.field1024, this.field1039[var3], 0);
            }
        }
        class101 var4 = new class101(var1, var2);
        if (this.field1029 != null) {
            for (int var5 = 0; var5 < this.field1029.length; var5++) {
                var4.method2053(this.field1029[var5], this.field1030[var5]);
            }
        }
        if (this.field1025 != null) {
            for (int var6 = 0; var6 < this.field1025.length; var6++) {
                var4.method2054(this.field1025[var6], this.field1032[var6]);
            }
        }
        return var4;
    }
}
