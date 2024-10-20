package deob;

@ObfuscatedName("z")
public class class25 {

    @ObfuscatedName("z.k")
    public class32[] field606 = new class32[100];

    @ObfuscatedName("z.y")
    public int field607;

    @ObfuscatedName("z.f(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lao;")
    public class32 method536(int arg0, String arg1, String arg2, String arg3) {
        class32 var5 = this.field606[99];
        for (int var6 = this.field607; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field606[var6] = this.field606[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class32(arg0, arg1, arg3, arg2);
        } else {
            var5.method3367();
            var5.method3347();
            var5.method610(arg0, arg1, arg3, arg2);
        }
        this.field606[0] = var5;
        if (this.field607 < 100) {
            this.field607++;
        }
        return var5;
    }

    @ObfuscatedName("z.k(II)Lao;")
    public class32 method537(int arg0) {
        return arg0 >= 0 && arg0 < this.field607 ? this.field606[arg0] : null;
    }

    @ObfuscatedName("z.y(I)I")
    public int method538() {
        return this.field607;
    }
}
