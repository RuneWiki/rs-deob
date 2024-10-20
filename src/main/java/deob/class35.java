package deob;

@ObfuscatedName("ax")
public class class35 extends class172 {

    @ObfuscatedName("ax.p")
    public static class168 field918 = new class168(64);

    @ObfuscatedName("ax.i")
    public int field919 = -1;

    @ObfuscatedName("ax.v")
    public int[] field920;

    @ObfuscatedName("ax.l")
    public short[] field927;

    @ObfuscatedName("ax.m")
    public short[] field931;

    @ObfuscatedName("ax.g")
    public short[] field923;

    @ObfuscatedName("ax.t")
    public short[] field932;

    @ObfuscatedName("ax.o")
    public int[] field925 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("ax.b")
    public boolean field926 = false;

    @ObfuscatedName("au.z(IB)Lax;")
    public static class35 method561(int arg0) {
        class35 var1 = (class35) field918.method3240((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field921.method2951(3, arg0);
        class35 var3 = new class35();
        if (var2 != null) {
            var3.method761(new class126(var2));
        }
        field918.method3237(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ax.h(Ldq;B)V")
    public void method761(class126 arg0) {
        while (true) {
            int var2 = arg0.method2450();
            if (var2 == 0) {
                return;
            }
            this.method763(arg0, var2);
        }
    }

    @ObfuscatedName("ax.c(Ldq;II)V")
    public void method763(class126 arg0, int arg1) {
        if (arg1 == 1) {
            this.field919 = arg0.method2450();
        } else if (arg1 == 2) {
            int var3 = arg0.method2450();
            this.field920 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field920[var4] = arg0.method2627();
            }
        } else if (arg1 == 3) {
            this.field926 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method2450();
            this.field927 = new short[var5];
            this.field931 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field927[var6] = (short) arg0.method2627();
                this.field931[var6] = (short) arg0.method2627();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2450();
            this.field923 = new short[var7];
            this.field932 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field923[var8] = (short) arg0.method2627();
                this.field932[var8] = (short) arg0.method2627();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field925[arg1 - 60] = arg0.method2627();
        }
    }

    @ObfuscatedName("ax.p(S)Z")
    public boolean method764() {
        if (this.field920 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field920.length; var2++) {
            if (!Statics.field2640.method2995(this.field920[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ax.i(B)Lcj;")
    public class100 method765() {
        if (this.field920 == null) {
            return null;
        }
        class100[] var1 = new class100[this.field920.length];
        for (int var2 = 0; var2 < this.field920.length; var2++) {
            var1[var2] = class100.method2037(Statics.field2640, this.field920[var2], 0);
        }
        class100 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class100(var1, var1.length);
        }
        if (this.field927 != null) {
            for (int var4 = 0; var4 < this.field927.length; var4++) {
                var3.method2059(this.field927[var4], this.field931[var4]);
            }
        }
        if (this.field923 != null) {
            for (int var5 = 0; var5 < this.field923.length; var5++) {
                var3.method2082(this.field923[var5], this.field932[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("ax.v(I)Z")
    public boolean method781() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field925[var2] != -1 && !Statics.field2640.method2995(this.field925[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ax.l(I)Lcj;")
    public class100 method766() {
        class100[] var1 = new class100[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field925[var3] != -1) {
                var1[var2++] = class100.method2037(Statics.field2640, this.field925[var3], 0);
            }
        }
        class100 var4 = new class100(var1, var2);
        if (this.field927 != null) {
            for (int var5 = 0; var5 < this.field927.length; var5++) {
                var4.method2059(this.field927[var5], this.field931[var5]);
            }
        }
        if (this.field923 != null) {
            for (int var6 = 0; var6 < this.field923.length; var6++) {
                var4.method2082(this.field923[var6], this.field932[var6]);
            }
        }
        return var4;
    }
}
