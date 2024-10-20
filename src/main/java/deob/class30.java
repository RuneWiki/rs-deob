package deob;

@ObfuscatedName("ar")
public class class30 {

    @ObfuscatedName("ar.w")
    public class38[] field693 = new class38[100];

    @ObfuscatedName("ar.e")
    public int field687;

    @ObfuscatedName("ar.m(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Laf;")
    public class38 method646(int arg0, String arg1, String arg2, String arg3) {
        class38 var5 = this.field693[99];
        for (int var6 = this.field687; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field693[var6] = this.field693[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class38(arg0, arg1, arg3, arg2);
        } else {
            var5.method3729();
            var5.method3699();
            var5.method726(arg0, arg1, arg3, arg2);
        }
        this.field693[0] = var5;
        if (this.field687 < 100) {
            this.field687++;
        }
        return var5;
    }

    @ObfuscatedName("ar.w(IB)Laf;")
    public class38 method642(int arg0) {
        return arg0 >= 0 && arg0 < this.field687 ? this.field693[arg0] : null;
    }

    @ObfuscatedName("ar.e(I)I")
    public int method640() {
        return this.field687;
    }
}
