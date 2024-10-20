package deob;

@ObfuscatedName("aj")
public class class47 extends class208 {

    @ObfuscatedName("aj.h")
    public static class197 field1063 = new class197(64);

    @ObfuscatedName("aj.r")
    public int field1068 = -1;

    @ObfuscatedName("aj.a")
    public int[] field1065;

    @ObfuscatedName("aj.b")
    public short[] field1067;

    @ObfuscatedName("aj.u")
    public short[] field1066;

    @ObfuscatedName("aj.o")
    public short[] field1060;

    @ObfuscatedName("aj.p")
    public short[] field1069;

    @ObfuscatedName("aj.i")
    public int[] field1070 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("aj.q")
    public boolean field1071 = false;

    @ObfuscatedName("ao.e(Lfe;Lfe;I)V")
    public static void method651(class171 arg0, class171 arg1) {
        Statics.field1064 = arg0;
        Statics.field1061 = arg1;
        Statics.field1062 = Statics.field1064.method3142(3);
    }

    @ObfuscatedName("cw.l(II)Laj;")
    public static class47 method2061(int arg0) {
        class47 var1 = (class47) field1063.method3589((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1064.method3130(3, arg0);
        class47 var3 = new class47();
        if (var2 != null) {
            var3.method952(new class123(var2));
        }
        field1063.method3591(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aj.c(Ldd;B)V")
    public void method952(class123 arg0) {
        while (true) {
            int var2 = arg0.method2464();
            if (var2 == 0) {
                return;
            }
            this.method953(arg0, var2);
        }
    }

    @ObfuscatedName("aj.h(Ldd;II)V")
    public void method953(class123 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1068 = arg0.method2464();
        } else if (arg1 == 2) {
            int var3 = arg0.method2464();
            this.field1065 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1065[var4] = arg0.method2466();
            }
        } else if (arg1 == 3) {
            this.field1071 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2464();
            this.field1067 = new short[var5];
            this.field1066 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1067[var6] = (short) arg0.method2466();
                this.field1066[var6] = (short) arg0.method2466();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2464();
            this.field1060 = new short[var7];
            this.field1069 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1060[var8] = (short) arg0.method2466();
                this.field1069[var8] = (short) arg0.method2466();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field1070[arg1 - 60] = arg0.method2466();
        }
    }

    @ObfuscatedName("aj.r(I)Z")
    public boolean method954() {
        if (this.field1065 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field1065.length; var2++) {
            if (!Statics.field1061.method3134(this.field1065[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("aj.a(I)Lcv;")
    public class104 method981() {
        if (this.field1065 == null) {
            return null;
        }
        class104[] var1 = new class104[this.field1065.length];
        for (int var2 = 0; var2 < this.field1065.length; var2++) {
            var1[var2] = class104.method2178(Statics.field1061, this.field1065[var2], 0);
        }
        class104 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class104(var1, var1.length);
        }
        if (this.field1067 != null) {
            for (int var4 = 0; var4 < this.field1067.length; var4++) {
                var3.method2217(this.field1067[var4], this.field1066[var4]);
            }
        }
        if (this.field1060 != null) {
            for (int var5 = 0; var5 < this.field1060.length; var5++) {
                var3.method2168(this.field1060[var5], this.field1069[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("aj.b(B)Z")
    public boolean method956() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field1070[var2] != -1 && !Statics.field1061.method3134(this.field1070[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("aj.u(B)Lcv;")
    public class104 method955() {
        class104[] var1 = new class104[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field1070[var3] != -1) {
                var1[var2++] = class104.method2178(Statics.field1061, this.field1070[var3], 0);
            }
        }
        class104 var4 = new class104(var1, var2);
        if (this.field1067 != null) {
            for (int var5 = 0; var5 < this.field1067.length; var5++) {
                var4.method2217(this.field1067[var5], this.field1066[var5]);
            }
        }
        if (this.field1060 != null) {
            for (int var6 = 0; var6 < this.field1060.length; var6++) {
                var4.method2168(this.field1060[var6], this.field1069[var6]);
            }
        }
        return var4;
    }
}
