package deob;

@ObfuscatedName("ao")
public class class28 {

    @ObfuscatedName("ao.m")
    public class36[] field657 = new class36[100];

    @ObfuscatedName("ao.f")
    public int field651;

    @ObfuscatedName("ao.j(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)Lav;")
    public class36 method678(int arg0, String arg1, String arg2, String arg3) {
        class36 var5 = this.field657[99];
        for (int var6 = this.field651; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field657[var6] = this.field657[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class36(arg0, arg1, arg3, arg2);
        } else {
            var5.method3700();
            var5.method3680();
            var5.method747(arg0, arg1, arg3, arg2);
        }
        this.field657[0] = var5;
        if (this.field651 < 100) {
            this.field651++;
        }
        return var5;
    }

    @ObfuscatedName("ao.m(IB)Lav;")
    public class36 method672(int arg0) {
        return arg0 >= 0 && arg0 < this.field651 ? this.field657[arg0] : null;
    }

    @ObfuscatedName("ao.f(B)I")
    public int method673() {
        return this.field651;
    }
}
