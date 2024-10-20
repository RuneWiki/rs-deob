package deob;

@ObfuscatedName("af")
public class class45 extends class204 {

    @ObfuscatedName("af.z")
    public static class193 field1010 = new class193(64);

    @ObfuscatedName("af.c")
    public int field1012 = -1;

    @ObfuscatedName("af.d")
    public int[] field1011;

    @ObfuscatedName("af.l")
    public short[] field1013;

    @ObfuscatedName("af.b")
    public short[] field1014;

    @ObfuscatedName("af.j")
    public short[] field1009;

    @ObfuscatedName("af.f")
    public short[] field1016;

    @ObfuscatedName("af.i")
    public int[] field1017 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("af.g")
    public boolean field1018 = false;

    @ObfuscatedName("l.k(Lfo;Lfo;I)V")
    public static void method88(class167 arg0, class167 arg1) {
        Statics.field2006 = arg0;
        Statics.field3167 = arg1;
        Statics.field1015 = Statics.field2006.method3059(3);
    }

    @ObfuscatedName("dj.h(II)Laf;")
    public static class45 method2269(int arg0) {
        class45 var1 = (class45) field1010.method3510((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2006.method3118(3, arg0);
        class45 var3 = new class45();
        if (var2 != null) {
            var3.method855(new class119(var2));
        }
        field1010.method3512(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("af.o(Ldk;I)V")
    public void method855(class119 arg0) {
        while (true) {
            int var2 = arg0.method2330();
            if (var2 == 0) {
                return;
            }
            this.method856(arg0, var2);
        }
    }

    @ObfuscatedName("af.z(Ldk;II)V")
    public void method856(class119 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1012 = arg0.method2330();
        } else if (arg1 == 2) {
            int var3 = arg0.method2330();
            this.field1011 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1011[var4] = arg0.method2332();
            }
        } else if (arg1 == 3) {
            this.field1018 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2330();
            this.field1013 = new short[var5];
            this.field1014 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1013[var6] = (short) arg0.method2332();
                this.field1014[var6] = (short) arg0.method2332();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2330();
            this.field1009 = new short[var7];
            this.field1016 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1009[var8] = (short) arg0.method2332();
                this.field1016[var8] = (short) arg0.method2332();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field1017[arg1 - 60] = arg0.method2332();
        }
    }

    @ObfuscatedName("af.c(I)Z")
    public boolean method857() {
        if (this.field1011 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field1011.length; var2++) {
            if (!Statics.field3167.method3051(this.field1011[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("af.d(I)Lcg;")
    public class100 method867() {
        if (this.field1011 == null) {
            return null;
        }
        class100[] var1 = new class100[this.field1011.length];
        for (int var2 = 0; var2 < this.field1011.length; var2++) {
            var1[var2] = class100.method2051(Statics.field3167, this.field1011[var2], 0);
        }
        class100 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class100(var1, var1.length);
        }
        if (this.field1013 != null) {
            for (int var4 = 0; var4 < this.field1013.length; var4++) {
                var3.method2064(this.field1013[var4], this.field1014[var4]);
            }
        }
        if (this.field1009 != null) {
            for (int var5 = 0; var5 < this.field1009.length; var5++) {
                var3.method2070(this.field1009[var5], this.field1016[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("af.l(I)Z")
    public boolean method859() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field1017[var2] != -1 && !Statics.field3167.method3051(this.field1017[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("af.b(B)Lcg;")
    public class100 method869() {
        class100[] var1 = new class100[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field1017[var3] != -1) {
                var1[var2++] = class100.method2051(Statics.field3167, this.field1017[var3], 0);
            }
        }
        class100 var4 = new class100(var1, var2);
        if (this.field1013 != null) {
            for (int var5 = 0; var5 < this.field1013.length; var5++) {
                var4.method2064(this.field1013[var5], this.field1014[var5]);
            }
        }
        if (this.field1009 != null) {
            for (int var6 = 0; var6 < this.field1009.length; var6++) {
                var4.method2070(this.field1009[var6], this.field1016[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("cw.j(I)V")
    public static void method1761() {
        field1010.method3518();
    }
}
