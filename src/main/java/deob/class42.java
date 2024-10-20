package deob;

@ObfuscatedName("ay")
public class class42 extends class194 {

    @ObfuscatedName("ay.e")
    public static class183 field955 = new class183(64);

    @ObfuscatedName("ay.n")
    public int field954 = -1;

    @ObfuscatedName("ay.t")
    public int[] field952;

    @ObfuscatedName("ay.l")
    public short[] field966;

    @ObfuscatedName("ay.m")
    public short[] field959;

    @ObfuscatedName("ay.o")
    public short[] field960;

    @ObfuscatedName("ay.k")
    public short[] field963;

    @ObfuscatedName("ay.p")
    public int[] field962 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("ay.u")
    public boolean field956 = false;

    @ObfuscatedName("dz.q(Lff;Lff;I)V")
    public static void method2461(class158 arg0, class158 arg1) {
        Statics.field964 = arg0;
        Statics.field953 = arg1;
        Statics.field961 = Statics.field964.method2808(3);
    }

    @ObfuscatedName("do.s(II)Lay;")
    public static class42 method2425(int arg0) {
        class42 var1 = (class42) field955.method3243((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field964.method2811(3, arg0);
        class42 var3 = new class42();
        if (var2 != null) {
            var3.method775(new class111(var2));
        }
        field955.method3253(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ay.h(Ldx;I)V")
    public void method775(class111 arg0) {
        while (true) {
            int var2 = arg0.method2231();
            if (var2 == 0) {
                return;
            }
            this.method781(arg0, var2);
        }
    }

    @ObfuscatedName("ay.e(Ldx;IB)V")
    public void method781(class111 arg0, int arg1) {
        if (arg1 == 1) {
            this.field954 = arg0.method2231();
        } else if (arg1 == 2) {
            int var3 = arg0.method2231();
            this.field952 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field952[var4] = arg0.method2307();
            }
        } else if (arg1 == 3) {
            this.field956 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2231();
            this.field966 = new short[var5];
            this.field959 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field966[var6] = (short) arg0.method2307();
                this.field959[var6] = (short) arg0.method2307();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2231();
            this.field960 = new short[var7];
            this.field963 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field960[var8] = (short) arg0.method2307();
                this.field963[var8] = (short) arg0.method2307();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field962[arg1 - 60] = arg0.method2307();
        }
    }

    @ObfuscatedName("ay.n(B)Z")
    public boolean method790() {
        if (this.field952 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field952.length; var2++) {
            if (!Statics.field953.method2877(this.field952[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ay.t(I)Lcl;")
    public class95 method778() {
        if (this.field952 == null) {
            return null;
        }
        class95[] var1 = new class95[this.field952.length];
        for (int var2 = 0; var2 < this.field952.length; var2++) {
            var1[var2] = class95.method1899(Statics.field953, this.field952[var2], 0);
        }
        class95 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class95(var1, var1.length);
        }
        if (this.field966 != null) {
            for (int var4 = 0; var4 < this.field966.length; var4++) {
                var3.method1912(this.field966[var4], this.field959[var4]);
            }
        }
        if (this.field960 != null) {
            for (int var5 = 0; var5 < this.field960.length; var5++) {
                var3.method1913(this.field960[var5], this.field963[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("ay.l(I)Z")
    public boolean method791() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field962[var2] != -1 && !Statics.field953.method2877(this.field962[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ay.m(I)Lcl;")
    public class95 method774() {
        class95[] var1 = new class95[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field962[var3] != -1) {
                var1[var2++] = class95.method1899(Statics.field953, this.field962[var3], 0);
            }
        }
        class95 var4 = new class95(var1, var2);
        if (this.field966 != null) {
            for (int var5 = 0; var5 < this.field966.length; var5++) {
                var4.method1912(this.field966[var5], this.field959[var5]);
            }
        }
        if (this.field960 != null) {
            for (int var6 = 0; var6 < this.field960.length; var6++) {
                var4.method1913(this.field960[var6], this.field963[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("v.o(I)V")
    public static void method508() {
        field955.method3246();
    }
}
