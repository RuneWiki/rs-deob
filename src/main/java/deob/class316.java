package deob;

import java.util.Iterator;

@ObfuscatedName("lr")
public final class class316 implements Iterable {

    @ObfuscatedName("lr.a")
    public int field3816;

    @ObfuscatedName("lr.t")
    public class181[] field3813;

    @ObfuscatedName("lr.n")
    public class181 field3814;

    @ObfuscatedName("lr.q")
    public class181 field3815;

    @ObfuscatedName("lr.v")
    public int field3812 = 0;

    public class316(int arg0) {
        this.field3816 = arg0;
        this.field3813 = new class181[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class181 var3 = this.field3813[var2] = new class181();
            var3.field2090 = var3;
            var3.field2089 = var3;
        }
    }

    @ObfuscatedName("lr.a(J)Lfd;")
    public class181 method5494(long arg0) {
        class181 var3 = this.field3813[(int) (arg0 & (long) (this.field3816 - 1))];
        for (this.field3814 = var3.field2090; this.field3814 != var3; this.field3814 = this.field3814.field2090) {
            if (this.field3814.field2091 == arg0) {
                class181 var4 = this.field3814;
                this.field3814 = this.field3814.field2090;
                return var4;
            }
        }
        this.field3814 = null;
        return null;
    }

    @ObfuscatedName("lr.t(Lfd;J)V")
    public void method5495(class181 arg0, long arg1) {
        if (arg0.field2089 != null) {
            arg0.method3386();
        }
        class181 var4 = this.field3813[(int) (arg1 & (long) (this.field3816 - 1))];
        arg0.field2089 = var4.field2089;
        arg0.field2090 = var4;
        arg0.field2089.field2090 = arg0;
        arg0.field2090.field2089 = arg0;
        arg0.field2091 = arg1;
    }

    @ObfuscatedName("lr.n()V")
    public void method5505() {
        for (int var1 = 0; var1 < this.field3816; var1++) {
            class181 var2 = this.field3813[var1];
            while (true) {
                class181 var3 = var2.field2090;
                if (var2 == var3) {
                    break;
                }
                var3.method3386();
            }
        }
        this.field3814 = null;
        this.field3815 = null;
    }

    @ObfuscatedName("lr.q()Lfd;")
    public class181 method5497() {
        this.field3812 = 0;
        return this.method5498();
    }

    @ObfuscatedName("lr.v()Lfd;")
    public class181 method5498() {
        if (this.field3812 > 0 && this.field3813[this.field3812 - 1] != this.field3815) {
            class181 var1 = this.field3815;
            this.field3815 = var1.field2090;
            return var1;
        }
        class181 var2;
        do {
            if (this.field3812 >= this.field3816) {
                return null;
            }
            var2 = this.field3813[this.field3812++].field2090;
        } while (this.field3813[this.field3812 - 1] == var2);
        this.field3815 = var2.field2090;
        return var2;
    }

    public Iterator iterator() {
        return new class317(this);
    }
}
