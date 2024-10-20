package deob;

@ObfuscatedName("sm")
public final class class490 {

    @ObfuscatedName("sm.aw")
    public int field4976;

    @ObfuscatedName("sm.ay")
    public class474[] field4978;

    @ObfuscatedName("sm.ar")
    public class474 field4977;

    @ObfuscatedName("sm.am")
    public class474 field4975;

    @ObfuscatedName("sm.as")
    public int field4979 = 0;

    public class490(int arg0) {
        this.field4976 = arg0;
        this.field4978 = new class474[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class474 var3 = this.field4978[var2] = new class474();
            var3.field4820 = var3;
            var3.field4818 = var3;
        }
    }

    @ObfuscatedName("sm.aw(J)Lsb;")
    public class474 method7981(long arg0) {
        class474 var3 = this.field4978[(int) (arg0 & (long) (this.field4976 - 1))];
        for (this.field4977 = var3.field4820; this.field4977 != var3; this.field4977 = this.field4977.field4820) {
            if (this.field4977.field4819 == arg0) {
                class474 var4 = this.field4977;
                this.field4977 = this.field4977.field4820;
                return var4;
            }
        }
        this.field4977 = null;
        return null;
    }

    @ObfuscatedName("sm.ay()I")
    public int method7989() {
        int var1 = 0;
        for (int var2 = 0; var2 < this.field4976; var2++) {
            class474 var3 = this.field4978[var2];
            for (class474 var4 = var3.field4820; var4 != var3; var4 = var4.field4820) {
                var1++;
            }
        }
        return var1;
    }

    @ObfuscatedName("sm.ar(Lsb;J)V")
    public void method7990(class474 arg0, long arg1) {
        if (arg0.field4818 != null) {
            arg0.method7662();
        }
        class474 var4 = this.field4978[(int) (arg1 & (long) (this.field4976 - 1))];
        arg0.field4818 = var4.field4818;
        arg0.field4820 = var4;
        arg0.field4818.field4820 = arg0;
        arg0.field4820.field4818 = arg0;
        arg0.field4819 = arg1;
    }

    @ObfuscatedName("sm.am()Lsb;")
    public class474 method7983() {
        this.field4979 = 0;
        return this.method7991();
    }

    @ObfuscatedName("sm.as()Lsb;")
    public class474 method7991() {
        if (this.field4979 > 0 && this.field4978[this.field4979 - 1] != this.field4975) {
            class474 var1 = this.field4975;
            this.field4975 = var1.field4820;
            return var1;
        }
        class474 var2;
        do {
            if (this.field4979 >= this.field4976) {
                return null;
            }
            var2 = this.field4978[this.field4979++].field4820;
        } while (this.field4978[this.field4979 - 1] == var2);
        this.field4975 = var2.field4820;
        return var2;
    }
}
