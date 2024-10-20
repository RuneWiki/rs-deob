package deob;

@ObfuscatedName("nk")
public final class class379 {

    @ObfuscatedName("nk.n")
    public int field4194;

    @ObfuscatedName("nk.c")
    public class369[] field4191;

    @ObfuscatedName("nk.m")
    public class369 field4193;

    @ObfuscatedName("nk.k")
    public class369 field4195;

    @ObfuscatedName("nk.o")
    public int field4192 = 0;

    public class379(int arg0) {
        this.field4194 = arg0;
        this.field4191 = new class369[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class369 var3 = this.field4191[var2] = new class369();
            var3.field4055 = var3;
            var3.field4057 = var3;
        }
    }

    @ObfuscatedName("nk.n(J)Lnr;")
    public class369 method6016(long arg0) {
        class369 var3 = this.field4191[(int) (arg0 & (long) (this.field4194 - 1))];
        for (this.field4193 = var3.field4055; this.field4193 != var3; this.field4193 = this.field4193.field4055) {
            if (this.field4193.field4056 == arg0) {
                class369 var4 = this.field4193;
                this.field4193 = this.field4193.field4055;
                return var4;
            }
        }
        this.field4193 = null;
        return null;
    }

    @ObfuscatedName("nk.c(Lnr;J)V")
    public void method6015(class369 arg0, long arg1) {
        if (arg0.field4057 != null) {
            arg0.method5732();
        }
        class369 var4 = this.field4191[(int) (arg1 & (long) (this.field4194 - 1))];
        arg0.field4057 = var4.field4057;
        arg0.field4055 = var4;
        arg0.field4057.field4055 = arg0;
        arg0.field4055.field4057 = arg0;
        arg0.field4056 = arg1;
    }

    @ObfuscatedName("nk.m()Lnr;")
    public class369 method6017() {
        this.field4192 = 0;
        return this.method6019();
    }

    @ObfuscatedName("nk.k()Lnr;")
    public class369 method6019() {
        if (this.field4192 > 0 && this.field4191[this.field4192 - 1] != this.field4195) {
            class369 var1 = this.field4195;
            this.field4195 = var1.field4055;
            return var1;
        }
        class369 var2;
        do {
            if (this.field4192 >= this.field4194) {
                return null;
            }
            var2 = this.field4191[this.field4192++].field4055;
        } while (this.field4191[this.field4192 - 1] == var2);
        this.field4195 = var2.field4055;
        return var2;
    }
}
