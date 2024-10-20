package deob;

@ObfuscatedName("at")
public class class45 extends class205 {

    @ObfuscatedName("at.d")
    public static class194 field1009 = new class194(64);

    @ObfuscatedName("at.x")
    public int field1010 = -1;

    @ObfuscatedName("at.y")
    public int[] field1014;

    @ObfuscatedName("at.r")
    public short[] field1008;

    @ObfuscatedName("at.c")
    public short[] field1012;

    @ObfuscatedName("at.l")
    public short[] field1006;

    @ObfuscatedName("at.u")
    public short[] field1015;

    @ObfuscatedName("at.p")
    public int[] field1016 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("at.n")
    public boolean field1017 = false;

    @ObfuscatedName("by.b(Lfl;Lfl;I)V")
    public static void method1543(class168 arg0, class168 arg1) {
        Statics.field1013 = arg0;
        Statics.field1007 = arg1;
        Statics.field1011 = Statics.field1013.method3047(3);
    }

    @ObfuscatedName("ci.g(II)Lat;")
    public static class45 method1775(int arg0) {
        class45 var1 = (class45) field1009.method3495((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1013.method3037(3, arg0);
        class45 var3 = new class45();
        if (var2 != null) {
            var3.method909(new class120(var2));
        }
        field1009.method3490(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("at.j(Lds;I)V")
    public void method909(class120 arg0) {
        while (true) {
            int var2 = arg0.method2344();
            if (var2 == 0) {
                return;
            }
            this.method903(arg0, var2);
        }
    }

    @ObfuscatedName("at.d(Lds;II)V")
    public void method903(class120 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1010 = arg0.method2344();
        } else if (arg1 == 2) {
            int var3 = arg0.method2344();
            this.field1014 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1014[var4] = arg0.method2346();
            }
        } else if (arg1 == 3) {
            this.field1017 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2344();
            this.field1008 = new short[var5];
            this.field1012 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1008[var6] = (short) arg0.method2346();
                this.field1012[var6] = (short) arg0.method2346();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2344();
            this.field1006 = new short[var7];
            this.field1015 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1006[var8] = (short) arg0.method2346();
                this.field1015[var8] = (short) arg0.method2346();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field1016[arg1 - 60] = arg0.method2346();
        }
    }

    @ObfuscatedName("at.x(I)Z")
    public boolean method904() {
        if (this.field1014 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field1014.length; var2++) {
            if (!Statics.field1007.method3039(this.field1014[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("at.y(B)Lch;")
    public class101 method905() {
        if (this.field1014 == null) {
            return null;
        }
        class101[] var1 = new class101[this.field1014.length];
        for (int var2 = 0; var2 < this.field1014.length; var2++) {
            var1[var2] = class101.method2051(Statics.field1007, this.field1014[var2], 0);
        }
        class101 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class101(var1, var1.length);
        }
        if (this.field1008 != null) {
            for (int var4 = 0; var4 < this.field1008.length; var4++) {
                var3.method2064(this.field1008[var4], this.field1012[var4]);
            }
        }
        if (this.field1006 != null) {
            for (int var5 = 0; var5 < this.field1006.length; var5++) {
                var3.method2065(this.field1006[var5], this.field1015[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("at.r(B)Z")
    public boolean method916() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field1016[var2] != -1 && !Statics.field1007.method3039(this.field1016[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("at.c(I)Lch;")
    public class101 method907() {
        class101[] var1 = new class101[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field1016[var3] != -1) {
                var1[var2++] = class101.method2051(Statics.field1007, this.field1016[var3], 0);
            }
        }
        class101 var4 = new class101(var1, var2);
        if (this.field1008 != null) {
            for (int var5 = 0; var5 < this.field1008.length; var5++) {
                var4.method2064(this.field1008[var5], this.field1012[var5]);
            }
        }
        if (this.field1006 != null) {
            for (int var6 = 0; var6 < this.field1006.length; var6++) {
                var4.method2065(this.field1006[var6], this.field1015[var6]);
            }
        }
        return var4;
    }
}
