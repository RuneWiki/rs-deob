package deob;

@ObfuscatedName("im")
public class class228 {

    @ObfuscatedName("im.ae")
    public class128[] field2542;

    @ObfuscatedName("im.ao")
    public int field2543;

    public class228(class515 arg0, int arg1) {
        this.field2542 = new class128[arg1];
        this.field2543 = arg0.method8300();
        for (int var3 = 0; var3 < this.field2542.length; var3++) {
            class128 var4 = new class128(this.field2543, arg0, false);
            this.field2542[var3] = var4;
        }
        this.method4153();
    }

    @ObfuscatedName("im.au(I)V")
    public void method4153() {
        class128[] var1 = this.field2542;
        for (int var2 = 0; var2 < var1.length; var2++) {
            class128 var3 = var1[var2];
            if (var3.field1516 >= 0) {
                var3.field1526 = this.field2542[var3.field1516];
            }
        }
    }

    @ObfuscatedName("im.ae(I)I")
    public int method4137() {
        return this.field2542.length;
    }

    @ObfuscatedName("im.ao(II)Leo;")
    public class128 method4138(int arg0) {
        return arg0 >= this.method4137() ? null : this.field2542[arg0];
    }

    @ObfuscatedName("im.at(I)[Leo;")
    public class128[] method4139() {
        return this.field2542;
    }

    @ObfuscatedName("im.ac(Lfv;II)V")
    public void method4140(class138 arg0, int arg1) {
        this.method4141(arg0, arg1, (boolean[]) null, false);
    }

    @ObfuscatedName("im.ai(Lfv;I[ZZB)V")
    public void method4141(class138 arg0, int arg1, boolean[] arg2, boolean arg3) {
        int var5 = arg0.method2925();
        int var6 = 0;
        class128[] var7 = this.method4139();
        for (int var8 = 0; var8 < var7.length; var8++) {
            class128 var9 = var7[var8];
            if (arg2 == null || arg2[var6] == arg3) {
                arg0.method2927(arg1, var9, var6, var5);
            }
            var6++;
        }
    }
}
