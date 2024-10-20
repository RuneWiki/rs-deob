package deob;

@ObfuscatedName("o")
public class class25 {

    @ObfuscatedName("o.j")
    public class32[] field599 = new class32[100];

    @ObfuscatedName("o.z")
    public int field596;

    @ObfuscatedName("o.g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)Lae;")
    public class32 method502(int arg0, String arg1, String arg2, String arg3) {
        class32 var5 = this.field599[99];
        for (int var6 = this.field596; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field599[var6] = this.field599[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class32(arg0, arg1, arg3, arg2);
        } else {
            var5.method3259();
            var5.method3235();
            var5.method551(arg0, arg1, arg3, arg2);
        }
        this.field599[0] = var5;
        if (this.field596 < 100) {
            this.field596++;
        }
        return var5;
    }

    @ObfuscatedName("o.j(II)Lae;")
    public class32 method499(int arg0) {
        return arg0 >= 0 && arg0 < this.field596 ? this.field599[arg0] : null;
    }

    @ObfuscatedName("o.z(I)I")
    public int method500() {
        return this.field596;
    }
}
