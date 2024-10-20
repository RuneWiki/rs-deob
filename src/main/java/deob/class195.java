package deob;

@ObfuscatedName("ga")
public class class195 {

    @ObfuscatedName("ga.l")
    public class114[] field2286;

    @ObfuscatedName("ga.s")
    public int field2288;

    public class195(class421 arg0, int arg1) {
        this.field2286 = new class114[arg1];
        this.field2288 = arg0.method6686();
        for (int var3 = 0; var3 < this.field2286.length; var3++) {
            class114 var4 = new class114(this.field2288, arg0, false);
            this.field2286[var3] = var4;
        }
        this.method3546();
    }

    @ObfuscatedName("ga.c(S)V")
    public void method3546() {
        class114[] var1 = this.field2286;
        for (int var2 = 0; var2 < var1.length; var2++) {
            class114 var3 = var1[var2];
            if (var3.field1398 >= 0) {
                var3.field1395 = this.field2286[var3.field1398];
            }
        }
    }

    @ObfuscatedName("ga.l(B)I")
    public int method3547() {
        return this.field2286.length;
    }

    @ObfuscatedName("ga.s(II)Ldm;")
    public class114 method3548(int arg0) {
        return this.field2286[arg0];
    }

    @ObfuscatedName("ga.e(B)[Ldm;")
    public class114[] method3554() {
        return this.field2286;
    }

    @ObfuscatedName("ga.r(Ldw;IB)V")
    public void method3550(class121 arg0, int arg1) {
        this.method3549(arg0, arg1, (boolean[]) null, false);
    }

    @ObfuscatedName("ga.o(Ldw;I[ZZI)V")
    public void method3549(class121 arg0, int arg1, boolean[] arg2, boolean arg3) {
        int var5 = arg0.method2533();
        int var6 = 0;
        class114[] var7 = this.method3554();
        for (int var8 = 0; var8 < var7.length; var8++) {
            class114 var9 = var7[var8];
            if (arg2 == null || arg2[var6] == arg3) {
                arg0.method2546(arg1, var9, var6, var5);
            }
            var6++;
        }
    }
}
