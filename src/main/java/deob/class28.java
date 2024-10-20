package deob;

@ObfuscatedName("ao")
public class class28 {

    @ObfuscatedName("ao.m")
    public class36[] field673 = new class36[100];

    @ObfuscatedName("ao.i")
    public int field671;

    @ObfuscatedName("ao.h(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Laa;")
    public class36 method607(int arg0, String arg1, String arg2, String arg3) {
        class36 var5 = this.field673[99];
        for (int var6 = this.field671; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field673[var6] = this.field673[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class36(arg0, arg1, arg3, arg2);
        } else {
            var5.method3625();
            var5.method3605();
            var5.method700(arg0, arg1, arg3, arg2);
        }
        this.field673[0] = var5;
        if (this.field671 < 100) {
            this.field671++;
        }
        return var5;
    }

    @ObfuscatedName("ao.m(II)Laa;")
    public class36 method610(int arg0) {
        return arg0 >= 0 && arg0 < this.field671 ? this.field673[arg0] : null;
    }

    @ObfuscatedName("ao.i(B)I")
    public int method608() {
        return this.field671;
    }
}
