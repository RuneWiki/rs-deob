package deob;

@ObfuscatedName("jr")
public class class242 {

    @ObfuscatedName("jr.al")
    public class130[] field2564;

    @ObfuscatedName("jr.ak")
    public int field2562;

    public class242(class530 arg0, int arg1) {
        this.field2564 = new class130[arg1];
        this.field2562 = arg0.method8365();
        for (int var3 = 0; var3 < this.field2564.length; var3++) {
            class130 var4 = new class130(this.field2562, arg0, false);
            this.field2564[var3] = var4;
        }
        this.method4237();
    }

    @ObfuscatedName("jr.ac(B)V")
    public void method4237() {
        class130[] var1 = this.field2564;
        for (int var2 = 0; var2 < var1.length; var2++) {
            class130 var3 = var1[var2];
            if (var3.field1522 >= 0) {
                var3.field1507 = this.field2564[var3.field1522];
            }
        }
    }

    @ObfuscatedName("jr.al(I)I")
    public int method4239() {
        return this.field2564.length;
    }

    @ObfuscatedName("jr.ak(II)Led;")
    public class130 method4246(int arg0) {
        return arg0 >= this.method4239() ? null : this.field2564[arg0];
    }

    @ObfuscatedName("jr.ax(I)[Led;")
    public class130[] method4241() {
        return this.field2564;
    }

    @ObfuscatedName("jr.ao(Lfk;II)V")
    public void method4247(class140 arg0, int arg1) {
        this.method4243(arg0, arg1, (boolean[]) null, false);
    }

    @ObfuscatedName("jr.ah(Lfk;I[ZZI)V")
    public void method4243(class140 arg0, int arg1, boolean[] arg2, boolean arg3) {
        int var5 = arg0.method2954();
        int var6 = 0;
        class130[] var7 = this.method4241();
        for (int var8 = 0; var8 < var7.length; var8++) {
            class130 var9 = var7[var8];
            if (arg2 == null || arg2[var6] == arg3) {
                arg0.method2936(arg1, var9, var6, var5);
            }
            var6++;
        }
    }
}
