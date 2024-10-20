package deob;

@ObfuscatedName("ao")
public class class28 {

    @ObfuscatedName("ao.p")
    public class36[] field679 = new class36[100];

    @ObfuscatedName("ao.v")
    public int field675;

    @ObfuscatedName("ao.d(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)Las;")
    public class36 method617(int arg0, String arg1, String arg2, String arg3) {
        class36 var5 = this.field679[99];
        for (int var6 = this.field675; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field679[var6] = this.field679[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class36(arg0, arg1, arg3, arg2);
        } else {
            var5.method3715();
            var5.method3680();
            var5.method699(arg0, arg1, arg3, arg2);
        }
        this.field679[0] = var5;
        if (this.field675 < 100) {
            this.field675++;
        }
        return var5;
    }

    @ObfuscatedName("ao.p(II)Las;")
    public class36 method623(int arg0) {
        return arg0 >= 0 && arg0 < this.field675 ? this.field679[arg0] : null;
    }

    @ObfuscatedName("ao.v(I)I")
    public int method618() {
        return this.field675;
    }
}
