package deob;

@ObfuscatedName("ki")
public class class308 extends class300 {

    @ObfuscatedName("ki.e")
    public final class336 field3871;

    @ObfuscatedName("ki.b")
    public final class303 field3870;

    @ObfuscatedName("ki.h")
    public String field3873 = null;

    @ObfuscatedName("ki.i")
    public String field3874 = null;

    @ObfuscatedName("ki.o")
    public byte field3875;

    @ObfuscatedName("ki.d")
    public int field3872;

    @ObfuscatedName("ki.r")
    public int field3877 = 1;

    public class308(class336 arg0, class303 arg1) {
        super(100);
        this.field3871 = arg0;
        this.field3870 = arg1;
    }

    @ObfuscatedName("ki.g(I)Lkg;")
    public class297 method4959() {
        return new class296();
    }

    @ObfuscatedName("ki.e(IB)[Lkg;")
    public class297[] method4956(int arg0) {
        return new class296[arg0];
    }

    @ObfuscatedName("ki.b(Ljava/lang/String;I)V")
    public final void method5085(String arg0) {
        this.field3873 = Statics.method1169(arg0);
    }

    @ObfuscatedName("ki.o(Ljava/lang/String;S)V")
    public final void method5087(String arg0) {
        this.field3874 = Statics.method1169(arg0);
    }

    @ObfuscatedName("ki.d(Lgg;B)V")
    public final void method5091(class195 arg0) {
        this.method5087(arg0.method3429());
        long var2 = arg0.method3381();
        this.method5085(class317.method1037(var2));
        this.field3875 = arg0.method3309();
        int var4 = arg0.method3332();
        if (var4 == 255) {
            return;
        }
        this.method4969();
        for (int var5 = 0; var5 < var4; var5++) {
            class296 var6 = (class296) this.method4977(new class306(arg0.method3429(), this.field3871));
            int var7 = arg0.method3310();
            var6.method5045(var7, ++this.field3877 - 1);
            var6.field3855 = arg0.method3309();
            arg0.method3429();
            this.method5096(var6);
        }
    }

    @ObfuscatedName("ki.r(Lgg;I)V")
    public final void method5103(class195 arg0) {
        class306 var2 = new class306(arg0.method3429(), this.field3871);
        int var3 = arg0.method3310();
        byte var4 = arg0.method3309();
        boolean var5 = false;
        if (var4 == -128) {
            var5 = true;
        }
        if (var5) {
            if (this.method4979() == 0) {
                return;
            }
            class296 var6 = (class296) this.method4974(var2);
            if (var6 != null && var6.method5047() == var3) {
                this.method5013(var6);
            }
            return;
        }
        arg0.method3429();
        class296 var7 = (class296) this.method4974(var2);
        if (var7 == null) {
            if (this.method4979() > this.field3850) {
                return;
            }
            var7 = (class296) this.method4977(var2);
        }
        var7.method5045(var3, ++this.field3877 - 1);
        var7.field3855 = var4;
        this.method5096(var7);
    }

    @ObfuscatedName("ki.p(I)V")
    public final void method5086() {
        for (int var1 = 0; var1 < this.method4979(); var1++) {
            ((class296) this.method5003(var1)).method4908();
        }
    }

    @ObfuscatedName("ki.cm(B)V")
    public final void method5089() {
        for (int var1 = 0; var1 < this.method4979(); var1++) {
            ((class296) this.method5003(var1)).method4926();
        }
    }

    @ObfuscatedName("ki.cg(Lkd;B)V")
    public final void method5096(class296 arg0) {
        if (arg0.method4928().equals(this.field3870.method1194())) {
            this.field3872 = arg0.field3855;
        }
    }
}
