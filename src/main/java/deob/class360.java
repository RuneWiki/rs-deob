package deob;

import java.util.Iterator;

@ObfuscatedName("me")
public final class class360 implements Iterable {

    @ObfuscatedName("me.f")
    public int field4073;

    @ObfuscatedName("me.o")
    public class351[] field4071;

    @ObfuscatedName("me.u")
    public class351 field4072;

    @ObfuscatedName("me.p")
    public class351 field4070;

    @ObfuscatedName("me.b")
    public int field4074 = 0;

    public class360(int arg0) {
        this.field4073 = arg0;
        this.field4071 = new class351[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class351 var3 = this.field4071[var2] = new class351();
            var3.field3942 = var3;
            var3.field3943 = var3;
        }
    }

    @ObfuscatedName("me.f(J)Lmh;")
    public class351 method5621(long arg0) {
        class351 var3 = this.field4071[(int) (arg0 & (long) (this.field4073 - 1))];
        for (this.field4072 = var3.field3942; this.field4072 != var3; this.field4072 = this.field4072.field3942) {
            if (this.field4072.field3941 == arg0) {
                class351 var4 = this.field4072;
                this.field4072 = this.field4072.field3942;
                return var4;
            }
        }
        this.field4072 = null;
        return null;
    }

    @ObfuscatedName("me.o(Lmh;J)V")
    public void method5630(class351 arg0, long arg1) {
        if (arg0.field3943 != null) {
            arg0.method5354();
        }
        class351 var4 = this.field4071[(int) (arg1 & (long) (this.field4073 - 1))];
        arg0.field3943 = var4.field3943;
        arg0.field3942 = var4;
        arg0.field3943.field3942 = arg0;
        arg0.field3942.field3943 = arg0;
        arg0.field3941 = arg1;
    }

    @ObfuscatedName("me.u()V")
    public void method5623() {
        for (int var1 = 0; var1 < this.field4073; var1++) {
            class351 var2 = this.field4071[var1];
            while (true) {
                class351 var3 = var2.field3942;
                if (var2 == var3) {
                    break;
                }
                var3.method5354();
            }
        }
        this.field4072 = null;
        this.field4070 = null;
    }

    @ObfuscatedName("me.p()Lmh;")
    public class351 method5624() {
        this.field4074 = 0;
        return this.method5625();
    }

    @ObfuscatedName("me.b()Lmh;")
    public class351 method5625() {
        if (this.field4074 > 0 && this.field4071[this.field4074 - 1] != this.field4070) {
            class351 var1 = this.field4070;
            this.field4070 = var1.field3942;
            return var1;
        }
        class351 var2;
        do {
            if (this.field4074 >= this.field4073) {
                return null;
            }
            var2 = this.field4071[this.field4074++].field3942;
        } while (this.field4071[this.field4074 - 1] == var2);
        this.field4070 = var2.field3942;
        return var2;
    }

    public Iterator iterator() {
        return new class359(this);
    }
}
