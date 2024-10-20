package deob;

@ObfuscatedName("ae")
public class class30 {

    @ObfuscatedName("ae.l")
    public class38[] field707 = new class38[100];

    @ObfuscatedName("ae.c")
    public int field708;

    @ObfuscatedName("ae.e(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Laa;")
    public class38 method640(int arg0, String arg1, String arg2, String arg3) {
        class38 var5 = this.field707[99];
        for (int var6 = this.field708; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field707[var6] = this.field707[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class38(arg0, arg1, arg3, arg2);
        } else {
            var5.method3755();
            var5.method3733();
            var5.method745(arg0, arg1, arg3, arg2);
        }
        this.field707[0] = var5;
        if (this.field708 < 100) {
            this.field708++;
        }
        return var5;
    }

    @ObfuscatedName("ae.l(IB)Laa;")
    public class38 method642(int arg0) {
        return arg0 >= 0 && arg0 < this.field708 ? this.field707[arg0] : null;
    }

    @ObfuscatedName("ae.c(I)I")
    public int method645() {
        return this.field708;
    }
}
