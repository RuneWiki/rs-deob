package deob;

@ObfuscatedName("gb")
public class class203 {

    @ObfuscatedName("gb.q")
    public class116[] field2407;

    @ObfuscatedName("gb.l")
    public int field2406;

    public class203(class440 arg0, int arg1) {
        this.field2407 = new class116[arg1];
        this.field2406 = arg0.method7071();
        for (int var3 = 0; var3 < this.field2407.length; var3++) {
            class116 var4 = new class116(this.field2406, arg0, false);
            this.field2407[var3] = var4;
        }
        this.method3695();
    }

    @ObfuscatedName("gb.o(B)V")
    public void method3695() {
        class116[] var1 = this.field2407;
        for (int var2 = 0; var2 < var1.length; var2++) {
            class116 var3 = var1[var2];
            if (var3.field1456 >= 0) {
                var3.field1448 = this.field2407[var3.field1456];
            }
        }
    }

    @ObfuscatedName("gb.q(I)I")
    public int method3700() {
        return this.field2407.length;
    }

    @ObfuscatedName("gb.l(II)Ldb;")
    public class116 method3694(int arg0) {
        return this.field2407[arg0];
    }

    @ObfuscatedName("gb.k(I)[Ldb;")
    public class116[] method3696() {
        return this.field2407;
    }

    @ObfuscatedName("gb.a(Lds;II)V")
    public void method3697(class123 arg0, int arg1) {
        this.method3711(arg0, arg1, (boolean[]) null, false);
    }

    @ObfuscatedName("gb.m(Lds;I[ZZS)V")
    public void method3711(class123 arg0, int arg1, boolean[] arg2, boolean arg3) {
        int var5 = arg0.method2605();
        int var6 = 0;
        class116[] var7 = this.method3696();
        for (int var8 = 0; var8 < var7.length; var8++) {
            class116 var9 = var7[var8];
            if (arg2 == null || arg2[var6] == arg3) {
                arg0.method2608(arg1, var9, var6, var5);
            }
            var6++;
        }
    }
}
