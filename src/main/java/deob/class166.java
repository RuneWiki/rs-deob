package deob;

@ObfuscatedName("fh")
public class class166 extends class382 {

    @ObfuscatedName("fh.m")
    public static class249 field1784 = new class249(64);

    @ObfuscatedName("fh.t")
    public int field1785 = -1;

    @ObfuscatedName("fh.s")
    public int[] field1786;

    @ObfuscatedName("fh.j")
    public short[] field1792;

    @ObfuscatedName("fh.w")
    public short[] field1788;

    @ObfuscatedName("fh.n")
    public short[] field1782;

    @ObfuscatedName("fh.r")
    public short[] field1781;

    @ObfuscatedName("fh.o")
    public int[] field1791 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("fh.v")
    public boolean field1783 = false;

    @ObfuscatedName("my.b(II)Lfh;")
    public static class166 method5923(int arg0) {
        class166 var1 = (class166) field1784.method4514((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1789.method5053(3, arg0);
        class166 var3 = new class166();
        if (var2 != null) {
            var3.method2910(new class419(var2));
        }
        field1784.method4515(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("fh.p(Lpi;B)V")
    public void method2910(class419 arg0) {
        while (true) {
            int var2 = arg0.method6781();
            if (var2 == 0) {
                return;
            }
            this.method2925(arg0, var2);
        }
    }

    @ObfuscatedName("fh.m(Lpi;II)V")
    public void method2925(class419 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1785 = arg0.method6781();
        } else if (arg1 == 2) {
            int var3 = arg0.method6781();
            this.field1786 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1786[var4] = arg0.method6672();
            }
        } else if (arg1 == 3) {
            this.field1783 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method6781();
            this.field1792 = new short[var5];
            this.field1788 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1792[var6] = (short) arg0.method6672();
                this.field1788[var6] = (short) arg0.method6672();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method6781();
            this.field1782 = new short[var7];
            this.field1781 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1782[var8] = (short) arg0.method6672();
                this.field1781[var8] = (short) arg0.method6672();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field1791[arg1 - 60] = arg0.method6672();
        }
    }

    @ObfuscatedName("fh.t(B)Z")
    public boolean method2912() {
        if (this.field1786 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field1786.length; var2++) {
            if (!Statics.field1790.method5055(this.field1786[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("fh.s(I)Lge;")
    public class189 method2913() {
        if (this.field1786 == null) {
            return null;
        }
        class189[] var1 = new class189[this.field1786.length];
        for (int var2 = 0; var2 < this.field1786.length; var2++) {
            var1[var2] = class189.method3427(Statics.field1790, this.field1786[var2], 0);
        }
        class189 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class189(var1, var1.length);
        }
        if (this.field1792 != null) {
            for (int var4 = 0; var4 < this.field1792.length; var4++) {
                var3.method3443(this.field1792[var4], this.field1788[var4]);
            }
        }
        if (this.field1782 != null) {
            for (int var5 = 0; var5 < this.field1782.length; var5++) {
                var3.method3456(this.field1782[var5], this.field1781[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("fh.j(I)Z")
    public boolean method2911() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field1791[var2] != -1 && !Statics.field1790.method5055(this.field1791[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("fh.w(B)Lge;")
    public class189 method2931() {
        class189[] var1 = new class189[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field1791[var3] != -1) {
                var1[var2++] = class189.method3427(Statics.field1790, this.field1791[var3], 0);
            }
        }
        class189 var4 = new class189(var1, var2);
        if (this.field1792 != null) {
            for (int var5 = 0; var5 < this.field1792.length; var5++) {
                var4.method3443(this.field1792[var5], this.field1788[var5]);
            }
        }
        if (this.field1782 != null) {
            for (int var6 = 0; var6 < this.field1782.length; var6++) {
                var4.method3456(this.field1782[var6], this.field1781[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("bg.n(I)V")
    public static void method1045() {
        field1784.method4518();
    }
}
