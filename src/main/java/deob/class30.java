package deob;

@ObfuscatedName("am")
public class class30 {

    @ObfuscatedName("am.d")
    public class38[] field698 = new class38[100];

    @ObfuscatedName("am.v")
    public int field699;

    @ObfuscatedName("am.a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lat;")
    public class38 method663(int arg0, String arg1, String arg2, String arg3) {
        class38 var5 = this.field698[99];
        for (int var6 = this.field699; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field698[var6] = this.field698[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class38(arg0, arg1, arg3, arg2);
        } else {
            var5.method3729();
            var5.method3701();
            var5.method750(arg0, arg1, arg3, arg2);
        }
        this.field698[0] = var5;
        if (this.field699 < 100) {
            this.field699++;
        }
        return var5;
    }

    @ObfuscatedName("am.d(II)Lat;")
    public class38 method664(int arg0) {
        return arg0 >= 0 && arg0 < this.field699 ? this.field698[arg0] : null;
    }

    @ObfuscatedName("am.v(B)I")
    public int method668() {
        return this.field699;
    }
}
