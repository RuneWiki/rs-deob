package deob;

@ObfuscatedName("ap")
public class class51 {

    @ObfuscatedName("ap.c")
    public class22[] field962 = new class22[100];

    @ObfuscatedName("ap.n")
    public int field961;

    @ObfuscatedName("ap.d(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)Lb;")
    public class22 method895(int arg0, String arg1, String arg2, String arg3) {
        class22 var5 = this.field962[99];
        for (int var6 = this.field961; var6 > 0; var6--) {
            if (var6 != 100) {
                this.field962[var6] = this.field962[var6 - 1];
            }
        }
        if (var5 == null) {
            var5 = new class22(arg0, arg1, arg3, arg2);
        } else {
            var5.method2652();
            var5.method2689();
            var5.method217(arg0, arg1, arg3, arg2);
        }
        this.field962[0] = var5;
        if (this.field961 < 100) {
            this.field961++;
        }
        return var5;
    }

    @ObfuscatedName("ap.c(II)Lb;")
    public class22 method896(int arg0) {
        return arg0 >= 0 && arg0 < this.field961 ? this.field962[arg0] : null;
    }

    @ObfuscatedName("ap.n(I)I")
    public int method902() {
        return this.field961;
    }
}
