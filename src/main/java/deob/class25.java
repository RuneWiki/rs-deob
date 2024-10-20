package deob;

@ObfuscatedName("t")
public class class25 {

    @ObfuscatedName("t.j")
    public class32[] field608 = new class32[100];

    @ObfuscatedName("t.y")
    public int field609;

    @ObfuscatedName("t.c(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lao;")
    public class32 method517(int arg0, String arg1, String arg2, String arg3) {
        class32 var5 = this.field608[99];
        for (int var6 = this.field609; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field608[var6] = this.field608[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class32(arg0, arg1, arg3, arg2);
        } else {
            var5.method3334();
            var5.method3310();
            var5.method563(arg0, arg1, arg3, arg2);
        }
        this.field608[0] = var5;
        if (this.field609 < 100) {
            this.field609++;
        }
        return var5;
    }

    @ObfuscatedName("t.j(II)Lao;")
    public class32 method511(int arg0) {
        return arg0 >= 0 && arg0 < this.field609 ? this.field608[arg0] : null;
    }

    @ObfuscatedName("t.y(I)I")
    public int method512() {
        return this.field609;
    }
}
