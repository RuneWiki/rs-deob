package deob;

import java.util.Iterator;

@ObfuscatedName("gl")
public final class class198 implements Iterable {

    @ObfuscatedName("gl.i")
    public int field3080;

    @ObfuscatedName("gl.v")
    public class208[] field3081;

    @ObfuscatedName("gl.r")
    public class208 field3082;

    public class198(int arg0) {
        this.field3080 = arg0;
        this.field3081 = new class208[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class208 var3 = this.field3081[var2] = new class208();
            var3.field3099 = var3;
            var3.field3101 = var3;
        }
    }

    @ObfuscatedName("gl.i(J)Lgo;")
    public class208 method3512(long arg0) {
        class208 var3 = this.field3081[(int) (arg0 & (long) (this.field3080 - 1))];
        for (this.field3082 = var3.field3099; this.field3082 != var3; this.field3082 = this.field3082.field3099) {
            if (this.field3082.field3100 == arg0) {
                class208 var4 = this.field3082;
                this.field3082 = this.field3082.field3099;
                return var4;
            }
        }
        this.field3082 = null;
        return null;
    }

    @ObfuscatedName("gl.v(Lgo;J)V")
    public void method3513(class208 arg0, long arg1) {
        if (arg0.field3101 != null) {
            arg0.method3626();
        }
        class208 var4 = this.field3081[(int) (arg1 & (long) (this.field3080 - 1))];
        arg0.field3101 = var4.field3101;
        arg0.field3099 = var4;
        arg0.field3101.field3099 = arg0;
        arg0.field3099.field3101 = arg0;
        arg0.field3100 = arg1;
    }

    @ObfuscatedName("gl.r()V")
    public void method3514() {
        for (int var1 = 0; var1 < this.field3080; var1++) {
            class208 var2 = this.field3081[var1];
            while (true) {
                class208 var3 = var2.field3099;
                if (var2 == var3) {
                    break;
                }
                var3.method3626();
            }
        }
        this.field3082 = null;
    }

    public Iterator iterator() {
        return new class194(this);
    }
}
