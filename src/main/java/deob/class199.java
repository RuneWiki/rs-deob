package deob;

@ObfuscatedName("hj")
public class class199 extends class489 {

    @ObfuscatedName("hj.at")
    public static class304 field2033 = new class304(64);

    @ObfuscatedName("hj.an")
    public int field2040 = -1;

    @ObfuscatedName("hj.ao")
    public int[] field2034;

    @ObfuscatedName("hj.ab")
    public short[] field2036;

    @ObfuscatedName("hj.aw")
    public short[] field2037;

    @ObfuscatedName("hj.ad")
    public short[] field2043;

    @ObfuscatedName("hj.al")
    public short[] field2039;

    @ObfuscatedName("hj.as")
    public int[] field2041 = new int[] { -1, -1, -1, -1, -1 };

    @ObfuscatedName("hj.ag")
    public boolean field2031 = false;

    @ObfuscatedName("hy.az(II)Lhj;")
    public static class199 method3414(int arg0) {
        class199 var1 = (class199) field2033.method5336((long) arg0);
        if (var1 != null) {
            return var1;
        } else if (Statics.field2035 == null) {
            return null;
        } else {
            byte[] var2 = Statics.field2035.method6328(3, arg0);
            class199 var3 = new class199();
            if (var2 != null) {
                var3.method3454(new class535(var2));
            }
            field2033.method5346(var3, (long) arg0);
            return var3;
        }
    }

    @ObfuscatedName("hj.ah(Lur;S)V")
    public void method3454(class535 arg0) {
        while (true) {
            int var2 = arg0.method8462();
            if (var2 == 0) {
                return;
            }
            this.method3462(arg0, var2);
        }
    }

    @ObfuscatedName("hj.af(Lur;II)V")
    public void method3462(class535 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2040 = arg0.method8462();
        } else if (arg1 == 2) {
            int var3 = arg0.method8462();
            this.field2034 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2034[var4] = arg0.method8670();
            }
        } else if (arg1 == 3) {
            this.field2031 = true;
        } else if (arg1 == 40) {
            int var5 = arg0.method8462();
            this.field2036 = new short[var5];
            this.field2037 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2036[var6] = (short) arg0.method8670();
                this.field2037[var6] = (short) arg0.method8670();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method8462();
            this.field2043 = new short[var7];
            this.field2039 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2043[var8] = (short) arg0.method8670();
                this.field2039[var8] = (short) arg0.method8670();
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field2041[arg1 - 60] = arg0.method8670();
        }
    }

    @ObfuscatedName("hj.at(I)Z")
    public boolean method3457() {
        if (this.field2034 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2034.length; var2++) {
            if (!Statics.field2032.method6330(this.field2034[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("hj.an(B)Ljj;")
    public class238 method3485() {
        if (this.field2034 == null) {
            return null;
        }
        class238[] var1 = new class238[this.field2034.length];
        for (int var2 = 0; var2 < this.field2034.length; var2++) {
            var1[var2] = class238.method4116(Statics.field2032, this.field2034[var2], 0);
        }
        class238 var3;
        if (var1.length == 1) {
            var3 = var1[0];
        } else {
            var3 = new class238(var1, var1.length);
        }
        if (this.field2036 != null) {
            for (int var4 = 0; var4 < this.field2036.length; var4++) {
                var3.method4131(this.field2036[var4], this.field2037[var4]);
            }
        }
        if (this.field2043 != null) {
            for (int var5 = 0; var5 < this.field2043.length; var5++) {
                var3.method4135(this.field2043[var5], this.field2039[var5]);
            }
        }
        return var3;
    }

    @ObfuscatedName("hj.ao(I)Z")
    public boolean method3458() {
        boolean var1 = true;
        for (int var2 = 0; var2 < 5; var2++) {
            if (this.field2041[var2] != -1 && !Statics.field2032.method6330(this.field2041[var2], 0)) {
                var1 = false;
            }
        }
        return var1;
    }

    @ObfuscatedName("hj.ab(I)Ljj;")
    public class238 method3477() {
        class238[] var1 = new class238[5];
        int var2 = 0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field2041[var3] != -1) {
                var1[var2++] = class238.method4116(Statics.field2032, this.field2041[var3], 0);
            }
        }
        class238 var4 = new class238(var1, var2);
        if (this.field2036 != null) {
            for (int var5 = 0; var5 < this.field2036.length; var5++) {
                var4.method4131(this.field2036[var5], this.field2037[var5]);
            }
        }
        if (this.field2043 != null) {
            for (int var6 = 0; var6 < this.field2043.length; var6++) {
                var4.method4135(this.field2043[var6], this.field2039[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("en.aw(B)V")
    public static void method2572() {
        field2033.method5339();
    }
}
