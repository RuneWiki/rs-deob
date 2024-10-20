package deob;

import java.util.Iterator;

@ObfuscatedName("gl")
public final class class187 implements Iterable {

    @ObfuscatedName("gl.a")
    public int field2447;

    @ObfuscatedName("gl.j")
    public class193[] field2445;

    @ObfuscatedName("gl.n")
    public class193 field2448;

    @ObfuscatedName("gl.r")
    public class193 field2446;

    @ObfuscatedName("gl.v")
    public int field2444 = 0;

    public class187(int arg0) {
        this.field2447 = arg0;
        this.field2445 = new class193[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class193 var3 = this.field2445[var2] = new class193();
            var3.field2466 = var3;
            var3.field2465 = var3;
        }
    }

    @ObfuscatedName("gl.a(J)Lge;")
    public class193 method3206(long arg0) {
        class193 var3 = this.field2445[(int) (arg0 & (long) (this.field2447 - 1))];
        for (this.field2448 = var3.field2466; this.field2448 != var3; this.field2448 = this.field2448.field2466) {
            if (this.field2448.field2467 == arg0) {
                class193 var4 = this.field2448;
                this.field2448 = this.field2448.field2466;
                return var4;
            }
        }
        this.field2448 = null;
        return null;
    }

    @ObfuscatedName("gl.j(Lge;J)V")
    public void method3225(class193 arg0, long arg1) {
        if (arg0.field2465 != null) {
            arg0.method3308();
        }
        class193 var4 = this.field2445[(int) (arg1 & (long) (this.field2447 - 1))];
        arg0.field2465 = var4.field2465;
        arg0.field2466 = var4;
        arg0.field2465.field2466 = arg0;
        arg0.field2466.field2465 = arg0;
        arg0.field2467 = arg1;
    }

    @ObfuscatedName("gl.n()V")
    public void method3207() {
        for (int var1 = 0; var1 < this.field2447; var1++) {
            class193 var2 = this.field2445[var1];
            while (true) {
                class193 var3 = var2.field2466;
                if (var2 == var3) {
                    break;
                }
                var3.method3308();
            }
        }
        this.field2448 = null;
        this.field2446 = null;
    }

    @ObfuscatedName("gl.r()Lge;")
    public class193 method3208() {
        this.field2444 = 0;
        return this.method3209();
    }

    @ObfuscatedName("gl.v()Lge;")
    public class193 method3209() {
        if (this.field2444 > 0 && this.field2445[this.field2444 - 1] != this.field2446) {
            class193 var1 = this.field2446;
            this.field2446 = var1.field2466;
            return var1;
        }
        class193 var2;
        do {
            if (this.field2444 >= this.field2447) {
                return null;
            }
            var2 = this.field2445[this.field2444++].field2466;
        } while (this.field2445[this.field2444 - 1] == var2);
        this.field2446 = var2.field2466;
        return var2;
    }

    public Iterator iterator() {
        return new class198(this);
    }
}
