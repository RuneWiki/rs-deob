package deob;

@ObfuscatedName("aa")
public class class30 {

    @ObfuscatedName("aa.z")
    public class38[] field665 = new class38[100];

    @ObfuscatedName("aa.t")
    public int field667;

    @ObfuscatedName("aa.s(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lav;")
    public class38 method659(int arg0, String arg1, String arg2, String arg3) {
        class38 var5 = this.field665[99];
        for (int var6 = this.field667; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field665[var6] = this.field665[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class38(arg0, arg1, arg3, arg2);
        } else {
            var5.method3699();
            var5.method3674();
            var5.method737(arg0, arg1, arg3, arg2);
        }
        this.field665[0] = var5;
        if (this.field667 < 100) {
            this.field667++;
        }
        return var5;
    }

    @ObfuscatedName("aa.z(II)Lav;")
    public class38 method657(int arg0) {
        return arg0 >= 0 && arg0 < this.field667 ? this.field665[arg0] : null;
    }

    @ObfuscatedName("aa.t(I)I")
    public int method661() {
        return this.field667;
    }
}
