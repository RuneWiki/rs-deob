package deob;

@ObfuscatedName("ai")
public class class36 extends class174 {

    @ObfuscatedName("ai.i")
    public static class170 field930 = new class170(64);

    @ObfuscatedName("ai.k")
    public int field927 = -1;

    @ObfuscatedName("ai.q")
    public int[] field928;

    @ObfuscatedName("ai.t")
    public short[] field926;

    @ObfuscatedName("ai.v")
    public short[] field936;

    @ObfuscatedName("ai.y")
    public short[] field931;

    @ObfuscatedName("ai.w")
    public short[] field932;

    @ObfuscatedName("ai.g")
    public int[] field925 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("ai.s")
    public boolean field934 = false;

    @ObfuscatedName("ai.c(Ldv;I)V")
    public void method760(class127 arg0) {
        while (true) {
            int var2 = arg0.method2416();
            if (var2 == 0) {
                return;
            }
            this.method747(arg0, var2);
        }
    }

    @ObfuscatedName("ai.j(Ldv;II)V")
    public void method747(class127 arg0, int arg1) {
        if (arg1 == 1) {
            this.field927 = arg0.method2416();
        } else if (arg1 == 2) {
            int var3 = arg0.method2416();
            this.field928 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field928[var4] = arg0.method2394();
            }
        } else if (arg1 == 3) {
            this.field934 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2416();
            this.field926 = new short[var5];
            this.field936 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field926[var6] = (short) arg0.method2394();
                this.field936[var6] = (short) arg0.method2394();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2416();
            this.field931 = new short[var7];
            this.field932 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field931[var8] = (short) arg0.method2394();
                this.field932[var8] = (short) arg0.method2394();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field925[arg1 - 60] = arg0.method2394();
        }
    }

    @ObfuscatedName("ai.i(I)Z")
    public boolean method745() {
        if (this.field928 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field928.length; var2++) {
            if (!Statics.field924.method3032(this.field928[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ai.k(I)Lcu;")
    public class101 method758() {
        if (this.field928 == null) {
            return null;
        }
        class101[] var1 = new class101[this.field928.length];
        for (int var2 = 0; var2 < this.field928.length; var2++) {
            var1[var2] = class101.method2065(Statics.field924, this.field928[var2], 0);
        }
        class101 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class101(var1, var1.length);
        }
        if (this.field926 != null) {
            for (int var4 = 0; var4 < this.field926.length; var4++) {
                var3.method2077(this.field926[var4], this.field936[var4]);
            }
        }
        if (this.field931 != null) {
            for (int var5 = 0; var5 < this.field931.length; var5++) {
                var3.method2013(this.field931[var5], this.field932[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("ai.q(I)Z")
    public boolean method748() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field925[var2] != -1 && !Statics.field924.method3032(this.field925[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ai.t(I)Lcu;")
    public class101 method762() {
        class101[] var1 = new class101[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field925[var3] != -1) {
                var1[var2++] = class101.method2065(Statics.field924, this.field925[var3], 0);
            }
        }
        class101 var4 = new class101(var1, var2);
        if (this.field926 != null) {
            for (int var5 = 0; var5 < this.field926.length; var5++) {
                var4.method2077(this.field926[var5], this.field936[var5]);
            }
        }
        if (this.field931 != null) {
            for (int var6 = 0; var6 < this.field931.length; var6++) {
                var4.method2013(this.field931[var6], this.field932[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("df.v(B)V")
    public static void method2176() {
        field930.method3191();
    }
}
