package deob;

import java.util.Iterator;

@ObfuscatedName("mo")
public final class class362 implements Iterable {

    @ObfuscatedName("mo.f")
    public int field4071;

    @ObfuscatedName("mo.e")
    public class353[] field4070;

    @ObfuscatedName("mo.v")
    public class353 field4069;

    @ObfuscatedName("mo.y")
    public class353 field4072;

    @ObfuscatedName("mo.j")
    public int field4073 = 0;

    public class362(int arg0) {
        this.field4071 = arg0;
        this.field4070 = new class353[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class353 var3 = this.field4070[var2] = new class353();
            var3.field3935 = var3;
            var3.field3936 = var3;
        }
    }

    @ObfuscatedName("mo.f(J)Lmf;")
    public class353 method5668(long arg0) {
        class353 var3 = this.field4070[(int) (arg0 & (long) (this.field4071 - 1))];
        for (this.field4069 = var3.field3935; this.field4069 != var3; this.field4069 = this.field4069.field3935) {
            if (this.field4069.field3937 == arg0) {
                class353 var4 = this.field4069;
                this.field4069 = this.field4069.field3935;
                return var4;
            }
        }
        this.field4069 = null;
        return null;
    }

    @ObfuscatedName("mo.e(Lmf;J)V")
    public void method5669(class353 arg0, long arg1) {
        if (arg0.field3936 != null) {
            arg0.method5407();
        }
        class353 var4 = this.field4070[(int) (arg1 & (long) (this.field4071 - 1))];
        arg0.field3936 = var4.field3936;
        arg0.field3935 = var4;
        arg0.field3936.field3935 = arg0;
        arg0.field3935.field3936 = arg0;
        arg0.field3937 = arg1;
    }

    @ObfuscatedName("mo.v()V")
    public void method5670() {
        for (int var1 = 0; var1 < this.field4071; var1++) {
            class353 var2 = this.field4070[var1];
            while (true) {
                class353 var3 = var2.field3935;
                if (var2 == var3) {
                    break;
                }
                var3.method5407();
            }
        }
        this.field4069 = null;
        this.field4072 = null;
    }

    @ObfuscatedName("mo.y()Lmf;")
    public class353 method5671() {
        this.field4073 = 0;
        return this.method5672();
    }

    @ObfuscatedName("mo.j()Lmf;")
    public class353 method5672() {
        if (this.field4073 > 0 && this.field4070[this.field4073 - 1] != this.field4072) {
            class353 var1 = this.field4072;
            this.field4072 = var1.field3935;
            return var1;
        }
        class353 var2;
        do {
            if (this.field4073 >= this.field4071) {
                return null;
            }
            var2 = this.field4070[this.field4073++].field3935;
        } while (this.field4070[this.field4073 - 1] == var2);
        this.field4072 = var2.field3935;
        return var2;
    }

    public Iterator iterator() {
        return new class361(this);
    }
}
