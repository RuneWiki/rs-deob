package deob;

@ObfuscatedName("jp")
public class class242 {

    @ObfuscatedName("jp.ae")
    public class135[] field2610;

    @ObfuscatedName("jp.ag")
    public int field2608;

    public class242(class551 arg0, int arg1) {
        this.field2610 = new class135[arg1];
        this.field2608 = arg0.method8955();
        for (int var3 = 0; var3 < this.field2610.length; var3++) {
            class135 var4 = new class135(this.field2608, arg0, false);
            this.field2610[var3] = var4;
        }
        this.method4426();
    }

    @ObfuscatedName("jp.ac(I)V")
    public void method4426() {
        class135[] var1 = this.field2610;
        for (int var2 = 0; var2 < var1.length; var2++) {
            class135 var3 = var1[var2];
            if (var3.field1582 >= 0) {
                var3.field1570 = this.field2610[var3.field1582];
            }
        }
    }

    @ObfuscatedName("jp.ae(B)I")
    public int method4427() {
        return this.field2610.length;
    }

    @ObfuscatedName("jp.ag(II)Lfb;")
    public class135 method4428(int arg0) {
        return arg0 >= this.method4427() ? null : this.field2610[arg0];
    }

    @ObfuscatedName("jp.am(I)[Lfb;")
    public class135[] method4425() {
        return this.field2610;
    }

    @ObfuscatedName("jp.ax(Lfo;II)V")
    public void method4436(class146 arg0, int arg1) {
        this.method4443(arg0, arg1, (boolean[]) null, false);
    }

    @ObfuscatedName("jp.aq(Lfo;I[ZZI)V")
    public void method4443(class146 arg0, int arg1, boolean[] arg2, boolean arg3) {
        int var5 = arg0.method3215();
        int var6 = 0;
        class135[] var7 = this.method4425();
        for (int var8 = 0; var8 < var7.length; var8++) {
            class135 var9 = var7[var8];
            if (arg2 == null || arg2[var6] == arg3) {
                arg0.method3217(arg1, var9, var6, var5);
            }
            var6++;
        }
    }
}
