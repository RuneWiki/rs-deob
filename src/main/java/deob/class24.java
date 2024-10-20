package deob;

@ObfuscatedName("h")
public class class24 {

    @ObfuscatedName("h.b")
    public class31[] field616 = new class31[100];

    @ObfuscatedName("h.e")
    public int field615;

    @ObfuscatedName("h.k(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lat;")
    public class31 method495(int arg0, String arg1, String arg2, String arg3) {
        class31 var5 = this.field616[99];
        for (int var6 = this.field615; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field616[var6] = this.field616[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class31(arg0, arg1, arg3, arg2);
        } else {
            var5.method3321();
            var5.method3302();
            var5.method568(arg0, arg1, arg3, arg2);
        }
        this.field616[0] = var5;
        if (this.field615 < 100) {
            this.field615++;
        }
        return var5;
    }

    @ObfuscatedName("h.b(II)Lat;")
    public class31 method502(int arg0) {
        return arg0 >= 0 && arg0 < this.field615 ? this.field616[arg0] : null;
    }

    @ObfuscatedName("h.e(B)I")
    public int method497() {
        return this.field615;
    }
}
