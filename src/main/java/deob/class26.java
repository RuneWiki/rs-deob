package deob;

@ObfuscatedName("r")
public class class26 {

    @ObfuscatedName("r.w")
    public class33[] field639 = new class33[100];

    @ObfuscatedName("r.i")
    public int field637;

    @ObfuscatedName("r.n(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lap;")
    public class33 method555(int arg0, String arg1, String arg2, String arg3) {
        class33 var5 = this.field639[99];
        for (int var6 = this.field637; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field639[var6] = this.field639[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class33(arg0, arg1, arg3, arg2);
        } else {
            var5.method3474();
            var5.method3450();
            var5.method605(arg0, arg1, arg3, arg2);
        }
        this.field639[0] = var5;
        if (this.field637 < 100) {
            this.field637++;
        }
        return var5;
    }

    @ObfuscatedName("r.w(II)Lap;")
    public class33 method556(int arg0) {
        return arg0 >= 0 && arg0 < this.field637 ? this.field639[arg0] : null;
    }

    @ObfuscatedName("r.i(I)I")
    public int method558() {
        return this.field637;
    }
}
