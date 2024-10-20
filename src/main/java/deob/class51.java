package deob;

@ObfuscatedName("af")
public class class51 {

    @ObfuscatedName("af.d")
    public class22[] field988 = new class22[100];

    @ObfuscatedName("af.h")
    public int field992;

    @ObfuscatedName("af.q(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lk;")
    public class22 method961(int arg0, String arg1, String arg2, String arg3) {
        class22 var5 = this.field988[99];
        for (int var6 = this.field992; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field988[var6] = this.field988[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class22(arg0, arg1, arg3, arg2);
        } else {
            var5.method2310();
            var5.method2345();
            var5.method213(arg0, arg1, arg3, arg2);
        }
        this.field988[0] = var5;
        if (this.field992 < 100) {
            this.field992++;
        }
        return var5;
    }

    @ObfuscatedName("af.d(II)Lk;")
    public class22 method958(int arg0) {
        return arg0 >= 0 && arg0 < this.field992 ? this.field988[arg0] : null;
    }

    @ObfuscatedName("af.h(I)I")
    public int method962() {
        return this.field992;
    }
}
