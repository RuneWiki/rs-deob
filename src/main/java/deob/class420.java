package deob;

@ObfuscatedName("pm")
public final class class420 {

    @ObfuscatedName("pm.c")
    public int field4600;

    @ObfuscatedName("pm.v")
    public class410[] field4601;

    @ObfuscatedName("pm.q")
    public class410 field4602;

    @ObfuscatedName("pm.f")
    public class410 field4604;

    @ObfuscatedName("pm.j")
    public int field4603 = 0;

    public class420(int arg0) {
        this.field4600 = arg0;
        this.field4601 = new class410[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class410 var3 = this.field4601[var2] = new class410();
            var3.field4463 = var3;
            var3.field4464 = var3;
        }
    }

    @ObfuscatedName("pm.c(J)Loh;")
    public class410 method6765(long arg0) {
        class410 var3 = this.field4601[(int) (arg0 & (long) (this.field4600 - 1))];
        for (this.field4602 = var3.field4463; this.field4602 != var3; this.field4602 = this.field4602.field4463) {
            if (this.field4602.field4462 == arg0) {
                class410 var4 = this.field4602;
                this.field4602 = this.field4602.field4463;
                return var4;
            }
        }
        this.field4602 = null;
        return null;
    }

    @ObfuscatedName("pm.v(Loh;J)V")
    public void method6774(class410 arg0, long arg1) {
        if (arg0.field4464 != null) {
            arg0.method6497();
        }
        class410 var4 = this.field4601[(int) (arg1 & (long) (this.field4600 - 1))];
        arg0.field4464 = var4.field4464;
        arg0.field4463 = var4;
        arg0.field4464.field4463 = arg0;
        arg0.field4463.field4464 = arg0;
        arg0.field4462 = arg1;
    }

    @ObfuscatedName("pm.q()Loh;")
    public class410 method6766() {
        this.field4603 = 0;
        return this.method6767();
    }

    @ObfuscatedName("pm.f()Loh;")
    public class410 method6767() {
        if (this.field4603 > 0 && this.field4601[this.field4603 - 1] != this.field4604) {
            class410 var1 = this.field4604;
            this.field4604 = var1.field4463;
            return var1;
        }
        class410 var2;
        do {
            if (this.field4603 >= this.field4600) {
                return null;
            }
            var2 = this.field4601[this.field4603++].field4463;
        } while (this.field4601[this.field4603 - 1] == var2);
        this.field4604 = var2.field4463;
        return var2;
    }
}
