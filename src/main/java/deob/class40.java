package deob;

@ObfuscatedName("aq")
public class class40 extends class182 {

    @ObfuscatedName("aq.b")
    public static class171 field956 = new class171(64);

    @ObfuscatedName("aq.w")
    public int field959 = -1;

    @ObfuscatedName("aq.r")
    public int[] field958;

    @ObfuscatedName("aq.l")
    public short[] field961;

    @ObfuscatedName("aq.s")
    public short[] field962;

    @ObfuscatedName("aq.f")
    public short[] field963;

    @ObfuscatedName("aq.x")
    public short[] field960;

    @ObfuscatedName("aq.h")
    public int[] field965 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("aq.a")
    public boolean field966 = false;

    @ObfuscatedName("ey.e(IB)Laq;")
    public static class40 method2618(int arg0) {
        class40 var1 = (class40) field956.method3058((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field964.method2709(3, arg0);
        class40 var3 = new class40();
        if (var2 != null) {
            var3.method755(new class107(var2));
        }
        field956.method3057(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aq.o(Ldl;I)V")
    public void method755(class107 arg0) {
        while (true) {
            int var2 = arg0.method2123();
            if (var2 == 0) {
                return;
            }
            this.method768(arg0, var2);
        }
    }

    @ObfuscatedName("aq.y(Ldl;II)V")
    public void method768(class107 arg0, int arg1) {
        if (arg1 == 1) {
            this.field959 = arg0.method2123();
        } else if (arg1 == 2) {
            int var3 = arg0.method2123();
            this.field958 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field958[var4] = arg0.method2232();
            }
        } else if (arg1 == 3) {
            this.field966 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2123();
            this.field961 = new short[var5];
            this.field962 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field961[var6] = (short) arg0.method2232();
                this.field962[var6] = (short) arg0.method2232();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2123();
            this.field963 = new short[var7];
            this.field960 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field963[var8] = (short) arg0.method2232();
                this.field960[var8] = (short) arg0.method2232();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field965[arg1 - 60] = arg0.method2232();
        }
    }

    @ObfuscatedName("aq.b(I)Z")
    public boolean method757() {
        if (this.field958 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field958.length; var2++) {
            if (!Statics.field955.method2649(this.field958[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("aq.w(I)Lck;")
    public class93 method758() {
        if (this.field958 == null) {
            return null;
        }
        class93[] var1 = new class93[this.field958.length];
        for (int var2 = 0; var2 < this.field958.length; var2++) {
            var1[var2] = class93.method1831(Statics.field955, this.field958[var2], 0);
        }
        class93 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class93(var1, var1.length);
        }
        if (this.field961 != null) {
            for (int var4 = 0; var4 < this.field961.length; var4++) {
                var3.method1868(this.field961[var4], this.field962[var4]);
            }
        }
        if (this.field963 != null) {
            for (int var5 = 0; var5 < this.field963.length; var5++) {
                var3.method1844(this.field963[var5], this.field960[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("aq.r(B)Z")
    public boolean method759() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field965[var2] != -1 && !Statics.field955.method2649(this.field965[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("aq.l(I)Lck;")
    public class93 method777() {
        class93[] var1 = new class93[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field965[var3] != -1) {
                var1[var2++] = class93.method1831(Statics.field955, this.field965[var3], 0);
            }
        }
        class93 var4 = new class93(var1, var2);
        if (this.field961 != null) {
            for (int var5 = 0; var5 < this.field961.length; var5++) {
                var4.method1868(this.field961[var5], this.field962[var5]);
            }
        }
        if (this.field963 != null) {
            for (int var6 = 0; var6 < this.field963.length; var6++) {
                var4.method1844(this.field963[var6], this.field960[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ds.s(I)V")
    public static void method2290() {
        field956.method3065();
    }
}
