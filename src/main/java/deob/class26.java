package deob;

@ObfuscatedName("i")
public class class26 {

    @ObfuscatedName("i.d")
    public class33[] field623 = new class33[100];

    @ObfuscatedName("i.z")
    public int field621;

    @ObfuscatedName("i.n(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Las;")
    public class33 method592(int arg0, String arg1, String arg2, String arg3) {
        class33 var5 = this.field623[99];
        for (int var6 = this.field621; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field623[var6] = this.field623[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class33(arg0, arg1, arg3, arg2);
        } else {
            var5.method3562();
            var5.method3541();
            var5.method640(arg0, arg1, arg3, arg2);
        }
        this.field623[0] = var5;
        if (this.field621 < 100) {
            this.field621++;
        }
        return var5;
    }

    @ObfuscatedName("i.d(II)Las;")
    public class33 method593(int arg0) {
        return arg0 >= 0 && arg0 < this.field621 ? this.field623[arg0] : null;
    }

    @ObfuscatedName("i.z(I)I")
    public int method594() {
        return this.field621;
    }
}
