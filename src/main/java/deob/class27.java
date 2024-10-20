package deob;

@ObfuscatedName("at")
public class class27 {

    @ObfuscatedName("at.y")
    public class34[] field674 = new class34[100];

    @ObfuscatedName("at.z")
    public int field673;

    @ObfuscatedName("at.j(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;S)Lag;")
    public class34 method639(int arg0, String arg1, String arg2, String arg3) {
        class34 var5 = this.field674[99];
        for (int var6 = this.field673; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field674[var6] = this.field674[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class34(arg0, arg1, arg3, arg2);
        } else {
            var5.method3563();
            var5.method3552();
            var5.method698(arg0, arg1, arg3, arg2);
        }
        this.field674[0] = var5;
        if (this.field673 < 100) {
            this.field673++;
        }
        return var5;
    }

    @ObfuscatedName("at.y(IB)Lag;")
    public class34 method636(int arg0) {
        return arg0 >= 0 && arg0 < this.field673 ? this.field674[arg0] : null;
    }

    @ObfuscatedName("at.z(I)I")
    public int method637() {
        return this.field673;
    }
}
