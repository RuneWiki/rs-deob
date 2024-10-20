package deob;

@ObfuscatedName("ad")
public class class30 {

    @ObfuscatedName("ad.q")
    public class38[] field685 = new class38[100];

    @ObfuscatedName("ad.f")
    public int field686;

    @ObfuscatedName("ad.k(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)Lar;")
    public class38 method653(int arg0, String arg1, String arg2, String arg3) {
        class38 var5 = this.field685[99];
        for (int var6 = this.field686; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field685[var6] = this.field685[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class38(arg0, arg1, arg3, arg2);
        } else {
            var5.method3703();
            var5.method3684();
            var5.method728(arg0, arg1, arg3, arg2);
        }
        this.field685[0] = var5;
        if (this.field686 < 100) {
            this.field686++;
        }
        return var5;
    }

    @ObfuscatedName("ad.q(II)Lar;")
    public class38 method654(int arg0) {
        return arg0 >= 0 && arg0 < this.field686 ? this.field685[arg0] : null;
    }

    @ObfuscatedName("ad.f(I)I")
    public int method655() {
        return this.field686;
    }
}
