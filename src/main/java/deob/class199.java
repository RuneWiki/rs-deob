package deob;

import java.util.Iterator;

@ObfuscatedName("gz")
public final class class199 implements Iterable {

    @ObfuscatedName("gz.w")
    public int field3105;

    @ObfuscatedName("gz.x")
    public class209[] field3106;

    @ObfuscatedName("gz.t")
    public class209 field3107;

    public class199(int arg0) {
        this.field3105 = arg0;
        this.field3106 = new class209[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class209 var3 = this.field3106[var2] = new class209();
            var3.field3125 = var3;
            var3.field3126 = var3;
        }
    }

    @ObfuscatedName("gz.w(J)Lhl;")
    public class209 method3572(long arg0) {
        class209 var3 = this.field3106[(int) (arg0 & (long) (this.field3105 - 1))];
        for (this.field3107 = var3.field3125; this.field3107 != var3; this.field3107 = this.field3107.field3125) {
            if (this.field3107.field3124 == arg0) {
                class209 var4 = this.field3107;
                this.field3107 = this.field3107.field3125;
                return var4;
            }
        }
        this.field3107 = null;
        return null;
    }

    @ObfuscatedName("gz.x(Lhl;J)V")
    public void method3571(class209 arg0, long arg1) {
        if (arg0.field3126 != null) {
            arg0.method3684();
        }
        class209 var4 = this.field3106[(int) (arg1 & (long) (this.field3105 - 1))];
        arg0.field3126 = var4.field3126;
        arg0.field3125 = var4;
        arg0.field3126.field3125 = arg0;
        arg0.field3125.field3126 = arg0;
        arg0.field3124 = arg1;
    }

    @ObfuscatedName("gz.t()V")
    public void method3570() {
        for (int var1 = 0; var1 < this.field3105; var1++) {
            class209 var2 = this.field3106[var1];
            while (true) {
                class209 var3 = var2.field3125;
                if (var2 == var3) {
                    break;
                }
                var3.method3684();
            }
        }
        this.field3107 = null;
    }

    public Iterator iterator() {
        return new class195(this);
    }
}
