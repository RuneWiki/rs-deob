package deob;

@ObfuscatedName("gf")
public class class185 extends class435 {

    @ObfuscatedName("gf.s")
    public static class273 field1968 = new class273(64);

    @ObfuscatedName("gf.z")
    public int field1969 = -1;

    @ObfuscatedName("gf.j")
    public int[] field1970;

    @ObfuscatedName("gf.i")
    public short[] field1971;

    @ObfuscatedName("gf.n")
    public short[] field1972;

    @ObfuscatedName("gf.l")
    public short[] field1973;

    @ObfuscatedName("gf.k")
    public short[] field1974;

    @ObfuscatedName("gf.c")
    public int[] field1975 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("gf.r")
    public boolean field1965 = false;

    @ObfuscatedName("di.f(II)Lgf;")
    public static class185 method2736(int arg0) {
        class185 var1 = (class185) field1968.method5028((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1967.method5990(3, arg0);
        class185 var3 = new class185();
        if (var2 != null) {
            var3.method3347(new class474(var2));
        }
        field1968.method5027(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gf.w(Lrd;I)V")
    public void method3347(class474 arg0) {
        while (true) {
            int var2 = arg0.method7964();
            if (var2 == 0) {
                return;
            }
            this.method3352(arg0, var2);
        }
    }

    @ObfuscatedName("gf.v(Lrd;IB)V")
    public void method3352(class474 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1969 = arg0.method7964();
        } else if (arg1 == 2) {
            int var3 = arg0.method7964();
            this.field1970 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1970[var4] = arg0.method8032();
            }
        } else if (arg1 == 3) {
            this.field1965 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method7964();
            this.field1971 = new short[var5];
            this.field1972 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1971[var6] = (short) arg0.method8032();
                this.field1972[var6] = (short) arg0.method8032();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method7964();
            this.field1973 = new short[var7];
            this.field1974 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1973[var8] = (short) arg0.method8032();
                this.field1974[var8] = (short) arg0.method8032();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field1975[arg1 - 60] = arg0.method8032();
        }
    }

    @ObfuscatedName("gf.s(S)Z")
    public boolean method3349() {
        if (this.field1970 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field1970.length; var2++) {
            if (!Statics.field1966.method5983(this.field1970[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("gf.z(I)Lhe;")
    public class212 method3350() {
        if (this.field1970 == null) {
            return null;
        }
        class212[] var1 = new class212[this.field1970.length];
        for (int var2 = 0; var2 < this.field1970.length; var2++) {
            var1[var2] = class212.method3915(Statics.field1966, this.field1970[var2], 0);
        }
        class212 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class212(var1, var1.length);
        }
        if (this.field1971 != null) {
            for (int var4 = 0; var4 < this.field1971.length; var4++) {
                var3.method3902(this.field1971[var4], this.field1972[var4]);
            }
        }
        if (this.field1973 != null) {
            for (int var5 = 0; var5 < this.field1973.length; var5++) {
                var3.method3943(this.field1973[var5], this.field1974[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("gf.j(I)Z")
    public boolean method3348() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field1975[var2] != -1 && !Statics.field1966.method5983(this.field1975[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("gf.i(I)Lhe;")
    public class212 method3351() {
        class212[] var1 = new class212[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field1975[var3] != -1) {
                var1[var2++] = class212.method3915(Statics.field1966, this.field1975[var3], 0);
            }
        }
        class212 var4 = new class212(var1, var2);
        if (this.field1971 != null) {
            for (int var5 = 0; var5 < this.field1971.length; var5++) {
                var4.method3902(this.field1971[var5], this.field1972[var5]);
            }
        }
        if (this.field1973 != null) {
            for (int var6 = 0; var6 < this.field1973.length; var6++) {
                var4.method3943(this.field1973[var6], this.field1974[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("el.n(I)V")
    public static void method2976() {
        field1968.method5033();
    }
}
