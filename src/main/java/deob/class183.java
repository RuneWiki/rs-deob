package deob;

@ObfuscatedName("hh")
public class class183 {

    @ObfuscatedName("hh.ay")
    public class132[] field1959;

    @ObfuscatedName("hh.an")
    public int field1960;

    public class183(class549 arg0, int arg1) {
        this.field1959 = new class132[arg1];
        this.field1960 = arg0.method9025();
        for (int var3 = 0; var3 < this.field1959.length; var3++) {
            class132 var4 = new class132(this.field1960, arg0, false);
            this.field1959[var3] = var4;
        }
        this.method3536();
    }

    @ObfuscatedName("hh.ab(I)V")
    public void method3536() {
        class132[] var1 = this.field1959;
        for (int var2 = 0; var2 < var1.length; var2++) {
            class132 var3 = var1[var2];
            if (var3.field1540 >= 0) {
                var3.field1526 = this.field1959[var3.field1540];
            }
        }
    }

    @ObfuscatedName("hh.ay(I)I")
    public int method3537() {
        return this.field1959.length;
    }

    @ObfuscatedName("hh.an(II)Lfm;")
    public class132 method3538(int arg0) {
        return arg0 >= this.method3537() ? null : this.field1959[arg0];
    }

    @ObfuscatedName("hh.au(I)[Lfm;")
    public class132[] method3547() {
        return this.field1959;
    }

    @ObfuscatedName("hh.ax(Lfq;II)V")
    public void method3549(class143 arg0, int arg1) {
        this.method3541(arg0, arg1, (boolean[]) null, false);
    }

    @ObfuscatedName("hh.ao(Lfq;I[ZZB)V")
    public void method3541(class143 arg0, int arg1, boolean[] arg2, boolean arg3) {
        int var5 = arg0.method3119();
        int var6 = 0;
        class132[] var7 = this.method3547();
        for (int var8 = 0; var8 < var7.length; var8++) {
            class132 var9 = var7[var8];
            if (arg2 == null || arg2[var6] == arg3) {
                arg0.method3142(arg1, var9, var6, var5);
            }
            var6++;
        }
    }
}
