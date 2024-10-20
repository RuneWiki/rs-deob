package deob;

@ObfuscatedName("ag")
public class class28 {

    @ObfuscatedName("ag.q")
    public class36[] field672 = new class36[100];

    @ObfuscatedName("ag.c")
    public int field671;

    @ObfuscatedName("ag.n(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)Lan;")
    public class36 method645(int arg0, String arg1, String arg2, String arg3) {
        class36 var5 = this.field672[99];
        for (int var6 = this.field671; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field672[var6] = this.field672[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class36(arg0, arg1, arg3, arg2);
        } else {
            var5.method3651();
            var5.method3618();
            var5.method733(arg0, arg1, arg3, arg2);
        }
        this.field672[0] = var5;
        if (this.field671 < 100) {
            this.field671++;
        }
        return var5;
    }

    @ObfuscatedName("ag.q(IB)Lan;")
    public class36 method651(int arg0) {
        return arg0 >= 0 && arg0 < this.field671 ? this.field672[arg0] : null;
    }

    @ObfuscatedName("ag.c(I)I")
    public int method647() {
        return this.field671;
    }
}
