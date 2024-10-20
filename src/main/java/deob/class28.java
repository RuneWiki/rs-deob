package deob;

@ObfuscatedName("at")
public class class28 {

    @ObfuscatedName("at.r")
    public class36[] field671 = new class36[100];

    @ObfuscatedName("at.f")
    public int field675;

    @ObfuscatedName("at.a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lam;")
    public class36 method634(int arg0, String arg1, String arg2, String arg3) {
        class36 var5 = this.field671[99];
        for (int var6 = this.field675; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field671[var6] = this.field671[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class36(arg0, arg1, arg3, arg2);
        } else {
            var5.method3661();
            var5.method3635();
            var5.method715(arg0, arg1, arg3, arg2);
        }
        this.field671[0] = var5;
        if (this.field675 < 100) {
            this.field675++;
        }
        return var5;
    }

    @ObfuscatedName("at.r(IB)Lam;")
    public class36 method631(int arg0) {
        return arg0 >= 0 && arg0 < this.field675 ? this.field671[arg0] : null;
    }

    @ObfuscatedName("at.f(B)I")
    public int method632() {
        return this.field675;
    }
}
