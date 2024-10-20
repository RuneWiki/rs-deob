package deob;

@ObfuscatedName("at")
public class class45 extends class205 {

    @ObfuscatedName("at.p")
    public static class194 field1034 = new class194(64);

    @ObfuscatedName("at.e")
    public int field1037 = -1;

    @ObfuscatedName("at.y")
    public int[] field1036;

    @ObfuscatedName("at.m")
    public short[] field1035;

    @ObfuscatedName("at.c")
    public short[] field1040;

    @ObfuscatedName("at.v")
    public short[] field1039;

    @ObfuscatedName("at.l")
    public short[] field1033;

    @ObfuscatedName("at.z")
    public int[] field1043 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("at.s")
    public boolean field1044 = false;

    @ObfuscatedName("ds.w(Lfx;Lfx;B)V")
    public static void method2636(class168 arg0, class168 arg1) {
        Statics.field1049 = arg0;
        Statics.field1038 = arg1;
        Statics.field1042 = Statics.field1049.method3122(3);
    }

    @ObfuscatedName("z.x(II)Lat;")
    public static class45 method130(int arg0) {
        class45 var1 = (class45) field1034.method3520((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1049.method3127(3, arg0);
        class45 var3 = new class45();
        if (var2 != null) {
            var3.method934(new class120(var2));
        }
        field1034.method3522(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("at.t(Lde;B)V")
    public void method934(class120 arg0) {
        while (true) {
            int var2 = arg0.method2363();
            if (var2 == 0) {
                return;
            }
            this.method935(arg0, var2);
        }
    }

    @ObfuscatedName("at.p(Lde;II)V")
    public void method935(class120 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1037 = arg0.method2363();
        } else if (arg1 == 2) {
            int var3 = arg0.method2363();
            this.field1036 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1036[var4] = arg0.method2365();
            }
        } else if (arg1 == 3) {
            this.field1044 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2363();
            this.field1035 = new short[var5];
            this.field1040 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1035[var6] = (short) arg0.method2365();
                this.field1040[var6] = (short) arg0.method2365();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2363();
            this.field1039 = new short[var7];
            this.field1033 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1039[var8] = (short) arg0.method2365();
                this.field1033[var8] = (short) arg0.method2365();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field1043[arg1 - 60] = arg0.method2365();
        }
    }

    @ObfuscatedName("at.e(I)Z")
    public boolean method936() {
        if (this.field1036 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field1036.length; var2++) {
            if (!Statics.field1038.method3082(this.field1036[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("at.y(I)Lcu;")
    public class101 method944() {
        if (this.field1036 == null) {
            return null;
        }
        class101[] var1 = new class101[this.field1036.length];
        for (int var2 = 0; var2 < this.field1036.length; var2++) {
            var1[var2] = class101.method2081(Statics.field1038, this.field1036[var2], 0);
        }
        class101 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class101(var1, var1.length);
        }
        if (this.field1035 != null) {
            for (int var4 = 0; var4 < this.field1035.length; var4++) {
                var3.method2105(this.field1035[var4], this.field1040[var4]);
            }
        }
        if (this.field1039 != null) {
            for (int var5 = 0; var5 < this.field1039.length; var5++) {
                var3.method2072(this.field1039[var5], this.field1033[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("at.m(B)Z")
    public boolean method933() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field1043[var2] != -1 && !Statics.field1038.method3082(this.field1043[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("at.c(I)Lcu;")
    public class101 method939() {
        class101[] var1 = new class101[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field1043[var3] != -1) {
                var1[var2++] = class101.method2081(Statics.field1038, this.field1043[var3], 0);
            }
        }
        class101 var4 = new class101(var1, var2);
        if (this.field1035 != null) {
            for (int var5 = 0; var5 < this.field1035.length; var5++) {
                var4.method2105(this.field1035[var5], this.field1040[var5]);
            }
        }
        if (this.field1039 != null) {
            for (int var6 = 0; var6 < this.field1039.length; var6++) {
                var4.method2072(this.field1039[var6], this.field1033[var6]);
            }
        }
        return var4;
    }
}
