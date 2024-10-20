package deob;

@ObfuscatedName("kn")
public class class273 {

    @ObfuscatedName("kn.aw")
    public class130[] field2825;

    @ObfuscatedName("kn.al")
    public int field2826;

    public class273(class534 arg0, int arg1) {
        this.field2825 = new class130[arg1];
        this.field2826 = arg0.method8591();
        for (int var3 = 0; var3 < this.field2825.length; var3++) {
            class130 var4 = new class130(this.field2826, arg0, false);
            this.field2825[var3] = var4;
        }
        this.method4815();
    }

    @ObfuscatedName("kn.aq(I)V")
    public void method4815() {
        class130[] var1 = this.field2825;
        for (int var2 = 0; var2 < var1.length; var2++) {
            class130 var3 = var1[var2];
            if (var3.field1529 >= 0) {
                var3.field1523 = this.field2825[var3.field1529];
            }
        }
    }

    @ObfuscatedName("kn.aw(I)I")
    public int method4814() {
        return this.field2825.length;
    }

    @ObfuscatedName("kn.al(II)Lez;")
    public class130 method4827(int arg0) {
        return arg0 >= this.method4814() ? null : this.field2825[arg0];
    }

    @ObfuscatedName("kn.ai(I)[Lez;")
    public class130[] method4816() {
        return this.field2825;
    }

    @ObfuscatedName("kn.ar(Lfc;II)V")
    public void method4819(class141 arg0, int arg1) {
        this.method4822(arg0, arg1, (boolean[]) null, false);
    }

    @ObfuscatedName("kn.as(Lfc;I[ZZB)V")
    public void method4822(class141 arg0, int arg1, boolean[] arg2, boolean arg3) {
        int var5 = arg0.method2999();
        int var6 = 0;
        class130[] var7 = this.method4816();
        for (int var8 = 0; var8 < var7.length; var8++) {
            class130 var9 = var7[var8];
            if (arg2 == null || arg2[var6] == arg3) {
                arg0.method3003(arg1, var9, var6, var5);
            }
            var6++;
        }
    }
}
