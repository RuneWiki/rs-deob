package deob;

@ObfuscatedName("tf")
public final class class504 {

    @ObfuscatedName("tf.ac")
    public int field5018;

    @ObfuscatedName("tf.al")
    public class488[] field5019;

    @ObfuscatedName("tf.ak")
    public class488 field5021;

    @ObfuscatedName("tf.ax")
    public class488 field5020;

    @ObfuscatedName("tf.ao")
    public int field5017 = 0;

    public class504(int arg0) {
        this.field5018 = arg0;
        this.field5019 = new class488[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class488 var3 = this.field5019[var2] = new class488();
            var3.field4856 = var3;
            var3.field4858 = var3;
        }
    }

    @ObfuscatedName("tf.ac(J)Lsj;")
    public class488 method8104(long arg0) {
        class488 var3 = this.field5019[(int) (arg0 & (long) (this.field5018 - 1))];
        for (this.field5021 = var3.field4856; this.field5021 != var3; this.field5021 = this.field5021.field4856) {
            if (this.field5021.field4857 == arg0) {
                class488 var4 = this.field5021;
                this.field5021 = this.field5021.field4856;
                return var4;
            }
        }
        this.field5021 = null;
        return null;
    }

    @ObfuscatedName("tf.al()I")
    public int method8090() {
        int var1 = 0;
        for (int var2 = 0; var2 < this.field5018; var2++) {
            class488 var3 = this.field5019[var2];
            for (class488 var4 = var3.field4856; var4 != var3; var4 = var4.field4856) {
                var1++;
            }
        }
        return var1;
    }

    @ObfuscatedName("tf.ak(Lsj;J)V")
    public void method8098(class488 arg0, long arg1) {
        if (arg0.field4858 != null) {
            arg0.method7776();
        }
        class488 var4 = this.field5019[(int) (arg1 & (long) (this.field5018 - 1))];
        arg0.field4858 = var4.field4858;
        arg0.field4856 = var4;
        arg0.field4858.field4856 = arg0;
        arg0.field4856.field4858 = arg0;
        arg0.field4857 = arg1;
    }

    @ObfuscatedName("tf.ax()Lsj;")
    public class488 method8091() {
        this.field5017 = 0;
        return this.method8092();
    }

    @ObfuscatedName("tf.ao()Lsj;")
    public class488 method8092() {
        if (this.field5017 > 0 && this.field5019[this.field5017 - 1] != this.field5020) {
            class488 var1 = this.field5020;
            this.field5020 = var1.field4856;
            return var1;
        }
        class488 var2;
        do {
            if (this.field5017 >= this.field5018) {
                return null;
            }
            var2 = this.field5019[this.field5017++].field4856;
        } while (this.field5019[this.field5017 - 1] == var2);
        this.field5020 = var2.field4856;
        return var2;
    }
}
