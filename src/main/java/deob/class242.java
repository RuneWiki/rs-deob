package deob;

@ObfuscatedName("jx")
public class class242 {

    @ObfuscatedName("jx.aw")
    public class135[] field2609;

    @ObfuscatedName("jx.ak")
    public int field2611;

    public class242(class558 arg0, int arg1) {
        this.field2609 = new class135[arg1];
        this.field2611 = arg0.method9258();
        for (int var3 = 0; var3 < this.field2609.length; var3++) {
            class135 var4 = new class135(this.field2611, arg0, false);
            this.field2609[var3] = var4;
        }
        this.method4599();
    }

    @ObfuscatedName("jx.ap(I)V")
    public void method4599() {
        class135[] var1 = this.field2609;
        for (int var2 = 0; var2 < var1.length; var2++) {
            class135 var3 = var1[var2];
            if (var3.field1570 >= 0) {
                var3.field1575 = this.field2609[var3.field1570];
            }
        }
    }

    @ObfuscatedName("jx.aw(I)I")
    public int method4600() {
        return this.field2609.length;
    }

    @ObfuscatedName("jx.ak(II)Lfw;")
    public class135 method4601(int arg0) {
        return arg0 >= this.method4600() ? null : this.field2609[arg0];
    }

    @ObfuscatedName("jx.aj(I)[Lfw;")
    public class135[] method4602() {
        return this.field2609;
    }

    @ObfuscatedName("jx.ai(Lfr;IB)V")
    public void method4606(class146 arg0, int arg1) {
        this.method4604(arg0, arg1, (boolean[]) null, false);
    }

    @ObfuscatedName("jx.ay(Lfr;I[ZZI)V")
    public void method4604(class146 arg0, int arg1, boolean[] arg2, boolean arg3) {
        int var5 = arg0.method3366();
        int var6 = 0;
        class135[] var7 = this.method4602();
        for (int var8 = 0; var8 < var7.length; var8++) {
            class135 var9 = var7[var8];
            if (arg2 == null || arg2[var6] == arg3) {
                arg0.method3368(arg1, var9, var6, var5);
            }
            var6++;
        }
    }
}
