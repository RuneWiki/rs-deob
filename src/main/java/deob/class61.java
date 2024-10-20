package deob;

@ObfuscatedName("bw")
public class class61 {

    @ObfuscatedName("bw.t")
    public class45[] field898 = new class45[100];

    @ObfuscatedName("bw.v")
    public int field894;

    @ObfuscatedName("bw.s(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lay;")
    public class45 method1640(int arg0, String arg1, String arg2, String arg3) {
        class45 var5 = this.field898[99];
        for (int var6 = this.field894; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field898[var6] = this.field898[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class45(arg0, arg1, arg3, arg2);
        } else {
            var5.method5447();
            var5.method5445();
            var5.method789(arg0, arg1, arg3, arg2);
        }
        this.field898[0] = var5;
        if (this.field894 < 100) {
            this.field894++;
        }
        return var5;
    }

    @ObfuscatedName("bw.t(II)Lay;")
    public class45 method1637(int arg0) {
        return arg0 >= 0 && arg0 < this.field894 ? this.field898[arg0] : null;
    }

    @ObfuscatedName("bw.v(I)I")
    public int method1635() {
        return this.field894;
    }
}
