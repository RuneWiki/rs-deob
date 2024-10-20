package deob;

@ObfuscatedName("mi")
public final class class364 {

    @ObfuscatedName("mi.s")
    public int field4106;

    @ObfuscatedName("mi.t")
    public class354[] field4107;

    @ObfuscatedName("mi.v")
    public class354 field4108;

    @ObfuscatedName("mi.j")
    public class354 field4109;

    @ObfuscatedName("mi.l")
    public int field4110 = 0;

    public class364(int arg0) {
        this.field4106 = arg0;
        this.field4107 = new class354[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class354 var3 = this.field4107[var2] = new class354();
            var3.field3965 = var3;
            var3.field3967 = var3;
        }
    }

    @ObfuscatedName("mi.s(J)Lml;")
    public class354 method5756(long arg0) {
        class354 var3 = this.field4107[(int) (arg0 & (long) (this.field4106 - 1))];
        for (this.field4108 = var3.field3965; this.field4108 != var3; this.field4108 = this.field4108.field3965) {
            if (this.field4108.field3966 == arg0) {
                class354 var4 = this.field4108;
                this.field4108 = this.field4108.field3965;
                return var4;
            }
        }
        this.field4108 = null;
        return null;
    }

    @ObfuscatedName("mi.t(Lml;J)V")
    public void method5747(class354 arg0, long arg1) {
        if (arg0.field3967 != null) {
            arg0.method5447();
        }
        class354 var4 = this.field4107[(int) (arg1 & (long) (this.field4106 - 1))];
        arg0.field3967 = var4.field3967;
        arg0.field3965 = var4;
        arg0.field3967.field3965 = arg0;
        arg0.field3965.field3967 = arg0;
        arg0.field3966 = arg1;
    }

    @ObfuscatedName("mi.v()Lml;")
    public class354 method5746() {
        this.field4110 = 0;
        return this.method5749();
    }

    @ObfuscatedName("mi.j()Lml;")
    public class354 method5749() {
        if (this.field4110 > 0 && this.field4107[this.field4110 - 1] != this.field4109) {
            class354 var1 = this.field4109;
            this.field4109 = var1.field3965;
            return var1;
        }
        class354 var2;
        do {
            if (this.field4110 >= this.field4106) {
                return null;
            }
            var2 = this.field4107[this.field4110++].field3965;
        } while (this.field4107[this.field4110 - 1] == var2);
        this.field4109 = var2.field3965;
        return var2;
    }
}
