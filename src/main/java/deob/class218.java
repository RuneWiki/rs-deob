package deob;

@ObfuscatedName("hk")
public class class218 {

    @ObfuscatedName("hk.w")
    public class123[] field2518;

    @ObfuscatedName("hk.v")
    public int field2517;

    public class218(class474 arg0, int arg1) {
        this.field2518 = new class123[arg1];
        this.field2517 = arg0.method7964();
        for (int var3 = 0; var3 < this.field2518.length; var3++) {
            class123 var4 = new class123(this.field2517, arg0, false);
            this.field2518[var3] = var4;
        }
        this.method4086();
    }

    @ObfuscatedName("hk.f(I)V")
    public void method4086() {
        class123[] var1 = this.field2518;
        for (int var2 = 0; var2 < var1.length; var2++) {
            class123 var3 = var1[var2];
            if (var3.field1492 >= 0) {
                var3.field1501 = this.field2518[var3.field1492];
            }
        }
    }

    @ObfuscatedName("hk.w(B)I")
    public int method4084() {
        return this.field2518.length;
    }

    @ObfuscatedName("hk.v(II)Ldc;")
    public class123 method4081(int arg0) {
        return arg0 >= this.method4084() ? null : this.field2518[arg0];
    }

    @ObfuscatedName("hk.s(B)[Ldc;")
    public class123[] method4087() {
        return this.field2518;
    }

    @ObfuscatedName("hk.z(Lei;II)V")
    public void method4099(class134 arg0, int arg1) {
        this.method4079(arg0, arg1, (boolean[]) null, false);
    }

    @ObfuscatedName("hk.j(Lei;I[ZZI)V")
    public void method4079(class134 arg0, int arg1, boolean[] arg2, boolean arg3) {
        int var5 = arg0.method2971();
        int var6 = 0;
        class123[] var7 = this.method4087();
        for (int var8 = 0; var8 < var7.length; var8++) {
            class123 var9 = var7[var8];
            if (arg2 == null || arg2[var6] == arg3) {
                arg0.method2951(arg1, var9, var6, var5);
            }
            var6++;
        }
    }
}
