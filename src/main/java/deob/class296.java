package deob;

@ObfuscatedName("ka")
public class class296 extends class288 {

    @ObfuscatedName("ka.q")
    public final class331 field3697;

    @ObfuscatedName("ka.m")
    public final class291 field3698;

    @ObfuscatedName("ka.o")
    public String field3696 = null;

    @ObfuscatedName("ka.s")
    public String field3703 = null;

    @ObfuscatedName("ka.k")
    public byte field3701;

    @ObfuscatedName("ka.v")
    public int field3702;

    @ObfuscatedName("ka.p")
    public int field3704 = 1;

    public class296(class331 arg0, class291 arg1) {
        super(100);
        this.field3697 = arg0;
        this.field3698 = arg1;
    }

    @ObfuscatedName("ka.c(B)Ljx;")
    public class285 method4967() {
        return new class284();
    }

    @ObfuscatedName("ka.q(II)[Ljx;")
    public class285[] method4958(int arg0) {
        return new class284[arg0];
    }

    @ObfuscatedName("ka.m(Ljava/lang/String;B)V")
    public final void method5099(String arg0) {
        String var2 = class306.method2851(class306.method2947(arg0));
        if (var2 == null) {
            var2 = "";
        }
        this.field3696 = var2;
    }

    @ObfuscatedName("ka.l(Ljava/lang/String;I)V")
    public final void method5097(String arg0) {
        String var2 = class306.method2851(class306.method2947(arg0));
        if (var2 == null) {
            var2 = "";
        }
        this.field3703 = var2;
    }

    @ObfuscatedName("ka.o(Lgg;B)V")
    public final void method5105(class185 arg0) {
        this.method5097(arg0.method3251());
        long var2 = arg0.method3248();
        this.method5099(class306.method3009(var2));
        this.field3701 = arg0.method3244();
        int var4 = arg0.method3243();
        if (var4 == 255) {
            return;
        }
        this.method5017();
        for (int var5 = 0; var5 < var4; var5++) {
            class284 var6 = (class284) this.method4978(new class294(arg0.method3251(), this.field3697));
            int var7 = arg0.method3245();
            var6.method5054(var7, ++this.field3704 - 1);
            var6.field3677 = arg0.method3244();
            arg0.method3251();
            this.method5103(var6);
        }
    }

    @ObfuscatedName("ka.k(Lgg;B)V")
    public final void method5100(class185 arg0) {
        class294 var2 = new class294(arg0.method3251(), this.field3697);
        int var3 = arg0.method3245();
        byte var4 = arg0.method3244();
        boolean var5 = false;
        if (var4 == -128) {
            var5 = true;
        }
        if (var5) {
            if (this.method4970() == 0) {
                return;
            }
            class284 var6 = (class284) this.method4974(var2);
            if (var6 != null && var6.method5055() == var3) {
                this.method4977(var6);
            }
            return;
        }
        arg0.method3251();
        class284 var7 = (class284) this.method4974(var2);
        if (var7 == null) {
            if (this.method4970() > this.field3673) {
                return;
            }
            var7 = (class284) this.method4978(var2);
        }
        var7.method5054(var3, ++this.field3704 - 1);
        var7.field3677 = var4;
        this.method5103(var7);
    }

    @ObfuscatedName("ka.v(I)V")
    public final void method5101() {
        for (int var1 = 0; var1 < this.method4970(); var1++) {
            ((class284) this.method4980(var1)).method4930();
        }
    }

    @ObfuscatedName("ka.cy(B)V")
    public final void method5102() {
        for (int var1 = 0; var1 < this.method4970(); var1++) {
            ((class284) this.method4980(var1)).method4927();
        }
    }

    @ObfuscatedName("ka.ca(Ljf;I)V")
    public final void method5103(class284 arg0) {
        if (arg0.method4943().equals(this.field3698.method1104())) {
            this.field3702 = arg0.field3677;
        }
    }
}
