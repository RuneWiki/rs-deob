package deob;

@ObfuscatedName("an")
public class class45 extends class204 {

    @ObfuscatedName("an.d")
    public static class193 field1021 = new class193(64);

    @ObfuscatedName("an.o")
    public int field1022 = -1;

    @ObfuscatedName("an.c")
    public int[] field1023;

    @ObfuscatedName("an.p")
    public short[] field1024;

    @ObfuscatedName("an.j")
    public short[] field1032;

    @ObfuscatedName("an.a")
    public short[] field1025;

    @ObfuscatedName("an.y")
    public short[] field1027;

    @ObfuscatedName("an.h")
    public int[] field1019 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("an.z")
    public boolean field1029 = false;

    @ObfuscatedName("j.v(II)Lan;")
    public static class45 method99(int arg0) {
        class45 var1 = (class45) field1021.method3490((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1026.method3082(3, arg0);
        class45 var3 = new class45();
        if (var2 != null) {
            var3.method898(new class119(var2));
        }
        field1021.method3502(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("an.f(Ldx;I)V")
    public void method898(class119 arg0) {
        while (true) {
            int var2 = arg0.method2400();
            if (var2 == 0) {
                return;
            }
            this.method892(arg0, var2);
        }
    }

    @ObfuscatedName("an.i(Ldx;IB)V")
    public void method892(class119 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1022 = arg0.method2400();
        } else if (arg1 == 2) {
            int var3 = arg0.method2400();
            this.field1023 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1023[var4] = arg0.method2334();
            }
        } else if (arg1 == 3) {
            this.field1029 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2400();
            this.field1024 = new short[var5];
            this.field1032 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1024[var6] = (short) arg0.method2334();
                this.field1032[var6] = (short) arg0.method2334();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2400();
            this.field1025 = new short[var7];
            this.field1027 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1025[var8] = (short) arg0.method2334();
                this.field1027[var8] = (short) arg0.method2334();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field1019[arg1 - 60] = arg0.method2334();
        }
    }

    @ObfuscatedName("an.d(I)Z")
    public boolean method921() {
        if (this.field1023 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field1023.length; var2++) {
            if (!Statics.field1018.method3070(this.field1023[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("an.o(I)Lca;")
    public class100 method894() {
        if (this.field1023 == null) {
            return null;
        }
        class100[] var1 = new class100[this.field1023.length];
        for (int var2 = 0; var2 < this.field1023.length; var2++) {
            var1[var2] = class100.method2053(Statics.field1018, this.field1023[var2], 0);
        }
        class100 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class100(var1, var1.length);
        }
        if (this.field1024 != null) {
            for (int var4 = 0; var4 < this.field1024.length; var4++) {
                var3.method2123(this.field1024[var4], this.field1032[var4]);
            }
        }
        if (this.field1025 != null) {
            for (int var5 = 0; var5 < this.field1025.length; var5++) {
                var3.method2067(this.field1025[var5], this.field1027[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("an.c(I)Z")
    public boolean method895() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field1019[var2] != -1 && !Statics.field1018.method3070(this.field1019[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("an.p(B)Lca;")
    public class100 method920() {
        class100[] var1 = new class100[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field1019[var3] != -1) {
                var1[var2++] = class100.method2053(Statics.field1018, this.field1019[var3], 0);
            }
        }
        class100 var4 = new class100(var1, var2);
        if (this.field1024 != null) {
            for (int var5 = 0; var5 < this.field1024.length; var5++) {
                var4.method2123(this.field1024[var5], this.field1032[var5]);
            }
        }
        if (this.field1025 != null) {
            for (int var6 = 0; var6 < this.field1025.length; var6++) {
                var4.method2067(this.field1025[var6], this.field1027[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("fw.j(I)V")
    public static void method2958() {
        field1021.method3496();
    }
}
