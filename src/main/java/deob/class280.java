package deob;

@ObfuscatedName("kj")
public class class280 {

    @ObfuscatedName("kj.ad")
    public class133[] field2894;

    @ObfuscatedName("kj.ag")
    public int field2897;

    public class280(class547 arg0, int arg1) {
        this.field2894 = new class133[arg1];
        this.field2897 = arg0.method8804();
        for (int var3 = 0; var3 < this.field2894.length; var3++) {
            class133 var4 = new class133(this.field2897, arg0, false);
            this.field2894[var3] = var4;
        }
        this.method4856();
    }

    @ObfuscatedName("kj.aq(I)V")
    public void method4856() {
        class133[] var1 = this.field2894;
        for (int var2 = 0; var2 < var1.length; var2++) {
            class133 var3 = var1[var2];
            if (var3.field1547 >= 0) {
                var3.field1555 = this.field2894[var3.field1547];
            }
        }
    }

    @ObfuscatedName("kj.ad(I)I")
    public int method4868() {
        return this.field2894.length;
    }

    @ObfuscatedName("kj.ag(II)Lfv;")
    public class133 method4855(int arg0) {
        return arg0 >= this.method4868() ? null : this.field2894[arg0];
    }

    @ObfuscatedName("kj.ak(B)[Lfv;")
    public class133[] method4854() {
        return this.field2894;
    }

    @ObfuscatedName("kj.ap(Lft;IB)V")
    public void method4857(class143 arg0, int arg1) {
        this.method4858(arg0, arg1, (boolean[]) null, false);
    }

    @ObfuscatedName("kj.an(Lft;I[ZZI)V")
    public void method4858(class143 arg0, int arg1, boolean[] arg2, boolean arg3) {
        int var5 = arg0.method3044();
        int var6 = 0;
        class133[] var7 = this.method4854();
        for (int var8 = 0; var8 < var7.length; var8++) {
            class133 var9 = var7[var8];
            if (arg2 == null || arg2[var6] == arg3) {
                arg0.method3050(arg1, var9, var6, var5);
            }
            var6++;
        }
    }
}
