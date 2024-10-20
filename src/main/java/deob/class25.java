package deob;

@ObfuscatedName("z")
public class class25 {

    @ObfuscatedName("z.v")
    public class32[] field614 = new class32[100];

    @ObfuscatedName("z.i")
    public int field615;

    @ObfuscatedName("z.a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lav;")
    public class32 method539(int arg0, String arg1, String arg2, String arg3) {
        class32 var5 = this.field614[99];
        for (int var6 = this.field615; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field614[var6] = this.field614[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class32(arg0, arg1, arg3, arg2);
        } else {
            var5.method3343();
            var5.method3320();
            var5.method593(arg0, arg1, arg3, arg2);
        }
        this.field614[0] = var5;
        if (this.field615 < 100) {
            this.field615++;
        }
        return var5;
    }

    @ObfuscatedName("z.v(IB)Lav;")
    public class32 method540(int arg0) {
        return arg0 >= 0 && arg0 < this.field615 ? this.field614[arg0] : null;
    }

    @ObfuscatedName("z.i(B)I")
    public int method541() {
        return this.field615;
    }
}
