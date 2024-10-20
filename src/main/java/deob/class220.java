package deob;

@ObfuscatedName("ic")
public class class220 {

    @ObfuscatedName("ic.an")
    public class123[] field2524;

    @ObfuscatedName("ic.aw")
    public int field2526;

    public class220(class489 arg0, int arg1) {
        this.field2524 = new class123[arg1];
        this.field2526 = arg0.method8248();
        for (int var3 = 0; var3 < this.field2524.length; var3++) {
            class123 var4 = new class123(this.field2526, arg0, false);
            this.field2524[var3] = var4;
        }
        this.method4101();
    }

    @ObfuscatedName("ic.af(I)V")
    public void method4101() {
        class123[] var1 = this.field2524;
        for (int var2 = 0; var2 < var1.length; var2++) {
            class123 var3 = var1[var2];
            if (var3.field1482 >= 0) {
                var3.field1479 = this.field2524[var3.field1482];
            }
        }
    }

    @ObfuscatedName("ic.an(I)I")
    public int method4100() {
        return this.field2524.length;
    }

    @ObfuscatedName("ic.aw(IB)Lew;")
    public class123 method4102(int arg0) {
        return arg0 >= this.method4100() ? null : this.field2524[arg0];
    }

    @ObfuscatedName("ic.ac(B)[Lew;")
    public class123[] method4104() {
        return this.field2524;
    }

    @ObfuscatedName("ic.au(Lfh;II)V")
    public void method4105(class134 arg0, int arg1) {
        this.method4122(arg0, arg1, (boolean[]) null, false);
    }

    @ObfuscatedName("ic.ab(Lfh;I[ZZI)V")
    public void method4122(class134 arg0, int arg1, boolean[] arg2, boolean arg3) {
        int var5 = arg0.method2981();
        int var6 = 0;
        class123[] var7 = this.method4104();
        for (int var8 = 0; var8 < var7.length; var8++) {
            class123 var9 = var7[var8];
            if (arg2 == null || arg2[var6] == arg3) {
                arg0.method2979(arg1, var9, var6, var5);
            }
            var6++;
        }
    }
}
