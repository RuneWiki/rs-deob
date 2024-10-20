package deob;

@ObfuscatedName("ar")
public class class28 {

    @ObfuscatedName("ar.v")
    public class36[] field673 = new class36[100];

    @ObfuscatedName("ar.r")
    public int field672;

    @ObfuscatedName("ar.i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lai;")
    public class36 method651(int arg0, String arg1, String arg2, String arg3) {
        class36 var5 = this.field673[99];
        for (int var6 = this.field672; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field673[var6] = this.field673[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class36(arg0, arg1, arg3, arg2);
        } else {
            var5.method3626();
            var5.method3602();
            var5.method743(arg0, arg1, arg3, arg2);
        }
        this.field673[0] = var5;
        if (this.field672 < 100) {
            this.field672++;
        }
        return var5;
    }

    @ObfuscatedName("ar.v(II)Lai;")
    public class36 method652(int arg0) {
        return arg0 >= 0 && arg0 < this.field672 ? this.field673[arg0] : null;
    }

    @ObfuscatedName("ar.r(I)I")
    public int method664() {
        return this.field672;
    }
}
