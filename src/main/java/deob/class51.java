package deob;

@ObfuscatedName("az")
public class class51 {

    @ObfuscatedName("az.g")
    public class22[] field969 = new class22[100];

    @ObfuscatedName("az.x")
    public int field973;

    @ObfuscatedName("az.p(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lf;")
    public class22 method863(int arg0, String arg1, String arg2, String arg3) {
        class22 var5 = this.field969[99];
        for (int var6 = this.field973; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field969[var6] = this.field969[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class22(arg0, arg1, arg3, arg2);
        } else {
            var5.method2225();
            var5.method2265();
            var5.method207(arg0, arg1, arg3, arg2);
        }
        this.field969[0] = var5;
        if (this.field973 < 100) {
            this.field973++;
        }
        return var5;
    }

    @ObfuscatedName("az.g(II)Lf;")
    public class22 method857(int arg0) {
        return arg0 >= 0 && arg0 < this.field973 ? this.field969[arg0] : null;
    }

    @ObfuscatedName("az.x(I)I")
    public int method859() {
        return this.field973;
    }
}
