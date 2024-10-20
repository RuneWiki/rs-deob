package deob;

@ObfuscatedName("l")
public class class24 {

    @ObfuscatedName("l.z")
    public class31[] field616 = new class31[100];

    @ObfuscatedName("l.y")
    public int field617;

    @ObfuscatedName("l.j(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)Lak;")
    public class31 method474(int arg0, String arg1, String arg2, String arg3) {
        class31 var5 = this.field616[99];
        for (int var6 = this.field617; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field616[var6] = this.field616[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class31(arg0, arg1, arg3, arg2);
        } else {
            var5.method3309();
            var5.method3294();
            var5.method550(arg0, arg1, arg3, arg2);
        }
        this.field616[0] = var5;
        if (this.field617 < 100) {
            this.field617++;
        }
        return var5;
    }

    @ObfuscatedName("l.z(IB)Lak;")
    public class31 method475(int arg0) {
        return arg0 >= 0 && arg0 < this.field617 ? this.field616[arg0] : null;
    }

    @ObfuscatedName("l.y(I)I")
    public int method483() {
        return this.field617;
    }
}
