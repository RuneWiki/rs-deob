package deob;

import java.util.Iterator;

@ObfuscatedName("gm")
public final class class199 implements Iterable {

    @ObfuscatedName("gm.s")
    public int field3107;

    @ObfuscatedName("gm.j")
    public class209[] field3106;

    @ObfuscatedName("gm.p")
    public class209 field3108;

    public class199(int arg0) {
        this.field3107 = arg0;
        this.field3106 = new class209[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class209 var3 = this.field3106[var2] = new class209();
            var3.field3125 = var3;
            var3.field3127 = var3;
        }
    }

    @ObfuscatedName("gm.s(J)Lhd;")
    public class209 method3535(long arg0) {
        class209 var3 = this.field3106[(int) (arg0 & (long) (this.field3107 - 1))];
        for (this.field3108 = var3.field3125; this.field3108 != var3; this.field3108 = this.field3108.field3125) {
            if (this.field3108.field3126 == arg0) {
                class209 var4 = this.field3108;
                this.field3108 = this.field3108.field3125;
                return var4;
            }
        }
        this.field3108 = null;
        return null;
    }

    @ObfuscatedName("gm.j(Lhd;J)V")
    public void method3536(class209 arg0, long arg1) {
        if (arg0.field3127 != null) {
            arg0.method3639();
        }
        class209 var4 = this.field3106[(int) (arg1 & (long) (this.field3107 - 1))];
        arg0.field3127 = var4.field3127;
        arg0.field3125 = var4;
        arg0.field3127.field3125 = arg0;
        arg0.field3125.field3127 = arg0;
        arg0.field3126 = arg1;
    }

    @ObfuscatedName("gm.p()V")
    public void method3537() {
        for (int var1 = 0; var1 < this.field3107; var1++) {
            class209 var2 = this.field3106[var1];
            while (true) {
                class209 var3 = var2.field3125;
                if (var2 == var3) {
                    break;
                }
                var3.method3639();
            }
        }
        this.field3108 = null;
    }

    public Iterator iterator() {
        return new class195(this);
    }
}
