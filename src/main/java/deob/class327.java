package deob;

import java.util.Iterator;

@ObfuscatedName("ll")
public final class class327 implements Iterable {

    @ObfuscatedName("ll.f")
    public int field3865;

    @ObfuscatedName("ll.b")
    public class190[] field3863;

    @ObfuscatedName("ll.l")
    public class190 field3864;

    @ObfuscatedName("ll.m")
    public class190 field3866;

    @ObfuscatedName("ll.z")
    public int field3867 = 0;

    public class327(int arg0) {
        this.field3865 = arg0;
        this.field3863 = new class190[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class190 var3 = this.field3863[var2] = new class190();
            var3.field2141 = var3;
            var3.field2142 = var3;
        }
    }

    @ObfuscatedName("ll.f(J)Lgn;")
    public class190 method5561(long arg0) {
        class190 var3 = this.field3863[(int) (arg0 & (long) (this.field3865 - 1))];
        for (this.field3864 = var3.field2141; this.field3864 != var3; this.field3864 = this.field3864.field2141) {
            if (this.field3864.field2140 == arg0) {
                class190 var4 = this.field3864;
                this.field3864 = this.field3864.field2141;
                return var4;
            }
        }
        this.field3864 = null;
        return null;
    }

    @ObfuscatedName("ll.b(Lgn;J)V")
    public void method5576(class190 arg0, long arg1) {
        if (arg0.field2142 != null) {
            arg0.method3407();
        }
        class190 var4 = this.field3863[(int) (arg1 & (long) (this.field3865 - 1))];
        arg0.field2142 = var4.field2142;
        arg0.field2141 = var4;
        arg0.field2142.field2141 = arg0;
        arg0.field2141.field2142 = arg0;
        arg0.field2140 = arg1;
    }

    @ObfuscatedName("ll.l()V")
    public void method5563() {
        for (int var1 = 0; var1 < this.field3865; var1++) {
            class190 var2 = this.field3863[var1];
            while (true) {
                class190 var3 = var2.field2141;
                if (var2 == var3) {
                    break;
                }
                var3.method3407();
            }
        }
        this.field3864 = null;
        this.field3866 = null;
    }

    @ObfuscatedName("ll.m()Lgn;")
    public class190 method5564() {
        this.field3867 = 0;
        return this.method5565();
    }

    @ObfuscatedName("ll.z()Lgn;")
    public class190 method5565() {
        if (this.field3867 > 0 && this.field3863[this.field3867 - 1] != this.field3866) {
            class190 var1 = this.field3866;
            this.field3866 = var1.field2141;
            return var1;
        }
        class190 var2;
        do {
            if (this.field3867 >= this.field3865) {
                return null;
            }
            var2 = this.field3863[this.field3867++].field2141;
        } while (this.field3863[this.field3867 - 1] == var2);
        this.field3866 = var2.field2141;
        return var2;
    }

    public Iterator iterator() {
        return new class328(this);
    }
}
