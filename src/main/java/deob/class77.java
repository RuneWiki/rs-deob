package deob;

@ObfuscatedName("cp")
public class class77 {

    @ObfuscatedName("cp.an")
    public class61[] field988 = new class61[100];

    @ObfuscatedName("cp.aw")
    public int field990;

    @ObfuscatedName("cp.af(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;S)Lcq;")
    public class61 method2048(int arg0, String arg1, String arg2, String arg3) {
        class61 var5 = this.field988[99];
        for (int var6 = this.field990; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field988[var6] = this.field988[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class61(arg0, arg1, arg3, arg2);
        } else {
            var5.method7651();
            var5.method7640();
            var5.method1099(arg0, arg1, arg3, arg2);
        }
        this.field988[0] = var5;
        if (this.field990 < 100) {
            this.field990++;
        }
        return var5;
    }

    @ObfuscatedName("cp.an(II)Lcq;")
    public class61 method2049(int arg0) {
        return arg0 >= 0 && arg0 < this.field990 ? this.field988[arg0] : null;
    }

    @ObfuscatedName("cp.aw(I)I")
    public int method2058() {
        return this.field990;
    }
}
