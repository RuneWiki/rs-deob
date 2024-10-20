package deob;

@ObfuscatedName("aa")
public class class28 {

    @ObfuscatedName("aa.q")
    public class36[] field686 = new class36[100];

    @ObfuscatedName("aa.v")
    public int field688;

    @ObfuscatedName("aa.h(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lap;")
    public class36 method623(int arg0, String arg1, String arg2, String arg3) {
        class36 var5 = this.field686[99];
        for (int var6 = this.field688; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field686[var6] = this.field686[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class36(arg0, arg1, arg3, arg2);
        } else {
            var5.method3711();
            var5.method3689();
            var5.method704(arg0, arg1, arg3, arg2);
        }
        this.field686[0] = var5;
        if (this.field688 < 100) {
            this.field688++;
        }
        return var5;
    }

    @ObfuscatedName("aa.q(IB)Lap;")
    public class36 method626(int arg0) {
        return arg0 >= 0 && arg0 < this.field688 ? this.field686[arg0] : null;
    }

    @ObfuscatedName("aa.v(I)I")
    public int method625() {
        return this.field688;
    }
}
