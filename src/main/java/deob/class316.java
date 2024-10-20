package deob;

import java.util.Iterator;

@ObfuscatedName("lb")
public final class class316 implements Iterable {

    @ObfuscatedName("lb.z")
    public int field3826;

    @ObfuscatedName("lb.n")
    public class181[] field3823;

    @ObfuscatedName("lb.v")
    public class181 field3825;

    @ObfuscatedName("lb.u")
    public class181 field3827;

    @ObfuscatedName("lb.r")
    public int field3824 = 0;

    public class316(int arg0) {
        this.field3826 = arg0;
        this.field3823 = new class181[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class181 var3 = this.field3823[var2] = new class181();
            var3.field2093 = var3;
            var3.field2095 = var3;
        }
    }

    @ObfuscatedName("lb.z(J)Lfx;")
    public class181 method5362(long arg0) {
        class181 var3 = this.field3823[(int) (arg0 & (long) (this.field3826 - 1))];
        for (this.field3825 = var3.field2093; this.field3825 != var3; this.field3825 = this.field3825.field2093) {
            if (this.field3825.field2094 == arg0) {
                class181 var4 = this.field3825;
                this.field3825 = this.field3825.field2093;
                return var4;
            }
        }
        this.field3825 = null;
        return null;
    }

    @ObfuscatedName("lb.n(Lfx;J)V")
    public void method5363(class181 arg0, long arg1) {
        if (arg0.field2095 != null) {
            arg0.method3249();
        }
        class181 var4 = this.field3823[(int) (arg1 & (long) (this.field3826 - 1))];
        arg0.field2095 = var4.field2095;
        arg0.field2093 = var4;
        arg0.field2095.field2093 = arg0;
        arg0.field2093.field2095 = arg0;
        arg0.field2094 = arg1;
    }

    @ObfuscatedName("lb.v()V")
    public void method5364() {
        for (int var1 = 0; var1 < this.field3826; var1++) {
            class181 var2 = this.field3823[var1];
            while (true) {
                class181 var3 = var2.field2093;
                if (var2 == var3) {
                    break;
                }
                var3.method3249();
            }
        }
        this.field3825 = null;
        this.field3827 = null;
    }

    @ObfuscatedName("lb.u()Lfx;")
    public class181 method5369() {
        this.field3824 = 0;
        return this.method5365();
    }

    @ObfuscatedName("lb.r()Lfx;")
    public class181 method5365() {
        if (this.field3824 > 0 && this.field3823[this.field3824 - 1] != this.field3827) {
            class181 var1 = this.field3827;
            this.field3827 = var1.field2093;
            return var1;
        }
        class181 var2;
        do {
            if (this.field3824 >= this.field3826) {
                return null;
            }
            var2 = this.field3823[this.field3824++].field2093;
        } while (this.field3823[this.field3824 - 1] == var2);
        this.field3827 = var2.field2093;
        return var2;
    }

    public Iterator iterator() {
        return new class317(this);
    }
}
