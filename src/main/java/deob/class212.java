package deob;

@ObfuscatedName("hh")
public class class212 {

    @ObfuscatedName("hh.f")
    public class123[] field2440;

    @ObfuscatedName("hh.c")
    public int field2439;

    public class212(class464 arg0, int arg1) {
        this.field2440 = new class123[arg1];
        this.field2439 = arg0.method7735();
        for (int var3 = 0; var3 < this.field2440.length; var3++) {
            class123 var4 = new class123(this.field2439, arg0, false);
            this.field2440[var3] = var4;
        }
        this.method3890();
    }

    @ObfuscatedName("hh.a(I)V")
    public void method3890() {
        class123[] var1 = this.field2440;
        for (int var2 = 0; var2 < var1.length; var2++) {
            class123 var3 = var1[var2];
            if (var3.field1457 >= 0) {
                var3.field1458 = this.field2440[var3.field1457];
            }
        }
    }

    @ObfuscatedName("hh.f(S)I")
    public int method3899() {
        return this.field2440.length;
    }

    @ObfuscatedName("hh.c(II)Ldi;")
    public class123 method3897(int arg0) {
        return arg0 >= this.method3899() ? null : this.field2440[arg0];
    }

    @ObfuscatedName("hh.x(I)[Ldi;")
    public class123[] method3905() {
        return this.field2440;
    }

    @ObfuscatedName("hh.h(Ldh;IB)V")
    public void method3894(class130 arg0, int arg1) {
        this.method3895(arg0, arg1, (boolean[]) null, false);
    }

    @ObfuscatedName("hh.j(Ldh;I[ZZI)V")
    public void method3895(class130 arg0, int arg1, boolean[] arg2, boolean arg3) {
        int var5 = arg0.method2798();
        int var6 = 0;
        class123[] var7 = this.method3905();
        for (int var8 = 0; var8 < var7.length; var8++) {
            class123 var9 = var7[var8];
            if (arg2 == null || arg2[var6] == arg3) {
                arg0.method2815(arg1, var9, var6, var5);
            }
            var6++;
        }
    }
}
