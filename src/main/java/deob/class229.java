package deob;

@ObfuscatedName("iv")
public class class229 {

    @ObfuscatedName("iv.ay")
    public class128[] field2515;

    @ObfuscatedName("iv.ar")
    public int field2516;

    public class229(class514 arg0, int arg1) {
        this.field2515 = new class128[arg1];
        this.field2516 = arg0.method8244();
        for (int var3 = 0; var3 < this.field2515.length; var3++) {
            class128 var4 = new class128(this.field2516, arg0, false);
            this.field2515[var3] = var4;
        }
        this.method4126();
    }

    @ObfuscatedName("iv.aw(B)V")
    public void method4126() {
        class128[] var1 = this.field2515;
        for (int var2 = 0; var2 < var1.length; var2++) {
            class128 var3 = var1[var2];
            if (var3.field1506 >= 0) {
                var3.field1501 = this.field2515[var3.field1506];
            }
        }
    }

    @ObfuscatedName("iv.ay(S)I")
    public int method4125() {
        return this.field2515.length;
    }

    @ObfuscatedName("iv.ar(II)Lek;")
    public class128 method4128(int arg0) {
        return arg0 >= this.method4125() ? null : this.field2515[arg0];
    }

    @ObfuscatedName("iv.am(B)[Lek;")
    public class128[] method4143() {
        return this.field2515;
    }

    @ObfuscatedName("iv.as(Lfz;II)V")
    public void method4130(class138 arg0, int arg1) {
        this.method4129(arg0, arg1, (boolean[]) null, false);
    }

    @ObfuscatedName("iv.aj(Lfz;I[ZZI)V")
    public void method4129(class138 arg0, int arg1, boolean[] arg2, boolean arg3) {
        int var5 = arg0.method2937();
        int var6 = 0;
        class128[] var7 = this.method4143();
        for (int var8 = 0; var8 < var7.length; var8++) {
            class128 var9 = var7[var8];
            if (arg2 == null || arg2[var6] == arg3) {
                arg0.method2914(arg1, var9, var6, var5);
            }
            var6++;
        }
    }
}
