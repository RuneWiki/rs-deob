package deob;

import java.util.Iterator;

@ObfuscatedName("fs")
public final class class181 implements Iterable {

    @ObfuscatedName("fs.a")
    public int field2890;

    @ObfuscatedName("fs.v")
    public class191[] field2889;

    @ObfuscatedName("fs.i")
    public class191 field2888;

    public class181(int arg0) {
        this.field2890 = arg0;
        this.field2889 = new class191[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class191 var3 = this.field2889[var2] = new class191();
            var3.field2909 = var3;
            var3.field2907 = var3;
        }
    }

    @ObfuscatedName("fs.a(J)Lgq;")
    public class191 method3234(long arg0) {
        class191 var3 = this.field2889[(int) (arg0 & (long) (this.field2890 - 1))];
        for (this.field2888 = var3.field2909; this.field2888 != var3; this.field2888 = this.field2888.field2909) {
            if (this.field2888.field2908 == arg0) {
                class191 var4 = this.field2888;
                this.field2888 = this.field2888.field2909;
                return var4;
            }
        }
        this.field2888 = null;
        return null;
    }

    @ObfuscatedName("fs.v(Lgq;J)V")
    public void method3235(class191 arg0, long arg1) {
        if (arg0.field2907 != null) {
            arg0.method3343();
        }
        class191 var4 = this.field2889[(int) (arg1 & (long) (this.field2890 - 1))];
        arg0.field2907 = var4.field2907;
        arg0.field2909 = var4;
        arg0.field2907.field2909 = arg0;
        arg0.field2909.field2907 = arg0;
        arg0.field2908 = arg1;
    }

    @ObfuscatedName("fs.i()V")
    public void method3243() {
        for (int var1 = 0; var1 < this.field2890; var1++) {
            class191 var2 = this.field2889[var1];
            while (true) {
                class191 var3 = var2.field2909;
                if (var2 == var3) {
                    break;
                }
                var3.method3343();
            }
        }
        this.field2888 = null;
    }

    public Iterator iterator() {
        return new class177(this);
    }
}
