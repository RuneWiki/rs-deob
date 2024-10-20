package deob;

@ObfuscatedName("a")
public class class25 {

    @ObfuscatedName("a.v")
    public class32[] field610 = new class32[100];

    @ObfuscatedName("a.m")
    public int field614;

    @ObfuscatedName("a.x(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)Lau;")
    public class32 method532(int arg0, String arg1, String arg2, String arg3) {
        class32 var5 = this.field610[99];
        for (int var6 = this.field614; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field610[var6] = this.field610[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class32(arg0, arg1, arg3, arg2);
        } else {
            var5.method3352();
            var5.method3321();
            var5.method608(arg0, arg1, arg3, arg2);
        }
        this.field610[0] = var5;
        if (this.field614 < 100) {
            this.field614++;
        }
        return var5;
    }

    @ObfuscatedName("a.v(II)Lau;")
    public class32 method522(int arg0) {
        return arg0 >= 0 && arg0 < this.field614 ? this.field610[arg0] : null;
    }

    @ObfuscatedName("a.m(B)I")
    public int method526() {
        return this.field614;
    }
}
