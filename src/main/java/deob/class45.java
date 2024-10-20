package deob;

@ObfuscatedName("ar")
public class class45 extends class205 {

    @ObfuscatedName("ar.z")
    public static class194 field1013 = new class194(64);

    @ObfuscatedName("ar.x")
    public int field1016 = -1;

    @ObfuscatedName("ar.e")
    public int[] field1014;

    @ObfuscatedName("ar.i")
    public short[] field1012;

    @ObfuscatedName("ar.c")
    public short[] field1010;

    @ObfuscatedName("ar.n")
    public short[] field1017;

    @ObfuscatedName("ar.l")
    public short[] field1018;

    @ObfuscatedName("ar.u")
    public int[] field1019 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("ar.r")
    public boolean field1020 = false;

    @ObfuscatedName("et.j(II)Lar;")
    public static class45 method2685(int arg0) {
        class45 var1 = (class45) field1013.method3460((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1011.method3011(3, arg0);
        class45 var3 = new class45();
        if (var2 != null) {
            var3.method890(new class120(var2));
        }
        field1013.method3462(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ar.h(Ldx;I)V")
    public void method890(class120 arg0) {
        while (true) {
            int var2 = arg0.method2361();
            if (var2 == 0) {
                return;
            }
            this.method891(arg0, var2);
        }
    }

    @ObfuscatedName("ar.m(Ldx;II)V")
    public void method891(class120 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1016 = arg0.method2361();
        } else if (arg1 == 2) {
            int var3 = arg0.method2361();
            this.field1014 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1014[var4] = arg0.method2363();
            }
        } else if (arg1 == 3) {
            this.field1020 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2361();
            this.field1012 = new short[var5];
            this.field1010 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1012[var6] = (short) arg0.method2363();
                this.field1010[var6] = (short) arg0.method2363();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2361();
            this.field1017 = new short[var7];
            this.field1018 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1017[var8] = (short) arg0.method2363();
                this.field1018[var8] = (short) arg0.method2363();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field1019[arg1 - 60] = arg0.method2363();
        }
    }

    @ObfuscatedName("ar.z(I)Z")
    public boolean method892() {
        if (this.field1014 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field1014.length; var2++) {
            if (!Statics.field1015.method3088(this.field1014[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ar.x(I)Lcd;")
    public class101 method893() {
        if (this.field1014 == null) {
            return null;
        }
        class101[] var1 = new class101[this.field1014.length];
        for (int var2 = 0; var2 < this.field1014.length; var2++) {
            var1[var2] = class101.method2069(Statics.field1015, this.field1014[var2], 0);
        }
        class101 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class101(var1, var1.length);
        }
        if (this.field1012 != null) {
            for (int var4 = 0; var4 < this.field1012.length; var4++) {
                var3.method2073(this.field1012[var4], this.field1010[var4]);
            }
        }
        if (this.field1017 != null) {
            for (int var5 = 0; var5 < this.field1017.length; var5++) {
                var3.method2085(this.field1017[var5], this.field1018[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("ar.e(I)Z")
    public boolean method894() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field1019[var2] != -1 && !Statics.field1015.method3088(this.field1019[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ar.i(I)Lcd;")
    public class101 method899() {
        class101[] var1 = new class101[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field1019[var3] != -1) {
                var1[var2++] = class101.method2069(Statics.field1015, this.field1019[var3], 0);
            }
        }
        class101 var4 = new class101(var1, var2);
        if (this.field1012 != null) {
            for (int var5 = 0; var5 < this.field1012.length; var5++) {
                var4.method2073(this.field1012[var5], this.field1010[var5]);
            }
        }
        if (this.field1017 != null) {
            for (int var6 = 0; var6 < this.field1017.length; var6++) {
                var4.method2085(this.field1017[var6], this.field1018[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("w.c(B)V")
    public static void method237() {
        field1013.method3463();
    }
}
