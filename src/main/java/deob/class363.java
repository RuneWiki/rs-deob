package deob;

@ObfuscatedName("mn")
public final class class363 {

    @ObfuscatedName("mn.f")
    public int field4075;

    @ObfuscatedName("mn.e")
    public class353[] field4074;

    @ObfuscatedName("mn.v")
    public class353 field4076;

    @ObfuscatedName("mn.y")
    public class353 field4077;

    @ObfuscatedName("mn.j")
    public int field4078 = 0;

    public class363(int arg0) {
        this.field4075 = arg0;
        this.field4074 = new class353[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class353 var3 = this.field4074[var2] = new class353();
            var3.field3935 = var3;
            var3.field3936 = var3;
        }
    }

    @ObfuscatedName("mn.f(J)Lmf;")
    public class353 method5691(long arg0) {
        class353 var3 = this.field4074[(int) (arg0 & (long) (this.field4075 - 1))];
        for (this.field4076 = var3.field3935; this.field4076 != var3; this.field4076 = this.field4076.field3935) {
            if (this.field4076.field3937 == arg0) {
                class353 var4 = this.field4076;
                this.field4076 = this.field4076.field3935;
                return var4;
            }
        }
        this.field4076 = null;
        return null;
    }

    @ObfuscatedName("mn.e(Lmf;J)V")
    public void method5692(class353 arg0, long arg1) {
        if (arg0.field3936 != null) {
            arg0.method5407();
        }
        class353 var4 = this.field4074[(int) (arg1 & (long) (this.field4075 - 1))];
        arg0.field3936 = var4.field3936;
        arg0.field3935 = var4;
        arg0.field3936.field3935 = arg0;
        arg0.field3935.field3936 = arg0;
        arg0.field3937 = arg1;
    }

    @ObfuscatedName("mn.v()Lmf;")
    public class353 method5693() {
        this.field4078 = 0;
        return this.method5694();
    }

    @ObfuscatedName("mn.y()Lmf;")
    public class353 method5694() {
        if (this.field4078 > 0 && this.field4074[this.field4078 - 1] != this.field4077) {
            class353 var1 = this.field4077;
            this.field4077 = var1.field3935;
            return var1;
        }
        class353 var2;
        do {
            if (this.field4078 >= this.field4075) {
                return null;
            }
            var2 = this.field4074[this.field4078++].field3935;
        } while (this.field4074[this.field4078 - 1] == var2);
        this.field4077 = var2.field3935;
        return var2;
    }
}
