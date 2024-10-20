package deob;

@ObfuscatedName("af")
public class class28 {

    @ObfuscatedName("af.s")
    public class36[] field674 = new class36[100];

    @ObfuscatedName("af.q")
    public int field678;

    @ObfuscatedName("af.f(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lar;")
    public class36 method627(int arg0, String arg1, String arg2, String arg3) {
        class36 var5 = this.field674[99];
        for (int var6 = this.field678; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field674[var6] = this.field674[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class36(arg0, arg1, arg3, arg2);
        } else {
            var5.method3665();
            var5.method3636();
            var5.method716(arg0, arg1, arg3, arg2);
        }
        this.field674[0] = var5;
        if (this.field678 < 100) {
            this.field678++;
        }
        return var5;
    }

    @ObfuscatedName("af.s(II)Lar;")
    public class36 method628(int arg0) {
        return arg0 >= 0 && arg0 < this.field678 ? this.field674[arg0] : null;
    }

    @ObfuscatedName("af.q(B)I")
    public int method629() {
        return this.field678;
    }
}
