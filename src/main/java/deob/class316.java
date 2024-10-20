package deob;

import java.util.Iterator;

@ObfuscatedName("lb")
public final class class316 implements Iterable {

    @ObfuscatedName("lb.u")
    public int field3824;

    @ObfuscatedName("lb.f")
    public class181[] field3825;

    @ObfuscatedName("lb.b")
    public class181 field3828;

    @ObfuscatedName("lb.g")
    public class181 field3827;

    @ObfuscatedName("lb.z")
    public int field3826 = 0;

    public class316(int arg0) {
        this.field3824 = arg0;
        this.field3825 = new class181[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class181 var3 = this.field3825[var2] = new class181();
            var3.field2127 = var3;
            var3.field2128 = var3;
        }
    }

    @ObfuscatedName("lb.u(J)Lfb;")
    public class181 method5521(long arg0) {
        class181 var3 = this.field3825[(int) (arg0 & (long) (this.field3824 - 1))];
        for (this.field3828 = var3.field2127; this.field3828 != var3; this.field3828 = this.field3828.field2127) {
            if (this.field3828.field2126 == arg0) {
                class181 var4 = this.field3828;
                this.field3828 = this.field3828.field2127;
                return var4;
            }
        }
        this.field3828 = null;
        return null;
    }

    @ObfuscatedName("lb.f(Lfb;J)V")
    public void method5531(class181 arg0, long arg1) {
        if (arg0.field2128 != null) {
            arg0.method3332();
        }
        class181 var4 = this.field3825[(int) (arg1 & (long) (this.field3824 - 1))];
        arg0.field2128 = var4.field2128;
        arg0.field2127 = var4;
        arg0.field2128.field2127 = arg0;
        arg0.field2127.field2128 = arg0;
        arg0.field2126 = arg1;
    }

    @ObfuscatedName("lb.b()V")
    public void method5525() {
        for (int var1 = 0; var1 < this.field3824; var1++) {
            class181 var2 = this.field3825[var1];
            while (true) {
                class181 var3 = var2.field2127;
                if (var2 == var3) {
                    break;
                }
                var3.method3332();
            }
        }
        this.field3828 = null;
        this.field3827 = null;
    }

    @ObfuscatedName("lb.g()Lfb;")
    public class181 method5524() {
        this.field3826 = 0;
        return this.method5528();
    }

    @ObfuscatedName("lb.z()Lfb;")
    public class181 method5528() {
        if (this.field3826 > 0 && this.field3825[this.field3826 - 1] != this.field3827) {
            class181 var1 = this.field3827;
            this.field3827 = var1.field2127;
            return var1;
        }
        class181 var2;
        do {
            if (this.field3826 >= this.field3824) {
                return null;
            }
            var2 = this.field3825[this.field3826++].field2127;
        } while (this.field3825[this.field3826 - 1] == var2);
        this.field3827 = var2.field2127;
        return var2;
    }

    public Iterator iterator() {
        return new class317(this);
    }
}
