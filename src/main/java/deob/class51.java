package deob;

@ObfuscatedName("ag")
public class class51 {

    @ObfuscatedName("ag.c")
    public class22[] field963 = new class22[100];

    @ObfuscatedName("ag.f")
    public int field965;

    @ObfuscatedName("ag.s(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lt;")
    public class22 method843(int arg0, String arg1, String arg2, String arg3) {
        class22 var5 = this.field963[99];
        for (int var6 = this.field965; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field963[var6] = this.field963[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class22(arg0, arg1, arg3, arg2);
        } else {
            var5.method2179();
            var5.method2218();
            var5.method177(arg0, arg1, arg3, arg2);
        }
        this.field963[0] = var5;
        if (this.field965 < 100) {
            this.field965++;
        }
        return var5;
    }

    @ObfuscatedName("ag.c(II)Lt;")
    public class22 method838(int arg0) {
        return arg0 >= 0 && arg0 < this.field965 ? this.field963[arg0] : null;
    }

    @ObfuscatedName("ag.f(I)I")
    public int method839() {
        return this.field965;
    }
}
