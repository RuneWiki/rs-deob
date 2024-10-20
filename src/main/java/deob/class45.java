package deob;

@ObfuscatedName("aq")
public class class45 extends class204 {

    @ObfuscatedName("aq.l")
    public static class193 field1021 = new class193(64);

    @ObfuscatedName("aq.u")
    public int field1012 = -1;

    @ObfuscatedName("aq.a")
    public int[] field1014;

    @ObfuscatedName("aq.h")
    public short[] field1015;

    @ObfuscatedName("aq.i")
    public short[] field1016;

    @ObfuscatedName("aq.t")
    public short[] field1017;

    @ObfuscatedName("aq.k")
    public short[] field1018;

    @ObfuscatedName("aq.s")
    public int[] field1019 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("aq.w")
    public boolean field1011 = false;

    @ObfuscatedName("client.j(II)Laq;")
    public static class45 method574(int arg0) {
        class45 var1 = (class45) field1021.method3543((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1013.method3124(3, arg0);
        class45 var3 = new class45();
        if (var2 != null) {
            var3.method937(new class119(var2));
        }
        field1021.method3540(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aq.m(Ldc;I)V")
    public void method937(class119 arg0) {
        while (true) {
            int var2 = arg0.method2372();
            if (var2 == 0) {
                return;
            }
            this.method941(arg0, var2);
        }
    }

    @ObfuscatedName("aq.f(Ldc;II)V")
    public void method941(class119 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1012 = arg0.method2372();
        } else if (arg1 == 2) {
            int var3 = arg0.method2372();
            this.field1014 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1014[var4] = arg0.method2374();
            }
        } else if (arg1 == 3) {
            this.field1011 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2372();
            this.field1015 = new short[var5];
            this.field1016 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1015[var6] = (short) arg0.method2374();
                this.field1016[var6] = (short) arg0.method2374();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2372();
            this.field1017 = new short[var7];
            this.field1018 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1017[var8] = (short) arg0.method2374();
                this.field1018[var8] = (short) arg0.method2374();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field1019[arg1 - 60] = arg0.method2374();
        }
    }

    @ObfuscatedName("aq.l(I)Z")
    public boolean method939() {
        if (this.field1014 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field1014.length; var2++) {
            if (!Statics.field1010.method3086(this.field1014[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("aq.u(B)Lcy;")
    public class100 method926() {
        if (this.field1014 == null) {
            return null;
        }
        class100[] var1 = new class100[this.field1014.length];
        for (int var2 = 0; var2 < this.field1014.length; var2++) {
            var1[var2] = class100.method2063(Statics.field1010, this.field1014[var2], 0);
        }
        class100 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class100(var1, var1.length);
        }
        if (this.field1015 != null) {
            for (int var4 = 0; var4 < this.field1015.length; var4++) {
                var3.method2143(this.field1015[var4], this.field1016[var4]);
            }
        }
        if (this.field1017 != null) {
            for (int var5 = 0; var5 < this.field1017.length; var5++) {
                var3.method2078(this.field1017[var5], this.field1018[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("aq.a(I)Z")
    public boolean method929() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field1019[var2] != -1 && !Statics.field1010.method3086(this.field1019[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("aq.h(I)Lcy;")
    public class100 method930() {
        class100[] var1 = new class100[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field1019[var3] != -1) {
                var1[var2++] = class100.method2063(Statics.field1010, this.field1019[var3], 0);
            }
        }
        class100 var4 = new class100(var1, var2);
        if (this.field1015 != null) {
            for (int var5 = 0; var5 < this.field1015.length; var5++) {
                var4.method2143(this.field1015[var5], this.field1016[var5]);
            }
        }
        if (this.field1017 != null) {
            for (int var6 = 0; var6 < this.field1017.length; var6++) {
                var4.method2078(this.field1017[var6], this.field1018[var6]);
            }
        }
        return var4;
    }
}
