package deob;

@ObfuscatedName("u")
public class class25 {

    @ObfuscatedName("u.e")
    public class32[] field601 = new class32[100];

    @ObfuscatedName("u.i")
    public int field603;

    @ObfuscatedName("u.b(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lag;")
    public class32 method518(int arg0, String arg1, String arg2, String arg3) {
        class32 var5 = this.field601[99];
        for (int var6 = this.field603; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field601[var6] = this.field601[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class32(arg0, arg1, arg3, arg2);
        } else {
            var5.method3392();
            var5.method3367();
            var5.method583(arg0, arg1, arg3, arg2);
        }
        this.field601[0] = var5;
        if (this.field603 < 100) {
            this.field603++;
        }
        return var5;
    }

    @ObfuscatedName("u.e(IB)Lag;")
    public class32 method517(int arg0) {
        return arg0 >= 0 && arg0 < this.field603 ? this.field601[arg0] : null;
    }

    @ObfuscatedName("u.i(S)I")
    public int method520() {
        return this.field603;
    }
}
