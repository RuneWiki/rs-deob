package deob;

@ObfuscatedName("z")
public class class25 {

    @ObfuscatedName("z.t")
    public class32[] field612 = new class32[100];

    @ObfuscatedName("z.f")
    public int field611;

    @ObfuscatedName("z.v(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)Lai;")
    public class32 method513(int arg0, String arg1, String arg2, String arg3) {
        class32 var5 = this.field612[99];
        for (int var6 = this.field611; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field612[var6] = this.field612[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class32(arg0, arg1, arg3, arg2);
        } else {
            var5.method3392();
            var5.method3371();
            var5.method589(arg0, arg1, arg3, arg2);
        }
        this.field612[0] = var5;
        if (this.field611 < 100) {
            this.field611++;
        }
        return var5;
    }

    @ObfuscatedName("z.t(II)Lai;")
    public class32 method514(int arg0) {
        return arg0 >= 0 && arg0 < this.field611 ? this.field612[arg0] : null;
    }

    @ObfuscatedName("z.f(B)I")
    public int method512() {
        return this.field611;
    }
}
