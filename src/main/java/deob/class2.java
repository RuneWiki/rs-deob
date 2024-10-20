package deob;

@ObfuscatedName("fv")
public final class class2 {

    @ObfuscatedName("fv.o")
    public class4 field4;

    @ObfuscatedName("fv.j")
    public int field5;

    @ObfuscatedName("fv.h")
    public int field6 = 0;

    @ObfuscatedName("fv.t")
    public class4 field2;

    @ObfuscatedName("fv.p")
    public class4[] field3;

    public class2(int arg0) {
        this.field5 = arg0;
        this.field3 = new class4[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class4 var3 = this.field3[var2] = new class4();
            var3.field9 = var3;
            var3.field10 = var3;
        }
    }

    @ObfuscatedName("fv.j(J)Lfx;")
    public class4 method20(long arg0) {
        class4 var3 = this.field3[(int) (arg0 & (long) (this.field5 - 1))];
        for (this.field4 = var3.field9; this.field4 != var3; this.field4 = this.field4.field9) {
            if (this.field4.field11 == arg0) {
                class4 var4 = this.field4;
                this.field4 = this.field4.field9;
                return var4;
            }
        }
        this.field4 = null;
        return null;
    }

    @ObfuscatedName("fv.o()V")
    public void method21() {
        for (int var1 = 0; var1 < this.field5; var1++) {
            class4 var2 = this.field3[var1];
            while (true) {
                class4 var3 = var2.field9;
                if (var2 == var3) {
                    break;
                }
                var3.method44();
            }
        }
        this.field4 = null;
        this.field2 = null;
    }

    @ObfuscatedName("fv.p(Lfx;J)V")
    public void method22(class4 arg0, long arg1) {
        if (arg0.field10 != null) {
            arg0.method44();
        }
        class4 var4 = this.field3[(int) (arg1 & (long) (this.field5 - 1))];
        arg0.field10 = var4.field10;
        arg0.field9 = var4;
        arg0.field10.field9 = arg0;
        arg0.field9.field10 = arg0;
        arg0.field11 = arg1;
    }

    @ObfuscatedName("fv.h()Lfx;")
    public class4 method23() {
        if (this.field6 > 0 && this.field3[this.field6 - 1] != this.field2) {
            class4 var1 = this.field2;
            this.field2 = var1.field9;
            return var1;
        }
        class4 var2;
        do {
            if (this.field6 >= this.field5) {
                return null;
            }
            var2 = this.field3[this.field6++].field9;
        } while (this.field3[this.field6 - 1] == var2);
        this.field2 = var2.field9;
        return var2;
    }

    @ObfuscatedName("fv.t()Lfx;")
    public class4 method25() {
        this.field6 = 0;
        return this.method23();
    }
}
