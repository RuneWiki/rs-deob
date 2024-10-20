package deob;

@ObfuscatedName("ac")
public class class43 extends class198 {

    @ObfuscatedName("ac.l")
    public static class187 field1004 = new class187(64);

    @ObfuscatedName("ac.w")
    public int field1013 = -1;

    @ObfuscatedName("ac.d")
    public int[] field1006;

    @ObfuscatedName("ac.f")
    public short[] field1003;

    @ObfuscatedName("ac.i")
    public short[] field1008;

    @ObfuscatedName("ac.a")
    public short[] field1009;

    @ObfuscatedName("ac.o")
    public short[] field1010;

    @ObfuscatedName("ac.u")
    public int[] field1011 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("ac.m")
    public boolean field1012 = false;

    @ObfuscatedName("es.j(IS)Lac;")
    public static class43 method2730(int arg0) {
        class43 var1 = (class43) field1004.method3432((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1014.method2995(3, arg0);
        class43 var3 = new class43();
        if (var2 != null) {
            var3.method906(new class114(var2));
        }
        field1004.method3434(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ac.y(Lde;B)V")
    public void method906(class114 arg0) {
        while (true) {
            int var2 = arg0.method2322();
            if (var2 == 0) {
                return;
            }
            this.method907(arg0, var2);
        }
    }

    @ObfuscatedName("ac.z(Lde;IB)V")
    public void method907(class114 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1013 = arg0.method2322();
        } else if (arg1 == 2) {
            int var3 = arg0.method2322();
            this.field1006 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1006[var4] = arg0.method2324();
            }
        } else if (arg1 == 3) {
            this.field1012 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2322();
            this.field1003 = new short[var5];
            this.field1008 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1003[var6] = (short) arg0.method2324();
                this.field1008[var6] = (short) arg0.method2324();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2322();
            this.field1009 = new short[var7];
            this.field1010 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1009[var8] = (short) arg0.method2324();
                this.field1010[var8] = (short) arg0.method2324();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field1011[arg1 - 60] = arg0.method2324();
        }
    }

    @ObfuscatedName("ac.l(B)Z")
    public boolean method905() {
        if (this.field1006 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field1006.length; var2++) {
            if (!Statics.field3090.method2981(this.field1006[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ac.w(I)Lcd;")
    public class98 method909() {
        if (this.field1006 == null) {
            return null;
        }
        class98[] var1 = new class98[this.field1006.length];
        for (int var2 = 0; var2 < this.field1006.length; var2++) {
            var1[var2] = class98.method2092(Statics.field3090, this.field1006[var2], 0);
        }
        class98 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class98(var1, var1.length);
        }
        if (this.field1003 != null) {
            for (int var4 = 0; var4 < this.field1003.length; var4++) {
                var3.method2140(this.field1003[var4], this.field1008[var4]);
            }
        }
        if (this.field1009 != null) {
            for (int var5 = 0; var5 < this.field1009.length; var5++) {
                var3.method2087(this.field1009[var5], this.field1010[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("ac.d(I)Z")
    public boolean method910() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field1011[var2] != -1 && !Statics.field3090.method2981(this.field1011[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ac.f(B)Lcd;")
    public class98 method911() {
        class98[] var1 = new class98[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field1011[var3] != -1) {
                var1[var2++] = class98.method2092(Statics.field3090, this.field1011[var3], 0);
            }
        }
        class98 var4 = new class98(var1, var2);
        if (this.field1003 != null) {
            for (int var5 = 0; var5 < this.field1003.length; var5++) {
                var4.method2140(this.field1003[var5], this.field1008[var5]);
            }
        }
        if (this.field1009 != null) {
            for (int var6 = 0; var6 < this.field1009.length; var6++) {
                var4.method2087(this.field1009[var6], this.field1010[var6]);
            }
        }
        return var4;
    }
}
