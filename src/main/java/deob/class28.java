package deob;

@ObfuscatedName("an")
public class class28 {

    @ObfuscatedName("an.l")
    public class36[] field636 = new class36[100];

    @ObfuscatedName("an.y")
    public int field637;

    @ObfuscatedName("an.m(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lam;")
    public class36 method664(int arg0, String arg1, String arg2, String arg3) {
        class36 var5 = this.field636[99];
        for (int var6 = this.field637; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field636[var6] = this.field636[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class36(arg0, arg1, arg3, arg2);
        } else {
            var5.method3702();
            var5.method3685();
            var5.method747(arg0, arg1, arg3, arg2);
        }
        this.field636[0] = var5;
        if (this.field637 < 100) {
            this.field637++;
        }
        return var5;
    }

    @ObfuscatedName("an.l(IS)Lam;")
    public class36 method661(int arg0) {
        return arg0 >= 0 && arg0 < this.field637 ? this.field636[arg0] : null;
    }

    @ObfuscatedName("an.y(B)I")
    public int method660() {
        return this.field637;
    }
}
