package deob;

@ObfuscatedName("aw")
public class class41 extends class187 {

    @ObfuscatedName("aw.b")
    public static class176 field944 = new class176(64);

    @ObfuscatedName("aw.l")
    public int field957 = -1;

    @ObfuscatedName("aw.m")
    public int[] field949;

    @ObfuscatedName("aw.w")
    public short[] field950;

    @ObfuscatedName("aw.e")
    public short[] field951;

    @ObfuscatedName("aw.n")
    public short[] field952;

    @ObfuscatedName("aw.s")
    public short[] field953;

    @ObfuscatedName("aw.k")
    public int[] field947 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("aw.f")
    public boolean field955 = false;

    @ObfuscatedName("an.a(Lek;Lek;I)V")
    public static void method559(class151 arg0, class151 arg1) {
        Statics.field945 = arg0;
        Statics.field948 = arg1;
        Statics.field946 = Statics.field945.method2806(3);
    }

    @ObfuscatedName("ck.v(IB)Law;")
    public static class41 method1870(int arg0) {
        class41 var1 = (class41) field944.method3181((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field945.method2731(3, arg0);
        class41 var3 = new class41();
        if (var2 != null) {
            var3.method805(new class110(var2));
        }
        field944.method3183(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aw.i(Ldi;B)V")
    public void method805(class110 arg0) {
        while (true) {
            int var2 = arg0.method2199();
            if (var2 == 0) {
                return;
            }
            this.method785(arg0, var2);
        }
    }

    @ObfuscatedName("aw.b(Ldi;IB)V")
    public void method785(class110 arg0, int arg1) {
        if (arg1 == 1) {
            this.field957 = arg0.method2199();
        } else if (arg1 == 2) {
            int var3 = arg0.method2199();
            this.field949 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field949[var4] = arg0.method2282();
            }
        } else if (arg1 == 3) {
            this.field955 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2199();
            this.field950 = new short[var5];
            this.field951 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field950[var6] = (short) arg0.method2282();
                this.field951[var6] = (short) arg0.method2282();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2199();
            this.field952 = new short[var7];
            this.field953 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field952[var8] = (short) arg0.method2282();
                this.field953[var8] = (short) arg0.method2282();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field947[arg1 - 60] = arg0.method2282();
        }
    }

    @ObfuscatedName("aw.l(I)Z")
    public boolean method796() {
        if (this.field949 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field949.length; var2++) {
            if (!Statics.field948.method2733(this.field949[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("aw.m(B)Lcy;")
    public class94 method786() {
        if (this.field949 == null) {
            return null;
        }
        class94[] var1 = new class94[this.field949.length];
        for (int var2 = 0; var2 < this.field949.length; var2++) {
            var1[var2] = class94.method1882(Statics.field948, this.field949[var2], 0);
        }
        class94 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class94(var1, var1.length);
        }
        if (this.field950 != null) {
            for (int var4 = 0; var4 < this.field950.length; var4++) {
                var3.method1892(this.field950[var4], this.field951[var4]);
            }
        }
        if (this.field952 != null) {
            for (int var5 = 0; var5 < this.field952.length; var5++) {
                var3.method1907(this.field952[var5], this.field953[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("aw.w(B)Z")
    public boolean method802() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field947[var2] != -1 && !Statics.field948.method2733(this.field947[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("aw.e(B)Lcy;")
    public class94 method788() {
        class94[] var1 = new class94[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field947[var3] != -1) {
                var1[var2++] = class94.method1882(Statics.field948, this.field947[var3], 0);
            }
        }
        class94 var4 = new class94(var1, var2);
        if (this.field950 != null) {
            for (int var5 = 0; var5 < this.field950.length; var5++) {
                var4.method1892(this.field950[var5], this.field951[var5]);
            }
        }
        if (this.field952 != null) {
            for (int var6 = 0; var6 < this.field952.length; var6++) {
                var4.method1907(this.field952[var6], this.field953[var6]);
            }
        }
        return var4;
    }
}
