package deob;

@ObfuscatedName("d")
public class class26 {

    @ObfuscatedName("d.e")
    public class33[] field620 = new class33[100];

    @ObfuscatedName("d.a")
    public int field618;

    @ObfuscatedName("d.b(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)Lap;")
    public class33 method540(int arg0, String arg1, String arg2, String arg3) {
        class33 var5 = this.field620[99];
        for (int var6 = this.field618; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field620[var6] = this.field620[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class33(arg0, arg1, arg3, arg2);
        } else {
            var5.method3414();
            var5.method3396();
            var5.method608(arg0, arg1, arg3, arg2);
        }
        this.field620[0] = var5;
        if (this.field618 < 100) {
            this.field618++;
        }
        return var5;
    }

    @ObfuscatedName("d.e(IS)Lap;")
    public class33 method541(int arg0) {
        return arg0 >= 0 && arg0 < this.field618 ? this.field620[arg0] : null;
    }

    @ObfuscatedName("d.a(I)I")
    public int method542() {
        return this.field618;
    }
}
