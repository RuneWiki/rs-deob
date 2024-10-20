package deob;

@ObfuscatedName("ho")
public class class201 extends class500 {

    @ObfuscatedName("ho.az")
    public static class312 field2045 = new class312(64);

    @ObfuscatedName("ho.af")
    public int field2055 = -1;

    @ObfuscatedName("ho.aa")
    public int[] field2047;

    @ObfuscatedName("ho.at")
    public short[] field2048;

    @ObfuscatedName("ho.ab")
    public short[] field2049;

    @ObfuscatedName("ho.ac")
    public short[] field2050;

    @ObfuscatedName("ho.ao")
    public short[] field2051;

    @ObfuscatedName("ho.ah")
    public int[] field2054 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("ho.av")
    public boolean field2046 = false;

    @ObfuscatedName("fa.ak(IB)Lho;")
    public static class201 method2995(int arg0) {
        class201 var1 = (class201) field2045.method5570((long) arg0);
        if (var1 != null) {
            return var1;
        } else if (Statics.field2044 == null) {
            return null;
        } else {
            byte[] var2 = Statics.field2044.method6573(3, arg0);
            class201 var3 = new class201();
            if (var2 != null) {
                var3.method3571(new class546(var2));
            }
            field2045.method5564(var3, (long) arg0);
            return var3;
        }
    }

    @ObfuscatedName("ho.al(Lua;I)V")
    public void method3571(class546 arg0) {
        while (true) {
            int var2 = arg0.method8796();
            if (var2 == 0) {
                return;
            }
            this.method3581(arg0, var2);
        }
    }

    @ObfuscatedName("ho.aj(Lua;II)V")
    public void method3581(class546 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2055 = arg0.method8796();
        } else if (arg1 == 2) {
            int var3 = arg0.method8796();
            this.field2047 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2047[var4] = arg0.method8798();
            }
        } else if (arg1 == 3) {
            this.field2046 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method8796();
            this.field2048 = new short[var5];
            this.field2049 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2048[var6] = (short) arg0.method8798();
                this.field2049[var6] = (short) arg0.method8798();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method8796();
            this.field2050 = new short[var7];
            this.field2051 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2050[var8] = (short) arg0.method8798();
                this.field2051[var8] = (short) arg0.method8798();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field2054[arg1 - 60] = arg0.method8798();
        }
    }

    @ObfuscatedName("ho.az(B)Z")
    public boolean method3573() {
        if (this.field2047 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2047.length; var2++) {
            if (!Statics.field1753.method6586(this.field2047[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ho.af(I)Ljb;")
    public class243 method3574() {
        if (this.field2047 == null) {
            return null;
        }
        class243[] var1 = new class243[this.field2047.length];
        for (int var2 = 0; var2 < this.field2047.length; var2++) {
            var1[var2] = class243.method4274(Statics.field1753, this.field2047[var2], 0);
        }
        class243 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class243(var1, var1.length);
        }
        if (this.field2048 != null) {
            for (int var4 = 0; var4 < this.field2048.length; var4++) {
                var3.method4253(this.field2048[var4], this.field2049[var4]);
            }
        }
        if (this.field2050 != null) {
            for (int var5 = 0; var5 < this.field2050.length; var5++) {
                var3.method4280(this.field2050[var5], this.field2051[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("ho.aa(I)Z")
    public boolean method3572() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field2054[var2] != -1 && !Statics.field1753.method6586(this.field2054[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("ho.at(I)Ljb;")
    public class243 method3576() {
        class243[] var1 = new class243[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field2054[var3] != -1) {
                var1[var2++] = class243.method4274(Statics.field1753, this.field2054[var3], 0);
            }
        }
        class243 var4 = new class243(var1, var2);
        if (this.field2048 != null) {
            for (int var5 = 0; var5 < this.field2048.length; var5++) {
                var4.method4253(this.field2048[var5], this.field2049[var5]);
            }
        }
        if (this.field2050 != null) {
            for (int var6 = 0; var6 < this.field2050.length; var6++) {
                var4.method4280(this.field2050[var6], this.field2051[var6]);
            }
        }
        return var4;
    }
}
