package deob;

import java.util.Iterator;

@ObfuscatedName("fi")
public final class class176 implements Iterable {

    @ObfuscatedName("fi.z")
    public int field2841;

    @ObfuscatedName("fi.j")
    public class184[] field2840;

    @ObfuscatedName("fi.a")
    public class184 field2842;

    public class176(int arg0) {
        this.field2841 = arg0;
        this.field2840 = new class184[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class184 var3 = this.field2840[var2] = new class184();
            var3.field2856 = var3;
            var3.field2855 = var3;
        }
    }

    @ObfuscatedName("fi.z(J)Lgj;")
    public class184 method3216(long arg0) {
        class184 var3 = this.field2840[(int) (arg0 & (long) (this.field2841 - 1))];
        for (this.field2842 = var3.field2856; this.field2842 != var3; this.field2842 = this.field2842.field2856) {
            if (this.field2842.field2857 == arg0) {
                class184 var4 = this.field2842;
                this.field2842 = this.field2842.field2856;
                return var4;
            }
        }
        this.field2842 = null;
        return null;
    }

    @ObfuscatedName("fi.j(Lgj;J)V")
    public void method3215(class184 arg0, long arg1) {
        if (arg0.field2855 != null) {
            arg0.method3311();
        }
        class184 var4 = this.field2840[(int) (arg1 & (long) (this.field2841 - 1))];
        arg0.field2855 = var4.field2855;
        arg0.field2856 = var4;
        arg0.field2855.field2856 = arg0;
        arg0.field2856.field2855 = arg0;
        arg0.field2857 = arg1;
    }

    @ObfuscatedName("fi.a()V")
    public void method3220() {
        for (int var1 = 0; var1 < this.field2841; var1++) {
            class184 var2 = this.field2840[var1];
            while (true) {
                class184 var3 = var2.field2856;
                if (var2 == var3) {
                    break;
                }
                var3.method3311();
            }
        }
        this.field2842 = null;
    }

    public Iterator iterator() {
        return new class172(this);
    }
}
