package deob;

@ObfuscatedName("gd")
public class class202 {

    @ObfuscatedName("gd.h")
    public class116[] field2368;

    @ObfuscatedName("gd.w")
    public int field2366;

    public class202(class444 arg0, int arg1) {
        this.field2368 = new class116[arg1];
        this.field2366 = arg0.method6929();
        for (int var3 = 0; var3 < this.field2368.length; var3++) {
            class116 var4 = new class116(this.field2366, arg0, false);
            this.field2368[var3] = var4;
        }
        this.method3696();
    }

    @ObfuscatedName("gd.s(I)V")
    public void method3696() {
        class116[] var1 = this.field2368;
        for (int var2 = 0; var2 < var1.length; var2++) {
            class116 var3 = var1[var2];
            if (var3.field1422 >= 0) {
                var3.field1414 = this.field2368[var3.field1422];
            }
        }
    }

    @ObfuscatedName("gd.h(I)I")
    public int method3693() {
        return this.field2368.length;
    }

    @ObfuscatedName("gd.w(II)Ldp;")
    public class116 method3682(int arg0) {
        return arg0 >= this.method3693() ? null : this.field2368[arg0];
    }

    @ObfuscatedName("gd.v(B)[Ldp;")
    public class116[] method3683() {
        return this.field2368;
    }

    @ObfuscatedName("gd.c(Ldk;II)V")
    public void method3688(class123 arg0, int arg1) {
        this.method3685(arg0, arg1, (boolean[]) null, false);
    }

    @ObfuscatedName("gd.q(Ldk;I[ZZI)V")
    public void method3685(class123 arg0, int arg1, boolean[] arg2, boolean arg3) {
        int var5 = arg0.method2609();
        int var6 = 0;
        class116[] var7 = this.method3683();
        for (int var8 = 0; var8 < var7.length; var8++) {
            class116 var9 = var7[var8];
            if (arg2 == null || arg2[var6] == arg3) {
                arg0.method2596(arg1, var9, var6, var5);
            }
            var6++;
        }
    }
}
