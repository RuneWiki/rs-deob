package deob;

@ObfuscatedName("l")
public class class26 {

    @ObfuscatedName("l.g")
    public class33[] field660 = new class33[100];

    @ObfuscatedName("l.a")
    public int field661;

    @ObfuscatedName("l.n(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lad;")
    public class33 method546(int arg0, String arg1, String arg2, String arg3) {
        class33 var5 = this.field660[99];
        for (int var6 = this.field661; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field660[var6] = this.field660[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class33(arg0, arg1, arg3, arg2);
        } else {
            var5.method3554();
            var5.method3527();
            var5.method618(arg0, arg1, arg3, arg2);
        }
        this.field660[0] = var5;
        if (this.field661 < 100) {
            this.field661++;
        }
        return var5;
    }

    @ObfuscatedName("l.g(II)Lad;")
    public class33 method550(int arg0) {
        return arg0 >= 0 && arg0 < this.field661 ? this.field660[arg0] : null;
    }

    @ObfuscatedName("l.a(I)I")
    public int method547() {
        return this.field661;
    }
}
