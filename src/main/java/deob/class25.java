package deob;

@ObfuscatedName("d")
public class class25 {

    @ObfuscatedName("d.y")
    public class32[] field599 = new class32[100];

    @ObfuscatedName("d.g")
    public int field603;

    @ObfuscatedName("d.l(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lad;")
    public class32 method513(int arg0, String arg1, String arg2, String arg3) {
        class32 var5 = this.field599[99];
        for (int var6 = this.field603; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field599[var6] = this.field599[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class32(arg0, arg1, arg3, arg2);
        } else {
            var5.method3375();
            var5.method3349();
            var5.method580(arg0, arg1, arg3, arg2);
        }
        this.field599[0] = var5;
        if (this.field603 < 100) {
            this.field603++;
        }
        return var5;
    }

    @ObfuscatedName("d.y(II)Lad;")
    public class32 method512(int arg0) {
        return arg0 >= 0 && arg0 < this.field603 ? this.field599[arg0] : null;
    }

    @ObfuscatedName("d.g(I)I")
    public int method515() {
        return this.field603;
    }
}
