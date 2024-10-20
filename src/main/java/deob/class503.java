package deob;

import java.util.Iterator;

@ObfuscatedName("tp")
public final class class503 implements Iterable {

    @ObfuscatedName("tp.ac")
    public int field5016;

    @ObfuscatedName("tp.al")
    public class488[] field5013;

    @ObfuscatedName("tp.ak")
    public class488 field5014;

    @ObfuscatedName("tp.ax")
    public class488 field5015;

    @ObfuscatedName("tp.ao")
    public int field5012 = 0;

    public class503(int arg0) {
        this.field5016 = arg0;
        this.field5013 = new class488[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class488 var3 = this.field5013[var2] = new class488();
            var3.field4856 = var3;
            var3.field4858 = var3;
        }
    }

    @ObfuscatedName("tp.ac(J)Lsj;")
    public class488 method8070(long arg0) {
        class488 var3 = this.field5013[(int) (arg0 & (long) (this.field5016 - 1))];
        for (this.field5014 = var3.field4856; this.field5014 != var3; this.field5014 = this.field5014.field4856) {
            if (this.field5014.field4857 == arg0) {
                class488 var4 = this.field5014;
                this.field5014 = this.field5014.field4856;
                return var4;
            }
        }
        this.field5014 = null;
        return null;
    }

    @ObfuscatedName("tp.al(Lsj;J)V")
    public void method8071(class488 arg0, long arg1) {
        if (arg0.field4858 != null) {
            arg0.method7776();
        }
        class488 var4 = this.field5013[(int) (arg1 & (long) (this.field5016 - 1))];
        arg0.field4858 = var4.field4858;
        arg0.field4856 = var4;
        arg0.field4858.field4856 = arg0;
        arg0.field4856.field4858 = arg0;
        arg0.field4857 = arg1;
    }

    @ObfuscatedName("tp.ak()V")
    public void method8072() {
        for (int var1 = 0; var1 < this.field5016; var1++) {
            class488 var2 = this.field5013[var1];
            while (true) {
                class488 var3 = var2.field4856;
                if (var2 == var3) {
                    break;
                }
                var3.method7776();
            }
        }
        this.field5014 = null;
        this.field5015 = null;
    }

    @ObfuscatedName("tp.ax()Lsj;")
    public class488 method8073() {
        this.field5012 = 0;
        return this.method8074();
    }

    @ObfuscatedName("tp.ao()Lsj;")
    public class488 method8074() {
        if (this.field5012 > 0 && this.field5013[this.field5012 - 1] != this.field5015) {
            class488 var1 = this.field5015;
            this.field5015 = var1.field4856;
            return var1;
        }
        class488 var2;
        do {
            if (this.field5012 >= this.field5016) {
                return null;
            }
            var2 = this.field5013[this.field5012++].field4856;
        } while (this.field5013[this.field5012 - 1] == var2);
        this.field5015 = var2.field4856;
        return var2;
    }

    public Iterator iterator() {
        return new class502(this);
    }
}
