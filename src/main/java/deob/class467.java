package deob;

@ObfuscatedName("rz")
public class class467 extends class476 {

    @ObfuscatedName("rz.ax")
    public final class528 field4955;

    public class467(class528 arg0) {
        super(400);
        this.field4955 = arg0;
    }

    @ObfuscatedName("rz.ac(I)Lss;")
    public class474 method7986() {
        return new class477();
    }

    @ObfuscatedName("rz.ae(II)[Lss;")
    public class474[] method7985(int arg0) {
        return new class477[arg0];
    }

    @ObfuscatedName("rz.ag(Lvf;II)V")
    public void method7988(class551 arg0, int arg1) {
        while (arg0.field5415 < arg1) {
            int var3 = arg0.method8955();
            if (var3 == 4) {
                class574 var4 = new class574(arg0.method9166(), this.field4955);
                if (!var4.method9639()) {
                    throw new IllegalStateException();
                }
                boolean var5 = false;
                Statics.field4723.method1895(var4.method9621(), var5);
            } else {
                boolean var6 = (var3 & 0x1) != 0;
                class574 var7 = new class574(arg0.method9166(), this.field4955);
                class574 var8 = new class574(arg0.method9166(), this.field4955);
                arg0.method9166();
                if (!var7.method9639()) {
                    throw new IllegalStateException();
                }
                class477 var9 = (class477) this.method8091(var7);
                if (var6) {
                    class477 var10 = (class477) this.method8091(var8);
                    if (var10 != null && var9 != var10) {
                        if (var9 == null) {
                            var9 = var10;
                        } else {
                            this.method8094(var10);
                        }
                    }
                }
                if (var9 != null) {
                    this.method8099(var9, var7, var8);
                } else if (this.method8109() < 400) {
                    int var11 = this.method8109();
                    class477 var12 = (class477) this.method8145(var7, var8);
                    var12.field4996 = var11;
                }
            }
        }
    }
}
