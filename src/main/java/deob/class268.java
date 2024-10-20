package deob;

@ObfuscatedName("kz")
public class class268 {

    @ObfuscatedName("kz.ah")
    public class129[] field2778;

    @ObfuscatedName("kz.ar")
    public int field2780;

    public class268(class527 arg0, int arg1) {
        this.field2778 = new class129[arg1];
        this.field2780 = arg0.method8410();
        for (int var3 = 0; var3 < this.field2778.length; var3++) {
            class129 var4 = new class129(this.field2780, arg0, false);
            this.field2778[var3] = var4;
        }
        this.method4739();
    }

    @ObfuscatedName("kz.at(I)V")
    public void method4739() {
        class129[] var1 = this.field2778;
        for (int var2 = 0; var2 < var1.length; var2++) {
            class129 var3 = var1[var2];
            if (var3.field1508 >= 0) {
                var3.field1498 = this.field2778[var3.field1508];
            }
        }
    }

    @ObfuscatedName("kz.ah(S)I")
    public int method4740() {
        return this.field2778.length;
    }

    @ObfuscatedName("kz.ar(II)Lej;")
    public class129 method4741(int arg0) {
        return arg0 >= this.method4740() ? null : this.field2778[arg0];
    }

    @ObfuscatedName("kz.ao(I)[Lej;")
    public class129[] method4742() {
        return this.field2778;
    }

    @ObfuscatedName("kz.ab(Lfo;IB)V")
    public void method4743(class140 arg0, int arg1) {
        this.method4753(arg0, arg1, (boolean[]) null, false);
    }

    @ObfuscatedName("kz.au(Lfo;I[ZZI)V")
    public void method4753(class140 arg0, int arg1, boolean[] arg2, boolean arg3) {
        int var5 = arg0.method3031();
        int var6 = 0;
        class129[] var7 = this.method4742();
        for (int var8 = 0; var8 < var7.length; var8++) {
            class129 var9 = var7[var8];
            if (arg2 == null || arg2[var6] == arg3) {
                arg0.method3008(arg1, var9, var6, var5);
            }
            var6++;
        }
    }
}
