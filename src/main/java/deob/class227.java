package deob;

@ObfuscatedName("id")
public class class227 {

    @ObfuscatedName("id.an")
    public class127[] field2526;

    @ObfuscatedName("id.av")
    public int field2527;

    public class227(class501 arg0, int arg1) {
        this.field2526 = new class127[arg1];
        this.field2527 = arg0.method8129();
        for (int var3 = 0; var3 < this.field2526.length; var3++) {
            class127 var4 = new class127(this.field2527, arg0, false);
            this.field2526[var3] = var4;
        }
        this.method4101();
    }

    @ObfuscatedName("id.at(B)V")
    public void method4101() {
        class127[] var1 = this.field2526;
        for (int var2 = 0; var2 < var1.length; var2++) {
            class127 var3 = var1[var2];
            if (var3.field1478 >= 0) {
                var3.field1471 = this.field2526[var3.field1478];
            }
        }
    }

    @ObfuscatedName("id.an(I)I")
    public int method4091() {
        return this.field2526.length;
    }

    @ObfuscatedName("id.av(II)Lej;")
    public class127 method4094(int arg0) {
        return arg0 >= this.method4091() ? null : this.field2526[arg0];
    }

    @ObfuscatedName("id.as(B)[Lej;")
    public class127[] method4095() {
        return this.field2526;
    }

    @ObfuscatedName("id.ax(Lfz;II)V")
    public void method4096(class137 arg0, int arg1) {
        this.method4097(arg0, arg1, (boolean[]) null, false);
    }

    @ObfuscatedName("id.ap(Lfz;I[ZZB)V")
    public void method4097(class137 arg0, int arg1, boolean[] arg2, boolean arg3) {
        int var5 = arg0.method2890();
        int var6 = 0;
        class127[] var7 = this.method4095();
        for (int var8 = 0; var8 < var7.length; var8++) {
            class127 var9 = var7[var8];
            if (arg2 == null || arg2[var6] == arg3) {
                arg0.method2892(arg1, var9, var6, var5);
            }
            var6++;
        }
    }
}
